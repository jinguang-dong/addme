package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdq extends jdv {
    private PointF m;

    @Override // defpackage.jdr
    public final void a(float[] fArr) throws jds {
        f(fArr, this.m.x, this.m.y, 1.0f);
    }

    public final void b(PointF pointF) {
        PointF pointF2 = new PointF();
        this.m = pointF2;
        pointF2.set(pointF);
    }
}
