package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jax extends ndp {
    public final /* synthetic */ jbc a;

    public jax(jbc jbcVar) {
        this.a = jbcVar;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void a() {
        jbc jbcVar = this.a;
        if (jbcVar.C == null) {
            ((sgt) jbc.a.c().M(2568)).v("Not taking picture since Camera is %s", jbcVar.B != null ? "starting" : "closed");
            return;
        }
        if (jbcVar.K()) {
            return;
        }
        jbcVar.F.g();
        if (jbcVar.W.h()) {
            return;
        }
        ltw ltwVar = (ltw) jbcVar.H.dL();
        int i = ltwVar.h;
        if (i > 0) {
            jbcVar.I(i, false);
            return;
        }
        if (ltwVar != ltw.AUTO) {
            jbcVar.n();
            return;
        }
        mbj mbjVar = jbcVar.aB;
        if (mbjVar.l()) {
            jbcVar.M.d();
        } else if (mbjVar.m()) {
            jbcVar.M.c();
        } else {
            ((sgt) jbc.a.c().M(2598)).s("Not starting or stopping auto-timer capture since the state is disabled.");
        }
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void b(boolean z) {
        jbc jbcVar = this.a;
        jbcVar.J = z;
        if (!z) {
            rwc rwcVar = jbcVar.m;
            if (rwcVar.h()) {
                gzi gziVar = gzz.a;
                return;
            }
            return;
        }
        rwc rwcVar2 = jbcVar.m;
        if (rwcVar2.h()) {
            jmw jmwVar = (jmw) rwcVar2.c();
            SystemClock.elapsedRealtime();
            gzi gziVar2 = gzz.a;
            jmwVar.h.g();
        }
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void c() {
        this.a.an.K.j();
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void d() {
        jbc jbcVar = this.a;
        jbcVar.F.e();
        jbcVar.an.K.i();
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void f() {
        jbc jbcVar = this.a;
        if (jbcVar.M()) {
            jbcVar.k.b(2);
        }
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void g() {
        jbc jbcVar = this.a;
        if (jbcVar.M()) {
            jbcVar.am.b(2);
            new Handler(Looper.getMainLooper()).post(new ivi(this, 18));
        }
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void h() {
        jbc jbcVar = this.a;
        if (jbcVar.M()) {
            jbcVar.k.a(2);
        }
    }
}
