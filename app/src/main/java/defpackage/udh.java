package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udh implements udg {
    public static final qzh a;
    public static final qzh b;
    public static final qzh c;
    public static final qzh d;

    static {
        qzn qznVar = uco.a;
        a = qzi.c("45408304", false, "com.google.android.libraries.performance.primes", qznVar);
        b = qzi.a("45692046", 1L, "com.google.android.libraries.performance.primes", qznVar);
        c = qzi.d("40", new ucu(6), "Ci1jb20uZ29vZ2xlLmFuZHJvaWQucHJpbWVzLWphbmstJVBBQ0tBR0VfTkFNRSUSIwgCEh9KPCVFVkVOVF9OQU1FJT4jbWlzc2VkQXBwRnJhbWVzEh8IAxIbSjwlRVZFTlRfTkFNRSU+I3RvdGFsRnJhbWVzEiYIBRIiSjwlRVZFTlRfTkFNRSU+I21heEZyYW1lVGltZU1pbGxpcw", "com.google.android.libraries.performance.primes", qznVar);
        d = qzi.d("13", new ucu(7), "EAAYAg", "com.google.android.libraries.performance.primes", qznVar);
    }

    @Override // defpackage.udg
    public final long a(Context context) {
        return ((Long) b.fs(context)).longValue();
    }

    @Override // defpackage.udg
    public final qtf b(Context context) {
        return (qtf) c.fs(context);
    }

    @Override // defpackage.udg
    public final uyz c(Context context) {
        return (uyz) d.fs(context);
    }

    @Override // defpackage.udg
    public final boolean d(Context context) {
        return ((Boolean) a.fs(context)).booleanValue();
    }
}
