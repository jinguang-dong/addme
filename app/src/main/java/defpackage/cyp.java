package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyp {
    public static final /* synthetic */ int e = 0;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int f;

    static {
        cza.g(0);
        cza.g(1);
        cza.g(2);
        cza.g(3);
        cza.g(4);
        cza.g(5);
    }

    public cyp(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public static int a(int i) {
        if (i != 2) {
            return i != 6 ? 1 : 9;
        }
        return 5;
    }

    public static int b(int i) {
        if (i != 2) {
            return i != 6 ? 1 : 9;
        }
        return 6;
    }

    public static int c(int i) {
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 13;
        }
        if (i != 6) {
            return i != 7 ? 1 : 18;
        }
        return 16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyp cypVar = (cyp) obj;
            if (this.a == cypVar.a && this.b == cypVar.b && this.c == cypVar.c && Arrays.equals(this.d, cypVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) - 1) * 31) - 1;
        this.f = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i = this.a;
        String strBv = i != -1 ? i != 6 ? i != 1 ? i != 2 ? a.bv(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
        int i2 = this.b;
        String strBv2 = i2 != -1 ? i2 != 1 ? i2 != 2 ? a.bv(i2, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
        int i3 = this.c;
        return "ColorInfo(" + strBv + ", " + strBv2 + ", " + (i3 != -1 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 6 ? i3 != 7 ? a.bv(i3, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Unset color transfer") + ", " + (this.d != null) + ", NA, NA)";
    }
}
