package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekj {
    private static final Interpolator c = new LinearInterpolator();
    static final iso a = iso.y("t", "s", "e", "o", "i", "h", "to", "ti");
    static final iso b = iso.y("x", "y");

    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.elo a(defpackage.elb r20, defpackage.efh r21, float r22, defpackage.eky r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekj.a(elb, efh, float, eky, boolean, boolean):elo");
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        pointF.x = eli.a(pointF.x, -1.0f, 1.0f);
        pointF.y = eli.a(pointF.y, -100.0f, 100.0f);
        pointF2.x = eli.a(pointF2.x, -1.0f, 1.0f);
        pointF2.y = eli.a(pointF2.y, -100.0f, 100.0f);
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        float f4 = pointF2.y;
        ThreadLocal threadLocal = eln.a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }
}
