package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nle {
    private static final sgv a = sgv.g("nle");
    private final ktx b;

    public nle(ktx ktxVar) {
        this.b = ktxVar;
    }

    private static final float b(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    public final PointF a(PointF pointF, RectF rectF, boolean z) {
        if (pointF.x < 0.0f || pointF.y < 0.0f) {
            ((sgt) a.c().M(5405)).v("Negative focus point: %s", pointF);
        }
        float[] fArr = {b(pointF.x / rectF.width()), b(pointF.y / rectF.height())};
        int iA = this.b.b().a();
        Matrix matrix = new Matrix();
        matrix.setRotate(iA, 0.5f, 0.5f);
        matrix.mapPoints(fArr);
        if (z) {
            fArr[0] = 1.0f - fArr[0];
        }
        return new PointF(fArr[0], fArr[1]);
    }
}
