package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtu implements jub {
    private final hbj A;
    private final gox B;
    private final hkk C;
    private final qqq D;
    public lss a;
    private final jid b;
    private final mft c;
    private final lrd d;
    private final owq e;
    private final owq f;
    private final owf g;
    private final owf h;
    private final owq i;
    private final owq j;
    private final String k;
    private final String l;
    private final owq m;
    private final owq n;
    private final owf o;
    private final lsa p;
    private meu q;
    private final lae r;
    private final rwc s;
    private final AccessibilityManager t;
    private final uem u;
    private final fhj v;
    private final owf w;
    private final lrp x;
    private final ktx y;
    private final luj z;

    public jtu(jid jidVar, mft mftVar, lrp lrpVar, ktx ktxVar, lrd lrdVar, Context context, owq owqVar, owq owqVar2, owf owfVar, owq owqVar3, owq owqVar4, owq owqVar5, owq owqVar6, owf owfVar2, luj lujVar, owq owqVar7, hbj hbjVar, hkk hkkVar, lsa lsaVar, qqq qqqVar, lae laeVar, rwc rwcVar, gox goxVar, AccessibilityManager accessibilityManager, uem uemVar, fhj fhjVar, owf owfVar3) {
        this.b = jidVar;
        this.c = mftVar;
        this.x = lrpVar;
        this.y = ktxVar;
        this.d = lrdVar;
        this.e = owqVar;
        this.g = owfVar2;
        this.f = owqVar2;
        this.h = owfVar;
        this.i = owqVar3;
        this.j = owqVar4;
        this.k = context.getResources().getString(R.string.pref_camera_video_flashmode_torch);
        this.l = context.getResources().getString(R.string.pref_camera_video_flashmode_off);
        this.m = owqVar5;
        this.n = owqVar6;
        this.z = lujVar;
        this.o = owqVar7;
        this.A = hbjVar;
        this.C = hkkVar;
        this.p = lsaVar;
        this.D = qqqVar;
        this.r = laeVar;
        this.s = rwcVar;
        this.B = goxVar;
        this.t = accessibilityManager;
        this.u = uemVar;
        this.v = fhjVar;
        this.w = owfVar3;
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

    @Override // defpackage.jub
    public final syu c(jth jthVar, kfm kfmVar, boolean z, meu meuVar) {
        this.q = meuVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = ((Boolean) this.i.dL()).booleanValue() && ((Boolean) this.j.dL()).booleanValue();
        qqq qqqVar = this.D;
        jtd jtdVar = jthVar.b;
        lsc lscVarG = this.C.g(this.c.a(jCurrentTimeMillis), this.b.a(), qqqVar.s(jCurrentTimeMillis, z2), rwc.j(this.q), ((Boolean) this.w.dL()).booleanValue());
        ktx ktxVar = this.y;
        pas pasVar = jtdVar.d.b;
        pas pasVarD = jsv.k(ktxVar.l()) ? pasVar.d() : pasVar.e();
        this.x.c(lscVarG);
        this.p.a(lscVarG);
        lscVarG.Z(pasVarD);
        synchronized (this) {
            this.a = lscVarG;
        }
        hbj hbjVar = this.A;
        boolean z3 = hbjVar.p(hae.r) && ((Boolean) this.i.dL()).booleanValue() && ((Boolean) this.j.dL()).booleanValue() && !(jthVar.c.K() && this.o.dL() == nkw.IMAGE_INTENT && hbjVar.p(hae.q));
        kfk kfkVarA = kfl.a();
        kfkVarA.b(kfmVar);
        kfkVarA.e(this.d.a);
        kgw kgwVar = jthVar.c;
        kfkVarA.c(kgwVar.l());
        kfkVarA.a = kgwVar.O();
        kfkVarA.c = owp.a(false);
        kfkVarA.d(z3);
        kfkVarA.g(false);
        kfkVarA.h(true);
        syu syuVarE = jthVar.e(kfkVarA.a(), lscVarG);
        lscVarG.S();
        boolean z4 = kgwVar.l() == pka.FRONT;
        String str = z4 ? (String) this.z.b(luf.J) : this.l;
        String str2 = this.k;
        luj lujVar = this.z;
        boolean zEquals = str.equals(str2);
        boolean z5 = ((Integer) lujVar.b(luf.d)).intValue() != mus.OFF.e;
        ltq ltqVarA = ltq.a(((Integer) (z4 ? this.n : this.m).dL()).intValue());
        rwc rwcVar = this.s;
        rwc rwcVarJ = rwcVar.h() ? rwc.j(((qqq) rwcVar.c()).x()) : rvk.a;
        mdm mdmVarO = lscVarG.o();
        jjc jjcVarA = jjd.a();
        jjcVarA.m(ssc.NIGHT_SIGHT);
        jjcVarA.a = lscVarG.w() + "." + ppo.c.k;
        jjcVarA.i(z4);
        owf owfVar = this.h;
        jjcVarA.t(((Float) owfVar.dL()).floatValue());
        jjcVarA.g(str);
        jjcVarA.b(((Boolean) this.g.dL()).booleanValue());
        jjcVarA.j(z5);
        jjcVarA.q(((ltw) this.e.dL()).h);
        jjcVarA.s(z);
        jjcVarA.b = kgwVar.i();
        jjcVarA.l(zEquals);
        jjcVarA.n(false);
        jjcVarA.o(((Boolean) this.f.dL()).booleanValue());
        jjcVarA.f = ltqVarA.b();
        jjcVarA.k(lscVarG.n() == ltg.MARS_STORE);
        jjcVarA.f(this.r.d());
        jjcVarA.c = rwcVarJ;
        jjcVarA.e(this.B.u());
        jjcVarA.p(this.t.isTouchExplorationEnabled());
        jjcVarA.d = rwc.j(((HotshotController) this.u.a()).b());
        jjcVarA.c(this.v.a());
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
        syuVarE.c(new jnw(this, lscVarG, 6, null), sxo.a);
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
