package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqu {
    final byte[] a;
    final int b;
    final int c;
    final int d;

    public pqu(byte[] bArr, int i, int i2, int i3) {
        rnt.B(i2 >= 0, "offset must be >= 0");
        rnt.B(i3 > 0, "length must be > 0");
        rnt.B(i3 <= bArr.length, "length exceeds data length");
        this.a = bArr;
        this.d = i;
        this.b = i2;
        this.c = i3;
    }

    final int a() {
        return this.c + 2;
    }
}
