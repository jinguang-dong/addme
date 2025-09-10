package j$.util;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class Base64 {

    public static class Encoder {
        public static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        public static final char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        public static final Encoder c = new Encoder();

        public byte[] encode(byte[] bArr) {
            int length = ((bArr.length + 2) / 3) * 4;
            byte[] bArr2 = new byte[length];
            int length2 = bArr.length;
            int i = (length2 / 3) * 3;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                char[] cArr = a;
                if (i2 >= i) {
                    if (i2 < length2) {
                        int i4 = i2 + 1;
                        int i5 = bArr[i2] & 255;
                        int i6 = i3 + 1;
                        bArr2[i3] = (byte) cArr[i5 >> 2];
                        if (i4 == length2) {
                            bArr2[i6] = (byte) cArr[(i5 << 4) & 63];
                            int i7 = i3 + 3;
                            bArr2[i3 + 2] = 61;
                            i3 += 4;
                            bArr2[i7] = 61;
                        } else {
                            int i8 = bArr[i4] & 255;
                            bArr2[i6] = (byte) cArr[((i5 << 4) & 63) | (i8 >> 4)];
                            int i9 = i3 + 3;
                            bArr2[i3 + 2] = (byte) cArr[(i8 << 2) & 63];
                            i3 += 4;
                            bArr2[i9] = 61;
                        }
                    }
                    return i3 != length ? Arrays.copyOf(bArr2, i3) : bArr2;
                }
                int iMin = Math.min(i2 + i, i);
                int i10 = i2;
                int i11 = i3;
                while (i10 < iMin) {
                    int i12 = i10 + 2;
                    int i13 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
                    i10 += 3;
                    int i14 = i13 | (bArr[i12] & 255);
                    bArr2[i11] = (byte) cArr[(i14 >>> 18) & 63];
                    bArr2[i11 + 1] = (byte) cArr[(i14 >>> 12) & 63];
                    int i15 = i11 + 3;
                    bArr2[i11 + 2] = (byte) cArr[(i14 >>> 6) & 63];
                    i11 += 4;
                    bArr2[i15] = (byte) cArr[i14 & 63];
                }
                int i16 = ((iMin - i2) / 3) * 4;
                i3 += i16;
                if (i16 == -1 && iMin < length2) {
                    throw null;
                }
                i2 = iMin;
            }
        }
    }

    public static Decoder getDecoder() {
        return Decoder.c;
    }

    public static Encoder getEncoder() {
        return Encoder.c;
    }

    public static class Decoder {
        public static final int[] a;
        public static final int[] b;
        public static final Decoder c;

        static {
            int[] iArr = new int[256];
            a = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < 64; i++) {
                a[Encoder.a[i]] = i;
            }
            a[61] = -2;
            int[] iArr2 = new int[256];
            b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < 64; i2++) {
                b[Encoder.b[i2]] = i2;
            }
            b[61] = -2;
            c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
        
            if (r9 != 18) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
        
            if (r9 != 6) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0106, code lost:
        
            r5[r10] = (byte) (r11 >> 16);
            r10 = r10 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0111, code lost:
        
            if (r9 != 0) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
        
            r0 = r10 + 1;
            r5[r10] = (byte) (r11 >> 16);
            r10 = r10 + 2;
            r5[r0] = (byte) (r11 >> 8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
        
            if (r9 == 12) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
        
            if (r8 < r6) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0128, code lost:
        
            if (r10 == r1) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
        
            return java.util.Arrays.copyOf(r5, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x012f, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0143, code lost:
        
            throw new java.lang.IllegalArgumentException("Input byte array has incorrect ending byte at " + r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x014b, code lost:
        
            throw new java.lang.IllegalArgumentException("Last unit does not have enough valid bits");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public byte[] decode(byte[] r21) {
            /*
                Method dump skipped, instructions count: 340
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.Base64.Decoder.decode(byte[]):byte[]");
        }

        public byte[] decode(String str) {
            return decode(str.getBytes(j$.sun.nio.cs.c.a));
        }
    }
}
