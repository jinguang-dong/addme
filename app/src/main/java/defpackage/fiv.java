package defpackage;

import com.google.ar.core.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fiv extends fqf implements kfm {
    private static final sgv v = sgv.g("fiv");
    private final mes A;
    private final jub B;
    private final juh C;
    private final uem D;
    private final fel E;
    private final owf F;
    private jtg G;
    private our H;
    private our I;
    private fly J;
    private final kgp K;
    private final mbj L;
    private final hbj M;
    public final jtl a;
    public final ndj b;
    public final owq c;
    public final moy d;
    public final fbq e;
    public final rwc f;
    public final out g;
    public final fjm h;
    public final itl i;
    public final owf j;
    public final ngw l;
    public meu m;
    public boolean n;
    public boolean o;
    public final iyu q;
    public final ktx r;
    public jth s;
    private final pbn w;
    private final kgt x;
    private final gnt y;
    private final iqj z;
    public final AtomicReference k = new AtomicReference(fne.a);
    public final itk p = new ijd(this, 1);

    public fiv(pbn pbnVar, hbj hbjVar, jtl jtlVar, ndj ndjVar, kgt kgtVar, iyu iyuVar, kgp kgpVar, gnt gntVar, owq owqVar, moy moyVar, mes mesVar, jub jubVar, fjm fjmVar, fbq fbqVar, rwc rwcVar, rwc rwcVar2, out outVar, juh juhVar, itl itlVar, owf owfVar, uem uemVar, mbj mbjVar, fel felVar, ktx ktxVar, owf owfVar2, ngw ngwVar) {
        this.w = pbnVar;
        this.M = hbjVar;
        this.a = jtlVar;
        this.b = ndjVar;
        this.x = kgtVar;
        this.q = iyuVar;
        this.K = kgpVar;
        this.y = gntVar;
        this.c = owqVar;
        this.d = moyVar;
        this.e = fbqVar;
        this.z = (iqj) rwcVar.e(new fiu());
        this.f = rwcVar2;
        this.g = outVar;
        this.m = (meu) mesVar.a();
        this.A = mesVar;
        this.B = jubVar;
        this.h = fjmVar;
        this.C = juhVar;
        this.i = itlVar;
        this.j = owfVar;
        this.D = uemVar;
        this.L = mbjVar;
        this.E = felVar;
        this.r = ktxVar;
        this.F = owfVar2;
        this.l = ngwVar;
    }

    private final void G() {
        jtg jtgVar = this.G;
        if (jtgVar == null) {
            return;
        }
        if (jtgVar.isDone()) {
            jth jthVar = this.s;
            if (jthVar != null) {
                jthVar.close();
                this.s = null;
            }
        } else {
            this.G.cancel(false);
        }
        this.G = null;
    }

    private final void H() {
        pbp pbpVarA = this.w.a("AllInMode#startCameraFromCameraSetting");
        G();
        jtg jtgVarA = this.K.a(this.y, this.x, nkw.COTTAGE);
        this.G = jtgVarA;
        ske.W(jtgVarA, new iiz(this, pbpVarA, 1), this.g);
    }

    @Override // defpackage.fqf
    public final rwc a() {
        return rwc.i(this.s);
    }

    @Override // defpackage.kfm
    public final void b() {
        this.h.c(fjl.BY_CAPTURE_COMMAND);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        k(false);
    }

    @Override // defpackage.kfm
    public final void d() {
        this.q.K.o();
    }

    @Override // defpackage.fqf
    protected final void eA() {
        p();
    }

    @Override // defpackage.fqf
    public final void eB() {
        if (this.t) {
            H();
        }
    }

    @Override // defpackage.fqf
    protected final void eC() {
        this.I = this.H.c();
        ktx ktxVar = this.r;
        final boolean z = ktxVar.e;
        ktxVar.j(true);
        this.I.d(new paq() { // from class: fir
            @Override // defpackage.paq, java.lang.AutoCloseable
            public final void close() {
                this.a.r.j(z);
            }
        });
        if (this.M.p(gyi.u)) {
            this.z.ek(iqh.SATURN, false);
        }
    }

    public final void k(boolean z) {
        if (this.t) {
            this.q.K.l(z, false);
            fly flyVar = this.J;
            if (flyVar != null) {
                flyVar.d(z);
            }
        }
    }

    @Override // defpackage.fqf
    protected final void l() {
        pbn pbnVar = this.w;
        pbnVar.f("AllIn-ModuleStart");
        this.H = new our();
        fly flyVarA = ((flz) this.D).a();
        flyVarA.b();
        this.H.d(new fis(flyVarA, 0));
        this.J = flyVarA;
        k(false);
        this.H.d(this.h.a());
        this.H.d(this.F.dK(new fbt(this, 9), this.g));
        this.a.d();
        gnt gntVar = this.y;
        if (gntVar.j()) {
            gntVar.g();
        }
        H();
        this.i.b(this.p);
        this.H.d(new fis(this, 2));
        this.H.d(this.b.e(new fit(this)));
        this.C.b(this, nkw.COTTAGE, this.H);
        fel felVar = this.E;
        felVar.b();
        our ourVar = this.H;
        felVar.getClass();
        ourVar.d(new fis(felVar, 3));
        pbnVar.g();
    }

    @Override // defpackage.fqf
    protected final void m() {
        pbn pbnVar = this.w;
        pbnVar.f("AllIn-StopModule");
        G();
        this.H.close();
        this.x.d();
        this.o = false;
        pbnVar.g();
    }

    @Override // defpackage.fqf
    public final void n() {
        pbn pbnVar = this.w;
        pbnVar.f("AllInModule#takePictureNow");
        jth jthVar = this.s;
        if (jthVar == null) {
            ((sgt) v.c().M(207)).s("Not taking picture since Camera is closed.");
            return;
        }
        if (!((Boolean) jthVar.b().dL()).booleanValue()) {
            ((sgt) v.c().M(206)).s("Not taking picture since the Camera is not ready to take a picture.");
            return;
        }
        k(false);
        Optional optionalB = this.h.b();
        if (optionalB.isEmpty()) {
            ((sgt) v.c().M(205)).s("Not taking picture since pipeline not ready.");
            return;
        }
        this.a.b();
        syu syuVarD = this.B.d(jthVar, this, this.o, this.m, optionalB);
        this.L.c(R.raw.all_in_shutter);
        syuVarD.c(new fem(this, 12), this.g);
        this.m.a();
        this.m.d();
        this.m = (meu) this.A.a();
        this.o = false;
        pbnVar.g();
    }

    @Override // defpackage.fqf
    public final boolean o() {
        out.a();
        this.h.c(fjl.BY_USER);
        return false;
    }

    @Override // defpackage.fqf
    protected final void p() {
        this.I.close();
    }

    @Override // defpackage.kfm
    public final /* synthetic */ void c(long j) {
    }

    @Override // defpackage.kfm
    public final /* synthetic */ void e(float f) {
    }

    @Override // defpackage.kfm
    public final /* synthetic */ void f(float f, int i) {
    }

    @Override // defpackage.kfm
    public final /* synthetic */ void g(float f, long j) {
    }
}
