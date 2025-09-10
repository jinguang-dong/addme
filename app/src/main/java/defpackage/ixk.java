package defpackage;

import android.hardware.SensorManager;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.googlex.gcam.Gcam;
import j$.lang.Iterable$EL;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixk implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final /* synthetic */ int i;

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i) {
        this.i = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        pdn pdnVarB;
        switch (this.i) {
            case 0:
                pbn pbnVar = (pbn) this.a.a();
                owf owfVar = (owf) this.b.a();
                juv juvVar = (juv) this.c.a();
                ixm ixmVar = (ixm) this.d.a();
                return new ixj(pbnVar, owfVar, juvVar, ixmVar, ((kif) this.g).a(), (luj) this.h.a());
            case 1:
                return new iwj(((hoa) this.e).b(), (jtc) this.g.a(), (rww) this.c.a(), (owf) this.a.a(), (ScheduledExecutorService) this.d.a(), ((ixw) this.b).a(), (pbn) this.h.a(), (ocq) this.f.a());
            case 2:
                tzx tzxVar = this.f;
                return new jam(((ixz) this.c).a(), tzs.b(this.d), tzs.b(this.a), tzs.b(this.b), tzs.b(this.e), (owq) tzxVar.a(), (out) this.g.a(), (pbn) this.h.a());
            case 3:
                owf owfVarA = owb.a(owl.g((owq) this.g.a(), (owf) this.h.a(), (owf) this.f.a(), (owf) this.d.a(), (owf) this.a.a(), owl.h((ovx) this.c.a(), new hia(13)), owl.h((owf) this.e.a(), new fdz((hbj) this.b.a(), 18))));
                owfVarA.getClass();
                return owfVarA;
            case 4:
                pnk pnkVar = (pnk) this.g.a();
                tzx tzxVar2 = this.c;
                SensorManager sensorManagerA = ((inh) this.h).a();
                nnm nnmVar = (nnm) tzxVar2.a();
                hms hmsVar = (hms) this.d.a();
                hms hmsVar2 = (hms) this.b.a();
                Executor executor = (Executor) this.e.a();
                pbn pbnVar2 = (pbn) this.a.a();
                return new jrd(pnkVar, sensorManagerA, nnmVar, hmsVar, hmsVar2, executor, pbnVar2);
            case 5:
                return new ree((Gcam) this.g.a(), (hbj) this.c.a(), ((kiv) this.d).a(), ((pab) this.b).a(), (hzs) this.e.a(), (jid) this.f.a(), (kgk) this.a.a(), ((kqr) this.h).a());
            case 6:
                MediaFormat mediaFormat = (MediaFormat) this.f.a();
                Handler handler = (Handler) this.b.a();
                qin qinVar = (qin) this.c.a();
                our ourVar = (our) this.a.a();
                tgp tgpVar = (tgp) this.g.a();
                hbj hbjVar = (hbj) this.d.a();
                tzx tzxVar3 = this.h;
                pbc pbcVarA = ((pba) this.e).a();
                qkp qkpVar = new qkp(qinVar);
                lls llsVar = new lls(tgpVar, qkpVar);
                ourVar.d(new iew(qkpVar, 14));
                kat katVar = new kat(mediaFormat, handler, llsVar, qinVar, hbjVar, pbcVarA);
                ourVar.d(katVar);
                return katVar;
            case 7:
                return qpt.cv((MediaFormat) this.f.a(), (Handler) this.b.a(), (qin) this.c.a(), (our) this.a.a(), (tgp) this.g.a(), (hbj) this.d.a(), ((pba) this.e).a(), (ocq) this.h.a());
            case 8:
                return qpt.cv((MediaFormat) this.f.a(), (Handler) this.b.a(), (qin) this.c.a(), (our) this.a.a(), (tgp) this.g.a(), (hbj) this.d.a(), ((pba) this.e).a(), (ocq) this.h.a());
            case 9:
                return new jzq((kan) this.a.a(), (hyd) this.g.a(), ((hzb) this.h).b().intValue(), ((hzb) this.f).b().intValue(), ((kbt) this.e).b().intValue(), (owf) this.b.a(), ((jaf) this.d).b(), (kno) this.c.a());
            case 10:
                return new jzv((hzs) this.e.a(), (pjo) this.b.a(), ((pba) this.f).a(), (hbj) this.c.a(), ((jzp) this.h).a(), (Executor) this.d.a(), (iso) this.a.a(), (lat) this.g.a());
            case 11:
                our ourVar2 = (our) this.e.a();
                pfu pfuVar = (pfu) this.c.a();
                rwc rwcVar = (rwc) this.a.a();
                owf owfVar2 = (owf) this.b.a();
                Set setA = ((tzz) this.f).a();
                if (rwcVar.h()) {
                    pdnVarB = pfuVar.c(pfuVar.f((peo) rwcVar.c(), setA), 3);
                } else {
                    tzx tzxVar4 = this.h;
                    if (((Map) tzxVar4.a()).size() == 1) {
                        pdnVarB = pfuVar.c(pfuVar.f((peo) ((Map) tzxVar4.a()).values().iterator().next(), setA), 3);
                    } else {
                        tzx tzxVar5 = this.g;
                        tzx tzxVar6 = this.d;
                        rnt.M(true ^ ((Map) tzxVar4.a()).isEmpty(), "Not enough RAW streams have been configured.");
                        pdnVarB = ((kxd) tzxVar6).a().B(owfVar2, (Map) tzxVar5.a(), 3);
                    }
                }
                ourVar2.d(pdnVarB);
                return pdnVarB;
            case 12:
                tzx tzxVar7 = this.c;
                kgw kgwVarA = ((kiu) this.b).a();
                kow kowVar = (kow) tzxVar7.a();
                tzx tzxVar8 = this.e;
                owf owfVarB = ((ims) this.h).b();
                owf owfVar3 = (owf) tzxVar8.a();
                owf owfVar4 = (owf) this.f.a();
                owf owfVar5 = (owf) this.d.a();
                owf owfVar6 = (owf) this.a.a();
                return new kpp(kgwVarA, kowVar, owfVarB, owfVar3, owfVar4, owfVar5, owfVar6);
            case 13:
                qrh qrhVar = (qrh) this.b.a();
                pfu pfuVar2 = (pfu) this.e.a();
                fua fuaVar = (fua) this.h.a();
                lae laeVar = (lae) this.c.a();
                our ourVar3 = (our) this.a.a();
                hbj hbjVar2 = (hbj) this.f.a();
                jvb jvbVar = (jvb) this.g.a();
                nkw nkwVarA = ((kid) this.d).a();
                gzg gzgVar = gze.a;
                laeVar.f();
                return new frf(new jqk(ourVar3, laeVar, fuaVar, jvbVar, pfuVar2, nkwVarA, hbjVar2, qrhVar, 3), "3aexcomp", 0);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new kzn((owf) this.b.a(), (hgc) this.e.a(), (hgu) this.a.a(), ((kid) this.d).a(), ((kiv) this.c).a(), (owf) this.g.a(), (our) this.h.a(), (hbj) this.f.a());
            case 15:
                final out outVar = (out) this.c.a();
                final our ourVar4 = (our) this.e.a();
                final pfu pfuVar3 = (pfu) this.b.a();
                final rwc rwcVar2 = (rwc) this.h.a();
                tzx tzxVar9 = this.g;
                tzx tzxVar10 = this.f;
                final syu syuVarA = ((kik) this.a).a();
                final ipt iptVarA = ((kih) tzxVar10).a();
                final rwc rwcVar3 = (rwc) tzxVar9.a();
                final hbj hbjVar3 = (hbj) this.d.a();
                return !rwcVar2.h() ? frh.a : new frg(new fre() { // from class: lbv
                    @Override // defpackage.fre
                    public final /* synthetic */ int a() {
                        return 0;
                    }

                    @Override // defpackage.fre
                    public final syu b() {
                        final ipt iptVar = iptVarA;
                        syn synVarV = syn.v(ske.J(syuVarA, iptVar.b()));
                        final pfu pfuVar4 = pfuVar3;
                        final rwc rwcVar4 = rwcVar2;
                        final rwc rwcVar5 = rwcVar3;
                        final our ourVar5 = ourVar4;
                        return swf.j(swz.i(synVarV, new rvu() { // from class: lbr
                            @Override // defpackage.rvu
                            public final Object apply(Object obj) {
                                List list = (List) obj;
                                ngn ngnVar = (ngn) list.get(0);
                                if (!ngnVar.e) {
                                    return false;
                                }
                                rwc rwcVar6 = rwcVar5;
                                if (rwcVar6.h()) {
                                    ipt iptVar2 = iptVar;
                                    npq npqVar = (npq) rwcVar6.c();
                                    iptVar2.a = npqVar;
                                    npqVar.l(ngnVar);
                                    rwc rwcVar7 = (rwc) list.get(1);
                                    if (rwcVar7.h() && ((ngn) rwcVar7.c()).e) {
                                        npqVar.l((ngn) rwcVar7.c());
                                    }
                                } else {
                                    our ourVar6 = ourVar5;
                                    rwc rwcVar8 = rwcVar4;
                                    pfu pfuVar5 = pfuVar4;
                                    ourVar6.d(pfuVar5.a(pfuVar5.d((peo) rwcVar8.c())));
                                    ((peo) rwcVar8.c()).e(ngnVar.a);
                                }
                                return true;
                            }
                        }, hbjVar3.p(gzo.bF) ? sxo.a : outVar), Throwable.class, new jie(2), sxo.a);
                    }

                    @Override // defpackage.fre
                    public final /* synthetic */ String c() {
                        return gsn.Z(this);
                    }
                });
            case 16:
                tzx tzxVar11 = this.f;
                tzx tzxVar12 = this.b;
                tzx tzxVar13 = this.d;
                final tzj tzjVarB = tzs.b(tzxVar11);
                final tzj tzjVarB2 = tzs.b(tzxVar12);
                final pfu pfuVar4 = (pfu) tzxVar13.a();
                final our ourVar5 = (our) this.e.a();
                final owf owfVar7 = (owf) this.g.a();
                final owf owfVar8 = (owf) this.a.a();
                final hbj hbjVar4 = (hbj) this.c.a();
                final gsn gsnVarA = ((gye) this.h).a();
                gzi gziVar = hae.a;
                final owf owfVarA2 = owb.a(owl.h(owfVar7, new jku(16)));
                final owf owfVarA3 = owb.a(owl.h(owfVar7, new jku(17)));
                return new frf(new Runnable() { // from class: lbz
                    @Override // java.lang.Runnable
                    public final void run() {
                        gzi gziVar2 = hba.a;
                        Set set = (Set) tzjVarB.a();
                        owf owfVar9 = owfVar7;
                        jjq jjqVar = (jjq) owfVar9.dL();
                        owf owfVar10 = owfVar8;
                        pfu pfuVar5 = pfuVar4;
                        qpt.ca(pfuVar5, set, jjqVar, owfVar10);
                        Iterable$EL.forEach((Set) tzjVarB2.a(), new lca(ourVar5, pfuVar5, owfVar9, owfVar10, owfVarA2, owfVarA3, 0));
                    }
                }, "pckreqdyn", -1);
            case 17:
                kgn kgnVar = (kgn) this.d.a();
                kgw kgwVar = (kgw) this.c.a();
                pkc pkcVar = (pkc) this.g.a();
                hbj hbjVar5 = (hbj) this.e.a();
                nkw nkwVar = (nkw) this.b.a();
                rwc rwcVar4 = (rwc) this.h.a();
                rwc rwcVar5 = (rwc) this.a.a();
                Object objP = (!rwcVar4.h() || ((uem) rwcVar4.c()).a() == null) ? (!rwcVar5.h() || ((uem) rwcVar5.c()).a() == null) ? kzz.p(kgwVar.j(), pkcVar, kgnVar, hbjVar5, nkwVar, ((Boolean) ((owf) this.f.a()).dL()).booleanValue()) : (pjo) ((uem) rwcVar5.c()).a() : (pjo) ((uem) rwcVar4.c()).a();
                objP.getClass();
                return objP;
            case 18:
                return new ldg((hbj) this.e.a(), (pfu) this.g.a(), (iso) this.h.a(), (kow) this.c.a(), (Executor) this.d.a(), (pbn) this.a.a(), (owf) this.f.a(), (jva) this.b.a());
            case 19:
                final owf owfVar9 = (owf) this.c.a();
                tzx tzxVar14 = this.f;
                final owf owfVarB2 = ((ims) this.g).b();
                final owq owqVar = (owq) tzxVar14.a();
                final owq owqVar2 = (owq) this.h.a();
                tzx tzxVar15 = this.e;
                tzx tzxVar16 = this.d;
                final jgt jgtVarA = ((ixv) this.b).a();
                final fdq fdqVarA = ((ixw) tzxVar16).a();
                final hbj hbjVar6 = (hbj) tzxVar15.a();
                final out outVar2 = (out) this.a.a();
                return new mcw() { // from class: lhx
                    @Override // java.lang.Runnable
                    public final void run() {
                        owf owfVarC;
                        owf owfVar10;
                        hbj hbjVar7 = hbjVar6;
                        if (hbjVar7.o(hal.a)) {
                            owf owfVar11 = owfVarB2;
                            owf owfVar12 = owfVar9;
                            pka pkaVar = pka.BACK;
                            pkaVar.getClass();
                            owf owfVarC2 = owl.c(owl.h(owfVar12, new kou(hbjVar7, 6)), owl.h(owfVar11, new kou(pkaVar, 7)));
                            pkaVar.getClass();
                            owfVarC = owl.c(owl.h(owfVar12, new leb(7)), owl.h(owfVar11, new kou(pkaVar, 7)));
                            owfVar10 = owfVarC2;
                        } else {
                            owi owiVar = new owi(false);
                            owfVarC = new owi(false);
                            owfVar10 = owiVar;
                        }
                        owf owfVar13 = owfVarC;
                        jgt jgtVar = jgtVarA;
                        out outVar3 = outVar2;
                        owq owqVar3 = owqVar2;
                        owq owqVar4 = owqVar;
                        fdq fdqVar = fdqVarA;
                        our ourVarJ = fdqVar.j();
                        sxo sxoVar = sxo.a;
                        ourVarJ.d(owfVar10.dK(owqVar4, sxoVar));
                        fdqVar.j().d(owfVar13.dK(owqVar3, sxoVar));
                        outVar3.execute(new iax(jgtVar, owqVar4, owfVar10, owqVar3, owfVar13, 2));
                    }
                };
            default:
                return new ljj((ler) this.h.a(), (owq) this.f.a(), (owf) this.c.a(), (owq) this.e.a(), (out) this.g.a(), (mdy) this.a.a(), (owf) this.b.a(), (mwq) this.d.a());
        }
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, byte[] bArr) {
        this.i = i;
        this.e = tzxVar;
        this.g = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
        this.d = tzxVar5;
        this.b = tzxVar6;
        this.h = tzxVar7;
        this.f = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, byte[] bArr, byte[] bArr2) {
        this.i = i;
        this.c = tzxVar;
        this.g = tzxVar2;
        this.f = tzxVar3;
        this.h = tzxVar4;
        this.b = tzxVar5;
        this.d = tzxVar6;
        this.e = tzxVar7;
        this.a = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, char[] cArr) {
        this.i = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, char[] cArr, byte[] bArr) {
        this.i = i;
        this.h = tzxVar;
        this.f = tzxVar2;
        this.c = tzxVar3;
        this.e = tzxVar4;
        this.g = tzxVar5;
        this.a = tzxVar6;
        this.b = tzxVar7;
        this.d = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, float[] fArr) {
        this.i = i;
        this.f = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
        this.g = tzxVar5;
        this.d = tzxVar6;
        this.e = tzxVar7;
        this.h = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, int[] iArr) {
        this.i = i;
        this.g = tzxVar;
        this.h = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.b = tzxVar5;
        this.e = tzxVar6;
        this.a = tzxVar7;
        this.f = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, short[] sArr) {
        this.i = i;
        this.b = tzxVar;
        this.g = tzxVar2;
        this.h = tzxVar3;
        this.f = tzxVar4;
        this.d = tzxVar5;
        this.a = tzxVar6;
        this.c = tzxVar7;
        this.e = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, boolean[] zArr) {
        this.i = i;
        this.g = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.a = tzxVar7;
        this.h = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, float[][] fArr) {
        this.i = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.h = tzxVar3;
        this.e = tzxVar4;
        this.f = tzxVar5;
        this.d = tzxVar6;
        this.a = tzxVar7;
        this.g = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, int[][] iArr) {
        this.i = i;
        this.e = tzxVar;
        this.b = tzxVar2;
        this.f = tzxVar3;
        this.c = tzxVar4;
        this.h = tzxVar5;
        this.d = tzxVar6;
        this.a = tzxVar7;
        this.g = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, short[][] sArr) {
        this.i = i;
        this.a = tzxVar;
        this.g = tzxVar2;
        this.h = tzxVar3;
        this.f = tzxVar4;
        this.e = tzxVar5;
        this.b = tzxVar6;
        this.d = tzxVar7;
        this.c = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, boolean[][] zArr) {
        this.i = i;
        this.e = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
        this.h = tzxVar5;
        this.g = tzxVar6;
        this.b = tzxVar7;
        this.f = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, byte[][][] bArr) {
        this.i = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.h = tzxVar3;
        this.c = tzxVar4;
        this.a = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.d = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, char[][][] cArr) {
        this.i = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.c = tzxVar5;
        this.g = tzxVar6;
        this.h = tzxVar7;
        this.f = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, float[][][] fArr) {
        this.i = i;
        this.e = tzxVar;
        this.g = tzxVar2;
        this.h = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.a = tzxVar6;
        this.f = tzxVar7;
        this.b = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, int[][][] iArr) {
        this.i = i;
        this.f = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.g = tzxVar5;
        this.a = tzxVar6;
        this.c = tzxVar7;
        this.h = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, short[][][] sArr) {
        this.i = i;
        this.c = tzxVar;
        this.e = tzxVar2;
        this.b = tzxVar3;
        this.h = tzxVar4;
        this.a = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.d = tzxVar8;
    }

    public ixk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, boolean[][][] zArr) {
        this.i = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.g = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.h = tzxVar6;
        this.a = tzxVar7;
        this.f = tzxVar8;
    }
}
