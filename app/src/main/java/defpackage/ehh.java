package defpackage;

import android.graphics.PointF;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehh extends ehk {
    public ehh(List list) {
        super(list);
    }

    @Override // defpackage.ehd
    public final /* bridge */ /* synthetic */ Object f(elo eloVar, float f) {
        return Float.valueOf(l(eloVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(elo eloVar, float f) {
        float f2;
        Object obj = eloVar.b;
        if (obj == null || eloVar.c == null) {
            throw new IllegalStateException(GdpuLBytnYW.YbMAMcD);
        }
        elq elqVar = this.d;
        if (elqVar != null) {
            f2 = f;
            Float f3 = (Float) elqVar.b(eloVar.g, eloVar.h.floatValue(), (Float) obj, (Float) eloVar.c, f2, c(), this.c);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float fFloatValue = eloVar.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj).floatValue();
            eloVar.i = fFloatValue;
        }
        float fFloatValue2 = eloVar.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) eloVar.c).floatValue();
            eloVar.j = fFloatValue2;
        }
        PointF pointF = eli.a;
        return fFloatValue + (f2 * (fFloatValue2 - fFloatValue));
    }
}
