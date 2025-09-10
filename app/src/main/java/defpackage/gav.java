package defpackage;

import android.content.res.Resources;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Range;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gav implements paq {
    private gau A;
    private final gay C;
    private final luj D;
    private final hbj E;
    private final qrh F;
    private final cxb G;
    private final qqq H;
    private final mwq I;
    public final ndj a;
    public final naw b;
    public final String c;
    private final owf d;
    private final owf e;
    private final owf f;
    private final owf g;
    private final owf h;
    private final owq i;
    private final kgk j;
    private final gnt k;
    private final out l;
    private final owq m;
    private final lti n;
    private final owq o;
    private final owf p;
    private final pjp q;
    private final rwc r;
    private final gag s;
    private pka t;
    private final owq v;
    private final owq w;
    private final owf x;
    private final owf y;
    private final owq z;
    private final Object B = new Object();
    private final owq u = new ovx(gas.UNINITIALIZED);

    public gav(Resources resources, qrh qrhVar, mwq mwqVar, kgk kgkVar, owf owfVar, owq owqVar, owf owfVar2, owq owqVar2, owq owqVar3, owf owfVar3, gay gayVar, cxb cxbVar, gnt gntVar, ndj ndjVar, naw nawVar, out outVar, luj lujVar, hbj hbjVar, pjp pjpVar, owf owfVar4, owq owqVar4, lti ltiVar, rwc rwcVar, qqq qqqVar, gag gagVar, owf owfVar5, owf owfVar6, owq owqVar5, owf owfVar7, owq owqVar6, owf owfVar8) {
        this.F = qrhVar;
        this.I = mwqVar;
        this.j = kgkVar;
        this.f = owfVar;
        this.i = owqVar;
        this.e = owfVar2;
        this.v = owqVar2;
        this.w = owqVar3;
        this.x = owfVar3;
        this.C = gayVar;
        this.G = cxbVar;
        this.k = gntVar;
        this.a = ndjVar;
        this.b = nawVar;
        this.l = outVar;
        this.c = resources.getString(R.string.pref_camera_video_flashmode_torch);
        this.m = owqVar4;
        this.n = ltiVar;
        this.o = owqVar5;
        this.p = owfVar7;
        this.D = lujVar;
        this.E = hbjVar;
        this.q = pjpVar;
        this.d = owfVar4;
        this.r = rwcVar;
        this.H = qqqVar;
        this.s = gagVar;
        this.h = owfVar5;
        this.g = owfVar6;
        this.z = owqVar6;
        this.y = owfVar8;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, owq] */
    public final synchronized gau a() {
        gau gauVar;
        synchronized (this.B) {
            gnt gntVar = this.k;
            if (gntVar.a() == this.t && (gauVar = this.A) != null) {
                return gauVar;
            }
            cxb cxbVar = this.G;
            gdo gdoVar = gdo.CAPTURE_SESSION;
            cxbVar.w(gdoVar).d(this);
            this.t = gntVar.a();
            kgw kgwVar = (kgw) gntVar.d().c();
            hbj hbjVar = this.E;
            kqx kqxVar = !hbjVar.p(gzo.Z) ? new kqx(this.d, this.e, kgwVar, hbjVar, this.q) : (hbjVar.p(gza.b) && gntVar.a().equals(pka.BACK)) ? new kqx(this.d, this.e, kgwVar, pae.b, hbjVar, this.q, kgwVar.i()) : new kqx(this.d, this.e, kgwVar, pae.i(this.H.D(gntVar.a()).c()), hbjVar, this.q, kgwVar.i());
            ovx ovxVar = new ovx(kgwVar.i());
            owf owfVarH = owl.h(ovxVar, new fhy(9));
            MeteringRectangle[] meteringRectangleArr = kgc.a;
            kgc kgcVar = kgb.a;
            ovx ovxVar2 = new ovx(kgcVar);
            ovx ovxVar3 = new ovx(kgcVar);
            kfp kfpVar = new kfp(ovxVar2, owfVarH);
            kfs kfsVar = new kfs(ovxVar3, owfVarH);
            ovx ovxVar4 = new ovx(false);
            luj lujVar = this.D;
            owf owfVarH2 = owl.h(lujVar.a(luf.E), new fym(this, 2));
            lur lurVar = luf.K;
            owf owfVarH3 = owl.h(lujVar.a(lurVar), new fhy(10));
            owf owfVar = this.g;
            owf owfVarH4 = owl.h(owfVar, new fhy(11));
            our ourVarW = cxbVar.w(gdoVar);
            if (gntVar.i()) {
                ourVarW.d(owl.c(owfVarH3, owfVarH4, owfVarH2).dK(new fpe(ovxVar4, 18), this.l));
            } else if (gntVar.j()) {
                ourVarW.d(lujVar.a(luf.F).dK(new fcs(this, ovxVar4, 9), this.l));
            }
            owq owqVar = this.i;
            owqVar.a(true);
            ovx ovxVar5 = new ovx(false);
            ovx ovxVar6 = new ovx(false);
            qrh qrhVar = this.F;
            ?? r9 = qrhVar.f;
            fcs fcsVar = new fcs(ovxVar5, ovxVar6, 10);
            sxo sxoVar = sxo.a;
            ourVarW.d(r9.dK(fcsVar, sxoVar));
            owf owfVar2 = this.j.a;
            ourVarW.d(owfVar2.dK(new fpe(ovxVar5, 19), sxoVar));
            ourVarW.d(ovxVar4.dK(new fcs(ovxVar5, ovxVar6, 11), sxoVar));
            ourVarW.d(kqxVar.dK(new fcs(ovxVar5, ovxVar6, 8), sxoVar));
            owq owqVar2 = this.u;
            ourVarW.d(owqVar2.dK(new fpe(this, 17), this.l));
            gay gayVar = this.C;
            ovx ovxVar7 = gayVar.a;
            ovx ovxVar8 = gayVar.b;
            owf owfVar3 = this.f;
            owfVar3.getClass();
            owfVar2.getClass();
            rwc rwcVar = this.r;
            rwc rwcVarJ = rwcVar.h() ? rwc.j(((qqq) rwcVar.c()).c) : rvk.a;
            owq owqVar3 = this.v;
            owqVar3.getClass();
            owq owqVar4 = this.w;
            owqVar4.getClass();
            owf owfVar4 = this.x;
            owf owfVar5 = this.e;
            owfVar5.getClass();
            ?? r7 = qrhVar.d;
            ?? r0 = this.I.a;
            owqVar.getClass();
            ovx ovxVar9 = new ovx(gat.UNINITIALIZED);
            owq owqVarA = lujVar.a(lurVar);
            ovx ovxVar10 = new ovx(true);
            ovx ovxVar11 = new ovx(false);
            owq owqVar5 = this.m;
            owqVar5.getClass();
            lti ltiVar = this.n;
            ltiVar.getClass();
            gag gagVar = this.s;
            owf owfVar6 = this.h;
            owfVar6.getClass();
            owfVar.getClass();
            owq owqVar6 = this.o;
            owqVar6.getClass();
            ovx ovxVar12 = new ovx(new Range(60, 60));
            owf owfVar7 = this.y;
            owfVar7.getClass();
            owf owfVar8 = this.p;
            owfVar8.getClass();
            owq owqVar7 = this.z;
            owqVar7.getClass();
            gau gauVar2 = new gau(r9, owfVar5, ovxVar2, ovxVar3, ovxVar, r7, r0, owqVar, ovxVar4, ovxVar9, owqVar2, owqVarA, ovxVar5, ovxVar6, ovxVar10, ovxVar11, owqVar5, rwcVarJ, owqVar3, owqVar4, owfVar4, ovxVar12, owfVar8, owfVar2, owfVar3, ovxVar7, ovxVar8, kfpVar, kfsVar, gagVar, owfVar6, owfVar, owqVar6, owfVar7, kqxVar, ltiVar, owqVar7);
            this.A = gauVar2;
            return gauVar2;
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.B) {
            this.A = null;
        }
    }
}
