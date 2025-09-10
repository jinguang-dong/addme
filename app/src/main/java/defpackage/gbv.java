package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbv {
    public final pcs a;
    public final File b;
    public final lsu c;
    public final lsw d;
    public final pas e;
    public final long f;
    public final int g;
    public final lte h;
    private final rwc i;
    private final ppo j;
    private final int k;
    private final long l;

    public gbv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gbv) {
            gbv gbvVar = (gbv) obj;
            if (this.a.equals(gbvVar.a) && this.b.equals(gbvVar.b) && this.c.equals(gbvVar.c) && this.d.equals(gbvVar.d) && this.i.equals(gbvVar.i) && this.j.equals(gbvVar.j) && this.e.equals(gbvVar.e) && this.k == gbvVar.k && this.l == gbvVar.l && this.f == gbvVar.f && this.g == gbvVar.g && this.h.equals(gbvVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.e.hashCode();
        long j = this.f;
        lte lteVar = this.h;
        long j2 = this.l;
        return ((this.g ^ (((((((iHashCode * 1000003) ^ this.k) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003)) * 1000003) ^ lteVar.hashCode();
    }

    public final String toString() {
        lte lteVar = this.h;
        pas pasVar = this.e;
        ppo ppoVar = this.j;
        rwc rwcVar = this.i;
        lsw lswVar = this.d;
        lsu lsuVar = this.c;
        File file = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(file) + ", " + String.valueOf(lsuVar) + ", " + String.valueOf(lswVar) + ", " + String.valueOf(rwcVar) + ", " + String.valueOf(ppoVar) + ", " + String.valueOf(pasVar) + ", " + this.k + ", " + this.l + ", " + this.f + ", " + this.g + ", " + String.valueOf(lteVar) + "}";
    }

    public gbv(pcs pcsVar, File file, lsu lsuVar, lsw lswVar, rwc rwcVar, ppo ppoVar, pas pasVar, int i, long j, long j2, int i2, lte lteVar) {
        this.a = pcsVar;
        this.b = file;
        this.c = lsuVar;
        this.d = lswVar;
        this.i = rwcVar;
        this.j = ppoVar;
        this.e = pasVar;
        this.k = i;
        this.l = j;
        this.f = j2;
        this.g = i2;
        this.h = lteVar;
    }
}
