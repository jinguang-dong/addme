package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ejh implements egi, egy, eib {
    final Matrix a;
    final efs b;
    final ejk c;
    public ehh d;
    public ejh e;
    public ejh f;
    final eht g;
    float h;
    BlurMaskFilter i;
    private final Path j = new Path();
    private final Matrix k = new Matrix();
    private final Matrix l = new Matrix();
    private final Paint m = new ege(1);
    private final Paint n = new ege(PorterDuff.Mode.DST_IN, null);
    private final Paint o = new ege(PorterDuff.Mode.DST_OUT, null);
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private final RectF v;
    private List w;
    private final List x;
    private boolean y;
    private tdy z;

    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.util.List] */
    public ejh(efs efsVar, ejk ejkVar) {
        ege egeVar = new ege(1);
        this.p = egeVar;
        this.q = new ege(PorterDuff.Mode.CLEAR);
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new RectF();
        this.a = new Matrix();
        this.x = new ArrayList();
        this.y = true;
        this.h = 0.0f;
        this.b = efsVar;
        this.c = ejkVar;
        String str = ejkVar.c;
        if (ejkVar.u == 3) {
            egeVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            egeVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        eht ehtVar = new eht(ejkVar.h);
        this.g = ehtVar;
        ehtVar.d(this);
        List list = ejkVar.g;
        if (list != null && !list.isEmpty()) {
            tdy tdyVar = new tdy(ejkVar.g);
            this.z = tdyVar;
            Iterator it = tdyVar.b.iterator();
            while (it.hasNext()) {
                ((ehd) it.next()).h(this);
            }
            for (ehd ehdVar : this.z.a) {
                i(ehdVar);
                ehdVar.h(this);
            }
        }
        if (this.c.r.isEmpty()) {
            n(true);
            return;
        }
        ehh ehhVar = new ehh(this.c.r);
        this.d = ehhVar;
        ehhVar.b = true;
        ehhVar.h(new egy() { // from class: ejg
            @Override // defpackage.egy
            public final void d() {
                ejh ejhVar = this.a;
                ejhVar.n(ejhVar.d.k() == 1.0f);
            }
        });
        n(((Float) this.d.e()).floatValue() == 1.0f);
        i(this.d);
    }

    private final void s() {
        if (this.w != null) {
            return;
        }
        if (this.f == null) {
            this.w = Collections.EMPTY_LIST;
            return;
        }
        this.w = new ArrayList();
        for (ejh ejhVar = this.f; ejhVar != null; ejhVar = ejhVar.f) {
            this.w.add(ejhVar);
        }
    }

    private final void t(Canvas canvas) {
        RectF rectF = this.r;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.q);
        efa.a();
    }

    private final void u() {
        this.b.invalidateSelf();
    }

    private final void v() {
        coh cohVar = this.b.a.l;
        String str = this.c.c;
    }

    @Override // defpackage.eib
    public void a(Object obj, elq elqVar) {
        this.g.e(obj, elqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.egi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejh.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.egi
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.r.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        if (z) {
            List list = this.w;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((ejh) this.w.get(size)).g.a());
                    }
                }
            } else {
                ejh ejhVar = this.f;
                if (ejhVar != null) {
                    matrix2.preConcat(ejhVar.g.a());
                }
            }
        }
        matrix2.preConcat(this.g.a());
    }

    @Override // defpackage.egy
    public final void d() {
        u();
    }

    @Override // defpackage.eib
    public final void e(eia eiaVar, int i, List list, eia eiaVar2) {
        ejh ejhVar = this.e;
        if (ejhVar != null) {
            eia eiaVarB = eiaVar2.b(ejhVar.g());
            if (eiaVar.d(this.e.g(), i)) {
                list.add(eiaVarB.c(this.e));
            }
            if (eiaVar.f(g(), i)) {
                this.e.l(eiaVar, eiaVar.a(this.e.g(), i) + i, list, eiaVarB);
            }
        }
        if (eiaVar.e(g(), i)) {
            if (!"__container".equals(g())) {
                eiaVar2 = eiaVar2.b(g());
                if (eiaVar.d(g(), i)) {
                    list.add(eiaVar2.c(this));
                }
            }
            if (eiaVar.f(g(), i)) {
                l(eiaVar, i + eiaVar.a(g(), i), list, eiaVar2);
            }
        }
    }

    @Override // defpackage.egg
    public final String g() {
        return this.c.c;
    }

    public final BlurMaskFilter h(float f) {
        if (this.h == f) {
            return this.i;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.i = blurMaskFilter;
        this.h = f;
        return blurMaskFilter;
    }

    public final void i(ehd ehdVar) {
        if (ehdVar == null) {
            return;
        }
        this.x.add(ehdVar);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i);

    public final void k(ehd ehdVar) {
        this.x.remove(ehdVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    public void m(float f) {
        eht ehtVar = this.g;
        ehd ehdVar = ehtVar.e;
        if (ehdVar != null) {
            ehdVar.j(f);
        }
        ehd ehdVar2 = ehtVar.h;
        if (ehdVar2 != null) {
            ehdVar2.j(f);
        }
        ehd ehdVar3 = ehtVar.i;
        if (ehdVar3 != null) {
            ehdVar3.j(f);
        }
        ehd ehdVar4 = ehtVar.a;
        if (ehdVar4 != null) {
            ehdVar4.j(f);
        }
        ehd ehdVar5 = ehtVar.b;
        if (ehdVar5 != null) {
            ehdVar5.j(f);
        }
        ehd ehdVar6 = ehtVar.c;
        if (ehdVar6 != null) {
            ehdVar6.j(f);
        }
        ehd ehdVar7 = ehtVar.d;
        if (ehdVar7 != null) {
            ehdVar7.j(f);
        }
        ehh ehhVar = ehtVar.f;
        if (ehhVar != null) {
            ehhVar.j(f);
        }
        ehh ehhVar2 = ehtVar.g;
        if (ehhVar2 != null) {
            ehhVar2.j(f);
        }
        int i = 0;
        if (this.z != null) {
            for (int i2 = 0; i2 < this.z.b.size(); i2++) {
                ((ehd) this.z.b.get(i2)).j(f);
            }
        }
        ehh ehhVar3 = this.d;
        if (ehhVar3 != null) {
            ehhVar3.j(f);
        }
        ejh ejhVar = this.e;
        if (ejhVar != null) {
            ejhVar.m(f);
        }
        while (true) {
            List list = this.x;
            if (i >= list.size()) {
                return;
            }
            ((ehd) list.get(i)).j(f);
            i++;
        }
    }

    public final void n(boolean z) {
        if (z != this.y) {
            this.y = z;
            u();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    final boolean o() {
        tdy tdyVar = this.z;
        return (tdyVar == null || tdyVar.b.isEmpty()) ? false : true;
    }

    final boolean p() {
        return this.e != null;
    }

    public ejs q() {
        return this.c.v;
    }

    public hkk r() {
        return this.c.x;
    }

    @Override // defpackage.egg
    public final void f(List list, List list2) {
    }

    public void l(eia eiaVar, int i, List list, eia eiaVar2) {
    }
}
