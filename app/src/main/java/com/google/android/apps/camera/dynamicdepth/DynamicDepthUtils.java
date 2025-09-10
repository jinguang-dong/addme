package com.google.android.apps.camera.dynamicdepth;

import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;
import defpackage.fij;
import defpackage.hgc;
import defpackage.loz;
import defpackage.poj;
import defpackage.rwc;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.shl;
import defpackage.shx;
import defpackage.tgp;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DynamicDepthUtils {
    public static final sgv a = sgv.g("com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils");
    private final boolean b;
    private final String c;
    private final String d;
    private boolean e = false;

    public DynamicDepthUtils(boolean z, rwc rwcVar) {
        String absolutePath;
        this.b = z;
        if (z && rwcVar.h()) {
            String absolutePath2 = ((File) rwcVar.c()).getAbsolutePath();
            this.d = absolutePath2;
            absolutePath = new File(absolutePath2, "ddc_opencl_cache.bin").getAbsolutePath();
        } else {
            absolutePath = "";
            this.d = "";
        }
        this.c = absolutePath;
    }

    private static native boolean createDynamicDepthFromPdImpl(long j, long j2, long j3, long j4);

    public static native boolean createDynamicDepthFromUltradepthImpl(long j, long j2, long j3, long j4, boolean z, long j5);

    public static byte[] d(byte[] bArr, DynamicDepthResult dynamicDepthResult, loz lozVar) {
        byte[] bArrWriteDynamicDepthIntoJpegStreamImpl = writeDynamicDepthIntoJpegStreamImpl(bArr, dynamicDepthResult.a, lozVar == null ? 0L : lozVar.a());
        if (bArrWriteDynamicDepthIntoJpegStreamImpl == null) {
            return null;
        }
        shl shlVar = shx.a;
        return bArrWriteDynamicDepthIntoJpegStreamImpl;
    }

    private static native void initializePdImpl(boolean z, String str, int i);

    public static native void savePdCacheImpl();

    private static native byte[] writeDynamicDepthIntoJpegStreamImpl(byte[] bArr, long j, long j2);

    public final synchronized Runnable a() {
        if (this.e) {
            return new fij(8);
        }
        hgc.a();
        initializePdImpl(this.b, this.c, 2);
        this.e = true;
        return new fij(7);
    }

    public final synchronized boolean b(poj pojVar, poj pojVar2, DynamicDepthResult dynamicDepthResult, ShotMetadata shotMetadata) {
        tgp tgpVar = new tgp();
        rwc rwcVarA = tgpVar.a(pojVar);
        if (!rwcVarA.h()) {
            ((sgt) ((sgt) a.b().h(shx.a, "CAM_DynDepthUtils")).M(1255)).s("Error converting the PD image.");
            return false;
        }
        return c((RawWriteView) rwcVarA.c(), tgpVar.c(pojVar2), dynamicDepthResult, shotMetadata);
    }

    public final synchronized boolean c(RawWriteView rawWriteView, YuvWriteView yuvWriteView, DynamicDepthResult dynamicDepthResult, ShotMetadata shotMetadata) {
        boolean zCreateDynamicDepthFromPdImpl;
        Runnable runnableA = a();
        zCreateDynamicDepthFromPdImpl = createDynamicDepthFromPdImpl(RawWriteView.e(rawWriteView), YuvWriteView.c(yuvWriteView), ShotMetadata.a(shotMetadata), dynamicDepthResult.a);
        runnableA.run();
        return zCreateDynamicDepthFromPdImpl;
    }
}
