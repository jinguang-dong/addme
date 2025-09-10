package defpackage;

import android.content.Context;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import j$.util.Collection;
import j$.util.DesugarTimeZone;
import j$.util.Optional;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lsw {
    public static final sgv a = sgv.g("lsw");
    private static final SimpleDateFormat g;
    public final long b;
    public final ltg c;
    public final Context d;
    public final String e;
    public final Optional f;
    private final rww h;
    private final hqp i;
    private String j = null;
    private final Map k = new HashMap();

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        g = simpleDateFormat;
    }

    public lsw(rww rwwVar, long j, hqp hqpVar, String str, ltg ltgVar, Optional optional, Context context) {
        this.h = rwwVar;
        this.b = j;
        this.i = hqpVar;
        this.e = str;
        gzi gziVar = gzo.a;
        this.c = ltgVar;
        this.d = context;
        this.f = optional;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x001d, B:7:0x002d, B:11:0x0038, B:14:0x003f, B:16:0x0048, B:15:0x0044, B:12:0x003b), top: B:22:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x001d, B:7:0x002d, B:11:0x0038, B:14:0x003f, B:16:0x0048, B:15:0x0044, B:12:0x003b), top: B:22:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x001d, B:7:0x002d, B:11:0x0038, B:14:0x003f, B:16:0x0048, B:15:0x0044, B:12:0x003b), top: B:22:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x001d, B:7:0x002d, B:11:0x0038, B:14:0x003f, B:16:0x0048, B:15:0x0044, B:12:0x003b), top: B:22:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized defpackage.lsu j(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r7 == 0) goto L1d
            java.util.Map r0 = r5.k     // Catch: java.lang.Throwable -> L5f
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> L5f
            j$.util.stream.Stream r1 = j$.util.Collection.EL.stream(r1)     // Catch: java.lang.Throwable -> L5f
            hzk r2 = new hzk     // Catch: java.lang.Throwable -> L5f
            r3 = 19
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r1.noneMatch(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = "Already created a primary item: %s"
            defpackage.rnt.O(r1, r2, r0)     // Catch: java.lang.Throwable -> L5f
        L1d:
            poy r0 = r5.h()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = defpackage.prh.y(r6)     // Catch: java.lang.Throwable -> L5f
            boolean r2 = defpackage.rnt.V(r1)     // Catch: java.lang.Throwable -> L5f
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L36
            ppx r2 = defpackage.ppx.DCIM     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r2.c(r1)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L36
            r4 = r3
        L36:
            if (r4 == 0) goto L3b
            ppx r1 = defpackage.ppx.DCIM     // Catch: java.lang.Throwable -> L5f
            goto L3d
        L3b:
            ppx r1 = defpackage.ppx.APP_DATA     // Catch: java.lang.Throwable -> L5f
        L3d:
            if (r4 == 0) goto L44
            ppj r2 = r0.a     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = r2.p     // Catch: java.lang.Throwable -> L5f
            goto L48
        L44:
            ppj r2 = r0.a     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = r2.o     // Catch: java.lang.Throwable -> L5f
        L48:
            pos r6 = r0.d(r3, r1, r2, r6)     // Catch: java.lang.Throwable -> L5f
            hqp r0 = r5.i     // Catch: java.lang.Throwable -> L5f
            r0.getClass()     // Catch: java.lang.Throwable -> L5f
            lsu r1 = new lsu     // Catch: java.lang.Throwable -> L5f
            r1.<init>(r5, r6, r0, r7)     // Catch: java.lang.Throwable -> L5f
            java.util.Map r6 = r5.k     // Catch: java.lang.Throwable -> L5f
            lsv r7 = defpackage.lsv.PENDING     // Catch: java.lang.Throwable -> L5f
            r6.put(r1, r7)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r5)
            return r1
        L5f:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lsw.j(java.lang.String, boolean):lsu");
    }

    private final synchronized void k() throws Throwable {
        lsw lswVar;
        lsw lswVar2;
        try {
            try {
                Map map = this.k;
                Iterator it = map.keySet().iterator();
                lsu lsuVar = null;
                lsu lsuVar2 = null;
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    lsu lsuVar3 = (lsu) it.next();
                    if (lsuVar3.d) {
                        if (lsuVar != null) {
                            z = false;
                        }
                        lswVar2 = this;
                        rnt.R(z, "Found multiple primaries (%s and %s) in %s: %s", lsuVar, lsuVar3, lswVar2, map);
                        lsuVar = lsuVar3;
                    } else {
                        lswVar2 = this;
                        if (lsuVar2 == null) {
                            if (map.get(lsuVar3) == lsv.PUBLISH) {
                                lsuVar2 = lsuVar3;
                            } else {
                                this = lswVar2;
                                lsuVar2 = null;
                            }
                        }
                    }
                    this = lswVar2;
                }
                lswVar = this;
                lsuVar.getClass();
                if (map.get(lsuVar) != lsv.PUBLISH) {
                    if (lsuVar2 == null) {
                        ((sgt) a.c().M(4419)).E("No published files found for %s: %s", lswVar, map);
                        lswVar.h().a();
                        return;
                    }
                    try {
                        FileInputStream fileInputStreamD = lsuVar2.b.d();
                        try {
                            prh.B(fileInputStreamD, lsuVar.b);
                            lsuVar.b();
                            lsuVar2.a();
                            fileInputStreamD.close();
                        } finally {
                        }
                    } catch (IOException e) {
                        ((sgt) ((sgt) a.c().i(e)).M(4418)).E("Error publishing %s: %s", lswVar, lswVar.k);
                        lswVar.h().a();
                    }
                }
                Map map2 = lswVar.k;
                for (lsu lsuVar4 : map2.keySet()) {
                    lsv lsvVar = (lsv) map2.get(lsuVar4);
                    lsvVar.getClass();
                    int iOrdinal = lsvVar.ordinal();
                    if (iOrdinal == 0) {
                        lsuVar4.b.g();
                    } else if (iOrdinal == 1 || iOrdinal == 2) {
                        lsuVar4.b.f();
                    }
                }
                lswVar.h().b();
            } catch (Throwable th) {
                th = th;
                lswVar = this;
                Throwable th2 = th;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            throw th22;
        }
    }

    private final synchronized boolean l() {
        boolean z;
        z = this.j == null;
        if (z) {
            this.j = "Ignored";
        }
        return z;
    }

    public final lsu a(String str) {
        return j(str, true);
    }

    public final lsu b(String str) {
        return j(str, false);
    }

    public final synchronized Optional c() {
        return Collection.EL.stream(this.k.keySet()).filter(new hzk(19)).findFirst();
    }

    public final synchronized void d() {
        if (l()) {
            Iterator it = this.k.keySet().iterator();
            while (it.hasNext()) {
                ((lsu) it.next()).b.f();
            }
            h().a();
        }
    }

    public final void e(pow powVar) {
        poy poyVarH = h();
        rnt.M(!poyVarH.c, "Cannot modify the listener list after publish() or abandon()");
        poyVarH.b.h(powVar);
    }

    final synchronized void f(lsu lsuVar, lsv lsvVar) {
        Map map = this.k;
        rnt.P(map.containsKey(lsuVar), "Trying to mark as published %s not contained in %s", lsuVar, map);
        map.put(lsuVar, lsvVar);
    }

    public final synchronized void g() {
        if (l()) {
            k();
        }
    }

    public final poy h() {
        return (poy) this.h.fr();
    }

    public final synchronized lsu i() {
        lsu lsuVar;
        poy poyVarH = h();
        lsuVar = new lsu(this, poyVarH.d(3, ppx.APP_CACHE, poyVarH.a.n, "mp4"), this.i, false);
        this.k.put(lsuVar, lsv.PENDING);
        return lsuVar;
    }

    public final String toString() {
        String str = this.e;
        String strConcat = rnt.V(str) ? mPfBwqXsnpXI.ETLydGNvvcn : "-".concat(String.valueOf(str));
        String strValueOf = String.valueOf(g.format(new Date(this.b)));
        hqp hqpVar = this.i;
        ltg ltgVar = this.c;
        return "PXL_".concat(strValueOf) + strConcat + " MediaGroup(" + String.valueOf(hqpVar) + ", " + String.valueOf(ltgVar) + ")";
    }
}
