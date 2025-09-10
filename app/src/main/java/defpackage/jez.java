package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jez implements jew {
    private static final float[] a = {-0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f};
    private static final float[] b = {-0.5f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f};
    private final ArrayList c = new ArrayList();

    @Override // defpackage.jew
    public final void a(float f, jer jerVar, float[] fArr, int i, int i2) {
        float f2 = i / 2.0f;
        float f3 = i2 / 2.0f;
        float fMin = Math.min(f2, f3) * 0.95f;
        ArrayList arrayList = this.c;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            float f4 = 1.0f;
            if (i3 >= 9) {
                break;
            }
            float f5 = i > i2 ? 1.3333334f : 1.0f;
            if (i <= i2) {
                f4 = 1.3333334f;
            }
            arrayList.add(new PointF((a[i3] * f * fMin * f5) + f2, (b[i3] * f * fMin * f4) + f3));
            i3++;
        }
        jfe jfeVar = jerVar.g;
        if (jfeVar == null || jerVar.e == null) {
            return;
        }
        jfeVar.c();
        jerVar.g.j(1.0f);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            try {
                PointF pointF = (PointF) arrayList.get(i4);
                jdv jdvVar = jerVar.e;
                if (jdvVar != null) {
                    jdvVar.f(fArr, pointF.x, pointF.y, 0.4f);
                }
            } catch (jds e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
