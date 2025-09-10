package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqr {
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public bqr(float f, float f2, long j, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bqr)) {
            return false;
        }
        bqr bqrVar = (bqr) obj;
        return bqrVar.a == this.a && bqrVar.b == this.b && bqrVar.c == this.c && bqrVar.d == this.d;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + a.r(this.c)) * 31) + this.d;
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + HHdu.dGw + this.d + ')';
    }
}
