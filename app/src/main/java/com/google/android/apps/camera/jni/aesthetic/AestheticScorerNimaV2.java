package com.google.android.apps.camera.jni.aesthetic;

import defpackage.inq;
import defpackage.paw;
import defpackage.sgt;
import defpackage.sgv;
import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AestheticScorerNimaV2 implements inq {
    private static final sgv a = sgv.g("com.google.android.apps.camera.jni.aesthetic.AestheticScorerNimaV2");
    private long b;
    private final AtomicBoolean c = new AtomicBoolean(true);

    /* JADX WARN: Type inference failed for: r1v3, types: [sgt, shi] */
    static {
        try {
            paw.a(AestheticScorerNimaV2.class, "gcastartup");
        } catch (UnsatisfiedLinkError e) {
            if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                throw e;
            }
            ((sgt) ((sgt) a.c().i(e)).M((char) 2169)).s("Ignoring loading native library for non-android environments.");
        }
    }

    private native void nativeClose(long j);

    private static native long nativeLoad(boolean z);

    private native float nativeScoreYUV(long j, int i, int i2, float f, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float[] fArr);

    @Override // defpackage.inq
    public final float a(int i, int i2, float f, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float[] fArr) {
        if (this.c.get()) {
            return 0.0f;
        }
        return nativeScoreYUV(this.b, i, i2, f, buffer, i3, i4, buffer2, i5, i6, buffer3, i7, i8, fArr);
    }

    @Override // defpackage.inq
    public final void b() {
        if (this.c.getAndSet(true)) {
            return;
        }
        nativeClose(this.b);
    }

    @Override // defpackage.inq
    public final void c(boolean z) {
        if (this.c.getAndSet(false)) {
            this.b = nativeLoad(z);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            b();
        } finally {
            super.finalize();
        }
    }
}
