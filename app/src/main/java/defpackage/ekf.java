package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ekf implements eky {
    private int a;

    public ekf(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [float[]] */
    /* JADX WARN: Type inference failed for: r2v7, types: [float[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.eky
    public final /* bridge */ /* synthetic */ Object a(elb elbVar, float f) {
        int i;
        char c;
        Object obj;
        int iArgb;
        float f2;
        int iArgb2;
        float f3;
        ArrayList arrayList = new ArrayList();
        int iP = elbVar.p();
        if (iP == 1) {
            elbVar.g();
        }
        while (elbVar.n()) {
            arrayList.add(Float.valueOf((float) elbVar.a()));
        }
        int i2 = 2;
        char c2 = 0;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.a = 2;
        }
        if (iP == 1) {
            elbVar.i();
        }
        int size = this.a;
        if (size == -1) {
            size = arrayList.size() / 4;
            this.a = size;
        }
        float[] fArr = new float[size];
        int[] iArr = new int[size];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = this.a * 4;
            if (i3 >= i) {
                break;
            }
            int i6 = i3 / 4;
            double dFloatValue = ((Float) arrayList.get(i3)).floatValue();
            int i7 = i3 % 4;
            if (i7 == 0) {
                float f4 = (float) dFloatValue;
                if (i6 <= 0 || fArr[i6 - 1] < f4) {
                    fArr[i6] = f4;
                } else {
                    fArr[i6] = f4 + 0.01f;
                }
            } else if (i7 == 1) {
                i4 = (int) (dFloatValue * 255.0d);
            } else if (i7 == 2) {
                i5 = (int) (dFloatValue * 255.0d);
            } else if (i7 == 3) {
                iArr[i6] = Color.argb(255, i4, i5, (int) (dFloatValue * 255.0d));
            }
            i3++;
        }
        jod jodVar = new jod(fArr, iArr);
        if (arrayList.size() <= i) {
            return jodVar;
        }
        float[] fArrCopyOf = jodVar.a;
        Object obj2 = jodVar.b;
        int size2 = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size2];
        float[] fArr3 = new float[size2];
        int i8 = 0;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i8] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i8] = ((Float) arrayList.get(i)).floatValue();
                i8++;
            }
            i++;
        }
        float[] fArr4 = (float[]) fArrCopyOf;
        int length = fArr4.length;
        if (length == 0) {
            fArrCopyOf = fArr2;
        } else if (size2 != 0) {
            int i9 = length + size2;
            fArrCopyOf = new float[i9];
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                float f5 = i11 < fArr4.length ? fArr4[i11] : Float.NaN;
                float f6 = i12 < size2 ? fArr2[i12] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArrCopyOf[i13] = f5;
                    i11++;
                } else {
                    i12++;
                    if (Float.isNaN(f5) || f6 < f5) {
                        fArrCopyOf[i13] = f6;
                    } else {
                        i11++;
                        fArrCopyOf[i13] = f5;
                        i10++;
                    }
                }
            }
            if (i10 != 0) {
                fArrCopyOf = Arrays.copyOf((float[]) fArrCopyOf, i9 - i10);
            }
        }
        float[] fArr5 = fArrCopyOf;
        int length2 = fArr5.length;
        int[] iArr2 = new int[length2];
        int i14 = 0;
        while (i14 < length2) {
            float f7 = fArr5[i14];
            int iBinarySearch = Arrays.binarySearch(fArr4, f7);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f7);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                c = c2;
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f8 = fArr3[iBinarySearch2];
                int[] iArr3 = (int[]) obj2;
                if (iArr3.length < i2 || f7 == fArr4[c]) {
                    obj = obj2;
                    iArgb = iArr3[c];
                } else {
                    int i15 = 1;
                    while (true) {
                        int length3 = fArr4.length;
                        if (i15 >= length3) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f2 = fArr4[i15];
                        if (f2 >= f7 || i15 == length3 - 1) {
                            break;
                        }
                        i15++;
                    }
                    int i16 = i15 - 1;
                    float f9 = fArr4[i16];
                    float f10 = f2 - f9;
                    float f11 = f7 - f9;
                    int i17 = iArr3[i15];
                    int i18 = iArr3[i16];
                    float f12 = f11 / f10;
                    obj = obj2;
                    iArgb = Color.argb((int) (f8 * 255.0f), AmbientMode.AmbientCallback.u(f12, Color.red(i18), Color.red(i17)), AmbientMode.AmbientCallback.u(f12, Color.green(i18), Color.green(i17)), AmbientMode.AmbientCallback.u(f12, Color.blue(i18), Color.blue(i17)));
                }
                iArr2[i14] = iArgb;
            } else {
                int i19 = ((int[]) obj2)[iBinarySearch];
                if (size2 >= i2 && f7 > fArr2[c2]) {
                    int i20 = 1;
                    while (i20 < size2) {
                        float f13 = fArr2[i20];
                        if (f13 < f7) {
                            c = c2;
                            if (i20 != size2 - 1) {
                                i20++;
                                c2 = c;
                            }
                        } else {
                            c = c2;
                        }
                        if (f13 <= f7) {
                            f3 = fArr3[i20];
                        } else {
                            int i21 = i20 - 1;
                            float f14 = fArr2[i21];
                            float f15 = f13 - f14;
                            float f16 = f7 - f14;
                            float f17 = fArr3[i21];
                            float f18 = fArr3[i20];
                            PointF pointF = eli.a;
                            f3 = f17 + ((f16 / f15) * (f18 - f17));
                        }
                        iArgb2 = Color.argb((int) (f3 * 255.0f), Color.red(i19), Color.green(i19), Color.blue(i19));
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                c = c2;
                iArgb2 = Color.argb((int) (fArr3[c] * 255.0f), Color.red(i19), Color.green(i19), Color.blue(i19));
                iArr2[i14] = iArgb2;
                obj = obj2;
            }
            i14++;
            obj2 = obj;
            c2 = c;
            i2 = 2;
        }
        return new jod(fArrCopyOf, iArr2);
    }
}
