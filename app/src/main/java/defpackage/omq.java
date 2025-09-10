package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class omq extends oix {
    public static final Parcelable.Creator CREATOR = new okg(17);
    LocationRequest a;

    public omq(LocationRequest locationRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WorkSource workSource;
        oma omaVar = new oma(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ohn ohnVar = (ohn) it.next();
                    ojn.a(workSource, ohnVar.a, ohnVar.b);
                }
            }
            omaVar.m = workSource;
        }
        if (z) {
            omaVar.a(1);
        }
        if (z2) {
            omaVar.c(2);
        }
        if (z3) {
            omaVar.l = true;
        }
        if (z4) {
            omaVar.h = true;
        }
        if (j != Long.MAX_VALUE) {
            omaVar.b(j);
        }
        int i = omaVar.a;
        long j2 = omaVar.b;
        long jMin = omaVar.c;
        if (jMin == -1) {
            jMin = j2;
        } else if (i != 105) {
            jMin = Math.min(jMin, j2);
        }
        long jMax = Math.max(omaVar.d, omaVar.b);
        long j3 = omaVar.e;
        int i2 = omaVar.f;
        float f = omaVar.g;
        boolean z5 = omaVar.h;
        long j4 = omaVar.i;
        this.a = new LocationRequest(i, j2, jMin, jMax, Long.MAX_VALUE, j3, i2, f, z5, j4 == -1 ? omaVar.b : j4, omaVar.j, omaVar.k, omaVar.l, new WorkSource(omaVar.m), omaVar.n);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof omq) {
            return a.K(this.a, ((omq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.I(parcel, 1, this.a, i);
        ojl.w(parcel, iU);
    }
}
