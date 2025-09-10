package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import defpackage.kus;
import defpackage.occ;
import defpackage.qwa;
import defpackage.qwb;
import defpackage.qwf;
import defpackage.qwh;
import defpackage.qwq;
import defpackage.rnt;
import defpackage.rww;
import defpackage.suq;
import defpackage.sur;
import defpackage.sus;
import defpackage.sut;
import defpackage.swz;
import defpackage.sxi;
import defpackage.sxo;
import defpackage.syq;
import defpackage.syu;
import defpackage.tnq;
import defpackage.tpc;
import defpackage.tpe;
import defpackage.tpg;
import defpackage.tph;
import defpackage.tpq;
import defpackage.tpw;
import defpackage.tqh;
import defpackage.tql;
import defpackage.trb;
import defpackage.uxo;
import defpackage.uxp;
import defpackage.uyj;
import defpackage.uyk;
import defpackage.uym;
import defpackage.uyn;
import defpackage.uyo;
import defpackage.uzf;
import defpackage.uzp;
import defpackage.uzq;
import defpackage.uzu;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClearcutMetricSnapshotTransmitter implements qwb {
    public static final rww a = rnt.y(new kus(6));
    public volatile occ b;
    public volatile occ c;
    private volatile qwf d;
    private volatile qwq e;
    private final rww f = rnt.y(new kus(5));

    @Override // defpackage.qwb
    public final syu a(final Context context, qwa qwaVar) {
        tql tqlVar = qwh.j;
        qwaVar.i(tqlVar);
        rnt.B(qwaVar.r.m((tpg) tqlVar.c), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new qwq();
                }
            }
        }
        uzu uzuVar = qwaVar.c;
        if (uzuVar == null) {
            uzuVar = uzu.a;
        }
        tpc tpcVar = (tpc) uzuVar.a(5, null);
        tpcVar.r(uzuVar);
        qwq.b(qwq.a, tpcVar);
        uxp uxpVar = ((uzu) tpcVar.b).j;
        if (uxpVar == null) {
            uxpVar = uxp.a;
        }
        if ((uxpVar.b & 1) != 0) {
            uxp uxpVar2 = ((uzu) tpcVar.b).j;
            if (uxpVar2 == null) {
                uxpVar2 = uxp.a;
            }
            uxo uxoVar = uxpVar2.c;
            if (uxoVar == null) {
                uxoVar = uxo.a;
            }
            tpc tpcVar2 = (tpc) uxoVar.a(5, null);
            tpcVar2.r(uxoVar);
            qwq.b(qwq.b, tpcVar2);
            uxp uxpVar3 = ((uzu) tpcVar.b).j;
            if (uxpVar3 == null) {
                uxpVar3 = uxp.a;
            }
            tpc tpcVar3 = (tpc) uxpVar3.a(5, null);
            tpcVar3.r(uxpVar3);
            if (!tpcVar3.b.C()) {
                tpcVar3.o();
            }
            uxp uxpVar4 = (uxp) tpcVar3.b;
            uxo uxoVar2 = (uxo) tpcVar2.l();
            uxoVar2.getClass();
            uxpVar4.c = uxoVar2;
            uxpVar4.b |= 1;
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            uzu uzuVar2 = (uzu) tpcVar.b;
            uxp uxpVar5 = (uxp) tpcVar3.l();
            uxpVar5.getClass();
            uzuVar2.j = uxpVar5;
            uzuVar2.b |= 256;
        }
        uzf uzfVar = ((uzu) tpcVar.b).h;
        if (uzfVar == null) {
            uzfVar = uzf.a;
        }
        if ((uzfVar.b & 256) != 0) {
            uzf uzfVar2 = ((uzu) tpcVar.b).h;
            if (uzfVar2 == null) {
                uzfVar2 = uzf.a;
            }
            sut sutVar = uzfVar2.i;
            if (sutVar == null) {
                sutVar = sut.a;
            }
            tpc tpcVar4 = (tpc) sutVar.a(5, null);
            tpcVar4.r(sutVar);
            suq suqVar = ((sut) tpcVar4.b).e;
            if (suqVar == null) {
                suqVar = suq.a;
            }
            suq suqVarC = qwq.c(suqVar);
            if (!tpcVar4.b.C()) {
                tpcVar4.o();
            }
            sut sutVar2 = (sut) tpcVar4.b;
            suqVarC.getClass();
            sutVar2.e = suqVarC;
            sutVar2.b |= 1;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(sutVar2.f);
            if (!tpcVar4.b.C()) {
                tpcVar4.o();
            }
            ((sut) tpcVar4.b).f = trb.a;
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                suq suqVarC2 = qwq.c((suq) it.next());
                if (!tpcVar4.b.C()) {
                    tpcVar4.o();
                }
                sut sutVar3 = (sut) tpcVar4.b;
                suqVarC2.getClass();
                sutVar3.b();
                sutVar3.f.add(suqVarC2);
            }
            sut sutVar4 = (sut) tpcVar4.b;
            tpw<sus> tpwVar = (sutVar4.c == 4 ? (sur) sutVar4.d : sur.a).b;
            tpc tpcVarM = sur.a.m();
            for (sus susVar : tpwVar) {
                suq suqVar2 = susVar.c;
                if (suqVar2 == null) {
                    suqVar2 = suq.a;
                }
                if ((suqVar2.b & 2) != 0) {
                    tpc tpcVar5 = (tpc) susVar.a(5, null);
                    tpcVar5.r(susVar);
                    suq suqVarC3 = qwq.c(suqVar2);
                    if (!tpcVar5.b.C()) {
                        tpcVar5.o();
                    }
                    sus susVar2 = (sus) tpcVar5.b;
                    suqVarC3.getClass();
                    susVar2.c = suqVarC3;
                    susVar2.b |= 1;
                    susVar = (sus) tpcVar5.l();
                }
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                sur surVar = (sur) tpcVarM.b;
                susVar.getClass();
                surVar.b();
                surVar.b.add(susVar);
            }
            sur surVar2 = (sur) tpcVarM.l();
            if (!tpcVar4.b.C()) {
                tpcVar4.o();
            }
            sut sutVar5 = (sut) tpcVar4.b;
            surVar2.getClass();
            sutVar5.d = surVar2;
            sutVar5.c = 4;
            uzf uzfVar3 = ((uzu) tpcVar.b).h;
            if (uzfVar3 == null) {
                uzfVar3 = uzf.a;
            }
            tpc tpcVar6 = (tpc) uzfVar3.a(5, null);
            tpcVar6.r(uzfVar3);
            sut sutVar6 = (sut) tpcVar4.l();
            if (!tpcVar6.b.C()) {
                tpcVar6.o();
            }
            uzf uzfVar4 = (uzf) tpcVar6.b;
            sutVar6.getClass();
            uzfVar4.i = sutVar6;
            uzfVar4.b |= 256;
            uzf uzfVar5 = (uzf) tpcVar6.l();
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            uzu uzuVar3 = (uzu) tpcVar.b;
            uzfVar5.getClass();
            uzuVar3.h = uzfVar5;
            uzuVar3.b |= 64;
        }
        uzq uzqVar = ((uzu) tpcVar.b).i;
        if (uzqVar == null) {
            uzqVar = uzq.a;
        }
        if (uzqVar.k.size() != 0) {
            uzq uzqVar2 = ((uzu) tpcVar.b).i;
            if (uzqVar2 == null) {
                uzqVar2 = uzq.a;
            }
            tpc tpcVar7 = (tpc) uzqVar2.a(5, null);
            tpcVar7.r(uzqVar2);
            for (int i = 0; i < ((uzq) tpcVar7.b).k.size(); i++) {
                uzp uzpVar = (uzp) ((uzq) tpcVar7.b).k.get(i);
                tpc tpcVar8 = (tpc) uzpVar.a(5, null);
                tpcVar8.r(uzpVar);
                if (!((uzp) tpcVar8.b).c.isEmpty()) {
                    if (!tpcVar8.b.C()) {
                        tpcVar8.o();
                    }
                    ((uzp) tpcVar8.b).d = tqh.a;
                    List listA = qwq.a(((uzp) tpcVar8.b).c);
                    if (!tpcVar8.b.C()) {
                        tpcVar8.o();
                    }
                    uzp uzpVar2 = (uzp) tpcVar8.b;
                    tpq tpqVar = uzpVar2.d;
                    if (!tpqVar.c()) {
                        uzpVar2.d = tph.u(tpqVar);
                    }
                    tnq.e(listA, uzpVar2.d);
                }
                if (!tpcVar8.b.C()) {
                    tpcVar8.o();
                }
                uzp uzpVar3 = (uzp) tpcVar8.b;
                uzpVar3.b &= -2;
                uzpVar3.c = uzp.a.c;
                if (!tpcVar7.b.C()) {
                    tpcVar7.o();
                }
                uzq uzqVar3 = (uzq) tpcVar7.b;
                uzp uzpVar4 = (uzp) tpcVar8.l();
                uzpVar4.getClass();
                uzqVar3.c();
                uzqVar3.k.set(i, uzpVar4);
            }
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            uzu uzuVar4 = (uzu) tpcVar.b;
            uzq uzqVar4 = (uzq) tpcVar7.l();
            uzqVar4.getClass();
            uzuVar4.i = uzqVar4;
            uzuVar4.b |= 128;
        }
        uyk uykVar = ((uzu) tpcVar.b).g;
        if (uykVar == null) {
            uykVar = uyk.a;
        }
        if (uykVar.b.size() != 0) {
            uyk uykVar2 = ((uzu) tpcVar.b).g;
            if (uykVar2 == null) {
                uykVar2 = uyk.a;
            }
            tpc tpcVar9 = (tpc) uykVar2.a(5, null);
            tpcVar9.r(uykVar2);
            for (int i2 = 0; i2 < ((uyk) tpcVar9.b).b.size(); i2++) {
                uyj uyjVar = (uyj) ((uyk) tpcVar9.b).b.get(i2);
                tpc tpcVar10 = (tpc) uyjVar.a(5, null);
                tpcVar10.r(uyjVar);
                if (!((uyj) tpcVar10.b).e.isEmpty()) {
                    if (!tpcVar10.b.C()) {
                        tpcVar10.o();
                    }
                    ((uyj) tpcVar10.b).f = tqh.a;
                    List listA2 = qwq.a(((uyj) tpcVar10.b).e);
                    if (!tpcVar10.b.C()) {
                        tpcVar10.o();
                    }
                    uyj uyjVar2 = (uyj) tpcVar10.b;
                    tpq tpqVar2 = uyjVar2.f;
                    if (!tpqVar2.c()) {
                        uyjVar2.f = tph.u(tpqVar2);
                    }
                    tnq.e(listA2, uyjVar2.f);
                }
                if (!tpcVar10.b.C()) {
                    tpcVar10.o();
                }
                uyj uyjVar3 = (uyj) tpcVar10.b;
                uyjVar3.b &= -524289;
                uyjVar3.e = uyj.a.e;
                if (!tpcVar9.b.C()) {
                    tpcVar9.o();
                }
                uyk uykVar3 = (uyk) tpcVar9.b;
                uyj uyjVar4 = (uyj) tpcVar10.l();
                uyjVar4.getClass();
                tpw tpwVar2 = uykVar3.b;
                if (!tpwVar2.c()) {
                    uykVar3.b = tph.v(tpwVar2);
                }
                uykVar3.b.set(i2, uyjVar4);
            }
            for (int i3 = 0; i3 < ((uyk) tpcVar9.b).c.size(); i3++) {
                uym uymVar = (uym) ((uyk) tpcVar9.b).c.get(i3);
                tpc tpcVar11 = (tpc) uymVar.a(5, null);
                tpcVar11.r(uymVar);
                if (!((uym) tpcVar11.b).c.isEmpty()) {
                    if (!tpcVar11.b.C()) {
                        tpcVar11.o();
                    }
                    ((uym) tpcVar11.b).d = tqh.a;
                    List listA3 = qwq.a(((uym) tpcVar11.b).c);
                    if (!tpcVar11.b.C()) {
                        tpcVar11.o();
                    }
                    uym uymVar2 = (uym) tpcVar11.b;
                    tpq tpqVar3 = uymVar2.d;
                    if (!tpqVar3.c()) {
                        uymVar2.d = tph.u(tpqVar3);
                    }
                    tnq.e(listA3, uymVar2.d);
                }
                if (!tpcVar11.b.C()) {
                    tpcVar11.o();
                }
                uym uymVar3 = (uym) tpcVar11.b;
                uymVar3.b &= -2;
                uymVar3.c = uym.a.c;
                if (!tpcVar9.b.C()) {
                    tpcVar9.o();
                }
                uyk uykVar4 = (uyk) tpcVar9.b;
                uym uymVar4 = (uym) tpcVar11.l();
                uymVar4.getClass();
                tpw tpwVar3 = uykVar4.c;
                if (!tpwVar3.c()) {
                    uykVar4.c = tph.v(tpwVar3);
                }
                uykVar4.c.set(i3, uymVar4);
            }
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            uzu uzuVar5 = (uzu) tpcVar.b;
            uyk uykVar5 = (uyk) tpcVar9.l();
            uykVar5.getClass();
            uzuVar5.g = uykVar5;
            uzuVar5.b |= 32;
        }
        uyn uynVar = ((uzu) tpcVar.b).l;
        if (uynVar == null) {
            uynVar = uyn.a;
        }
        if (uynVar.e.size() != 0) {
            uyn uynVar2 = ((uzu) tpcVar.b).l;
            if (uynVar2 == null) {
                uynVar2 = uyn.a;
            }
            tpc tpcVar12 = (tpc) uynVar2.a(5, null);
            tpcVar12.r(uynVar2);
            for (int i4 = 0; i4 < ((uyn) tpcVar12.b).e.size(); i4++) {
                uyo uyoVar = (uyo) ((uyn) tpcVar12.b).e.get(i4);
                tpc tpcVar13 = (tpc) uyoVar.a(5, null);
                tpcVar13.r(uyoVar);
                tpe tpeVar = (tpe) tpcVar13;
                qwq.b(qwq.c, tpeVar);
                if (!tpcVar12.b.C()) {
                    tpcVar12.o();
                }
                uyn uynVar3 = (uyn) tpcVar12.b;
                uyo uyoVar2 = (uyo) tpeVar.l();
                uyoVar2.getClass();
                tpw tpwVar4 = uynVar3.e;
                if (!tpwVar4.c()) {
                    uynVar3.e = tph.v(tpwVar4);
                }
                uynVar3.e.set(i4, uyoVar2);
            }
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            uzu uzuVar6 = (uzu) tpcVar.b;
            uyn uynVar4 = (uyn) tpcVar12.l();
            uynVar4.getClass();
            uzuVar6.l = uynVar4;
            uzuVar6.b |= 2048;
        }
        final uzu uzuVar7 = (uzu) tpcVar.l();
        if (((Boolean) this.f.fr()).booleanValue()) {
            return syq.a;
        }
        tql tqlVar2 = qwh.j;
        qwaVar.i(tqlVar2);
        Object objK = qwaVar.r.k((tpg) tqlVar2.c);
        if (objK == null) {
            objK = tqlVar2.b;
        } else {
            tqlVar2.b(objK);
        }
        final qwh qwhVar = (qwh) objK;
        boolean z = qwhVar.h;
        boolean z2 = (uzuVar7.b & 64) != 0;
        qwf qwfVar = this.d;
        if (qwfVar == null) {
            synchronized (this) {
                qwfVar = this.d;
                if (qwfVar == null) {
                    qwfVar = new qwf();
                    this.d = qwfVar;
                }
            }
        }
        return swz.j(qwfVar.a(context, z, !z2), new sxi() { // from class: qwk
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                occ occVar;
                if (!((Boolean) obj).booleanValue()) {
                    return syq.a;
                }
                qwh qwhVar2 = qwhVar;
                Context context2 = context;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = this.a;
                String str = qwhVar2.c;
                if (qwhVar2.d) {
                    occVar = clearcutMetricSnapshotTransmitter.c;
                    if (occVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            occVar = clearcutMetricSnapshotTransmitter.c;
                            if (occVar == null) {
                                List list = occ.m;
                                oco ocoVar = oco.a;
                                ojl.ay(context2);
                                ojl.aw(str);
                                oco ocoVar2 = oco.b;
                                ojl.ay(ocoVar2);
                                obz.b(ocoVar2);
                                occVar = new occ(context2, str, null, ocoVar2, null, null, null);
                                clearcutMetricSnapshotTransmitter.c = occVar;
                            }
                        }
                    }
                } else {
                    occVar = clearcutMetricSnapshotTransmitter.b;
                    if (occVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            occVar = clearcutMetricSnapshotTransmitter.b;
                            if (occVar == null) {
                                List list2 = occ.m;
                                oco ocoVar3 = oco.a;
                                ojl.ay(context2);
                                ojl.aw(str);
                                occVar = new occ(context2, str, null, ocoVar3, null, null, null);
                                clearcutMetricSnapshotTransmitter.b = occVar;
                            }
                        }
                    }
                }
                oca ocaVarE = occVar.e(uzuVar7);
                if (udl.a.fr().a(context2)) {
                    ocaVarE.m = pro.a(context2, (prc) ClearcutMetricSnapshotTransmitter.a.fr());
                }
                if (!qwhVar2.d) {
                    String str2 = qwhVar2.e;
                    if (!rnt.V(str2)) {
                        if (ocaVarE.a.c()) {
                            throw new IllegalStateException(LmJPKwPBa.znFDJ);
                        }
                        tpe tpeVar2 = ocaVarE.n;
                        if (!tpeVar2.b.C()) {
                            tpeVar2.o();
                        }
                        tze tzeVar = (tze) tpeVar2.b;
                        tze tzeVar2 = tze.a;
                        str2.getClass();
                        tzeVar.b |= 16777216;
                        tzeVar.i = str2;
                    }
                    for (String str3 : qwhVar2.i) {
                        if (ocaVarE.a.c()) {
                            throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
                        }
                        if (ocaVarE.c == null) {
                            ocaVarE.c = new ArrayList();
                        }
                        ocaVarE.c.add(str3);
                    }
                    if ((qwhVar2.b & 8) != 0) {
                        String str4 = qwhVar2.f;
                        if (!ocaVarE.a.j.a(ocp.ACCOUNT_NAME)) {
                            throw new IllegalStateException(cdVQ.aXlQKMZPD);
                        }
                        ocaVarE.g = str4;
                    }
                    tpn tpnVar = qwhVar2.g;
                    if (!tpnVar.isEmpty()) {
                        ocaVarE.c(ske.ai(tpnVar));
                    }
                }
                return qpt.av(ocaVarE.b());
            }
        }, sxo.a);
    }
}
