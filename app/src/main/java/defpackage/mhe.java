package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhe implements mlu {
    public mhh A;
    public final sbk C;
    public our D;
    public final luj E;
    public final luj F;
    public final mdy G;
    public final hbj H;
    private final owq I;
    private final owf J;
    private final owf K;
    private final out L;
    private final gnt M;
    private final Handler N;
    private Context O;
    private rwc P;
    private nan Q;
    private nan R;
    private nan T;
    private final imi V;
    private final kqy W;
    public final owq a;
    public final owq b;
    public final owq c;
    public final owf d;
    public final owf e;
    public final owq f;
    public final owf g;
    public final ffq h;
    public final mhp i;
    public final mhq j;
    public final rwc k;
    public final hyh l;
    public FocusIndicatorView m;
    public nan n;
    public mhh z;
    public mhh o = null;
    public rwc p = null;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public int t = 0;
    public int u = 0;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public int B = 0;
    private int S = 0;
    private final Object U = new Object();

    public mhe(owq owqVar, owq owqVar2, owq owqVar3, owq owqVar4, owf owfVar, owf owfVar2, owq owqVar5, owf owfVar3, owf owfVar4, ffq ffqVar, owf owfVar5, imi imiVar, gnt gntVar, mhq mhqVar, mhp mhpVar, mdy mdyVar, hbj hbjVar, rwc rwcVar, kqy kqyVar, luj lujVar, luj lujVar2, out outVar, hyh hyhVar) {
        int i = sbp.d;
        this.C = new sbk();
        this.D = null;
        this.a = owqVar;
        this.b = owqVar2;
        this.c = owqVar3;
        this.I = owqVar4;
        this.d = owfVar;
        this.e = owfVar2;
        this.f = owqVar5;
        this.g = owfVar3;
        this.J = owfVar4;
        this.h = ffqVar;
        this.K = owfVar5;
        this.V = imiVar;
        this.i = mhpVar;
        this.j = mhqVar;
        this.G = mdyVar;
        this.H = hbjVar;
        this.k = rwcVar;
        this.W = kqyVar;
        this.E = lujVar;
        this.F = lujVar2;
        this.L = outVar;
        this.M = gntVar;
        this.N = new Handler(Looper.getMainLooper());
        this.l = hyhVar;
    }

    private final nan w(int i, boolean z) {
        nao naoVar = new nao();
        naoVar.e = this.O.getString(i);
        naoVar.h = this.O;
        naoVar.a = z;
        naoVar.i = 1;
        return naoVar.a();
    }

    private final void x(Runnable runnable) {
        if (out.d()) {
            runnable.run();
        } else {
            this.N.post(runnable);
        }
    }

    private final void y(rwc rwcVar, mhg mhgVar) {
        u(rwcVar, mhgVar, false);
    }

    private final boolean z() {
        return this.s && this.H.p(gzy.l);
    }

    public final synchronized paq a(nkw nkwVar) {
        int i = 17;
        if (!this.M.i()) {
            return new fgp(17);
        }
        this.D = new our();
        hbj hbjVar = this.H;
        if (!hbjVar.p(gzy.l)) {
            this.Q = w(R.string.taxi_turned_on, true);
            this.R = w(R.string.taxi_turned_off, true);
            this.n = w(R.string.taxi_thermal_throttle_hint, false);
            this.h.a = true;
        }
        rwc rwcVar = this.k;
        if (rwcVar.h()) {
            ((mlw) rwcVar.c()).j(mlv.TAXI, this);
        }
        our ourVar = this.D;
        ourVar.getClass();
        ourVar.d(new khc(this, 12));
        int i2 = 3;
        if (this.P.h()) {
            ((FocusIndicatorAccessoryView) this.P.c()).setOnClickListener(new ktm(this, nkwVar, i2));
        }
        our ourVar2 = this.D;
        ourVar2.getClass();
        owq owqVar = this.b;
        mhd mhdVar = new mhd(this, 0);
        out outVar = this.L;
        ourVar2.d(owqVar.dK(mhdVar, outVar));
        if (hbjVar.p(gzy.o)) {
            our ourVar3 = this.D;
            ourVar3.getClass();
            ourVar3.d(this.a.dK(new mhd(this, 2, (byte[]) null), outVar));
        }
        our ourVar4 = this.D;
        ourVar4.getClass();
        ourVar4.d(this.K.dK(new lqn(this, i), outVar));
        our ourVar5 = this.D;
        ourVar5.getClass();
        ourVar5.d(this.I.dK(new lld(this, 16), outVar));
        if (hbjVar.p(gzy.t)) {
            our ourVar6 = this.D;
            ourVar6.getClass();
            ourVar6.d(this.f.dK(new lqn(this, 18), outVar));
        }
        our ourVar7 = this.D;
        ourVar7.getClass();
        ourVar7.d(this.g.dK(new mhd(this, 3, (char[]) null), outVar));
        our ourVar8 = this.D;
        ourVar8.getClass();
        ourVar8.d(this.J.dK(new mhd(this, 4, (short[]) null), outVar));
        our ourVar9 = this.D;
        ourVar9.getClass();
        ourVar9.d(this.l.e().dK(new lld(this, 15), outVar));
        return new kxj(this, 14);
    }

    public final void b(rwc rwcVar) throws Resources.NotFoundException {
        if (this.m == null) {
            return;
        }
        rwc rwcVar2 = this.k;
        if (rwcVar2.h() && !this.v) {
            mlw mlwVar = (mlw) rwcVar2.c();
            mlv mlvVar = mlv.TAXI;
            mlwVar.n(mlvVar);
            ((mlw) rwcVar2.c()).m(mlvVar);
            this.v = true;
        }
        rwc rwcVarJ = rvk.a;
        rwc rwcVar3 = this.p;
        if (rwcVar3 == null || !rwcVar.equals(rwcVar3)) {
            if (z()) {
                t();
            } else {
                FocusIndicatorView focusIndicatorView = this.m;
                focusIndicatorView.k();
                focusIndicatorView.o();
                focusIndicatorView.o.c(false);
                focusIndicatorView.m();
                focusIndicatorView.p();
                focusIndicatorView.l.set(false);
                if (rwcVar.h()) {
                    focusIndicatorView.m.b((PointF) rwcVar.c());
                } else {
                    focusIndicatorView.r();
                }
                nlt nltVarA = focusIndicatorView.G.a();
                nltVarA.b(new fbu(focusIndicatorView, 11));
                rwcVarJ = rwc.j(nltVarA);
            }
        }
        if (!this.H.p(gzy.t)) {
            if (rwcVarJ.h()) {
                ((nly) rwcVarJ.c()).b.c(new lac(this, 13), this.L);
            } else {
                this.m.v();
            }
        }
        this.p = rwcVar;
    }

    @Override // defpackage.mlu
    public final void c() {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b() || !this.w) {
            return;
        }
        this.w = false;
        m(rvk.a);
    }

    @Override // defpackage.mlu
    public final void d(mlv mlvVar) {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b() || !mlvVar.equals(mlv.QR_GLEAMING)) {
            return;
        }
        this.w = true;
        f();
    }

    public final void e() {
        if (this.m == null) {
            return;
        }
        this.p = null;
        nlt nlxVar = new nlx();
        if (z()) {
            t();
        } else {
            nlxVar = this.m.h();
        }
        nlxVar.a().c(new man(this, 15), this.L);
    }

    public final void f() {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b()) {
            return;
        }
        x(new man(this, 14));
        i();
    }

    public final void g() {
        synchronized (this.U) {
            nan nanVar = this.T;
            if (nanVar != null) {
                this.V.f(nanVar);
                this.T = null;
            }
        }
    }

    public final void h() {
        int i;
        int i2;
        if (!this.H.p(gzy.s) || (i = this.B) == 0 || (i2 = this.S) == 0) {
            return;
        }
        this.W.g(false, i, i2, mhe.class.getName(), krs.TAXI);
        this.B = 0;
    }

    public final void i() {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b()) {
            return;
        }
        g();
    }

    public final void j() {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b()) {
            return;
        }
        this.t++;
    }

    public final void k(View view, Context context) {
        this.O = context;
        if (this.m == null) {
            FocusIndicatorView focusIndicatorView = (FocusIndicatorView) view;
            this.m = focusIndicatorView;
            this.P = focusIndicatorView.p;
        }
    }

    public final void l() {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b() || this.H.p(gzy.l) || this.x || !((Boolean) this.d.dL()).booleanValue()) {
            return;
        }
        this.x = true;
        owq owqVar = this.a;
        mhh mhhVar = (mhh) owqVar.dL();
        mhh mhhVar2 = mhh.AUTO;
        if (mhhVar.equals(mhhVar2)) {
            this.o = mhhVar2;
            owqVar.a(mhh.ON);
        }
    }

    public final void m(rwc rwcVar) {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b()) {
            return;
        }
        u(rwcVar, (mhg) this.b.dL(), ((Boolean) this.d.dL()).booleanValue());
    }

    public final void n(boolean z, rwc rwcVar) {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b()) {
            return;
        }
        if (!Build.ID.startsWith("TQ2")) {
            this.s = z;
            if (z) {
                return;
            }
            this.p = null;
            y(rwcVar, (mhg) this.b.dL());
            return;
        }
        boolean z2 = this.s;
        this.s = z;
        if (!z2 || z) {
            return;
        }
        y(rwcVar, (mhg) this.b.dL());
    }

    public final void o(boolean z) {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b()) {
            return;
        }
        this.y = z;
    }

    public final void p(mhh mhhVar) {
        if (this.H.p(gzy.l)) {
            return;
        }
        if (mhhVar == mhh.ON) {
            q(this.Q);
        } else if (mhhVar == mhh.OFF) {
            q(this.R);
        } else {
            g();
        }
    }

    public final void q(nan nanVar) {
        synchronized (this.U) {
            if (nanVar != null) {
                if (!nanVar.equals(this.T)) {
                    g();
                    this.T = nanVar;
                    this.V.a(nanVar);
                }
            }
        }
    }

    public final synchronized void r(mhh mhhVar) {
        hbj hbjVar = this.H;
        if (hbjVar.p(gzy.s)) {
            boolean zEquals = mhhVar.equals(mhh.ON);
            int i = R.drawable.ic_macro_focus_on;
            int i2 = R.string.taxi_name;
            if (!zEquals && !hbjVar.p(gzy.l)) {
                if (mhhVar.equals(mhh.AUTO)) {
                    i = R.drawable.ic_macro_focus_auto;
                } else if (mhhVar.equals(mhh.OFF)) {
                    i2 = R.string.taxi_turned_off;
                    i = R.drawable.ic_macro_focus_off;
                } else {
                    i = 0;
                    i2 = 0;
                }
            }
            if (i != this.B && i != 0) {
                h();
                this.W.g(true, i, i2, mhe.class.getName(), krs.TAXI);
                this.B = i;
                this.S = i2;
            }
        }
    }

    public final void s() {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b() || !this.x || this.y || ((Boolean) ((ovx) this.m.j).d).booleanValue()) {
            return;
        }
        mhh mhhVar = this.o;
        if (mhhVar != null) {
            owq owqVar = this.a;
            if (!mhhVar.equals(owqVar.dL())) {
                owqVar.a(this.o);
            }
            this.o = null;
        }
        this.x = false;
        this.a.dL();
    }

    public final void t() {
        owf owfVar = this.d;
        FocusIndicatorView focusIndicatorView = this.m;
        boolean z = true;
        if (!((Boolean) owfVar.dL()).booleanValue() && !((mhg) this.b.dL()).equals(mhg.TELE_TAXI_ACTIVE)) {
            z = false;
        }
        focusIndicatorView.t(1.0f);
        if (z) {
            focusIndicatorView.q.j(focusIndicatorView.getContext().getColor(R.color.square_focus_ring_color));
            focusIndicatorView.m.invalidate();
            rwc rwcVar = focusIndicatorView.p;
            if (rwcVar.h()) {
                ((FocusIndicatorAccessoryView) rwcVar.c()).setContentDescription(((FocusIndicatorAccessoryView) rwcVar.c()).getResources().getString(R.string.taxi_toggle_on_desc));
                ((FocusIndicatorAccessoryView) rwcVar.c()).setImageDrawable(((FocusIndicatorAccessoryView) rwcVar.c()).getResources().getDrawable(R.drawable.ic_macro_focus_on_new, null));
                return;
            }
            return;
        }
        focusIndicatorView.q.j(focusIndicatorView.getContext().getColor(android.R.color.white));
        focusIndicatorView.m.invalidate();
        rwc rwcVar2 = focusIndicatorView.p;
        if (rwcVar2.h()) {
            ((FocusIndicatorAccessoryView) rwcVar2.c()).setContentDescription(((FocusIndicatorAccessoryView) rwcVar2.c()).getResources().getString(R.string.taxi_toggle_off_desc));
            ((FocusIndicatorAccessoryView) rwcVar2.c()).setImageDrawable(((FocusIndicatorAccessoryView) rwcVar2.c()).getResources().getDrawable(R.drawable.ic_macro_focus_off_new, null));
        }
    }

    public final void u(rwc rwcVar, mhg mhgVar, boolean z) {
        x(new mhc(this, z, mhgVar, rwcVar, 0));
    }

    public final boolean v() {
        our ourVar = this.D;
        if (ourVar == null || ourVar.b()) {
            return false;
        }
        return this.y;
    }
}
