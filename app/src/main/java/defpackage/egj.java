package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egj implements egq, egy, ego {
    private final String b;
    private final efs c;
    private final ehd d;
    private final ehd e;
    private final eir f;
    private boolean g;
    private final Path a = new Path();
    private final cxb h = new cxb((short[]) null);

    public egj(efs efsVar, ejh ejhVar, eir eirVar) {
        this.b = eirVar.a;
        this.c = efsVar;
        ehd ehdVarA = eirVar.c.a();
        this.d = ehdVarA;
        ehd ehdVarA2 = eirVar.b.a();
        this.e = ehdVarA2;
        this.f = eirVar;
        ejhVar.i(ehdVarA);
        ejhVar.i(ehdVarA2);
        ehdVarA.h(this);
        ehdVarA2.h(this);
    }

    @Override // defpackage.eib
    public final void a(Object obj, elq elqVar) {
        ehd ehdVar;
        if (obj == efx.k) {
            ehdVar = this.d;
        } else if (obj != efx.n) {
            return;
        } else {
            ehdVar = this.e;
        }
        ehdVar.d = elqVar;
    }

    @Override // defpackage.egy
    public final void d() {
        this.g = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.eib
    public final void e(eia eiaVar, int i, List list, eia eiaVar2) {
        eli.d(eiaVar, i, list, eiaVar2, this);
    }

    @Override // defpackage.egg
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            egg eggVar = (egg) list.get(i);
            if (eggVar instanceof egx) {
                egx egxVar = (egx) eggVar;
                if (egxVar.e == 1) {
                    this.h.i(egxVar);
                    egxVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.egg
    public final String g() {
        return this.b;
    }

    @Override // defpackage.egq
    public final Path i() {
        if (this.g) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        eir eirVar = this.f;
        if (eirVar.e) {
            this.g = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        path.reset();
        boolean z = eirVar.d;
        float f3 = f2 * 0.55228f;
        float f4 = -f;
        float f5 = -f3;
        float f6 = f3 + 0.0f;
        float f7 = 0.55228f * f;
        float f8 = -f7;
        float f9 = f7 + 0.0f;
        float f10 = -f2;
        if (z) {
            path.moveTo(0.0f, f10);
            path.cubicTo(f8, f10, f4, f5, f4, 0.0f);
            path.cubicTo(f4, f6, f8, f2, 0.0f, f2);
            path.cubicTo(f9, f2, f, f6, f, 0.0f);
            path.cubicTo(f, f5, f9, f10, 0.0f, f10);
        } else {
            path.moveTo(0.0f, f10);
            path.cubicTo(f9, f10, f, f5, f, 0.0f);
            path.cubicTo(f, f6, f9, f2, 0.0f, f2);
            path.cubicTo(f8, f2, f4, f6, f4, 0.0f);
            path.cubicTo(f4, f5, f8, f10, 0.0f, f10);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.h.j(path);
        this.g = true;
        return path;
    }
}
