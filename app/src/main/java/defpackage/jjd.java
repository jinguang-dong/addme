package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjd {
    public final ssc a;
    public final boolean b;
    public final float c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final boolean i;
    public final Rect j;
    public final boolean k;
    public final boolean l;
    public final spr m;
    public final rwc n;
    public final sqq o;
    public final boolean p;
    public final spo q;
    public final boolean r;
    public final rwc s;
    public final snw t;
    public final sov u;
    public final boolean v;
    public final int w;
    private final String x;
    private final int y;

    public jjd() {
        throw null;
    }

    public static jjc a() {
        jjc jjcVar = new jjc(null);
        jjcVar.f = 1;
        jjcVar.f(spr.a);
        rvk rvkVar = rvk.a;
        jjcVar.c = rvkVar;
        jjcVar.h(sqq.a);
        jjcVar.e(spo.a);
        jjcVar.p(false);
        jjcVar.d = rvkVar;
        jjcVar.c(snw.a);
        jjcVar.e = 1;
        jjcVar.d(sov.a);
        return jjcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jjd) {
            jjd jjdVar = (jjd) obj;
            if (this.a.equals(jjdVar.a) && this.x.equals(jjdVar.x) && this.b == jjdVar.b) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(jjdVar.c) && this.d.equals(jjdVar.d) && this.e == jjdVar.e && this.f == jjdVar.f && this.g == jjdVar.g) {
                    if (Float.floatToIntBits(this.h) == Float.floatToIntBits(jjdVar.h) && this.i == jjdVar.i && this.j.equals(jjdVar.j) && this.k == jjdVar.k && this.l == jjdVar.l) {
                        int i = this.w;
                        int i2 = jjdVar.w;
                        if (i == 0) {
                            throw null;
                        }
                        if (i == i2 && this.m.equals(jjdVar.m) && this.n.equals(jjdVar.n) && this.o.equals(jjdVar.o) && this.p == jjdVar.p && this.q.equals(jjdVar.q) && this.r == jjdVar.r && this.s.equals(jjdVar.s) && this.t.equals(jjdVar.t) && this.u.equals(jjdVar.u) && this.v == jjdVar.v) {
                            int i3 = this.y;
                            int i4 = jjdVar.y;
                            if (i3 == 0) {
                                throw null;
                            }
                            if (i4 == 1) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iJ3;
        int iJ4;
        int iJ5;
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.x.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ this.d.hashCode();
        float f = this.h;
        int iFloatToIntBits = (((((((iHashCode * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(f);
        Rect rect = this.j;
        int iHashCode2 = (((iFloatToIntBits * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ rect.hashCode();
        int i = this.w;
        a.aQ(i);
        spr sprVar = this.m;
        if (sprVar.C()) {
            iJ = sprVar.j();
        } else {
            int iJ6 = sprVar.aT;
            if (iJ6 == 0) {
                iJ6 = sprVar.j();
                sprVar.aT = iJ6;
            }
            iJ = iJ6;
        }
        int iHashCode3 = ((((((((((iHashCode2 * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ i) * 1000003) ^ iJ) * 1000003) ^ this.n.hashCode()) * 1000003;
        sqq sqqVar = this.o;
        if (sqqVar.C()) {
            iJ2 = sqqVar.j();
        } else {
            int iJ7 = sqqVar.aT;
            if (iJ7 == 0) {
                iJ7 = sqqVar.j();
                sqqVar.aT = iJ7;
            }
            iJ2 = iJ7;
        }
        int i2 = (((iHashCode3 ^ iJ2) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003;
        spo spoVar = this.q;
        if (spoVar.C()) {
            iJ3 = spoVar.j();
        } else {
            int iJ8 = spoVar.aT;
            if (iJ8 == 0) {
                iJ8 = spoVar.j();
                spoVar.aT = iJ8;
            }
            iJ3 = iJ8;
        }
        int iHashCode4 = (((((i2 ^ iJ3) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ this.s.hashCode()) * 1000003;
        snw snwVar = this.t;
        if (snwVar.C()) {
            iJ4 = snwVar.j();
        } else {
            int iJ9 = snwVar.aT;
            if (iJ9 == 0) {
                iJ9 = snwVar.j();
                snwVar.aT = iJ9;
            }
            iJ4 = iJ9;
        }
        int i3 = (iHashCode4 ^ iJ4) * 1000003;
        sov sovVar = this.u;
        if (sovVar.C()) {
            iJ5 = sovVar.j();
        } else {
            int iJ10 = sovVar.aT;
            if (iJ10 == 0) {
                iJ10 = sovVar.j();
                sovVar.aT = iJ10;
            }
            iJ5 = iJ10;
        }
        int i4 = (i3 ^ iJ5) * 1000003;
        int i5 = true == this.v ? 1231 : 1237;
        a.aF(this.y);
        return ((i4 ^ i5) * 1000003) ^ 1;
    }

    public final String toString() {
        Rect rect = this.j;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(rect);
        int i = this.w;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        spr sprVar = this.m;
        rwc rwcVar = this.n;
        sqq sqqVar = this.o;
        spo spoVar = this.q;
        rwc rwcVar2 = this.s;
        snw snwVar = this.t;
        sov sovVar = this.u;
        int i2 = this.y;
        String strValueOf3 = String.valueOf(sprVar);
        String strValueOf4 = String.valueOf(rwcVar);
        String strValueOf5 = String.valueOf(sqqVar);
        String strValueOf6 = String.valueOf(spoVar);
        String strValueOf7 = String.valueOf(rwcVar2);
        String strValueOf8 = String.valueOf(snwVar);
        String strValueOf9 = String.valueOf(sovVar);
        StringBuilder sb = new StringBuilder("{");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(this.x);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(string);
        sb.append(", ");
        sb.append(strValueOf3);
        sb.append(", ");
        sb.append(strValueOf4);
        sb.append(", ");
        sb.append(strValueOf5);
        sb.append(", ");
        sb.append(this.p);
        sb.append(", ");
        sb.append(strValueOf6);
        sb.append(", ");
        sb.append(this.r);
        sb.append(", ");
        sb.append(strValueOf7);
        boolean z = this.v;
        sb.append(", ");
        sb.append(strValueOf8);
        sb.append(", ");
        sb.append(strValueOf9);
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(ezh.U(i2));
        sb.append("}");
        return sb.toString();
    }

    public jjd(ssc sscVar, String str, boolean z, float f, String str2, boolean z2, boolean z3, boolean z4, float f2, boolean z5, Rect rect, boolean z6, boolean z7, int i, spr sprVar, rwc rwcVar, sqq sqqVar, boolean z8, spo spoVar, boolean z9, rwc rwcVar2, snw snwVar, sov sovVar, boolean z10) {
        this.a = sscVar;
        this.x = str;
        this.b = z;
        this.c = f;
        this.d = str2;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = f2;
        this.i = z5;
        this.j = rect;
        this.k = z6;
        this.l = z7;
        this.w = i;
        this.m = sprVar;
        this.n = rwcVar;
        this.o = sqqVar;
        this.p = z8;
        this.q = spoVar;
        this.r = z9;
        this.s = rwcVar2;
        this.t = snwVar;
        this.u = sovVar;
        this.v = z10;
        this.y = 1;
    }
}
