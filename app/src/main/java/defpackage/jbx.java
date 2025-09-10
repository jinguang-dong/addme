package defpackage;

import android.os.CountDownTimer;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jbx extends kfn {
    final /* synthetic */ jby a;
    private final boolean b;

    public jbx(jby jbyVar, boolean z) {
        this.a = jbyVar;
        this.b = z;
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void b() {
        jby jbyVar = this.a;
        jbyVar.x.c();
        jbyVar.b(false);
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void c(long j) {
        jby jbyVar = this.a;
        if (jbyVar.q.l() || this.b) {
            out outVar = jbyVar.c;
            kez kezVar = jbyVar.l;
            kezVar.getClass();
            outVar.execute(new jbh(kezVar, 19));
        }
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void e(float f) {
        if (f == 0.0f) {
            this.a.G(false, this.b);
        }
        jby jbyVar = this.a;
        jbyVar.Q.g(f);
        ndj ndjVar = jbyVar.n;
        ndjVar.J((int) (100.0f * f));
        jbyVar.e.b();
        if (f == 1.0f) {
            jbyVar.I(false);
            ndjVar.t();
            CountDownTimer countDownTimer = jbyVar.O;
            if (countDownTimer != null) {
                countDownTimer.onFinish();
            }
        }
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void f(float f, int i) {
        if (f == 0.0f) {
            jby jbyVar = this.a;
            jbyVar.G(true, true);
            jbyVar.Q.e();
        }
        jby jbyVar2 = this.a;
        jtl jtlVar = jbyVar2.j;
        nhm nhmVar = jtlVar.b;
        nhmVar.i = i;
        int i2 = (int) (100.0f * f);
        nhmVar.c(i2);
        if (i2 >= 100) {
            jtlVar.a.c = true;
        } else {
            jtlVar.a.c = false;
        }
        jbyVar2.n.J(i2);
        jbyVar2.e.b();
        if (f == 1.0f) {
            jbyVar2.Q.a();
            jbyVar2.E.b();
            jbyVar2.I(true);
        }
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void g(float f, long j) {
        float f2;
        jby jbyVar = this.a;
        boolean zL = jbyVar.q.l();
        if (f == 0.0f) {
            jbyVar.G(zL, this.b);
            if (zL) {
                jbyVar.x.b();
                jbyVar.Q.e();
                long jMax = Math.max(j + 500, 1000L);
                f2 = f;
                jbyVar.O = new jbw(this, jMax, TimeUnit.SECONDS.toMillis(1L), f2);
                jbyVar.O.start();
                jbyVar.E.d();
                j = jMax;
            } else {
                f2 = f;
                jbyVar.C.C(j);
                jbyVar.w.i(new jbv(this, 0));
            }
        } else {
            f2 = f;
        }
        ndj ndjVar = jbyVar.n;
        int i = (int) (f2 * 100.0f);
        ndjVar.K(i, j, zL);
        jbyVar.C.D(i);
        if (zL) {
            jbyVar.j.f(i);
        } else {
            if (jbyVar.w.n()) {
                jbyVar.Q.g(f2);
            }
            rwc rwcVar = jbyVar.z;
            if (rwcVar.h()) {
                ((ftv) rwcVar.c()).m(Duration.ofMillis(j), i);
            }
        }
        jbyVar.e.b();
        if (f2 == 1.0f) {
            jbyVar.I(zL);
            if (zL) {
                jbyVar.x.c();
                jbyVar.Q.a();
                jbyVar.E.b();
            } else {
                jbyVar.af.u(j);
                ndjVar.t();
                jbyVar.w.h();
            }
            CountDownTimer countDownTimer = jbyVar.O;
            if (countDownTimer != null) {
                countDownTimer.onFinish();
            }
        }
    }
}
