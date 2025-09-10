package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egs implements egy, ego, egq {
    private final String c;
    private final boolean d;
    private final efs e;
    private final ehd f;
    private final ehd g;
    private final ehd h;
    private boolean j;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final cxb k = new cxb((short[]) null);
    private ehd i = null;

    public egs(efs efsVar, ejh ejhVar, eix eixVar) {
        this.c = eixVar.a;
        this.d = eixVar.e;
        this.e = efsVar;
        ehd ehdVarA = eixVar.b.a();
        this.f = ehdVarA;
        ehd ehdVarA2 = eixVar.c.a();
        this.g = ehdVarA2;
        ehd ehdVarA3 = eixVar.d.a();
        this.h = ehdVarA3;
        ejhVar.i(ehdVarA);
        ejhVar.i(ehdVarA2);
        ejhVar.i(ehdVarA3);
        ehdVarA.h(this);
        ehdVarA2.h(this);
        ehdVarA3.h(this);
    }

    @Override // defpackage.eib
    public final void a(Object obj, elq elqVar) {
        ehd ehdVar;
        if (obj == efx.l) {
            ehdVar = this.g;
        } else if (obj == efx.n) {
            ehdVar = this.f;
        } else if (obj != efx.m) {
            return;
        } else {
            ehdVar = this.h;
        }
        ehdVar.d = elqVar;
    }

    @Override // defpackage.egy
    public final void d() {
        this.j = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.eib
    public final void e(eia eiaVar, int i, List list, eia eiaVar2) {
        eli.d(eiaVar, i, list, eiaVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    @Override // defpackage.egg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L2f
            java.lang.Object r0 = r5.get(r6)
            egg r0 = (defpackage.egg) r0
            boolean r1 = r0 instanceof defpackage.egx
            if (r1 == 0) goto L22
            r1 = r0
            egx r1 = (defpackage.egx) r1
            int r2 = r1.e
            r3 = 1
            if (r2 != r3) goto L22
            cxb r0 = r4.k
            r0.i(r1)
            r1.a(r4)
            goto L2c
        L22:
            boolean r1 = r0 instanceof defpackage.egu
            if (r1 == 0) goto L2c
            egu r0 = (defpackage.egu) r0
            ehd r0 = r0.a
            r4.i = r0
        L2c:
            int r6 = r6 + 1
            goto L1
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egs.f(java.util.List, java.util.List):void");
    }

    @Override // defpackage.egg
    public final String g() {
        return this.c;
    }

    @Override // defpackage.egq
    public final Path i() {
        ehd ehdVar;
        if (this.j) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        if (this.d) {
            this.j = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float fK = ((ehh) this.h).k();
        if (fK == 0.0f && (ehdVar = this.i) != null) {
            fK = Math.min(((Float) ehdVar.e()).floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fK > fMin) {
            fK = fMin;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f, (pointF2.y - f2) + fK);
        path.lineTo(pointF2.x + f, (pointF2.y + f2) - fK);
        if (fK > 0.0f) {
            float f3 = fK + fK;
            RectF rectF = this.b;
            rectF.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f) + fK, pointF2.y + f2);
        if (fK > 0.0f) {
            float f4 = fK + fK;
            RectF rectF2 = this.b;
            rectF2.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            path.arcTo(rectF2, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f, (pointF2.y - f2) + fK);
        if (fK > 0.0f) {
            float f5 = fK + fK;
            RectF rectF3 = this.b;
            rectF3.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            path.arcTo(rectF3, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f) - fK, pointF2.y - f2);
        if (fK > 0.0f) {
            float f6 = fK + fK;
            RectF rectF4 = this.b;
            rectF4.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
            path.arcTo(rectF4, 270.0f, 90.0f, false);
        }
        path.close();
        this.k.j(path);
        this.j = true;
        return path;
    }
}
