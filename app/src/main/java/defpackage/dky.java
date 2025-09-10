package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dky {
    private final chq a;
    private final long b;

    public dky(chq chqVar, long j) {
        this.a = chqVar;
        this.b = j;
        chqVar.di(cho.b(j));
        chqVar.di(cho.a(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dky)) {
            return false;
        }
        dky dkyVar = (dky) obj;
        return a.ao(this.a, dkyVar.a) && a.q(this.b, dkyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.r(this.b);
    }

    public final String toString() {
        return "ScalingLazyListItemScopeImpl(density=" + this.a + ", constraints=" + ((Object) cho.e(this.b)) + ')';
    }
}
