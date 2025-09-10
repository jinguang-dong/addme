package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejj extends ejh {
    private final Paint j;
    private final Rect k;
    private final Rect l;
    private final eft m;
    private ehd n;
    private ehd o;

    public ejj(efs efsVar, ejk ejkVar) {
        super(efsVar, ejkVar);
        this.j = new ege(3);
        this.k = new Rect();
        this.l = new Rect();
        String str = ejkVar.f;
        efh efhVar = efsVar.a;
        this.m = efhVar == null ? null : (eft) efhVar.b.get(str);
    }

    @Override // defpackage.ejh, defpackage.eib
    public final void a(Object obj, elq elqVar) {
        super.a(obj, elqVar);
        if (obj == efx.K) {
            if (elqVar == null) {
                this.n = null;
                return;
            } else {
                this.n = new ehu(elqVar);
                return;
            }
        }
        if (obj == efx.N) {
            if (elqVar == null) {
                this.o = null;
            } else {
                this.o = new ehu(elqVar);
            }
        }
    }

    @Override // defpackage.ejh, defpackage.egi
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        eft eftVar = this.m;
        if (eftVar != null) {
            float f = eftVar.a;
            float fA = eln.a();
            rectF.set(0.0f, 0.0f, f * fA, eftVar.b * fA);
            this.a.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    @Override // defpackage.ejh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r11, android.graphics.Matrix r12, int r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejj.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
