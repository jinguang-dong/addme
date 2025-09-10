package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nxb extends lm {
    protected final TimeInterpolator b = new ValueAnimator().getInterpolator();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();

    private final void E(List list, lg lgVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            nwz nwzVar = (nwz) list.get(size);
            if (G(nwzVar, lgVar) && nwzVar.a == null && nwzVar.b == null) {
                list.remove(nwzVar);
            }
        }
    }

    private final void F(nwz nwzVar) {
        lg lgVar = nwzVar.a;
        if (lgVar != null) {
            G(nwzVar, lgVar);
        }
        lg lgVar2 = nwzVar.b;
        if (lgVar2 != null) {
            G(nwzVar, lgVar2);
        }
    }

    private final boolean G(nwz nwzVar, lg lgVar) {
        if (nwzVar.b == lgVar) {
            nwzVar.b = null;
            y(lgVar);
        } else {
            if (nwzVar.a != lgVar) {
                return false;
            }
            nwzVar.a = null;
            z(lgVar);
        }
        View view = lgVar.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k(lgVar);
        return true;
    }

    protected abstract void A(lg lgVar);

    protected abstract void B(lg lgVar);

    final void C() {
        if (h()) {
            return;
        }
        l();
    }

    public final void D(lg lgVar) {
        lgVar.a.animate().setInterpolator(this.b);
        b(lgVar);
    }

    public abstract ViewPropertyAnimator a(lg lgVar);

    @Override // defpackage.kn
    public final void b(lg lgVar) {
        lgVar.a.animate().cancel();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((nxa) arrayList.get(size)).a == lgVar) {
                A(lgVar);
                k(lgVar);
                arrayList.remove(size);
            }
        }
        E(this.f, lgVar);
        if (this.c.remove(lgVar)) {
            B(lgVar);
            k(lgVar);
        }
        if (this.d.remove(lgVar)) {
            x(lgVar);
            k(lgVar);
        }
        ArrayList arrayList2 = this.n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            E(arrayList3, lgVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((nxa) arrayList5.get(size4)).a == lgVar) {
                    A(lgVar);
                    k(lgVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.g;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.q.remove(lgVar);
                this.o.remove(lgVar);
                this.r.remove(lgVar);
                this.p.remove(lgVar);
                C();
                return;
            }
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(lgVar)) {
                x(lgVar);
                k(lgVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.kn
    public final void c() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            lg lgVar = ((nxa) arrayList.get(size)).a;
            A(lgVar);
            k(lgVar);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            lg lgVar2 = (lg) arrayList2.get(size2);
            B(lgVar2);
            k(lgVar2);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            lg lgVar3 = (lg) arrayList3.get(size3);
            x(lgVar3);
            k(lgVar3);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                F((nwz) arrayList4.get(size4));
            }
        }
        arrayList4.clear();
        if (!h()) {
            return;
        }
        ArrayList arrayList5 = this.m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    lg lgVar4 = ((nxa) arrayList6.get(size6)).a;
                    A(lgVar4);
                    k(lgVar4);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.g;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    lg lgVar5 = (lg) arrayList8.get(size8);
                    x(lgVar5);
                    k(lgVar5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                a.m(this.q);
                a.m(this.p);
                a.m(this.o);
                a.m(this.r);
                l();
                return;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    F((nwz) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    @Override // defpackage.kn
    public final void d() {
        ArrayList arrayList = this.c;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.e;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        boolean z = !zIsEmpty3;
        ArrayList arrayList4 = this.d;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4) {
            if (zIsEmpty3) {
                return;
            } else {
                z = true;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lg lgVar = (lg) arrayList.get(i);
            ViewPropertyAnimator viewPropertyAnimatorW = w(lgVar);
            this.q.add(lgVar);
            viewPropertyAnimatorW.setDuration(this.i).setListener(new nwu(this, lgVar, viewPropertyAnimatorW)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            mzq mzqVar = new mzq(this, arrayList5, 18);
            if (zIsEmpty) {
                mzqVar.run();
            } else {
                View view = ((nxa) arrayList5.get(0)).a.a;
                long j = this.i;
                int[] iArr = con.a;
                view.postOnAnimationDelayed(mzqVar, j);
            }
        }
        if (z) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            mzq mzqVar2 = new mzq(this, arrayList6, 19);
            if (zIsEmpty) {
                mzqVar2.run();
            } else {
                lg lgVar2 = ((nwz) arrayList6.get(0)).a;
                if (lgVar2 != null) {
                    long j2 = this.i;
                    int[] iArr2 = con.a;
                    lgVar2.a.postOnAnimationDelayed(mzqVar2, j2);
                }
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.g.add(arrayList7);
        arrayList4.clear();
        mzq mzqVar3 = new mzq(this, arrayList7, 20);
        if (zIsEmpty && zIsEmpty2 && !z) {
            mzqVar3.run();
            return;
        }
        long jMax = (!zIsEmpty ? this.i : 0L) + Math.max(!zIsEmpty2 ? this.j : 0L, z ? this.k : 0L);
        View view2 = ((lg) arrayList7.get(0)).a;
        int[] iArr3 = con.a;
        view2.postOnAnimationDelayed(mzqVar3, jMax);
    }

    @Override // defpackage.lm
    public boolean e(lg lgVar, lg lgVar2, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // defpackage.lm
    public boolean f(lg lgVar, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // defpackage.kn
    public final boolean g(lg lgVar, List list) {
        return !list.isEmpty() || q(lgVar);
    }

    @Override // defpackage.kn
    public final boolean h() {
        return (this.d.isEmpty() && this.f.isEmpty() && this.e.isEmpty() && this.c.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.g.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // defpackage.lm
    public void i(lg lgVar) {
        throw null;
    }

    @Override // defpackage.lm
    public void j(lg lgVar) {
        throw null;
    }

    public abstract ViewPropertyAnimator t(lg lgVar);

    public abstract ViewPropertyAnimator u(lg lgVar);

    public abstract ViewPropertyAnimator v(lg lgVar, int i, int i2, int i3, int i4);

    protected abstract ViewPropertyAnimator w(lg lgVar);

    protected void x(lg lgVar) {
        throw null;
    }

    protected void y(lg lgVar) {
        throw null;
    }

    protected void z(lg lgVar) {
        throw null;
    }
}
