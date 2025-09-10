package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rp {
    public final long a;
    public final pk b;
    public final Throwable c;
    public final int d;

    public /* synthetic */ rp(int i, pk pkVar, Throwable th, int i2) {
        long jElapsedRealtimeNanos = (i2 & 2) != 0 ? SystemClock.elapsedRealtimeNanos() : 0L;
        pkVar = (i2 & 4) != 0 ? null : pkVar;
        th = (i2 & 8) != 0 ? null : th;
        this.d = i;
        this.a = jElapsedRealtimeNanos;
        this.b = pkVar;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp)) {
            return false;
        }
        rp rpVar = (rp) obj;
        return this.d == rpVar.d && a.q(this.a, rpVar.a) && a.ao(this.b, rpVar.b) && a.ao(this.c, rpVar.c);
    }

    public final int hashCode() {
        int i = this.d;
        a.aQ(i);
        pk pkVar = this.b;
        int i2 = pkVar == null ? 0 : pkVar.a;
        long j = this.a;
        int i3 = i * 31;
        Throwable th = this.c;
        return ((((i3 + a.r(j)) * 31) + i2) * 31) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingInfo(reason=" + ((Object) kk.g(this.d)) + ", closingTimestamp=" + ((Object) vi.a(this.a)) + GdpuLBytnYW.lflQpClbdFzScbd + this.b + ", exception=" + this.c + ')';
    }
}
