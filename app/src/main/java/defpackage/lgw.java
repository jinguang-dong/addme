package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.android.apps.camera.portrait.preview.NativePortraitPreviewProcessor;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.hdrplus.NativeMetadataConverter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgw implements paq {
    public static final sgv a = sgv.g("lgw");
    public final syu c;
    private final pjp d;
    private final sbv i;
    private final rwr j;
    public final Object b = new Object();
    private FrameMetadata e = new FrameMetadata();
    private StaticMetadata f = new StaticMetadata();
    private float g = 1.0f;
    private PixelRect h = new PixelRect();

    public lgw(pjp pjpVar, sbv sbvVar, rwr rwrVar, syu syuVar) {
        shl shlVar = shx.a;
        this.d = pjpVar;
        this.j = rwrVar;
        this.i = sbvVar;
        this.c = syuVar;
    }

    private final synchronized boolean b(poe poeVar) {
        if (poeVar != null) {
            String strB = poeVar.b();
            strB.getClass();
            pjr pjrVarD = this.d.d(strB);
            pjrVarD.getClass();
            NativeMetadataConverter nativeMetadataConverter = (NativeMetadataConverter) this.i.get(pjrVarD);
            nativeMetadataConverter.getClass();
            try {
                pjo pjoVarH = nativeMetadataConverter.h(poeVar);
                rwr rwrVar = this.j;
                int iOrdinal = pjoVarH.l().ordinal();
                if (iOrdinal == 0) {
                    Object obj = rwrVar.b;
                    gzi gziVar = hak.a;
                } else if (iOrdinal == 1) {
                    if (((hbj) rwrVar.b).p(hak.af)) {
                        this.e = nativeMetadataConverter.n(poeVar, pjrVarD);
                        this.f = tgq.z(pjoVarH);
                        Float f = (Float) poeVar.a(CaptureResult.CONTROL_ZOOM_RATIO);
                        Float fValueOf = Float.valueOf(1.0f);
                        if (f == null) {
                            f = fValueOf;
                        }
                        this.g = f.floatValue();
                        PixelRect pixelRect = new PixelRect();
                        Rect rect = (Rect) poeVar.a(CaptureResult.SCALER_CROP_REGION);
                        rect.getClass();
                        pixelRect.i(rect.left);
                        pixelRect.k(rect.top);
                        pixelRect.j(rect.right);
                        pixelRect.l(rect.bottom);
                        this.h = pixelRect;
                        return true;
                    }
                }
            } catch (IllegalArgumentException unused) {
                ((sgt) ((sgt) a.c().h(shx.a, CZAHo.XzNQq)).M(4145)).s("Failed to get physical characteristics.");
                return false;
            }
        }
        return false;
    }

    public final boolean a(poj pojVar, poe poeVar, poj pojVar2, poj pojVar3) {
        HardwareBuffer hardwareBufferF;
        if (!b(poeVar)) {
            return false;
        }
        NativePortraitPreviewProcessor nativePortraitPreviewProcessor = (NativePortraitPreviewProcessor) ske.V(this.c);
        synchronized (this.b) {
            HardwareBuffer hardwareBufferF2 = pojVar.f();
            try {
                hardwareBufferF2 = pojVar3.f();
                if (pojVar2 != null) {
                    try {
                        hardwareBufferF = pojVar2.f();
                    } finally {
                        if (hardwareBufferF2 == null) {
                            throw th;
                        }
                        try {
                            hardwareBufferF2.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } else {
                    hardwareBufferF = null;
                }
                HardwareBuffer hardwareBuffer = hardwareBufferF;
                try {
                    if (hardwareBufferF2 == null || hardwareBufferF2 == null) {
                        ((sgt) ((sgt) a.c().h(shx.a, "MilkPipeline")).M(4144)).s("Input or output buffer is null.");
                        if (hardwareBuffer != null) {
                            hardwareBuffer.close();
                        }
                        if (hardwareBufferF2 != null) {
                            hardwareBufferF2.close();
                        }
                        if (hardwareBufferF2 != null) {
                            hardwareBufferF2.close();
                        }
                        return false;
                    }
                    tpc tpcVarM = lhb.a.m();
                    long jC = FrameMetadata.c(this.e);
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    lhb lhbVar = (lhb) tphVar;
                    lhbVar.b |= 1;
                    lhbVar.c = jC;
                    long jC2 = StaticMetadata.c(this.f);
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar2 = tpcVarM.b;
                    lhb lhbVar2 = (lhb) tphVar2;
                    lhbVar2.b |= 2;
                    lhbVar2.d = jC2;
                    long jG = PixelRect.g(this.h);
                    if (!tphVar2.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar3 = tpcVarM.b;
                    lhb lhbVar3 = (lhb) tphVar3;
                    lhbVar3.b |= 4;
                    lhbVar3.e = jG;
                    float f = this.g;
                    if (!tphVar3.C()) {
                        tpcVarM.o();
                    }
                    lhb lhbVar4 = (lhb) tpcVarM.b;
                    lhbVar4.b |= 8;
                    lhbVar4.f = f;
                    boolean zNativeProcess = NativePortraitPreviewProcessor.nativeProcess(nativePortraitPreviewProcessor.a, hardwareBufferF2, hardwareBuffer, ((lhb) tpcVarM.l()).h(), hardwareBufferF2);
                    if (hardwareBuffer != null) {
                        hardwareBuffer.close();
                    }
                    hardwareBufferF2.close();
                    hardwareBufferF2.close();
                    return zNativeProcess;
                } finally {
                }
            } catch (Throwable th2) {
                if (hardwareBufferF2 != null) {
                    try {
                        hardwareBufferF2.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        shl shlVar = shx.a;
        ske.W(this.c, new fxw(this, 8), sxo.a);
    }
}
