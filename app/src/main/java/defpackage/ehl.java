package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehl extends elo {
    public Path a;
    private final elo o;

    public ehl(efh efhVar, elo eloVar) {
        super(efhVar, (PointF) eloVar.b, (PointF) eloVar.c, eloVar.d, eloVar.e, eloVar.f, eloVar.g, eloVar.h);
        this.o = eloVar;
        a();
    }

    public final void a() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        boolean z = false;
        if (obj3 != null && (obj2 = this.b) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.c).y)) {
            z = true;
        }
        Object obj4 = this.b;
        if (obj4 == null || (obj = this.c) == null || z) {
            return;
        }
        elo eloVar = this.o;
        PointF pointF = (PointF) obj4;
        PointF pointF2 = (PointF) obj;
        PointF pointF3 = eloVar.m;
        PointF pointF4 = eloVar.n;
        ThreadLocal threadLocal = eln.a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        this.a = path;
    }
}
