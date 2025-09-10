package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qnp implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public qnp(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = 0;
        switch (this.b) {
            case 0:
                return Long.valueOf(ueg.a.fr().f(((imm) this.a).b()));
            case 1:
                return Long.valueOf(ueg.a.fr().e(((imm) this.a).b()));
            case 2:
                return Long.valueOf(udi.a.fr().a(((imm) this.a).b()));
            case 3:
                return Boolean.valueOf(udi.a.fr().d(((imm) this.a).b()));
            case 4:
                return ucz.a.fr().c(((imm) this.a).b());
            case 5:
                return Boolean.valueOf(udc.a.fr().d(((imm) this.a).b()));
            case 6:
                return udu.a.fr().c(((imm) this.a).b());
            case 7:
                return udx.a.fr().a(((imm) this.a).b());
            case 8:
                return uea.a.fr().a(((imm) this.a).b());
            case 9:
                return ued.a.fr().a(((imm) this.a).b());
            case 10:
                return Boolean.valueOf(ued.a.fr().b(((imm) this.a).b()));
            case 11:
                return Boolean.valueOf(ued.a.fr().d(((imm) this.a).b()));
            case 12:
                return Boolean.valueOf(ued.a.fr().c(((imm) this.a).b()));
            case 13:
                return Boolean.valueOf(udo.a.fr().e(((imm) this.a).b()));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new qod(tzs.b(this.a));
            case 15:
                Boolean bool = (Boolean) ((rwc) ((tzu) this.a).a).e(false);
                bool.booleanValue();
                return bool;
            case 16:
                return new qpg((qqn) this.a.a());
            case 17:
                return new qqe((qpg) this.a.a());
            case 18:
                return new qpj(((imm) this.a).b());
            case 19:
                return new qqn(tzs.b(this.a));
            default:
                Context contextB = ((imm) this.a).b();
                int i2 = odo.c;
                int i3 = oef.c;
                try {
                    i = contextB.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
                }
                return Integer.valueOf(i);
        }
    }
}
