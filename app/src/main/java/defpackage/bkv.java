package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class bkv {
    public static final long a = bko.j(4278190080L);
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public final long g;

    static {
        bko.j(4282664004L);
        bko.j(4287137928L);
        bko.j(4291611852L);
        b = bko.j(4294967295L);
        c = bko.j(4294901760L);
        bko.j(4278255360L);
        d = bko.j(4278190335L);
        bko.j(4294967040L);
        bko.j(4278255615L);
        bko.j(4294902015L);
        e = bko.i(0);
        float[] fArr = bmb.a;
        f = bko.k(0.0f, 0.0f, 0.0f, 0.0f, bmb.u);
    }

    public /* synthetic */ bkv(long j) {
        this.g = j;
    }

    public static final float a(long j) {
        float fAL;
        float f2;
        if ((63 & j) == 0) {
            fAL = (float) rnt.aL(j >>> 56);
            f2 = 255.0f;
        } else {
            fAL = (float) rnt.aL((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fAL / f2;
    }

    public static final float b(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) rnt.aL((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + ScriptIntrinsicBLAS.TRANSPOSE;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - bkz.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float c(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) rnt.aL((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + ScriptIntrinsicBLAS.TRANSPOSE;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - bkz.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float d(long j) {
        int i;
        int i2;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) rnt.aL(j3 & 255)) / 255.0f;
        }
        short s = (short) j3;
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + ScriptIntrinsicBLAS.TRANSPOSE;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - bkz.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final long e(long j, blz blzVar) {
        bme bmeVarX;
        blz blzVarF = f(j);
        int i = blzVarF.c;
        int i2 = blzVar.c;
        if ((i | i2) < 0) {
            bmeVarX = byi.X(blzVarF, blzVar);
        } else {
            int i3 = i | (i2 << 6);
            yq yqVar = bmf.a;
            Object objA = yqVar.a(i3);
            if (objA == null) {
                objA = byi.X(blzVarF, blzVar);
                yqVar.f(i3, objA);
            }
            bmeVarX = (bme) objA;
        }
        return bmeVarX.a(j);
    }

    public static final blz f(long j) {
        float[] fArr = bmb.a;
        return bmb.y[(int) (j & 63)];
    }

    public static String g(long j) {
        return "Color(" + d(j) + ", " + c(j) + ", " + b(j) + ", " + a(j) + ", " + f(j).a + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bkv) && this.g == ((bkv) obj).g;
    }

    public final int hashCode() {
        return a.r(this.g);
    }

    public final String toString() {
        return g(this.g);
    }
}
