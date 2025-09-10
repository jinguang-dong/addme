package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnw {
    public final int a;
    public final int b;

    public nnw(int i, mxm mxmVar) {
        this.a = i;
        this.b = (mxmVar.e + i) % 360;
    }

    public final PointF a(PointF pointF) {
        int i = this.a;
        if (i == 0) {
            return pointF;
        }
        if (i == 90) {
            return new PointF(pointF.y, 1.0f - pointF.x);
        }
        if (i == 180) {
            return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
        }
        if (i == 270) {
            return new PointF(1.0f - pointF.y, pointF.x);
        }
        throw new IllegalArgumentException("Unsupported Sensor Orientation");
    }

    public final PointF b(PointF pointF) {
        int i = this.a;
        if (i == 0) {
            return pointF;
        }
        if (i == 90) {
            return new PointF(1.0f - pointF.y, pointF.x);
        }
        if (i == 180) {
            return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
        }
        if (i == 270) {
            return new PointF(pointF.y, 1.0f - pointF.x);
        }
        throw new IllegalArgumentException("Unsupported Sensor Orientation");
    }

    public nnw(int i) {
        this(i, mxm.PORTRAIT);
    }
}
