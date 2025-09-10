package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knp implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final /* synthetic */ int j;

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i) {
        this.j = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = 0;
        switch (this.j) {
            case 0:
                owf owfVar = (owf) this.a.a();
                owf owfVar2 = (owf) this.b.a();
                tzx tzxVar = this.d;
                owf owfVarB = ((ihb) this.c).b();
                ibb ibbVar = (ibb) tzxVar.a();
                hyd hydVar = (hyd) this.e.a();
                hbj hbjVar = (hbj) this.f.a();
                idt idtVar = (idt) this.g.a();
                jho jhoVar = (jho) this.h.a();
                ((Boolean) this.i.a()).booleanValue();
                return new kno(owfVar, owfVar2, owfVarB, ibbVar, hydVar, hbjVar, idtVar, jhoVar);
            case 1:
                return new knd((khb) this.g.a(), (syu) this.d.a(), ((hco) this.f).a(), (fcr) this.c.a(), (luj) this.h.a(), tzs.b(this.b), ((Boolean) this.e.a()).booleanValue(), (pbn) this.a.a(), ((kiu) this.i).a());
            case 2:
                rwc rwcVarB = ((ixr) this.b).b();
                ldd lddVar = (ldd) this.e.a();
                boolean zBooleanValue = ((Boolean) this.h.a()).booleanValue();
                int iIntValue = ((Integer) this.i.a()).intValue();
                pom pomVar = (pom) this.d.a();
                long jLongValue = ((Long) this.c.a()).longValue();
                gzi gziVar = gzo.a;
                boolean zH = rwcVarB.h();
                tzx tzxVar2 = this.a;
                tzx tzxVar3 = this.g;
                if (!zH) {
                    return prh.L(((pjo) tzxVar3.a()).j(), ((kij) tzxVar2).a());
                }
                pep pepVarA = peq.a();
                pepVarA.s(jLongValue);
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((pjo) tzxVar3.a()).m(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION);
                if (zBooleanValue && streamConfigurationMap != null && streamConfigurationMap.isOutputSupportedFor(iIntValue)) {
                    i = 1;
                }
                pepVarA.r(pet.IMAGE_READER);
                pepVarA.b(((pjo) tzxVar3.a()).j());
                pepVarA.n(((kij) tzxVar2).a());
                pepVarA.i(iIntValue);
                pepVarA.c(9);
                pepVarA.h(true);
                pepVarA.m(i);
                pepVarA.a = rwc.j(pomVar);
                pepVarA.k(-4);
                pepVarA.j(lddVar.b(lcz.VIEWFINDER));
                return pepVarA.a();
            case 3:
                tzx tzxVar4 = this.f;
                tzx tzxVar5 = this.a;
                Object objA = tzxVar4.a();
                kqp kqpVarA = ((kqr) tzxVar5).a();
                nms nmsVar = (nms) this.c.a();
                nkw nkwVarA = ((kid) this.b).a();
                fgn fgnVar = (fgn) this.g.a();
                boolean zBooleanValue2 = ((Boolean) this.d.a()).booleanValue();
                lkk lkkVar = (lkk) this.h.a();
                ldd lddVar2 = (ldd) this.i.a();
                hbj hbjVar2 = (hbj) this.e.a();
                pjo pjoVarE = nmsVar.e();
                pka pkaVarL = pjoVarE.l();
                boolean z = zBooleanValue2 && fgnVar.a();
                if (!fgnVar.d(nkwVarA) || !fgnVar.a || !pkaVarL.equals(pka.BACK) || ((zBooleanValue2 && !z) || !lkkVar.equals(lkk.AUTO))) {
                    return sfc.a;
                }
                pjoVarE.j();
                pjoVarE.s();
                pas pasVar = new pas(640, 480);
                pas pasVar2 = kqpVarA.b;
                pae paeVar = pae.b;
                if (paeVar.l(pae.i(pasVar2))) {
                    pasVar = new pas(640, (int) paeVar.b(640.0f));
                } else if (pae.c.l(pae.i(pasVar2))) {
                    pasVar = pasVar.h();
                }
                pko pkoVar = new pko(kqpVarA.a.a, pasVar);
                sbr sbrVar = new sbr();
                lcz lczVar = lcz.YUV_TELE_ZOOM;
                lcc lccVar = new lcc();
                lccVar.a = pjoVarE.j();
                lccVar.b = pkoVar;
                lccVar.c = 3;
                lccVar.d = false;
                lccVar.e = false;
                lccVar.k = lddVar2.b(lczVar);
                lccVar.f = 256L;
                sbrVar.f(lczVar, lccVar.a());
                pjo pjoVarF = nmsVar.f();
                if (pjoVarF != null && hbjVar2.o(hae.z)) {
                    pjoVarF.s();
                    lcz lczVar2 = lcz.YUV_TELE_ZOOM_RM;
                    lcc lccVar2 = new lcc();
                    lccVar2.a = ((pjn) pjoVarF).a;
                    lccVar2.b = pkoVar;
                    lccVar2.c = 3;
                    lccVar2.d = false;
                    lccVar2.e = false;
                    lccVar2.k = lddVar2.b(lczVar2);
                    lccVar2.f = 256L;
                    sbrVar.f(lczVar2, lccVar2.a());
                }
                return sbrVar.b();
            case 4:
                return new ldh((iso) this.g.a(), (DynamicDepthUtils) this.f.a(), (lat) this.i.a(), ((hxw) this.h).a(), ((kqr) this.d).a(), (pmv) this.b.a(), (Executor) this.e.a(), (pbn) this.a.a(), (iso) this.c.a());
            case 5:
                return new lif(((imm) this.e).b(), (mni) this.b.a(), (ocq) this.h.a(), ((ixw) this.g).a(), (owf) this.c.a(), (muu) this.i.a(), ((ngy) this.f).a(), (owf) this.a.a(), (out) this.d.a());
            case 6:
                return new lii((out) this.d.a(), ((ixw) this.g).a(), ((ngy) this.f).a(), (owf) this.h.a(), (jkd) this.b.a(), (lkn) this.a.a(), (ljj) this.i.a(), (jkj) this.e.a(), (jkl) this.c.a());
            case 7:
                return new liy((owf) this.b.a(), (owq) this.g.a(), (owf) this.e.a(), (pfl) this.d.a(), (ljd) this.f.a(), (owf) this.i.a(), (owf) this.a.a(), (owf) this.c.a(), (ScheduledExecutorService) this.h.a());
            case 8:
                mdy mdyVar = (mdy) this.c.a();
                fvu fvuVar = (fvu) this.b.a();
                tzx tzxVar6 = this.a;
                tzj tzjVarB = tzs.b(this.i);
                nll nllVar = (nll) tzxVar6.a();
                mgr mgrVar = (mgr) this.h.a();
                owq owqVar = (owq) this.g.a();
                luj lujVar = (luj) this.d.a();
                return new lra(mdyVar, fvuVar, tzjVarB, nllVar, mgrVar, owqVar, lujVar, (owf) this.f.a());
            case 9:
                return new lyq((pit) this.i.a(), (lza) this.d.a(), (out) this.b.a(), iso.b(), (lsp) this.e.a(), this.f, (owq) this.h.a(), (owq) this.g.a(), ((lxh) this.a).b(), (pbn) this.c.a());
            case 10:
                mba mbaVar = (mba) this.h.a();
                tzx tzxVar7 = this.i;
                Context contextB = ((imm) this.g).b();
                ((Boolean) this.e.a()).booleanValue();
                hbw hbwVar = (hbw) this.b.a();
                hbj hbjVar3 = (hbj) this.f.a();
                return new mah(mbaVar, contextB, hbwVar, hbjVar3, (luj) this.c.a(), (luj) this.a.a());
            case 11:
                return new mgi((owq) this.i.a(), (owq) this.g.a(), (owq) this.b.a(), (luw) this.a.a(), (owq) this.e.a(), (pmv) this.c.a(), (luj) this.d.a(), (luj) this.h.a(), (hbj) this.f.a());
            case 12:
                tzx tzxVar8 = this.i;
                return new mmk(((ixw) this.g).a(), ((fcw) this.b).a(), ((imm) this.e).b(), (hie) tzxVar8.a(), tzs.b(this.d), (rwc) this.c.a(), (out) this.h.a(), (nas) this.a.a(), (owf) this.f.a());
            case 13:
                our ourVar = (our) this.h.a();
                owq owqVar2 = (owq) this.e.a();
                ((imm) this.b).b();
                mwt mwtVar = new mwt((Executor) this.f.a(), ourVar, owqVar2);
                if (!mwtVar.d) {
                    mwtVar.b.d(mwtVar.c.dK(new mix(mwtVar, 16), mwtVar.a));
                    mwtVar.d = true;
                }
                return mwtVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                lat latVar = (lat) this.g.a();
                tzx tzxVar9 = this.i;
                tzx tzxVar10 = this.e;
                Object objA2 = this.f.a();
                pfl pflVarA = ((pgg) tzxVar10).a();
                our ourVar2 = (our) tzxVar9.a();
                tzx tzxVar11 = this.a;
                pbc pbcVarA = ((pba) this.d).a();
                pbn pbnVar = (pbn) tzxVar11.a();
                ((pfn) this.b).a();
                return new pgn(latVar, (rcg) objA2, pflVarA, ourVar2, pbcVarA, pbnVar, (ojl) this.c.a());
            case 15:
                tzx tzxVar12 = this.f;
                return new qqt(((imm) this.b).b(), (rwc) tzxVar12.a(), ((qqw) this.a).a(), this.d, ((qqi) this.e).a(), (rwc) ((tzu) this.h).a, (rwc) ((tzu) this.g).a, (rwc) ((tzu) this.i).a, this.c);
            default:
                tzx tzxVar13 = this.b;
                qqq qqqVarB = ((qqr) this.h).a();
                ((imm) tzxVar13).b();
                qoz qozVar = (qoz) this.i.a();
                syx syxVar = (syx) this.e.a();
                tzx tzxVar14 = this.f;
                tzx tzxVar15 = this.d;
                tzj tzjVarB2 = tzs.b(this.g);
                tzj tzjVarB3 = tzs.b(tzxVar15);
                Executor executor = (Executor) tzxVar14.a();
                return new qub(qqqVarB, qozVar, syxVar, tzjVarB2, tzjVarB3, this.a, executor);
        }
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, byte[] bArr) {
        this.j = i;
        this.g = tzxVar;
        this.f = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.h = tzxVar5;
        this.b = tzxVar6;
        this.e = tzxVar7;
        this.a = tzxVar8;
        this.i = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, char[] cArr) {
        this.j = i;
        this.a = tzxVar;
        this.g = tzxVar2;
        this.b = tzxVar3;
        this.f = tzxVar4;
        this.e = tzxVar5;
        this.h = tzxVar6;
        this.i = tzxVar7;
        this.d = tzxVar8;
        this.c = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, float[] fArr) {
        this.j = i;
        this.d = tzxVar;
        this.g = tzxVar2;
        this.f = tzxVar3;
        this.h = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
        this.i = tzxVar7;
        this.e = tzxVar8;
        this.c = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, int[] iArr) {
        this.j = i;
        this.g = tzxVar;
        this.f = tzxVar2;
        this.i = tzxVar3;
        this.h = tzxVar4;
        this.d = tzxVar5;
        this.b = tzxVar6;
        this.e = tzxVar7;
        this.a = tzxVar8;
        this.c = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, short[] sArr) {
        this.j = i;
        this.f = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
        this.g = tzxVar5;
        this.d = tzxVar6;
        this.h = tzxVar7;
        this.i = tzxVar8;
        this.e = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, boolean[] zArr) {
        this.j = i;
        this.e = tzxVar;
        this.b = tzxVar2;
        this.h = tzxVar3;
        this.g = tzxVar4;
        this.c = tzxVar5;
        this.i = tzxVar6;
        this.f = tzxVar7;
        this.a = tzxVar8;
        this.d = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, byte[][] bArr) {
        this.j = i;
        this.b = tzxVar;
        this.g = tzxVar2;
        this.e = tzxVar3;
        this.d = tzxVar4;
        this.f = tzxVar5;
        this.i = tzxVar6;
        this.a = tzxVar7;
        this.c = tzxVar8;
        this.h = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, char[][] cArr) {
        this.j = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.i = tzxVar3;
        this.a = tzxVar4;
        this.h = tzxVar5;
        this.g = tzxVar6;
        this.d = tzxVar7;
        this.e = tzxVar8;
        this.f = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, float[][] fArr) {
        this.j = i;
        this.g = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.i = tzxVar4;
        this.d = tzxVar5;
        this.c = tzxVar6;
        this.h = tzxVar7;
        this.a = tzxVar8;
        this.f = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, int[][] iArr) {
        this.j = i;
        this.h = tzxVar;
        this.g = tzxVar2;
        this.i = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.f = tzxVar6;
        this.d = tzxVar7;
        this.c = tzxVar8;
        this.a = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, short[][] sArr) {
        this.j = i;
        this.i = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.f = tzxVar5;
        this.h = tzxVar6;
        this.g = tzxVar7;
        this.a = tzxVar8;
        this.c = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, boolean[][] zArr) {
        this.j = i;
        this.i = tzxVar;
        this.g = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
        this.c = tzxVar6;
        this.d = tzxVar7;
        this.h = tzxVar8;
        this.f = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, byte[][][] bArr) {
        this.j = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.f = tzxVar3;
        this.h = tzxVar4;
        this.e = tzxVar5;
        this.i = tzxVar6;
        this.b = tzxVar7;
        this.g = tzxVar8;
        this.d = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, char[][][] cArr) {
        this.j = i;
        this.g = tzxVar;
        this.f = tzxVar2;
        this.e = tzxVar3;
        this.i = tzxVar4;
        this.d = tzxVar5;
        this.a = tzxVar6;
        this.h = tzxVar7;
        this.b = tzxVar8;
        this.c = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, int[][][] iArr) {
        this.j = i;
        this.h = tzxVar;
        this.b = tzxVar2;
        this.i = tzxVar3;
        this.e = tzxVar4;
        this.g = tzxVar5;
        this.d = tzxVar6;
        this.a = tzxVar7;
        this.f = tzxVar8;
        this.c = tzxVar9;
    }

    public knp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, short[][][] sArr) {
        this.j = i;
        this.b = tzxVar;
        this.f = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.h = tzxVar6;
        this.g = tzxVar7;
        this.i = tzxVar8;
        this.c = tzxVar9;
    }
}
