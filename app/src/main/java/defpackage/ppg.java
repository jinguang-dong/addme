package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ppg {
    public final pbn a;
    public final rqi b;
    private final ScheduledExecutorService c;
    private final ppj d;
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private Set g;
    private Set h;
    private Set i;
    private pos j;
    private ppa k;
    private ScheduledFuture l;
    private sbp m;
    private boolean n;
    private boolean o;
    private int p;

    public ppg(ScheduledExecutorService scheduledExecutorService, rqi rqiVar, ppj ppjVar, pbn pbnVar) {
        int i = sbp.d;
        this.m = sex.a;
        this.n = false;
        this.o = false;
        this.p = 1;
        this.c = scheduledExecutorService;
        this.b = rqiVar;
        this.d = ppjVar;
        this.a = pbnVar;
    }

    private final synchronized void g() {
        if (this.l != null || this.n) {
            return;
        }
        this.l = this.c.schedule(new oze(this, 4), this.d.s, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if ((r3.e.size() + r3.f.size()) == ((r3.g.size() + r3.h.size()) + r3.i.size())) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void h() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.o     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L5a
            ppa r0 = r3.k     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5a
            java.util.Set r0 = r3.g     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5a
            java.util.Set r0 = r3.h     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5a
            java.util.Set r0 = r3.i     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5a
            boolean r0 = r3.n     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L3c
            java.util.List r0 = r3.e     // Catch: java.lang.Throwable -> L5c
            java.util.List r1 = r3.f     // Catch: java.lang.Throwable -> L5c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L5c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 + r1
            java.util.Set r1 = r3.g     // Catch: java.lang.Throwable -> L5c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5c
            java.util.Set r2 = r3.h     // Catch: java.lang.Throwable -> L5c
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5c
            int r1 = r1 + r2
            java.util.Set r2 = r3.i     // Catch: java.lang.Throwable -> L5c
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5c
            int r1 = r1 + r2
            if (r0 != r1) goto L5a
        L3c:
            r0 = 1
            r3.o = r0     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.ScheduledFuture r0 = r3.l     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L4a
            r1 = 0
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L5c
            r0 = 0
            r3.l = r0     // Catch: java.lang.Throwable -> L5c
        L4a:
            ppb r0 = r3.a()     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.ScheduledExecutorService r1 = r3.c     // Catch: java.lang.Throwable -> L5c
            ppf r2 = new ppf     // Catch: java.lang.Throwable -> L5c
            r2.<init>()     // Catch: java.lang.Throwable -> L5c
            r1.execute(r2)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r3)
            return
        L5a:
            monitor-exit(r3)
            return
        L5c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppg.h():void");
    }

    final synchronized ppb a() {
        ppa ppaVar;
        pox poxVar;
        String str;
        scn scnVar;
        scn scnVar2;
        scn scnVar3;
        int i;
        sbp sbpVar;
        ppu ppuVar;
        Set set = this.g;
        set.getClass();
        Set set2 = this.h;
        set2.getClass();
        ppaVar = this.k;
        ppaVar.getClass();
        scl sclVar = new scl();
        scl sclVar2 = new scl();
        scl sclVar3 = new scl();
        for (ppn ppnVar : this.e) {
            if (set.contains(ppnVar)) {
                if (ppnVar.a() <= 0) {
                    Log.e("MediaGroupPublisher", mn.i(ppnVar, "Refusing to publish ", " because the file is empty."));
                    ppw ppwVarL = ppnVar.l();
                    if (ppwVarL != null) {
                        sclVar3.d(ppwVarL);
                    }
                } else {
                    pou pouVarK = ppnVar.k();
                    if (ppnVar == this.j) {
                        ppaVar.e = pouVarK;
                    }
                    sclVar.d(pouVarK);
                }
            } else if (!set2.contains(ppnVar)) {
                ppw ppwVarL2 = ppnVar.l();
                if (ppwVarL2 != null) {
                    sclVar3.d(ppwVarL2);
                }
            } else if (ppnVar.a() <= 0) {
                Log.e("MediaGroupPublisher", mn.i(ppnVar, "Refusing to publish ", " because the file is empty."));
                ppw ppwVarL3 = ppnVar.l();
                if (ppwVarL3 != null) {
                    sclVar3.d(ppwVarL3);
                }
            } else {
                pou pouVarK2 = ppnVar.k();
                if (ppnVar == this.j) {
                    ppaVar.e = pouVarK2;
                }
                sclVar2.d(pouVarK2);
            }
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ppw ppwVarL4 = ((ppn) it.next()).l();
            if (ppwVarL4 != null) {
                sclVar3.d(ppwVarL4);
            }
        }
        scn scnVarG = sclVar.g();
        scnVarG.getClass();
        ppaVar.f = scnVarG;
        scn scnVarG2 = sclVar2.g();
        scnVarG2.getClass();
        ppaVar.g = scnVarG2;
        scn scnVarG3 = sclVar3.g();
        scnVarG3.getClass();
        ppaVar.h = scnVarG3;
        ppaVar.a(this.m);
        ppaVar.b(this.p);
        if (ppaVar.k != 3 || (poxVar = ppaVar.a) == null || (str = ppaVar.d) == null || (scnVar = ppaVar.f) == null || (scnVar2 = ppaVar.g) == null || (scnVar3 = ppaVar.h) == null || (i = ppaVar.l) == 0 || (sbpVar = ppaVar.i) == null || (ppuVar = ppaVar.j) == null) {
            throw new IllegalStateException();
        }
        return new ppb(poxVar, ppaVar.b, ppaVar.c, str, ppaVar.e, scnVar, scnVar2, scnVar3, i, sbpVar, ppuVar);
    }

    public final synchronized void b(ppe ppeVar) {
        rnt.L(this.k == null);
        this.k = ppeVar.e;
        sfd sfdVar = sfd.a;
        this.g = sfdVar;
        this.h = sfdVar;
        this.m = ppeVar.f;
        this.p = 3;
        HashSet hashSet = new HashSet(ppeVar.d);
        hashSet.addAll(ppeVar.b);
        hashSet.addAll(ppeVar.c);
        this.i = hashSet;
        g();
        h();
    }

    public final synchronized void c(ppn ppnVar) {
        this.f.add(ppnVar);
        h();
    }

    public final synchronized void d(ppn ppnVar) {
        this.e.add(ppnVar);
        h();
    }

    public final synchronized void e() {
        HashSet hashSet = new HashSet();
        Set set = this.g;
        set.getClass();
        hashSet.addAll(set);
        Set set2 = this.h;
        set2.getClass();
        hashSet.addAll(set2);
        Set set3 = this.i;
        set3.getClass();
        hashSet.addAll(set3);
        hashSet.removeAll(this.e);
        hashSet.removeAll(this.f);
        Locale locale = Locale.ROOT;
        ppa ppaVar = this.k;
        ppaVar.getClass();
        pox poxVar = ppaVar.a;
        if (poxVar == null) {
            throw new IllegalStateException();
        }
        Log.w("MediaGroupPublisher", String.format(locale, "Failed to publish MediaGroup-%s after %s ms. Forcibly publishing, and ignoring %s files that are neither published nor abandoned: %s.", poxVar, Long.valueOf(this.d.s), Integer.valueOf(hashSet.size()), hashSet));
        sbp sbpVar = this.m;
        int i = ((sex) sbpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((pow) sbpVar.get(i2)).d();
        }
        this.n = true;
        h();
    }

    public final synchronized void f(ppe ppeVar) {
        rnt.L(this.k == null);
        this.k = ppeVar.e;
        this.j = ppeVar.a;
        this.g = ppeVar.b;
        this.h = ppeVar.c;
        this.i = scn.F(ppeVar.d);
        this.m = ppeVar.f;
        this.p = 2;
        g();
        h();
    }
}
