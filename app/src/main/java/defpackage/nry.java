package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nry {
    public final int a;
    public final Integer b;
    public final Object c;
    public final boolean d;
    public final int e;
    public final uif f;
    public final nrn g;
    public final ltw h;
    public final boolean i;
    private final boolean j;

    public nry(int i, Integer num, Object obj, boolean z, int i2, uif uifVar, boolean z2, nrn nrnVar, ltw ltwVar, boolean z3) {
        obj.getClass();
        uifVar.getClass();
        nrnVar.getClass();
        this.a = i;
        this.b = num;
        this.c = obj;
        this.d = z;
        this.e = i2;
        this.f = uifVar;
        this.j = z2;
        this.g = nrnVar;
        this.h = ltwVar;
        this.i = z3;
    }

    public static /* synthetic */ nry a(nry nryVar, int i, boolean z, int i2, ltw ltwVar, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i = nryVar.a;
        }
        int i4 = i;
        Integer num = (i3 & 2) != 0 ? nryVar.b : null;
        Object obj = (i3 & 4) != 0 ? nryVar.c : null;
        boolean z3 = (i3 & 8) != 0 ? nryVar.d : z;
        int i5 = (i3 & 16) != 0 ? nryVar.e : i2;
        uif uifVar = (i3 & 32) != 0 ? nryVar.f : null;
        boolean z4 = (i3 & 64) != 0 ? nryVar.j : false;
        nrn nrnVar = (i3 & 128) != 0 ? nryVar.g : null;
        ltw ltwVar2 = (i3 & 256) != 0 ? nryVar.h : ltwVar;
        boolean z5 = (i3 & 512) != 0 ? nryVar.i : z2;
        obj.getClass();
        uifVar.getClass();
        nrnVar.getClass();
        return new nry(i4, num, obj, z3, i5, uifVar, z4, nrnVar, ltwVar2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nry)) {
            return false;
        }
        nry nryVar = (nry) obj;
        return this.a == nryVar.a && a.ao(this.b, nryVar.b) && a.ao(this.c, nryVar.c) && this.d == nryVar.d && this.e == nryVar.e && a.ao(this.f, nryVar.f) && this.j == nryVar.j && this.g == nryVar.g && this.h == nryVar.h && this.i == nryVar.i;
    }

    public final int hashCode() {
        Integer num = this.b;
        int iHashCode = (((((((((((((this.a * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.c.hashCode()) * 31) + a.o(this.d)) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + a.o(this.j)) * 31) + this.g.hashCode();
        ltw ltwVar = this.h;
        return (((iHashCode * 31) + (ltwVar != null ? ltwVar.hashCode() : 0)) * 31) + a.o(this.i);
    }

    public final String toString() {
        return "ComposeWearSettingsElement(title=" + this.a + ", summary=" + this.b + ", itemType=" + this.c + ", visible=" + this.d + ", iconRes=" + this.e + ", onClick=" + this.f + ", isEnabled=" + this.j + ", buttonType=" + this.g + ", timerOption=" + this.h + ", isSelected=" + this.i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nry(int i, Integer num, Object obj, boolean z, int i2, uif uifVar, nrn nrnVar, ltw ltwVar, boolean z2, int i3) {
        int i4 = i3 & 16;
        this(i, (i3 & 2) != 0 ? null : num, obj, (!((i3 & 8) == 0)) | z, i4 != 0 ? 0 : i2, (i3 & 32) != 0 ? new drg(7) : uifVar, (i3 & 64) != 0, nrnVar, (i3 & 256) != 0 ? null : ltwVar, ((i3 & 512) == 0) & z2);
    }
}
