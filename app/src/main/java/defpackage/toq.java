package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class toq extends tos {
    private final byte[] a;
    private final int b;
    private int c;

    public toq(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.a = bArr;
        this.c = i;
        this.b = i3;
    }

    @Override // defpackage.tos
    public final void A(int i, int i2) throws tor {
        C(tsa.c(i, i2));
    }

    @Override // defpackage.tos
    public final void B(int i, int i2) throws tor {
        A(i, 0);
        C(i2);
    }

    @Override // defpackage.tos
    public final void C(int i) throws tor {
        int i2;
        int i3 = this.c;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.a[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i3 = i2;
                    throw new tor(i3, this.b, 1, e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new tor(i3, this.b, 1, e);
            }
        }
        i2 = i3 + 1;
        this.a[i3] = (byte) i;
        this.c = i2;
    }

    @Override // defpackage.tos
    public final void D(int i, long j) throws tor {
        A(i, 0);
        E(j);
    }

    @Override // defpackage.tos
    public final void E(long j) throws tor {
        int i;
        int i2;
        int i3 = this.c;
        if (!tos.e || b() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                }
                try {
                    this.a[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i2;
                    throw new tor(i3, this.b, 1, e);
                }
            }
            i = i3 + 1;
            try {
                this.a[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                i3 = i;
                throw new tor(i3, this.b, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                trv.l(this.a, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            trv.l(this.a, i3, (byte) j);
        }
        this.c = i;
    }

    @Override // defpackage.tos
    public final void F(byte[] bArr, int i) throws tor {
        C(i);
        c(bArr, 0, i);
    }

    @Override // defpackage.tos, defpackage.tob
    public final void a(byte[] bArr, int i, int i2) throws tor {
        c(bArr, i, i2);
    }

    @Override // defpackage.tos
    public final int b() {
        return this.b - this.c;
    }

    public final void c(byte[] bArr, int i, int i2) throws tor {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new tor(this.c, this.b, i2, e);
        }
    }

    @Override // defpackage.tos
    public final void j(byte b) throws tor {
        int i;
        int i2 = this.c;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.a[i2] = b;
            this.c = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new tor(i2, this.b, 1, e);
        }
    }

    @Override // defpackage.tos
    public final void l(int i, boolean z) throws tor {
        A(i, 0);
        j(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.tos
    public final void m(int i, toj tojVar) throws tor {
        A(i, 2);
        n(tojVar);
    }

    @Override // defpackage.tos
    public final void n(toj tojVar) throws tor {
        C(tojVar.d());
        tojVar.k(this);
    }

    @Override // defpackage.tos
    public final void o(int i, int i2) throws tor {
        A(i, 5);
        p(i2);
    }

    @Override // defpackage.tos
    public final void p(int i) throws tor {
        int i2 = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new tor(i2, this.b, 4, e);
        }
    }

    @Override // defpackage.tos
    public final void q(int i, long j) throws tor {
        A(i, 1);
        r(j);
    }

    @Override // defpackage.tos
    public final void r(long j) throws tor {
        int i = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.c = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new tor(i, this.b, 8, e);
        }
    }

    @Override // defpackage.tos
    public final void s(int i, int i2) throws tor {
        A(i, 0);
        t(i2);
    }

    @Override // defpackage.tos
    public final void t(int i) throws tor {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    @Override // defpackage.tos
    public final void u(int i, tqr tqrVar, trg trgVar) throws tor {
        A(i, 2);
        C(((tnr) tqrVar).e(trgVar));
        trgVar.m(tqrVar, this.f);
    }

    @Override // defpackage.tos
    public final void v(tqr tqrVar) throws tor {
        C(tqrVar.l());
        tqrVar.eg(this);
    }

    @Override // defpackage.tos
    public final void w(int i, tqr tqrVar) throws tor {
        A(1, 3);
        B(2, i);
        A(3, 2);
        v(tqrVar);
        A(1, 4);
    }

    @Override // defpackage.tos
    public final void x(int i, toj tojVar) throws tor {
        A(1, 3);
        B(2, i);
        m(3, tojVar);
        A(1, 4);
    }

    @Override // defpackage.tos
    public final void y(int i, String str) throws tor {
        A(i, 2);
        z(str);
    }

    @Override // defpackage.tos
    public final void z(String str) throws tor {
        int i = this.c;
        try {
            int iAb = ab(str.length() * 3);
            int iAb2 = ab(str.length());
            if (iAb2 != iAb) {
                C(trx.b(str));
                this.c = trx.a(str, this.a, this.c, b());
                return;
            }
            int i2 = i + iAb2;
            this.c = i2;
            int iA = trx.a(str, this.a, i2, b());
            this.c = i;
            C((iA - i) - iAb2);
            this.c = iA;
        } catch (IndexOutOfBoundsException e) {
            throw new tor(e);
        } catch (trw e2) {
            this.c = i;
            ai(str, e2);
        }
    }

    @Override // defpackage.tos
    public final void i() {
    }
}
