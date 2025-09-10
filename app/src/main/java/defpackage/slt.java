package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class slt extends sld implements Serializable {
    public static final slj a = new slt();
    private static final long serialVersionUID = 0;
    private final int b = 0;
    private final boolean c = true;

    static {
        int i = slm.a;
    }

    public static int f(byte[] bArr, int i) {
        return ske.ab(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    public static int g(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    public static int h(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    public static sli i(int i, int i2) {
        int i3 = sli.b;
        int i4 = i ^ i2;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return new slh(i6 ^ (i6 >>> 16));
    }

    @Override // defpackage.sld, defpackage.slj
    public final sli b(CharSequence charSequence, Charset charset) {
        long j;
        char c;
        int i;
        char c2;
        long j2;
        if (!charset.equals(StandardCharsets.UTF_8)) {
            return a(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int iG = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + 4;
            j = 0;
            c = 128;
            if (i5 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i3);
            char cCharAt2 = charSequence.charAt(i3 + 1);
            char cCharAt3 = charSequence.charAt(i3 + 2);
            char cCharAt4 = charSequence.charAt(i3 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iG = g(iG, h((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i4 += 4;
            i3 = i5;
        }
        while (i3 < length) {
            char cCharAt5 = charSequence.charAt(i3);
            if (cCharAt5 < c) {
                j2 = j | (cCharAt5 << i2);
                i4++;
                i2 += 8;
                i = length;
                c2 = c;
            } else {
                if (cCharAt5 < 2048) {
                    j2 = j | (((((cCharAt5 & '?') | c) << 8) | ((cCharAt5 >>> 6) | 192)) << i2);
                    i4 += 2;
                    i2 += 16;
                    i = length;
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    i = length;
                    int i6 = i2;
                    c2 = 128;
                    j2 = j | (((((cCharAt5 & '?') | 128) << 16) | (((cCharAt5 >>> '\f') | 224) | ((((cCharAt5 >>> 6) & 63) | 128) << 8))) << i6);
                    i4 += 3;
                    i2 = i6 + 24;
                } else {
                    if (Character.codePointAt(charSequence, i3) == cCharAt5) {
                        return a(charSequence.toString().getBytes(charset));
                    }
                    i = length;
                    int i7 = i2;
                    j2 = j | ((((((r11 >>> 18) | 240) | ((((r11 >>> 12) & 63) | 128) << 8)) | ((((r11 >>> 6) & 63) | 128) << 16)) | (((r11 & 63) | 128) << 24)) << i7);
                    i4 += 4;
                    i2 = i7 + 32;
                    i3++;
                }
                c2 = 128;
            }
            if (i2 >= 32) {
                iG = g(iG, h((int) j2));
                j2 >>>= 32;
                i2 -= 32;
            }
            j = j2;
            i3++;
            c = c2;
            length = i;
        }
        return i(h((int) j) ^ iG, i4);
    }

    @Override // defpackage.sld
    public final sli d(byte[] bArr, int i) {
        int i2 = 0;
        rnt.K(0, i, bArr.length);
        int i3 = 0;
        int iG = 0;
        while (true) {
            int i4 = i3 + 4;
            if (i4 > i) {
                break;
            }
            iG = g(iG, h(f(bArr, i3)));
            i3 = i4;
        }
        int i5 = 0;
        while (i3 < i) {
            i2 ^= (bArr[i3] & 255) << i5;
            i3++;
            i5 += 8;
        }
        return i(h(i2) ^ iG, i);
    }

    @Override // defpackage.slj
    public final slk e() {
        return new sls();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof slt)) {
            return false;
        }
        slt sltVar = (slt) obj;
        int i = sltVar.b;
        boolean z = sltVar.c;
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_32(0)";
    }
}
