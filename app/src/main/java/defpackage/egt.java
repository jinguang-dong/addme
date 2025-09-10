package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egt implements egi, egq, egn, egy, ego {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final efs c;
    private final ejh d;
    private final String e;
    private final boolean f;
    private final ehd g;
    private final ehd h;
    private final eht i;
    private egh j;

    public egt(efs efsVar, ejh ejhVar, eiy eiyVar) {
        this.c = efsVar;
        this.d = ejhVar;
        this.e = eiyVar.a;
        this.f = eiyVar.e;
        ehd ehdVarA = eiyVar.b.a();
        this.g = ehdVarA;
        ejhVar.i(ehdVarA);
        ehdVarA.h(this);
        ehd ehdVarA2 = eiyVar.c.a();
        this.h = ehdVarA2;
        ejhVar.i(ehdVarA2);
        ehdVarA2.h(this);
        eht ehtVar = new eht(eiyVar.d);
        this.i = ehtVar;
        ehtVar.c(ejhVar);
        ehtVar.d(this);
    }

    @Override // defpackage.eib
    public final void a(Object obj, elq elqVar) {
        ehd ehdVar;
        if (this.i.e(obj, elqVar)) {
            return;
        }
        if (obj == efx.u) {
            ehdVar = this.g;
        } else if (obj != efx.v) {
            return;
        } else {
            ehdVar = this.h;
        }
        ehdVar.d = elqVar;
    }

    @Override // defpackage.egi
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        eht ehtVar = this.i;
        float fFloatValue3 = ((Float) ehtVar.h.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) ehtVar.i.e()).floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(ehtVar.b(f + fFloatValue2));
            PointF pointF = eli.a;
            this.j.b(canvas, matrix2, (int) (i * (((f / fFloatValue) * (fFloatValue4 - fFloatValue3)) + fFloatValue3)));
        }
    }

    @Override // defpackage.egi
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.egy
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.eib
    public final void e(eia eiaVar, int i, List list, eia eiaVar2) {
        eli.d(eiaVar, i, list, eiaVar2, this);
        for (int i2 = 0; i2 < this.j.a.size(); i2++) {
            egg eggVar = (egg) this.j.a.get(i2);
            if (eggVar instanceof ego) {
                eli.d(eiaVar, i, list, eiaVar2, (ego) eggVar);
            }
        }
    }

    @Override // defpackage.egg
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.egg
    public final String g() {
        return this.e;
    }

    @Override // defpackage.egn
    public final void h(ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((egg) listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new egh(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.egq
    public final Path i() {
        Path pathI = this.j.i();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.a;
            matrix.set(this.i.b(i + fFloatValue2));
            path.addPath(pathI, matrix);
        }
    }
}
