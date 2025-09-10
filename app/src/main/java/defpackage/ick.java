package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ick {
    public final boolean a;
    public final long b;
    public final float c;
    public final boolean d;
    public final boolean e;

    public ick() {
        throw null;
    }

    public static ick a() {
        return new ick(false, SystemClock.elapsedRealtimeNanos(), -999.0f, false, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ick) {
            ick ickVar = (ick) obj;
            if (this.a == ickVar.a && this.b == ickVar.b) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(ickVar.c) && this.d == ickVar.d && this.e == ickVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        long j = this.b;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + "}";
    }

    public ick(boolean z, long j, float f, boolean z2, boolean z3) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = z2;
        this.e = z3;
    }
}
