package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejk {
    public final List a;
    public final efh b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final eio h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final ein p;
    public final eif q;
    public final List r;
    public final boolean s;
    public final int t;
    public final int u;
    public final ejs v;
    public final gga w;
    public final hkk x;

    public ejk(List list, efh efhVar, String str, long j, int i, long j2, String str2, List list2, eio eioVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, ein einVar, gga ggaVar, List list3, int i5, eif eifVar, boolean z, ejs ejsVar, hkk hkkVar) {
        this.a = list;
        this.b = efhVar;
        this.c = str;
        this.d = j;
        this.t = i;
        this.e = j2;
        this.f = str2;
        this.g = list2;
        this.h = eioVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = einVar;
        this.w = ggaVar;
        this.r = list3;
        this.u = i5;
        this.q = eifVar;
        this.s = z;
        this.v = ejsVar;
        this.x = hkkVar;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append("\n");
        efh efhVar = this.b;
        ejk ejkVarC = efhVar.c(this.e);
        if (ejkVarC != null) {
            sb.append("\t\tParents: ");
            sb.append(ejkVarC.c);
            for (ejk ejkVarC2 = efhVar.c(ejkVarC.e); ejkVarC2 != null; ejkVarC2 = efhVar.c(ejkVarC2.e)) {
                sb.append("->");
                sb.append(ejkVarC2.c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.g;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.i;
        if (i2 != 0 && (i = this.j) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.k)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
