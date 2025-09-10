package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akq {
    public static final akk a = new akn();
    public static final akp b = new ako(0);
    public static final akp c = new ako(1);
    public static final akl d = new akj();

    public static final void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        float f = (i - i4) / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i7 = iArr[length];
            iArr2[length] = Math.round(f);
            f += i7;
        }
    }

    public static final void b(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        int i5 = i - i4;
        if (!z) {
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i8 = iArr[length];
            iArr2[length] = i5;
            i5 += i8;
        }
    }

    public static final akl c(float f) {
        return new akm(f, true, new ane(1));
    }

    public static final void d(int[] iArr, int[] iArr2) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < iArr.length) {
            int i4 = iArr[i];
            iArr2[i3] = i2;
            i2 += i4;
            i++;
            i3++;
        }
    }
}
