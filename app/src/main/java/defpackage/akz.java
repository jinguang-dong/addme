package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akz implements akx {
    public final long a;
    private final /* synthetic */ aky b = aky.a;
    private final chq c;

    public akz(chq chqVar, long j) {
        this.c = chqVar;
        this.a = j;
    }

    @Override // defpackage.akx
    public final bik a(bik bikVar, bie bieVar) {
        return this.b.a(bikVar, bieVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akz)) {
            return false;
        }
        akz akzVar = (akz) obj;
        return a.ao(this.c, akzVar.c) && a.q(this.a, akzVar.a);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + a.r(this.a);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.c + ", constraints=" + ((Object) cho.e(this.a)) + ')';
    }
}
