package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.jni.eis.EisNative;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obv {
    public long a;

    public obv() {
    }

    public final void a() {
        this.a = 0L;
    }

    public final void b() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final boolean c(long j) {
        return this.a == 0 || SystemClock.elapsedRealtime() - this.a > j;
    }

    public final synchronized int d() {
        long j;
        j = this.a;
        if (j == 0) {
            throw new IllegalStateException("getNumStrips() called on a released EisNativeWrapper.");
        }
        return EisNative.getNumStrips(j);
    }

    public final synchronized void e() {
        long j = this.a;
        if (j == 0) {
            throw new IllegalStateException("release() called on a released EisNativeWrapper.");
        }
        EisNative.releaseHandle(j);
        this.a = 0L;
    }

    public final synchronized void f(int i, int i2) {
        long j = this.a;
        if (j == 0) {
            throw new IllegalStateException("setActiveArraySize() called on a released EisNativeWrapper.");
        }
        EisNative.setActiveArraySize(j, i, i2);
    }

    public final synchronized void g(int i, int i2) {
        long j = this.a;
        if (j == 0) {
            throw new IllegalStateException("setCropWindowSize() called on a released EisNativeWrapper.");
        }
        EisNative.setCropWindowSize(j, i, i2);
    }

    public final synchronized boolean h(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, int i2, boolean z, boolean z2, float f, float f2, float f3, float f4, float f5, float f6, int i3, int i4, int i5, float[] fArr) {
        long j9;
        j9 = this.a;
        if (j9 == 0) {
            throw new IllegalStateException("getTransformBetweenFrames() called on a released EisNativeWrapper.");
        }
        return EisNative.getTransformBetweenFrames(j9, j, j2, j3, j4, j5, j6, j7, j8, i, i2, z, z2, f, f2, f3, f4, f5, f6, i3, i4, i5, fArr);
    }

    public final synchronized void i(float f, float f2, float f3, long j) {
        long j2 = this.a;
        if (j2 == 0) {
            throw new IllegalStateException("processGyro() called on a released EisNativeWrapper.");
        }
        EisNative.processGyro(j2, f, f2, f3, j);
    }

    public final synchronized void j(float f, float f2, long j, int i) {
        long j2 = this.a;
        if (j2 == 0) {
            throw new IllegalStateException("processLensOffset() called on a released EisNativeWrapper.");
        }
        EisNative.processLensOffset(j2, f, f2, j, i);
    }

    public final synchronized void k() {
        long j = this.a;
        if (j == 0) {
            throw new IllegalStateException("setStabilizationStrength() called on a released EisNativeWrapper.");
        }
        EisNative.setStabilizationStrength(j, 1.0f);
    }

    public final synchronized long l(int i, int i2, long j, long j2, long j3, long j4, float f, float f2, float[] fArr, int i3, boolean z) {
        long j5;
        j5 = this.a;
        if (j5 == 0) {
            throw new IllegalStateException("processFrame() called on a released EisNativeWrapper.");
        }
        return EisNative.processFrame(j5, null, i, i2, j, j2, j3, j4, f, 1.0f, f2, true, 0L, null, null, fArr, i3, z);
    }

    public obv(inr inrVar, int i, int i2, boolean z, String str) {
        this.a = EisNative.createHandle(inrVar.e, i, i2, 0.5f, z, -1, str, 0, "");
    }

    public obv(inr inrVar, int i, int i2, boolean z, String str, int i3, String str2) {
        this.a = EisNative.createHandle(inrVar.e, i, i2, 0.5f, z, -1, str, i3, str2);
    }
}
