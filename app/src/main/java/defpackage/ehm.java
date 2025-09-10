package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehm extends ehk {
    private final PointF e;
    private final float[] f;
    private final PathMeasure g;
    private ehl h;

    public ehm(List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new PathMeasure();
    }

    @Override // defpackage.ehd
    public final /* bridge */ /* synthetic */ Object f(elo eloVar, float f) {
        float f2;
        ehl ehlVar = (ehl) eloVar;
        Path path = ehlVar.a;
        if (path == null) {
            return (PointF) eloVar.b;
        }
        elq elqVar = this.d;
        if (elqVar != null) {
            f2 = f;
            PointF pointF = (PointF) elqVar.b(ehlVar.g, ehlVar.h.floatValue(), (PointF) ehlVar.b, (PointF) ehlVar.c, c(), f2, this.c);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        if (this.h != ehlVar) {
            this.g.setPath(path, false);
            this.h = ehlVar;
        }
        PathMeasure pathMeasure = this.g;
        float length = pathMeasure.getLength() * f2;
        float[] fArr = this.f;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF2 = this.e;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
