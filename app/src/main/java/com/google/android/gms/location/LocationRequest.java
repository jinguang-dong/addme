package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a;
import defpackage.oix;
import defpackage.ojl;
import defpackage.olo;
import defpackage.omb;
import defpackage.oms;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LocationRequest extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new omb();
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public float g;
    public boolean h;
    public long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final WorkSource m;
    public final olo n;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String c(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb = oms.a;
        synchronized (sb) {
            sb.setLength(0);
            oms.a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public final boolean a() {
        long j = this.d;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final boolean b() {
        return this.a == 105;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            boolean zA = a();
            if (this.a == locationRequest.a && ((b() || this.b == locationRequest.b) && this.c == locationRequest.c && zA == locationRequest.a() && ((!zA || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l && this.m.equals(locationRequest.m) && a.K(this.n, locationRequest.n)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.m});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.B(parcel, 2, this.b);
        ojl.B(parcel, 3, this.c);
        ojl.A(parcel, 6, this.f);
        float f = this.g;
        ojl.z(parcel, 7, 4);
        parcel.writeFloat(f);
        ojl.B(parcel, 8, this.d);
        ojl.x(parcel, 9, this.h);
        ojl.B(parcel, 10, this.e);
        ojl.B(parcel, 11, this.i);
        ojl.A(parcel, 12, this.j);
        ojl.A(parcel, 13, this.k);
        ojl.x(parcel, 15, this.l);
        ojl.I(parcel, 16, this.m, i);
        ojl.I(parcel, 17, this.n, i);
        ojl.w(parcel, iU);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, olo oloVar) {
        this.a = i;
        if (i == 105) {
            this.b = Long.MAX_VALUE;
        } else {
            this.b = j;
        }
        this.c = j2;
        this.d = j3;
        this.e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f = i2;
        this.g = f;
        this.h = z;
        this.i = j6 != -1 ? j6 : j;
        this.j = i3;
        this.k = i4;
        this.l = z2;
        this.m = workSource;
        this.n = oloVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }
}
