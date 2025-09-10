package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.PointF;
import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.apps.camera.jni.gxp.GxpUtils;
import com.google.android.apps.camera.jni.tracking.RoiTrackerNative;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlo implements mlx {
    private static final sgv a = sgv.g("mlo");
    private boolean b;
    private final long c;
    private AssetFileDescriptor d;
    private AssetFileDescriptor e;
    private volatile long f;
    private volatile int g;
    private final rwc h;
    private final rwc i;
    private final owf j;

    /* JADX WARN: Illegal instructions before constructor call */
    public mlo() {
        rvk rvkVar = rvk.a;
        this(rvkVar, rvkVar, false, null, null, false, null, new owi(false));
    }

    @Override // defpackage.mlx
    public final synchronized void a() {
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mmb] */
    @Override // defpackage.mlx
    public final synchronized void b() {
        if (!this.b) {
            RoiTrackerNative.stopTracking(this.c);
            rwc rwcVar = this.h;
            if (rwcVar.h()) {
                rwcVar.c().a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:10:0x000e, B:12:0x0012, B:16:0x0024, B:18:0x002f, B:19:0x0036, B:15:0x0017), top: B:25:0x0001, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, mmb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    @Override // defpackage.mlx, defpackage.paq, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void close() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.b     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            android.content.res.AssetFileDescriptor r0 = r4.d     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L40
            if (r0 == 0) goto Le
            r0.close()     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L40
        Le:
            android.content.res.AssetFileDescriptor r0 = r4.e     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L40
            if (r0 == 0) goto L24
            r0.close()     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L40
            goto L24
        L16:
            r0 = move-exception
            sgv r1 = defpackage.mlo.a     // Catch: java.lang.Throwable -> L40
            shi r1 = r1.b()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "Unable to close asset fd."
            r3 = 4927(0x133f, float:6.904E-42)
            defpackage.mn.c(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> L40
        L24:
            r4.b()     // Catch: java.lang.Throwable -> L40
            rwc r0 = r4.h     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0.h()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L36
            java.lang.Object r0 = r0.c()     // Catch: java.lang.Throwable -> L40
            r0.close()     // Catch: java.lang.Throwable -> L40
        L36:
            long r0 = r4.c     // Catch: java.lang.Throwable -> L40
            com.google.android.apps.camera.jni.tracking.RoiTrackerNative.releaseHandle(r0)     // Catch: java.lang.Throwable -> L40
            r0 = 1
            r4.b = r0     // Catch: java.lang.Throwable -> L40
            monitor-exit(r4)
            return
        L40:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlo.close():void");
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, mmb] */
    @Override // defpackage.mlx
    public final synchronized mmf d(poj pojVar) {
        if (this.b) {
            return mmf.b();
        }
        poi poiVar = (poi) pojVar.g().get(0);
        poi poiVar2 = (poi) pojVar.g().get(1);
        poi poiVar3 = (poi) pojVar.g().get(2);
        int iC = pojVar.c();
        int iB = pojVar.b();
        rwc rwcVar = this.h;
        float[] fArr = new float[5];
        float[] fArrD = rwcVar.h() ? rwcVar.c().d(pojVar.d()) : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        HardwareBuffer hardwareBufferF = pojVar.f();
        try {
            int iUpdateRoi = RoiTrackerNative.updateRoi(this.c, 0, 1.0f, iC, iB, poiVar.getBuffer(), poiVar.getPixelStride(), poiVar.getRowStride(), poiVar2.getBuffer(), poiVar2.getPixelStride(), poiVar2.getRowStride(), poiVar3.getBuffer(), poiVar3.getPixelStride(), poiVar3.getRowStride(), fArrD, hardwareBufferF, fArr, ((Boolean) this.j.dL()).booleanValue(), pojVar.a());
            if (hardwareBufferF != null) {
                hardwareBufferF.close();
            }
            float f = fArr[0];
            float f2 = iC;
            float f3 = f / f2;
            float f4 = fArr[1];
            float f5 = iB;
            float f6 = f4 / f5;
            float f7 = f + fArr[2];
            float f8 = f4 + fArr[3];
            float f9 = fArr[4];
            int i = this.g;
            long j = this.c;
            this.g = i + (RoiTrackerNative.getIsRefresherCalled(j) ? 1 : 0);
            mme mmeVarA = mmf.a();
            mmeVarA.d(new RectF(f3, f6, (f7 - 1.0f) / f2, (f8 - 1.0f) / f5));
            mmeVarA.b(f9);
            mmeVarA.e(mmi.a(iUpdateRoi));
            mmeVarA.g(mly.a(RoiTrackerNative.getCurrentTrackerIndex(j)));
            mmeVarA.c(this.g);
            mmeVarA.f((pojVar.d() - this.f) / 1000000);
            return mmeVarA.a();
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, mmb] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, mmb] */
    @Override // defpackage.mlx
    public final synchronized mmf c(poj pojVar, PointF pointF) {
        if (this.b) {
            ((sgt) a.c().M(4930)).s("Cannot start tracking: tracker is closed");
            return mmf.b();
        }
        this.f = pojVar.d();
        this.g = 0;
        rwc rwcVar = this.i;
        Object objC = rwcVar.h() ? rwcVar.c() : mly.OPTICAL_FLOW;
        rwc rwcVar2 = this.h;
        if (rwcVar2.h()) {
            if (!rwcVar2.c().c(new pas(pojVar.c(), pojVar.b()), pojVar.d())) {
                ((sgt) a.c().M(4929)).s(OPuAVreQM.bGewdBCcjPhEV);
            }
            if (rwcVar2.c().b()) {
                objC = mly.GYRO;
            }
        }
        poi poiVar = (poi) pojVar.g().get(0);
        poi poiVar2 = (poi) pojVar.g().get(1);
        poi poiVar3 = (poi) pojVar.g().get(2);
        int iC = pojVar.c();
        int iB = pojVar.b();
        float f = iC;
        float f2 = iB;
        float[] fArr = {(pointF.x * f) - 5.0f, (pointF.y * f2) - 5.0f, 11.0f, 11.0f};
        HardwareBuffer hardwareBufferF = pojVar.f();
        try {
            int iStartTracking = RoiTrackerNative.startTracking(this.c, true, ((mly) objC).ordinal(), 0, 1.0f, iC, iB, poiVar.getBuffer(), poiVar.getPixelStride(), poiVar.getRowStride(), poiVar2.getBuffer(), poiVar2.getPixelStride(), poiVar2.getRowStride(), poiVar3.getBuffer(), poiVar3.getPixelStride(), poiVar3.getRowStride(), hardwareBufferF, fArr, ((Boolean) this.j.dL()).booleanValue(), pojVar.a());
            if (hardwareBufferF != null) {
                hardwareBufferF.close();
            }
            float f3 = fArr[0];
            float f4 = f3 / f;
            float f5 = fArr[1];
            float f6 = f5 / f2;
            float f7 = f3 + fArr[2];
            float f8 = f5 + fArr[3];
            int i = this.g;
            long j = this.c;
            this.g = i + (RoiTrackerNative.getIsRefresherCalled(j) ? 1 : 0);
            mme mmeVarA = mmf.a();
            mmeVarA.d(new RectF(f4, f6, (f7 - 1.0f) / f, (f8 - 1.0f) / f2));
            mmeVarA.b(1.0f);
            mmeVarA.e(mmi.a(iStartTracking));
            mmeVarA.g(mly.a(RoiTrackerNative.getCurrentTrackerIndex(j)));
            mmeVarA.c(this.g);
            mmeVarA.f(0L);
            return mmeVarA.a();
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [sgt, shi] */
    public mlo(rwc rwcVar, rwc rwcVar2, boolean z, String str, String str2, boolean z2, Context context, owf owfVar) {
        String absolutePath;
        boolean z3;
        int fd;
        long startOffset;
        long length;
        int fd2;
        long startOffset2;
        long length2;
        this.h = rwcVar;
        this.i = rwcVar2;
        this.j = owfVar;
        Object objC = rwcVar2.h() ? rwcVar2.c() : mly.OPTICAL_FLOW;
        if (context != null) {
            absolutePath = context.getCacheDir().getAbsolutePath();
        } else {
            absolutePath = "";
        }
        String str3 = absolutePath;
        boolean zA = z2 ? GxpUtils.a() : false;
        if (!z) {
            z3 = z;
        } else {
            if (!rnt.V(str) && !rnt.V(str2) && context != null) {
                try {
                    this.d = context.getAssets().openFd(str);
                    this.e = context.getAssets().openFd(str2);
                    fd = this.d.getParcelFileDescriptor().getFd();
                    try {
                        startOffset = this.d.getStartOffset();
                        try {
                            length = this.d.getLength();
                            try {
                                fd2 = this.e.getParcelFileDescriptor().getFd();
                                try {
                                    startOffset2 = this.e.getStartOffset();
                                    try {
                                        length2 = this.e.getLength();
                                        z3 = z;
                                    } catch (IOException e) {
                                        e = e;
                                        ((sgt) ((sgt) a.b().i(e)).M((char) 4926)).s("Unable to load model from path.");
                                        z3 = false;
                                        length2 = 0;
                                        this.c = RoiTrackerNative.createHandle(context, str3, ((mly) objC).ordinal(), z3, fd, startOffset, length, fd2, startOffset2, length2, zA);
                                        this.f = 0L;
                                        this.g = 0;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    startOffset2 = 0;
                                    ((sgt) ((sgt) a.b().i(e)).M((char) 4926)).s("Unable to load model from path.");
                                    z3 = false;
                                    length2 = 0;
                                    this.c = RoiTrackerNative.createHandle(context, str3, ((mly) objC).ordinal(), z3, fd, startOffset, length, fd2, startOffset2, length2, zA);
                                    this.f = 0L;
                                    this.g = 0;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                fd2 = 0;
                                startOffset2 = 0;
                                ((sgt) ((sgt) a.b().i(e)).M((char) 4926)).s("Unable to load model from path.");
                                z3 = false;
                                length2 = 0;
                                this.c = RoiTrackerNative.createHandle(context, str3, ((mly) objC).ordinal(), z3, fd, startOffset, length, fd2, startOffset2, length2, zA);
                                this.f = 0L;
                                this.g = 0;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            length = 0;
                            fd2 = 0;
                            startOffset2 = 0;
                            ((sgt) ((sgt) a.b().i(e)).M((char) 4926)).s("Unable to load model from path.");
                            z3 = false;
                            length2 = 0;
                            this.c = RoiTrackerNative.createHandle(context, str3, ((mly) objC).ordinal(), z3, fd, startOffset, length, fd2, startOffset2, length2, zA);
                            this.f = 0L;
                            this.g = 0;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        startOffset = 0;
                        length = 0;
                        fd2 = 0;
                        startOffset2 = 0;
                        ((sgt) ((sgt) a.b().i(e)).M((char) 4926)).s("Unable to load model from path.");
                        z3 = false;
                        length2 = 0;
                        this.c = RoiTrackerNative.createHandle(context, str3, ((mly) objC).ordinal(), z3, fd, startOffset, length, fd2, startOffset2, length2, zA);
                        this.f = 0L;
                        this.g = 0;
                    }
                } catch (IOException e6) {
                    e = e6;
                    fd = 0;
                }
                this.c = RoiTrackerNative.createHandle(context, str3, ((mly) objC).ordinal(), z3, fd, startOffset, length, fd2, startOffset2, length2, zA);
                this.f = 0L;
                this.g = 0;
            }
            z3 = false;
        }
        fd = 0;
        startOffset = 0;
        length = 0;
        fd2 = 0;
        startOffset2 = 0;
        length2 = 0;
        this.c = RoiTrackerNative.createHandle(context, str3, ((mly) objC).ordinal(), z3, fd, startOffset, length, fd2, startOffset2, length2, zA);
        this.f = 0L;
        this.g = 0;
    }
}
