package defpackage;

import android.util.Range;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpq {
    private final Range a;
    private final Duration b;
    private final Duration c;
    private final Duration d;
    private long e = -1;
    private long f = -1;
    private int g = 0;
    private int h = 0;
    private boolean i = false;

    public lpq(Range range, Duration duration, Duration duration2, Duration duration3) {
        this.a = range;
        this.b = duration;
        this.d = duration3;
        this.c = duration2;
    }

    public final synchronized void a(float f, long j) {
        if (this.e >= 0 && this.a.contains((Range) Float.valueOf(f))) {
            this.g = Math.min(this.g + 1, 5);
            this.h = 0;
            this.f = j;
            return;
        }
        this.e = j;
        this.g = 0;
        this.h = Math.min(this.h + 1, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean b(long r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.g     // Catch: java.lang.Throwable -> L59
            r1 = 5
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L2c
            long r4 = r8.e     // Catch: java.lang.Throwable -> L59
            long r4 = r9 - r4
            j$.time.Duration r0 = r8.b     // Catch: java.lang.Throwable -> L59
            long r6 = r0.toNanos()     // Catch: java.lang.Throwable -> L59
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L2c
            long r4 = r8.f     // Catch: java.lang.Throwable -> L59
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L2c
            long r4 = r9 - r4
            j$.time.Duration r0 = r8.d     // Catch: java.lang.Throwable -> L59
            long r6 = r0.toNanos()     // Catch: java.lang.Throwable -> L59
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L2c
            r0 = r2
            goto L2d
        L2c:
            r0 = r3
        L2d:
            if (r0 != 0) goto L55
            boolean r4 = r8.i     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L55
            int r0 = r8.h     // Catch: java.lang.Throwable -> L59
            if (r0 < r1) goto L53
            long r0 = r8.f     // Catch: java.lang.Throwable -> L59
            long r0 = r9 - r0
            j$.time.Duration r4 = r8.c     // Catch: java.lang.Throwable -> L59
            long r4 = r4.toNanos()     // Catch: java.lang.Throwable -> L59
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L53
            long r0 = r8.e     // Catch: java.lang.Throwable -> L59
            long r9 = r9 - r0
            j$.time.Duration r0 = r8.d     // Catch: java.lang.Throwable -> L59
            long r0 = r0.toNanos()     // Catch: java.lang.Throwable -> L59
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L53
            r3 = r2
        L53:
            r0 = r3 ^ 1
        L55:
            r8.i = r0     // Catch: java.lang.Throwable -> L59
            monitor-exit(r8)
            return r0
        L59:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpq.b(long):boolean");
    }
}
