package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class ulw implements Comparable {
    public static final long a(long j, long j2) {
        long j3 = ulv.a;
        ulu uluVar = ulu.a;
        uluVar.getClass();
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j != j2) {
                return uls.f(ujo.a(j2));
            }
            long j4 = uls.a;
            return 0L;
        }
        if ((((-1) + j) | 1) == Long.MAX_VALUE) {
            return ujo.a(j);
        }
        long j5 = j - j2;
        if (((j5 ^ j) & (~(j5 ^ j2))) >= 0) {
            return ujp.k(j5, uluVar);
        }
        ulu uluVar2 = ulu.c;
        if (uluVar.compareTo(uluVar2) >= 0) {
            return uls.f(ujo.a(j5));
        }
        long jD = ukc.D(1L, uluVar2, uluVar);
        long j6 = (j / jD) - (j2 / jD);
        long j7 = (j % jD) - (j2 % jD);
        long j8 = uls.a;
        return uls.d(ujp.k(j6, uluVar2), ujp.k(j7, uluVar));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
