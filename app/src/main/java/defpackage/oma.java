package defpackage;

import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oma {
    public int a;
    public final long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public float g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public boolean l;
    public WorkSource m;
    public olo n;

    public oma(LocationRequest locationRequest) {
        int i = locationRequest.a;
        long j = locationRequest.b;
        this.a = 102;
        this.c = -1L;
        this.d = 0L;
        this.e = Long.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0.0f;
        boolean z = true;
        this.h = true;
        this.i = -1L;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.m = null;
        this.n = null;
        ojl.aq(j >= 0, "intervalMillis must be greater than or equal to 0");
        this.b = j;
        lpa.t(i);
        this.a = i;
        long j2 = locationRequest.c;
        ojl.aq(j2 == -1 || j2 >= 0, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
        this.c = j2;
        long j3 = locationRequest.d;
        ojl.aq(j3 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
        this.d = j3;
        long j4 = locationRequest.e;
        ojl.aq(j4 > 0, "durationMillis must be greater than 0");
        this.e = j4;
        int i2 = locationRequest.f;
        ojl.aq(i2 > 0, "maxUpdates must be greater than 0");
        this.f = i2;
        float f = locationRequest.g;
        ojl.aq(f >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
        this.g = f;
        this.h = locationRequest.h;
        b(locationRequest.i);
        a(locationRequest.j);
        c(locationRequest.k);
        this.l = locationRequest.l;
        this.m = locationRequest.m;
        olo oloVar = locationRequest.n;
        if (oloVar != null && oloVar.a()) {
            z = false;
        }
        a.I(z);
        this.n = oloVar;
    }

    public final void a(int i) {
        int i2;
        boolean z = true;
        if (i == 0 || i == 1) {
            i2 = i;
        } else {
            i2 = 2;
            if (i == 2) {
                i = 2;
            } else {
                z = false;
                i2 = i;
            }
        }
        ojl.ar(z, zflNUOOzDfM.snyBgcFPMqkIB, Integer.valueOf(i));
        this.j = i2;
    }

    public final void b(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        ojl.aq(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        this.i = j;
    }

    public final void c(int i) {
        int i2;
        boolean z = true;
        if (i == 0 || i == 1) {
            i2 = i;
        } else {
            i2 = 2;
            if (i == 2) {
                i = 2;
            } else {
                z = false;
                i2 = i;
            }
        }
        ojl.ar(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
        this.k = i2;
    }
}
