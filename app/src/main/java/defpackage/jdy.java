package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdy {
    public boolean a = true;
    private long b;
    private double c;

    public final double a() {
        if (this.a) {
            return 1.0d;
        }
        double dMin = Math.min(this.c, (SystemClock.elapsedRealtimeNanos() - this.b) / 1.0E9d) / this.c;
        if (Math.abs((-1.0d) + dMin) < 1.0E-4d) {
            this.a = true;
        }
        return 1.0d - Math.exp(dMin * (-6.5d));
    }

    public final void b() {
        this.b = SystemClock.elapsedRealtimeNanos();
        this.c = 0.7d;
        this.a = false;
    }
}
