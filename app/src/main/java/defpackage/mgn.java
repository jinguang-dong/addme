package defpackage;

import com.google.android.apps.camera.modeldownloader.uD.uCzt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgn {
    public static final mgn a = new mgn(-1, -1, 0, 0);
    public final long b;
    public final long c;
    private final long d;
    private final long e;

    public mgn() {
        throw null;
    }

    public final boolean a() {
        return this.e < this.b;
    }

    public final boolean b() {
        return this.d < this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgn) {
            mgn mgnVar = (mgn) obj;
            if (this.b == mgnVar.b && this.c == mgnVar.c && this.d == mgnVar.d && this.e == mgnVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.b;
        long j3 = this.e;
        int i = (int) (j ^ (j >>> 32));
        return ((int) j3) ^ ((((i ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ ((int) this.d)) * 1000003);
    }

    public mgn(long j, long j2, long j3, long j4) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final String toString() {
        return uCzt.yrpSzR + this.b + ", " + this.c + ", " + this.d + ", " + this.e + "}";
    }
}
