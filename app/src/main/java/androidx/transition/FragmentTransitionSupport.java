package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.cmp;
import defpackage.com;
import defpackage.cy;
import defpackage.dgf;
import defpackage.dgg;
import defpackage.dgh;
import defpackage.dgl;
import defpackage.dgp;
import defpackage.dgt;
import defpackage.dgx;
import defpackage.due;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FragmentTransitionSupport extends cy {
    private static boolean A(dgp dgpVar) {
        return (x(dgpVar.c) && x(null) && x(null)) ? false : true;
    }

    @Override // defpackage.cy
    public final Object a(Object obj) {
        if (obj != null) {
            return ((dgp) obj).clone();
        }
        return null;
    }

    @Override // defpackage.cy
    public final Object b(Object obj, Object obj2, Object obj3) {
        dgp dgpVar = (dgp) obj;
        dgp dgpVar2 = (dgp) obj2;
        dgp dgpVar3 = (dgp) obj3;
        if (dgpVar != null && dgpVar2 != null) {
            dgx dgxVar = new dgx();
            dgxVar.N(dgpVar);
            dgxVar.N(dgpVar2);
            dgxVar.O();
            dgpVar = dgxVar;
        } else if (dgpVar == null) {
            dgpVar = dgpVar2 != null ? dgpVar2 : null;
        }
        if (dgpVar3 == null) {
            return dgpVar;
        }
        dgx dgxVar2 = new dgx();
        if (dgpVar != null) {
            dgxVar2.N(dgpVar);
        }
        dgxVar2.N(dgpVar3);
        return dgxVar2;
    }

    @Override // defpackage.cy
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        dgx dgxVar = new dgx();
        dgxVar.N((dgp) obj);
        return dgxVar;
    }

    @Override // defpackage.cy
    public final void d(Object obj, View view) {
        ((dgp) obj).E(view);
    }

    @Override // defpackage.cy
    public final void e(Object obj, ArrayList arrayList) {
        dgp dgpVar = (dgp) obj;
        if (dgpVar == null) {
            return;
        }
        int i = 0;
        if (dgpVar instanceof dgx) {
            dgx dgxVar = (dgx) dgpVar;
            int iF = dgxVar.f();
            while (i < iF) {
                e(dgxVar.g(i), arrayList);
                i++;
            }
            return;
        }
        if (A(dgpVar) || !x(dgpVar.d)) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            dgpVar.E((View) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.cy
    public final void f(ViewGroup viewGroup, Object obj) {
        dgp dgpVar = (dgp) obj;
        ArrayList arrayList = dgt.b;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (dgpVar == null) {
            dgpVar = dgt.a;
        }
        dgp dgpVarClone = dgpVar.clone();
        dgt.c(viewGroup, dgpVarClone);
        com.u(viewGroup);
        dgt.b(viewGroup, dgpVarClone);
    }

    public final void g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        dgp dgpVar = (dgp) obj;
        int i = 0;
        if (dgpVar instanceof dgx) {
            dgx dgxVar = (dgx) dgpVar;
            int iF = dgxVar.f();
            while (i < iF) {
                g(dgxVar.g(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(dgpVar)) {
            return;
        }
        ArrayList arrayList3 = dgpVar.d;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            dgpVar.E((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                dgpVar.G((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.cy
    public final void h(Object obj, View view, ArrayList arrayList) {
        ((dgp) obj).D(new dgf(view, arrayList));
    }

    @Override // defpackage.cy
    public final void i(Object obj, Rect rect) {
        ((dgp) obj).L(new com(null));
    }

    @Override // defpackage.cy
    public final void j(Object obj, View view) {
        if (view != null) {
            y(view, new Rect());
            ((dgp) obj).L(new com(null));
        }
    }

    @Override // defpackage.cy
    public final void k(Object obj, View view, ArrayList arrayList) {
        dgx dgxVar = (dgx) obj;
        ArrayList arrayList2 = dgxVar.d;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        e(dgxVar, arrayList);
    }

    @Override // defpackage.cy
    public final void l(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        dgx dgxVar = (dgx) obj;
        if (dgxVar != null) {
            ArrayList arrayList3 = dgxVar.d;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            g(dgxVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.cy
    public final boolean m(Object obj) {
        return obj instanceof dgp;
    }

    @Override // defpackage.cy
    public final boolean n() {
        return true;
    }

    @Override // defpackage.cy
    public final boolean o(Object obj) {
        boolean zD = ((dgp) obj).d();
        if (!zD) {
            Objects.toString(obj);
        }
        return zD;
    }

    @Override // defpackage.cy
    public final Object p(Object obj, Object obj2) {
        dgx dgxVar = new dgx();
        if (obj != null) {
            dgxVar.N((dgp) obj);
        }
        dgxVar.N((dgp) obj2);
        return dgxVar;
    }

    @Override // defpackage.cy
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((dgp) obj).D(new dgg(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.cy
    public final void r(Object obj, cmp cmpVar, Runnable runnable) {
        z(obj, cmpVar, null, runnable);
    }

    @Override // defpackage.cy
    public final Object s(ViewGroup viewGroup, Object obj) {
        dgp dgpVar = (dgp) obj;
        ArrayList arrayList = dgt.b;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return null;
        }
        if (!dgpVar.d()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        dgp dgpVarClone = dgpVar.clone();
        dgx dgxVar = new dgx();
        dgxVar.N(dgpVarClone);
        dgt.c(viewGroup, dgxVar);
        com.u(viewGroup);
        dgt.b(viewGroup, dgxVar);
        viewGroup.invalidate();
        dgxVar.q = new dgl(dgxVar);
        dgxVar.D(dgxVar.q);
        return dgxVar.q;
    }

    @Override // defpackage.cy
    public final void t(Object obj) {
        ((dgl) obj).i();
    }

    @Override // defpackage.cy
    public final void u(Object obj, Runnable runnable) {
        ((dgl) obj).j(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    @Override // defpackage.cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.lang.Object r11, float r12) {
        /*
            r10 = this;
            dgl r11 = (defpackage.dgl) r11
            boolean r10 = r11.b
            if (r10 == 0) goto L6c
            long r0 = r11.h()
            float r10 = (float) r0
            float r12 = r12 * r10
            long r0 = (long) r12
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 1
            if (r10 != 0) goto L16
            r0 = r4
        L16:
            long r6 = r11.h()
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r6 = -1
            if (r10 != 0) goto L25
            long r0 = r11.h()
            long r0 = r0 + r6
        L25:
            cto r10 = r11.e
            if (r10 != 0) goto L64
            long r8 = r11.a
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 == 0) goto L6c
            boolean r10 = r11.c
            if (r10 != 0) goto L59
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L3c
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 <= 0) goto L3d
            goto L4d
        L3c:
            r2 = r0
        L3d:
            long r0 = r11.h()
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L4c
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 >= 0) goto L4c
            long r6 = r0 + r4
            goto L4d
        L4c:
            r6 = r2
        L4d:
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L58
            dgp r10 = r11.g
            r10.y(r6, r8)
            r11.a = r6
        L58:
            r0 = r6
        L59:
            ode r10 = r11.h
            long r11 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r0 = (float) r0
            r10.f(r11, r0)
            return
        L64:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "setCurrentPlayTimeMillis() called after animation has been started"
            r10.<init>(r11)
            throw r10
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.FragmentTransitionSupport.w(java.lang.Object, float):void");
    }

    @Override // defpackage.cy
    public final void z(Object obj, cmp cmpVar, Runnable runnable, Runnable runnable2) {
        dgp dgpVar = (dgp) obj;
        due dueVar = new due(runnable, dgpVar, runnable2);
        synchronized (cmpVar) {
            while (cmpVar.b) {
                try {
                    cmpVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (cmpVar.c != dueVar) {
                cmpVar.c = dueVar;
                if (cmpVar.a) {
                    dueVar.a();
                }
            }
        }
        dgpVar.D(new dgh(runnable2));
    }
}
