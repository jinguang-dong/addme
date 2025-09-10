package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yi {
    public float[] a;
    public int b;

    public yi(int i) {
        this.a = i == 0 ? yk.a : new float[i];
    }

    public static /* synthetic */ String d(yi yiVar, CharSequence charSequence, CharSequence charSequence2, int i) {
        String str = 1 != (i & 1) ? null : ", ";
        str.getClass();
        if ((i & 2) != 0) {
            charSequence = "";
        }
        charSequence.getClass();
        if ((i & 4) != 0) {
            charSequence2 = "";
        }
        charSequence2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        float[] fArr = yiVar.a;
        int i2 = yiVar.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append(charSequence2);
                break;
            }
            float f = fArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) str);
            }
            sb.append(f);
            i3++;
        }
        return sb.toString();
    }

    public final float a(int i) {
        if (i < 0 || i >= this.b) {
            a.bn("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final float b() {
        if (this.b == 0) {
            a.bo("FloatList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final void c(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        int length = fArr.length;
        if (length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i, (length * 3) / 2));
            fArrCopyOf.getClass();
            this.a = fArrCopyOf;
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yi) {
            yi yiVar = (yi) obj;
            int i = yiVar.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = yiVar.a;
                ukv ukvVarU = ukc.u(0, i2);
                int i3 = ukvVarU.a;
                int i4 = ukvVarU.b;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int iFloatToIntBits = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iFloatToIntBits += Float.floatToIntBits(fArr[i2]) * 31;
        }
        return iFloatToIntBits;
    }

    public final String toString() {
        return d(this, "[", "]", 25);
    }

    public yi() {
        this(16);
    }
}
