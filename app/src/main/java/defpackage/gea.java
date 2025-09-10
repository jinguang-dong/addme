package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import j$.util.Collection;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gea implements sxh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gea(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r6v10, types: [pbn] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Object, sxh] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Object, sxh] */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.lang.Object, sxh] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v88, types: [java.lang.Object, syu] */
    @Override // defpackage.sxh
    public final syu a() throws TimeoutException {
        syu syuVarL;
        int i = 2;
        int i2 = 4;
        int i3 = 9;
        int i4 = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ged gedVar = (ged) obj;
                oyj oyjVar = gedVar.a;
                oyjVar.j();
                oyj oyjVar2 = gedVar.b;
                oyjVar2.j();
                oyk oykVar = gedVar.h;
                if (oykVar != null) {
                    oyjVar2.h(oykVar);
                }
                gedVar.l.close();
                gedVar.m.close();
                rwc rwcVar = gedVar.e;
                if (rwcVar.h()) {
                    ((oys) rwcVar.c()).close();
                }
                Collection.EL.stream(gedVar.f.values()).forEach(new fkj(16));
                Collection.EL.stream(gedVar.g.values()).forEach(new fkj(17));
                oyjVar.close();
                oyjVar2.close();
                synchronized (gedVar.j) {
                    ((ged) obj).k = gec.CLOSED;
                }
                return syq.a;
            case 1:
                ?? r6 = this.a;
                try {
                    try {
                        ((fra) r6).c.f("bindPhotosService");
                        oqj oqjVar = new oqj(1);
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.apps.photos", "com.google.android.apps.photos.cameraassistant.CameraAssistantService");
                        ((fra) r6).b.bindService(intent, oqjVar, 5);
                        syuVarL = ske.M(oqjVar);
                    } catch (SecurityException e) {
                        ((sgt) ((sgt) fra.a.c().i(e)).M(358)).s("Either Photos service does not exist or does not have permission to connect.");
                        syuVarL = ske.L(e);
                    }
                    return syuVarL;
                } finally {
                    ((fra) r6).c.g();
                }
            case 2:
                Object obj2 = this.a;
                ged gedVar2 = (ged) obj2;
                synchronized (gedVar2.j) {
                    ((ged) obj2).k = gec.STARTED;
                }
                gedVar2.c.f();
                gedVar2.d.f();
                return syq.a;
            case 3:
                return ((hne) this.a).c();
            case 4:
                Object obj3 = this.a;
                ozk ozkVar = (ozk) obj3;
                synchronized (ozkVar.a) {
                    ((ozk) obj3).i = 2;
                }
                ozkVar.c.f();
                return syq.a;
            case 5:
                Object obj4 = this.a;
                ozk ozkVar2 = (ozk) obj4;
                oyj oyjVar3 = ozkVar2.b;
                oyjVar3.j();
                oyk oykVar2 = ozkVar2.e;
                if (oykVar2 != null) {
                    oyjVar3.h(oykVar2);
                }
                ozh ozhVar = ozkVar2.j;
                if (ozhVar != null) {
                    ozhVar.close();
                }
                oys oysVar = ozkVar2.k;
                if (oysVar != null) {
                    oysVar.close();
                }
                for (oyi oyiVar : ozkVar2.d.values()) {
                    oyiVar.j();
                    oyiVar.close();
                }
                oyjVar3.close();
                synchronized (ozkVar2.a) {
                    ((ozk) obj4).i = 4;
                }
                return syq.a;
            case 6:
                Context context = (Context) ((qaq) ((pvx) this.a).k.c()).a;
                return qpt.av(new onm(context).b(context.getPackageName().equals("com.google.android.gms") ? "com.google.android.gms.icing.mdd" : "com.google.android.gms.icing.mdd#".concat(String.valueOf(context.getPackageName()))));
            case 7:
                Object obj5 = this.a;
                pzr pzrVar = (pzr) obj5;
                return qdp.e(pzrVar.f()).g(new pzl(obj5, i4), pzrVar.k);
            case 8:
                int i5 = qbu.a;
                Object obj6 = this.a;
                final pzr pzrVar2 = (pzr) obj6;
                return qdp.e(pzrVar2.f()).g(new pzl(obj6, 12), sxo.a).g(new sxi() { // from class: pzm
                    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, qbq] */
                    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, qbq] */
                    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, puu] */
                    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, qbv] */
                    @Override // defpackage.sxi
                    public final syu a(Object obj7) {
                        syu syuVarL2;
                        Integer num = (Integer) obj7;
                        ArrayList arrayList = new ArrayList();
                        int i6 = qbu.a;
                        pzr pzrVar3 = pzrVar2;
                        arrayList.add(qsz.n(pzrVar3.f(), new pzl(pzrVar3, 14), pzrVar3.k));
                        puu puuVar = pzrVar3.m;
                        if (puuVar.N()) {
                            pzb pzbVar = pzrVar3.d;
                            arrayList.add(pzbVar.m(new pyg(pzbVar, 16)));
                        }
                        int i7 = 7;
                        if (puuVar.Q()) {
                            pzb pzbVar2 = pzrVar3.d;
                            arrayList.add(pzbVar2.r(pzbVar2.d.d(), new pyg(pzbVar2, 7)));
                        }
                        if (puuVar.P()) {
                            pzb pzbVar3 = pzrVar3.d;
                            rwc rwcVar2 = pzbVar3.f;
                            if (rwcVar2.h()) {
                                try {
                                    qas qasVar = (qas) rwcVar2.c();
                                    sbp sbpVarK = sbp.k(((AccountManager) qasVar.a).getAccountsByTypeForPackage("com.google", (String) qasVar.b));
                                    scl sclVar = new scl();
                                    int i8 = ((sex) sbpVarK).c;
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        Account account = (Account) sbpVarK.get(i9);
                                        if (account.name != null && account.type != null) {
                                            sclVar.d(prh.w(account));
                                        }
                                    }
                                    syuVarL2 = pzbVar3.r(pzbVar3.d.d(), new kjl(pzbVar3, sclVar.g(), 16));
                                } catch (RuntimeException e2) {
                                    syuVarL2 = ske.L(e2);
                                }
                            } else {
                                syuVarL2 = syq.a;
                            }
                            arrayList.add(syuVarL2);
                        }
                        puu puuVar2 = pzrVar3.m;
                        if (puuVar2.H()) {
                            pzb pzbVar4 = pzrVar3.d;
                            arrayList.add(pzbVar4.m(new pyg(pzbVar4, 14)));
                        }
                        if (puuVar2.S()) {
                            arrayList.add(pzrVar3.p.b());
                            pzrVar3.c.l(1053);
                        }
                        tql tqlVar = pzrVar3.r;
                        arrayList.add(tqlVar.d.a(new qce(tqlVar, num.intValue(), 1)));
                        qcl qclVar = pzrVar3.i;
                        arrayList.add(qclVar.c.d(new qce(qclVar, num.intValue(), 0)));
                        tdy tdyVar = pzrVar3.q;
                        arrayList.add(!tdyVar.b.O() ? syq.a : tdyVar.c.c(new gea(tdyVar.a.a(), 13)));
                        if (pzrVar3.l.h()) {
                            pzb pzbVar5 = pzrVar3.d;
                            arrayList.add(pzbVar5.r(pzbVar5.d.d(), new pyg(pzbVar5, 13)));
                        }
                        qsp.x(pzrVar3.b, "gms_icing_mdd_manager_metadata", pzrVar3.j).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
                        if (!puuVar2.A()) {
                            pzc pzcVar = pzrVar3.e;
                            qdp qdpVarE = qdp.e(pzcVar.c());
                            pzg pzgVar = new pzg(6);
                            Executor executor = pzrVar3.k;
                            arrayList.add(qsp.O(qdpVarE.f(pzgVar, executor).g(new pzl(pzrVar3, i7), executor), qdp.e(pzcVar.e()).f(new pyb(pzrVar3, 12), executor).g(new kjm(17), executor)).f(new ire(16), sxo.a));
                        }
                        return qsp.N(arrayList).f(new ire(15), pzrVar3.k);
                    }
                }, pzrVar2.k);
            case 9:
                return ((qag) this.a).a();
            case 10:
                return qsz.m(this.a.a(), new pzw(8), sxo.a);
            case 11:
                return qsz.m(this.a.a(), new pzw(i3), sxo.a);
            case 12:
                return qsz.m(this.a.a(), new pzw(7), sxo.a);
            case 13:
                return qsz.m(this.a, new rvu() { // from class: qca
                    @Override // defpackage.rvu
                    public final Object apply(Object obj7) {
                        tpc tpcVarM = svh.a.m();
                        long j = 0;
                        long j2 = 0;
                        for (pvg pvgVar : (List) obj7) {
                            tpc tpcVarM2 = svg.a.m();
                            tpc tpcVarM3 = suv.a.m();
                            pvl pvlVar = pvgVar.c;
                            if (pvlVar == null) {
                                pvlVar = pvl.a;
                            }
                            String str = pvlVar.d;
                            if (!tpcVarM3.b.C()) {
                                tpcVarM3.o();
                            }
                            tph tphVar = tpcVarM3.b;
                            suv suvVar = (suv) tphVar;
                            str.getClass();
                            suvVar.b |= 4;
                            suvVar.e = str;
                            pvl pvlVar2 = pvgVar.c;
                            if (pvlVar2 == null) {
                                pvlVar2 = pvl.a;
                            }
                            String str2 = pvlVar2.c;
                            if (!tphVar.C()) {
                                tpcVarM3.o();
                            }
                            tph tphVar2 = tpcVarM3.b;
                            suv suvVar2 = (suv) tphVar2;
                            str2.getClass();
                            suvVar2.b |= 1;
                            suvVar2.c = str2;
                            int i6 = pvgVar.f;
                            if (!tphVar2.C()) {
                                tpcVarM3.o();
                            }
                            tph tphVar3 = tpcVarM3.b;
                            suv suvVar3 = (suv) tphVar3;
                            suvVar3.b |= 2;
                            suvVar3.d = i6;
                            long j3 = pvgVar.d;
                            if (!tphVar3.C()) {
                                tpcVarM3.o();
                            }
                            tph tphVar4 = tpcVarM3.b;
                            suv suvVar4 = (suv) tphVar4;
                            suvVar4.b |= 64;
                            suvVar4.i = j3;
                            String str3 = pvgVar.e;
                            if (!tphVar4.C()) {
                                tpcVarM3.o();
                            }
                            suv suvVar5 = (suv) tpcVarM3.b;
                            str3.getClass();
                            suvVar5.b |= 128;
                            suvVar5.j = str3;
                            suv suvVar6 = (suv) tpcVarM3.l();
                            if (!tpcVarM2.b.C()) {
                                tpcVarM2.o();
                            }
                            tph tphVar5 = tpcVarM2.b;
                            svg svgVar = (svg) tphVar5;
                            suvVar6.getClass();
                            svgVar.c = suvVar6;
                            svgVar.b |= 1;
                            long j4 = pvgVar.h;
                            if (!tphVar5.C()) {
                                tpcVarM2.o();
                            }
                            tph tphVar6 = tpcVarM2.b;
                            svg svgVar2 = (svg) tphVar6;
                            svgVar2.b |= 2;
                            svgVar2.d = j4;
                            long j5 = pvgVar.g;
                            if (!tphVar6.C()) {
                                tpcVarM2.o();
                            }
                            svg svgVar3 = (svg) tpcVarM2.b;
                            svgVar3.b |= 4;
                            svgVar3.e = j5;
                            if (!tpcVarM.b.C()) {
                                tpcVarM.o();
                            }
                            svh svhVar = (svh) tpcVarM.b;
                            svg svgVar4 = (svg) tpcVarM2.l();
                            svgVar4.getClass();
                            tpw tpwVar = svhVar.c;
                            if (!tpwVar.c()) {
                                svhVar.c = tph.v(tpwVar);
                            }
                            svhVar.c.add(svgVar4);
                            j += pvgVar.h;
                            j2 += pvgVar.g;
                        }
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        tph tphVar7 = tpcVarM.b;
                        svh svhVar2 = (svh) tphVar7;
                        svhVar2.b |= 1;
                        svhVar2.d = j;
                        if (!tphVar7.C()) {
                            tpcVarM.o();
                        }
                        svh svhVar3 = (svh) tpcVarM.b;
                        svhVar3.b |= 2;
                        svhVar3.e = j2;
                        return (svh) tpcVarM.l();
                    }
                }, sxo.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                qrh qrhVar = (qrh) this.a;
                rwc rwcVar2 = (rwc) qrhVar.b.fr();
                boolean zH = rwcVar2.h();
                Object objFr = qrhVar.c.fr();
                if (zH) {
                    rwc rwcVar3 = (rwc) objFr;
                    if (rwcVar3.h()) {
                        qrg qrgVar = new qrg((File) rwcVar2.c(), (String) rwcVar3.c());
                        int iA = qrgVar.a();
                        qrgVar.b().delete();
                        qrgVar.b = 0;
                        qrgVar.c = true;
                        if (iA < ((qri) qrhVar.f.a()).c) {
                            return syq.a;
                        }
                        Object obj7 = qrhVar.e;
                        qql qqlVarA = qqm.a();
                        tpc tpcVarM = uzu.a.m();
                        tpc tpcVarM2 = uzt.a.m();
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        uzt uztVar = (uzt) tpcVarM2.b;
                        uztVar.c = 6;
                        uztVar.b |= 1;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        uzu uzuVar = (uzu) tpcVarM.b;
                        uzt uztVar2 = (uzt) tpcVarM2.l();
                        uztVar2.getClass();
                        uzuVar.u = uztVar2;
                        uzuVar.b |= 16777216;
                        qqlVarA.f((uzu) tpcVarM.l());
                        return ((qqp) obj7).b(qqlVarA.a());
                    }
                }
                return syq.a;
            case 15:
                return ((qub) this.a).w();
            case 16:
                Object obj8 = this.a;
                rdf rdfVar = (rdf) obj8;
                return qsz.n(rdfVar.e.g(rdfVar.b), new qaz(obj8, 20), rdfVar.c);
            case 17:
                rdf rdfVar2 = (rdf) this.a;
                qas qasVar = rdfVar2.e;
                return qsz.m(qsz.m(((ren) qasVar.b).a(), new qcj(rdfVar2.b, 11), qasVar.a), new qpl(11), rdfVar2.c);
            case 18:
                Object obj9 = this.a;
                sxi sxiVarC = rsx.c(new red(obj9, i2));
                rel relVar = (rel) obj9;
                return ske.N(swz.j(relVar.b, sxiVarC, relVar.c));
            case 19:
                Object obj10 = this.a;
                rel relVar2 = (rel) obj10;
                try {
                    return ske.M(((rel) obj10).b((Uri) ske.U(relVar2.b)));
                } catch (IOException e2) {
                    rwc rwcVar4 = relVar2.d;
                    if (!rwcVar4.h()) {
                        return ske.L(e2);
                    }
                    if ((e2 instanceof rcs) || (e2.getCause() instanceof rcs)) {
                        return ske.L(e2);
                    }
                    return swz.j(!(e2.getCause() instanceof tpz) ? ske.L(e2) : swf.j(swz.j(ske.M(((qaq) rwcVar4.c()).a), rsx.c(new red(obj10, i)), relVar2.c), IOException.class, new red(e2, i3), sxo.a), rsx.c(new red(obj10, 3)), relVar2.c);
                }
            default:
                return this.a;
        }
    }
}
