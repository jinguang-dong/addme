package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egl implements egi, egy, ego {
    float a;
    private final String b;
    private final boolean c;
    private final ejh d;
    private final zb e = new zb();
    private final zb f = new zb();
    private final Path g;
    private final Paint h;
    private final RectF i;
    private final List j;
    private final ehd k;
    private final ehd l;
    private final ehd m;
    private final ehd n;
    private ehd o;
    private ehu p;
    private final efs q;
    private final int r;
    private ehd s;
    private ehg t;
    private final int u;

    public egl(efs efsVar, efh efhVar, ejh ejhVar, eit eitVar) {
        Path path = new Path();
        this.g = path;
        this.h = new ege(1);
        this.i = new RectF();
        this.j = new ArrayList();
        this.a = 0.0f;
        this.d = ejhVar;
        this.b = eitVar.f;
        this.c = eitVar.g;
        this.q = efsVar;
        this.u = eitVar.h;
        path.setFillType(eitVar.a);
        this.r = (int) (efhVar.a() / 32.0f);
        ehd ehdVarA = eitVar.b.a();
        this.k = ehdVarA;
        ehdVarA.h(this);
        ejhVar.i(ehdVarA);
        ehd ehdVarA2 = eitVar.c.a();
        this.l = ehdVarA2;
        ehdVarA2.h(this);
        ejhVar.i(ehdVarA2);
        ehd ehdVarA3 = eitVar.d.a();
        this.m = ehdVarA3;
        ehdVarA3.h(this);
        ejhVar.i(ehdVarA3);
        ehd ehdVarA4 = eitVar.e.a();
        this.n = ehdVarA4;
        ehdVarA4.h(this);
        ejhVar.i(ehdVarA4);
        if (ejhVar.q() != null) {
            ehd ehdVarA5 = ((eif) ejhVar.q().a).a();
            this.s = ehdVarA5;
            ehdVarA5.h(this);
            ejhVar.i(this.s);
        }
        if (ejhVar.r() != null) {
            this.t = new ehg(this, ejhVar, ejhVar.r());
        }
    }

    private final int h() {
        float f = this.m.c;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.c * f2);
        int iRound3 = Math.round(this.k.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        ehu ehuVar = this.p;
        if (ehuVar != null) {
            Integer[] numArr = (Integer[]) ehuVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.eib
    public final void a(Object obj, elq elqVar) {
        ehg ehgVar;
        ehg ehgVar2;
        ehg ehgVar3;
        ehg ehgVar4;
        ehg ehgVar5;
        if (obj == efx.d) {
            this.l.d = elqVar;
            return;
        }
        if (obj == efx.K) {
            ehd ehdVar = this.o;
            if (ehdVar != null) {
                this.d.k(ehdVar);
            }
            if (elqVar == null) {
                this.o = null;
                return;
            }
            ehu ehuVar = new ehu(elqVar);
            this.o = ehuVar;
            ehuVar.h(this);
            this.d.i(this.o);
            return;
        }
        if (obj == efx.L) {
            ehu ehuVar2 = this.p;
            if (ehuVar2 != null) {
                this.d.k(ehuVar2);
            }
            if (elqVar == null) {
                this.p = null;
                return;
            }
            this.e.f();
            this.f.f();
            ehu ehuVar3 = new ehu(elqVar);
            this.p = ehuVar3;
            ehuVar3.h(this);
            this.d.i(this.p);
            return;
        }
        if (obj == efx.j) {
            ehd ehdVar2 = this.s;
            if (ehdVar2 != null) {
                ehdVar2.d = elqVar;
                return;
            }
            ehu ehuVar4 = new ehu(elqVar);
            this.s = ehuVar4;
            ehuVar4.h(this);
            this.d.i(this.s);
            return;
        }
        if (obj == efx.e && (ehgVar5 = this.t) != null) {
            ehgVar5.b(elqVar);
            return;
        }
        if (obj == efx.G && (ehgVar4 = this.t) != null) {
            ehgVar4.f(elqVar);
            return;
        }
        if (obj == efx.H && (ehgVar3 = this.t) != null) {
            ehgVar3.c(elqVar);
            return;
        }
        if (obj == efx.I && (ehgVar2 = this.t) != null) {
            ehgVar2.e(elqVar);
        } else {
            if (obj != efx.J || (ehgVar = this.t) == null) {
                return;
            }
            ehgVar.g(elqVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121  */
    @Override // defpackage.egi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egl.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.egi
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.g;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.j;
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
        this.q.invalidateSelf();
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
                this.j.add((egq) eggVar);
            }
        }
    }

    @Override // defpackage.egg
    public final String g() {
        return this.b;
    }
}
