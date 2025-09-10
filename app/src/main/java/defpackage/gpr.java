package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpr {
    public final long a;
    public final String b;
    public final Runnable c;
    public final Drawable d;
    public final rwc e;
    public final int f;
    public final int g;
    public final rwc h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;

    public gpr() {
        throw null;
    }

    public static gpq a() {
        gpq gpqVar = new gpq((byte[]) null);
        gpqVar.f = 1;
        gpqVar.b(0);
        gpqVar.c(0);
        gpqVar.e(false);
        gpqVar.b = new fij(6);
        return gpqVar;
    }

    public final boolean equals(Object obj) {
        String str;
        Runnable runnable;
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpr) {
            gpr gprVar = (gpr) obj;
            if (this.a == gprVar.a && ((str = this.b) != null ? str.equals(gprVar.b) : gprVar.b == null) && ((runnable = this.c) != null ? runnable.equals(gprVar.c) : gprVar.c == null) && ((drawable = this.d) != null ? drawable.equals(gprVar.d) : gprVar.d == null)) {
                int i = this.k;
                int i2 = gprVar.k;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.l;
                    int i4 = gprVar.l;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.e.equals(gprVar.e) && this.f == gprVar.f && this.g == gprVar.g && this.h.equals(gprVar.h) && this.i == gprVar.i && this.j == gprVar.j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.a;
        Runnable runnable = this.c;
        int iHashCode2 = runnable == null ? 0 : runnable.hashCode();
        int i = iHashCode ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
        Drawable drawable = this.d;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (drawable != null ? drawable.hashCode() : 0)) * 1000003;
        int i2 = this.k;
        a.aF(i2);
        int i3 = (iHashCode3 ^ i2) * 1000003;
        int i4 = this.l;
        a.aF(i4);
        int iHashCode4 = (((((((((((i3 ^ i4) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
        long j2 = this.j;
        return ((int) (j2 ^ (j2 >>> 32))) ^ iHashCode4;
    }

    public final String toString() {
        int i = this.k;
        Drawable drawable = this.d;
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(drawable);
        String str = "null";
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "DISMISS" : "LAUNCH_DRIVE" : "INTENT" : "LAUNCH_LENS";
        int i2 = this.l;
        if (i2 == 1) {
            str = "UNKNOWN";
        } else if (i2 == 2) {
            str = "BARCODE";
        } else if (i2 == 3) {
            str = "SCAN_DOCUMENT";
        }
        String str3 = this.b;
        long j = this.a;
        rwc rwcVar = this.e;
        int i3 = this.f;
        int i4 = this.g;
        rwc rwcVar2 = this.h;
        boolean z = this.i;
        long j2 = this.j;
        return "{" + j + ", " + str3 + ", " + strValueOf + ", " + strValueOf2 + ", " + str2 + ", " + str + ", " + String.valueOf(rwcVar) + ", " + i3 + ", " + i4 + ", " + String.valueOf(rwcVar2) + ", " + z + ", " + j2 + "}";
    }

    public gpr(long j, String str, Runnable runnable, Drawable drawable, int i, int i2, rwc rwcVar, int i3, int i4, rwc rwcVar2, boolean z, long j2) {
        this.a = j;
        this.b = str;
        this.c = runnable;
        this.d = drawable;
        this.k = i;
        this.l = i2;
        this.e = rwcVar;
        this.f = i3;
        this.g = i4;
        this.h = rwcVar2;
        this.i = z;
        this.j = j2;
    }
}
