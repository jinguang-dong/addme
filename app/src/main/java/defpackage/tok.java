package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tok extends ton {
    private final byte[] a;
    private int f;
    private int g;
    private int h;
    private final int i;
    private int j;
    private int k = Integer.MAX_VALUE;

    public tok(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.f = i2 + i;
        this.h = i;
        this.i = i;
    }

    private final void R() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = i - this.i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    @Override // defpackage.ton
    public final void A(int i) {
        this.k = i;
        R();
    }

    public final void B(int i) throws tpz {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.ton
    public final boolean C() {
        return this.h == this.f;
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
            if (this.f - this.h < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new tpz("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                byte[] bArr = this.a;
                int i3 = this.h;
                this.h = i3 + 1;
                if (bArr[i3] < 0) {
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
    public final byte[] F() {
        return G(j());
    }

    public final byte[] G(int i) throws tpz {
        if (i > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.h = i4;
                return Arrays.copyOfRange(this.a, i3, i4);
            }
        }
        if (i > 0) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i == 0) {
            return tpx.b;
        }
        throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final byte a() throws tpz {
        int i = this.h;
        if (i == this.f) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.h = i + 1;
        return bArr[i];
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
        return this.h - this.i;
    }

    @Override // defpackage.ton
    public final int e(int i) {
        if (i < 0) {
            throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iD = i + d();
        if (iD < 0) {
            throw new tpz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.k;
        if (iD > i2) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = iD;
        R();
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
        int i = this.h;
        if (this.f - i < 4) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.h = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // defpackage.ton
    public final int j() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            byte[] bArr = this.a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.h = i5;
                return i;
            }
        }
        return (int) s();
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
            this.j = 0;
            return 0;
        }
        int iJ = j();
        this.j = iJ;
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
        int i = this.h;
        if (this.f - i < 8) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.h = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // defpackage.ton
    public final long r() {
        long j;
        long j2;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            byte[] bArr = this.a;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j3 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j3;
                        } else {
                            i6 = i + 5;
                            long j4 = (bArr[i8] << 28) ^ i9;
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (bArr[i6] << 35) ^ j4;
                                if (j5 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (bArr[i4] << 42);
                                    if (j6 >= 0) {
                                        j = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (bArr[i10] << 49);
                                        if (j5 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j7 = (j5 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j5 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.h = i4;
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
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                toj tojVarR = toj.r(this.a, i2, iJ);
                this.h += iJ;
                return tojVarR;
            }
        }
        if (iJ == 0) {
            return toj.b;
        }
        byte[] bArrG = G(iJ);
        toj tojVar = toj.b;
        return new toh(bArrG);
    }

    @Override // defpackage.ton
    public final String x() throws tpz {
        int iJ = j();
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                String str = new String(this.a, i2, iJ, tpx.a);
                this.h += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.ton
    public final String y() throws tpz {
        int iJ = j();
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                byte[] bArr = this.a;
                int i3 = trx.a;
                String strAW = rnt.aW(bArr, i2, iJ);
                this.h += iJ;
                return strAW;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw new tpz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.ton
    public final void z(int i) throws tpz {
        if (this.j != i) {
            throw new tpz("Protocol message end-group tag did not match expected tag.");
        }
    }
}
