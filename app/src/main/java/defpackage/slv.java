package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class slv {
    public final String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    public final boolean g;
    private final byte[] h;
    private final boolean[] i;

    /* JADX WARN: Illegal instructions before constructor call */
    public slv(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            rnt.C(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            rnt.C(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    final char a(int i) {
        return this.b[i];
    }

    final int b(char c) throws sly {
        if (c > 127) {
            throw new sly("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.h[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new sly("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new sly("Unrecognized character: " + c);
    }

    public final slv c() {
        if (this.g) {
            return this;
        }
        byte[] bArr = this.h;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i = 65; i <= 90; i++) {
            int i2 = i | 32;
            byte b = bArr[i];
            byte b2 = bArr[i2];
            if (b == -1) {
                bArrCopyOf[i] = b2;
            } else {
                char c = (char) i;
                char c2 = (char) i2;
                if (b2 != -1) {
                    throw new IllegalStateException(rnt.z("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                }
                bArrCopyOf[i2] = b;
            }
        }
        String str = this.a;
        return new slv(str.concat(".ignoreCase()"), this.b, bArrCopyOf, true);
    }

    public final boolean d() {
        int i = 0;
        while (true) {
            char[] cArr = this.b;
            if (i >= cArr.length) {
                return false;
            }
            if (rup.f(cArr[i])) {
                return true;
            }
            i++;
        }
    }

    public final boolean e() {
        int i = 0;
        while (true) {
            char[] cArr = this.b;
            if (i >= cArr.length) {
                return false;
            }
            if (rup.g(cArr[i])) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof slv) {
            slv slvVar = (slv) obj;
            if (this.g == slvVar.g && Arrays.equals(this.b, slvVar.b)) {
                return true;
            }
        }
        return false;
    }

    final boolean f(int i) {
        return this.i[i % this.e];
    }

    public final boolean g(char c) {
        byte[] bArr = this.h;
        return c < bArr.length && bArr[c] != -1;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        return this.a;
    }

    private slv(String str, char[] cArr, byte[] bArr, boolean z) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            int iAr = ske.ar(length, RoundingMode.UNNECESSARY);
            this.d = iAr;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iAr);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.e = i;
            this.f = iAr >> iNumberOfTrailingZeros;
            this.c = length - 1;
            this.h = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                zArr[ske.aq(i2 * 8, this.d, RoundingMode.CEILING)] = true;
            }
            this.i = zArr;
            this.g = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }
}
