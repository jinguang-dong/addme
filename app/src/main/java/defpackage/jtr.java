package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtr implements jub {
    public lss a;
    private final jid b;
    private final mft c;
    private final lrd d;
    private final owf e;
    private final owf f;
    private final owq g;
    private final owf h;
    private final lsa i;
    private final lae j;
    private final rwc k;
    private final AccessibilityManager l;
    private final uem m;
    private final fhj n;
    private final hyh o;
    private final owf p;
    private meu q;
    private final ltf r;
    private final lrp s;
    private final ktx t;
    private final luj u;
    private final tdy v;
    private final gox w;
    private final qqq x;

    public jtr(jid jidVar, mft mftVar, lrp lrpVar, ktx ktxVar, lrd lrdVar, owq owqVar, owq owqVar2, owf owfVar, owf owfVar2, luj lujVar, tdy tdyVar, lsa lsaVar, qqq qqqVar, lae laeVar, rwc rwcVar, gox goxVar, AccessibilityManager accessibilityManager, uem uemVar, fhj fhjVar, hyh hyhVar, owf owfVar3, ltf ltfVar) {
        this.b = jidVar;
        this.c = mftVar;
        this.s = lrpVar;
        this.t = ktxVar;
        this.d = lrdVar;
        this.e = owqVar;
        this.f = owfVar2;
        this.g = owqVar2;
        this.h = owfVar;
        this.u = lujVar;
        this.v = tdyVar;
        this.i = lsaVar;
        this.x = qqqVar;
        this.j = laeVar;
        this.k = rwcVar;
        this.w = goxVar;
        this.l = accessibilityManager;
        this.m = uemVar;
        this.r = ltfVar;
        this.n = fhjVar;
        this.o = hyhVar;
        this.p = owfVar3;
    }

    @Override // defpackage.jub
    public final synchronized lss a() {
        throw null;
    }

    @Override // defpackage.jub
    public final synchronized void b() {
        lss lssVar = this.a;
        if (lssVar != null) {
            lssVar.ac(null);
        }
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, uem] */
    @Override // defpackage.jub
    public final syu c(jth jthVar, kfm kfmVar, boolean z, meu meuVar) {
        this.q = meuVar;
        kfk kfkVarA = kfl.a();
        kfkVarA.b(kfmVar);
        kfkVarA.e(this.d.a);
        kgw kgwVar = jthVar.c;
        kfkVarA.c(kgwVar.l());
        kfkVarA.a = kgwVar.O();
        kfkVarA.c = owp.a(false);
        kfkVarA.d(false);
        kfkVarA.g(false);
        kfkVarA.f(((Boolean) this.p.dL()).booleanValue());
        kfkVarA.h(((Boolean) this.o.b.dL()).booleanValue());
        kfl kflVarA = kfkVarA.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ltf ltfVar = ltf.UNKNOWN;
        ltf ltfVar2 = this.r;
        int iOrdinal = ltfVar2.ordinal();
        lsw lswVarU = iOrdinal != 10 ? iOrdinal != 21 ? iOrdinal != 22 ? this.x.u(jCurrentTimeMillis, false) : this.x.p(jCurrentTimeMillis, hqp.ACTION, "ACTION_PAN") : this.x.p(jCurrentTimeMillis, hqp.LANDSCAPE, "LONG_EXPOSURE") : this.x.p(jCurrentTimeMillis, hqp.PORTRAIT, "PORTRAIT");
        jtd jtdVar = jthVar.b;
        tdy tdyVar = this.v;
        String strA = this.c.a(jCurrentTimeMillis);
        fse fseVarA = this.b.a();
        rwc rwcVarJ = rwc.j(this.q);
        Object objA = tdyVar.b.a();
        llm llmVar = (llm) tdyVar.c.a();
        llmVar.getClass();
        pbn pbnVar = (pbn) tdyVar.a.a();
        pbnVar.getClass();
        lsb lsbVar = new lsb((lrm) objA, llmVar, pbnVar, ltfVar2, strA, fseVarA, lswVarU, rwcVarJ, kflVarA);
        ktx ktxVar = this.t;
        pas pasVar = jtdVar.d.b;
        pas pasVarD = jsv.k(ktxVar.l()) ? pasVar.d() : pasVar.e();
        this.s.c(lsbVar);
        this.i.a(lsbVar);
        lsbVar.Z(pasVarD);
        synchronized (this) {
            this.a = lsbVar;
        }
        kgw kgwVar2 = jthVar.c;
        luj lujVar = this.u;
        int iIntValue = ((Integer) lujVar.b(luf.d)).intValue();
        int i = mus.OFF.e;
        boolean z2 = kgwVar2.l() == pka.FRONT;
        luu luuVar = z2 ? luf.v : luf.x;
        rwc rwcVar = this.k;
        rwc rwcVarJ2 = rwcVar.h() ? rwc.j(((qqq) rwcVar.c()).x()) : rvk.a;
        boolean z3 = iIntValue != i;
        mdm mdmVarO = lsbVar.o();
        ltf ltfVar3 = this.r;
        jjc jjcVarA = jjd.a();
        jjcVarA.m(jea.x(ltfVar3));
        jjcVarA.a = lsbVar.w() + "." + ppo.c.k;
        jjcVarA.i(z2);
        owf owfVar = this.h;
        jjcVarA.t(((Float) owfVar.dL()).floatValue());
        jjcVarA.g((String) lujVar.b(luuVar));
        jjcVarA.b(((Boolean) this.f.dL()).booleanValue());
        jjcVarA.j(z3);
        jjcVarA.q(((ltw) this.e.dL()).h);
        jjcVarA.s(z);
        jjcVarA.b = kgwVar2.i();
        jjcVarA.l(((Boolean) lujVar.b(luf.D)).booleanValue());
        jjcVarA.n(false);
        jjcVarA.o(((Boolean) this.g.dL()).booleanValue());
        jjcVarA.k(lsbVar.n() == ltg.MARS_STORE);
        jjcVarA.f(this.j.d());
        jjcVarA.c = rwcVarJ2;
        jjcVarA.e(this.w.u());
        jjcVarA.p(this.l.isTouchExplorationEnabled());
        jjcVarA.d = rwc.j(((HotshotController) this.m.a()).b());
        jjcVarA.c(this.n.a());
        jjcVarA.r(((Boolean) lujVar.b(luf.aU)).booleanValue());
        tpc tpcVarM = sov.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sov.b((sov) tpcVarM.b);
        float fFloatValue = ((Float) owfVar.dL()).floatValue();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sov sovVar = (sov) tpcVarM.b;
        sovVar.b |= 2;
        sovVar.d = fFloatValue;
        jjcVarA.d((sov) tpcVarM.l());
        ((mdo) mdmVarO).H = jjcVarA.a();
        syu syuVarE = jthVar.e(kflVarA, lsbVar);
        syuVarE.c(new jnw(this, lsbVar, 5, null), sxo.a);
        return syuVarE;
    }

    @Override // defpackage.jub
    public final /* synthetic */ syu d(jth jthVar, kfm kfmVar, boolean z, meu meuVar, Optional optional) {
        return jsv.c(this, jthVar, kfmVar, z, meuVar);
    }

    @Override // defpackage.jub
    public final syu e(kfg kfgVar, jtd jtdVar, kfm kfmVar, kgw kgwVar, boolean z, boolean z2, int i, meu meuVar, Optional optional) {
        throw new UnsupportedOperationException("Method is Deprecated");
    }

    @Override // defpackage.jub
    public final synchronized void f(uh uhVar) {
        jtn.a(this.a, uhVar);
    }
}
