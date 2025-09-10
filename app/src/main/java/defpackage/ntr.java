package defpackage;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.widget.ImageButton;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceUi;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import com.google.ar.core.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ntr implements paq, mxl {
    private static final sgv v = sgv.g("ntr");
    public final gnt a;
    public final out b;
    public final rwc c;
    public final uem d;
    public final owq e;
    public final owf h;
    public final owf i;
    public boolean j;
    public AnimatorSet k;
    public ImageButton l;
    public ManualWhiteBalanceUi m;
    public nty n;
    public final owf q;
    public final owq r;
    public final uem s;
    public final fdq t;
    public final mwq u;
    public final owq f = new ovx(false);
    public final owq g = new ovx(false);
    public mxm o = mxm.PORTRAIT;
    public boolean p = false;

    public ntr(fdq fdqVar, gnt gntVar, out outVar, rwc rwcVar, uem uemVar, owq owqVar, mwq mwqVar, luj lujVar, owf owfVar, owf owfVar2, owq owqVar2, uem uemVar2) {
        this.t = fdqVar;
        this.e = owqVar;
        this.a = gntVar;
        this.b = outVar;
        this.c = rwcVar;
        this.d = uemVar;
        this.u = mwqVar;
        gzi gziVar = gzj.a;
        this.h = lujVar.a(luf.aZ);
        this.i = owfVar;
        this.q = owfVar2;
        this.r = owqVar2;
        this.s = uemVar2;
    }

    public final void a(boolean z, boolean z2) {
        if (this.m == null) {
            return;
        }
        this.b.c(new nto(this, z2, z, 0));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.g.a(false);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, owq] */
    public final void e(boolean z) {
        owq owqVar = this.f;
        Boolean boolValueOf = Boolean.valueOf(z);
        owqVar.a(boolValueOf);
        rwc rwcVar = this.c;
        if (rwcVar.h()) {
            ((qqq) rwcVar.c()).e.a(boolValueOf);
        }
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) throws Resources.NotFoundException {
        this.o = mxmVar;
        ((ckl) this.m.getLayoutParams()).setMargins(0, mxjVar.equals(mxj.JARVIS_LAYOUT) ? this.m.getResources().getDimensionPixelSize(R.dimen.manual_wb_top_margin_jarvis) : 0, 0, 0);
        this.m.d(this.o, mxjVar, (nkw) this.e.dL());
    }

    public final void f(boolean z, boolean z2) {
        if (((Boolean) ((ovx) this.h).d).booleanValue() && !((Boolean) this.i.dL()).booleanValue()) {
            this.b.c(new nto(this, z2, z, 2));
        }
    }

    public final void g(boolean z, boolean z2) {
        if (((Boolean) ((ovx) this.h).d).booleanValue()) {
            if (!z) {
                this.l.setAlpha(true == z2 ? 1.0f : 0.0f);
                this.l.setVisibility(true != z2 ? 8 : 0);
            } else if (z2) {
                this.l.animate().setStartDelay(0L).alpha(1.0f).withStartAction(new ntd(this, 3));
            } else {
                this.l.animate().setStartDelay(0L).alpha(0.0f).withEndAction(new ntd(this, 4));
            }
        }
    }

    public final void h(int i) {
        if (((Boolean) ((ovx) this.h).d).booleanValue()) {
            jsv.J(this.n != null, this.s);
            nty ntyVar = this.n;
            ManualWhiteBalanceUi manualWhiteBalanceUi = ntyVar.g;
            if (manualWhiteBalanceUi.getVisibility() == 0) {
                ntyVar.k();
                manualWhiteBalanceUi.postDelayed(ntyVar.j, i);
            }
        }
    }

    public final void d() {
        ((sgt) v.c().M(5589)).s(JvFFEwFNdCrxf.mKOVXmJ);
        owq owqVar = this.r;
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.h = Optional.empty();
        owqVar.a(jjpVar);
        g(true, false);
        e(false);
        if (((Boolean) ((ovx) this.h).d).booleanValue()) {
            this.m.b().setProgress(100);
        }
        this.n.e();
    }
}
