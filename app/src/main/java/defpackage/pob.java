package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pob implements poc {
    private static final sgv j = sgv.g("pob");
    private static final pny k;
    public final int a;
    public final Rect b;
    public final int c;
    public final PointF[] d;
    public final float e;
    public final float f;
    public final float g;
    public final HashMap h;
    public final int i;
    private final float l;

    static {
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        k = new pny(Optional.ofNullable(CaptureResult.STATISTICS_FACES), Optional.ofNullable(nvj.m), Optional.ofNullable(nvj.n), Optional.ofNullable(nvj.o), Optional.ofNullable(nvj.p), Optional.ofNullable(nvj.q), Optional.ofNullable(nvq.r), Optional.ofNullable(nvq.s), Optional.ofNullable(nvq.q), Optional.ofNullable(nvq.v), Optional.ofNullable(nvq.t), Optional.ofNullable(nvq.u));
    }

    public pob(int i, Rect rect, float f, int i2, int i3, byte[] bArr, float[] fArr, float[] fArr2) {
        this.a = i;
        this.b = rect;
        this.l = f;
        this.c = i2;
        if (i3 == 0) {
            this.i = 2;
        } else if (i3 == 1) {
            this.i = 3;
        } else if (i3 != 2) {
            this.i = 1;
        } else {
            this.i = 1;
        }
        this.d = new PointF[bArr.length];
        this.h = new HashMap();
        for (int i4 = 0; i4 < bArr.length; i4++) {
            this.h.put(Byte.valueOf(bArr[i4]), Integer.valueOf(i4));
            int i5 = i4 + i4;
            this.d[i4] = new PointF(fArr[i5], fArr[i5 + 1]);
        }
        this.e = fArr2[0];
        this.f = fArr2[1];
        this.g = fArr2[2];
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v7, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v9, types: [sgt, shi] */
    public static List n(pnx pnxVar) {
        pny pnyVar = k;
        ArrayList arrayList = new ArrayList();
        Optional optional = pnyVar.a;
        Face[] faceArr = optional.isPresent() ? (Face[]) pnxVar.a((CaptureResult.Key) optional.get()) : null;
        Optional optional2 = pnyVar.g;
        pnxVar.getClass();
        Integer num = (Integer) optional2.map(new gwl(pnxVar, 6)).orElse(null);
        int i = 8;
        int[] iArr = (int[]) pnyVar.h.map(new gwl(pnxVar, i)).orElse(null);
        int[] iArr2 = (int[]) pnyVar.i.map(new gwl(pnxVar, i)).orElse(null);
        int[] iArr3 = (int[]) pnyVar.j.map(new gwl(pnxVar, i)).orElse(null);
        int i2 = 9;
        byte[] bArr = (byte[]) pnyVar.k.map(new gwl(pnxVar, i2)).orElse(null);
        byte[] bArr2 = (byte[]) pnyVar.l.map(new gwl(pnxVar, i2)).orElse(null);
        int[] iArr4 = (int[]) pnyVar.b.map(new gwl(pnxVar, i)).orElse(null);
        byte[] bArr3 = (byte[]) pnyVar.c.map(new gwl(pnxVar, i2)).orElse(null);
        int i3 = 7;
        float[] fArr = (float[]) pnyVar.d.map(new gwl(pnxVar, i3)).orElse(null);
        float[] fArr2 = (float[]) pnyVar.e.map(new gwl(pnxVar, i3)).orElse(null);
        float[] fArr3 = (float[]) pnyVar.f.map(new gwl(pnxVar, i3)).orElse(null);
        int length = faceArr == null ? 0 : faceArr.length;
        int iIntValue = num == null ? 0 : num.intValue();
        int i4 = length + iIntValue;
        if (i4 != 0) {
            if (faceArr == null || iArr4 == null || bArr3 == null || fArr == null || fArr2 == null || fArr3 == null) {
                ((sgt) ((sgt) j.c().g((char) 1, TimeUnit.SECONDS)).M((char) 5634)).s("Face detection is not supported.");
                return arrayList;
            }
            int length2 = iArr4.length;
            if (length2 != i4) {
                ((sgt) ((sgt) j.c().g(1, TimeUnit.SECONDS)).M(5635)).w("Expected %d landmark counts, but only got %d.", i4, length2);
                return arrayList;
            }
            Face[] faceArr2 = faceArr;
            int i5 = 0;
            for (int i6 : iArr4) {
                i5 += i6;
            }
            int length3 = bArr3.length;
            if (length3 != i5) {
                ((sgt) ((sgt) j.c().g(1, TimeUnit.SECONDS)).M(5646)).G("Expected %d landmark IDs, but only got %d for %d faces.", Integer.valueOf(i5), Integer.valueOf(length3), Integer.valueOf(i4));
                return arrayList;
            }
            int i7 = i5 + i5;
            int length4 = fArr.length;
            if (length4 != i7) {
                ((sgt) ((sgt) j.c().g(1, TimeUnit.SECONDS)).M(5645)).G("Expected %d landmark coordinates, but only got %d for %d landmarks.", Integer.valueOf(i7), Integer.valueOf(length4), Integer.valueOf(i5));
                return arrayList;
            }
            int length5 = fArr2.length;
            if (length5 != i5) {
                ((sgt) ((sgt) j.c().g(1, TimeUnit.SECONDS)).M(5644)).w("Expected %d landmark depths, but only got %d.", i5, length5);
                return arrayList;
            }
            int i8 = i4 * 3;
            int length6 = fArr3.length;
            if (length6 != i8) {
                sgt sgtVar = (sgt) ((sgt) j.c().g(1, TimeUnit.SECONDS)).M(5636);
                Integer numValueOf = Integer.valueOf(i8);
                sgtVar.G("Expected %d face orientations, but only got %d for %d faces.", numValueOf, Integer.valueOf(length6), numValueOf);
                return arrayList;
            }
            int i9 = 0;
            int i10 = 0;
            while (i9 < length) {
                int i11 = iArr4[i9];
                int i12 = i9;
                byte[] bArr4 = new byte[i11];
                int[] iArr5 = iArr4;
                int i13 = i11 + i11;
                int i14 = length;
                float[] fArr4 = new float[i13];
                int[] iArr6 = iArr3;
                float[] fArr5 = new float[3];
                System.arraycopy(bArr3, i10, bArr4, 0, i11);
                System.arraycopy(fArr, i10 + i10, fArr4, 0, i13);
                System.arraycopy(fArr2, i10, new float[i11], 0, i11);
                System.arraycopy(fArr3, i12 * 3, fArr5, 0, 3);
                i10 += i11;
                arrayList.add(new pob(faceArr2[i12].getId(), faceArr2[i12].getBounds(), faceArr2[i12].getScore(), 0, 2, bArr4, fArr4, fArr5));
                i9 = i12 + 1;
                iArr4 = iArr5;
                length = i14;
                bArr2 = bArr2;
                bArr = bArr;
                iArr3 = iArr6;
            }
            int[] iArr7 = iArr4;
            int[] iArr8 = iArr3;
            byte[] bArr5 = bArr;
            byte[] bArr6 = bArr2;
            int i15 = length;
            if (iIntValue <= 0) {
                ((sgt) ((sgt) j.c().g((char) 1, TimeUnit.SECONDS)).M((char) 5637)).s("Pet and BoH faces are not supported.");
                return arrayList;
            }
            if (iArr == null || iArr2 == null || iArr8 == null || bArr5 == null || bArr6 == null) {
                ((sgt) ((sgt) j.c().g((char) 1, TimeUnit.SECONDS)).M((char) 5638)).s("Pet and BoH faces are not supported.");
                return arrayList;
            }
            int length7 = iArr.length;
            if (length7 != iIntValue) {
                sgt sgtVar2 = (sgt) ((sgt) j.c().g(1, TimeUnit.SECONDS)).M(5643);
                Integer numValueOf2 = Integer.valueOf(iIntValue);
                sgtVar2.G("Expected %d face IDs, but only got %d for %d otherfaces.", numValueOf2, Integer.valueOf(length7), numValueOf2);
                return arrayList;
            }
            int i16 = iIntValue * 4;
            int length8 = iArr2.length;
            if (length8 != i16) {
                ((sgt) ((sgt) j.c().g(1, TimeUnit.SECONDS)).M(5642)).G("Expected %d face rectangles coordinates, but only got %d for %d otherfaces.", Integer.valueOf(i16), Integer.valueOf(length8), Integer.valueOf(iIntValue));
                return arrayList;
            }
            int[] iArr9 = iArr8;
            int length9 = iArr9.length;
            if (length9 != iIntValue) {
                ((sgt) ((sgt) j.c().g(1, TimeUnit.SECONDS)).M(5641)).w("Expected %d face scores, but only got %d.", iIntValue, length9);
                return arrayList;
            }
            int length10 = bArr5.length;
            if (length10 != iIntValue) {
                ((sgt) ((sgt) j.c().g(1, TimeUnit.SECONDS)).M(5640)).w("Expected %d isBoH, but only got %d.", iIntValue, length10);
                return arrayList;
            }
            int length11 = bArr6.length;
            if (length11 != iIntValue) {
                ((sgt) ((sgt) j.c().g(1, TimeUnit.SECONDS)).M(5639)).w("Expected %d face types, but only got %d.", iIntValue, length11);
                return arrayList;
            }
            int i17 = 0;
            int i18 = 0;
            while (i17 < iIntValue) {
                int i19 = iArr[i17];
                Rect rect = new Rect();
                int i20 = i17;
                int i21 = i18;
                int i22 = iIntValue;
                rect.set(iArr2[i18], iArr2[i18 + 1], iArr2[i18 + 2], iArr2[i21 + 3]);
                float f = iArr9[i20];
                byte b = bArr5[i20];
                byte b2 = bArr6[i20];
                int i23 = i15 + i20;
                int i24 = iArr7[i23];
                byte[] bArr7 = new byte[i24];
                int i25 = i24 + i24;
                int[] iArr10 = iArr;
                float[] fArr6 = new float[i25];
                int[] iArr11 = iArr9;
                float[] fArr7 = new float[3];
                System.arraycopy(bArr3, i10, bArr7, 0, i24);
                System.arraycopy(fArr, i10 + i10, fArr6, 0, i25);
                System.arraycopy(fArr2, i10, new float[i24], 0, i24);
                System.arraycopy(fArr3, i23 * 3, fArr7, 0, 3);
                i10 += i24;
                arrayList.add(new pob(i19, rect, f, b, b2, bArr7, fArr6, fArr7));
                i17 = i20 + 1;
                i18 = i21 + 4;
                iIntValue = i22;
                iArr = iArr10;
                iArr2 = iArr2;
                iArr9 = iArr11;
            }
        }
        return arrayList;
    }

    @Override // defpackage.poc
    public final float a() {
        return this.f;
    }

    @Override // defpackage.poc
    public final float b() {
        return this.g;
    }

    @Override // defpackage.poc
    public final float c() {
        return this.e;
    }

    @Override // defpackage.poc
    public final int d() {
        return this.a;
    }

    @Override // defpackage.poc
    public final int e() {
        return Math.round(this.l);
    }

    @Override // defpackage.poc
    public final PointF f() {
        return m((byte) 5);
    }

    @Override // defpackage.poc
    public final PointF g() {
        return m((byte) 1);
    }

    @Override // defpackage.poc
    public final PointF h() {
        return m((byte) 4);
    }

    @Override // defpackage.poc
    public final PointF i() {
        return m((byte) 3);
    }

    @Override // defpackage.poc
    public final PointF j() {
        return m((byte) 6);
    }

    @Override // defpackage.poc
    public final PointF k() {
        return m((byte) 2);
    }

    @Override // defpackage.poc
    public final Rect l() {
        return this.b;
    }

    public final PointF m(byte b) {
        HashMap map = this.h;
        Byte bValueOf = Byte.valueOf(b);
        if (map.containsKey(bValueOf)) {
            return this.d[((Integer) map.get(bValueOf)).intValue()];
        }
        throw new IllegalArgumentException(a.bE(b, "Landmark:", " not detected for this face."));
    }

    public final String toString() {
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(this.a);
        int i = this.i;
        return String.format(locale, "{ id: %d , type: %s, boh: %d, bounds: %s, score: %s}", numValueOf, i != 1 ? i != 2 ? "DOG" : "CAT" : "HUMAN", Integer.valueOf(this.c), this.b, Integer.valueOf(e()));
    }
}
