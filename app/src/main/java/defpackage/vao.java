package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vao extends vaf {
    public final transient byte[][] e;
    public final transient int[] f;

    public vao(byte[][] bArr, int[] iArr) {
        super(vaf.a.b);
        this.e = bArr;
        this.f = iArr;
    }

    private final vaf i() {
        return new vaf(h());
    }

    private final Object writeReplace() {
        return i();
    }

    @Override // defpackage.vaf
    public final byte a(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length;
        int[] iArr = this.f;
        ukc.T(iArr[length - 1], i, 1L);
        int iJ = ujk.j(this, i);
        return bArr[iJ][(i - (iJ == 0 ? 0 : iArr[iJ - 1])) + iArr[length + iJ]];
    }

    @Override // defpackage.vaf
    public final int b() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.vaf
    public final String c() {
        return i().c();
    }

    @Override // defpackage.vaf
    public final boolean e(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int iJ = ujk.j(this, i);
        while (i < i5) {
            if (iJ == 0) {
                iJ = 0;
                i4 = 0;
            } else {
                i4 = this.f[iJ - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[iJ] - i4;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iJ];
            int iMin = Math.min(i5, i6 + i4) - i;
            if (!ukc.U(bArr2[iJ], i7 + (i - i4), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iJ++;
        }
        return true;
    }

    @Override // defpackage.vaf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vaf) {
            vaf vafVar = (vaf) obj;
            return vafVar.b() == b() && g(vafVar, b());
        }
        return false;
    }

    @Override // defpackage.vaf
    public final byte[] f() {
        return h();
    }

    @Override // defpackage.vaf
    public final boolean g(vaf vafVar, int i) {
        int i2;
        vafVar.getClass();
        if (b() - i < 0) {
            return false;
        }
        int iJ = ujk.j(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (iJ == 0) {
                iJ = 0;
                i2 = 0;
            } else {
                i2 = this.f[iJ - 1];
            }
            int[] iArr = this.f;
            int i5 = iArr[iJ] - i2;
            byte[][] bArr = this.e;
            int i6 = iArr[bArr.length + iJ];
            int iMin = Math.min(i, i5 + i2) - i3;
            if (!vafVar.e(i4, bArr[iJ], i6 + (i3 - i2), iMin)) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iJ++;
        }
        return true;
    }

    public final byte[] h() {
        byte[] bArr = new byte[b()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            int length = bArr2.length;
            if (i >= length) {
                return bArr;
            }
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            rnt.au(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
    }

    @Override // defpackage.vaf
    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                this.c = i3;
                return i3;
            }
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
    }

    @Override // defpackage.vaf
    public final String toString() {
        return i().toString();
    }
}
