package defpackage;

import com.google.android.apps.camera.jni.gyro.GyroQueueNative;

/* compiled from: PG */
/* loaded from: classes.dex */
public class inv implements inu {
    private static final sgv a = sgv.g("inv");
    private static final float[] b = a.Y();
    private static final int[] c = {1, 0, 2};
    private static final int[] d = {1, 1, 1};
    private final Object f = new Object();
    private long h = 0;
    private final long e = GyroQueueNative.createHandle(c, d);
    private boolean g = false;

    @Override // defpackage.inu
    public final long a() {
        long j;
        synchronized (this.f) {
            j = this.h;
        }
        return j;
    }

    @Override // defpackage.inu
    public final void b(float f, float f2, float f3, long j) {
        synchronized (this.f) {
            if (!this.g && this.h < j) {
                this.h = j;
                GyroQueueNative.processAndEnqueueGyro(this.e, f, f2, f3, j);
            }
        }
    }

    @Override // defpackage.inu
    public final boolean c(long j, float f, float f2, float f3, float[] fArr) {
        System.arraycopy(b, 0, fArr, 0, 9);
        synchronized (this.f) {
            if (this.g) {
                return false;
            }
            if (GyroQueueNative.getProjectionMatrix(this.e, j, f, f2, f3, 0L, fArr)) {
                return true;
            }
            ((sgt) a.c().M(2174)).u("Projection matrix could not be computed for timestamp = %d", j);
            return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f) {
            if (this.g) {
                return;
            }
            this.g = true;
            GyroQueueNative.releaseHandle(this.e);
        }
    }

    @Override // defpackage.inu
    public final float[] d(long j, float f, float f2, float f3, long j2, float f4, float f5, float f6) {
        float[] fArrY = a.Y();
        synchronized (this.f) {
            if (this.g) {
                return fArrY;
            }
            if (!GyroQueueNative.getTransformBetweenTime(this.e, j, f, f2, f3, j2, f4, f5, f6, 0L, fArrY)) {
                ((sgt) a.c().M(2176)).A("Transformation matrix could not be computed for timestamps %d - %d", j, j2);
            }
            return fArrY;
        }
    }
}
