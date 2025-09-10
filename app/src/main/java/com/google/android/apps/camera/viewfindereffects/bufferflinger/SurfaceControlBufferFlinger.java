package com.google.android.apps.camera.viewfindereffects.bufferflinger;

import android.hardware.HardwareBuffer;
import android.view.Surface;
import defpackage.nps;
import defpackage.paw;
import defpackage.rnt;
import defpackage.rnu;
import defpackage.sgt;
import defpackage.sgv;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SurfaceControlBufferFlinger implements nps {
    public static final sgv a;
    public final Queue b = new LinkedList();
    public long c;

    static {
        paw.a(SurfaceControlBufferFlinger.class, "gcastartup");
        a = sgv.g("com.google.android.apps.camera.viewfindereffects.bufferflinger.SurfaceControlBufferFlinger");
    }

    public SurfaceControlBufferFlinger(Surface surface) {
        nativeInit();
        rnt.x(surface);
        if (!surface.isValid()) {
            ((sgt) a.b().M(5496)).s("SurfaceControlBufferFlinger constructor called with invalid Surface :(");
        }
        long jNativeCreateBufferFlinger = nativeCreateBufferFlinger(surface, "buffer-flinger");
        this.c = jNativeCreateBufferFlinger;
        if (jNativeCreateBufferFlinger == 0) {
            ((sgt) a.b().M(5495)).s("Failed to create BufferFlinger.");
        }
    }

    private static native long nativeCreateBufferFlinger(Surface surface, String str);

    public static native boolean nativeDisplayBuffer(long j, HardwareBuffer hardwareBuffer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    private static native void nativeInit();

    private static native void nativeReleaseBufferFlinger(long j);

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            long j = this.c;
            if (j == 0) {
                return;
            }
            nativeReleaseBufferFlinger(j);
            this.c = 0L;
            Queue queue = this.b;
            ArrayList arrayList = new ArrayList(queue);
            queue.clear();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((rnu) arrayList.get(i)).d();
            }
        }
    }
}
