package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpv {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final long k;
    public bpv l;
    private List m;
    private boolean n;
    private boolean o;

    public bpv(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = 0L;
        this.n = z3;
        this.o = z3;
    }

    public final List a() {
        List list = this.m;
        return list == null ? ufw.a : list;
    }

    public final void b() {
        bpv bpvVar = this.l;
        if (bpvVar != null) {
            bpvVar.b();
        } else {
            this.n = true;
            this.o = true;
        }
    }

    public final boolean c() {
        bpv bpvVar = this.l;
        return bpvVar != null ? bpvVar.c() : this.n || this.o;
    }

    public /* synthetic */ bpv(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.m = list;
        this.k = j7;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) bpu.a(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) bkf.c(this.c)) + ", pressed=" + this.d + PJGqOKsIpSdZ.RfGnSfFmbZSmKd + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + ((Object) bkf.c(this.g)) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + ((Object) bqe.a(this.i)) + ", historical=" + a() + ",scrollDelta=" + ((Object) bkf.c(this.j)) + ')';
    }
}
