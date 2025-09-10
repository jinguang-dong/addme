package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tm implements up {
    public final und a;
    public ta c;
    private final wb e;
    private final ti f;
    private final py g;
    private final una h;
    private final una i;
    private vi m;
    private tj n;
    private Map o;
    private Map p;
    private boolean r;
    private Map t;
    private final cey v;
    private final int j = tn.a.b();
    public final Object b = new Object();
    private final umb k = new umb(false, umc.a);
    private final Map l = DesugarCollections.synchronizedMap(new HashMap());
    public int d = 1;
    private final CountDownLatch q = new CountDownLatch(1);
    private final CountDownLatch s = new CountDownLatch(1);
    private final Map u = new LinkedHashMap();

    public tm(wb wbVar, ti tiVar, cey ceyVar, py pyVar, una unaVar, una unaVar2, und undVar) {
        this.e = wbVar;
        this.f = tiVar;
        this.v = ceyVar;
        this.g = pyVar;
        this.h = unaVar;
        this.i = unaVar2;
        this.a = undVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, rg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(defpackage.sz r9) {
        /*
            r8 = this;
            java.lang.Object r1 = r8.b
            monitor-enter(r1)
            int r0 = r8.d     // Catch: java.lang.Throwable -> Lb9
            r2 = 4
            if (r0 == r2) goto Lb7
            r2 = 5
            if (r0 != r2) goto Ld
            goto Lb7
        Ld:
            tj r0 = r8.n     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L47
            if (r9 == 0) goto L47
            cey r0 = r8.v     // Catch: java.lang.Throwable -> Lb9
            java.util.Map r5 = r8.l     // Catch: java.lang.Throwable -> Lb9
            r5.getClass()     // Catch: java.lang.Throwable -> Lb9
            sr r2 = new sr     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r3 = r0.c     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r4 = r0.b     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r6 = r0.d     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> Lb9
            sx r0 = (defpackage.sx) r0     // Catch: java.lang.Throwable -> Lb9
            ut r0 = r0.b     // Catch: java.lang.Throwable -> Lb9
            pl r4 = (defpackage.pl) r4     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = r4.a     // Catch: java.lang.Throwable -> Lb9
            sm r0 = r0.c(r4)     // Catch: java.lang.Throwable -> Lb9
            boolean r7 = defpackage.byi.bD(r0)     // Catch: java.lang.Throwable -> Lb9
            r4 = r3
            qrh r4 = (defpackage.qrh) r4     // Catch: java.lang.Throwable -> Lb9
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb9
            tj r0 = new tj     // Catch: java.lang.Throwable -> Lb9
            wi r9 = new wi     // Catch: java.lang.Throwable -> Lb9
            r9.<init>(r2)     // Catch: java.lang.Throwable -> Lb9
            r0.<init>(r3, r9, r2)     // Catch: java.lang.Throwable -> Lb9
            r8.n = r0     // Catch: java.lang.Throwable -> Lb9
        L47:
            int r9 = r8.d     // Catch: java.lang.Throwable -> Lb9
            r2 = 3
            if (r9 != r2) goto Lb5
            if (r0 != 0) goto L4f
            goto Lb5
        L4f:
            java.util.Map r9 = r8.o     // Catch: java.lang.Throwable -> Lb9
            r3 = 1
            r4 = 0
            if (r9 == 0) goto L5b
            java.util.Map r9 = r8.p     // Catch: java.lang.Throwable -> Lb9
            if (r9 == 0) goto L5b
            r9 = r3
            goto L5c
        L5b:
            r9 = r4
        L5c:
            monitor-exit(r1)
            if (r9 == 0) goto L62
            r8.c(r4)
        L62:
            java.lang.Object r9 = r8.b
            monitor-enter(r9)
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lb1
            vi r1 = r8.m     // Catch: java.lang.Throwable -> Lb1
            r1.getClass()     // Catch: java.lang.Throwable -> Lb1
            long r6 = r1.a     // Catch: java.lang.Throwable -> Lb1
            long r4 = r4 - r6
            r8.toString()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = "%."
            java.lang.String r6 = "f ms"
            java.lang.String r1 = defpackage.a.bE(r2, r1, r6)     // Catch: java.lang.Throwable -> Lb1
            double r4 = (double) r4     // Catch: java.lang.Throwable -> Lb1
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r6
            java.lang.Double r2 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: java.lang.Throwable -> Lb1
            r3 = 0
            java.lang.String r1 = java.lang.String.format(r3, r1, r2)     // Catch: java.lang.Throwable -> Lb1
            r1.getClass()     // Catch: java.lang.Throwable -> Lb1
            wb r8 = r8.e     // Catch: java.lang.Throwable -> Lb1
            wi r0 = r0.b     // Catch: java.lang.Throwable -> Lb1
            java.util.Objects.toString(r8)     // Catch: java.lang.Throwable -> Lb1
            qf r1 = defpackage.qf.a     // Catch: java.lang.Throwable -> Lb1
            r2 = r8
            wh r2 = (defpackage.wh) r2     // Catch: java.lang.Throwable -> Lb1
            utl r2 = r2.c     // Catch: java.lang.Throwable -> Lb1
            r2.e(r1)     // Catch: java.lang.Throwable -> Lb1
            wh r8 = (defpackage.wh) r8     // Catch: java.lang.Throwable -> Lb1
            wg r8 = r8.b     // Catch: java.lang.Throwable -> Lb1
            r8.h(r0)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r9)
            return
        Lb1:
            r0 = move-exception
            r8 = r0
            monitor-exit(r9)
            throw r8
        Lb5:
            monitor-exit(r1)
            return
        Lb7:
            monitor-exit(r1)
            return
        Lb9:
            r0 = move-exception
            r8 = r0
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.l(sz):void");
    }

    public final void a(Map map) {
        AutoCloseable autoCloseable;
        Surface surface;
        synchronized (this.b) {
            int i = this.d;
            if (i != 4 && i != 5) {
                Map map2 = this.t;
                if (map2 == null) {
                    map2 = ufx.a;
                }
                Set setBQ = ske.bQ(map2.values());
                Set setBQ2 = ske.bQ(map.values());
                Iterator it = ske.aY(setBQ, setBQ2).iterator();
                do {
                    autoCloseable = null;
                    if (it.hasNext()) {
                        surface = (Surface) it.next();
                        AutoCloseable autoCloseable2 = (AutoCloseable) this.u.remove(surface);
                        if (autoCloseable2 != null) {
                            a.ae(autoCloseable2);
                            autoCloseable = autoCloseable2;
                        }
                    } else {
                        for (Surface surface2 : ske.aY(setBQ2, setBQ)) {
                            this.u.put(surface2, this.g.a(surface2));
                        }
                        this.t = map;
                        Map map3 = this.o;
                        if (map3 != null && this.p == null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                if (map3.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (linkedHashMap.size() == map3.size()) {
                                this.p = linkedHashMap;
                                ukc.C(this.a, null, 0, new vl(this, (uhb) null, 1), 3);
                            }
                        }
                        ukc.C(this.a, null, 0, new tk(this, (uhb) null, 0), 3);
                    }
                } while (autoCloseable != null);
                throw new IllegalStateException(a.bz(surface, "Surface ", " doesn't have a matching surface token!"));
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            int i = this.d;
            if (i != 4 && i != 5) {
                this.d = 4;
                tj tjVar = this.n;
                if (tjVar != null) {
                    this.n = null;
                } else {
                    tjVar = null;
                }
                if (tjVar != null) {
                    toString();
                    toString();
                    Trace.beginSection(toString().concat("#shutdown"));
                    wb wbVar = this.e;
                    Objects.toString(wbVar);
                    Trace.beginSection(wbVar.toString().concat("#onGraphStopped"));
                    wbVar.c();
                    Trace.endSection();
                    und undVar = vh.a;
                    if (((ufg) vh.a(this.h, this.i, 2000L, new tl(this, tjVar.b, (uhb) null, 0))) == null) {
                        Log.e("CXCP", "Failed to abort captures in 2000ms");
                    }
                    toString();
                    Trace.beginSection(toString().concat("#disconnect"));
                    tjVar.c.a();
                    Trace.endSection();
                    Trace.endSection();
                } else {
                    wb wbVar2 = this.e;
                    Objects.toString(wbVar2);
                    Trace.beginSection(wbVar2.toString().concat("#onGraphStopped"));
                    wbVar2.c();
                    Trace.endSection();
                }
                this.q.countDown();
            }
        }
    }

    public final void d(long j) throws Exception {
        List listBN;
        if (j != 0) {
            ukc.C(this.a, null, 0, new ahr(j, this, (uhb) null, 1), 3);
            return;
        }
        toString();
        synchronized (this.b) {
            Map map = this.u;
            listBN = ske.bN(map.values());
            map.clear();
        }
        Iterator it = listBN.iterator();
        while (it.hasNext()) {
            a.ae((AutoCloseable) it.next());
        }
    }

    public final void e(sz szVar) {
        toString();
        toString();
        Trace.beginSection(toString().concat("#configure"));
        l(szVar);
        this.s.countDown();
        Trace.endSection();
    }

    @Override // defpackage.up
    public final void f() {
        toString();
        toString();
        Trace.beginSection(toString().concat("#onSessionDisconnected"));
        b();
        toString();
        try {
            Trace.beginSection(toString().concat("#onSessionDisconnected Await"));
            this.q.await();
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    public final void h() throws Exception {
        boolean z;
        long j;
        b();
        synchronized (this.b) {
            z = false;
            j = 0;
            if (this.d != 5) {
                if (this.c == null || !this.r || a.p(0, 1)) {
                    z = true;
                } else if (a.p(0, 2)) {
                    j = 2000;
                    z = true;
                }
            }
            this.c = null;
            this.d = 5;
        }
        if (z) {
            d(j);
        }
    }

    public final void i() {
        LinkedHashMap linkedHashMap;
        synchronized (this.b) {
            if (this.d != 1) {
                return;
            }
            Map map = this.t;
            ta taVar = this.c;
            if (map == null || taVar == null) {
                return;
            }
            this.d = 2;
            this.r = true;
            this.m = new vi(SystemClock.elapsedRealtimeNanos());
            Objects.toString(pp.a(taVar.d()));
            toString();
            Objects.toString(map);
            try {
                Trace.beginSection("CameraDevice-" + taVar.d() + "#createCaptureSession");
                Map mapA = this.f.a(taVar, map, this);
                Trace.endSection();
                synchronized (this.b) {
                    int i = this.d;
                    if (i != 4 && i != 5) {
                        if (i != 2) {
                            throw new IllegalStateException("Unexpected state: " + ((Object) byi.bv(this.d)));
                        }
                        this.d = 3;
                        this.l.putAll(map);
                        if (!mapA.isEmpty()) {
                            toString();
                            Objects.toString(ske.bN(map.keySet()));
                            Objects.toString(ske.bN(mapA.keySet()));
                            this.o = mapA;
                            Map map2 = this.t;
                            if (map2 != null) {
                                linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : map2.entrySet()) {
                                    if (mapA.containsKey(entry.getKey())) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            if (linkedHashMap != null && linkedHashMap.size() == mapA.size()) {
                                this.p = linkedHashMap;
                            }
                        }
                        l(null);
                        return;
                    }
                    toString();
                    Objects.toString(byi.bv(this.d));
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void j() throws Exception {
        toString();
        toString();
        Trace.beginSection(toString().concat("#onClosed"));
        h();
        this.s.countDown();
        Trace.endSection();
    }

    public final void k() throws Exception {
        toString();
        Log.w("CXCP", toString().concat(" Configuration Failed"));
        toString();
        Trace.beginSection(toString().concat("#onConfigureFailed"));
        h();
        this.s.countDown();
        Trace.endSection();
    }

    public final String toString() {
        return "CaptureSessionState-" + this.j;
    }

    public final void c(boolean z) {
        tj tjVar;
        Map map;
        Map map2;
        boolean z2;
        synchronized (this.b) {
            tjVar = this.n;
            map = this.o;
            map2 = this.p;
        }
        if (tjVar == null || map == null || map2 == null) {
            return;
        }
        toString();
        Trace.beginSection(toString().concat("#finalizeOutputConfigurations"));
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : map.entrySet()) {
            int i = ((rh) entry.getKey()).a;
            sa saVar = (sa) entry.getValue();
            Object obj = map2.get(new rh(i));
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            saVar.a((Surface) obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((sa) ((Map.Entry) it.next()).getValue());
        }
        tjVar.a.i(ske.bN(linkedHashSet));
        synchronized (this.b) {
            if (this.d == 3) {
                this.l.putAll(map2);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                ArrayList arrayList = new ArrayList(map.size());
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add(new rh(((rh) ((Map.Entry) it2.next()).getKey()).a));
                }
                arrayList.toString();
                toString();
                z2 = true;
                String.format(null, a.bE(3, "%.", pAAtrB.iqP), Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)).getClass();
            } else {
                z2 = false;
            }
        }
        if (z2 && z) {
            wb wbVar = this.e;
            Objects.toString(wbVar);
            ((wh) wbVar).b.d();
        }
        Trace.endSection();
    }

    @Override // defpackage.up
    public final void g() throws Exception {
        if (this.k.d(false, true)) {
            toString();
            toString();
            Trace.beginSection(toString().concat(mNLbzhCxd.cBrKIm));
            h();
            d(0L);
            Trace.endSection();
        }
    }
}
