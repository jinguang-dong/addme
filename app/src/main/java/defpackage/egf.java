package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class egf implements egy, ego, egi {
    protected final ejh a;
    final Paint b;
    float c;
    private final efs h;
    private final float[] j;
    private final ehd k;
    private final ehd l;
    private final List m;
    private final ehd n;
    private ehd o;
    private ehd p;
    private ehg q;
    private final PathMeasure d = new PathMeasure();
    private final Path e = new Path();
    private final Path f = new Path();
    private final RectF g = new RectF();
    private final List i = new ArrayList();

    public egf(efs efsVar, ejh ejhVar, Paint.Cap cap, Paint.Join join, float f, eih eihVar, eif eifVar, List list, eif eifVar2) {
        ege egeVar = new ege(1);
        this.b = egeVar;
        this.c = 0.0f;
        this.h = efsVar;
        this.a = ejhVar;
        egeVar.setStyle(Paint.Style.STROKE);
        egeVar.setStrokeCap(cap);
        egeVar.setStrokeJoin(join);
        egeVar.setStrokeMiter(f);
        this.l = eihVar.a();
        this.k = eifVar.a();
        if (eifVar2 == null) {
            this.n = null;
        } else {
            this.n = eifVar2.a();
        }
        this.m = new ArrayList(list.size());
        this.j = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.m.add(((eif) list.get(i)).a());
        }
        ejhVar.i(this.l);
        ejhVar.i(this.k);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            ejhVar.i((ehd) this.m.get(i2));
        }
        ehd ehdVar = this.n;
        if (ehdVar != null) {
            ejhVar.i(ehdVar);
        }
        this.l.h(this);
        this.k.h(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((ehd) this.m.get(i3)).h(this);
        }
        ehd ehdVar2 = this.n;
        if (ehdVar2 != null) {
            ehdVar2.h(this);
        }
        if (ejhVar.q() != null) {
            ehd ehdVarA = ((eif) ejhVar.q().a).a();
            this.p = ehdVarA;
            ehdVarA.h(this);
            ejhVar.i(this.p);
        }
        if (ejhVar.r() != null) {
            this.q = new ehg(this, ejhVar, ejhVar.r());
        }
    }

    @Override // defpackage.eib
    public void a(Object obj, elq elqVar) {
        ehg ehgVar;
        ehg ehgVar2;
        ehg ehgVar3;
        ehg ehgVar4;
        ehg ehgVar5;
        if (obj == efx.d) {
            this.l.d = elqVar;
            return;
        }
        if (obj == efx.s) {
            this.k.d = elqVar;
            return;
        }
        if (obj == efx.K) {
            ehd ehdVar = this.o;
            if (ehdVar != null) {
                this.a.k(ehdVar);
            }
            if (elqVar == null) {
                this.o = null;
                return;
            }
            ehu ehuVar = new ehu(elqVar);
            this.o = ehuVar;
            ehuVar.h(this);
            this.a.i(this.o);
            return;
        }
        if (obj == efx.j) {
            ehd ehdVar2 = this.p;
            if (ehdVar2 != null) {
                ehdVar2.d = elqVar;
                return;
            }
            ehu ehuVar2 = new ehu(elqVar);
            this.p = ehuVar2;
            ehuVar2.h(this);
            this.a.i(this.p);
            return;
        }
        if (obj == efx.e && (ehgVar5 = this.q) != null) {
            ehgVar5.b(elqVar);
            return;
        }
        if (obj == efx.G && (ehgVar4 = this.q) != null) {
            ehgVar4.f(elqVar);
            return;
        }
        if (obj == efx.H && (ehgVar3 = this.q) != null) {
            ehgVar3.c(elqVar);
            return;
        }
        if (obj == efx.I && (ehgVar2 = this.q) != null) {
            ehgVar2.e(elqVar);
        } else {
            if (obj != efx.J || (ehgVar = this.q) == null) {
                return;
            }
            ehgVar.g(elqVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.egi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egf.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.egi
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.e;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.i;
            if (i >= list.size()) {
                RectF rectF2 = this.g;
                path.computeBounds(rectF2, false);
                float fK = ((ehh) this.k).k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                efa.a();
                return;
            }
            iso isoVar = (iso) list.get(i);
            int i2 = 0;
            while (true) {
                ?? r4 = isoVar.a;
                if (i2 < r4.size()) {
                    path.addPath(((egq) r4.get(i2)).i(), matrix);
                    i2++;
                }
            }
            i++;
        }
    }

    @Override // defpackage.egy
    public final void d() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.eib
    public final void e(eia eiaVar, int i, List list, eia eiaVar2) {
        eli.d(eiaVar, i, list, eiaVar2, this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.egg
    public final void f(List list, List list2) {
        iso isoVar = null;
        egx egxVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            egg eggVar = (egg) list.get(size);
            if (eggVar instanceof egx) {
                egx egxVar2 = (egx) eggVar;
                if (egxVar2.e == 2) {
                    egxVar = egxVar2;
                }
            }
        }
        if (egxVar != null) {
            egxVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            egg eggVar2 = (egg) list2.get(size2);
            if (eggVar2 instanceof egx) {
                egx egxVar3 = (egx) eggVar2;
                if (egxVar3.e == 2) {
                    if (isoVar != null) {
                        this.i.add(isoVar);
                    }
                    iso isoVar2 = new iso(egxVar3);
                    egxVar3.a(this);
                    isoVar = isoVar2;
                }
            }
            if (eggVar2 instanceof egq) {
                if (isoVar == null) {
                    isoVar = new iso(egxVar);
                }
                isoVar.a.add((egq) eggVar2);
            }
        }
        if (isoVar != null) {
            this.i.add(isoVar);
        }
    }
}
