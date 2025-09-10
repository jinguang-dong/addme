package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egh implements egi, egq, egy, eib {
    public final List a;
    private final Matrix b;
    private final Path c;
    private final RectF d;
    private final String e;
    private final boolean f;
    private final efs g;
    private List h;
    private eht i;

    public egh(efs efsVar, ejh ejhVar, ejc ejcVar, efh efhVar) {
        eio eioVar;
        String str = ejcVar.a;
        boolean z = ejcVar.c;
        List list = ejcVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            egg eggVarA = ((eis) list.get(i2)).a(efsVar, efhVar, ejhVar);
            if (eggVarA != null) {
                arrayList.add(eggVarA);
            }
        }
        List list2 = ejcVar.b;
        while (true) {
            if (i >= list2.size()) {
                eioVar = null;
                break;
            }
            eis eisVar = (eis) list2.get(i);
            if (eisVar instanceof eio) {
                eioVar = (eio) eisVar;
                break;
            }
            i++;
        }
        this(efsVar, ejhVar, str, z, arrayList, eioVar);
    }

    @Override // defpackage.eib
    public final void a(Object obj, elq elqVar) {
        eht ehtVar = this.i;
        if (ehtVar != null) {
            ehtVar.e(obj, elqVar);
        }
    }

    @Override // defpackage.egi
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        eht ehtVar = this.i;
        if (ehtVar != null) {
            matrix2.preConcat(ehtVar.a());
            i = (int) (((((this.i.e == null ? 100 : ((Integer) r5.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj = list.get(size);
            if (obj instanceof egi) {
                ((egi) obj).b(canvas, matrix2, i);
            }
        }
    }

    @Override // defpackage.egi
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        eht ehtVar = this.i;
        if (ehtVar != null) {
            matrix2.preConcat(ehtVar.a());
        }
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            egg eggVar = (egg) list.get(size);
            if (eggVar instanceof egi) {
                ((egi) eggVar).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // defpackage.egy
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.eib
    public final void e(eia eiaVar, int i, List list, eia eiaVar2) {
        String str = this.e;
        if (!eiaVar.e(str, i) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            eiaVar2 = eiaVar2.b(str);
            if (eiaVar.d(str, i)) {
                list.add(eiaVar2.c(this));
            }
        }
        if (!eiaVar.f(str, i)) {
            return;
        }
        int iA = i + eiaVar.a(str, i);
        int i2 = 0;
        while (true) {
            List list2 = this.a;
            if (i2 >= list2.size()) {
                return;
            }
            egg eggVar = (egg) list2.get(i2);
            if (eggVar instanceof eib) {
                ((eib) eggVar).e(eiaVar, iA, list, eiaVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.egg
    public final void f(List list, List list2) {
        List list3 = this.a;
        ArrayList arrayList = new ArrayList(list.size() + list3.size());
        arrayList.addAll(list);
        int size = list3.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            egg eggVar = (egg) list3.get(size);
            eggVar.f(arrayList, list3.subList(0, size));
            arrayList.add(eggVar);
        }
    }

    @Override // defpackage.egg
    public final String g() {
        throw null;
    }

    final Matrix h() {
        eht ehtVar = this.i;
        if (ehtVar != null) {
            return ehtVar.a();
        }
        Matrix matrix = this.b;
        matrix.reset();
        return matrix;
    }

    @Override // defpackage.egq
    public final Path i() {
        Matrix matrix = this.b;
        matrix.reset();
        eht ehtVar = this.i;
        if (ehtVar != null) {
            matrix.set(ehtVar.a());
        }
        Path path = this.c;
        path.reset();
        if (!this.f) {
            List list = this.a;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                egg eggVar = (egg) list.get(size);
                if (eggVar instanceof egq) {
                    path.addPath(((egq) eggVar).i(), matrix);
                }
            }
        }
        return path;
    }

    final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            int i = 0;
            while (true) {
                List list = this.a;
                if (i >= list.size()) {
                    break;
                }
                egg eggVar = (egg) list.get(i);
                if (eggVar instanceof egq) {
                    this.h.add((egq) eggVar);
                }
                i++;
            }
        }
        return this.h;
    }

    public egh(efs efsVar, ejh ejhVar, String str, boolean z, List list, eio eioVar) {
        new ege();
        new RectF();
        this.b = new Matrix();
        this.c = new Path();
        this.d = new RectF();
        this.e = str;
        this.g = efsVar;
        this.f = z;
        this.a = list;
        if (eioVar != null) {
            eht ehtVar = new eht(eioVar);
            this.i = ehtVar;
            ehtVar.c(ejhVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            egg eggVar = (egg) list.get(size);
            if (eggVar instanceof egn) {
                arrayList.add((egn) eggVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((egn) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }
}
