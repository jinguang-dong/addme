package defpackage;

import android.graphics.Bitmap;
import com.google.ar.core.ImageMetadata;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.imageproc.Resample;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ivz implements LasagnaCallbacks, iwo {
    public static final sgv a = sgv.g("ivz");
    public final ivx b;
    public final ivt c;
    public final int d;
    public final pbn e;
    public final szh f;
    public final lss g;
    public iby h;
    public szh i;
    public Runnable j;
    public final ivb l;
    public iwb m;
    private final tdi o;
    private final Executor p;
    private final szh q;
    private final kml r;
    public boolean k = false;
    public final ejt n = new ejt((int[]) null);

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, lss] */
    public ivz(tdi tdiVar, ivx ivxVar, Executor executor, pbn pbnVar, gga ggaVar, ivt ivtVar, ivb ivbVar, szh szhVar, szh szhVar2) {
        this.o = tdiVar;
        this.b = ivxVar;
        this.p = executor;
        this.e = pbnVar;
        this.r = ggaVar.a;
        this.c = ivtVar;
        this.l = ivbVar;
        this.f = szhVar;
        this.q = szhVar2;
        this.d = ggaVar.b.l().a;
        this.g = ggaVar.b;
    }

    private final void d(String str, Throwable th) {
        ((sgt) ((sgt) a.c().i(th)).M(2437)).y("[shot-%s] %s", this.d, str);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final synchronized void a(int i, int i2, String str, rwc rwcVar) {
        Throwable th;
        ivz ivzVar;
        ivz ivzVar2;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.k = true;
            Runnable runnable = this.j;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th3) {
                    th = th3;
                    ivzVar = this;
                    throw th;
                }
            }
            this.q.e(true);
            if (i2 != 0) {
                ((sgt) a.c().M(2438)).y("[shot-%s] Final error status [%s]. ", i, str);
                if (i2 != 10) {
                    ivzVar2 = this;
                    this.p.execute(new ng(ivzVar2, i, str, 11, (byte[]) null));
                }
                ((mdo) ivzVar2.g.o()).z = ivzVar2.n.q();
            }
            szh szhVar = this.i;
            if (szhVar != null) {
                szhVar.e(Boolean.TRUE);
            }
            Object obj = this.n.a;
            if (!((tpc) obj).b.C()) {
                ((tpc) obj).o();
            }
            ssb ssbVar = (ssb) ((tpc) obj).b;
            ssb ssbVar2 = ssb.a;
            ssbVar.b |= 2;
            ssbVar.d = true;
            if (rwcVar.h()) {
                Object objC = rwcVar.c();
                tpm tpmVar = ((thz) objC).i;
                if (!tpmVar.isEmpty()) {
                    float fAbs = Math.abs(((Float) ujp.aQ(tpmVar)).floatValue());
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar3 = (ssb) ((tpc) obj).b;
                    ssbVar3.b |= 32;
                    ssbVar3.g = fAbs;
                }
                if ((((thz) objC).b & 128) != 0) {
                    float f = ((thz) objC).f;
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar4 = (ssb) ((tpc) obj).b;
                    ssbVar4.b |= 64;
                    ssbVar4.h = f;
                }
                if ((((thz) objC).b & 256) != 0) {
                    float f2 = ((thz) objC).g;
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar5 = (ssb) ((tpc) obj).b;
                    ssbVar5.b |= 128;
                    ssbVar5.i = f2;
                }
                if ((((thz) objC).b & 16) != 0) {
                    int i3 = ((thz) objC).d;
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar6 = (ssb) ((tpc) obj).b;
                    ssbVar6.b |= 512;
                    ssbVar6.k = i3;
                }
                if ((((thz) objC).b & 32) != 0) {
                    int i4 = ((thz) objC).e;
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar7 = (ssb) ((tpc) obj).b;
                    ssbVar7.b |= 1024;
                    ssbVar7.l = i4;
                }
                if ((((thz) objC).b & 512) != 0) {
                    int i5 = ((thz) objC).h;
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar8 = (ssb) ((tpc) obj).b;
                    ssbVar8.b |= 2048;
                    ssbVar8.m = i5;
                }
                if ((((thz) objC).b & 2048) != 0) {
                    boolean z = ((thz) objC).j;
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar9 = (ssb) ((tpc) obj).b;
                    ssbVar9.b |= 4096;
                    ssbVar9.n = z;
                }
                if ((((thz) objC).b & 8) != 0) {
                    int i6 = ((thz) objC).c;
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar10 = (ssb) ((tpc) obj).b;
                    ssbVar10.b |= 8192;
                    ssbVar10.o = i6;
                }
                if ((((thz) objC).b & ImageMetadata.LENS_APERTURE) != 0) {
                    thx thxVar = ((thz) objC).k;
                    if (thxVar == null) {
                        thxVar = thx.a;
                    }
                    spz spzVarR = ejt.r(thxVar);
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar11 = (ssb) ((tpc) obj).b;
                    spzVarR.getClass();
                    ssbVar11.q = spzVarR;
                    ssbVar11.b |= 32768;
                }
                if ((((thz) objC).b & 4194304) != 0) {
                    thx thxVar2 = ((thz) objC).n;
                    if (thxVar2 == null) {
                        thxVar2 = thx.a;
                    }
                    spz spzVarR2 = ejt.r(thxVar2);
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar12 = (ssb) ((tpc) obj).b;
                    spzVarR2.getClass();
                    ssbVar12.r = spzVarR2;
                    ssbVar12.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                }
                if ((((thz) objC).b & 8388608) != 0) {
                    thx thxVar3 = ((thz) objC).o;
                    if (thxVar3 == null) {
                        thxVar3 = thx.a;
                    }
                    spz spzVarR3 = ejt.r(thxVar3);
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar13 = (ssb) ((tpc) obj).b;
                    spzVarR3.getClass();
                    ssbVar13.s = spzVarR3;
                    ssbVar13.b |= 131072;
                }
                if ((((thz) objC).b & 16777216) != 0) {
                    thx thxVar4 = ((thz) objC).p;
                    if (thxVar4 == null) {
                        thxVar4 = thx.a;
                    }
                    spz spzVarR4 = ejt.r(thxVar4);
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar14 = (ssb) ((tpc) obj).b;
                    spzVarR4.getClass();
                    ssbVar14.t = spzVarR4;
                    ssbVar14.b |= 262144;
                }
                if ((((thz) objC).b & 33554432) != 0) {
                    thx thxVar5 = ((thz) objC).q;
                    if (thxVar5 == null) {
                        thxVar5 = thx.a;
                    }
                    spz spzVarR5 = ejt.r(thxVar5);
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar15 = (ssb) ((tpc) obj).b;
                    spzVarR5.getClass();
                    ssbVar15.u = spzVarR5;
                    ssbVar15.b |= ImageMetadata.LENS_APERTURE;
                }
                if ((((thz) objC).b & ImageMetadata.SHADING_MODE) != 0) {
                    float f3 = ((thz) objC).l;
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar16 = (ssb) ((tpc) obj).b;
                    ssbVar16.b = 1048576 | ssbVar16.b;
                    ssbVar16.v = f3;
                }
                if ((((thz) objC).b & 2097152) != 0) {
                    float f4 = ((thz) objC).m;
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar17 = (ssb) ((tpc) obj).b;
                    ssbVar17.b = 2097152 | ssbVar17.b;
                    ssbVar17.w = f4;
                }
                if ((((thz) objC).b & 67108864) != 0) {
                    thw thwVar = ((thz) objC).r;
                    if (thwVar == null) {
                        thwVar = thw.a;
                    }
                    tpc tpcVarM = snu.a.m();
                    double d = thwVar.b;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    snu snuVar = (snu) tphVar;
                    snuVar.b |= 1;
                    snuVar.c = d;
                    int i7 = thwVar.c;
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    snu snuVar2 = (snu) tpcVarM.b;
                    snuVar2.b |= 2;
                    snuVar2.d = i7;
                    snu snuVar3 = (snu) tpcVarM.l();
                    if (!((tpc) obj).b.C()) {
                        ((tpc) obj).o();
                    }
                    ssb ssbVar18 = (ssb) ((tpc) obj).b;
                    snuVar3.getClass();
                    ssbVar18.x = snuVar3;
                    ssbVar18.b |= 4194304;
                }
            }
            this.b.b(i, true);
            ivzVar2 = this;
            ((mdo) ivzVar2.g.o()).z = ivzVar2.n.q();
        } catch (Throwable th4) {
            th = th4;
            ivzVar = this;
            th = th;
            throw th;
        }
    }

    @Override // defpackage.iwo
    public final synchronized void b(tht thtVar) {
        if (this.k) {
            thtVar.b.d();
            thtVar.d.run();
            return;
        }
        FrameMetadata frameMetadata = thtVar.b;
        frameMetadata.d();
        if (this.b.d(this.d, "onPslFrame", new imf(this, thtVar, 10), new hcv(frameMetadata.d(), thtVar, 3)) != 1) {
            ((sgt) a.c().M(2443)).s("Couldn't post PSL frame");
        }
    }

    public final void c() {
        this.q.e(false);
        ivb ivbVar = this.l;
        if (ivbVar != null) {
            ivbVar.c(this.d);
        }
        this.r.f();
    }

    @Override // defpackage.iwo
    public final synchronized void e(boolean z) {
        this.q.e(true);
        if (!this.k) {
            String str = true != z ? "endShot" : "abortShot";
            if (this.b.d(this.d, "onPslDone: ".concat(str), new fie(this, str, z, 5), new ivi(str, 7)) != 1) {
                ((sgt) a.c().M(2442)).v("Couldn't post %s", str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, lss] */
    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void f(int i, long j, int i2, String str, ShotMetadata shotMetadata) {
        rwc rwcVarJ;
        iby ibyVar;
        InterleavedImageU8 interleavedImageU8;
        Locale locale = Locale.ROOT;
        Long lValueOf = Long.valueOf(j);
        if (i2 == 0) {
            throw null;
        }
        String.format(locale, "Got image!!! allocationId = %d, outputType=%d (%s), description=%s)", lValueOf, Integer.valueOf(i2 - 1), thu.a(i2), str);
        pbn pbnVar = this.e;
        pbnVar.f("MotionBlur#onImage");
        rwc rwcVarA = this.o.a(j);
        if (rwcVarA.h()) {
            pbnVar.f("settingResult");
            InterleavedImageU8 interleavedImageU82 = (InterleavedImageU8) rwcVarA.c();
            interleavedImageU82.d();
            interleavedImageU82.b();
            interleavedImageU82.a();
            rwcVarJ = rwc.j(new iws(interleavedImageU82, i2, shotMetadata));
            pbnVar.g();
        } else {
            rwcVarJ = rvk.a;
        }
        iwb iwbVar = this.m;
        if (iwbVar != null && (ibyVar = this.h) != null) {
            try {
                ibyVar.a();
                ivq ivqVar = (ivq) iwbVar.f.get(ibyVar);
                if (ivqVar == null) {
                    if (rwcVarJ.h()) {
                        ((iws) rwcVarJ.c()).close();
                    }
                    throw new IllegalStateException("Shot hasn't been started yet");
                }
                if (rwcVarJ.h()) {
                    long jA = ibyVar.a();
                    Object objC = rwcVarJ.c();
                    int i3 = ((iws) objC).d;
                    ihc ihcVar = iwbVar.h;
                    ShotMetadata shotMetadata2 = ((iws) objC).b;
                    iby ibyVar2 = ivqVar.b;
                    hxu hxuVar = ivqVar.s;
                    iea ieaVar = iea.a;
                    ?? r14 = ibyVar2.x.b;
                    ihcVar.a(shotMetadata2, r14, hxuVar, ieaVar);
                    if (i3 == 5) {
                        InterleavedImageU8 interleavedImageU83 = ((iws) objC).a;
                        try {
                            pbn pbnVar2 = iwbVar.d;
                            pbnVar2.f("updateThumbnail");
                            pbnVar2.f("convert");
                            Bitmap bitmapD = iwbVar.j.D(interleavedImageU83);
                            pbnVar2.g();
                            iwbVar.j(ivqVar, bitmapD, ivqVar.d == iwt.LANDSCAPE);
                            iwbVar.d.g();
                            ((iws) objC).close();
                        } catch (Throwable th) {
                            iwbVar.d.g();
                            throw th;
                        }
                    } else {
                        if (ivqVar.t.b.ah()) {
                            interleavedImageU8 = ((iws) objC).a;
                            tcd tcdVarO = ske.o(ivqVar.e);
                            boolean z = tcdVarO == tcd.b || tcdVarO == tcd.d;
                            boolean z2 = tcdVarO == tcd.i || tcdVarO == tcd.g;
                            if (z || z2) {
                                InterleavedImageU8 interleavedImageU84 = new InterleavedImageU8(interleavedImageU8.d(), interleavedImageU8.b(), interleavedImageU8.a());
                                Resample.b(interleavedImageU8.f(), z ? tcd.c : tcd.e, interleavedImageU84.g());
                                interleavedImageU8 = interleavedImageU84;
                            }
                        } else {
                            interleavedImageU8 = ((iws) objC).a;
                        }
                        icp icpVar = iwbVar.c;
                        int i4 = i3 - 1;
                        ske.W(icpVar.a(jA, obu.i(interleavedImageU8), ((iws) objC).c, i4 != 1 ? 100 : 0, icpVar.e.p(gzo.bg), i4 != 1 ? ico.PRIMARY : ico.ORIGINAL, r14, ivqVar.f, shotMetadata2, rvk.a), new iiz((iws) objC, ivqVar, 3), sxo.a);
                    }
                } else {
                    ((sgt) iwb.a.c().M(2471)).v("Motion Blur result %s was received, but ignored because it was invalid.", thu.a(i2));
                    ivqVar.e();
                }
            } catch (IllegalStateException e) {
                ((sgt) ((sgt) a.c().i(e)).M(2439)).t("Error saving the image for shot %s.", i);
                if (rwcVarJ.h()) {
                    ((iws) rwcVarJ.c()).close();
                }
            }
        }
        this.e.g();
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onFinalStatusNative(int i, int i2, String str, byte[] bArr) {
        thu.$default$onFinalStatusNative(this, i, i2, str, bArr);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onImageNative(int i, long j, int i2, String str, long j2) {
        f(i, j, a.am(i2), str, new ShotMetadata(j2));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kmm] */
    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onProgress(int i, float f) {
        iby ibyVar = this.h;
        if (ibyVar != null) {
            ibyVar.x.c.a(iwp.t, f);
        } else {
            ((sgt) a.c().M(2441)).s("Shot has been aborted.");
        }
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onPslRequest(int i, boolean z, float f, float f2) {
        ivb ivbVar;
        String.format("onPslRequest / isNeeded = %s, duration = %s, frameRate = %s", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2));
        if (!z || (ivbVar = this.l) == null || this.q.isDone()) {
            kml kmlVar = this.r;
            kmlVar.d().e(0);
            kmlVar.d().h();
            this.q.e(true);
            d("No PSL frames to collect.", null);
            c();
            return;
        }
        try {
            kml kmlVar2 = this.r;
            long millis = (long) (TimeUnit.SECONDS.toMillis(1L) * f);
            kmlVar2.d().e(2);
            kmlVar2.d().g(millis);
            kmlVar2.d().h();
            kmlVar2.d().a(null);
            this.g.aa(millis);
            ivbVar.e(i, f, f2, ((Long) this.f.t(5L, TimeUnit.SECONDS)).longValue());
            Object obj = this.n.a;
            if (!((tpc) obj).b.C()) {
                ((tpc) obj).o();
            }
            ssb ssbVar = (ssb) ((tpc) obj).b;
            ssb ssbVar2 = ssb.a;
            ssbVar.b |= 16;
            ssbVar.f = f;
            if (!((tpc) obj).b.C()) {
                ((tpc) obj).o();
            }
            ssb ssbVar3 = (ssb) ((tpc) obj).b;
            ssbVar3.b |= 256;
            ssbVar3.j = f2;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            d("Error collecting PSL frames.", e);
            c();
        }
    }
}
