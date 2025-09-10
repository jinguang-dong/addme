package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.GrayReadViewS16;
import com.google.googlex.gcam.HdrGainMapInfo;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.imageio.JpgHelper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idp implements FusionProgressCallback {
    final /* synthetic */ idr a;

    public idp(idr idrVar) {
        this.a = idrVar;
    }

    private final void f(final long j, final obu obuVar, final ShotMetadata shotMetadata, final boolean z, final iea ieaVar) throws Exception {
        idr idrVar = this.a;
        final mpc mpcVar = new mpc(idrVar.l, 9);
        rwc rwcVar = (rwc) obuVar.b;
        boolean z2 = rwcVar.h() && ((InterleavedImageU8) rwcVar.c()).d() > 0 && ((InterleavedImageU8) rwcVar.c()).b() > 0;
        rwc rwcVar2 = (rwc) obuVar.a;
        boolean z3 = rwcVar2.h() && ((HardwareBuffer) rwcVar2.c()).getWidth() > 0 && ((HardwareBuffer) rwcVar2.c()).getHeight() > 0;
        if (z2 || z3) {
            idrVar.h(new Runnable() { // from class: ido
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    idr idrVar2 = this.a.a;
                    long j2 = j;
                    obu obuVar2 = obuVar;
                    ShotMetadata shotMetadata2 = shotMetadata;
                    mpc mpcVar2 = mpcVar;
                    iea ieaVar2 = ieaVar;
                    try {
                        ids idsVar = idrVar2.h;
                        idsVar.d.f("fusion#saveImage");
                        ici iciVarA = icj.a();
                        iciVarA.e = ske.M(new InterleavedImageU16());
                        iciVarA.e(new lba());
                        iciVarA.h(TimeUnit.MICROSECONDS.toNanos(shotMetadata2.b()));
                        hxu hxuVar = idrVar2.i;
                        iciVarA.d(hxuVar);
                        iciVarA.c(ieaVar2);
                        iciVarA.b();
                        Object obj = obuVar2.b;
                        if (((rwc) obj).h()) {
                            iciVarA.a = (InterleavedImageU8) ((rwc) obj).c();
                        } else {
                            iciVarA.c = (HardwareBuffer) ((rwc) obuVar2.a).c();
                        }
                        iciVarA.f(shotMetadata2);
                        iciVarA.i(idrVar2.k);
                        if (z) {
                            try {
                                ((hzl) idsVar.b.a()).b(hxuVar, rwc.j(iciVarA.a()), iea.a);
                                idrVar2.g = true;
                            } catch (IllegalStateException e) {
                                ((sgt) ((sgt) ids.a.b().i(e)).M(1929)).s("Error processing and saving the primary image.");
                            }
                        } else {
                            try {
                                ((hzl) idrVar2.h.b.a()).d(idrVar2.i, iciVarA.a(), "original");
                            } catch (IllegalStateException e2) {
                                ((sgt) ((sgt) ids.a.c().i(e2)).M(1928)).s("Error processing and saving the original image.");
                            }
                        }
                    } finally {
                        idrVar2.h.d.g();
                        mpcVar2.close();
                        idrVar2.g(j2);
                    }
                }
            });
        } else {
            mpcVar.close();
            idrVar.g(j);
        }
    }

    @Override // com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback
    public final void a(long j, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, String str) {
        c(j, rwc.j(interleavedImageU8), rvk.a, shotMetadata, str);
    }

    @Override // com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback
    public final void b(long j, int i, int i2, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        idr idrVar = this.a;
        long j2 = jCurrentTimeMillis - idrVar.f;
        tpc tpcVar = idrVar.j;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        sqa sqaVar = (sqa) tpcVar.b;
        sqa sqaVar2 = sqa.a;
        sqaVar.b |= 1;
        sqaVar.c = (int) j2;
        idy idyVar = idrVar.c;
        int iF = idyVar.f(i);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        sqa sqaVar3 = (sqa) tpcVar.b;
        sqaVar3.d = iF - 1;
        sqaVar3.b |= 2;
        int iE = idyVar.e(i2);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        sqa sqaVar4 = (sqa) tpcVar.b;
        sqaVar4.e = iE - 1;
        sqaVar4.b |= 4;
        if (z) {
            try {
                idyVar.c();
            } catch (IOException e) {
                ((sgt) ((sgt) ids.a.c().i(e)).M(1901)).u("Couldn't apply special type for %s", j);
            }
        }
        idr idrVar2 = this.a;
        idrVar2.p = true;
        idrVar2.g(j);
    }

    public final void c(final long j, final rwc rwcVar, final rwc rwcVar2, final ShotMetadata shotMetadata, final String str) {
        if (rwcVar.g().size() + rwcVar2.g().size() != 1) {
            throw new IllegalArgumentException("Exactly one kind of debug image should be set.");
        }
        idr idrVar = this.a;
        final mpc mpcVar = new mpc(idrVar.l, 9);
        idrVar.h(new Runnable() { // from class: idn
            /* JADX WARN: Finally extract failed */
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                rwc rwcVarA;
                idp idpVar = this.a;
                rwc rwcVar3 = rwcVar;
                rwc rwcVar4 = rwcVar2;
                String str2 = str;
                mpc mpcVar2 = mpcVar;
                try {
                    idr idrVar2 = idpVar.a;
                    ids idsVar = idrVar2.h;
                    idsVar.d.f("fusion#saveDebugImage");
                    tcd tcdVarE = tcd.b;
                    boolean zP = idsVar.j.p(gzo.bg);
                    ShotMetadata shotMetadata2 = shotMetadata;
                    if (zP) {
                        tcdVarE = shotMetadata2.e();
                        ske.w(shotMetadata2, 95);
                    }
                    shotMetadata2.h(new HdrGainMapInfo());
                    JpgEncodeOptions jpgEncodeOptions = new JpgEncodeOptions();
                    jpgEncodeOptions.b(shotMetadata2);
                    if (rwcVar3.h()) {
                        rwcVarA = JpgHelper.a(((InterleavedImageU8) rwcVar3.c()).f(), jpgEncodeOptions, tcdVarE);
                        ((InterleavedImageU8) rwcVar3.c()).h();
                    } else if (rwcVar4.h()) {
                        Object objC = rwcVar4.c();
                        rwc rwcVarI = rwc.i(JpgHelper.remapAndEncodeGrayS16ToJpegAsByteArrayImpl(new GrayReadViewS16(GcamModuleJNI.GrayImageS16_read_view(((GrayImageS16) objC).a, (GrayImageS16) objC)).a, jpgEncodeOptions.a, tcdVarE.j, -1.0f, -1.0f, -1.0f, 0));
                        ((GrayImageS16) rwcVar4.c()).b();
                        rwcVarA = rwcVarI;
                    } else {
                        rwcVarA = rvk.a;
                    }
                    if (rwcVarA.h()) {
                        lsu lsuVarB = idrVar2.b.k().b("jpg");
                        pos posVar = lsuVarB.b;
                        posVar.h(mn.g(str2, "DEBUG_"));
                        try {
                            FileOutputStream fileOutputStreamE = posVar.e();
                            try {
                                fileOutputStreamE.write((byte[]) rwcVarA.c());
                                lsuVarB.b();
                                fileOutputStreamE.close();
                            } finally {
                            }
                        } catch (IOException e) {
                            ((sgt) ((sgt) ids.a.c().i(e)).M(1897)).v("[%s] Error writing debug image to disk.", idpVar.a.d);
                            lsuVarB.a();
                        }
                    } else {
                        ((sgt) ids.a.c().M(1896)).v("[%s] Error encoding debug image.", idrVar2.d);
                    }
                    long j2 = j;
                    idr idrVar3 = idpVar.a;
                    idrVar3.h.d.g();
                    mpcVar2.close();
                    idrVar3.g(j2);
                } catch (Throwable th) {
                    idpVar.a.h.d.g();
                    mpcVar2.close();
                    throw th;
                }
            }
        });
    }

    @Override // com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback
    public final void d(long j, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) throws Exception {
        f(j, obu.i(interleavedImageU8), shotMetadata, false, iea.a);
    }

    @Override // com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback
    public final void e(long j, obu obuVar, ShotMetadata shotMetadata, int i) throws Exception {
        iea ieaVarB;
        if (i == 1) {
            ieaVarB = this.a.e;
        } else {
            ieaVarB = iea.b(idz.NONE, 3, this.a.e.b);
        }
        f(j, obuVar, shotMetadata, true, ieaVarB);
    }

    @Override // com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback
    public void onProgress(long j, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        a.I(z);
        this.a.a.a(ibo.b, f);
    }
}
