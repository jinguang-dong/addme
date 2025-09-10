package defpackage;

import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Handler;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbv implements nqf, paq {
    private final our A;
    private final owf B;
    private long C;
    private rwc E;
    public final mmk a;
    public final msh b;
    public final pka c;
    public final rwc d;
    public final owf e;
    public final rwc f;
    public final owf g;
    public final owf h;
    public final boolean i;
    public our l;
    public paq m;
    public paq n;
    public paq o;
    public paq p;
    public PointF q;
    public fda r;
    public rwc s;
    public rwc t;
    public final FocusIndicatorView u;
    public final hnw v;
    public final syj w;
    public final mwq x;
    private final Handler z;
    public boolean j = false;
    public boolean k = false;
    private boolean D = false;

    public fbv(mmk mmkVar, msh mshVar, pka pkaVar, hnw hnwVar, FocusIndicatorView focusIndicatorView, syj syjVar, Handler handler, rwc rwcVar, our ourVar, rwc rwcVar2, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, owf owfVar5, mwq mwqVar, boolean z) {
        rvk rvkVar = rvk.a;
        this.E = rvkVar;
        this.s = rvkVar;
        this.t = rvkVar;
        this.a = mmkVar;
        this.b = mshVar;
        this.c = pkaVar;
        this.v = hnwVar;
        this.w = syjVar;
        this.u = focusIndicatorView;
        this.z = handler;
        this.d = rwcVar;
        this.A = ourVar;
        this.f = rwcVar2;
        this.e = owfVar;
        this.g = owfVar2;
        this.h = owfVar4;
        this.B = owfVar5;
        this.x = mwqVar;
        this.i = z;
        ourVar.d(this);
        mhd mhdVar = new mhd(this, 1);
        sxo sxoVar = sxo.a;
        ourVar.d(owfVar3.dK(mhdVar, sxoVar));
        ourVar.d(owfVar5.dK(new fbo(this, 2), sxoVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.nqf
    public final void a(PointF pointF) {
        if (((Boolean) this.B.dL()).booleanValue()) {
            return;
        }
        this.q = pointF;
        this.k = false;
        this.D = false;
        this.C = Instant.now().toEpochMilli();
        rwc rwcVarJ = rwc.j(new Runnable() { // from class: fbs
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, nlt] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, nlt] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, nlt] */
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                fbv fbvVar = this.a;
                if (fbvVar.j || !fbvVar.k || fbvVar.b.d()) {
                    return;
                }
                paq paqVar = fbvVar.m;
                if (paqVar != null) {
                    paqVar.close();
                }
                paq paqVar2 = fbvVar.n;
                if (paqVar2 != null) {
                    paqVar2.close();
                }
                paq paqVar3 = fbvVar.o;
                if (paqVar3 != null) {
                    paqVar3.close();
                }
                paq paqVar4 = fbvVar.p;
                if (paqVar4 != null) {
                    paqVar4.close();
                }
                boolean z = fbvVar.i;
                if (z) {
                    fbvVar.p = fbvVar.h.dK(new fbt(fbvVar, 1), sxo.a);
                } else {
                    fbvVar.n = fbvVar.g.dK(new fbt(fbvVar, 0), sxo.a);
                    fbvVar.o = fbvVar.e.dK(new fyo(fbvVar, 1), out.a);
                }
                if (fbvVar.s.h()) {
                    fbvVar.s.c().c();
                }
                if (fbvVar.t.h()) {
                    fbvVar.t.c().c();
                }
                fbvVar.l = new our();
                FocusIndicatorView focusIndicatorView = fbvVar.u;
                focusIndicatorView.s(true);
                fbvVar.w.g(2);
                rwc rwcVar = fbvVar.d;
                if (rwcVar.h()) {
                    if (!z) {
                        ((mhe) rwcVar.c()).l();
                    }
                    ((mhe) rwcVar.c()).f();
                }
                rwc rwcVar2 = fbvVar.f;
                if (rwcVar2.h()) {
                    ((mlw) rwcVar2.c()).n(mlv.TOUCH_TO_FOCUS);
                }
                out.a();
                PointF pointF2 = fbvVar.q;
                focusIndicatorView.k();
                focusIndicatorView.p();
                FocusIndicatorRingView focusIndicatorRingView = focusIndicatorView.m;
                focusIndicatorRingView.b(pointF2);
                nlt nltVarA = focusIndicatorView.i ? focusIndicatorView.v.a() : focusIndicatorView.J.a();
                scn scnVarL = scn.L(hnp.SHAPE, hnp.COLOR, hnp.THICKNESS, hnp.CORNER_RADIUS, hnp.BOUNDARY_CORNER_RADIUS, hnp.BOUNDARY_DIAMETER, hnp.BOUNDARY_THICKNESS, hnp.b);
                focusIndicatorRingView.c();
                if (focusIndicatorView.i) {
                    nltVarA.b(new hnu(focusIndicatorView, scnVarL, 2));
                } else {
                    focusIndicatorView.q.c(scnVarL);
                    nltVarA.b(new hnu(focusIndicatorView, scnVarL, 3));
                }
                fbvVar.s = rwc.j(nltVarA);
                fbvVar.s.c().b(new fbu(fbvVar, 1));
                mmk mmkVar = fbvVar.a;
                hnw hnwVar = fbvVar.v;
                fcy fcyVarE = mmkVar.e();
                fbvVar.r = hnwVar.b(fbvVar.l, fbvVar.c, fbvVar.q, fcyVarE);
                fbvVar.m = fcyVarE.a.dK(new fbt(fbvVar, 2), sxo.a);
                fbvVar.x.h(focusIndicatorView.getContext().getString(R.string.focused_locked_accessibility));
            }
        });
        this.E = rwcVarJ;
        this.z.postDelayed(rwcVarJ.c(), 600L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.nqe
    public final void b() {
        if (((Boolean) this.B.dL()).booleanValue() || !Instant.now().minusMillis(this.C).isBefore(Instant.ofEpochMilli(600L)) || this.D) {
            return;
        }
        e();
        if (this.E.h()) {
            this.z.removeCallbacks(this.E.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.nqe
    public final void c() {
        if (((Boolean) this.B.dL()).booleanValue()) {
            return;
        }
        this.D = true;
        if (this.E.h()) {
            this.z.removeCallbacks(this.E.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.j = true;
        paq paqVar = this.m;
        if (paqVar != null) {
            paqVar.close();
        }
        paq paqVar2 = this.n;
        if (paqVar2 != null) {
            paqVar2.close();
        }
        paq paqVar3 = this.o;
        if (paqVar3 != null) {
            paqVar3.close();
        }
        paq paqVar4 = this.p;
        if (paqVar4 != null) {
            paqVar4.close();
        }
        our ourVar = this.l;
        if (ourVar != null) {
            ourVar.close();
        }
        if (this.E.h()) {
            this.z.removeCallbacks(this.E.c());
            this.E = rvk.a;
        }
    }

    @Override // defpackage.nqf
    public final void d(PointF pointF) {
        if (((Boolean) this.B.dL()).booleanValue()) {
            return;
        }
        this.k = true;
        e();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nlt] */
    public final void e() {
        FocusIndicatorView focusIndicatorView = this.u;
        if (((Boolean) ((ovx) focusIndicatorView.j).d).booleanValue()) {
            focusIndicatorView.s(false);
            rwc rwcVar = this.d;
            if (rwcVar.h()) {
                ((mhe) rwcVar.c()).s();
            }
            fda fdaVar = this.r;
            if (fdaVar != null) {
                fdaVar.j();
            }
            rwc rwcVar2 = this.f;
            if (rwcVar2.h()) {
                ((mlw) rwcVar2.c()).k(mlv.TOUCH_TO_FOCUS);
            }
            out.a();
            focusIndicatorView.k();
            focusIndicatorView.o.c(true);
            nlt nltVarA = focusIndicatorView.L.a();
            nltVarA.b(new fbu(focusIndicatorView, 12));
            rwc rwcVarJ = rwc.j(nltVarA);
            this.t = rwcVarJ;
            rwcVarJ.c().b(new fbu(this, 0));
        }
    }
}
