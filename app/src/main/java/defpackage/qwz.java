package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.ContentObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwz {
    public static qwz a;
    public boolean b;
    public final Object c;
    public final Object d;

    public qwz() {
        this.b = false;
        this.c = null;
        this.d = null;
    }

    static synchronized void a() {
        Object obj;
        qwz qwzVar = a;
        if (qwzVar != null && (obj = qwzVar.c) != null && qwzVar.d != null && qwzVar.b) {
            ((Context) obj).getContentResolver().unregisterContentObserver((ContentObserver) a.d);
        }
        a = null;
    }

    static /* synthetic */ String f(Object obj, qxt qxtVar, String str) {
        return str + qxtVar.d() + ": " + String.valueOf(obj);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, utj] */
    public final void b(boolean z) {
        Float fD;
        if (this.b) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                gwv gwvVar = (gwv) ((rnu) it.next()).a;
                ValueAnimator valueAnimator = gwvVar.p;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    nhy nhyVarF = gwvVar.f();
                    gvk gvkVar = (gvk) gwvVar.S.h.c();
                    if (gvkVar != null) {
                        Float f = (Float) gwvVar.g.dL();
                        if (nhyVarF == null) {
                            List list = gwvVar.J;
                            f.getClass();
                            fD = gsn.D(list, z, f.floatValue());
                        } else {
                            Set set = nhyVarF.b;
                            ArrayList arrayList = new ArrayList(ske.bq(set, 10));
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                float fIntValue = ((Number) it2.next()).intValue();
                                int i = nhyVarF.a;
                                arrayList.add(gsn.V(fIntValue / (i - 1), gvkVar.d, gvkVar.e, gwvVar.U));
                            }
                            f.getClass();
                            fD = gsn.D(arrayList, z, f.floatValue());
                        }
                        if (fD != null) {
                            float fFloatValue = fD.floatValue();
                            if (nhyVarF == null) {
                                gwv.H(gwvVar, f.floatValue(), fD.floatValue(), 0, null, null, 60);
                            } else {
                                gwvVar.y(fFloatValue);
                            }
                            gwvVar.R.r(9, f.floatValue(), fFloatValue, ((goi) gwvVar.d.dL()).a());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, utj] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable, java.lang.Object] */
    public final void c(float f) {
        gvk gvkVar;
        if (this.b) {
            nmu nmuVar = (nmu) this.c;
            nmuVar.a(f);
            ?? r6 = this.d;
            float f2 = nmuVar.a;
            Iterator it = r6.iterator();
            while (it.hasNext()) {
                gwv gwvVar = (gwv) ((rnu) it.next()).a;
                if (gwvVar.f() != null && (gvkVar = (gvk) gwvVar.S.h.c()) != null) {
                    owq owqVar = gwvVar.g;
                    owqVar.dL().getClass();
                    float fM = ukc.m((((((Number) r3).floatValue() + 0.33f) * f2) * f2) - 0.33f, gvkVar.d, gvkVar.e);
                    owqVar.a(Float.valueOf(fM));
                    if (gwvVar.G || !((Boolean) gwvVar.f.dL()).booleanValue()) {
                        gwvVar.v(fM, null, niz.f);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object] */
    public final void d() {
        if (this.b) {
            ((nmu) this.c).b();
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                gwv gwvVar = (gwv) ((rnu) it.next()).a;
                if (gwvVar.G || !((Boolean) gwvVar.f.dL()).booleanValue()) {
                    gwvVar.t.b(true);
                }
                if (((Boolean) gwvVar.h.dL()).booleanValue()) {
                    gwvVar.t(true, gwq.c);
                }
                Object objDL = gwvVar.g.dL();
                objDL.getClass();
                gwvVar.C = ((Number) objDL).floatValue();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    public final void e(int i) {
        if (this.b) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                gwv gwvVar = (gwv) ((rnu) it.next()).a;
                gwvVar.x(((Number) gwvVar.g.dL()).floatValue());
                if (((Boolean) gwvVar.h.dL()).booleanValue()) {
                    gwvVar.t(false, gwq.a);
                }
                if (gwvVar.G || !((Boolean) gwvVar.f.dL()).booleanValue()) {
                    gwvVar.t.b(false);
                }
                mdy mdyVar = gwvVar.R;
                int i2 = i + (-1) != 0 ? 4 : 8;
                float f = gwvVar.C;
                Object objDL = gwvVar.g.dL();
                objDL.getClass();
                mdyVar.r(i2, f, ((Number) objDL).floatValue(), ((goi) gwvVar.d.dL()).a());
            }
        }
    }

    public qwz(iug iugVar, uhf uhfVar) {
        this.c = iugVar;
        this.d = uhfVar;
    }

    public qwz(Context context) {
        this.b = false;
        this.c = context;
        this.d = new qwy();
    }

    public qwz(Executor executor) {
        executor.getClass();
        this.c = new Object();
        this.d = new ArrayList();
    }

    public qwz(fdq fdqVar, out outVar, owq owqVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, ovx ovxVar, owf owfVar5, owq owqVar2, owf owfVar6, owf owfVar7, owf owfVar8) {
        outVar.getClass();
        owqVar.getClass();
        owfVar.getClass();
        owfVar2.getClass();
        owfVar3.getClass();
        owfVar4.getClass();
        ovxVar.getClass();
        owfVar5.getClass();
        owqVar2.getClass();
        owfVar6.getClass();
        owfVar7.getClass();
        owfVar8.getClass();
        this.c = new nmu(3);
        this.d = new ArrayList();
        this.b = true;
        our ourVarJ = fdqVar.j();
        ourVarJ.getClass();
        int i = 20;
        ourVarJ.d(owb.a(owl.g(owqVar, owfVar, owfVar2, owfVar3, owfVar4, owl.h(ovxVar, new fgb(i)), owl.h(owfVar5, new hia(1)), owl.h(owfVar6, new fdz(owqVar2, 12)), owl.h(owfVar7, new fdz(owfVar8, 13)))).dK(new fnb(this, i), outVar));
    }
}
