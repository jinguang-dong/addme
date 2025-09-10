package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvv {
    public static final dvv a = new dvv();
    public final ecy b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public dvv(ecy ecyVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.b = ecyVar;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.b;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !a.ao(getClass(), obj.getClass())) {
            return false;
        }
        dvv dvvVar = (dvv) obj;
        if (this.c == dvvVar.c && this.d == dvvVar.d && this.e == dvvVar.e && this.f == dvvVar.f && this.g == dvvVar.g && this.h == dvvVar.h && a.ao(a(), dvvVar.a()) && this.j == dvvVar.j) {
            return a.ao(this.i, dvvVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.j;
        a.aQ(i);
        int i2 = ((((i * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        long j = this.h;
        long j2 = this.g;
        int iHashCode = ((((((((i2 + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode();
        NetworkRequest networkRequestA = a();
        return (iHashCode * 31) + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) cpn.x(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public dvv(dvv dvvVar) {
        dvvVar.getClass();
        this.c = dvvVar.c;
        this.d = dvvVar.d;
        this.b = dvvVar.b;
        this.j = dvvVar.j;
        this.e = dvvVar.e;
        this.f = dvvVar.f;
        this.i = dvvVar.i;
        this.g = dvvVar.g;
        this.h = dvvVar.h;
    }

    public dvv() {
        ufy ufyVar = ufy.a;
        this.b = new ecy((byte[]) null);
        this.j = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = ufyVar;
    }
}
