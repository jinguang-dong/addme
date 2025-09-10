package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tah {
    public int a;
    public ByteBuffer b;
    public int c;
    private int d;

    public tah() {
        if (rup.a == null) {
            rup.a = new rup(null);
        }
    }

    public static int b(int i, ByteBuffer byteBuffer) {
        return i + byteBuffer.getInt(i);
    }

    public final int a(int i) {
        return i + this.b.getInt(i);
    }

    public final int c(int i) {
        if (i < this.c) {
            return this.b.getShort(this.d + i);
        }
        return 0;
    }

    protected final int d(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    public final void e(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.d = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.d = 0;
        }
        this.c = s;
    }

    public final int f() {
        int iC = c(8);
        if (iC != 0) {
            return this.b.getInt(iC + this.a);
        }
        return 0;
    }

    public final int g() {
        int iC = c(6);
        if (iC != 0) {
            return this.b.getInt(iC + this.a);
        }
        return 0;
    }

    public final ByteBuffer h() {
        int iC = c(4);
        if (iC == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int iD = d(iC);
        byteBufferOrder.position(iD);
        int i = iC + this.a;
        byteBufferOrder.limit(iD + this.b.getInt(i + this.b.getInt(i)));
        return byteBufferOrder;
    }

    public final tah i() {
        tah tahVar = new tah();
        int iC = c(14);
        if (iC == 0) {
            return null;
        }
        tahVar.e(a(iC + this.a), this.b);
        return tahVar;
    }

    public final tah j() {
        tah tahVar = new tah();
        int iC = c(4);
        if (iC == 0) {
            return null;
        }
        tahVar.e(a(iC + this.a), this.b);
        return tahVar;
    }

    public final tah k() {
        tah tahVar = new tah();
        int iC = c(6);
        if (iC == 0) {
            return null;
        }
        tahVar.e(a(iC + this.a), this.b);
        return tahVar;
    }

    public final tah l() {
        tah tahVar = new tah();
        int iC = c(8);
        if (iC == 0) {
            return null;
        }
        tahVar.e(a(iC + this.a), this.b);
        return tahVar;
    }

    protected final int m(int i) {
        return this.d + (i * this.a);
    }

    public final void n(int i, ByteBuffer byteBuffer) {
        int i2;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.d = i;
            this.c = byteBuffer.getInt(i - 4);
            i2 = 4;
        } else {
            i2 = 0;
            this.d = 0;
            this.c = 0;
        }
        this.a = i2;
    }

    public final tah o(int i) {
        tah tahVar = new tah();
        tahVar.e(b(m(i), this.b), this.b);
        return tahVar;
    }

    public final tah p(int i) {
        tah tahVar = new tah();
        tahVar.e(b(m(i), this.b), this.b);
        return tahVar;
    }

    public final tah q() {
        tah tahVar = new tah(null);
        int iC = c(12);
        if (iC == 0) {
            return null;
        }
        tahVar.n(d(iC), this.b);
        return tahVar;
    }

    public final tah r() {
        tah tahVar = new tah(null);
        int iC = c(10);
        if (iC == 0) {
            return null;
        }
        tahVar.n(d(iC), this.b);
        return tahVar;
    }

    public tah(byte[] bArr) {
    }
}
