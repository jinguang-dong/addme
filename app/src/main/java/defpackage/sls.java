package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sls extends sle {
    private long b;
    private int c;
    private int a = 0;
    private int d = 0;
    private boolean e = false;

    private final void c(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        long j3 = ((j & 4294967295L) << i2) | j2;
        this.b = j3;
        int i3 = i2 + (i * 8);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            this.a = slt.g(this.a, slt.h((int) j3));
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // defpackage.sle
    public final void a(char c) {
        c(2, c);
    }

    @Override // defpackage.sle, defpackage.slk
    public final void d(byte[] bArr, int i) {
        int i2 = 0;
        rnt.K(0, i, bArr.length);
        while (true) {
            int i3 = i2 + 4;
            if (i3 > i) {
                break;
            }
            c(4, slt.f(bArr, i2));
            i2 = i3;
        }
        while (i2 < i) {
            c(1, bArr[i2] & 255);
            i2++;
        }
    }

    @Override // defpackage.slk
    public final sli m() {
        rnt.L(!this.e);
        this.e = true;
        int iH = this.a ^ slt.h((int) this.b);
        this.a = iH;
        return slt.i(iH, this.d);
    }
}
