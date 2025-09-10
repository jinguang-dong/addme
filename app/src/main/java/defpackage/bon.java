package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bon extends byi {
    public final String a;
    public final List b;
    public final int c;
    public final bks d;
    public final float e;
    public final bks f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public bon(String str, List list, int i, bks bksVar, float f, bks bksVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super((char[]) null);
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = bksVar;
        this.e = f;
        this.f = bksVar2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bon bonVar = (bon) obj;
            return a.ao(this.a, bonVar.a) && a.ao(this.d, bonVar.d) && this.e == bonVar.e && a.ao(this.f, bonVar.f) && this.g == bonVar.g && this.h == bonVar.h && a.p(this.i, bonVar.i) && a.p(this.j, bonVar.j) && this.k == bonVar.k && this.l == bonVar.l && this.m == bonVar.m && this.n == bonVar.n && a.p(this.c, bonVar.c) && a.ao(this.b, bonVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        bks bksVar = this.d;
        int iHashCode2 = ((((iHashCode * 31) + (bksVar != null ? bksVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.e)) * 31;
        bks bksVar2 = this.f;
        return ((((((((((((((((((iHashCode2 + (bksVar2 != null ? bksVar2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i) * 31) + this.j) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + Float.floatToIntBits(this.m)) * 31) + Float.floatToIntBits(this.n)) * 31) + this.c;
    }
}
