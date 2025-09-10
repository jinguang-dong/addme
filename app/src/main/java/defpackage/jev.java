package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jev implements jew {
    final ArrayList a = new ArrayList();
    final float[] b = {-0.893333f, -0.86f, -0.86f, -0.726667f, -0.706667f, -0.706667f, -0.66f, -0.66f, -0.403333f, -0.396667f, -0.396667f, -0.383333f, -0.383333f, -0.37f, -0.37f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.37f, 0.37f, 0.383333f, 0.383333f, 0.396667f, 0.396667f, 0.403333f, 0.66f, 0.66f, 0.706667f, 0.706667f, 0.726667f, 0.86f, 0.86f, 0.893333f, -0.893333f};
    final float[] c = {0.0f, -0.366667f, 0.366667f, 0.0f, -0.38f, 0.38f, -0.663333f, 0.663333f, 0.0f, -0.393333f, 0.393333f, -0.71f, 0.71f, -0.863333f, 0.863333f, -0.943333f, -0.726667f, -0.403333f, 0.0f, 0.403333f, 0.726667f, 0.943333f, -0.863333f, 0.863333f, -0.71f, 0.71f, -0.393333f, 0.393333f, 0.0f, -0.663333f, 0.663333f, -0.38f, 0.38f, 0.0f, -0.366667f, 0.366667f, 0.0f, 0.0f};
    final float[] d = {0.5f, 0.5f, 0.5f, 0.7f, 0.7f, 0.7f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f, 0.7f, 0.7f, 0.5f, 0.5f, 0.5f, 0.7f, 1.0f, 1.0f, 1.0f, 0.7f, 0.5f, 0.5f, 0.5f, 0.7f, 0.7f, 1.0f, 1.0f, 1.0f, 0.5f, 0.5f, 0.7f, 0.7f, 0.7f, 0.5f, 0.5f, 0.5f, 0.5f};

    @Override // defpackage.jew
    public final void a(float f, jer jerVar, float[] fArr, int i, int i2) {
        float f2 = i / 2.0f;
        float f3 = i2 / 2.0f;
        float fMin = Math.min(f2, f3) * 0.95f;
        this.a.clear();
        PointF pointF = new PointF();
        jfd jfdVar = jerVar.h;
        if (jfdVar != null) {
            jfdVar.c();
            jerVar.h.j(1.0f);
        }
        for (int i3 = 0; i3 < 38; i3++) {
            pointF.x = (this.b[i3] * f * fMin) + f2;
            pointF.y = (this.c[i3] * f * fMin) + f3;
            float f4 = this.d[i3] * 0.4f;
            jdv jdvVar = jerVar.e;
            if (jdvVar != null && jerVar.h != null) {
                try {
                    jdvVar.f(fArr, pointF.x, pointF.y, f4);
                } catch (jds e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
