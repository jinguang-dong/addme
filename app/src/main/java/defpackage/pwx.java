package defpackage;

import android.content.Context;
import com.google.android.libraries.mdi.download.foreground.dagger.ForegroundDownloadService;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwx implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final tzx j;
    private final tzx k;
    private final tzx l;
    private final tzx m;
    private final tzx n;
    private final tzx o;
    private final tzx p;
    private final tzx q;
    private final tzx r;

    public pwx(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, tzx tzxVar14, tzx tzxVar15, tzx tzxVar16, tzx tzxVar17, tzx tzxVar18) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
        this.j = tzxVar10;
        this.k = tzxVar11;
        this.l = tzxVar12;
        this.m = tzxVar13;
        this.n = tzxVar14;
        this.o = tzxVar15;
        this.p = tzxVar16;
        this.q = tzxVar17;
        this.r = tzxVar18;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* bridge */ /* synthetic */ Object a() {
        puu puuVar;
        qbq qcbVar;
        Context contextB = ((imm) this.a).b();
        syw sywVar = (syw) this.b.a();
        sbp sbpVar = (sbp) this.c.a();
        qat qatVar = (qat) this.d.a();
        lat latVar = (lat) this.e.a();
        qdf qdfVar = (qdf) this.f.a();
        rwc rwcVarB = ((jaf) this.g).b();
        rww rwwVar = (rww) this.h.a();
        rwc rwcVar = (rwc) ((tzu) this.i).a;
        qaq qaqVar = (qaq) this.j.a();
        qaq qaqVar2 = (qaq) this.k.a();
        pwt pwtVar = (pwt) this.l.a();
        ree reeVar = (ree) this.m.a();
        rwc rwcVar2 = (rwc) ((tzu) this.n).a;
        puu puuVar2 = (puu) this.o.a();
        rwc rwcVar3 = (rwc) ((tzu) this.p).a;
        rwc rwcVar4 = (rwc) ((tzu) this.q).a;
        rwc rwcVar5 = (rwc) ((tzu) this.r).a;
        pvx pvxVar = new pvx();
        pvxVar.b = contextB.getApplicationContext();
        sywVar.getClass();
        pvxVar.c = sywVar;
        List list = pvxVar.d;
        list.addAll(sbpVar);
        pvxVar.e = rwc.i(qatVar);
        pvxVar.v = latVar;
        pvxVar.f = qdfVar;
        pvxVar.g = rwcVarB;
        pvxVar.h = rnt.y(rwwVar);
        pvxVar.j = rwcVar;
        pvxVar.k = rwc.j(qaqVar);
        pvxVar.l = rwc.j(qaqVar2);
        pvxVar.m = rwc.j(pwtVar);
        pvxVar.n = rwcVar2;
        pvxVar.o = rwcVar4.a(rwc.j(ForegroundDownloadService.class));
        pvxVar.i = reeVar;
        pvxVar.p = rwc.j(puuVar2);
        pvxVar.r = rwcVar3;
        pvxVar.s = rwcVar5;
        pvxVar.b.getClass();
        pvxVar.e.getClass();
        pvxVar.v.getClass();
        pvxVar.i.getClass();
        pvxVar.f.getClass();
        pvxVar.g.getClass();
        pvxVar.h.getClass();
        pvxVar.r.getClass();
        szg szgVar = new szg(pvxVar.c);
        if (pvxVar.k.h()) {
            qsz.o(qsz.l(new gea(pvxVar, 6), szgVar), new pvv(0), sxo.a);
        }
        qar qarVar = pvxVar.a;
        qarVar.a = new qaq(pvxVar.b);
        qarVar.c = new qat((Executor) szgVar, (Executor) pvxVar.c);
        qarVar.b = new qas(pvxVar.j, pvxVar.h);
        puu puuVar3 = (puu) pvxVar.p.e(new pvw());
        if (pvxVar.l.h()) {
            qcbVar = new qbz(pvxVar.b, (qaq) pvxVar.l.c(), new qat(puuVar3, rwk.a), puuVar3, pvxVar.n);
            puuVar = puuVar3;
        } else {
            puuVar = puuVar3;
            qcbVar = new qcb();
        }
        qbq qbqVar = qcbVar;
        pvxVar.q = rwc.j(new qas(pvxVar.b));
        qarVar.d = new qav(pvxVar.v, pvxVar.f, qbqVar, pvxVar.g, pvxVar.m, pvxVar.n, pvxVar.u, pvxVar.q, puuVar, pvxVar.s, pvxVar.t);
        qarVar.e = new qay(pvxVar.c, pvxVar.i);
        rnt.aR(qarVar.a, qaq.class);
        rnt.aR(qarVar.b, qas.class);
        rnt.aR(qarVar.c, qat.class);
        rnt.aR(qarVar.d, qav.class);
        rnt.aR(qarVar.e, qay.class);
        qaq qaqVar3 = qarVar.a;
        qas qasVar = qarVar.b;
        qat qatVar2 = qarVar.c;
        qav qavVar = qarVar.d;
        qay qayVar = qarVar.e;
        tzx tzxVarC = tzs.c(new lbm(qavVar, 14));
        tzx tzxVarC2 = tzs.c(new qax(qavVar, 2));
        jdg jdgVar = new jdg(qaqVar3, 2);
        tzx tzxVarC3 = tzs.c(new lbm(qavVar, 17));
        tzx tzxVarC4 = tzs.c(new lbm(qavVar, 16));
        qam qamVar = new qam(jdgVar, tzxVarC2, tzxVarC3, tzxVarC4);
        tzx tzxVarC5 = tzs.c(new kuh((Object) jdgVar, tzxVarC3, 19));
        tzx tzxVarC6 = tzs.c(new qax(qavVar, 1));
        pzt pztVar = new pzt(tzxVarC4);
        tzx tzxVarC7 = tzs.c(new hbn(qayVar, jdgVar, tzxVarC5, tzxVarC6, tzxVarC, pztVar, tzxVarC3, 10));
        tzx tzxVarC8 = tzs.c(new lbm(qatVar2, 12));
        tzx tzxVarC9 = tzs.c(new hsq(jdgVar, tzxVarC2, tzxVarC7, tzxVarC8, tzxVarC4, 12, (float[][]) null));
        tzx tzxVarC10 = tzs.c(new kuh((Object) jdgVar, tzxVarC3, 18));
        tzx tzxVarC11 = tzs.c(new lbm(new pzi(jdgVar, tzxVarC, qamVar, tzxVarC9, tzs.c(new hsq(jdgVar, tzxVarC2, tzs.c(new hbn(qayVar, jdgVar, tzxVarC10, tzxVarC6, tzxVarC, pztVar, tzxVarC3, 8)), tzxVarC8, tzxVarC4, 10, (float[][]) null)), tzxVarC5, tzxVarC10, pztVar, tzxVarC6, tzxVarC8, tzxVarC4), 19));
        tzx tzxVarC12 = tzs.c(new lbm(qasVar, 10));
        tzx tzxVarC13 = tzs.c(new lbm(qavVar, 18));
        tzx tzxVarC14 = tzs.c(new lbm(qavVar, 13));
        tzx tzxVarC15 = tzs.c(new lbo(qayVar, jdgVar, tzxVarC3, 4));
        tzx tzxVarC16 = tzs.c(new qax(tzs.c(qaw.a), 0));
        tzx tzxVarC17 = tzs.c(new lbo(tzxVarC15, tzxVarC16, tzxVarC8, 3, (short[]) null));
        tzx tzxVarC18 = tzs.c(new lbm(qasVar, 9));
        qak qakVar = new qak(jdgVar, tzxVarC16, tzxVarC2, tzxVarC3, tzxVarC8);
        tzx tzxVarC19 = tzs.c(new kuh((Object) jdgVar, tzxVarC3, 17));
        tzx tzxVarC20 = tzs.c(new hsq(jdgVar, tzxVarC16, tzxVarC2, tzs.c(new hbn(qayVar, jdgVar, tzxVarC19, tzxVarC6, tzxVarC, pztVar, tzxVarC3, 9)), tzxVarC8, 11, (boolean[][]) null));
        tzx tzxVarC21 = tzs.c(new kuh((Object) jdgVar, tzxVarC3, 16));
        tzx tzxVarC22 = tzs.c(new lbm(new pzf(tzxVarC, qakVar, tzxVarC20, tzs.c(new gkm(jdgVar, tzxVarC16, tzxVarC2, tzs.c(new hbn(qayVar, jdgVar, tzxVarC21, tzxVarC6, tzxVarC, pztVar, tzxVarC3, 7)), tzxVarC8, tzxVarC4, 9, (short[][]) null)), tzxVarC19, tzxVarC21, pztVar, tzxVarC6, tzxVarC8, tzxVarC4), 15));
        tzx tzxVarC23 = tzs.c(new kuh(qavVar, jdgVar, 15));
        tzx tzxVarC24 = tzs.c(new lbm(qavVar, 20));
        tzx tzxVarC25 = tzs.c(new lbm(qatVar2, 11));
        if (qbqVar instanceof qbz) {
            ((qbz) qbqVar).b = rwc.j((qbv) tzxVarC17.a());
        }
        rwc rwcVarJ = rvk.a;
        Context applicationContext = pvxVar.b.getApplicationContext();
        szg szgVar2 = new szg(szgVar);
        rnt.y(pvxVar.h);
        if (pvxVar.g.h()) {
            rwc.j((qda) pvxVar.g.c());
        }
        if (pvxVar.o.h()) {
            rwcVarJ = rwc.j((Class) pvxVar.o.c());
        }
        tdy tdyVar = new tdy(applicationContext, rwcVarJ, (Executor) szgVar2);
        Context context = pvxVar.b;
        qbq qbqVar2 = (qbq) tzxVarC.a();
        Context contextC = jdg.c(qaqVar3);
        qbq qbqVar3 = (qbq) tzxVarC.a();
        qag qagVarAr = qsp.ar(qaqVar3, qavVar, tzxVarC, tzxVarC2, tzxVarC3, tzxVarC4, tzxVarC6, tzxVarC8, tzxVarC11, tzxVarC12, tzxVarC13, tzxVarC14, tzxVarC17, tzxVarC18, tzxVarC22);
        qai qaiVar = (qai) tzxVarC11.a();
        pzb pzbVarAs = qsp.as(qaqVar3, qavVar, tzxVarC, tzxVarC2, tzxVarC3, tzxVarC4, tzxVarC6, tzxVarC8, tzxVarC11, tzxVarC12, tzxVarC13, tzxVarC14, tzxVarC16, tzxVarC17, tzxVarC18, tzxVarC22, tzxVarC23, tzxVarC24, tzxVarC25);
        pzc pzcVar = (pzc) tzxVarC22.a();
        qav qavVar2 = new qav(jdg.c(qaqVar3), (pzc) tzxVarC22.a(), qsp.ar(qaqVar3, qavVar, tzxVarC, tzxVarC2, tzxVarC3, tzxVarC4, tzxVarC6, tzxVarC8, tzxVarC11, tzxVarC12, tzxVarC13, tzxVarC14, tzxVarC17, tzxVarC18, tzxVarC22), (qai) tzxVarC11.a(), (qbq) tzxVarC.a(), (prh) tzxVarC16.a(), (lat) tzxVarC6.a(), (rwc) tzxVarC3.a(), (pwt) tzxVarC2.a(), (Executor) tzxVarC8.a(), (puu) tzxVarC4.a());
        pwt pwtVar2 = (pwt) tzxVarC2.a();
        qcl qclVar = new qcl(jdg.c(qaqVar3), (pzc) tzxVarC22.a(), qsp.ar(qaqVar3, qavVar, tzxVarC, tzxVarC2, tzxVarC3, tzxVarC4, tzxVarC6, tzxVarC8, tzxVarC11, tzxVarC12, tzxVarC13, tzxVarC14, tzxVarC17, tzxVarC18, tzxVarC22), (lat) tzxVarC6.a(), (qbq) tzxVarC.a(), (pwt) tzxVarC2.a(), (rwc) tzxVarC3.a(), (Executor) tzxVarC8.a());
        tql tqlVar = new tql(qsp.as(qaqVar3, qavVar, tzxVarC, tzxVarC2, tzxVarC3, tzxVarC4, tzxVarC6, tzxVarC8, tzxVarC11, tzxVarC12, tzxVarC13, tzxVarC14, tzxVarC16, tzxVarC17, tzxVarC18, tzxVarC22, tzxVarC23, tzxVarC24, tzxVarC25), (pzc) tzxVarC22.a(), (qbq) tzxVarC.a(), (Executor) tzxVarC8.a());
        jdg.c(qaqVar3);
        qbq qbqVar4 = (qbq) tzxVarC.a();
        pzr pzrVar = new pzr(contextC, qbqVar3, qagVarAr, qaiVar, pzbVarAs, pzcVar, qavVar2, pwtVar2, qclVar, tqlVar, new tdy(qbqVar4, (puu) tzxVarC4.a(), (qbv) tzxVarC17.a()), (rwc) tzxVarC3.a(), (Executor) tzxVarC8.a(), (rwc) tzxVarC24.a(), (puu) tzxVarC4.a(), (qbv) tzxVarC17.a(), qsp.aq(qavVar, tzxVarC4, tzxVarC8, tzxVarC22));
        rwc rwcVar6 = pvxVar.e;
        lat latVar2 = pvxVar.v;
        rwc rwcVar7 = pvxVar.g;
        rwc rwcVar8 = pvxVar.o;
        rwc rwcVar9 = pvxVar.r;
        return new pwr(context, qbqVar2, pzrVar, szgVar, list, rwcVar6, latVar2, rwcVar7, rwcVar8, puuVar, tdyVar, rwcVar9);
    }
}
