package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwi {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final qvx f;
    private final qvz g;
    private final qwd h;

    public qwi(Context context, rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, rwc rwcVar5) {
        String packageName = context.getPackageName();
        qvx qvxVar = (qvx) rwcVar.e(qvx.a);
        qvz qvzVar = (qvz) rwcVar2.e(qvz.a);
        qwd qwdVar = (qwd) rwcVar3.e(qwd.a);
        boolean zBooleanValue = ((Boolean) rwcVar4.e(false)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) rwcVar5.e(false)).booleanValue();
        this.c = "CAMERA_ANDROID_PRIMES";
        this.f = qvxVar;
        this.g = qvzVar;
        this.h = qwdVar;
        this.d = zBooleanValue;
        this.e = zBooleanValue2;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
        this.b = "com.google.android.client_error_logging#".concat(String.valueOf(packageName));
    }

    public final syu a() {
        syu syuVarA = this.f.a();
        syu syuVarA2 = this.g.a();
        syu syuVarA3 = this.h.a();
        return ske.F(syuVarA, syuVarA2, syuVarA3).a(new pyd(this, syuVarA, syuVarA2, syuVarA3, 2), sxo.a);
    }
}
