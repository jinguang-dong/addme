package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mul implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final /* synthetic */ int f;

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i) {
        this.f = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() throws Exception {
        Object sfmVar;
        switch (this.f) {
            case 0:
                return new muk((Activity) this.a.a(), (jgt) this.b.a(), (out) this.c.a(), (mdy) this.d.a(), (pnk) this.e.a());
            case 1:
                return new msd((fvu) this.b.a(), (ndj) this.d.a(), (krj) this.c.a(), (mzz) this.e.a(), (qrh) this.a.a(), null);
            case 2:
                hbj hbjVar = (hbj) this.c.a();
                return new muu(hbjVar, (mdy) this.d.a(), (ocq) this.e.a(), ((imm) this.a).b());
            case 3:
                return new mvk((mni) this.b.a(), (ocq) this.d.a(), (hbj) this.c.a(), ((imz) this.a).a(), (luj) this.e.a());
            case 4:
                tzx tzxVar = this.d;
                final tzj tzjVarB = tzs.b(this.a);
                final pbn pbnVar = (pbn) tzxVar.a();
                fqg fqgVar = (fqg) this.b.a();
                hbj hbjVar2 = (hbj) this.e.a();
                owq owqVar = (owq) this.c.a();
                if (hbjVar2.p(gza.q)) {
                    fqgVar.b.d(((ngr) tzjVarB.a()).a.dK(new ktd(owqVar, tzjVarB, 15, null), sxo.a));
                    sfmVar = new sfm(new npo(new npn() { // from class: ngu
                        @Override // defpackage.npn
                        public final npl a(npj npjVar) {
                            return new ngt(npjVar.f(), (ngr) tzjVarB.a(), pbnVar);
                        }
                    }, owqVar, npm.OVERLAY));
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 5:
                return new nju((mzz) this.d.a(), this.b, (out) this.e.a(), ((iyb) this.a).a(), (hbj) this.c.a());
            case 6:
                return new nkb((nby) this.d.a(), this.b, (hbj) this.c.a(), ((ixv) this.a).a(), (imi) this.e.a());
            case 7:
                return new qrh(((pba) this.c).a(), (Handler) this.a.a(), (qpf) this.b.a(), ((phl) this.e).a(), (pbn) this.d.a());
            case 8:
                our ourVar = (our) this.c.a();
                final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.a();
                final pfr pfrVar = (pfr) this.b.a();
                final pbn pbnVar2 = (pbn) this.d.a();
                pbc pbcVarA = ((pba) this.e).a();
                final our ourVar2 = new our();
                final pbc pbcVarA2 = pbcVarA.a("FrameServer");
                ourVar.d(new paq() { // from class: pfk
                    @Override // defpackage.paq, java.lang.AutoCloseable
                    public final void close() {
                        scheduledExecutorService.schedule(new dwq(pbnVar2, pbcVarA2, pfrVar, ourVar2, 12), 2000L, TimeUnit.MILLISECONDS);
                    }
                });
                return ourVar2;
            case 9:
                Map map = (Map) this.e.a();
                pfi pfiVar = (pfi) this.b.a();
                vp vpVar = (vp) this.a.a();
                lat latVar = (lat) this.d.a();
                our ourVar3 = (our) this.c.a();
                map.getClass();
                pfiVar.getClass();
                vpVar.getClass();
                latVar.getClass();
                ourVar3.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    peq peqVar = (peq) entry.getKey();
                    ocq ocqVar = (ocq) entry.getValue();
                    peo peoVarA = pfiVar.a(peqVar);
                    wq wqVar = vpVar.b;
                    ocqVar.getClass();
                    pv pvVar = (pv) wqVar.g.get(ocqVar);
                    if (pvVar != null) {
                        Objects.toString(peoVarA);
                        Objects.toString(pvVar);
                        linkedHashMap.put(peoVarA, pvVar);
                    }
                }
                for (phy phyVar : latVar.c) {
                    ourVar3.d(phyVar.a.dK(new fcd((Map) linkedHashMap, phyVar, vpVar, 12), sxo.a));
                }
                for (phx phxVar : latVar.a) {
                    pv pvVar2 = (pv) linkedHashMap.get(phxVar);
                    if (pvVar2 != null) {
                        int i = pvVar2.a;
                        rh.a(i);
                        Objects.toString(phxVar.h());
                        vpVar.b(i, phxVar.h());
                    }
                }
                return linkedHashMap;
            case 10:
                Executor executor = (Executor) this.b.a();
                tzx tzxVar2 = this.a;
                tzx tzxVar3 = this.c;
                Set setA = ((tzz) this.e).a();
                qvj qvjVarA = ((qnx) tzxVar3).a();
                return new qoa(executor, setA, qvjVarA, this.d);
            case 11:
                ((imm) this.a).b();
                tzx tzxVar4 = this.b;
                return new qog(this.d, this.e, this.c, tzxVar4);
            case 12:
                tzx tzxVar5 = this.c;
                tzx tzxVar6 = this.e;
                String strA = ((qqw) this.d).a();
                sjp sjpVarA = ((qqg) tzxVar6).a();
                qpt qptVar = (qpt) tzxVar5.a();
                ((imm) this.a).b();
                return new qpq(strA, sjpVarA, qptVar, this.b);
            case 13:
                tzx tzxVar7 = this.e;
                Context contextB = ((imm) this.a).b();
                sjp sjpVar = (sjp) tzxVar7.a();
                return new qtx(this.b, contextB, this.d, this.c, sjpVar);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new quj(((qqr) this.e).a(), (syx) this.c.a(), (Executor) this.b.a(), tzs.b(this.a), this.d);
            default:
                ((jaf) this.e).b();
                return new sfm((((rwc) ((tzu) this.c).a).h() && ((fkh) this.b).b().h()) ? (qqs) this.d.a() : (qqs) this.a.a());
        }
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr) {
        this.f = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[] cArr) {
        this.f = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[] fArr) {
        this.f = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[] iArr) {
        this.f = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[] sArr) {
        this.f = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[] zArr) {
        this.f = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.a = tzxVar4;
        this.c = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[][] bArr) {
        this.f = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[][] cArr) {
        this.f = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[][] fArr) {
        this.f = i;
        this.d = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[][] iArr) {
        this.f = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
        this.d = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[][] sArr) {
        this.f = i;
        this.e = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.c = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.b = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
    }

    public mul(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[][][] cArr) {
        this.f = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.d = tzxVar5;
    }
}
