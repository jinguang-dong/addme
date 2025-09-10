package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aw extends de {
    public final List a;
    public final dg b;
    public final dg c;
    public final cy d;
    public final yd e;
    public final boolean f;
    public Object g;
    private final Object j;
    private final ArrayList k;
    private final ArrayList l;
    private final yd m;
    private final ArrayList n;
    private final ArrayList o;
    private final yd p;
    private final cmp q = new cmp();

    public aw(List list, dg dgVar, dg dgVar2, cy cyVar, Object obj, ArrayList arrayList, ArrayList arrayList2, yd ydVar, ArrayList arrayList3, ArrayList arrayList4, yd ydVar2, yd ydVar3, boolean z) {
        this.a = list;
        this.b = dgVar;
        this.c = dgVar2;
        this.d = cyVar;
        this.j = obj;
        this.k = arrayList;
        this.l = arrayList2;
        this.m = ydVar;
        this.n = arrayList3;
        this.o = arrayList4;
        this.p = ydVar2;
        this.e = ydVar3;
        this.f = z;
    }

    private final uev g(ViewGroup viewGroup, dg dgVar, dg dgVar2) {
        cy cyVar;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        dg dgVar3 = dgVar;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        List list = this.a;
        Iterator it = list.iterator();
        View view2 = null;
        boolean z = false;
        while (it.hasNext()) {
            if (((ax) it.next()).c() && dgVar2 != null && dgVar3 != null && !this.m.isEmpty() && (obj2 = this.j) != null) {
                boolean z2 = this.f;
                yd ydVar = this.p;
                cr.a(dgVar3.a, dgVar2.a, z2, ydVar, true);
                cnz.b(viewGroup, new as(dgVar3, dgVar2, this, 0));
                ArrayList arrayList2 = this.k;
                arrayList2.addAll(ydVar.values());
                ArrayList arrayList3 = this.o;
                if (!arrayList3.isEmpty()) {
                    Object obj3 = arrayList3.get(0);
                    obj3.getClass();
                    view2 = (View) ydVar.get((String) obj3);
                    this.d.j(obj2, view2);
                }
                ArrayList arrayList4 = this.l;
                yd ydVar2 = this.e;
                arrayList4.addAll(ydVar2.values());
                ArrayList arrayList5 = this.n;
                if (!arrayList5.isEmpty()) {
                    Object obj4 = arrayList5.get(0);
                    obj4.getClass();
                    View view3 = (View) ydVar2.get((String) obj4);
                    if (view3 != null) {
                        cnz.b(viewGroup, new at(view3, rect, 0));
                        z = true;
                    }
                }
                cy cyVar2 = this.d;
                cyVar2.k(obj2, view, arrayList2);
                cyVar2.q(obj2, null, null, obj2, arrayList4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = list.iterator();
        Object objP = null;
        Object objP2 = null;
        while (it2.hasNext()) {
            ax axVar = (ax) it2.next();
            dg dgVar4 = axVar.a;
            cy cyVar3 = this.d;
            Object objA = cyVar3.a(axVar.b);
            if (objA != null) {
                Iterator it3 = it2;
                ArrayList arrayList7 = new ArrayList();
                boolean z3 = z;
                bm bmVar = dgVar4.a;
                Object obj5 = objP;
                View view4 = bmVar.P;
                view4.getClass();
                h(arrayList7, view4);
                if (this.j != null && (dgVar4 == dgVar2 || dgVar4 == dgVar3)) {
                    if (dgVar4 == dgVar2) {
                        arrayList7.removeAll(ske.bQ(this.k));
                    } else {
                        arrayList7.removeAll(ske.bQ(this.l));
                    }
                }
                if (arrayList7.isEmpty()) {
                    cyVar3.d(objA, view);
                    obj = objA;
                    arrayList = arrayList7;
                    cyVar = cyVar3;
                } else {
                    cyVar3.e(objA, arrayList7);
                    cyVar3.q(objA, objA, arrayList7, null, null);
                    cyVar = cyVar3;
                    obj = objA;
                    arrayList = arrayList7;
                    if (dgVar4.h == 3) {
                        dgVar4.g();
                        ArrayList arrayList8 = new ArrayList(arrayList);
                        arrayList8.remove(bmVar.P);
                        cyVar.h(obj, bmVar.P, arrayList8);
                        cnz.b(viewGroup, new av(arrayList, 1));
                    }
                }
                if (dgVar4.h == 2) {
                    arrayList6.addAll(arrayList);
                    if (z3) {
                        cyVar.i(obj, rect);
                    }
                    if (ch.X(2)) {
                        Objects.toString(obj);
                        Iterator it4 = arrayList.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            next.getClass();
                            Objects.toString((View) next);
                        }
                    }
                } else {
                    cyVar.j(obj, view2);
                    if (ch.X(2)) {
                        Objects.toString(obj);
                        Iterator it5 = arrayList.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            next2.getClass();
                            Objects.toString((View) next2);
                        }
                    }
                }
                if (axVar.c) {
                    objP2 = cyVar.p(objP2, obj);
                    dgVar3 = dgVar;
                    it2 = it3;
                    z = z3;
                    objP = obj5;
                } else {
                    objP = cyVar.p(obj5, obj);
                    dgVar3 = dgVar;
                    it2 = it3;
                    z = z3;
                }
            } else {
                dgVar3 = dgVar;
            }
        }
        Object objB = this.d.b(objP2, objP, this.j);
        if (ch.X(2)) {
            Objects.toString(objB);
        }
        return new uev(arrayList6, objB);
    }

    private final void h(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = coo.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                childAt.getClass();
                h(arrayList, childAt);
            }
        }
    }

    private final void i(ArrayList arrayList, ViewGroup viewGroup, uif uifVar) {
        cr.b(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.l;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            int[] iArr = con.a;
            arrayList2.add(cog.e(view));
            cog.j(view, null);
        }
        if (ch.X(2)) {
            Iterator it = this.k.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                View view2 = (View) next;
                Objects.toString(view2);
                int[] iArr2 = con.a;
                cog.e(view2);
            }
            Iterator it2 = arrayList3.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                View view3 = (View) next2;
                Objects.toString(view3);
                int[] iArr3 = con.a;
                cog.e(view3);
            }
        }
        uifVar.a();
        cy cyVar = this.d;
        ArrayList arrayList4 = this.k;
        yd ydVar = this.m;
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            int[] iArr4 = con.a;
            String strE = cog.e(view4);
            arrayList5.add(strE);
            if (strE != null) {
                cog.j(view4, null);
                String str = (String) ydVar.get(strE);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i3))) {
                        cog.j((View) arrayList3.get(i3), strE);
                        break;
                    }
                    i3++;
                }
            }
        }
        cnz.b(viewGroup, new hts(size2, arrayList3, arrayList2, arrayList4, arrayList5, 1));
        cr.b(arrayList, 0);
        cyVar.l(this.j, arrayList4, arrayList3);
    }

    @Override // defpackage.de
    public final void a(ViewGroup viewGroup) {
        this.q.a();
    }

    @Override // defpackage.de
    public final void b(ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                dg dgVar = ((ax) it.next()).a;
                if (ch.X(2)) {
                    Objects.toString(viewGroup);
                    Objects.toString(dgVar);
                }
                dgVar.f(this);
            }
            return;
        }
        Object obj = this.g;
        if (obj != null) {
            this.d.t(obj);
            if (ch.X(2)) {
                Objects.toString(this.b);
                Objects.toString(this.c);
                return;
            }
            return;
        }
        dg dgVar2 = this.c;
        dg dgVar3 = this.b;
        uev uevVarG = g(viewGroup, dgVar2, dgVar3);
        Object obj2 = uevVarG.a;
        Object obj3 = uevVarG.b;
        List list = this.a;
        ArrayList arrayList = (ArrayList) obj2;
        ArrayList<dg> arrayList2 = new ArrayList(ske.bq(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ax) it2.next()).a);
        }
        for (dg dgVar4 : arrayList2) {
            cy cyVar = this.d;
            bm bmVar = dgVar4.a;
            cyVar.r(obj3, this.q, new at(dgVar4, this, 2));
        }
        i(arrayList, viewGroup, new au(this, viewGroup, obj3, 0));
        if (ch.X(2)) {
            Objects.toString(dgVar3);
            Objects.toString(dgVar2);
        }
    }

    @Override // defpackage.de
    public final void c(ViewGroup viewGroup) {
        Object obj;
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                dg dgVar = ((ax) it.next()).a;
                if (ch.X(2)) {
                    Objects.toString(viewGroup);
                    Objects.toString(dgVar);
                }
            }
            return;
        }
        if (f() && (obj = this.j) != null && !d()) {
            Objects.toString(obj);
            Objects.toString(this.b);
            Objects.toString(this.c);
        }
        if (d() && f()) {
            uka ukaVar = new uka();
            uev uevVarG = g(viewGroup, this.c, this.b);
            Object obj2 = uevVarG.a;
            Object obj3 = uevVarG.b;
            List list = this.a;
            ArrayList arrayList = (ArrayList) obj2;
            ArrayList<dg> arrayList2 = new ArrayList(ske.bq(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ax) it2.next()).a);
            }
            for (dg dgVar2 : arrayList2) {
                av avVar = new av(ukaVar, 0);
                cy cyVar = this.d;
                bm bmVar = dgVar2.a;
                cyVar.z(obj3, this.q, avVar, new at(dgVar2, this, 3));
            }
            i(arrayList, viewGroup, new ayd(this, viewGroup, obj3, ukaVar, 1));
        }
    }

    @Override // defpackage.de
    public final boolean d() {
        cy cyVar = this.d;
        if (!cyVar.n()) {
            return false;
        }
        List list = this.a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = ((ax) it.next()).b;
                if (obj == null || !cyVar.o(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.j;
        return obj2 == null || cyVar.o(obj2);
    }

    @Override // defpackage.de
    public final void e(na naVar) {
        Object obj = this.g;
        if (obj != null) {
            this.d.w(obj, naVar.a);
        }
    }

    public final boolean f() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((ax) it.next()).a.a.s) {
                return false;
            }
        }
        return true;
    }
}
