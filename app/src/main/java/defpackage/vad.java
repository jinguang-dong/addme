package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import com.google.ar.core.ImageMetadata;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vad implements Cloneable, ByteChannel, Closeable, Flushable, WritableByteChannel, vae {
    public vam a;
    public long b;

    public final byte a(long j) {
        ukc.T(this.b, j, 1L);
        vam vamVar = this.a;
        vamVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                vamVar = vamVar.g;
                vamVar.getClass();
                j2 -= vamVar.c - vamVar.b;
            }
            vamVar.getClass();
            return vamVar.a[(int) ((vamVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = vamVar.c;
            int i2 = vamVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                vamVar.getClass();
                return vamVar.a[(int) ((i2 + j) - j3)];
            }
            vamVar = vamVar.f;
            vamVar.getClass();
            j3 = j4;
        }
    }

    public final byte b() {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        vam vamVar = this.a;
        vamVar.getClass();
        int i = vamVar.b;
        int i2 = i + 1;
        byte[] bArr = vamVar.a;
        int i3 = vamVar.c;
        byte b = bArr[i];
        this.b = j - 1;
        if (i2 != i3) {
            vamVar.b = i2;
            return b;
        }
        this.a = vamVar.a();
        van.b(vamVar);
        return b;
    }

    public final int c(byte[] bArr, int i, int i2) {
        ukc.T(bArr.length, i, i2);
        vam vamVar = this.a;
        if (vamVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, vamVar.c - vamVar.b);
        int i3 = vamVar.b;
        rnt.au(vamVar.a, bArr, i, i3, i3 + iMin);
        int i4 = vamVar.b + iMin;
        vamVar.b = i4;
        this.b -= iMin;
        if (i4 != vamVar.c) {
            return iMin;
        }
        this.a = vamVar.a();
        van.b(vamVar);
        return iMin;
    }

    public final /* synthetic */ Object clone() {
        vad vadVar = new vad();
        if (this.b == 0) {
            return vadVar;
        }
        vam vamVar = this.a;
        vamVar.getClass();
        vam vamVarB = vamVar.b();
        vadVar.a = vamVarB;
        vamVarB.g = vamVarB;
        vamVarB.f = vamVarB.g;
        for (vam vamVar2 = vamVar.f; vamVar2 != vamVar; vamVar2 = vamVar2.f) {
            vam vamVar3 = vamVarB.g;
            vamVar3.getClass();
            vamVar2.getClass();
            vamVar3.d(vamVar2.b());
        }
        vadVar.b = this.b;
        return vadVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.vap
    public final void close() {
    }

    @Override // defpackage.vae
    public final long d(vaf vafVar) {
        throw null;
    }

    @Override // defpackage.vap
    public final long e(vad vadVar, long j) {
        vam vamVarB;
        if (j < 0) {
            throw new IllegalArgumentException(mn.h(j, "byteCount < 0: "));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        long j3 = j > j2 ? j2 : j;
        if (this == vadVar) {
            throw new IllegalArgumentException("source == this");
        }
        ukc.T(j2, 0L, j3);
        long j4 = j3;
        for (long j5 = 0; j4 > j5; j5 = 0) {
            vam vamVar = this.a;
            vamVar.getClass();
            int i = vamVar.c;
            vamVar.getClass();
            int i2 = i - vamVar.b;
            int i3 = 0;
            if (j4 < i2) {
                vam vamVar2 = vadVar.a;
                vam vamVar3 = vamVar2 != null ? vamVar2.g : null;
                int i4 = (int) j4;
                if (vamVar3 != null && vamVar3.e) {
                    if ((vamVar3.c + j4) - (vamVar3.d ? 0 : vamVar3.b) <= 8192) {
                        vamVar.getClass();
                        vamVar.c(vamVar3, i4);
                        this.b -= j4;
                        vadVar.b += j4;
                        return j3;
                    }
                }
                vamVar.getClass();
                if (i4 > i2) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    vamVarB = vamVar.b();
                } else {
                    byte[] bArr = vamVar.a;
                    vam vamVarA = van.a();
                    byte[] bArr2 = vamVarA.a;
                    int i5 = vamVar.b;
                    rnt.au(bArr, bArr2, 0, i5, i5 + i4);
                    vamVarB = vamVarA;
                }
                vamVarB.c = vamVarB.b + i4;
                vamVar.b += i4;
                vam vamVar4 = vamVar.g;
                vamVar4.getClass();
                vamVar4.d(vamVarB);
                this.a = vamVarB;
            }
            vam vamVar5 = this.a;
            vamVar5.getClass();
            int i6 = vamVar5.c - vamVar5.b;
            this.a = vamVar5.a();
            vam vamVar6 = vadVar.a;
            if (vamVar6 == null) {
                vadVar.a = vamVar5;
                vamVar5.g = vamVar5;
                vamVar5.f = vamVar5.g;
            } else {
                vam vamVar7 = vamVar6.g;
                vamVar7.getClass();
                vamVar7.d(vamVar5);
                vam vamVar8 = vamVar5.g;
                if (vamVar8 == vamVar5) {
                    throw new IllegalStateException("cannot compact");
                }
                vamVar8.getClass();
                if (vamVar8.e) {
                    int i7 = vamVar5.c - vamVar5.b;
                    vamVar8.getClass();
                    int i8 = 8192 - vamVar8.c;
                    vamVar8.getClass();
                    if (!vamVar8.d) {
                        vamVar8.getClass();
                        i3 = vamVar8.b;
                    }
                    if (i7 <= i8 + i3) {
                        vamVar8.getClass();
                        vamVar5.c(vamVar8, i7);
                        vamVar5.a();
                        van.b(vamVar5);
                    }
                }
            }
            long j6 = i6;
            this.b -= j6;
            vadVar.b += j6;
            j4 -= j6;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vad)) {
            return false;
        }
        long j = this.b;
        vad vadVar = (vad) obj;
        if (j != vadVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        vam vamVar = this.a;
        vamVar.getClass();
        vam vamVar2 = vadVar.a;
        vamVar2.getClass();
        int i = vamVar.b;
        int i2 = vamVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(vamVar.c - i, vamVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (vamVar.a[i] != vamVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == vamVar.c) {
                vamVar = vamVar.f;
                vamVar.getClass();
                i = vamVar.b;
            }
            if (i2 == vamVar2.c) {
                vamVar2 = vamVar2.f;
                vamVar2.getClass();
                i2 = vamVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final String f(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(mn.h(j, "byteCount: "));
        }
        long j2 = this.b;
        if (j2 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        vam vamVar = this.a;
        vamVar.getClass();
        int i = vamVar.b;
        int i2 = vamVar.c;
        if (i + j > i2) {
            return new String(m(j), charset);
        }
        int i3 = (int) j;
        String str = new String(vamVar.a, i, i3, charset);
        int i4 = i + i3;
        vamVar.b = i4;
        this.b = j2 - j;
        if (i4 == i2) {
            this.a = vamVar.a();
            van.b(vamVar);
        }
        return str;
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    public final String g(long j) {
        return f(j, ulo.a);
    }

    public final vaf h(int i) {
        if (i == 0) {
            return vaf.a;
        }
        ukc.T(this.b, 0L, i);
        vam vamVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            vamVar.getClass();
            int i5 = vamVar.c;
            int i6 = vamVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            vamVar = vamVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        vam vamVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            vamVar2.getClass();
            bArr[i7] = vamVar2.a;
            i2 += vamVar2.c - vamVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = vamVar2.b;
            vamVar2.d = true;
            i7++;
            vamVar2 = vamVar2.f;
        }
        return new vao(bArr, iArr);
    }

    public final int hashCode() {
        vam vamVar = this.a;
        if (vamVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vamVar.c;
            for (int i3 = vamVar.b; i3 < i2; i3++) {
                i = (i * 31) + vamVar.a[i3];
            }
            vamVar = vamVar.f;
            vamVar.getClass();
        } while (vamVar != this.a);
        return i;
    }

    public final vam i(int i) {
        vam vamVar = this.a;
        if (vamVar == null) {
            vam vamVarA = van.a();
            this.a = vamVarA;
            vamVarA.g = vamVarA;
            vamVarA.f = vamVarA;
            return vamVarA;
        }
        vam vamVar2 = vamVar.g;
        vamVar2.getClass();
        if (vamVar2.c + i <= 8192 && vamVar2.e) {
            return vamVar2;
        }
        vam vamVarA2 = van.a();
        vamVar2.d(vamVarA2);
        return vamVarA2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j() {
        k(this.b);
    }

    public final void k(long j) {
        while (j > 0) {
            vam vamVar = this.a;
            if (vamVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, vamVar.c - vamVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = vamVar.b + iMin;
            vamVar.b = i;
            if (i == vamVar.c) {
                this.a = vamVar.a();
                van.b(vamVar);
            }
        }
    }

    @Override // defpackage.vae
    public final boolean l(long j) {
        throw null;
    }

    public final byte[] m(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iC = c(bArr, i2, i - i2);
            if (iC == -1) {
                throw new EOFException();
            }
            i2 += iC;
        }
        return bArr;
    }

    public final void n(vap vapVar) {
        while (vapVar.e(this, 8192L) != -1) {
        }
    }

    public final void o(int i) {
        vam vamVarI = i(1);
        byte[] bArr = vamVarI.a;
        int i2 = vamVarI.c;
        vamVarI.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final /* bridge */ /* synthetic */ void p() {
        o(34);
    }

    public final void q(int i) {
        vam vamVarI = i(4);
        byte[] bArr = vamVarI.a;
        int i2 = vamVarI.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        vamVarI.c = i2 + 4;
        this.b += 4;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        vam vamVar = this.a;
        if (vamVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), vamVar.c - vamVar.b);
        byteBuffer.put(vamVar.a, vamVar.b, iMin);
        int i = vamVar.b + iMin;
        vamVar.b = i;
        this.b -= iMin;
        if (i == vamVar.c) {
            this.a = vamVar.a();
            van.b(vamVar);
        }
        return iMin;
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return h((int) j).toString();
        }
        throw new IllegalStateException(mn.h(j, "size > Int.MAX_VALUE: "));
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            vam vamVarI = i(1);
            int i2 = 8192 - vamVarI.c;
            byte[] bArr = vamVarI.a;
            int iMin = Math.min(i, i2);
            byteBuffer.get(bArr, vamVarI.c, iMin);
            i -= iMin;
            vamVarI.c += iMin;
        }
        this.b += iRemaining;
        return iRemaining;
    }

    public final void r(String str, int i, int i2) {
        char cCharAt;
        str.getClass();
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        int i3 = i + 1;
                        char cCharAt2 = str.charAt(i);
                        if (cCharAt2 < 128) {
                            vam vamVarI = i(1);
                            byte[] bArr = vamVarI.a;
                            int i4 = vamVarI.c - i;
                            int iMin = Math.min(i2, 8192 - i4);
                            bArr[i + i4] = (byte) cCharAt2;
                            i = i3;
                            while (i < iMin) {
                                char cCharAt3 = str.charAt(i);
                                if (cCharAt3 >= 128) {
                                    break;
                                }
                                bArr[i + i4] = (byte) cCharAt3;
                                i++;
                            }
                            int i5 = vamVarI.c;
                            int i6 = (i4 + i) - i5;
                            vamVarI.c = i5 + i6;
                            this.b += i6;
                        } else {
                            if (cCharAt2 < 2048) {
                                vam vamVarI2 = i(2);
                                byte[] bArr2 = vamVarI2.a;
                                int i7 = vamVarI2.c;
                                bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                                vamVarI2.c = i7 + 2;
                                this.b += 2;
                            } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (i3 < i2) {
                                    cCharAt = str.charAt(i3);
                                } else {
                                    cCharAt = 0;
                                }
                                if (cCharAt2 <= 56319 && cCharAt >= 56320 && cCharAt < 57344) {
                                    vam vamVarI3 = i(4);
                                    byte[] bArr3 = vamVarI3.a;
                                    int i8 = vamVarI3.c;
                                    int i9 = (((cCharAt2 & 1023) << 10) | (cCharAt & 1023)) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                                    bArr3[i8] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i8 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i8 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i8 + 3] = (byte) ((i9 & 63) | 128);
                                    vamVarI3.c = i8 + 4;
                                    this.b += 4;
                                    i += 2;
                                } else {
                                    o(63);
                                }
                            } else {
                                vam vamVarI4 = i(3);
                                byte[] bArr4 = vamVarI4.a;
                                int i10 = vamVarI4.c;
                                bArr4[i10] = (byte) ((cCharAt2 >> '\f') | 224);
                                bArr4[i10 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                                bArr4[i10 + 2] = (byte) ((cCharAt2 & '?') | 128);
                                vamVarI4.c = i10 + 3;
                                this.b += 3;
                            }
                            i = i3;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            }
            throw new IllegalArgumentException(a.bu(i, i2, "endIndex < beginIndex: ", IQwwK.HtNyLgY));
        }
        throw new IllegalArgumentException(a.bv(i, "beginIndex < 0: "));
    }
}
