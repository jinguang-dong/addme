package com.google.android.apps.camera.jni.aesthetic;

import defpackage.inq;
import defpackage.paw;
import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AestheticScorerNima implements inq {
    private long a;
    private final AtomicBoolean b;

    public AestheticScorerNima() {
        paw.a(AestheticScorerNima.class, "gcastartup");
        this.b = new AtomicBoolean(true);
    }

    private native void nativeClose(long j);

    private static native long nativeLoad(Boolean bool);

    private native float nativeScoreYUV(long j, int i, int i2, float f, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float[] fArr);

    @Override // defpackage.inq
    public final float a(int i, int i2, float f, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float[] fArr) {
        if (this.b.get()) {
            return 0.0f;
        }
        return nativeScoreYUV(this.a, i, i2, f, buffer, i3, i4, buffer2, i5, i6, buffer3, i7, i8, fArr);
    }

    @Override // defpackage.inq
    public final void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        nativeClose(this.a);
    }

    @Override // defpackage.inq
    public final void c(boolean z) {
        if (this.b.getAndSet(false)) {
            this.a = nativeLoad(Boolean.valueOf(z));
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
