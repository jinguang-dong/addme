package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gkt {
    public static final sgv a = sgv.g("gkt");
    public final lnr c;
    private final lob f;
    public final List b = new ArrayList();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    private long g = 0;

    public gkt(lob lobVar, lnr lnrVar) {
        this.f = lobVar;
        this.c = lnrVar;
    }

    public final void a() {
        b();
        this.b.clear();
        this.d.clear();
        this.e.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        r4 = r0.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (r4 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r3.b >= r4.b) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r3 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b() {
        /*
            r9 = this;
            monitor-enter(r9)
            lob r0 = r9.f     // Catch: java.lang.Throwable -> L49
            long r1 = r9.g     // Catch: java.lang.Throwable -> L49
            r3 = 0
        L6:
            hmy r4 = r0.a     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = r4.a     // Catch: java.lang.Throwable -> L49
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L49
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L15
            goto L18
        L15:
            r6 = 1
            long r6 = r6 + r1
        L18:
            int r1 = r4.c(r6)     // Catch: java.lang.Throwable -> L46
            if (r1 < 0) goto L37
            long r1 = r4.g(r1)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            lnx r4 = r0.a(r1)     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L34
            if (r3 == 0) goto L33
            float r5 = r4.b     // Catch: java.lang.Throwable -> L49
            float r6 = r3.b     // Catch: java.lang.Throwable -> L49
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto L34
        L33:
            r3 = r4
        L34:
            r9.g = r1     // Catch: java.lang.Throwable -> L49
            goto L6
        L37:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L3f
            java.util.List r0 = r9.b     // Catch: java.lang.Throwable -> L49
            r0.add(r3)     // Catch: java.lang.Throwable -> L49
        L3f:
            java.util.List r0 = r9.b     // Catch: java.lang.Throwable -> L49
            r0.size()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r9)
            return
        L46:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L49
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkt.b():void");
    }
}
