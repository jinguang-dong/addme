package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ton {
    private static volatile int a = 100;
    int b;
    int c;
    final int d = a;
    too e;

    public static int H(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int I(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new tpz("CodedInputStream encountered a malformed varint.");
    }

    public static long J(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static ton K(InputStream inputStream) {
        return inputStream == null ? M(tpx.b) : new tol(inputStream);
    }

    public static ton L(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return Q(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        if (byteBuffer.isDirect()) {
            int i = tom.a;
            if (trv.b) {
                return new tom(byteBuffer);
            }
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return Q(bArr, 0, iRemaining);
    }

    public static ton M(byte[] bArr) {
        int length = bArr.length;
        return Q(bArr, 0, 0);
    }

    static ton Q(byte[] bArr, int i, int i2) {
        tok tokVar = new tok(bArr, i, i2);
        try {
            tokVar.e(i2);
            return tokVar;
        } catch (tpz e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract byte[] F();

    public final void N() throws tpz {
        if (this.b + this.c >= this.d) {
            throw new tpz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void O() {
        if (this.c == 0) {
            z(0);
        }
    }

    public final void P() throws tpz {
        int iM;
        do {
            iM = m();
            if (iM == 0) {
                return;
            }
            N();
            this.c++;
            this.c--;
        } while (E(iM));
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract toj w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
