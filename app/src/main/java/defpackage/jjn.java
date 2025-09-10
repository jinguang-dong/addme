package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.ar.core.R;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jjn implements nkm, jhh, jhg, jfv, jfs {
    public static final sgv a = sgv.g("jjn");
    private static final scn p = scn.J(nkw.AMBER, nkw.IMAX, nkw.SERENGETI, nkw.COTTAGE);
    private final owf A;
    private final owf B;
    private final owf C;
    private final owf D;
    private final hyh E;
    private final owf F;
    private final owf G;
    private final syu H;
    private final owf I;
    private final owf J;
    private final tzj K;
    private final owf L;
    private final owf M;
    private final owf N;
    private final mtm R;
    private final hbj S;
    private final ocq T;
    public final owf b;
    public final out c;
    public final sbp d;
    public final owf e;
    public final owf f;
    public final owq g;
    public final jgt i;
    public final owq j;
    public final jkq k;
    public final our m;
    public final gln n;
    public final mdy o;
    private final owf q;
    private final owq s;
    private final Handler t;
    private final pbn u;
    private final owf v;
    private final owf w;
    private final owf x;
    private final owf y;
    private final Optional z;
    public Optional h = Optional.empty();
    public boolean l = false;
    private boolean O = false;
    private boolean P = false;
    private Optional Q = Optional.empty();

    public jjn(ocq ocqVar, owf owfVar, Handler handler, jgt jgtVar, fdq fdqVar, sbp sbpVar, out outVar, pbn pbnVar, owf owfVar2, owf owfVar3, owf owfVar4, owq owqVar, gln glnVar, owf owfVar5, owq owqVar2, owf owfVar6, owf owfVar7, owf owfVar8, owf owfVar9, owf owfVar10, mdy mdyVar, hyh hyhVar, owf owfVar11, owf owfVar12, owf owfVar13, mtm mtmVar, owf owfVar14, owf owfVar15, tzj tzjVar, hbj hbjVar, owq owqVar3, owf owfVar16, jkq jkqVar, owf owfVar17, owf owfVar18, owf owfVar19) {
        this.u = pbnVar;
        our ourVarJ = fdqVar.j();
        this.m = ourVarJ;
        this.b = owfVar2;
        this.q = owfVar3;
        this.T = ocqVar;
        this.c = outVar;
        this.t = handler;
        this.d = sbpVar;
        this.s = owqVar;
        this.y = owfVar;
        this.e = owfVar4;
        this.n = glnVar;
        this.A = owfVar5;
        this.g = owqVar2;
        this.v = owfVar6;
        this.w = owfVar7;
        this.x = owfVar8;
        this.B = owfVar9;
        this.C = owfVar10;
        this.i = jgtVar;
        this.o = mdyVar;
        this.E = hyhVar;
        this.F = owfVar11;
        this.f = owfVar12;
        this.D = owfVar13;
        this.R = mtmVar;
        this.G = owfVar14;
        this.S = hbjVar;
        this.I = owfVar15;
        this.K = tzjVar;
        this.j = owqVar3;
        this.L = owfVar16;
        this.k = jkqVar;
        this.J = owfVar17;
        this.M = owfVar18;
        this.N = owfVar19;
        this.z = Collection.EL.stream(sbpVar).filter(new hzk(11)).map(new hci(10)).findFirst();
        this.H = owl.l(mtmVar.d, ourVarJ);
    }

    public static final void B(jjv jjvVar, boolean z) {
        if (z) {
            jjvVar.g();
        } else {
            jjvVar.d();
        }
    }

    private final synchronized paq C() {
        jxh jxhVar;
        jxhVar = new jxh(this, 1);
        this.n.a(jxhVar);
        return new ffx(this, jxhVar, 16, null);
    }

    private final synchronized void D() {
        int i = 9;
        if (this.O) {
            if (!this.P) {
                Collection.EL.stream(this.d).filter(new hsj(3)).forEach(new jgf(7));
                Optional optional = this.Q;
                mtm mtmVar = this.R;
                mtmVar.getClass();
                optional.ifPresent(new gok(mtmVar, i));
            }
            w();
        } else {
            Collection.EL.stream(this.d).filter(new hsj(4)).forEach(new jgf(8));
            Optional optional2 = this.Q;
            mtm mtmVar2 = this.R;
            mtmVar2.getClass();
            optional2.ifPresent(new gok(mtmVar2, i));
            this.z.ifPresent(new gok(this, 10));
        }
        this.Q = Optional.empty();
    }

    private final synchronized void E() {
        this.Q = Optional.of(this.R.a());
        this.O = A();
        this.P = ((Optional) this.g.dL()).equals(Optional.of(jjt.NIGHT_SIGHT));
        this.k.e();
        this.z.ifPresent(new ird(this, 10));
    }

    private final synchronized void F() {
        this.k.f(jjs.WHITEBALANCE, true);
    }

    private final void G(Runnable runnable) {
        ske.W(this.H, new jjm(runnable, 0), this.c);
    }

    public final boolean A() {
        return this.k.i();
    }

    public final synchronized void b(boolean z) {
        if (this.b.dL() == nkw.NIGHT_SIGHT) {
            boolean zEquals = ((Optional) this.g.dL()).equals(Optional.of(jjt.NIGHT_SIGHT));
            jkq jkqVar = this.k;
            jjs jjsVar = jjs.NIGHT_SIGHT;
            boolean z2 = true;
            if ((z || !((Optional) this.G.dL()).isPresent()) && !((Boolean) this.M.dL()).booleanValue()) {
                z2 = false;
            }
            jkqVar.f(jjsVar, z2);
            if (zEquals && z && !((Boolean) this.M.dL()).booleanValue()) {
                jkqVar.h(Optional.empty());
            }
        }
    }

    public final synchronized void c(boolean z) {
        boolean zEquals = ((Optional) this.g.dL()).equals(Optional.of(jjt.NIGHT_SIGHT));
        boolean z2 = true;
        boolean z3 = z || ((nkw) this.b.dL()).equals(nkw.NIGHT_SIGHT);
        owf owfVar = this.b;
        boolean z4 = (((nkw) owfVar.dL()).equals(nkw.SERENGETI) || ((nkw) owfVar.dL()).equals(nkw.TIME_LAPSE) || (((nkw) owfVar.dL()).equals(nkw.NIGHT_SIGHT) && ((Optional) this.G.dL()).isEmpty())) ? false : true;
        jkq jkqVar = this.k;
        jjs jjsVar = jjs.NIGHT_SIGHT;
        if (!z3 || !z4) {
            z2 = false;
        }
        jkqVar.f(jjsVar, z2);
        if (!zEquals || (z3 && z4)) {
            return;
        }
        jkqVar.h(Optional.empty());
    }

    public final synchronized void d(boolean z) {
        this.k.f(jjs.BLUR, z);
    }

    @Override // defpackage.jhg
    public final void eu() {
        if (((hne) this.K.a()).d()) {
            return;
        }
        q();
    }

    public final synchronized void f(boolean z) {
        if (z) {
            this.k.e();
        }
    }

    public final synchronized void g(hhv hhvVar) {
        boolean zEquals = hhvVar.equals(hhv.SINGLE);
        boolean zEquals2 = hhvVar.equals(hhv.DUAL_INDEPENDENT);
        jkq jkqVar = this.k;
        jkqVar.f(jjs.SINGLE_EXPOSURE, zEquals);
        jkqVar.f(jjs.DUAL_EXPOSURE, zEquals2);
    }

    public final synchronized void h(boolean z) {
        if (z) {
            this.k.e();
            this.z.ifPresent(new jjk(this, z, 0));
        } else {
            this.z.ifPresent(new jjk(this, z, 0));
        }
    }

    public final synchronized void i(nkw nkwVar) {
        t();
        if (nkwVar == nkw.NIGHT_SIGHT) {
            this.k.f(jjs.NIGHT_SIGHT, ((Optional) this.G.dL()).isPresent());
        } else {
            this.k.f(jjs.NIGHT_SIGHT, ((Boolean) this.E.d().dL()).booleanValue());
        }
    }

    public final synchronized void j(boolean z) {
        if (z) {
            E();
        } else {
            D();
        }
    }

    public final synchronized void k(boolean z) {
        jkq jkqVar = this.k;
        jjt jjtVar = jjt.NIGHT_SIGHT;
        jkqVar.g(jjtVar, z);
        if (!z) {
            if (this.h.equals(Optional.of(jjtVar))) {
                this.h = Optional.empty();
            }
            if (((Optional) this.g.dL()).equals(Optional.of(jjtVar))) {
                jkqVar.h(this.h);
            }
        }
    }

    public final synchronized void l(jjs jjsVar, boolean z) {
        this.k.f(jjsVar, z);
        Collection.EL.stream(this.d).filter(new jjj(jjsVar, 1)).map(new hci(10)).forEach(new jgf(5));
    }

    @Override // defpackage.jfv
    public final void m(Intent intent) {
        q();
        u(true);
        s(sbp.m(jjs.PRO_FOCUS, jjs.PRO_NONFOCUS));
    }

    public final synchronized void n(boolean z) {
        this.k.f(jjs.VIDEO_SPEED_SLOWMOTION, z);
    }

    public final synchronized void o(boolean z) {
        this.k.f(jjs.VIDEO_SPEED_TIMELAPSE, z);
    }

    public final void p() {
        sbp sbpVar = this.d;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            jju jjuVar = (jju) sbpVar.get(i);
            if (jjuVar.c() != jjt.NIGHT_SIGHT) {
                jjuVar.e.d();
            } else if (((Boolean) this.f.dL()).booleanValue()) {
                owf owfVar = this.G;
                if (!((Optional) owfVar.dL()).isPresent() || ((Duration) ((Optional) owfVar.dL()).get()).compareTo(fue.a) < 0) {
                    gzi gziVar = hac.a;
                    G(new iyz(jjuVar, 12));
                }
            } else {
                G(new iyz(jjuVar, 12));
            }
        }
        this.g.a(Optional.empty());
        if (((Boolean) this.I.dL()).booleanValue() || ((Boolean) this.f.dL()).booleanValue() || !z()) {
            return;
        }
        u(true);
    }

    public final synchronized void q() {
        this.k.e();
        p();
    }

    @Override // defpackage.jfs
    public final synchronized boolean r() {
        if (!A()) {
            return false;
        }
        q();
        return true;
    }

    public final synchronized void s(sbp sbpVar) {
        int i = 5;
        Collection.EL.stream(this.d).filter(new glx(sbpVar, i)).map(new hci(10)).forEach(new jgf(i));
    }

    public final synchronized void t() {
        this.k.e();
        s(sbp.n(jjs.SINGLE_EXPOSURE, jjs.WHITEBALANCE, jjs.DUAL_EXPOSURE));
    }

    public final void u(boolean z) {
        this.z.ifPresentOrElse(new jjk(this, z, 1), new iwh(3));
    }

    public final synchronized void v() {
        this.k.h(this.h);
    }

    public final synchronized void w() {
        if (this.k.j()) {
            v();
        }
    }

    public final synchronized void x(jjt jjtVar) {
        this.h = Optional.of(jjtVar);
        if (A()) {
            this.k.h(this.h);
        } else {
            w();
        }
    }

    public final synchronized void y() {
        out.a();
        byte[] bArr = null;
        this.k.k(new rnu(this, bArr), new rnu(this, bArr));
        ocq ocqVar = this.T;
        ViewStub viewStub = (ViewStub) ocqVar.c(R.id.autobahn_controls);
        viewStub.setLayoutResource(R.layout.manual_controls);
        viewStub.inflate().findViewById(R.id.autobahn_controls);
        int i = 10;
        jaq jaqVar = new jaq(this, i);
        out outVar = this.c;
        paq paqVarDK = this.v.dK(jaqVar, outVar);
        our ourVar = this.m;
        ourVar.d(paqVarDK);
        int i2 = 11;
        ourVar.d(this.w.dK(new jaq(this, i2), outVar));
        ourVar.d(this.x.dK(new jaq(this, 12), outVar));
        ourVar.d(this.s.dK(new jaq(this, 13), outVar));
        int i3 = 14;
        ourVar.d(this.B.dK(new jbp(this, i3), outVar));
        ourVar.d(this.C.dK(new jaq(this, i3), outVar));
        ourVar.d(owb.a(this.b).dK(new jaq(this, 15), outVar));
        ourVar.d(this.q.dK(new jaq(this, 16), outVar));
        ourVar.d(this.e.dK(new jaq(this, 18), outVar));
        jaq jaqVar2 = new jaq(this, 19);
        owf owfVar = this.y;
        ourVar.d(owfVar.dK(jaqVar2, outVar));
        ourVar.d(C());
        ourVar.d(this.I.dK(new jaq(this, 20), outVar));
        ourVar.d(this.J.dK(new jjl(this, 1), outVar));
        hyh hyhVar = this.E;
        int i4 = 0;
        ourVar.d(hyhVar.d().dK(new jjl(this, i4), outVar));
        ourVar.d(owb.a(this.F).dK(new jaq(this, 3), outVar));
        G(new iyz(this, i));
        ourVar.d(hyhVar.e().dK(new jaq(this, 4), outVar));
        ourVar.d(owb.a(this.j).dK(new jaq(this, 5), outVar));
        ourVar.d(owb.a(this.L).dK(new jaq(this, 6), outVar));
        ourVar.d(owb.a(this.N).dK(new jaq(this, 7), outVar));
        F();
        outVar.c(new iyz(this, i2));
        sbp sbpVar = this.d;
        int size = sbpVar.size();
        while (i4 < size) {
            jju jjuVar = (jju) sbpVar.get(i4);
            jjv jjvVar = jjuVar.e;
            ourVar.d(jjvVar.a((View) ocqVar.c(jjuVar.d)));
            owf owfVar2 = this.A;
            jjvVar.getClass();
            ourVar.d(owfVar2.dK(new jaq(jjvVar, 8), outVar));
            ourVar.d(owfVar.dK(new jaq(jjvVar, 9), outVar));
            i4++;
        }
    }

    public final boolean z() {
        owf owfVar = this.b;
        return ((nkw) owfVar.dL()).equals(nkw.TIME_LAPSE) ? ((Boolean) this.D.dL()).booleanValue() : !p.contains(owfVar.dL());
    }

    @Override // defpackage.nkm
    public final void a() {
        this.t.post(this.u.c(mNLbzhCxd.LaUkux, new iyz(this, 13)));
    }
}
