package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fch implements kge {
    private static final sgv a = sgv.g("fch");
    private final PointF b;
    private final PointF c;
    private final nnw d;
    private final int e;

    public fch(PointF pointF, PointF pointF2, nnw nnwVar, int i) {
        this.b = pointF;
        this.c = pointF2;
        this.d = nnwVar;
        this.e = i;
    }

    public static fch c(PointF pointF, PointF pointF2, int i) {
        rnt.B(i % 90 == 0, "sensorOrientation must be a multiple of 90");
        rnt.B(i >= 0, "sensorOrientation must not be negative");
        return new fch(pointF, pointF2, new nnw(i % 360), 0);
    }

    private final MeteringRectangle d(PointF pointF, Rect rect) {
        if (rect.width() < 0 || rect.height() < 0) {
            ((sgt) a.c().M(9)).v("Negative cropRegion: %s", rect);
        }
        rect.left = Math.max(0, rect.left);
        rect.top = Math.max(0, rect.top);
        rect.right = Math.max(rect.left, rect.right);
        rect.bottom = Math.max(rect.top, rect.bottom);
        float fMax = Math.max(0, Math.min(rect.width(), rect.height()));
        PointF pointFA = this.d.a(pointF);
        PointF pointF2 = new PointF(rect.left + (pointFA.x * rect.width()), rect.top + (pointFA.y * rect.height()));
        float f = (int) (fMax * 0.06125f);
        Rect rect2 = new Rect((int) (pointF2.x - f), (int) (pointF2.y - f), (int) (pointF2.x + f), (int) (pointF2.y + f));
        rect2.left = e(rect2.left, rect.left, rect.right);
        rect2.top = e(rect2.top, rect.top, rect.bottom);
        rect2.right = e(rect2.right, rect.left, rect.right);
        rect2.bottom = e(rect2.bottom, rect.top, rect.bottom);
        int i = this.e;
        if (i == 0) {
            i = ScriptIntrinsicBLAS.LOWER;
        }
        return new MeteringRectangle(rect2, i);
    }

    private static final int e(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    @Override // defpackage.kge
    public final MeteringRectangle[] a(Rect rect) {
        return new MeteringRectangle[]{d(this.c, rect)};
    }

    @Override // defpackage.kge
    public final MeteringRectangle[] b(Rect rect) {
        return new MeteringRectangle[]{d(this.b, rect)};
    }
}
