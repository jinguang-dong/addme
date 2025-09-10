package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uef implements uee {
    public static final qzh a;
    public static final qzh b;
    public static final qzh c;
    public static final qzh d;

    static {
        qzn qznVar = uco.a;
        a = qzi.d("10", new ucu(13), "EOgHGAQ", "com.google.android.libraries.performance.primes", qznVar);
        b = qzi.c("45673425", false, "com.google.android.libraries.performance.primes", qznVar);
        c = qzi.c("45673426", true, "com.google.android.libraries.performance.primes", qznVar);
        d = qzi.c("45684338", true, "com.google.android.libraries.performance.primes", qznVar);
    }

    @Override // defpackage.uee
    public final uyz a(Context context) {
        return (uyz) a.fs(context);
    }

    @Override // defpackage.uee
    public final boolean b(Context context) {
        return ((Boolean) b.fs(context)).booleanValue();
    }

    @Override // defpackage.uee
    public final boolean c(Context context) {
        return ((Boolean) c.fs(context)).booleanValue();
    }

    @Override // defpackage.uee
    public final boolean d(Context context) {
        return ((Boolean) d.fs(context)).booleanValue();
    }
}
