package defpackage;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grw implements grx, gru {
    private final Context a;
    private final String b;
    private final String c;
    private final jod d;

    public grw(jod jodVar, Context context, rwc rwcVar) {
        this.d = jodVar;
        this.a = context;
        gse gseVar = gse.a;
        this.c = ((gse) rwcVar.e(gseVar)).c;
        this.b = ((gse) rwcVar.e(gseVar)).b;
    }

    private final Intent c() {
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.a);
        Intent intent = new Intent();
        if (rnt.V(defaultSmsPackage)) {
            intent.setPackage("com.android.sms");
        } else {
            intent.setPackage(defaultSmsPackage);
        }
        intent.setAction("android.intent.action.SEND");
        String str = this.b;
        if (!rnt.V(str)) {
            String str2 = this.c;
            if (!rnt.V(str2)) {
                intent.putExtra("address", str2);
                intent.putExtra("sms_body", str);
            }
        }
        intent.setType("text/plain");
        return intent;
    }

    @Override // defpackage.gru
    public final Intent a() {
        return c();
    }

    @Override // defpackage.grx
    public final void b() {
        this.d.d(c());
    }
}
