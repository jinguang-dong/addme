package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqs implements pqv {
    private final byte[] a;
    private int b = 0;

    public pqs(byte[] bArr) {
        this.a = bArr;
    }

    private final int e() {
        return this.a.length - this.b;
    }

    @Override // defpackage.pqv
    public final int a() {
        byte[] bArr = this.a;
        int i = this.b;
        if (i >= bArr.length) {
            return -1;
        }
        this.b = i + 1;
        return bArr[i] & 255;
    }

    @Override // defpackage.pqv
    public final pqu b(int i, int i2) {
        int iMin = Math.min(i, e());
        pqu pquVar = new pqu(this.a, i2, this.b, iMin);
        this.b += iMin;
        return pquVar;
    }

    @Override // defpackage.pqv
    public final void c(int i) {
        this.b += Math.min(i, e());
    }

    @Override // defpackage.pqv
    public final pqu d() {
        return b(this.a.length - this.b, 218);
    }
}
