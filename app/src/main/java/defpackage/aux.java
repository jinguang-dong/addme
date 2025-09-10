package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aux {
    public final cdo a;
    public final cdo b;
    private final cdo c;
    private final cdo d;
    private final cdo e;
    private final cdo f;
    private final cdo g;
    private final cdo h;
    private final cdo i;
    private final cdo j;
    private final cdo k;
    private final cdo l;
    private final cdo m;

    public aux(cdo cdoVar, cdo cdoVar2, cdo cdoVar3, cdo cdoVar4, cdo cdoVar5, cdo cdoVar6, cdo cdoVar7, cdo cdoVar8, cdo cdoVar9, cdo cdoVar10, cdo cdoVar11, cdo cdoVar12, cdo cdoVar13) {
        this.c = cdoVar;
        this.d = cdoVar2;
        this.e = cdoVar3;
        this.f = cdoVar4;
        this.g = cdoVar5;
        this.h = cdoVar6;
        this.i = cdoVar7;
        this.j = cdoVar8;
        this.k = cdoVar9;
        this.a = cdoVar10;
        this.b = cdoVar11;
        this.l = cdoVar12;
        this.m = cdoVar13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aux)) {
            return false;
        }
        aux auxVar = (aux) obj;
        return a.ao(this.c, auxVar.c) && a.ao(this.d, auxVar.d) && a.ao(this.e, auxVar.e) && a.ao(this.f, auxVar.f) && a.ao(this.g, auxVar.g) && a.ao(this.h, auxVar.h) && a.ao(this.i, auxVar.i) && a.ao(this.j, auxVar.j) && a.ao(this.k, auxVar.k) && a.ao(this.a, auxVar.a) && a.ao(this.b, auxVar.b) && a.ao(this.l, auxVar.l) && a.ao(this.m, auxVar.m);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "Typography(h1=" + this.c + ", h2=" + this.d + ", h3=" + this.e + ", h4=" + this.f + ", h5=" + this.g + ", h6=" + this.h + ", subtitle1=" + this.i + ", subtitle2=" + this.j + ", body1=" + this.k + ", body2=" + this.a + ", button=" + this.b + ", caption=" + this.l + ", overline=" + this.m + ')';
    }
}
