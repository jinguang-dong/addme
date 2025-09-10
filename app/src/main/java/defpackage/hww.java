package defpackage;

import android.graphics.Rect;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hww {
    public static final sgv a = sgv.g("hww");
    public final inu b;
    public final int c;
    public final pas d;
    public final Object e = new Object();
    public final AtomicReference f = new AtomicReference();
    private final inz g;
    private final SizeF h;
    private final pas i;
    private final float j;
    private final Set k;

    public hww(SizeF sizeF, pas pasVar, pas pasVar2, int i, inu inuVar, inz inzVar, Set set) {
        a.I(true);
        this.h = sizeF;
        this.d = pasVar;
        this.i = pasVar2;
        this.c = i;
        this.b = inuVar;
        this.g = inzVar;
        this.k = set;
        float width = sizeF.getWidth() / sizeF.getHeight();
        float f = pasVar.a / pasVar.b;
        this.j = ((f / width) - 1.0f) / ((f + f) / width);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.f.set(arrayList);
    }

    public static long d(long j, long j2, long j3) {
        return j + ((j2 + j3) / 2);
    }

    public final float a(float f, float f2, float[] fArr) {
        return (((1.0f / ((1.0f / f) - (f2 / 1000.0f))) * this.d.a) / this.h.getWidth()) * (fArr[0] + fArr[1]) * 0.5f;
    }

    public final long b(long j, float[] fArr) {
        float f = this.j;
        return (long) ((j * (1.0f - (f + f))) / fArr[1]);
    }

    public final long c(long j, long j2, float[] fArr) {
        if (j <= 0) {
            return j;
        }
        float f = j2;
        return j + ((long) (this.j * f)) + ((long) ((0.5f - (0.5f / fArr[1])) * f));
    }

    public final float[] e(String str, long j, long j2, long j3, pas pasVar, float[] fArr, boolean z) {
        float[] fArrB = {0.0f, 0.0f};
        if ((str == null || !this.k.contains(str)) && j >= 0) {
            long jD = d(j, j2, j3);
            fArrB = z ? this.g.b(jD, j3) : this.g.a(jD);
        }
        return new float[]{(pasVar.a - 1) * ((fArrB[0] * fArr[0]) + 0.5f), (pasVar.b - 1) * ((fArrB[1] * fArr[1]) + 0.5f)};
    }

    public final float[] f(Rect rect) {
        float[] fArr = {1.0f, 1.0f};
        if (rect != null) {
            pas pasVar = this.i;
            fArr[0] = pasVar.a / (rect.right - rect.left);
            fArr[1] = pasVar.b / (rect.bottom - rect.top);
        }
        return fArr;
    }

    public final String toString() {
        SizeF sizeF = this.h;
        return "AbsoluteGyroTransformCalculator{imageSize=" + this.d.toString() + ", sensorSize=" + sizeF.toString() + ", timeoutMs=0, numOfStrips=" + this.c + "}";
    }
}
