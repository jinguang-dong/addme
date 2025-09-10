package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehn extends ehk {
    private final PointF e;

    public ehn(List list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.ehd
    public final /* synthetic */ Object f(elo eloVar, float f) {
        return g(eloVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ehd
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF g(elo eloVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = eloVar.b;
        if (obj2 == null || (obj = eloVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        elq elqVar = this.d;
        if (elqVar != null && (pointF = (PointF) elqVar.b(eloVar.g, eloVar.h.floatValue(), pointF2, pointF3, f, c(), this.c)) != null) {
            return pointF;
        }
        PointF pointF4 = this.e;
        pointF4.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return pointF4;
    }
}
