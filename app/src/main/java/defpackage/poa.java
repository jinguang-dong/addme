package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class poa implements poc {
    private static final sgv d = sgv.g("poa");
    public final int a;
    public final Rect b;
    public final int c;
    private final float e;
    private final PointF[] f;
    private final HashMap g;
    private final int h;

    public poa(int i, Rect rect, float f, int i2, int i3, byte[] bArr, float[] fArr) {
        this.a = i;
        this.b = rect;
        this.e = f;
        this.c = i2;
        int i4 = 2;
        if (i3 == 0) {
            this.h = i4;
        } else if (i3 == 1) {
            i4 = 3;
            this.h = i4;
        } else if (i3 != 2) {
            this.h = 1;
        } else {
            this.h = 1;
        }
        this.f = new PointF[bArr.length];
        this.g = new HashMap();
        for (int i5 = 0; i5 < bArr.length; i5++) {
            this.g.put(Byte.valueOf(bArr[i5]), Integer.valueOf(i5));
            int i6 = i5 + i5;
            this.f[i5] = new PointF(fArr[i6], fArr[i6 + 1]);
        }
    }

    @Override // defpackage.poc
    public final float a() {
        throw null;
    }

    @Override // defpackage.poc
    public final float b() {
        throw null;
    }

    @Override // defpackage.poc
    public final float c() {
        throw null;
    }

    @Override // defpackage.poc
    public final int d() {
        throw null;
    }

    @Override // defpackage.poc
    public final int e() {
        return Math.round(this.e);
    }

    @Override // defpackage.poc
    public final PointF f() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF g() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF h() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF i() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF j() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF k() {
        throw null;
    }

    @Override // defpackage.poc
    public final Rect l() {
        throw null;
    }

    public final PointF m(byte b) {
        HashMap map = this.g;
        Byte bValueOf = Byte.valueOf(b);
        if (map.containsKey(bValueOf)) {
            return this.f[((Integer) map.get(bValueOf)).intValue()];
        }
        throw new IllegalArgumentException(a.bE(b, "Landmark:", " not detected for this face."));
    }

    public final String toString() {
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(this.a);
        int i = this.h;
        return String.format(locale, "{ id: %d , type: %s, bounds: %s, score: %s}", numValueOf, i != 1 ? i != 2 ? "DOG" : "CAT" : "HUMAN", this.b, Integer.valueOf(e()));
    }

    public static List n(pnx pnxVar) {
        int i;
        int[] iArr;
        Rect rect;
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        Integer num = (Integer) pnxVar.a(nvq.r);
        int[] iArr2 = (int[]) pnxVar.a(nvq.s);
        int[] iArr3 = (int[]) pnxVar.a(nvq.q);
        int[] iArr4 = (int[]) pnxVar.a(nvq.v);
        byte[] bArr2 = (byte[]) pnxVar.a(nvq.t);
        byte[] bArr3 = (byte[]) pnxVar.a(nvq.u);
        int[] iArr5 = (int[]) pnxVar.a(nvj.m);
        byte[] bArr4 = (byte[]) pnxVar.a(nvj.n);
        float[] fArr = (float[]) pnxVar.a(nvj.o);
        float[] fArr2 = (float[]) pnxVar.a(nvj.p);
        float[] fArr3 = (float[]) pnxVar.a(nvj.q);
        if (num != null && num.intValue() > 0 && iArr2 != null && iArr3 != null && iArr4 != null && bArr2 != null && bArr3 != null && iArr5 != null && bArr4 != null && fArr != null && fArr2 != null && fArr3 != null) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < num.intValue()) {
                int i5 = iArr2[i2];
                Rect rect2 = new Rect();
                Integer num2 = num;
                int i6 = i3 + 4;
                int[] iArr6 = iArr2;
                int length = iArr3.length;
                if (i6 <= length) {
                    i = i6;
                    iArr = iArr3;
                    rect2.set(iArr3[i3], iArr3[i3 + 1], iArr[i3 + 2], iArr[i3 + 3]);
                } else {
                    i = i6;
                    iArr = iArr3;
                    ((sgt) d.c().M(5629)).t("faceRectangles length is too short: %d", length);
                }
                float f = iArr4[i2];
                byte b = bArr2[i2];
                byte b2 = bArr3[i2];
                int i7 = iArr5[i2];
                byte[] bArr5 = new byte[i7];
                int i8 = i7 + i7;
                float[] fArr4 = new float[i8];
                int[] iArr7 = iArr4;
                float[] fArr5 = new float[i7];
                byte[] bArr6 = bArr2;
                byte[] bArr7 = bArr3;
                float[] fArr6 = new float[3];
                int i9 = i4 + i7;
                int[] iArr8 = iArr5;
                int length2 = bArr4.length;
                if (i9 <= length2) {
                    rect = rect2;
                    System.arraycopy(bArr4, i4, bArr5, 0, i7);
                    bArr = bArr5;
                } else {
                    rect = rect2;
                    bArr = bArr5;
                    ((sgt) d.c().M(5630)).t("faceLandmarkIds length is too short: %d", length2);
                }
                int i10 = i9 + i9;
                int length3 = fArr.length;
                if (i10 <= length3) {
                    System.arraycopy(fArr, i4 + i4, fArr4, 0, i8);
                } else {
                    ((sgt) d.c().M(5631)).t("faceLandmarkXy length is too short: %d", length3);
                }
                int length4 = fArr2.length;
                if (i9 <= length4) {
                    System.arraycopy(fArr2, i4, fArr5, 0, i7);
                } else {
                    ((sgt) d.c().M(5632)).t("faceLandmarkDepth length is too short: %d", length4);
                }
                int i11 = i2 * 3;
                int i12 = i11 + 3;
                int length5 = fArr3.length;
                if (i12 <= length5) {
                    System.arraycopy(fArr3, i11, fArr6, 0, 3);
                } else {
                    ((sgt) d.c().M(5633)).t(JvFFEwFNdCrxf.rgdpbFqYkqfOJ, length5);
                }
                arrayList.add(new poa(i5, rect, f, b, b2, bArr, fArr4));
                i2++;
                i4 = i9;
                num = num2;
                iArr2 = iArr6;
                i3 = i;
                iArr3 = iArr;
                iArr4 = iArr7;
                bArr2 = bArr6;
                bArr3 = bArr7;
                iArr5 = iArr8;
            }
        }
        return arrayList;
    }
}
