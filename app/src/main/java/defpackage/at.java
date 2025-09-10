package defpackage;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public at(coi coiVar, Typeface typeface, int i) {
        this.c = i;
        this.a = coiVar;
        this.b = typeface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [cnh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [dua, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 0;
        switch (this.c) {
            case 0:
                cy.y((View) this.a, (Rect) this.b);
                return;
            case 1:
                ((dh) this.a).d((dg) this.b);
                return;
            case 2:
                ah.b((dg) this.a, (aw) this.b);
                return;
            case 3:
                ah.b((dg) this.a, (aw) this.b);
                return;
            case 4:
                Iterator it = ((aw) this.b).a.iterator();
                while (it.hasNext()) {
                    dg dgVar = ((ax) it.next()).a;
                    View view = dgVar.a.P;
                    if (view != null) {
                        a.aV(dgVar.h, view, (ViewGroup) this.a);
                    }
                }
                return;
            case 5:
                dh dhVar = (dh) this.a;
                List list = dhVar.b;
                Object obj = this.b;
                if (list.contains(obj)) {
                    dg dgVar2 = (dg) obj;
                    int i2 = dgVar2.h;
                    View view2 = dgVar2.a.P;
                    view2.getClass();
                    a.aV(i2, view2, dhVar.a);
                    return;
                }
                return;
            case 6:
                dh dhVar2 = (dh) this.a;
                List list2 = dhVar2.b;
                Object obj2 = this.b;
                list2.remove(obj2);
                dhVar2.c.remove(obj2);
                return;
            case 7:
                ?? r0 = this.a;
                Object obj3 = this.b;
                try {
                    r0.run();
                    return;
                } finally {
                    ((dy) obj3).a();
                }
            case 8:
                ?? r02 = this.a;
                int size = r02.size();
                while (i < size) {
                    nxa nxaVar = (nxa) r02.get(i);
                    Object obj4 = this.b;
                    lg lgVar = nxaVar.a;
                    int i3 = nxaVar.b;
                    int i4 = nxaVar.c;
                    int i5 = nxaVar.d;
                    int i6 = nxaVar.e;
                    View view3 = lgVar.a;
                    int i7 = i5 - i3;
                    int i8 = i6 - i4;
                    if (i7 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i8 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                    jd jdVar = (jd) obj4;
                    jdVar.e.add(lgVar);
                    viewPropertyAnimatorAnimate.setDuration(((kn) obj4).j).setListener(new iz(jdVar, lgVar, i7, view3, i8, viewPropertyAnimatorAnimate)).start();
                    i++;
                }
                ((ArrayList) r02).clear();
                ((jd) this.b).b.remove((Object) r02);
                return;
            case 9:
                ?? r03 = this.a;
                int size2 = r03.size();
                while (i < size2) {
                    jc jcVar = (jc) r03.get(i);
                    Object obj5 = this.b;
                    lg lgVar2 = jcVar.a;
                    View view4 = lgVar2 == null ? null : lgVar2.a;
                    lg lgVar3 = jcVar.b;
                    View view5 = lgVar3 != null ? lgVar3.a : null;
                    if (view4 != null) {
                        ViewPropertyAnimator duration = view4.animate().setDuration(((kn) obj5).k);
                        jd jdVar2 = (jd) obj5;
                        jdVar2.g.add(jcVar.a);
                        duration.translationX(jcVar.e - jcVar.c);
                        duration.translationY(jcVar.f - jcVar.d);
                        duration.alpha(0.0f).setListener(new ja(jdVar2, jcVar, duration, view4)).start();
                    }
                    if (view5 != null) {
                        jd jdVar3 = (jd) obj5;
                        ArrayList arrayList = jdVar3.g;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view5.animate();
                        arrayList.add(jcVar.b);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(((kn) obj5).k).alpha(1.0f).setListener(new jb(jdVar3, jcVar, viewPropertyAnimatorAnimate2, view5)).start();
                    }
                    i++;
                }
                ((ArrayList) r03).clear();
                ((jd) this.b).c.remove((Object) r03);
                return;
            case 10:
                ?? r04 = this.a;
                int size3 = r04.size();
                while (i < size3) {
                    lg lgVar4 = (lg) r04.get(i);
                    Object obj6 = this.b;
                    View view6 = lgVar4.a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view6.animate();
                    jd jdVar4 = (jd) obj6;
                    jdVar4.d.add(lgVar4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(((kn) obj6).h).setListener(new iy(jdVar4, lgVar4, view6, viewPropertyAnimatorAnimate3)).start();
                    i++;
                }
                ((ArrayList) r04).clear();
                ((jd) this.b).a.remove((Object) r04);
                return;
            case 11:
                kk.m((bjc) this.a, (LongSparseArray) this.b);
                return;
            case 12:
                ((coi) this.a).i((Typeface) this.b);
                return;
            case 13:
                this.b.accept(this.a);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj7 = this.b;
                Object obj8 = this.a;
                int i9 = cui.a;
                Throwable th = (Throwable) obj7;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(obj8)), th);
                throw th;
            case 15:
                cyl cylVar = (cyl) this.b;
                if (cylVar.f()) {
                    cylVar.c();
                } else {
                    cylVar.b(this.a);
                }
                cylVar.f = 3;
                return;
            case 16:
                Object obj9 = this.b;
                try {
                    this.a.run();
                    return;
                } finally {
                    ((dcx) obj9).a();
                }
            case 17:
                ((dtt) this.b).c.ei(this.a);
                return;
            case 18:
                ((dvp) this.a).b.accept(this.b);
                return;
            case 19:
                Object obj10 = this.a;
                Object obj11 = this.b;
                synchronized (((dxj) obj11).f) {
                    Iterator it2 = ((dxj) obj11).e.iterator();
                    while (it2.hasNext()) {
                        ((dwy) it2.next()).a((ebm) obj10, false);
                    }
                }
                return;
            default:
                dwj.b();
                int i10 = dyw.d;
                ebx ebxVar = (ebx) this.a;
                String str = ebxVar.b;
                ((dyw) this.b).a.c(ebxVar);
                return;
        }
    }

    public /* synthetic */ at(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ at(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public at(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
