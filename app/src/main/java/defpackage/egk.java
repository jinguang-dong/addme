package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egk implements egi, egy, ego {
    float a;
    private final Path b;
    private final Paint c;
    private final ejh d;
    private final String e;
    private final boolean f;
    private final List g;
    private final ehd h;
    private final ehd i;
    private ehd j;
    private final efs k;
    private ehd l;
    private ehg m;

    public egk(efs efsVar, ejh ejhVar, ejb ejbVar) {
        Path path = new Path();
        this.b = path;
        this.c = new ege(1);
        this.g = new ArrayList();
        this.d = ejhVar;
        this.e = ejbVar.b;
        this.f = ejbVar.e;
        this.k = efsVar;
        if (ejhVar.q() != null) {
            ehd ehdVarA = ((eif) ejhVar.q().a).a();
            this.l = ehdVarA;
            ehdVarA.h(this);
            ejhVar.i(this.l);
        }
        if (ejhVar.r() != null) {
            this.m = new ehg(this, ejhVar, ejhVar.r());
        }
        if (ejbVar.c == null) {
            this.h = null;
            this.i = null;
            return;
        }
        path.setFillType(ejbVar.a);
        ehd ehdVarA2 = ejbVar.c.a();
        this.h = ehdVarA2;
        ehdVarA2.h(this);
        ejhVar.i(ehdVarA2);
        ehd ehdVarA3 = ejbVar.d.a();
        this.i = ehdVarA3;
        ehdVarA3.h(this);
        ejhVar.i(ehdVarA3);
    }

    @Override // defpackage.eib
    public final void a(Object obj, elq elqVar) {
        ehg ehgVar;
        ehg ehgVar2;
        ehg ehgVar3;
        ehg ehgVar4;
        ehg ehgVar5;
        if (obj == efx.a) {
            this.h.d = elqVar;
            return;
        }
        if (obj == efx.d) {
            this.i.d = elqVar;
            return;
        }
        if (obj == efx.K) {
            ehd ehdVar = this.j;
            if (ehdVar != null) {
                this.d.k(ehdVar);
            }
            if (elqVar == null) {
                this.j = null;
                return;
            }
            ehu ehuVar = new ehu(elqVar);
            this.j = ehuVar;
            ehuVar.h(this);
            this.d.i(this.j);
            return;
        }
        if (obj == efx.j) {
            ehd ehdVar2 = this.l;
            if (ehdVar2 != null) {
                ehdVar2.d = elqVar;
                return;
            }
            ehu ehuVar2 = new ehu(elqVar);
            this.l = ehuVar2;
            ehuVar2.h(this);
            this.d.i(this.l);
            return;
        }
        if (obj == efx.e && (ehgVar5 = this.m) != null) {
            ehgVar5.b(elqVar);
            return;
        }
        if (obj == efx.G && (ehgVar4 = this.m) != null) {
            ehgVar4.f(elqVar);
            return;
        }
        if (obj == efx.H && (ehgVar3 = this.m) != null) {
            ehgVar3.c(elqVar);
            return;
        }
        if (obj == efx.I && (ehgVar2 = this.m) != null) {
            ehgVar2.e(elqVar);
        } else {
            if (obj != efx.J || (ehgVar = this.m) == null) {
                return;
            }
            ehgVar.g(elqVar);
        }
    }

    @Override // defpackage.egi
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        ehd ehdVar = this.h;
        ehd ehdVar2 = this.i;
        int iK = ((ehe) ehdVar).k();
        float fIntValue = ((Integer) ehdVar2.e()).intValue();
        Paint paint = this.c;
        paint.setColor((eli.e((int) ((((i / 255.0f) * fIntValue) / 100.0f) * 255.0f)) << 24) | (iK & 16777215));
        ehd ehdVar3 = this.j;
        if (ehdVar3 != null) {
            paint.setColorFilter((ColorFilter) ehdVar3.e());
        }
        ehd ehdVar4 = this.l;
        if (ehdVar4 != null) {
            float fFloatValue = ((Float) ehdVar4.e()).floatValue();
            if (fFloatValue == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue != this.a) {
                paint.setMaskFilter(this.d.h(fFloatValue));
            }
            this.a = fFloatValue;
        }
        ehg ehgVar = this.m;
        if (ehgVar != null) {
            ehgVar.a(paint);
        }
        Path path = this.b;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.g;
            if (i2 >= list.size()) {
                canvas.drawPath(path, paint);
                efa.a();
                return;
            } else {
                path.addPath(((egq) list.get(i2)).i(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.egi
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.g;
            if (i >= list.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((egq) list.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.egy
    public final void d() {
        this.k.invalidateSelf();
    }

    @Override // defpackage.eib
    public final void e(eia eiaVar, int i, List list, eia eiaVar2) {
        eli.d(eiaVar, i, list, eiaVar2, this);
    }

    @Override // defpackage.egg
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            egg eggVar = (egg) list2.get(i);
            if (eggVar instanceof egq) {
                this.g.add((egq) eggVar);
            }
        }
    }

    @Override // defpackage.egg
    public final String g() {
        return this.e;
    }
}
