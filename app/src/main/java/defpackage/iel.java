package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.android.apps.camera.hdrplus.fusion.deblur.jni.NativeDeblurFusion;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.ShotMetadata;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.UnaryOperator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iel implements idy {
    public static final sgv a = sgv.g("iel");
    public final lgp b;
    public final pbn c;
    public final tdi d;
    public final Object e = new Object();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final luj h;
    public final hbj i;
    private final Executor j;
    private final UnaryOperator k;
    private final ovx l;
    private final uem m;
    private final Context n;

    public iel(lgp lgpVar, Executor executor, ovx ovxVar, pbn pbnVar, tdi tdiVar, UnaryOperator unaryOperator, uem uemVar, hbj hbjVar, luj lujVar, Context context) {
        this.b = lgpVar;
        this.j = executor;
        this.l = ovxVar;
        this.c = pbnVar;
        this.d = tdiVar;
        this.k = unaryOperator;
        this.m = uemVar;
        this.i = hbjVar;
        this.h = lujVar;
        this.n = context;
    }

    public static final void i() {
        String str = gzc.a;
    }

    @Override // defpackage.idy
    public final void a() {
        boolean z;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        AssetFileDescriptor assetFileDescriptorOpenFd2;
        boolean zA;
        boolean zA2;
        synchronized (this.e) {
            hbj hbjVar = this.i;
            String str = gzc.a;
            boolean zP = hbjVar.p(gzc.B);
            shl shlVar = shx.a;
            if (!this.f.get() || this.g.get()) {
                lgp lgpVar = this.b;
                if (lgpVar.a() == 0) {
                    pbn pbnVar = this.c;
                    pbnVar.f("PortraitSegmenter#init");
                    lgpVar.b();
                    pbnVar.g();
                }
                this.c.f("DeblurFusionController#loadModelIntoCache");
                String str2 = zP ? "gyrfalcon-p23.tflite.uncompressed" : "deblur_04_20_2023_v0.tflite.uncompressed";
                try {
                    try {
                        Context context = this.n;
                        assetFileDescriptorOpenFd = context.getAssets().openFd(str2);
                        try {
                            assetFileDescriptorOpenFd2 = context.getAssets().openFd("deblur_06_20_2023_pwcnet_v0.tflite.uncompressed");
                            try {
                                ifa ifaVar = ifa.a;
                                tpc tpcVarM = ifaVar.m();
                                int fd = assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd();
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                ((ifa) tpcVarM.b).b = fd;
                                long startOffset = assetFileDescriptorOpenFd.getStartOffset();
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                ((ifa) tpcVarM.b).c = startOffset;
                                long length = assetFileDescriptorOpenFd.getLength();
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                tph tphVar = tpcVarM.b;
                                ((ifa) tphVar).d = length;
                                if (!tphVar.C()) {
                                    tpcVarM.o();
                                }
                                ((ifa) tpcVarM.b).e = a.ar(3);
                                ifa ifaVar2 = (ifa) tpcVarM.l();
                                tpc tpcVarM2 = ifaVar.m();
                                int fd2 = assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd();
                                if (!tpcVarM2.b.C()) {
                                    tpcVarM2.o();
                                }
                                ((ifa) tpcVarM2.b).b = fd2;
                                long startOffset2 = assetFileDescriptorOpenFd2.getStartOffset();
                                if (!tpcVarM2.b.C()) {
                                    tpcVarM2.o();
                                }
                                ((ifa) tpcVarM2.b).c = startOffset2;
                                long length2 = assetFileDescriptorOpenFd2.getLength();
                                if (!tpcVarM2.b.C()) {
                                    tpcVarM2.o();
                                }
                                tph tphVar2 = tpcVarM2.b;
                                ((ifa) tphVar2).d = length2;
                                if (!tphVar2.C()) {
                                    tpcVarM2.o();
                                }
                                ((ifa) tpcVarM2.b).e = a.ar(4);
                                ifa ifaVar3 = (ifa) tpcVarM2.l();
                                zA = NativeDeblurFusion.a(ifaVar2);
                                zA2 = NativeDeblurFusion.a(ifaVar3);
                            } finally {
                            }
                        } catch (Throwable th) {
                            if (assetFileDescriptorOpenFd != null) {
                                try {
                                    assetFileDescriptorOpenFd.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (RuntimeException e) {
                        ((sgt) ((sgt) ((sgt) a.c().h(shx.a, "FalconController")).i(e)).M(1944)).s("Failed to initialize Fusion Deblur");
                    }
                } catch (IOException e2) {
                    ((sgt) ((sgt) ((sgt) a.c().h(shx.a, "FalconController")).i(e2)).M(1943)).s("Unable to open Fusion Deblur model asset file");
                }
                if (!zA) {
                    ((sgt) ((sgt) a.c().h(shx.a, "FalconController")).M(1946)).s("Unable to load model into FusionProcessor");
                    if (assetFileDescriptorOpenFd2 != null) {
                        assetFileDescriptorOpenFd2.close();
                    }
                    if (assetFileDescriptorOpenFd != null) {
                        assetFileDescriptorOpenFd.close();
                    }
                    z = false;
                } else if (zA2) {
                    if (assetFileDescriptorOpenFd2 != null) {
                        assetFileDescriptorOpenFd2.close();
                    }
                    if (assetFileDescriptorOpenFd != null) {
                        assetFileDescriptorOpenFd.close();
                    }
                    z = true;
                } else {
                    ((sgt) ((sgt) a.c().h(shx.a, "FalconController")).M(1945)).s("Unable to load model into FlowProcessor");
                    if (assetFileDescriptorOpenFd2 != null) {
                        assetFileDescriptorOpenFd2.close();
                    }
                    if (assetFileDescriptorOpenFd != null) {
                        assetFileDescriptorOpenFd.close();
                    }
                    z = false;
                }
                pbn pbnVar2 = this.c;
                pbnVar2.h("DeblurFusionController#init");
                AtomicBoolean atomicBoolean = this.f;
                atomicBoolean.set(z && NativeDeblurFusion.nativeInitialize(Build.DEVICE, g(), false, zP));
                this.g.set(false);
                pbnVar2.g();
                if (atomicBoolean.get()) {
                    this.l.a(true);
                } else {
                    ((sgt) ((sgt) a.c().h(shx.a, "FalconController")).M(1938)).s("Failed to initialize DeblurFusionController.");
                }
            }
        }
    }

    @Override // defpackage.idy
    public final syu b(long j, kgw kgwVar, idx idxVar, idx idxVar2, FusionProgressCallback fusionProgressCallback, pas pasVar) {
        i();
        Optional optional = idxVar.a;
        if (optional.isEmpty() || ((RawReadView) optional.get()).d()) {
            ((sgt) ((sgt) a.b().h(shx.a, "FalconController")).M(1949)).s("Empty primary raw image.");
        }
        Optional optional2 = idxVar2.a;
        if (optional2.isEmpty() || ((RawReadView) optional2.get()).d()) {
            ((sgt) ((sgt) a.b().h(shx.a, "FalconController")).M(1950)).s("Empty secondary raw image.");
        }
        shl shlVar = shx.a;
        szh szhVar = new szh();
        this.j.execute(new iek(this, szhVar, j, idxVar, idxVar2, kgwVar, pasVar, fusionProgressCallback));
        szhVar.c(new hvm(this, 12, null), sxo.a);
        this.c.g();
        return szhVar;
    }

    @Override // defpackage.idy
    public final int e(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 4;
        }
        return 2;
    }

    @Override // defpackage.idy
    public final int f(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 9;
            case 7:
                return 10;
            case 8:
                return 11;
            case 9:
                return 12;
            case 10:
                return 13;
            case 11:
                return 14;
            case 12:
                return 15;
            case 13:
                return 16;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 17;
            case 15:
                return 18;
            case 16:
                return 19;
            case 17:
                return 20;
            case 18:
                return 21;
            case 19:
                return 22;
            case 20:
                return 23;
            default:
                return 4;
        }
    }

    public final String g() {
        rwc rwcVarB = ((ixr) this.m).b();
        return rwcVarB.h() ? ((File) rwcVarB.c()).getAbsolutePath() : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(long j, long j2, int i, FusionProgressCallback fusionProgressCallback, ShotMetadata shotMetadata, String str, boolean z, boolean z2) {
        pbn pbnVar = this.c;
        pbnVar.f("retrieveImage");
        if (j2 == -1) {
            pbnVar.g();
            ((sgt) ((sgt) a.c().h(shx.a, "FalconController")).M(1948)).v("Does not save debug image due to fallback %s", str);
            return;
        }
        rwc rwcVarA = this.d.a(j2);
        if (!rwcVarA.h()) {
            pbnVar.g();
            ((sgt) ((sgt) a.c().h(shx.a, "FalconController")).M(1947)).v("Error retrieving debug image %s", str);
            return;
        }
        if (i != 0 && !z2) {
            ((InterleavedImageU8) rwcVarA.c()).h();
        } else if (z) {
            pbnVar.h("onOriginalImage");
            fusionProgressCallback.d(j, (InterleavedImageU8) rwcVarA.c(), (ShotMetadata) this.k.apply(shotMetadata));
        } else {
            pbnVar.h("onDebugImage");
            fusionProgressCallback.a(j, (InterleavedImageU8) rwcVarA.c(), (ShotMetadata) this.k.apply(shotMetadata), str);
        }
        pbnVar.g();
    }

    @Override // defpackage.idy
    public final void c() {
    }

    @Override // defpackage.idy
    public final /* synthetic */ void d() {
    }
}
