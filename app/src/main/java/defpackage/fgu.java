package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgu {
    public final owq a;
    public final fhe b;
    public final fhj c;
    public final GestureDetector d;
    public final luj e;
    public final luj f;
    private final pjp g;
    private final owf h;
    private final owq i;
    private PointF j;
    private final GestureDetector.OnGestureListener k;
    private final pmg l;

    public fgu(Context context, pjp pjpVar, owf owfVar, luj lujVar, luj lujVar2, owq owqVar, owq owqVar2, fhe fheVar, pmg pmgVar, fhj fhjVar) {
        fgt fgtVar = new fgt();
        this.k = fgtVar;
        this.g = pjpVar;
        this.h = owfVar;
        this.e = lujVar;
        this.f = lujVar2;
        this.i = owqVar;
        this.a = owqVar2;
        this.b = fheVar;
        this.l = pmgVar;
        this.c = fhjVar;
        this.d = new GestureDetector(context, fgtVar, new Handler(context.getMainLooper()));
    }

    public final void a(MotionEvent motionEvent) {
        PointF pointFA;
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        String str = (String) this.h.dL();
        pjp pjpVar = this.g;
        pjr pjrVarD = pjpVar.d(str);
        if (pjrVarD == null) {
            pointFA = new PointF(0.0f, 0.0f);
        } else {
            pmg pmgVar = this.l;
            pjo pjoVarA = pjpVar.a(pjrVarD);
            RectF rectFDL = ((fgq) pmgVar.a).dL();
            PointF pointFA2 = ((nle) pmgVar.b).a(new PointF(pointF.x - rectFDL.left, pointF.y - rectFDL.top), new RectF(0.0f, 0.0f, rectFDL.width(), rectFDL.height()), false);
            int iG = pjoVarA.g();
            if (iG != ((nnw) pmgVar.c).a) {
                pmgVar.c = new nnw(iG);
            }
            pointFA = ((nnw) pmgVar.c).a(pointFA2);
        }
        this.j = pointFA;
        this.i.a(pointFA);
    }
}
