package defpackage;

import android.content.Context;
import com.google.vr.audio.Cf.qcjAcSmlN;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udk implements udj {
    public static final qzh a;
    public static final qzh b;
    public static final qzh c;
    public static final qzh d;

    @Override // defpackage.udj
    public final long a(Context context) {
        return ((Long) c.fs(context)).longValue();
    }

    @Override // defpackage.udj
    public final uyz b(Context context) {
        return (uyz) b.fs(context);
    }

    @Override // defpackage.udj
    public final boolean c(Context context) {
        return ((Boolean) a.fs(context)).booleanValue();
    }

    @Override // defpackage.udj
    public final boolean d(Context context) {
        return ((Boolean) d.fs(context)).booleanValue();
    }

    static {
        qzn qznVar = uco.a;
        a = qzi.c("45415027", true, "com.google.android.libraries.performance.primes", qznVar);
        b = qzi.d(qcjAcSmlN.IlkgUhmIXqMuLWC, new ucu(8), "EOgHGAQ", "com.google.android.libraries.performance.primes", qznVar);
        c = qzi.a("45401381", 3600000L, "com.google.android.libraries.performance.primes", qznVar);
        d = qzi.c("45420903", false, "com.google.android.libraries.performance.primes", qznVar);
    }
}
