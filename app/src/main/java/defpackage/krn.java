package defpackage;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.camera.optionsbar.view.TimerWidget;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krn implements paq, mxl {
    private static final ksa m = ksa.TIMER_ZERO_SECONDS;
    public final Executor a;
    public final our b;
    public final owf c;
    public final owf d;
    public final owf e;
    public final boolean f;
    public final owf g;
    public final owf h;
    public ryq i;
    public kto j;
    public TimerWidget k;
    public final krj l;
    private final Context n;
    private final owq o;
    private final owf p;
    private final krz q;
    private final AtomicBoolean r = new AtomicBoolean();
    private mxj s = mxj.PHONE_LAYOUT;
    private ViewPropertyAnimator t;
    private final mwq u;

    public krn(Context context, krz krzVar, owq owqVar, Executor executor, owf owfVar, fdq fdqVar, owf owfVar2, owf owfVar3, hbj hbjVar, owf owfVar4, owf owfVar5, owf owfVar6, owf owfVar7, krj krjVar, mwq mwqVar) {
        this.n = context;
        this.b = fdqVar.j().c();
        this.q = krzVar;
        this.o = owqVar;
        this.a = executor;
        this.c = owfVar;
        this.d = owfVar2;
        this.e = owfVar3;
        boolean z = false;
        if ((hbjVar.p(gzo.bD) || hbjVar.p(hac.L)) && ((Boolean) owfVar4.dL()).booleanValue()) {
            z = true;
        }
        this.f = z;
        this.p = owfVar5;
        this.g = owfVar6;
        this.h = owfVar7;
        this.l = krjVar;
        this.u = mwqVar;
    }

    private final void g(boolean z, boolean z2) {
        ViewPropertyAnimator viewPropertyAnimator = this.t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.t = null;
        }
        float f = true != z2 ? 0.0f : 1.0f;
        if (!z) {
            this.k.setAlpha(f);
            this.k.setVisibility(true != z2 ? 8 : 0);
        } else {
            ViewPropertyAnimator viewPropertyAnimatorWithEndAction = this.k.animate().alpha(f).setDuration(300L).setInterpolator(new cvn()).withStartAction(new emz(this, z2, 10, (char[]) null)).withEndAction(new emz(this, z2, 11, (char[]) null));
            this.t = viewPropertyAnimatorWithEndAction;
            viewPropertyAnimatorWithEndAction.start();
        }
    }

    private final boolean h() {
        return this.s.equals(mxj.JARVIS_LAYOUT);
    }

    public final void a(boolean z) {
        if (this.r.get()) {
            g(z, false);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    public final void d(boolean z) {
        if (h() && ((nkw) this.c.dL()).b()) {
            if (this.r.compareAndSet(false, true)) {
                e();
                our ourVar = this.b;
                owq owqVar = this.o;
                juf jufVar = new juf(this, 14);
                Executor executor = this.a;
                ourVar.d(owqVar.dK(jufVar, executor));
                ourVar.d(owb.a(this.p).dK(new juf(this, 15), executor));
            }
            g(z, true);
        }
    }

    public final void e() {
        if (this.k == null) {
            return;
        }
        krq krqVarCg = qpt.cg(this.q, this.n.getResources());
        out.a();
        ksa ksaVar = (ksa) ((sew) this.i).c.get(this.o.dL());
        if (ksaVar == null) {
            ksaVar = m;
        }
        kto ktoVar = new kto(this.k.getContext(), krqVarCg, ksaVar, new ksc() { // from class: krm
            @Override // defpackage.ksc
            public final void w(ksa ksaVar2, krs krsVar, int i) {
                if (krsVar.equals(krs.TIMER)) {
                    this.a.l.w(ksaVar2, krsVar, 3);
                }
            }
        }, null, null, 0, true, this.u);
        this.j = ktoVar;
        TimerWidget timerWidget = this.k;
        kto ktoVar2 = timerWidget.a;
        if (ktoVar2 != null) {
            timerWidget.a().removeView(ktoVar2);
        }
        timerWidget.a = ktoVar;
        timerWidget.a().addView(ktoVar);
        this.j.k();
        this.j.j();
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        this.s = mxjVar;
        f(false);
    }

    public final void f(boolean z) {
        Object objDL = this.p.dL();
        gxj gxjVar = gxj.b;
        if (!h() || !((nkw) this.c.dL()).b() || ((Boolean) this.d.dL()).booleanValue() || ((Boolean) this.e.dL()).booleanValue() || ((Boolean) this.g.dL()).booleanValue() || ((Boolean) this.h.dL()).booleanValue() || objDL == gxjVar) {
            a(z);
        } else {
            d(z);
        }
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
