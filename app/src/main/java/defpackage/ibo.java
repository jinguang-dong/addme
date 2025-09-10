package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.image.YuvUtils;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibo {
    static final nmt a = new nmt(40.0f);
    public static final nmt b = new nmt(200.0f);
    public final pbc c;
    public final tzj d;
    public final uem e;
    public final iao f;
    public final rwc g;
    public final kqp h;
    public final ibj i;
    public final hbj j;
    private final tzj k;
    private final tzj l;
    private final tzj m;
    private final rwc n;
    private final iat o;
    private final lob p;
    private final hqw q;

    public ibo(pbc pbcVar, tzj tzjVar, tzj tzjVar2, tzj tzjVar3, tzj tzjVar4, uem uemVar, iao iaoVar, hbj hbjVar, rwc rwcVar, rwc rwcVar2, kqp kqpVar, iat iatVar, lob lobVar, hqw hqwVar, ibj ibjVar) {
        this.c = pbcVar.a("PostprocOps");
        this.k = tzjVar;
        this.l = tzjVar3;
        this.m = tzjVar2;
        this.d = tzjVar4;
        this.e = uemVar;
        this.f = iaoVar;
        this.j = hbjVar;
        this.g = rwcVar;
        this.h = kqpVar;
        this.n = rwcVar2;
        this.o = iatVar;
        this.p = lobVar;
        this.q = hqwVar;
        this.i = ibjVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lss] */
    public final icj a(icj icjVar) {
        hkw hkwVar;
        ?? r2;
        pbc pbcVar = this.c;
        pbcVar.h("Apply Face Deblur (RGB).");
        InterleavedImageU8 interleavedImageU8 = icjVar.a;
        interleavedImageU8.getClass();
        hkl hklVar = (hkl) this.m.a();
        InterleavedImageU8 interleavedImageU82 = icjVar.k;
        try {
            hkwVar = icjVar.j;
            r2 = icjVar.r.b;
        } catch (InterruptedException | ExecutionException e) {
            this.c.i("Can't apply face-deblurring (RGB)", e);
        }
        if (hkwVar == null) {
            pbcVar.d("Can't apply face deblur, empty face metadata");
            return icjVar;
        }
        gzi gziVar = gyx.a;
        ((Boolean) hklVar.a(new hkk(interleavedImageU8, hkwVar, interleavedImageU82, r2.o(), icjVar.d)).get()).booleanValue();
        if (interleavedImageU82 != null) {
            interleavedImageU82.h();
        }
        ici iciVar = new ici(icjVar);
        iciVar.g = null;
        return iciVar.a();
    }

    public final icj b(icj icjVar) {
        YuvImage yuvImage = icjVar.b;
        if (yuvImage == null) {
            this.c.h("Input Yuv image is unavailable.");
            return icjVar;
        }
        rwc rwcVar = this.n;
        pll pllVar = new pll(yuvImage, icjVar.g);
        this.c.h("Extract face metadata from yuv image.");
        rwc rwcVarB = ((hkv) ((rwg) rwcVar).a).b(icjVar.d, pllVar);
        if (!rwcVarB.h()) {
            return icjVar;
        }
        ici iciVar = new ici(icjVar);
        iciVar.f = (hkw) rwcVarB.c();
        return iciVar.a();
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, lss] */
    public final icj c(icj icjVar) {
        InterleavedImageU8 interleavedImageU8 = icjVar.a;
        interleavedImageU8.getClass();
        tzj tzjVar = this.d;
        iao iaoVar = iao.NIGHT_SIGHT;
        loq loqVar = (loq) ((rwc) tzjVar.a()).c();
        loz lozVarA = loqVar.a();
        InterleavedImageU8 interleavedImageU82 = this.j.p(gyx.b) ? new InterleavedImageU8(interleavedImageU8.d(), interleavedImageU8.b(), 1) : null;
        InterleavedWriteViewU8 interleavedWriteViewU8G = interleavedImageU82 != null ? interleavedImageU82.g() : null;
        boolean z = this.f == iaoVar;
        ibn ibnVar = new ibn(icjVar, 1);
        InterleavedWriteViewU8 interleavedWriteViewU8G2 = interleavedImageU8.g();
        ShotMetadata shotMetadata = icjVar.d;
        ?? r12 = icjVar.r.b;
        loqVar.c(interleavedWriteViewU8G2, shotMetadata, z, r12.w(), lozVarA, r12.o(), ibnVar, interleavedWriteViewU8G);
        ici iciVar = new ici(icjVar);
        iciVar.h = lozVarA;
        iciVar.g = interleavedImageU82;
        return iciVar.a();
    }

    public final icj d(icj icjVar) {
        HardwareBuffer hardwareBuffer = icjVar.c;
        hardwareBuffer.getClass();
        InterleavedImageU8 interleavedImageU8H = ((loq) ((rwc) this.d.a()).c()).h(hardwareBuffer);
        ici iciVar = new ici(icjVar);
        iciVar.b();
        iciVar.a = interleavedImageU8H;
        return iciVar.a();
    }

    public final icj e(icj icjVar) {
        InterleavedImageU8 interleavedImageU8 = icjVar.a;
        interleavedImageU8.getClass();
        YuvImage yuvImage = new YuvImage(interleavedImageU8.d(), interleavedImageU8.b(), tdd.b);
        InterleavedReadViewU8 interleavedReadViewU8F = interleavedImageU8.f();
        YuvWriteView yuvWriteViewT = rup.t(yuvImage);
        long j = interleavedReadViewU8F.a;
        long jC = YuvWriteView.c(yuvWriteViewT);
        rnt.B(j != 0, "src view is null");
        rnt.B(jC != 0, "dst view is null");
        if (!YuvUtils.rgbToYuvImpl(j, jC)) {
            this.c.d("Failed to convert RGB to YUV");
            yuvImage.c();
            return icjVar;
        }
        interleavedImageU8.h();
        ici iciVar = new ici(icjVar);
        iciVar.b();
        iciVar.b = yuvImage;
        return iciVar.a();
    }

    public final icj f(icj icjVar) {
        YuvImage yuvImage = icjVar.b;
        yuvImage.getClass();
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(yuvImage.b(), yuvImage.a(), 3);
        if (!YuvUtils.a(yuvImage, interleavedImageU8.g())) {
            this.c.d("Failed to convert YUV to RGB");
            interleavedImageU8.h();
            return icjVar;
        }
        yuvImage.c();
        ici iciVar = new ici(icjVar);
        iciVar.b();
        iciVar.a = interleavedImageU8;
        return iciVar.a();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, lss] */
    public final void g(icj icjVar, hqp hqpVar) {
        try {
            this.q.c(((lsu) icjVar.o.orElse(icjVar.r.b.j())).b, hqpVar);
        } catch (IOException e) {
            this.c.e("Error adding badge to image for type: ".concat(String.valueOf(String.valueOf(hqpVar))), e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, lss] */
    public final void h(icj icjVar) {
        icjVar.a.getClass();
        try {
            if (icjVar.j == null) {
                this.c.d("[Dereflection] Can't apply eyeglasses dereflection, empty face metadata");
                return;
            }
            AtomicReference atomicReference = new AtomicReference(null);
            icjVar.r.b.o();
            if (((Boolean) ((syq) ske.M(false)).b).booleanValue()) {
                icj icjVar2 = (icj) atomicReference.get();
                if (icjVar2 == null) {
                    this.c.b("Original image is absent. Skip saving the original image.");
                    return;
                }
                iat iatVar = this.o;
                hxa hxaVarA = iar.a();
                hxaVarA.h(true);
                hxaVarA.b = "glare_removal_original";
                hqp hqpVar = hqp.DOGFOOD_ONLY;
                hxaVarA.i(hqpVar);
                iatVar.a(icjVar2, hxaVarA.a());
                this.c.b("[Anglerfish] Save the original image as burst.");
                g(icjVar, hqpVar);
            }
        } catch (InterruptedException | ExecutionException e) {
            this.c.i("Can't apply anglerfish (RGB)", e);
        }
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, lss] */
    public final void i(icj icjVar) {
        YuvImage yuvImage = icjVar.b;
        yuvImage.getClass();
        hke hkeVar = (hke) this.k.a();
        long j = icjVar.g;
        try {
            hkd hkdVar = (hkd) hkeVar.a(new hkk((poj) new pll(yuvImage, j), icjVar.q.a, icjVar.f, rwc.i(this.p.b(j)), rwc.j(icjVar.d))).get();
            hkdVar.b(icjVar.r.b.o());
            if (hkdVar.c()) {
                ShotMetadata shotMetadata = icjVar.d;
                shotMetadata.k(String.valueOf(GcamModuleJNI.ShotMetadata_software_suffix_get(shotMetadata.a, shotMetadata)).concat("b"));
            }
        } catch (InterruptedException | ExecutionException e) {
            this.c.i("Can't apply post-processing", e);
        }
    }
}
