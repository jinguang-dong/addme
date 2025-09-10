package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udw implements udv {
    public static final qzh a;
    public static final qzh b;
    public static final qzh c;
    public static final qzh d;

    static {
        qzn qznVar = uco.a;
        a = qzi.a("45641094", 2L, "com.google.android.libraries.performance.primes", qznVar);
        b = qzi.c("3", false, "com.google.android.libraries.performance.primes", qznVar);
        c = qzi.a("45357887", 1L, "com.google.android.libraries.performance.primes", qznVar);
        d = qzi.d("19", new ucu(10), "EAAYAg", "com.google.android.libraries.performance.primes", qznVar);
    }

    @Override // defpackage.udv
    public final long a(Context context) {
        return ((Long) a.fs(context)).longValue();
    }

    @Override // defpackage.udv
    public final long b(Context context) {
        return ((Long) c.fs(context)).longValue();
    }

    @Override // defpackage.udv
    public final uyz c(Context context) {
        return (uyz) d.fs(context);
    }

    @Override // defpackage.udv
    public final boolean d(Context context) {
        return ((Boolean) b.fs(context)).booleanValue();
    }
}
