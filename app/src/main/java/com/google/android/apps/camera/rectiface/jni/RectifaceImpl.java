package com.google.android.apps.camera.rectiface.jni;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.os.Build;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import com.google.googlex.gcam.image.ImageUtils;
import com.google.googlex.gcam.imageio.JpgHelper;
import defpackage.a;
import defpackage.haa;
import defpackage.ham;
import defpackage.hbj;
import defpackage.lge;
import defpackage.lgo;
import defpackage.loq;
import defpackage.loz;
import defpackage.lpa;
import defpackage.mdm;
import defpackage.mdo;
import defpackage.owq;
import defpackage.paq;
import defpackage.rnt;
import defpackage.rwc;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.sla;
import defpackage.spx;
import defpackage.tcd;
import defpackage.tci;
import defpackage.tpc;
import defpackage.tph;
import defpackage.tpn;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.attribute.FileAttribute;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RectifaceImpl implements loq, paq {
    private static final sgv a = sgv.g("com.google.android.apps.camera.rectiface.jni.RectifaceImpl");
    private long b = 0;
    private long c = 0;
    private boolean d = false;
    private int e;
    private final lgo f;
    private final owq g;
    private final lge h;
    private final hbj i;

    static {
        lpa.a();
    }

    public RectifaceImpl(lge lgeVar, lgo lgoVar, owq owqVar, hbj hbjVar) {
        this.h = lgeVar;
        this.f = lgoVar;
        this.g = owqVar;
        this.i = hbjVar;
    }

    private static native void copyRgbaToRgbImpl(long j, long j2, long j3, boolean z);

    private static native String correctFaceDistortionAHWBImpl(HardwareBuffer hardwareBuffer, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j5, Rectiface$RectifaceCallback rectiface$RectifaceCallback, long j6);

    private static native String correctFaceDistortionImpl(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j6, Rectiface$RectifaceCallback rectiface$RectifaceCallback, long j7);

    private static native boolean correctLensDistortionAHWBZeroCopyImpl(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, long j, long j2);

    private static native boolean correctLensDistortionImpl(Bitmap bitmap, long j);

    private static native long initializeLensCorrectionImpl(int i, int i2);

    private static native long initializeSegmenterImpl(long j, int i, String str, String str2, int i2);

    private static final void l() {
        ((sgt) a.c().M(4287)).s("Skipped Rectiface since the module is not initialized.");
    }

    private static final void m(InterleavedReadViewU8 interleavedReadViewU8, ShotMetadata shotMetadata, int i, String str) throws IOException {
        try {
            Path pathOf = Path.CC.of("sdcard", "DCIM", "CAMERA");
            Files.createDirectories(pathOf, new FileAttribute[0]);
            JpgEncodeOptions jpgEncodeOptions = new JpgEncodeOptions();
            GcamModuleJNI.JpgEncodeOptions_quality_set(jpgEncodeOptions.a, jpgEncodeOptions, 80);
            jpgEncodeOptions.b(shotMetadata);
            rwc rwcVarA = JpgHelper.a(interleavedReadViewU8, jpgEncodeOptions, tcd.b);
            FileOutputStream fileOutputStream = new FileOutputStream(Files.createFile(pathOf.resolve(str + "_" + (i + (-1) != 0 ? "rectiface_output" : "rectiface_input") + ".jpg"), new FileAttribute[0]).toFile());
            try {
                fileOutputStream.write((byte[]) rwcVarA.c());
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    private static final void n(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, int i, String str) {
        LockedHardwareBuffer lockedHardwareBuffer = new LockedHardwareBuffer(hardwareBuffer, 2L);
        try {
            InterleavedReadViewU8 interleavedReadViewU8A = lockedHardwareBuffer.a();
            InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(interleavedReadViewU8A.d(), interleavedReadViewU8A.c(), interleavedReadViewU8A.b());
            ImageUtils.a(interleavedReadViewU8A, interleavedImageU8.g());
            m(interleavedImageU8.f(), shotMetadata, i, str);
            lockedHardwareBuffer.close();
        } catch (Throwable th) {
            try {
                lockedHardwareBuffer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static native void releaseSegmenterImpl(long j);

    @Override // defpackage.loq
    public final loz a() {
        RectifaceWarpfieldImpl rectifaceWarpfieldImpl = new RectifaceWarpfieldImpl();
        if (rectifaceWarpfieldImpl.b == 0) {
            rectifaceWarpfieldImpl.b = RectifaceWarpfieldImpl.initializeImpl();
        }
        ((sgt) RectifaceWarpfieldImpl.a.c().M(4291)).s("Ignored Rectiface warpfield re-initialization.");
        rnt.M(rectifaceWarpfieldImpl.b != 0, "Invalid rectiface warpfield.");
        return rectifaceWarpfieldImpl;
    }

    @Override // defpackage.loq
    public final void b(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, boolean z, String str, loz lozVar, mdm mdmVar, Rectiface$RectifaceCallback rectiface$RectifaceCallback, InterleavedWriteViewU8 interleavedWriteViewU8) {
        long j;
        boolean z2;
        long j2;
        long j3;
        long j4;
        boolean z3;
        RectifaceOutput rectifaceOutput;
        if (!this.d) {
            l();
            return;
        }
        hbj hbjVar = this.i;
        if (hbjVar.p(ham.b)) {
            boolean z4 = !str.isEmpty() && hbjVar.p(ham.h);
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolValueOf.getClass();
            if (z4) {
                n(hardwareBuffer, new ShotMetadata(shotMetadata), 1, str);
            }
            RectifaceOutput rectifaceOutput2 = new RectifaceOutput();
            long jA = ShotMetadata.a(shotMetadata);
            long j5 = this.b;
            long j6 = ((RectifaceWarpfieldImpl) lozVar).b;
            long jA2 = this.f.a();
            boolean zK = k();
            boolean zJ = j(shotMetadata);
            boolean zP = hbjVar.p(ham.e);
            if (hbjVar.p(ham.f) || z) {
                j = j6;
                z2 = true;
            } else {
                j = j6;
                z2 = false;
            }
            if (!hbjVar.p(ham.g) && g() && ((Boolean) this.g.dL()).booleanValue()) {
                j2 = jA;
                j3 = jA2;
                j4 = j5;
                z3 = false;
            } else {
                j2 = jA;
                j3 = jA2;
                j4 = j5;
                z3 = true;
            }
            long j7 = rectifaceOutput2.a;
            correctFaceDistortionAHWBImpl(hardwareBuffer, j2, j4, j, j3, zK, zJ, zP, z2, z3, j7, rectiface$RectifaceCallback, interleavedWriteViewU8 == null ? 0L : InterleavedWriteViewU8.a(interleavedWriteViewU8));
            boolValueOf.getClass();
            if (z4) {
                n(hardwareBuffer, new ShotMetadata(shotMetadata), 2, str);
            }
            if (mdmVar != null) {
                tpc tpcVarM = spx.a.m();
                int i = sla.l()[rectifaceOutput2.j()];
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar = (spx) tpcVarM.b;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                spxVar.c = i2;
                spxVar.b |= 1;
                int iD = rectifaceOutput2.d();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar2 = (spx) tpcVarM.b;
                spxVar2.b = 2 | spxVar2.b;
                spxVar2.f = iD;
                int iG = rectifaceOutput2.g();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar3 = (spx) tpcVarM.b;
                spxVar3.b |= 16;
                spxVar3.h = iG;
                int i3 = rectifaceOutput2.i();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar4 = (spx) tpcVarM.b;
                spxVar4.b |= 8;
                spxVar4.g = i3;
                int iH = rectifaceOutput2.h();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar5 = (spx) tpcVarM.b;
                spxVar5.b |= 64;
                spxVar5.i = iH;
                boolean isAnglerfishAppliedImpl = RectifaceOutput.getIsAnglerfishAppliedImpl(j7);
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar6 = (spx) tpcVarM.b;
                spxVar6.b |= 128;
                spxVar6.j = isAnglerfishAppliedImpl;
                if (rectifaceOutput2.f() > 0) {
                    for (int i4 = 0; i4 < rectifaceOutput2.f(); i4++) {
                        tpcVarM.P(rectifaceOutput2.b(i4));
                    }
                }
                rectifaceOutput = rectifaceOutput2;
                if (rectifaceOutput.e() > 0) {
                    for (int i5 = 0; i5 < rectifaceOutput.e(); i5++) {
                        tpcVarM.O(rectifaceOutput.a(i5));
                    }
                }
                if (rectifaceOutput.c() > 0) {
                    for (int i6 = 0; i6 < rectifaceOutput.c(); i6++) {
                        int i7 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}[RectifaceOutput.getAnglerfishFallbackStatusImpl(j7, i6)];
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        spx spxVar7 = (spx) tpcVarM.b;
                        if (i7 == 0) {
                            throw null;
                        }
                        tpn tpnVar = spxVar7.k;
                        if (!tpnVar.c()) {
                            spxVar7.k = tph.t(tpnVar);
                        }
                        spxVar7.k.g(i7 - 1);
                    }
                }
                ((mdo) mdmVar).v = (spx) tpcVarM.l();
            } else {
                rectifaceOutput = rectifaceOutput2;
            }
            rectifaceOutput.k();
        }
    }

    @Override // defpackage.loq
    public final void c(InterleavedWriteViewU8 interleavedWriteViewU8, ShotMetadata shotMetadata, boolean z, String str, loz lozVar, mdm mdmVar, Rectiface$RectifaceCallback rectiface$RectifaceCallback, InterleavedWriteViewU8 interleavedWriteViewU82) throws IOException {
        boolean z2;
        boolean z3;
        if (!this.d) {
            l();
            return;
        }
        hbj hbjVar = this.i;
        if (hbjVar.p(ham.b)) {
            boolean z4 = !str.isEmpty() && hbjVar.p(ham.h);
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolValueOf.getClass();
            if (z4) {
                m(interleavedWriteViewU8.b(), new ShotMetadata(shotMetadata), 1, str);
            }
            RectifaceOutput rectifaceOutput = new RectifaceOutput();
            long jA = InterleavedWriteViewU8.a(interleavedWriteViewU8);
            long jA2 = ShotMetadata.a(shotMetadata);
            long j = this.b;
            long j2 = ((RectifaceWarpfieldImpl) lozVar).b;
            long jA3 = this.f.a();
            boolean zK = k();
            boolean zJ = j(shotMetadata);
            boolean zP = hbjVar.p(ham.e);
            boolean z5 = hbjVar.p(ham.f) || z;
            if (hbjVar.p(ham.g) || !g()) {
                z2 = z4;
                z3 = true;
            } else {
                z2 = z4;
                z3 = false;
            }
            correctFaceDistortionImpl(jA, jA2, j, j2, jA3, zK, zJ, zP, z5, z3, rectifaceOutput.a, rectiface$RectifaceCallback, interleavedWriteViewU82 == null ? 0L : InterleavedWriteViewU8.a(interleavedWriteViewU82));
            boolValueOf.getClass();
            if (z2) {
                m(interleavedWriteViewU8.b(), new ShotMetadata(shotMetadata), 2, str);
            }
            if (mdmVar != null) {
                tpc tpcVarM = spx.a.m();
                int i = sla.l()[rectifaceOutput.j()];
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar = (spx) tpcVarM.b;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                spxVar.c = i2;
                spxVar.b |= 1;
                int iD = rectifaceOutput.d();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar2 = (spx) tpcVarM.b;
                spxVar2.b = 2 | spxVar2.b;
                spxVar2.f = iD;
                int iG = rectifaceOutput.g();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar3 = (spx) tpcVarM.b;
                spxVar3.b |= 16;
                spxVar3.h = iG;
                int i3 = rectifaceOutput.i();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar4 = (spx) tpcVarM.b;
                spxVar4.b |= 8;
                spxVar4.g = i3;
                int iH = rectifaceOutput.h();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spx spxVar5 = (spx) tpcVarM.b;
                spxVar5.b |= 64;
                spxVar5.i = iH;
                if (rectifaceOutput.f() > 0) {
                    for (int i4 = 0; i4 < rectifaceOutput.f(); i4++) {
                        tpcVarM.P(rectifaceOutput.b(i4));
                    }
                }
                if (rectifaceOutput.e() > 0) {
                    float[] fArr = new float[rectifaceOutput.e()];
                    for (int i5 = 0; i5 < rectifaceOutput.e(); i5++) {
                        tpcVarM.O(rectifaceOutput.a(i5));
                    }
                }
                ((mdo) mdmVar).v = (spx) tpcVarM.l();
            }
            rectifaceOutput.k();
        }
    }

    @Override // java.lang.AutoCloseable, defpackage.paq
    public final void close() {
        this.d = false;
        long j = this.b;
        if (j != 0) {
            releaseSegmenterImpl(j);
            this.b = 0L;
        }
        long j2 = this.c;
        if (j2 != 0) {
            releaseSegmenterImpl(j2);
            this.c = 0L;
        }
    }

    @Override // defpackage.loq
    public final void d(Bitmap bitmap, ShotMetadata shotMetadata) {
        bitmap.getClass();
        if (correctLensDistortionImpl(bitmap, ShotMetadata.a(shotMetadata))) {
            return;
        }
        ((sgt) a.b().M(4282)).s("Lens correction failed.");
    }

    @Override // defpackage.loq
    public final boolean f(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, ShotMetadata shotMetadata) {
        if ((this.e != 1 || hardwareBuffer.getFormat() == 35) && (this.e != 0 || hardwareBuffer.getFormat() == 1)) {
            hardwareBuffer.getClass();
            return correctLensDistortionAHWBZeroCopyImpl(hardwareBuffer, hardwareBuffer2, ShotMetadata.a(shotMetadata), this.c);
        }
        ((sgt) a.c().M(4283)).s("Lens distortion correction skipped because of format mismatch.");
        return false;
    }

    @Override // defpackage.loq
    public final boolean g() {
        return this.i.p(ham.i);
    }

    @Override // defpackage.loq
    public final InterleavedImageU8 h(HardwareBuffer hardwareBuffer) {
        rnt.B(hardwareBuffer.getFormat() == 1, "HardwareBuffer format unexpected.");
        LockedHardwareBuffer lockedHardwareBuffer = new LockedHardwareBuffer(hardwareBuffer, 2L);
        try {
            InterleavedReadViewU8 interleavedReadViewU8A = lockedHardwareBuffer.a();
            a.I(interleavedReadViewU8A.b() == 4);
            InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(interleavedReadViewU8A.d(), interleavedReadViewU8A.c(), 3);
            InterleavedWriteViewU8 interleavedWriteViewU8G = interleavedImageU8.g();
            rnt.B(interleavedReadViewU8A.b() == 4, "Expect srcBuffer in RGBA8 format.");
            rnt.B(GcamModuleJNI.InterleavedWriteViewU8_channels(interleavedWriteViewU8G.a, interleavedWriteViewU8G) == 3, "Expect dstBuffer in RGB8 format.");
            a.I(interleavedReadViewU8A.d() == GcamModuleJNI.InterleavedWriteViewU8_width(interleavedWriteViewU8G.a, interleavedWriteViewU8G));
            a.I(interleavedReadViewU8A.c() == GcamModuleJNI.InterleavedWriteViewU8_height(interleavedWriteViewU8G.a, interleavedWriteViewU8G));
            copyRgbaToRgbImpl(interleavedReadViewU8A.a, InterleavedWriteViewU8.a(interleavedWriteViewU8G), this.b, this.d);
            lockedHardwareBuffer.close();
            hardwareBuffer.close();
            return interleavedImageU8;
        } finally {
        }
    }

    public final boolean i() {
        return this.i.p(ham.c);
    }

    public final boolean j(ShotMetadata shotMetadata) {
        hbj hbjVar = this.i;
        return !hbjVar.p(ham.d) || (((Integer) hbjVar.a(ham.a).get()).intValue() == 2 && shotMetadata.f().e() == tci.c);
    }

    public final boolean k() {
        return (i() && g() && ((Boolean) this.g.dL()).booleanValue()) ? false : true;
    }

    @Override // defpackage.loq
    public final void e() {
        lge lgeVar;
        if (this.b != 0 || (lgeVar = this.h) == null) {
            ((sgt) a.c().M(4284)).s("Ignored Rectiface (Segmenter) re-initialization.");
        } else {
            if (lgeVar.a() == 0 && g()) {
                ((sgt) a.c().M(4286)).s(TOnSyMaYeslEl.OjSBKzGplrE);
                lgeVar.b();
            }
            long jA = lgeVar.a();
            String str = Build.MANUFACTURER;
            str.getClass();
            String str2 = Build.DEVICE;
            str2.getClass();
            this.b = initializeSegmenterImpl(jA, 8, str, str2, 0);
            hbj hbjVar = this.i;
            int i = (hbjVar.p(haa.af) && hbjVar.p(haa.A)) ? 1 : 0;
            this.e = i;
            this.c = initializeLensCorrectionImpl(8, i);
        }
        rnt.M(this.b != 0, "Invalid segmenter.");
        lgo lgoVar = this.f;
        if (lgoVar.a() == 0 && i()) {
            ((sgt) a.c().M(4285)).s("Expected firefly to be initialized, but it wasn't. Initializing again.");
            lgoVar.d();
        }
        this.d = true;
    }
}
