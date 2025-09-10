package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vam {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public vam f;
    public vam g;

    public vam() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final vam a() {
        vam vamVar = this.f;
        vam vamVar2 = vamVar != this ? vamVar : null;
        vam vamVar3 = this.g;
        vamVar3.getClass();
        vamVar3.f = vamVar;
        vam vamVar4 = this.f;
        vamVar4.getClass();
        vamVar4.g = vamVar3;
        this.f = null;
        this.g = null;
        return vamVar2;
    }

    public final vam b() {
        this.d = true;
        return new vam(this.a, this.b, this.c, true);
    }

    public final void c(vam vamVar, int i) {
        if (!vamVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = vamVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (vamVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = vamVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = vamVar.a;
            rnt.au(bArr, bArr, 0, i4, i2);
            i2 = vamVar.c - vamVar.b;
            vamVar.c = i2;
            vamVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = vamVar.a;
        int i5 = this.b;
        rnt.au(bArr2, bArr3, i2, i5, i5 + i);
        vamVar.c += i;
        this.b += i;
    }

    public final void d(vam vamVar) {
        vamVar.g = this;
        vamVar.f = this.f;
        vam vamVar2 = this.f;
        vamVar2.getClass();
        vamVar2.g = vamVar;
        this.f = vamVar;
    }

    public vam(byte[] bArr, int i, int i2, boolean z) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
