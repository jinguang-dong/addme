package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class udb implements uda {
    public static final qzh a;
    public static final qzh b;
    public static final qzh c;
    public static final qzh d;
    public static final qzh e;
    public static final qzh f;

    static {
        qzn qznVar = uco.a;
        a = qzi.d("45390627", new ucu(3), "CAAQAxgGIJBOLQrXIzw", "com.google.android.libraries.performance.primes", qznVar);
        b = qzi.d("45376983", new ucu(4), "CAEQZBj0AyDoBw", "com.google.android.libraries.performance.primes", qznVar);
        c = qzi.c("45625683", false, "com.google.android.libraries.performance.primes", qznVar);
        d = qzi.c("45617767", false, "com.google.android.libraries.performance.primes", qznVar);
        e = qzi.a("45661178", 500L, "com.google.android.libraries.performance.primes", qznVar);
        f = qzi.d("45371370", new ucu(5), "CJYBEMgB", "com.google.android.libraries.performance.primes", qznVar);
    }

    @Override // defpackage.uda
    public final long a(Context context) {
        return ((Long) e.fs(context)).longValue();
    }

    @Override // defpackage.uda
    public final qri b(Context context) {
        return (qri) a.fs(context);
    }

    @Override // defpackage.uda
    public final qrv c(Context context) {
        return (qrv) f.fs(context);
    }

    @Override // defpackage.uda
    public final qrw d(Context context) {
        return (qrw) b.fs(context);
    }

    @Override // defpackage.uda
    public final boolean e(Context context) {
        return ((Boolean) c.fs(context)).booleanValue();
    }

    @Override // defpackage.uda
    public final boolean f(Context context) {
        return ((Boolean) d.fs(context)).booleanValue();
    }
}
