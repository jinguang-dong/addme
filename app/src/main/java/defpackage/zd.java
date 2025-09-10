package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zd {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final ocq g;
    private final byi h;

    public zd() {
        this(6);
    }

    public static int d(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    protected static final void e(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    private static final void f(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    public final Object a(Object obj) {
        synchronized (this.h) {
            Object obj2 = ((LinkedHashMap) this.g.a).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            r6.getClass()
            byi r0 = r4.h
            monitor-enter(r0)
            int r1 = r4.c     // Catch: java.lang.Throwable -> L93
            int r1 = r1 + 1
            r4.c = r1     // Catch: java.lang.Throwable -> L93
            int r1 = r4.b     // Catch: java.lang.Throwable -> L93
            f(r5, r6)     // Catch: java.lang.Throwable -> L93
            int r1 = r1 + 1
            r4.b = r1     // Catch: java.lang.Throwable -> L93
            ocq r1 = r4.g     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> L93
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L93
            java.lang.Object r6 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L93
            if (r6 == 0) goto L2d
            int r1 = r4.b     // Catch: java.lang.Throwable -> L93
            f(r5, r6)     // Catch: java.lang.Throwable -> L93
            int r1 = r1 + (-1)
            r4.b = r1     // Catch: java.lang.Throwable -> L93
        L2d:
            monitor-exit(r0)
            if (r6 == 0) goto L33
            e(r5, r6)
        L33:
            int r5 = r4.a
        L35:
            byi r0 = r4.h
            monitor-enter(r0)
            int r1 = r4.b     // Catch: java.lang.Throwable -> L90
            if (r1 < 0) goto L48
            ocq r1 = r4.g     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.aJ()     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L4d
            int r1 = r4.b     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L4d
        L48:
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            defpackage.a.bm(r1)     // Catch: java.lang.Throwable -> L90
        L4d:
            int r1 = r4.b     // Catch: java.lang.Throwable -> L90
            if (r1 <= r5) goto L8e
            ocq r1 = r4.g     // Catch: java.lang.Throwable -> L90
            boolean r2 = r1.aJ()     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto L5a
            goto L8e
        L5a:
            java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> L90
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> L90
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L90
            r2.getClass()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r2 = defpackage.ske.bC(r2)     // Catch: java.lang.Throwable -> L90
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto L6f
            monitor-exit(r0)
            return r6
        L6f:
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L90
            r1.aI(r3)     // Catch: java.lang.Throwable -> L90
            int r1 = r4.b     // Catch: java.lang.Throwable -> L90
            f(r3, r2)     // Catch: java.lang.Throwable -> L90
            int r1 = r1 + (-1)
            r4.b = r1     // Catch: java.lang.Throwable -> L90
            int r1 = r4.d     // Catch: java.lang.Throwable -> L90
            int r1 = r1 + 1
            r4.d = r1     // Catch: java.lang.Throwable -> L90
            monitor-exit(r0)
            e(r3, r2)
            goto L35
        L8e:
            monitor-exit(r0)
            return r6
        L90:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L93:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object c(Object obj) {
        Object objAI;
        synchronized (this.h) {
            objAI = this.g.aI(obj);
            if (objAI != null) {
                int i = this.b;
                f(obj, objAI);
                this.b = i - 1;
            }
        }
        if (objAI != null) {
            e(obj, objAI);
        }
        return objAI;
    }

    public final String toString() {
        String str;
        synchronized (this.h) {
            int i = this.e;
            int i2 = this.f + i;
            str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    public zd(int i) {
        this.a = i;
        this.g = new ocq(0, (byte[]) null, (byte[]) null);
        this.h = new byi();
    }
}
