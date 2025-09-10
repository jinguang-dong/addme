package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqx {
    public final long a;
    private final long b;

    public qqx() {
        throw null;
    }

    public static qqx a() {
        return new qqx(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qqx) {
            qqx qqxVar = (qqx) obj;
            if (this.a == qqxVar.a && this.b == qqxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public qqx(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
