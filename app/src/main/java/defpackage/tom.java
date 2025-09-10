package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tom extends ton {
    public static final /* synthetic */ int a = 0;
    private final ByteBuffer f;
    private final long g;
    private long h;
    private long i;
    private final long j;
    private int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    public tom(ByteBuffer byteBuffer) {
        this.f = byteBuffer.duplicate();
        long jK = trv.a.k(byteBuffer, trv.e);
        this.g = jK;
        this.h = byteBuffer.limit() + jK;
        long jPosition = jK + byteBuffer.position();
        this.i = jPosition;
        this.j = jPosition;
    }

    private final int G(long j) {
        return (int) (j - this.g);
    }

    private final int R() {
        return (int) (this.h - this.i);
    }

    private final void S() {
        long j = this.h + this.k;
        this.h = j;
        int i = (int) (j - this.j);
        int i2 = this.m;
        if (i <= i2) {
            this.k = 0;
            return;
        }
        int i3 = i - i2;
        this.k = i3;
        this.h = j - i3;
    }

    @Override // defpackage.ton
    public final void A(int i) {
        this.m = i;
        S();
    }

    public final void B(int i) throws tpz {
        if (i >= 0 && i <= R()) {
            this.i += i;
        } else {
            if (i >= 0) {
                throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // defpackage.ton
    public final boolean C() {
        return this.i == this.h;
    }

    @Override // defpackage.ton
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.ton
    public final boolean E(int i) throws tpz {
        int iB = tsa.b(i);
        int i2 = 0;
        if (iB == 0) {
            if (R() < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new tpz("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                long j = this.i;
                this.i = 1 + j;
                if (trv.a(j) < 0) {
                    i2++;
                }
            }
            throw new tpz("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (iB == 1) {
            B(8);
            return true;
        }
        if (iB == 2) {
            B(j());
            return true;
        }
        if (iB == 3) {
            P();
            z(tsa.c(tsa.a(i), 4));
            return true;
        }
        if (iB == 4) {
            O();
            return false;
        }
        if (iB != 5) {
            throw new tpy();
        }
        B(4);
        return true;
    }

    @Override // defpackage.ton
    public final byte[] F() throws tpz {
        int iJ = j();
        if (iJ < 0 || iJ > R()) {
            if (iJ > 0) {
                throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (iJ == 0) {
                return tpx.b;
            }
            throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArr = new byte[iJ];
        long j = this.i;
        long j2 = iJ;
        long j3 = j + j2;
        ByteBuffer byteBuffer = this.f;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            try {
                byteBuffer.position(G(j));
                byteBuffer.limit(G(j3));
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                byteBufferSlice.get(bArr);
                this.i += j2;
                return bArr;
            } catch (IllegalArgumentException e) {
                tpz tpzVar = new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                tpzVar.initCause(e);
                throw tpzVar;
            }
        } catch (Throwable th) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    public final byte a() throws tpz {
        long j = this.i;
        if (j == this.h) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.i = 1 + j;
        return trv.a(j);
    }

    @Override // defpackage.ton
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.ton
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.ton
    public final int d() {
        return (int) (this.i - this.j);
    }

    @Override // defpackage.ton
    public final int e(int i) throws tpz {
        if (i < 0) {
            throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iD = i + d();
        int i2 = this.m;
        if (iD > i2) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = iD;
        S();
        return i2;
    }

    @Override // defpackage.ton
    public final int f() {
        return j();
    }

    @Override // defpackage.ton
    public final int g() {
        return i();
    }

    @Override // defpackage.ton
    public final int h() {
        return j();
    }

    public final int i() throws tpz {
        long j = this.i;
        if (this.h - j < 4) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.i = 4 + j;
        return (trv.a(j) & 255) | ((trv.a(1 + j) & 255) << 8) | ((trv.a(2 + j) & 255) << 16) | ((trv.a(j + 3) & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (defpackage.trv.a(r3) >= 0) goto L33;
     */
    @Override // defpackage.ton
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j() {
        /*
            r9 = this;
            long r0 = r9.i
            long r2 = r9.h
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = defpackage.trv.a(r0)
            if (r4 < 0) goto L16
            r9.i = r2
            return r4
        L16:
            long r5 = r9.h
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = defpackage.trv.a(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = defpackage.trv.a(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = defpackage.trv.a(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = defpackage.trv.a(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = defpackage.trv.a(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = defpackage.trv.a(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = defpackage.trv.a(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = defpackage.trv.a(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = defpackage.trv.a(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.i = r5
            return r0
        L92:
            long r0 = r9.s()
            int r9 = (int) r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tom.j():int");
    }

    @Override // defpackage.ton
    public final int k() {
        return i();
    }

    @Override // defpackage.ton
    public final int l() {
        return H(j());
    }

    @Override // defpackage.ton
    public final int m() throws tpz {
        if (C()) {
            this.l = 0;
            return 0;
        }
        int iJ = j();
        this.l = iJ;
        if (tsa.a(iJ) != 0) {
            return iJ;
        }
        throw new tpz("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.ton
    public final int n() {
        return j();
    }

    @Override // defpackage.ton
    public final long o() {
        return q();
    }

    @Override // defpackage.ton
    public final long p() {
        return r();
    }

    public final long q() throws tpz {
        long j = this.i;
        if (this.h - j < 8) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.i = 8 + j;
        long jA = trv.a(j);
        long jA2 = trv.a(1 + j);
        long jA3 = trv.a(2 + j);
        long jA4 = trv.a(3 + j);
        long jA5 = trv.a(4 + j);
        return ((trv.a(j + 7) & 255) << 56) | (jA & 255) | ((jA2 & 255) << 8) | ((jA3 & 255) << 16) | ((jA4 & 255) << 24) | ((jA5 & 255) << 32) | ((trv.a(5 + j) & 255) << 40) | ((trv.a(6 + j) & 255) << 48);
    }

    @Override // defpackage.ton
    public final long r() {
        long j;
        long j2;
        int i;
        long j3 = this.i;
        if (this.h != j3) {
            long j4 = 1 + j3;
            byte bA = trv.a(j3);
            if (bA >= 0) {
                this.i = j4;
                return bA;
            }
            if (this.h - j4 >= 9) {
                long j5 = 2 + j3;
                int iA = (trv.a(j4) << 7) ^ bA;
                if (iA >= 0) {
                    long j6 = 3 + j3;
                    int iA2 = iA ^ (trv.a(j5) << 14);
                    if (iA2 >= 0) {
                        j = iA2 ^ 16256;
                    } else {
                        j5 = 4 + j3;
                        int iA3 = iA2 ^ (trv.a(j6) << 21);
                        if (iA3 < 0) {
                            i = (-2080896) ^ iA3;
                        } else {
                            j6 = 5 + j3;
                            long jA = (trv.a(j5) << 28) ^ iA3;
                            if (jA < 0) {
                                long j7 = 6 + j3;
                                long jA2 = (trv.a(j6) << 35) ^ jA;
                                if (jA2 >= 0) {
                                    j5 = j3 + 7;
                                    long jA3 = jA2 ^ (trv.a(j7) << 42);
                                    if (jA3 >= 0) {
                                        j = 4363953127296L ^ jA3;
                                    } else {
                                        j7 = 8 + j3;
                                        jA2 = jA3 ^ (trv.a(j5) << 49);
                                        if (jA2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long jA4 = (jA2 ^ (trv.a(j7) << 56)) ^ 71499008037633920L;
                                            if (jA4 < 0) {
                                                long j8 = j3 + 10;
                                                if (trv.a(j5) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                            j = jA4;
                                        }
                                    }
                                    this.i = j5;
                                    return j;
                                }
                                j2 = -34093383808L;
                                j = j2 ^ jA2;
                                j5 = j7;
                                this.i = j5;
                                return j;
                            }
                            j = 266354560 ^ jA;
                        }
                    }
                    j5 = j6;
                    this.i = j5;
                    return j;
                }
                i = iA ^ (-128);
                j = i;
                this.i = j5;
                return j;
            }
        }
        return s();
    }

    final long s() throws tpz {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new tpz("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.ton
    public final long t() {
        return q();
    }

    @Override // defpackage.ton
    public final long u() {
        return J(r());
    }

    @Override // defpackage.ton
    public final long v() {
        return r();
    }

    @Override // defpackage.ton
    public final toj w() throws tpz {
        int iJ = j();
        if (iJ <= 0 || iJ > R()) {
            if (iJ == 0) {
                return toj.b;
            }
            if (iJ < 0) {
                throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iJ];
        long j = iJ;
        trv.x(this.i, bArr, j);
        this.i += j;
        toj tojVar = toj.b;
        return new toh(bArr);
    }

    @Override // defpackage.ton
    public final String x() throws tpz {
        int iJ = j();
        if (iJ <= 0 || iJ > R()) {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iJ];
        long j = iJ;
        trv.x(this.i, bArr, j);
        String str = new String(bArr, tpx.a);
        this.i += j;
        return str;
    }

    @Override // defpackage.ton
    public final void z(int i) throws tpz {
        if (this.l != i) {
            throw new tpz("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.ton
    public final String y() throws tpz {
        String strAV;
        int iJ = j();
        if (iJ > 0 && iJ <= R()) {
            int iG = G(this.i);
            ByteBuffer byteBuffer = this.f;
            int i = trx.a;
            if (byteBuffer.hasArray()) {
                strAV = rnt.aW(byteBuffer.array(), byteBuffer.arrayOffset() + iG, iJ);
            } else if (byteBuffer.isDirect()) {
                strAV = rnt.aV(byteBuffer, iG, iJ);
            } else {
                strAV = rnt.aV(byteBuffer, iG, iJ);
            }
            this.i += iJ;
            return strAV;
        }
        if (iJ == 0) {
            return nWEkBGOQPWQp.yOOByz;
        }
        if (iJ <= 0) {
            throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
