package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jd extends lm {
    private static TimeInterpolator m;
    private final ArrayList n = new ArrayList();
    private final ArrayList o = new ArrayList();
    private final ArrayList p = new ArrayList();
    private final ArrayList q = new ArrayList();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    private final void t(List list, lg lgVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            jc jcVar = (jc) list.get(size);
            if (w(jcVar, lgVar) && jcVar.a == null && jcVar.b == null) {
                list.remove(jcVar);
            }
        }
    }

    private final void u(jc jcVar) {
        lg lgVar = jcVar.a;
        if (lgVar != null) {
            w(jcVar, lgVar);
        }
        lg lgVar2 = jcVar.b;
        if (lgVar2 != null) {
            w(jcVar, lgVar2);
        }
    }

    private final void v(lg lgVar) {
        if (m == null) {
            m = new ValueAnimator().getInterpolator();
        }
        lgVar.a.animate().setInterpolator(m);
        b(lgVar);
    }

    private final boolean w(jc jcVar, lg lgVar) {
        if (jcVar.b == lgVar) {
            jcVar.b = null;
        } else {
            if (jcVar.a != lgVar) {
                return false;
            }
            jcVar.a = null;
        }
        View view = lgVar.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k(lgVar);
        return true;
    }

    final void a() {
        if (h()) {
            return;
        }
        l();
    }

    @Override // defpackage.kn
    public final void b(lg lgVar) {
        View view = lgVar.a;
        view.animate().cancel();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((nxa) arrayList.get(size)).a == lgVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                k(lgVar);
                arrayList.remove(size);
            }
        }
        t(this.q, lgVar);
        if (this.n.remove(lgVar)) {
            view.setAlpha(1.0f);
            k(lgVar);
        }
        if (this.o.remove(lgVar)) {
            view.setAlpha(1.0f);
            k(lgVar);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            t(arrayList3, lgVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.b;
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
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    k(lgVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.a;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f.remove(lgVar);
                this.d.remove(lgVar);
                this.g.remove(lgVar);
                this.e.remove(lgVar);
                a();
                return;
            }
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(lgVar)) {
                view.setAlpha(1.0f);
                k(lgVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.kn
    public final void c() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            lg lgVar = ((nxa) arrayList.get(size)).a;
            View view = lgVar.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            k(lgVar);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            k((lg) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.o;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            lg lgVar2 = (lg) arrayList3.get(size3);
            lgVar2.a.setAlpha(1.0f);
            k(lgVar2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                u((jc) arrayList4.get(size4));
            }
        }
        arrayList4.clear();
        if (!h()) {
            return;
        }
        ArrayList arrayList5 = this.b;
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
                    lg lgVar3 = ((nxa) arrayList6.get(size6)).a;
                    View view2 = lgVar3.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    k(lgVar3);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.a;
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
                    lg lgVar4 = (lg) arrayList8.get(size8);
                    lgVar4.a.setAlpha(1.0f);
                    k(lgVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.c;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                a.m(this.f);
                a.m(this.e);
                a.m(this.d);
                a.m(this.g);
                l();
                return;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    u((jc) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    @Override // defpackage.kn
    public final void d() {
        ArrayList arrayList = this.n;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.p;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.q;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        boolean z = !zIsEmpty3;
        ArrayList arrayList4 = this.o;
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
            View view = lgVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f.add(lgVar);
            viewPropertyAnimatorAnimate.setDuration(this.i).alpha(0.0f).setListener(new ix(this, lgVar, viewPropertyAnimatorAnimate, view)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.b.add(arrayList5);
            arrayList2.clear();
            at atVar = new at(this, arrayList5, 8, (char[]) null);
            if (zIsEmpty) {
                atVar.run();
            } else {
                View view2 = ((nxa) arrayList5.get(0)).a.a;
                long j = this.i;
                int[] iArr = con.a;
                view2.postOnAnimationDelayed(atVar, j);
            }
        }
        if (z) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.c.add(arrayList6);
            arrayList3.clear();
            at atVar2 = new at(this, arrayList6, 9, (char[]) null);
            if (zIsEmpty) {
                atVar2.run();
            } else {
                View view3 = ((jc) arrayList6.get(0)).a.a;
                long j2 = this.i;
                int[] iArr2 = con.a;
                view3.postOnAnimationDelayed(atVar2, j2);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.a.add(arrayList7);
        arrayList4.clear();
        at atVar3 = new at(this, arrayList7, 10, (char[]) null);
        if (zIsEmpty && zIsEmpty2 && !z) {
            atVar3.run();
            return;
        }
        long jMax = (!zIsEmpty ? this.i : 0L) + Math.max(!zIsEmpty2 ? this.j : 0L, z ? this.k : 0L);
        View view4 = ((lg) arrayList7.get(0)).a;
        int[] iArr3 = con.a;
        view4.postOnAnimationDelayed(atVar3, jMax);
    }

    @Override // defpackage.lm
    public final boolean e(lg lgVar, lg lgVar2, int i, int i2, int i3, int i4) {
        if (lgVar == lgVar2) {
            return f(lgVar, i, i2, i3, i4);
        }
        View view = lgVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        v(lgVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (lgVar2 != null) {
            v(lgVar2);
            View view2 = lgVar2.a;
            view2.setTranslationX(-((int) f));
            view2.setTranslationY(-((int) f2));
            view2.setAlpha(0.0f);
        }
        this.q.add(new jc(lgVar, lgVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.lm
    public final boolean f(lg lgVar, int i, int i2, int i3, int i4) {
        View view = lgVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        v(lgVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                k(lgVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.p.add(new nxa(lgVar, i5, i7, i3, i4));
        return true;
    }

    @Override // defpackage.kn
    public final boolean g(lg lgVar, List list) {
        return !list.isEmpty() || q(lgVar);
    }

    @Override // defpackage.kn
    public final boolean h() {
        return (this.o.isEmpty() && this.q.isEmpty() && this.p.isEmpty() && this.n.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    @Override // defpackage.lm
    public final void i(lg lgVar) {
        v(lgVar);
        lgVar.a.setAlpha(0.0f);
        this.o.add(lgVar);
    }

    @Override // defpackage.lm
    public final void j(lg lgVar) {
        v(lgVar);
        this.n.add(lgVar);
    }
}
