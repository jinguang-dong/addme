package defpackage;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class age extends bup implements buu {
    private final aeq a;
    private final afe b;
    private RenderNode c;

    public age(buo buoVar, aeq aeqVar, afe afeVar) {
        this.a = aeqVar;
        this.b = afeVar;
        M(buoVar);
    }

    private final RenderNode d() {
        RenderNode renderNode = this.c;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.c = renderNode2;
        return renderNode2;
    }

    private static final boolean e(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private static final boolean f(EdgeEffect edgeEffect, Canvas canvas) {
        return e(180.0f, edgeEffect, canvas);
    }

    private static final boolean h(EdgeEffect edgeEffect, Canvas canvas) {
        return e(270.0f, edgeEffect, canvas);
    }

    private static final boolean k(EdgeEffect edgeEffect, Canvas canvas) {
        return e(90.0f, edgeEffect, canvas);
    }

    private static final boolean l(EdgeEffect edgeEffect, Canvas canvas) {
        return e(0.0f, edgeEffect, canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x022e A[PHI: r16
      0x022e: PHI (r16v4 boolean) = (r16v3 boolean), (r16v13 boolean) binds: [B:106:0x01fb, B:114:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.buu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void cS(defpackage.bvo r22) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.age.cS(bvo):void");
    }

    @Override // defpackage.buu
    public final /* synthetic */ void cR() {
    }
}
