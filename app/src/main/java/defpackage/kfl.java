package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfl {
    public final kfm a;
    public final int b;
    public final pka c;
    public final byte[] d;
    public final our e;
    public final owq f;
    public final boolean g;
    public final boolean h;
    public final rwc i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final rwc m;
    public final nul n;
    public final int o;

    public kfl() {
        throw null;
    }

    public static kfk a() {
        kfk kfkVar = new kfk((byte[]) null);
        kfkVar.b(new kfj());
        kfkVar.e(-1);
        kfkVar.c(pka.BACK);
        kfkVar.a = new byte[0];
        kfkVar.b = new our();
        kfkVar.c = owp.a(false);
        kfkVar.d(false);
        kfkVar.g(false);
        kfkVar.d = rvk.a;
        kfkVar.j(false);
        kfkVar.f(false);
        kfkVar.h(false);
        kfkVar.e = 1;
        kfkVar.k(nul.a);
        return kfkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kfl) {
            kfl kflVar = (kfl) obj;
            if (this.a.equals(kflVar.a) && this.b == kflVar.b && this.c.equals(kflVar.c)) {
                if (Arrays.equals(this.d, kflVar instanceof kfl ? kflVar.d : kflVar.d) && this.e.equals(kflVar.e) && this.f.equals(kflVar.f) && this.g == kflVar.g && this.h == kflVar.h && this.i.equals(kflVar.i) && this.j == kflVar.j && this.k == kflVar.k && this.l == kflVar.l && this.m.equals(kflVar.m)) {
                    int i = this.o;
                    int i2 = kflVar.o;
                    if (i == 0) {
                        throw null;
                    }
                    if (i == i2 && this.n.equals(kflVar.n)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true == this.l ? 1231 : 1237)) * 1000003) ^ this.m.hashCode();
        int i = this.o;
        a.aF(i);
        return this.n.hashCode() ^ (((iHashCode * 1000003) ^ i) * 1000003);
    }

    public final String toString() {
        nul nulVar = this.n;
        rwc rwcVar = this.m;
        rwc rwcVar2 = this.i;
        owq owqVar = this.f;
        our ourVar = this.e;
        byte[] bArr = this.d;
        pka pkaVar = this.c;
        return "{" + String.valueOf(this.a) + ", " + this.b + ", " + String.valueOf(pkaVar) + ", " + Arrays.toString(bArr) + ", " + String.valueOf(ourVar) + ", " + String.valueOf(owqVar) + ", " + this.g + ", " + this.h + ", " + String.valueOf(rwcVar2) + ", " + this.j + ", " + this.k + ", " + this.l + ", " + String.valueOf(rwcVar) + ", " + ezh.U(this.o) + ", " + String.valueOf(nulVar) + "}";
    }

    public kfl(kfm kfmVar, int i, pka pkaVar, byte[] bArr, our ourVar, owq owqVar, boolean z, boolean z2, rwc rwcVar, boolean z3, boolean z4, boolean z5, rwc rwcVar2, int i2, nul nulVar) {
        this.a = kfmVar;
        this.b = i;
        this.c = pkaVar;
        this.d = bArr;
        this.e = ourVar;
        this.f = owqVar;
        this.g = z;
        this.h = z2;
        this.i = rwcVar;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = rwcVar2;
        this.o = i2;
        this.n = nulVar;
    }
}
