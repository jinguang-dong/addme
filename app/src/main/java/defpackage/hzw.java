package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.os.StatFs;
import android.util.DisplayMetrics;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AfMetadata;
import com.google.googlex.gcam.ArkInfo;
import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.ClientShotMetadata;
import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameMetadataKey;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GenerateRgbImageOptions;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.LocationData;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.PhysicalStabilityParams;
import com.google.googlex.gcam.PostShutterAfParams;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.Tuning;
import com.google.googlex.gcam.ViewfinderResults;
import com.google.googlex.gcam.hdrplus.NativeHdrPlusInterface;
import com.google.googlex.gcam.hdrplus.NativeMetadataConverter;
import j$.util.Optional;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
class hzw implements hzs {
    private final hxy A;
    private final hyh B;
    private final hzq C;
    private final owf D;
    private final kgg E;
    private final hzj F;
    private final Executor G;
    private final lob H;
    private final lgo I;
    private final pnq J;
    private final pjp K;
    private final kow L;
    private final hxd M;
    private final mhq N;
    private final idt O;
    private final ibb P;
    private final owf Q;
    private final rwc R;
    private final boolean S;
    private final owf T;
    private final ibf U;
    private final nkw V;
    private final ihs W;
    private final pqm X;
    private final luj Y;
    private final hbj Z;
    private final iso aa;
    private final iso ab;
    private final hgc ac;
    private final qrh ad;
    private final gox ae;
    private final cxb af;
    private final cxb ag;
    public final NativeMetadataConverter d;
    public final pbn e;
    private final String g;
    private final String h;
    private final sbv i;
    private final Gcam j;
    private final tgn k;
    private final hyd l;
    private final uem m;
    private final owf n;
    private final iao o;
    private final DisplayMetrics p;
    private final tgp q;
    private final pjo r;
    private final pas s;
    private final uem t;
    private final our u;
    private final kgk v;
    private final uem w;
    private String x;
    private final hbc y;
    private final hyf z;
    private static final sgv f = sgv.g("hzw");
    public static final pas b = new pas(1920, 1080);
    public static final pas c = new pas(1920, 1440);

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, owf] */
    public hzw(DisplayMetrics displayMetrics, hyd hydVar, cxb cxbVar, NativeMetadataConverter nativeMetadataConverter, tgp tgpVar, pjo pjoVar, qrh qrhVar, kqp kqpVar, Gcam gcam, tgn tgnVar, ice iceVar, uem uemVar, hbj hbjVar, luj lujVar, uem uemVar2, our ourVar, kgk kgkVar, iao iaoVar, uem uemVar3, gox goxVar, hbc hbcVar, iso isoVar, hyf hyfVar, hxy hxyVar, hyh hyhVar, hzq hzqVar, owf owfVar, pbn pbnVar, kgg kggVar, iso isoVar2, hzj hzjVar, Executor executor, lob lobVar, lgo lgoVar, pnq pnqVar, cxb cxbVar2, pjp pjpVar, kow kowVar, hxd hxdVar, mhq mhqVar, idt idtVar, ibb ibbVar, owf owfVar2, rwc rwcVar, owf owfVar3, pqm pqmVar, boolean z, ibf ibfVar, nkw nkwVar, ihs ihsVar, hgc hgcVar) {
        long j = 0;
        new AtomicLong(0L);
        this.p = displayMetrics;
        this.l = hydVar;
        this.ag = cxbVar;
        this.d = nativeMetadataConverter;
        this.q = tgpVar;
        this.r = pjoVar;
        this.j = gcam;
        this.k = tgnVar;
        this.n = qrhVar.f;
        this.Z = hbjVar;
        this.Y = lujVar;
        this.m = uemVar2;
        this.u = ourVar;
        this.v = kgkVar;
        this.o = iaoVar;
        this.w = uemVar3;
        this.ae = goxVar;
        this.y = hbcVar;
        this.ab = isoVar;
        this.z = hyfVar;
        this.A = hxyVar;
        this.D = owfVar;
        this.B = hyhVar;
        this.C = hzqVar;
        this.E = kggVar;
        this.aa = isoVar2;
        this.F = hzjVar;
        this.G = executor;
        this.H = lobVar;
        this.I = lgoVar;
        this.J = pnqVar;
        this.K = pjpVar;
        this.R = rwcVar;
        this.s = kqpVar.b;
        this.t = uemVar;
        this.x = null;
        this.e = pbnVar;
        this.g = GcamModuleJNI.kRequestCameraSecondaryTele_get();
        this.h = GcamModuleJNI.kRequestCameraSecondaryWide_get();
        this.af = cxbVar2;
        this.L = kowVar;
        this.M = hxdVar;
        this.N = mhqVar;
        this.O = idtVar;
        this.P = ibbVar;
        this.Q = owfVar2;
        this.S = z;
        this.T = owfVar3;
        this.X = pqmVar;
        this.U = ibfVar;
        this.V = nkwVar;
        this.W = ihsVar;
        this.ac = hgcVar;
        this.ad = qrhVar;
        gzi gziVar = gzs.a;
        sbr sbrVar = new sbr();
        int i = 0;
        while (i < GcamModuleJNI.Gcam_GetNumCameras(gcam.a, gcam)) {
            Integer numValueOf = Integer.valueOf(i);
            Tuning tuningC = gcam.c(i);
            long jTuning_physical_stability_params_get = GcamModuleJNI.Tuning_physical_stability_params_get(tuningC.a, tuningC);
            PhysicalStabilityParams physicalStabilityParams = jTuning_physical_stability_params_get == j ? null : new PhysicalStabilityParams(jTuning_physical_stability_params_get, false);
            Tuning tuningC2 = gcam.c(i);
            long j2 = j;
            long jTuning_post_shutter_af_params_get = GcamModuleJNI.Tuning_post_shutter_af_params_get(tuningC2.a, tuningC2);
            sbrVar.f(numValueOf, new hzv(physicalStabilityParams, jTuning_post_shutter_af_params_get == j2 ? null : new PostShutterAfParams(jTuning_post_shutter_af_params_get, false)));
            i++;
            j = j2;
        }
        this.i = sbrVar.b();
        ourVar.d(ibbVar.dK(new glc(gcam, iceVar, 14, null), executor));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.googlex.gcam.AeShotParams J(float r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            com.google.googlex.gcam.AeShotParams r0 = new com.google.googlex.gcam.AeShotParams
            r0.<init>()
            r0.i(r4)
            r4 = 0
            if (r6 == 0) goto L12
            r0.m(r4)
            r0.l(r4)
            goto L1e
        L12:
            pas r6 = r3.s
            int r1 = r6.a
            r0.m(r1)
            int r6 = r6.b
            r0.l(r6)
        L1e:
            kox r6 = defpackage.kox.AUTO
            iao r6 = r3.o
            int r6 = r6.ordinal()
            if (r6 == 0) goto L47
            r1 = 1
            if (r6 == r1) goto L41
            r1 = 2
            if (r6 == r1) goto L3b
            r1 = 3
            if (r6 == r1) goto L35
            r1 = 4
            if (r6 == r1) goto L47
            goto L4c
        L35:
            tda r6 = defpackage.tda.d
            r0.o(r6)
            goto L4c
        L3b:
            tda r6 = defpackage.tda.c
            r0.o(r6)
            goto L4c
        L41:
            tda r6 = defpackage.tda.b
            r0.o(r6)
            goto L4c
        L47:
            tda r6 = defpackage.tda.a
            r0.o(r6)
        L4c:
            if (r5 == 0) goto L54
            tbm r5 = defpackage.tbm.c
            r0.g(r5)
            goto L6a
        L54:
            owf r5 = r3.Q
            java.lang.Object r5 = r5.dL()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L65
            tbm r5 = defpackage.tbm.d
            goto L67
        L65:
            tbm r5 = defpackage.tbm.b
        L67:
            r0.g(r5)
        L6a:
            kgg r5 = r3.E
            boolean r5 = r5.c()
            if (r5 == 0) goto L77
            tcz r5 = defpackage.tcz.e
            r0.n(r5)
        L77:
            hbj r5 = r3.Z
            gzg r6 = defpackage.gzs.aU
            boolean r5 = r5.p(r6)
            long r1 = r0.a
            com.google.googlex.gcam.GcamModuleJNI.AeShotParams_legacy_pre_slm_processing_set(r1, r0, r5)
            long r5 = r0.a
            com.google.googlex.gcam.GcamModuleJNI.AeShotParams_use_eclipse_set(r5, r0, r4)
            qrh r3 = r3.ad
            java.lang.Object r3 = r3.a
            ovx r3 = (defpackage.ovx) r3
            java.lang.Object r3 = r3.d
            java.lang.Float r3 = (java.lang.Float) r3
            r3.floatValue()
            gzi r3 = defpackage.gyv.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzw.J(float, boolean, boolean):com.google.googlex.gcam.AeShotParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0668 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.googlex.gcam.ShotParams K(float r23, int r24, defpackage.kox r25, int r26, boolean r27, boolean r28, boolean r29, defpackage.rwc r30, boolean r31, boolean r32, boolean r33, final defpackage.poe r34, defpackage.pjr r35, long r36, float r38, defpackage.iea r39, boolean r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 2055
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzw.K(float, int, kox, int, boolean, boolean, boolean, rwc, boolean, boolean, boolean, poe, pjr, long, float, iea, boolean, boolean):com.google.googlex.gcam.ShotParams");
    }

    private final void L() throws pco {
        if (this.u.b()) {
            throw new pco("Camera already closed");
        }
    }

    private static void M(AeShotParams aeShotParams, RectF rectF) {
        NormalizedRect normalizedRect = new NormalizedRect();
        normalizedRect.c(rectF.left);
        normalizedRect.e(rectF.top);
        normalizedRect.d(rectF.right);
        normalizedRect.f(rectF.bottom);
        aeShotParams.h(normalizedRect);
        aeShotParams.j(normalizedRect);
    }

    private final boolean N() {
        return this.A.e(this.o);
    }

    private final boolean O() {
        if (!this.l.f || !this.B.k()) {
            return false;
        }
        Integer num = (Integer) this.r.m(CameraCharacteristics.LENS_FACING);
        num.getClass();
        return num.intValue() == 1;
    }

    private final boolean P(mhp mhpVar, iea ieaVar) {
        return ieaVar.a().equals(idz.ZOOM) && !this.N.a().a(mhpVar);
    }

    private static boolean Q(iea ieaVar) {
        return ieaVar.c == 1 && ieaVar.a() == idz.MULTI_RESOLUTION;
    }

    private static int R(tbu tbuVar) {
        int iAm = a.am(tbuVar.e);
        if (iAm == 0) {
            return 1;
        }
        return iAm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x024c, code lost:
    
        if (r3 != 4) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0944  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v66, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [byte[], iby, short[]] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.iby S(defpackage.pjr r41, defpackage.ltd r42, defpackage.gga r43, com.google.googlex.gcam.PostviewParams r44, defpackage.kox r45, defpackage.poe r46, boolean r47, int r48, int r49, boolean r50, int r51, boolean r52, defpackage.rwc r53, defpackage.iea r54, boolean r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 2516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzw.S(pjr, ltd, gga, com.google.googlex.gcam.PostviewParams, kox, poe, boolean, int, int, boolean, int, boolean, rwc, iea, boolean, boolean):iby");
    }

    @Override // defpackage.hzs
    public final boolean A(pjr pjrVar, poe poeVar, poj pojVar, poj pojVar2, pjr pjrVar2, poe poeVar2, poj pojVar3) {
        pjr pjrVar3;
        pbn pbnVar = this.e;
        pbnVar.f("LiveTemporalBinning");
        pbnVar.f("metadata");
        tcq tcqVar = hxy.a;
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_EXPOSURE_TIME);
        l.getClass();
        boolean z = true;
        boolean z2 = poeVar.d() % 2 == 0 || ((float) l.longValue()) > 5.0E7f;
        if (pjrVar2 == null || poeVar2 == null || pojVar3 == null) {
            pjrVar3 = pjrVar;
            z = false;
        } else {
            pjrVar3 = pjrVar;
        }
        FrameMetadata frameMetadataG = g(poeVar, pjrVar3, z2);
        FrameMetadata frameMetadataG2 = z ? g(poeVar2, pjrVar2, false) : new FrameMetadata();
        if (z) {
            long jFrameMetadata_gyro_samples_get = GcamModuleJNI.FrameMetadata_gyro_samples_get(frameMetadataG.a, frameMetadataG);
            frameMetadataG2.F(jFrameMetadata_gyro_samples_get == 0 ? null : new GyroSampleVector(jFrameMetadata_gyro_samples_get, false));
        }
        pbnVar.g();
        tgp tgpVar = this.q;
        RawWriteView rawWriteViewB = tgpVar.b(pojVar);
        RawWriteView rawWriteView = pojVar2 == null ? new RawWriteView() : (RawWriteView) tgpVar.a(pojVar2).e(new RawWriteView());
        hvm hvmVar = pojVar2 != null ? new hvm(pojVar2, 9, null) : null;
        RawWriteView rawWriteViewB2 = pojVar3 != null ? tgpVar.b(pojVar3) : new RawWriteView();
        hvm hvmVar2 = pojVar3 != null ? new hvm(pojVar3, 9, null) : null;
        gzi gziVar = gzs.a;
        int iA = a(pjrVar);
        Object obj = this.k;
        long jA = Gcam.a(this.j);
        long jC = FrameMetadata.c(frameMetadataG);
        long jE = RawWriteView.e(rawWriteViewB);
        pojVar.getClass();
        hvm hvmVar3 = new hvm(pojVar, 9, null);
        long jE2 = RawWriteView.e(rawWriteView);
        long jC2 = FrameMetadata.c(frameMetadataG2);
        long jE3 = RawWriteView.e(rawWriteViewB2);
        hyd hydVar = this.l;
        gzi gziVar2 = gzs.l;
        hbj hbjVar = hydVar.j;
        boolean zNativeTemporallyBinViewfinderFrame = ((NativeHdrPlusInterface) obj).nativeTemporallyBinViewfinderFrame(jA, iA, jC, jE, hvmVar3, jE2, hvmVar, jC2, jE3, hvmVar2, false, hbjVar.a(gziVar2).isEmpty() ? -1 : ((Integer) hbjVar.a(gziVar2).get()).intValue());
        frameMetadataG.toString();
        rawWriteViewB.toString();
        rawWriteView.toString();
        frameMetadataG2.toString();
        rawWriteViewB2.toString();
        pbnVar.g();
        return zNativeTemporallyBinViewfinderFrame;
    }

    @Override // defpackage.hzs
    public final BurstSpec B(iby ibyVar, poj pojVar, poe poeVar, boolean z, boolean z2, hxu hxuVar, Optional optional, Optional optional2) throws NumberFormatException, pco {
        boolean z3;
        BurstSpec burstSpec;
        L();
        pbn pbnVar = this.e;
        pbnVar.f("convertFrame");
        iap iapVarD = d(pojVar, poeVar, ibyVar.n, this.s);
        boolean z4 = z2 || this.Z.p(gzs.aq);
        if (iapVarD == null) {
            ((sgt) f.b().M(1756)).s("buildPayloadBurstSpec failed due to incomplete viewfinder frame. Out of memory?");
            return new BurstSpec();
        }
        if (z4 && iapVarD.a.isEmpty()) {
            ((sgt) f.b().M(1757)).s("buildPayloadBurstSpec failed due to missing viewfinder image.");
            return new BurstSpec();
        }
        ShotParams shotParamsB = ibyVar.b();
        ArkInfo arkInfoB = shotParamsB.b();
        pbnVar.h("setOptions");
        hxd hxdVar = this.M;
        hxdVar.a = z;
        hxdVar.b = z4;
        hxdVar.c = ibyVar.e();
        hxdVar.d = shotParamsB.l();
        Iterator it = this.C.b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z3 = false;
                break;
            }
            if (((Long) it.next()).longValue() >= hzq.a) {
                z3 = true;
                break;
            }
        }
        hxdVar.e = z3;
        hxdVar.f = hxuVar.m;
        hxdVar.g = shotParamsB.a().a() == tbm.d;
        hxdVar.n = optional;
        ibb ibbVar = this.P;
        hxdVar.h = ibbVar.f();
        hxdVar.i = ibbVar.k() || ibbVar.l();
        hxdVar.j = ibbVar.l();
        hxdVar.l = arkInfoB.b();
        hxdVar.m = arkInfoB.c();
        hxdVar.o = optional2;
        hxdVar.k = Q(ibyVar.p);
        BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptionsA = hxdVar.a();
        hbj hbjVar = this.Z;
        gzi gziVar = gzs.a;
        GcamModuleJNI.BuildPayloadBurstSpecOptions_ultra_short_first_set(buildPayloadBurstSpecOptionsA.a, buildPayloadBurstSpecOptionsA, false);
        GcamModuleJNI.BuildPayloadBurstSpecOptions_cyclops_enabled_set(buildPayloadBurstSpecOptionsA.a, buildPayloadBurstSpecOptionsA, shotParamsB.k());
        pbnVar.h("computeSpec");
        Optional optional3 = iapVarD.a;
        if (optional3.isPresent()) {
            Gcam gcam = this.j;
            int iA = ibyVar.a();
            RawReadView rawReadView = (RawReadView) optional3.get();
            FrameMetadata frameMetadata = iapVarD.b;
            SpatialGainMap spatialGainMap = iapVarD.c;
            burstSpec = new BurstSpec(GcamModuleJNI.Gcam_BuildPayloadBurstSpec__SWIG_0(gcam.a, gcam, iA, RawReadView.c(rawReadView), rawReadView, FrameMetadata.c(frameMetadata), frameMetadata, spatialGainMap.a, spatialGainMap, buildPayloadBurstSpecOptionsA.a, buildPayloadBurstSpecOptionsA));
        } else {
            Gcam gcam2 = this.j;
            int iA2 = ibyVar.a();
            FrameMetadata frameMetadata2 = iapVarD.b;
            burstSpec = new BurstSpec(GcamModuleJNI.Gcam_BuildPayloadBurstSpec__SWIG_1(gcam2.a, gcam2, iA2, FrameMetadata.c(frameMetadata2), frameMetadata2, buildPayloadBurstSpecOptionsA.a, buildPayloadBurstSpecOptionsA));
        }
        if (arkInfoB.e() != tbv.a && arkInfoB.e() != tbv.b) {
            float f2 = 0.0f;
            float fMax = Math.max(0.0f, ((Float) hbjVar.e(hal.j).orElse(Float.valueOf(Float.MAX_VALUE))).floatValue());
            ArrayList arrayList = new ArrayList();
            boolean z5 = false;
            for (int i = 0; i < burstSpec.c().a(); i++) {
                FrameRequest frameRequestB = burstSpec.c().b(i);
                if (frameRequestB.d() != tbq.c) {
                    arrayList.add(frameRequestB);
                } else {
                    float fA = frameRequestB.a() + f2;
                    if (!z5 || fA <= fMax) {
                        arrayList.add(frameRequestB);
                        f2 = fA;
                    }
                    z5 = true;
                }
            }
            FrameRequestVector frameRequestVectorC = burstSpec.c();
            GcamModuleJNI.FrameRequestVector_clear(frameRequestVectorC.a, frameRequestVectorC);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                burstSpec.c().c((FrameRequest) arrayList.get(i2));
            }
        }
        pbnVar.g();
        return burstSpec;
    }

    @Override // defpackage.hzs
    public final void C(iby ibyVar, pjr pjrVar, int i, poe poeVar, tbq tbqVar, poj pojVar) {
        n(ibyVar, pjrVar, i, poeVar, tbqVar, pojVar, null, null, null, rvk.a, null);
    }

    @Override // defpackage.hzs
    public final Bitmap D(pjr pjrVar, poj pojVar, poe poeVar, gga ggaVar, kox koxVar, boolean z, rwc rwcVar, rwc rwcVar2, rwc rwcVar3) {
        gga ggaVar2 = (gga) rwcVar.b(new fym(ggaVar, 4)).e(ggaVar);
        Gcam gcam = this.j;
        int iC = c(poeVar, pjrVar);
        StaticMetadata staticMetadataB = gcam.b(iC);
        int iIntValue = ((Integer) ((ovx) this.n).d).intValue();
        NativeMetadataConverter nativeMetadataConverter = this.d;
        ShotParams shotParamsK = K(nativeMetadataConverter.a(iIntValue), 0, koxVar, iC, false, false, false, rvk.a, z, false, false, poeVar, pjrVar, -1L, -1.0f, iea.a, false, false);
        kfl kflVar = (kfl) ggaVar2.d;
        rwc rwcVar4 = kflVar.m;
        nativeMetadataConverter.B(pjrVar, shotParamsK.a(), poeVar, this.l.g, (pas) rwcVar4.e(this.s));
        RectF rectF = (RectF) kflVar.i.f();
        if (rectF != null) {
            M(shotParamsK.a(), rectF);
        }
        pas pasVar = (pas) rwcVar4.f();
        if (pasVar != null) {
            shotParamsK.a().m(pasVar.a);
            shotParamsK.a().l(pasVar.b);
        }
        FrameMetadata frameMetadataG = g(poeVar, pjrVar, true);
        RawWriteView rawWriteViewB = this.q.b(pojVar);
        SpatialGainMap spatialGainMapU = nativeMetadataConverter.u(poeVar);
        GenerateRgbImageOptions generateRgbImageOptions = new GenerateRgbImageOptions();
        if (rwcVar3.h()) {
            GcamModuleJNI.GenerateRgbImageOptions_expected_number_of_frames_set(generateRgbImageOptions.a, generateRgbImageOptions, ((Integer) ((rwg) rwcVar2).a).intValue());
            GcamModuleJNI.GenerateRgbImageOptions_actual_number_of_frames_set(generateRgbImageOptions.a, generateRgbImageOptions, ((Integer) rwcVar3.c()).intValue());
        }
        DebugParams debugParams = new DebugParams();
        GcamModuleJNI.GenerateRgbImageOptions_debug_params_set(generateRgbImageOptions.a, generateRgbImageOptions, DebugParams.a(debugParams), debugParams);
        gzi gziVar = gzs.a;
        GcamModuleJNI.GenerateRgbImageOptions_verbose_set(generateRgbImageOptions.a, generateRgbImageOptions, false);
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(GcamModuleJNI.Gcam_GenerateRgbImage(gcam.a, gcam, StaticMetadata.c(staticMetadataB), staticMetadataB, shotParamsK.a, shotParamsK, FrameMetadata.c(frameMetadataG), frameMetadataG, spatialGainMapU.a, spatialGainMapU, RawWriteView.e(rawWriteViewB), rawWriteViewB, ((InitParams) this.ag.a).a().e, generateRgbImageOptions.a, generateRgbImageOptions));
        if (true == interleavedImageU8.i()) {
            interleavedImageU8 = null;
        }
        if (interleavedImageU8 != null) {
            return this.af.D(interleavedImageU8);
        }
        return null;
    }

    @Override // defpackage.hzs
    public final iby E(pjr pjrVar, ltd ltdVar, gga ggaVar, PostviewParams postviewParams, kox koxVar, poe poeVar) {
        this.e.f("HdrPlus#StartMomentsShotCapture");
        try {
            return S(pjrVar, ltdVar, ggaVar, postviewParams, koxVar, poeVar, true, -1, -1, false, -1, true, rvk.a, iea.a, false, false);
        } finally {
            this.e.g();
        }
    }

    @Override // defpackage.hzs
    public final iby F(pjr pjrVar, ltd ltdVar, gga ggaVar, PostviewParams postviewParams, kox koxVar, poe poeVar, int i, boolean z) {
        this.e.f("HdrPlus#StartNlShotCapture");
        try {
            return S(pjrVar, ltdVar, ggaVar, postviewParams, koxVar, poeVar, true, -1, i, false, -1, false, rvk.a, iea.a, false, z);
        } finally {
            this.e.g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lss] */
    @Override // defpackage.hzs
    public final iby G(pjr pjrVar, gga ggaVar, PostviewParams postviewParams, kox koxVar, poe poeVar, int i, boolean z, int i2, rwc rwcVar, iea ieaVar, boolean z2) {
        this.e.f("HdrPlus#StartShotCapture");
        try {
            ltd ltdVarL = ggaVar.b.l();
            if (!z) {
                this.F.i(ltdVarL);
            }
            return S(pjrVar, ltdVarL, ggaVar, postviewParams, koxVar, poeVar, false, -1, i, z, i2, false, rwcVar, ieaVar, z2, false);
        } finally {
            this.e.g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lss] */
    @Override // defpackage.hzs
    public final iby H(pjr pjrVar, gga ggaVar, PostviewParams postviewParams, kox koxVar, poe poeVar, int i, int i2, boolean z, iea ieaVar) {
        this.e.f("HdrPlus#StartZslShotCapture");
        try {
            ltd ltdVarL = ggaVar.b.l();
            if (!z) {
                this.F.i(ltdVarL);
            }
            return S(pjrVar, ltdVarL, ggaVar, postviewParams, koxVar, poeVar, true, i, i2, z, true != z ? -1 : 1, false, rvk.a, ieaVar, false, false);
        } finally {
            this.e.g();
        }
    }

    public final ShotParams I(pjr pjrVar, poe poeVar, boolean z) {
        ShotParams shotParamsK = K(((Integer) ((ovx) this.n).d).intValue(), 0, (kox) this.L.dL(), c(poeVar, pjrVar), false, false, false, rvk.a, z, false, false, poeVar, pjrVar, -1L, -1.0f, iea.a, false, false);
        this.d.B(pjrVar, shotParamsK.a(), poeVar, this.l.g, this.s);
        return shotParamsK;
    }

    @Override // defpackage.hzs
    public final int a(pjr pjrVar) {
        return b(NativeMetadataConverter.s(this.K.a(pjrVar)));
    }

    @Override // defpackage.hzs
    public final int b(tcy tcyVar) {
        Gcam gcam = this.j;
        a.I(gcam.f());
        int iGcam_FindFirstCamera = GcamModuleJNI.Gcam_FindFirstCamera(gcam.a, gcam, tcyVar.w);
        a.I(iGcam_FindFirstCamera >= 0);
        return iGcam_FindFirstCamera;
    }

    @Override // defpackage.hzs
    public final int c(poe poeVar, pjr pjrVar) {
        return b(this.d.t(poeVar, pjrVar));
    }

    @Override // defpackage.hzs
    public final iap d(poj pojVar, poe poeVar, boolean z, pas pasVar) {
        RawWriteView rawWriteViewB = null;
        if (poeVar.b() == null || poeVar.a(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION) == null) {
            return null;
        }
        if (pojVar != null) {
            tgp tgpVar = this.q;
            if (tgpVar.d(pojVar.a())) {
                rawWriteViewB = tgpVar.b(pojVar);
            }
        }
        String strB = poeVar.b();
        strB.getClass();
        pjr pjrVarB = pjr.b(strB);
        FrameMetadata frameMetadataG = g(poeVar, pjrVarB, true);
        NativeMetadataConverter nativeMetadataConverter = this.d;
        SpatialGainMap spatialGainMapU = nativeMetadataConverter.u(poeVar);
        Integer num = (Integer) poeVar.a(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        num.getClass();
        iap iapVar = new iap(Optional.ofNullable(rawWriteViewB), frameMetadataG, spatialGainMapU, J(nativeMetadataConverter.a(num.intValue()), z, false), frameMetadataG.a() * GcamModuleJNI.FrameMetadata_actual_analog_gain_get(frameMetadataG.a, frameMetadataG) * frameMetadataG.b() * GcamModuleJNI.FrameMetadata_post_raw_digital_gain_get(frameMetadataG.a, frameMetadataG));
        nativeMetadataConverter.B(pjrVarB, iapVar.d, poeVar, this.l.g, pasVar);
        return iapVar;
    }

    @Override // defpackage.hzs
    public final AeResults e(iap iapVar) {
        RawReadView rawReadView = (RawReadView) iapVar.a.orElseThrow();
        FrameMetadata frameMetadata = iapVar.b;
        int iB = b(frameMetadata.t());
        Gcam gcam = this.j;
        StaticMetadata staticMetadataB = gcam.b(iB);
        Tuning tuningC = gcam.c(iB);
        long jC = StaticMetadata.c(staticMetadataB);
        long j = tuningC.a;
        AeShotParams aeShotParams = iapVar.d;
        long j2 = aeShotParams.a;
        long jC2 = RawReadView.c(rawReadView);
        SpatialGainMap spatialGainMap = iapVar.c;
        return new AeResults(GcamModuleJNI.Gcam_ComputeAeResults(jC, staticMetadataB, j, tuningC, j2, aeShotParams, jC2, rawReadView, FrameMetadata.c(frameMetadata), frameMetadata, spatialGainMap.a, spatialGainMap, false), true);
    }

    @Override // defpackage.hzs
    public final BurstSpec f(iby ibyVar, poj pojVar, poe poeVar, rwc rwcVar, Optional optional) throws pco {
        L();
        iap iapVarD = d(pojVar, poeVar, ibyVar.n, this.s);
        if (iapVarD == null) {
            ((sgt) f.b().M(1754)).s("buildAfBurstSpec failed due to incomplete viewfinder frame. Out of memory?");
            return new BurstSpec();
        }
        RawWriteView rawWriteView = (RawWriteView) iapVarD.a.orElse(null);
        if (rawWriteView == null) {
            ((sgt) f.b().M(1753)).s("buildAfBurstSpec failed due to missing viewfinder image.");
            return new BurstSpec();
        }
        FrameMetadata frameMetadata = iapVarD.b;
        boolean zH = rwcVar.h();
        AfMetadata afMetadataH = frameMetadata.h();
        if (zH) {
            tbk.a(GcamModuleJNI.AfMetadata_state_get(afMetadataH.a, afMetadataH));
            pnx pnxVar = (pnx) rwcVar.c();
            Integer num = (Integer) pnxVar.a(CaptureResult.CONTROL_AF_MODE);
            if (num != null) {
                afMetadataH.b(tbj.a(num.intValue()));
            }
            Integer num2 = (Integer) pnxVar.a(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null) {
                afMetadataH.c(tbk.a(num2.intValue()));
            }
            Integer num3 = (Integer) pnxVar.a(CaptureResult.CONTROL_AF_TRIGGER);
            if (num3 != null) {
                afMetadataH.d(tbl.a(num3.intValue()));
            }
        }
        Gcam gcam = this.j;
        int iA = ibyVar.a();
        SpatialGainMap spatialGainMap = iapVarD.c;
        return new BurstSpec(GcamModuleJNI.Gcam_BuildAfBurstSpec(gcam.a, gcam, iA, RawReadView.c(rawWriteView), rawWriteView, FrameMetadata.c(frameMetadata), frameMetadata, spatialGainMap.a, spatialGainMap, ((Float) optional.orElse(Float.valueOf(-1.0f))).floatValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    @Override // defpackage.hzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.googlex.gcam.FrameMetadata g(defpackage.poe r18, defpackage.pjr r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzw.g(poe, pjr, boolean):com.google.googlex.gcam.FrameMetadata");
    }

    @Override // defpackage.hzs
    public final PhysicalStabilityParams h(int i) {
        hzv hzvVar = (hzv) this.i.get(Integer.valueOf(i));
        hzvVar.getClass();
        return hzvVar.a;
    }

    @Override // defpackage.hzs
    public final PostShutterAfParams i(int i) {
        hzv hzvVar = (hzv) this.i.get(Integer.valueOf(i));
        hzvVar.getClass();
        return hzvVar.b;
    }

    @Override // defpackage.hzs
    public final tcy j(poe poeVar, pjr pjrVar) {
        return this.d.t(poeVar, pjrVar);
    }

    @Override // defpackage.hzs
    public final ViewfinderResults k(int i) {
        Gcam gcam = this.j;
        return new ViewfinderResults(GcamModuleJNI.Gcam_GetLatestViewfinderResults(gcam.a, gcam, i));
    }

    @Override // defpackage.hzs
    public final void l(iby ibyVar) {
        int iA = ibyVar.a();
        String strBv = a.bv(iA, "AbortShot-");
        pbn pbnVar = this.e;
        pbnVar.f(strBv);
        Gcam gcam = this.j;
        GcamModuleJNI.Gcam_AbortShot(gcam.a, gcam, iA);
        pbnVar.g();
    }

    @Override // defpackage.hzs
    public final void m(iby ibyVar) {
        ibyVar.c(new lba());
        FrameMetadata frameMetadata = new FrameMetadata();
        frameMetadata.z(tbr.c);
        frameMetadata.f().e(tbf.b);
        frameMetadata.J(ibyVar.u);
        SpatialGainMap spatialGainMap = new SpatialGainMap();
        RawWriteView rawWriteView = new RawWriteView();
        RawWriteView rawWriteView2 = new RawWriteView();
        if (((NativeHdrPlusInterface) this.k).nativeAddPayloadFrame(Gcam.a(this.j), ibyVar.a(), FrameMetadata.c(frameMetadata), spatialGainMap.a, RawWriteView.e(rawWriteView), new gdq((Object) rawWriteView, (Object) frameMetadata, (Object) spatialGainMap, 5, (char[]) null), RawWriteView.e(rawWriteView2), new hvm(rawWriteView2, 11, null), 0L, null, null, null)) {
            return;
        }
        ((sgt) f.b().M(1745)).t("addPayloadFrame with empty payload for shot %d failed.", ibyVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v36, types: [sgt, shi] */
    @Override // defpackage.hzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(defpackage.iby r40, defpackage.pjr r41, int r42, defpackage.poe r43, defpackage.tbq r44, defpackage.poj r45, defpackage.poj r46, defpackage.poj r47, defpackage.poj r48, defpackage.rwc r49, defpackage.poe r50) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzw.n(iby, pjr, int, poe, tbq, poj, poj, poj, poj, rwc, poe):void");
    }

    @Override // defpackage.hzs
    public final void o(pjr pjrVar, poj pojVar, poe poeVar) {
        boolean zI = this.P.i();
        iap iapVarD = d(pojVar, poeVar, zI, this.s);
        if (iapVarD == null) {
            ((sgt) f.c().M(1750)).s("addViewfinderFrame() failed: convertToHdrPlusViewfinderFrame returned null.");
            return;
        }
        RawWriteView rawWriteView = (RawWriteView) iapVarD.a.orElse(null);
        if (rawWriteView == null) {
            ((sgt) f.c().M(1749)).s("addViewfinderFrame() failed: missing image and/or spatial gain map.");
            return;
        }
        int iC = c(poeVar, pjrVar);
        ShotParams shotParamsI = I(pjrVar, poeVar, zI);
        Object obj = this.k;
        NativeHdrPlusInterface nativeHdrPlusInterface = (NativeHdrPlusInterface) obj;
        nativeHdrPlusInterface.nativeAddViewfinderFrame(Gcam.a(this.j), iC, FrameMetadata.c(iapVarD.b), iapVarD.c.a, shotParamsI.a, RawWriteView.e(rawWriteView), new hvm(pojVar, 9, null));
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [sgt, shi] */
    @Override // defpackage.hzs
    public final void p(pjr pjrVar, poe poeVar) {
        try {
            int iC = c(poeVar, pjrVar);
            ShotParams shotParamsI = I(pjrVar, poeVar, this.P.i());
            FrameMetadata frameMetadataG = g(poeVar, pjrVar, true);
            Object obj = this.k;
            ((NativeHdrPlusInterface) obj).nativeAddViewfinderMetadataOnly(Gcam.a(this.j), iC, FrameMetadata.c(frameMetadataG), shotParamsI.a);
        } catch (RuntimeException e) {
            ((sgt) ((sgt) f.c().i(e)).M((char) 1751)).v("addViewfinderMetadataOnly() failed %s", e.getMessage());
        }
    }

    @Override // defpackage.hzs
    public final void q(iby ibyVar) {
        r(ibyVar, new BurstSpec());
    }

    @Override // defpackage.hzs
    public final void r(iby ibyVar, BurstSpec burstSpec) {
        String str = "BeginPayloadFrames-" + ibyVar.a();
        pbn pbnVar = this.e;
        pbnVar.f(str);
        Gcam gcam = this.j;
        GcamModuleJNI.Gcam_BeginPayloadFrames(gcam.a, gcam, ibyVar.a(), BurstSpec.b(burstSpec), burstSpec);
        pbnVar.g();
    }

    @Override // defpackage.hzs
    public final void s(iby ibyVar) {
        Gcam gcam = this.j;
        GcamModuleJNI.Gcam_EndZslPayloadFrames(gcam.a, gcam, ibyVar.a());
    }

    @Override // defpackage.hzs
    public final void t(int i) {
        this.j.d(i);
    }

    @Override // defpackage.hzs
    public final void u(pjr pjrVar) {
        this.j.d(a(pjrVar));
    }

    @Override // defpackage.hzs
    public final void v(int i) {
        Gcam gcam = this.j;
        GcamModuleJNI.Gcam_FlushViewfinder(gcam.a, gcam, i);
    }

    @Override // defpackage.hzs
    public final boolean w(poe poeVar, pjr pjrVar) {
        boolean zGcam_ClaimFrameForBinning;
        pbm pbmVar = new pbm(this.e, "HdrPlusSession#claimFrameForTemporalBinning");
        try {
            FrameMetadataKey frameMetadataKeyQ = this.d.q(poeVar, pjrVar);
            if (frameMetadataKeyQ == null) {
                zGcam_ClaimFrameForBinning = false;
            } else {
                Gcam gcam = this.j;
                zGcam_ClaimFrameForBinning = GcamModuleJNI.Gcam_ClaimFrameForBinning(gcam.a, gcam, frameMetadataKeyQ.a, frameMetadataKeyQ);
            }
            pbmVar.close();
            return zGcam_ClaimFrameForBinning;
        } finally {
        }
    }

    @Override // defpackage.hzs
    public final boolean x(iby ibyVar, BurstSpec burstSpec) {
        ClientShotMetadata clientShotMetadata;
        ClientShotMetadata clientShotMetadata2;
        int iIntValue;
        ClientShotMetadata clientShotMetadata3;
        long jA;
        ClientShotMetadata clientShotMetadata4;
        int iA = ibyVar.a();
        String strBv = a.bv(iA, "EndPayloadFrames-");
        pbn pbnVar = this.e;
        pbnVar.f(strBv);
        if (((kfl) ibyVar.x.d).g) {
            pbnVar.f("location");
            try {
                rwc rwcVarE = ((jid) this.m.a()).e();
                if (rwcVarE.h()) {
                    Location location = (Location) rwcVarE.c();
                    LocationData locationData = new LocationData();
                    locationData.b(location.getAltitude());
                    locationData.c(location.getAccuracy());
                    locationData.d(location.getLatitude());
                    locationData.e(location.getLongitude());
                    locationData.g(location.getTime() / 1000);
                    String provider = location.getProvider();
                    if (provider != null) {
                        locationData.f(provider);
                    }
                    clientShotMetadata4 = new ClientShotMetadata();
                    clientShotMetadata4.c(locationData);
                } else {
                    clientShotMetadata4 = null;
                }
                this.e.g();
                clientShotMetadata = clientShotMetadata4;
            } finally {
                this.e.g();
            }
        } else {
            clientShotMetadata = null;
        }
        Gcam gcam = this.j;
        ihs ihsVar = this.W;
        Optional optional = ihsVar.d;
        if (optional.isEmpty() || !((File) optional.get()).exists()) {
            clientShotMetadata2 = clientShotMetadata;
        } else {
            int iIntValue2 = ((Integer) ihsVar.e.dL()).intValue();
            StatFs statFs = new StatFs(((File) optional.get()).getAbsolutePath());
            pbm pbmVar = new pbm(ihsVar.f, "payload_cache_statfs");
            try {
                long blockSizeLong = (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576;
                pbmVar.close();
                mhp mhpVarA = ihsVar.b.a();
                try {
                    iIntValue = ((Integer) ihsVar.c.get()).intValue();
                } catch (SecurityException e) {
                    ((sgt) ihs.a.c().M(2016)).v("Unable to get disk health (%s)", e.getMessage());
                    iIntValue = -1;
                }
                ihw ihwVar = ihsVar.i;
                ihx ihxVar = ihwVar.b;
                long jB = ihwVar.b(ihxVar.c);
                long jB2 = ihwVar.b(ihxVar.d);
                if (ihwVar.a() == -1 || jB == -1 || jB2 == -1) {
                    clientShotMetadata3 = clientShotMetadata;
                    jA = -1;
                } else {
                    clientShotMetadata3 = clientShotMetadata;
                    jA = (long) ((((jB2 * 0.1d) * jB) * ihwVar.a()) / 1048576.0d);
                }
                long jB3 = ihwVar.b(ihxVar.e);
                int i = (jB3 <= 0 || jB3 > 10) ? -1 : (int) (100 - (jB3 * 10));
                mdy mdyVar = ihsVar.j;
                tpc tpcVarM = ssq.a.m();
                tpc tpcVarM2 = ssp.a.m();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar = tpcVarM2.b;
                ssp sspVar = (ssp) tphVar;
                clientShotMetadata2 = clientShotMetadata3;
                sspVar.b |= 1;
                sspVar.c = iIntValue2;
                if (!tphVar.C()) {
                    tpcVarM2.o();
                }
                tph tphVar2 = tpcVarM2.b;
                ssp sspVar2 = (ssp) tphVar2;
                sspVar2.b |= 2;
                sspVar2.d = blockSizeLong;
                int i2 = mhpVarA.j;
                if (!tphVar2.C()) {
                    tpcVarM2.o();
                }
                tph tphVar3 = tpcVarM2.b;
                ssp sspVar3 = (ssp) tphVar3;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                sspVar3.e = i3;
                sspVar3.b |= 4;
                if (!tphVar3.C()) {
                    tpcVarM2.o();
                }
                tph tphVar4 = tpcVarM2.b;
                ssp sspVar4 = (ssp) tphVar4;
                sspVar4.b |= 8;
                sspVar4.f = iIntValue;
                boolean z = ihsVar.g;
                if (!tphVar4.C()) {
                    tpcVarM2.o();
                }
                tph tphVar5 = tpcVarM2.b;
                ssp sspVar5 = (ssp) tphVar5;
                sspVar5.b |= 16;
                sspVar5.g = z;
                ssc sscVar = ihsVar.h.v;
                if (!tphVar5.C()) {
                    tpcVarM2.o();
                }
                tph tphVar6 = tpcVarM2.b;
                ssp sspVar6 = (ssp) tphVar6;
                sspVar6.h = sscVar.T;
                sspVar6.b |= 32;
                if (!tphVar6.C()) {
                    tpcVarM2.o();
                }
                tph tphVar7 = tpcVarM2.b;
                ssp sspVar7 = (ssp) tphVar7;
                sspVar7.b |= 64;
                sspVar7.i = jA;
                if (!tphVar7.C()) {
                    tpcVarM2.o();
                }
                ssp sspVar8 = (ssp) tpcVarM2.b;
                sspVar8.b |= 128;
                sspVar8.j = i;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                ssq ssqVar = (ssq) tpcVarM.b;
                ssp sspVar9 = (ssp) tpcVarM2.l();
                sspVar9.getClass();
                ssqVar.c = sspVar9;
                ssqVar.b |= 1;
                ssq ssqVar2 = (ssq) tpcVarM.l();
                tpc tpcVarM3 = sod.a.m();
                soc socVar = soc.PAYLOAD_CACHE_EVENT;
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                tph tphVar8 = tpcVarM3.b;
                sod sodVar = (sod) tphVar8;
                sodVar.f = socVar.aJ;
                sodVar.b |= 1;
                if (!tphVar8.C()) {
                    tpcVarM3.o();
                }
                sod sodVar2 = (sod) tpcVarM3.b;
                ssqVar2.getClass();
                sodVar2.aH = ssqVar2;
                sodVar2.e |= 8;
                mdyVar.I(tpcVarM3);
            } finally {
            }
        }
        boolean zGcam_EndPayloadFrames = GcamModuleJNI.Gcam_EndPayloadFrames(gcam.a, gcam, iA, BurstSpec.b(burstSpec), burstSpec, ClientShotMetadata.a(clientShotMetadata2), clientShotMetadata2, false);
        if (!zGcam_EndPayloadFrames) {
            ((sgt) f.b().M(1758)).s("EndPayloadFrames() failed.");
        }
        if (N()) {
            this.G.execute(new Runnable() { // from class: hzt
                /* JADX WARN: Type inference failed for: r5v2, types: [sgt, shi] */
                /* JADX WARN: Type inference failed for: r6v11, types: [sgt, shi] */
                /* JADX WARN: Type inference failed for: r6v13, types: [sgt, shi] */
                /* JADX WARN: Type inference failed for: r6v9, types: [sgt, shi] */
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    sbp sbpVarJ;
                    hzw hzwVar = this.a;
                    hzwVar.e.f("writeDebugMetadata");
                    synchronized (hyk.b) {
                        List list = hyk.a;
                        sbpVarJ = sbp.j(list);
                        list.clear();
                    }
                    int size = sbpVarJ.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        hyj hyjVar = (hyj) sbpVarJ.get(i4);
                        String str = hyjVar.a;
                        tcg tcgVar = hyjVar.b;
                        int i5 = hyjVar.c;
                        pnx pnxVar = hyjVar.d;
                        String str2 = "  Result frame " + i5;
                        try {
                            FileWriter fileWriter = new FileWriter(new File(str, tcgVar == tcg.b ? "payload_burst_actual_hal3.txt" : tcgVar == tcg.c ? "viewfinder_actual_hal3.txt" : tcgVar == tcg.a ? "unknown_actual_hal3.txt" : ""), true);
                            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                            try {
                                try {
                                    List<CaptureResult.Key> listF = pnxVar.f();
                                    bufferedWriter.write(String.valueOf(ojl.bI(str2, new Object[0])).concat("\n"));
                                    for (CaptureResult.Key key : listF) {
                                        bufferedWriter.write(ojl.bI("    %s\n", key.getName()));
                                        bufferedWriter.write(ojl.bI("        %s\n", fec.a(pnxVar.a(key))));
                                    }
                                    try {
                                        bufferedWriter.close();
                                    } catch (IOException e2) {
                                        ((sgt) ((sgt) fec.a.b().i(e2)).M(';')).s("dumpMetadata - Failed to close writer.");
                                    }
                                } catch (IOException e3) {
                                    ((sgt) ((sgt) fec.a.b().i(e3)).M(60)).s("dumpMetadata - Failed to dump metadata");
                                    try {
                                        bufferedWriter.close();
                                    } catch (IOException e4) {
                                        ((sgt) ((sgt) fec.a.b().i(e4)).M('=')).s("dumpMetadata - Failed to close writer.");
                                    }
                                }
                                fileWriter.close();
                            } catch (Throwable th) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e5) {
                                    ((sgt) ((sgt) fec.a.b().i(e5)).M('>')).s("dumpMetadata - Failed to close writer.");
                                }
                                throw th;
                            }
                        } catch (IOException e6) {
                            ((sgt) ((sgt) fec.a.b().i(e6)).M('?')).s("Could not write capture data to file.");
                        }
                    }
                    hzwVar.e.g();
                }
            });
        }
        return zGcam_EndPayloadFrames;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, lss] */
    @Override // defpackage.hzs
    public final boolean y(iby ibyVar) {
        int iA = ibyVar.a();
        String strBv = a.bv(iA, "EndShotCapture-");
        pbn pbnVar = this.e;
        pbnVar.f(strBv);
        Gcam gcam = this.j;
        boolean zGcam_EndShotCapture = GcamModuleJNI.Gcam_EndShotCapture(gcam.a, gcam, iA);
        if (zGcam_EndShotCapture) {
            ibyVar.x.b.R();
        }
        pbnVar.g();
        return zGcam_EndShotCapture;
    }

    @Override // defpackage.hzs
    public final boolean z(poe poeVar, pjr pjrVar) {
        boolean zGcam_LockFrameFromFutureBinning;
        pbm pbmVar = new pbm(this.e, "HdrPlusSession#lockFrameFromFutureBinning");
        try {
            FrameMetadataKey frameMetadataKeyQ = this.d.q(poeVar, pjrVar);
            if (frameMetadataKeyQ == null) {
                zGcam_LockFrameFromFutureBinning = false;
            } else {
                Gcam gcam = this.j;
                zGcam_LockFrameFromFutureBinning = GcamModuleJNI.Gcam_LockFrameFromFutureBinning(gcam.a, gcam, frameMetadataKeyQ.a, frameMetadataKeyQ);
            }
            pbmVar.close();
            return zGcam_LockFrameFromFutureBinning;
        } finally {
        }
    }
}
