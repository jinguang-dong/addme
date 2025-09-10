package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.PostviewParams;
import j$.util.Optional;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kyu {
    private static final sgv c = sgv.g("kyu");
    public final hzs a;
    public final hzj b;
    private final pjo d;
    private final kqp e;
    private final hxs f;
    private final hxv g;
    private final pbn h;
    private final lat i;
    private final ihr j;
    private final iec k;
    private final ley l;
    private final Integer m;
    private final uem n;
    private final Optional o;
    private final kzn p;
    private final cxb q;

    public kyu(hzs hzsVar, pjo pjoVar, kqp kqpVar, hxs hxsVar, hxv hxvVar, hzj hzjVar, cxb cxbVar, pbn pbnVar, lat latVar, ihr ihrVar, iec iecVar, ley leyVar, hbj hbjVar, uem uemVar, jwd jwdVar, kzn kznVar) {
        this.a = hzsVar;
        this.d = pjoVar;
        this.e = kqpVar;
        this.f = hxsVar;
        this.g = hxvVar;
        this.q = cxbVar;
        this.b = hzjVar;
        this.h = pbnVar;
        this.i = latVar;
        this.j = ihrVar;
        this.k = iecVar;
        this.l = leyVar;
        this.m = (Integer) hbjVar.a(gzs.o).orElse(-1);
        this.n = uemVar;
        this.o = jwdVar.h;
        this.p = kznVar;
    }

    public final int a(pdk pdkVar, iby ibyVar, boolean z, int i, int i2, tbq tbqVar, rwc rwcVar, boolean z2) throws pco, tpz {
        tbq tbqVar2;
        poj pojVarQ;
        pjr pjrVarD;
        int i3;
        poj pojVarO;
        int length;
        pbn pbnVar = this.h;
        pbnVar.f("processFrame");
        try {
            pbnVar.f("awaitComplete");
            ojl.by(pdkVar);
            pbn pbnVar2 = this.h;
            pbnVar2.g();
            pdo pdoVarB = pdkVar.b();
            lau lauVarC = this.i.c(pdkVar, z2 ? 3 : 2);
            pdoVarB.getClass();
            if (z) {
                pbnVar2.f("hdrPlusPayloadProcessorManager.addPayloadFrame");
                this.b.b(ibyVar, lauVarC);
                pbnVar2.g();
            }
            poe poeVarD = pdkVar.d();
            if (poeVarD == null) {
                ((sgt) c.b().M(3774)).H("Failure for frame %d @%d of %d for shotId %s", Integer.valueOf(i + 1), Long.valueOf(pdoVarB.c), Integer.valueOf(i2), Integer.valueOf(ibyVar.a()));
                if (z2) {
                    ibyVar.a();
                    this.a.m(ibyVar);
                }
                pbnVar2.g();
                return i;
            }
            if (z) {
                tbqVar2 = tbqVar;
                if (tbqVar2.equals(tbq.e)) {
                    Long l = (Long) poeVarD.a(CaptureResult.SENSOR_EXPOSURE_TIME);
                    if (l != null) {
                        l.longValue();
                    }
                    ibyVar.a();
                }
            } else {
                tbqVar2 = tbqVar;
            }
            pbnVar2.f("pckHdrZsl#addPayloadFrame");
            poj pojVarN = lauVarC.n(lcz.DATA_STREAM);
            poj pojVarS = lauVarC.s();
            if (z) {
                pojVarQ = lauVarC.p();
                pojVarO = lauVarC.o();
                pjrVarD = lauVarC.l().d();
                i3 = i + 1;
            } else {
                pojVarQ = lauVarC.q();
                peo peoVarM = lauVarC.m();
                if (peoVarM == null) {
                    ((sgt) c.b().M(3772)).s("Can't find the source camera for the secondary image.");
                    throw new pco("Can't find the source camera for the secondary image.");
                }
                pjrVarD = peoVarM.d();
                i3 = i + 1;
                pojVarO = null;
            }
            if (lauVarC.t() && !z) {
                poeVarD = ldj.b(poeVarD, pjrVarD.a);
            }
            poe poeVar = poeVarD;
            pdkVar.close();
            Optional optional = this.o;
            poeVar.getClass();
            byte[] bArr = (byte[]) optional.map(new idh(poeVar, 13)).orElse(null);
            if (bArr == null) {
                Face[] faceArr = (Face[]) poeVar.a(CaptureResult.STATISTICS_FACES);
                if (faceArr != null && (length = faceArr.length) > 0) {
                    ((sgt) c.c().M(3769)).t("Got empty bytes for face deblur node log from vendor tag. face_cnt=%d", length);
                }
            } else {
                try {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    tow towVarA = tow.a();
                    tyx tyxVar = tyx.a;
                    ton tonVarL = ton.L(byteBufferWrap);
                    tph tphVarO = tyxVar.o();
                    try {
                        try {
                            try {
                                trg trgVarB = tra.a.b(tphVarO);
                                trgVarB.l(tphVarO, too.p(tonVarL), towVarA);
                                trgVarB.g(tphVarO);
                                tph.D(tphVarO);
                                tph.D(tphVarO);
                                ibyVar.e.add((tyx) tphVarO);
                            } catch (tpz e) {
                                if (e.a) {
                                    throw new tpz(e);
                                }
                                throw e;
                            } catch (tro e2) {
                                throw e2.a();
                            }
                        } catch (RuntimeException e3) {
                            if (e3.getCause() instanceof tpz) {
                                throw ((tpz) e3.getCause());
                            }
                            throw e3;
                        }
                    } catch (IOException e4) {
                        if (e4.getCause() instanceof tpz) {
                            throw ((tpz) e4.getCause());
                        }
                        throw new tpz(e4);
                    }
                } catch (tpz unused) {
                    ((sgt) c.b().M(3768)).s("Failed to parse FaceDeblurNodeLog from vendor tag.");
                }
            }
            this.a.n(ibyVar, pjrVarD, i, poeVar, tbqVar2, pojVarQ, pojVarO, pojVarN, pojVarS, rwcVar, null);
            if (pojVarQ != null) {
                ibyVar.a();
            } else {
                ((sgt) c.c().M(3770)).I("Ignoring missing raw frame %d of %d @%d (%d) for shot %d (added empty payload) .", Integer.valueOf(i3), Integer.valueOf(i2), Long.valueOf(pdoVarB.c), Long.valueOf(pdoVarB.b), Integer.valueOf(ibyVar.a()));
                if (pojVarO != null) {
                    pojVarO.close();
                }
                i3 = i;
            }
            pbn pbnVar3 = this.h;
            pbnVar3.g();
            pbnVar3.g();
            return i3;
        } catch (InterruptedException e5) {
            pdo pdoVarB2 = pdkVar.b();
            ((sgt) ((sgt) c.b().i(e5)).M(3776)).G("Completion failure for frame %d @%d of %d, skipping.", Integer.valueOf(i + 1), Long.valueOf(pdoVarB2 != null ? pdoVarB2.c : -1L), Integer.valueOf(i2));
            return i;
        } finally {
            this.h.g();
        }
    }

    public final int b(List list, iby ibyVar, boolean z, int i, int i2, rwc rwcVar) throws pco, tpz {
        boolean z2;
        pbn pbnVar = this.h;
        pbnVar.f("findFramesToOmitDueToTemporalBinning");
        Set setA = this.l.a(list);
        pbnVar.h("pckZslHdrPlusProcessor#processPayload");
        int i3 = 0;
        int iA = 0;
        while (i3 < list.size()) {
            pdk pdkVar = (pdk) list.get(i3);
            pdo pdoVarB = pdkVar.b();
            if (pdoVarB == null) {
                ((sgt) c.c().M(3783)).t("Skipping invalid frame at %d", iA);
                pdkVar.close();
            } else {
                boolean z3 = i3 >= list.size() - i2;
                if (setA.contains(pdoVarB)) {
                    pdkVar.close();
                    if (z3) {
                        z2 = true;
                    }
                } else {
                    z2 = z3;
                }
                iA = a(pdkVar, ibyVar, z, iA, i, tbq.c, rwcVar, z2);
            }
            i3++;
        }
        pbnVar.g();
        if (iA > this.m.intValue()) {
            return iA;
        }
        throw new IllegalStateException(a.bv(iA, "Payload size too low: "));
    }

    public final void c(iby ibyVar, poe poeVar, boolean z) {
        this.a.q(ibyVar);
        if (z) {
            this.b.c(ibyVar, null, poeVar);
        }
    }

    public final int d(pdk pdkVar, iby ibyVar, int i, int i2, tbq tbqVar) {
        return a(pdkVar, ibyVar, true, i, i2, tbqVar, rvk.a, true);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, lss] */
    public final iby f(pjr pjrVar, gga ggaVar, int i, poe poeVar, hxu hxuVar, boolean z, boolean z2, boolean z3) {
        iby ibyVarH;
        gga ggaVar2 = ggaVar;
        try {
            try {
                hzs hzsVar = this.a;
                int iB = hzsVar.b(hzsVar.j(poeVar, pjrVar));
                if (z) {
                    kzn kznVar = this.p;
                    String str = kznVar.g;
                    if (str == null) {
                        str = (String) kznVar.b.dL();
                    }
                    if ((kznVar.c != nkw.PORTRAIT || kznVar.d) && !kznVar.e && !str.isEmpty() && !pjrVar.a.equals(str)) {
                        String str2 = String.format("Physical camera mismatch. Active camera: %s, provided: %s", str, pjrVar);
                        ((sgt) kzn.a.c().M(3861)).v("%s", str2);
                        kznVar.h.a(new hhn(str2));
                        hgc hgcVar = kznVar.i;
                    }
                }
                pbn pbnVar = this.h;
                pbnVar.f("createPostviewParams");
                PostviewParams postviewParamsA = hxy.a(this.d, this.e);
                pbnVar.h("detectFusionRequest");
                iea ieaVarA = this.k.a(poeVar, z, z3);
                boolean z4 = ieaVarA.a() == idz.e || ieaVarA.a() == idz.DEBLUR || ieaVarA.a() == idz.ZOOM;
                pbnVar.g();
                if (z) {
                    pbnVar.f("createPortraitShotParams");
                    jod jodVarL = this.q.L(poeVar, iB, pjrVar);
                    pbnVar.h("getJpegRotation");
                    int iE = ggaVar2.b.e();
                    pbnVar.h("populateShotConfig");
                    this.f.b(ggaVar, jodVarL, hxuVar, iE, true, ieaVarA);
                    ggaVar2 = ggaVar;
                    pbnVar.g();
                } else if (!z4) {
                    throw new hhg(eld.b(ieaVarA, "Not processing secondary payload, mode: "));
                }
                int i2 = true != z2 ? -1 : 0;
                if (z) {
                    ((kwu) this.n).a().a(ggaVar2.b.o());
                }
                pbnVar.f("pckHdrZsl#startZslShot");
                ibyVarH = hzsVar.H(pjrVar, ggaVar2, postviewParamsA, hxuVar.k, poeVar, i2, i, !z, ieaVarA);
            } catch (IllegalArgumentException | IllegalStateException | InterruptedException | ExecutionException | pco e) {
                ((sgt) ((sgt) c.b().i(e)).M(3763)).s("Unable to start ZSL shot.");
                ibyVarH = null;
            }
            return ibyVarH;
        } finally {
            this.h.g();
        }
    }

    public final void g(List list, kmy kmyVar, gga ggaVar, int i) throws hgz, hhl {
        poe poeVar;
        if (list.isEmpty()) {
            throw new hgz("No frames to process found.");
        }
        hxu hxuVarA = this.g.a();
        pjr pjrVarD = null;
        int i2 = 0;
        poe poeVar2 = null;
        while (true) {
            if (i2 >= ((sex) list).c) {
                poeVar = poeVar2;
                break;
            }
            lau lauVarA = this.i.a((pdk) list.get(i2));
            poe poeVarD = lauVarA.a.d();
            if (poeVarD != null) {
                pjrVarD = lauVarA.l().d();
                poeVar = poeVarD;
                break;
            } else {
                i2++;
                poeVar2 = poeVarD;
            }
        }
        pjr pjrVar = pjrVarD;
        if (poeVar == null) {
            kwp.a(list);
            throw new hhl("No metadata found for the metering frame.");
        }
        pjrVar.getClass();
        rvk rvkVar = rvk.a;
        tcq tcqVar = hxy.a;
        i(list, 0, kmyVar, ggaVar, i, true, poeVar, hxuVarA, null, pjrVar, rvkVar, new BurstSpec());
    }

    public final void h(List list, kmy kmyVar, gga ggaVar) throws hgz, hhl {
        g(list, kmyVar, ggaVar, -1);
    }

    public final void i(List list, int i, kmy kmyVar, gga ggaVar, int i2, boolean z, poe poeVar, hxu hxuVar, iby ibyVar, pjr pjrVar, rwc rwcVar, BurstSpec burstSpec) {
        pco pcoVar;
        iby ibyVarF;
        kmyVar.close();
        int size = list.size();
        if (size <= this.m.intValue()) {
            throw new IllegalStateException(a.bv(size, "Payload size too low: "));
        }
        try {
            try {
                pbn pbnVar = this.h;
                pbnVar.f("pckHdrZsl#processFrames");
                ibyVarF = ibyVar == null ? f(pjrVar, ggaVar, i2, poeVar, hxuVar, z, false, false) : ibyVar;
                try {
                    if (ibyVarF == null) {
                        ((sgt) c.c().M(3781)).s("Failed to initiate HDR plus shot capture.");
                        pbnVar.g();
                        throw new hhh("Invalid shot received from HdrPlusSession.");
                    }
                    pbnVar.h("pckHdrZsl#processPayload");
                    c(ibyVarF, poeVar, z);
                    b(list, ibyVarF, z, list.size(), i, rwcVar);
                    pbnVar.g();
                    iby ibyVar2 = ibyVarF;
                    try {
                        e(list.size(), i, ggaVar, poeVar, ibyVar2, z, burstSpec);
                        kwp.a(list);
                        this.h.g();
                    } catch (pco e) {
                        e = e;
                        ibyVarF = ibyVar2;
                        pcoVar = e;
                        ((sgt) ((sgt) c.b().i(pcoVar)).M(3780)).s("Error processing HDR+ payload.");
                        if (ibyVarF != null) {
                            this.a.l(ibyVarF);
                        }
                        throw new hhq("Error processing HDR+ payload.", pcoVar);
                    }
                } catch (pco e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                kwp.a(list);
                this.h.g();
                throw th;
            }
        } catch (pco e3) {
            pcoVar = e3;
            ibyVarF = ibyVar;
        }
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, lss] */
    public final void e(int i, int i2, gga ggaVar, poe poeVar, iby ibyVar, boolean z, BurstSpec burstSpec) throws Throwable {
        pbn pbnVar = this.h;
        pbnVar.f(INRGuObcrHjSQz.aWrSLwJ);
        rwc rwcVarJ = rvk.a;
        long jA = burstSpec.c().a();
        while (i2 < jA) {
            ibyVar.a();
            this.a.m(ibyVar);
            i2++;
        }
        hzs hzsVar = this.a;
        if (hzsVar.x(ibyVar, burstSpec)) {
            if (z) {
                this.b.d(ibyVar, burstSpec);
                ?? r9 = ggaVar.b;
                r9.H();
                mdm mdmVarO = r9.o();
                mdmVarO.c(poeVar, true);
                int iIntValue = r9.m() == ltf.NORMAL ? 1 : this.j.fr().intValue();
                tpc tpcVarM = sum.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                sum sumVar = (sum) tphVar;
                sumVar.b = 1 | sumVar.b;
                sumVar.c = iIntValue;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                sum sumVar2 = (sum) tpcVarM.b;
                sumVar2.b |= 2;
                sumVar2.d = i;
                ((mdo) mdmVarO).x = (sum) tpcVarM.l();
            }
            if (!hzsVar.y(ibyVar)) {
                rwcVarJ = rwc.j(new hhb("Error ending the HDR+ shot " + ibyVar.a()));
            }
        } else {
            rwcVarJ = rwc.j(new hha("Error ending the HDR+ payload, aborting shot " + ibyVar.a()));
        }
        if (!rwcVarJ.h()) {
            pbnVar.g();
            return;
        }
        ((sgt) c.b().M(3766)).v("%s", ((hht) rwcVarJ.c()).getMessage());
        if (z) {
            this.b.a(ibyVar.x.b.l());
        }
        hzsVar.l(ibyVar);
        throw ((Throwable) rwcVarJ.c());
    }
}
