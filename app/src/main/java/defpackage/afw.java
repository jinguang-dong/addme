package defpackage;

/* compiled from: PG */
@ueo
/* loaded from: classes.dex */
public final class afw {
    public final long a;
    public final alv b;

    public afw(long j, alv alvVar) {
        this.a = j;
        this.b = alvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.ao(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        long j = this.a;
        afw afwVar = (afw) obj;
        long j2 = afwVar.a;
        long j3 = bkv.a;
        return a.q(j, j2) && a.ao(this.b, afwVar.b);
    }

    public final int hashCode() {
        long j = bkv.a;
        return (a.r(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) bkv.g(this.a)) + ", drawPadding=" + this.b + ')';
    }
}
