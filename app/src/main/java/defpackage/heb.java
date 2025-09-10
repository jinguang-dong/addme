package defpackage;

import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import j$.time.Clock;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Phaser;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heb implements hem {
    static final Duration a = Duration.ofSeconds(5);
    static final Duration b = Duration.ofSeconds(2);
    public static final /* synthetic */ int k = 0;
    public final pbc d;
    public final pbn e;
    public final Clock f;
    public final Duration g;
    public final hel h;
    public final mdy j;
    private final out m;
    private final ScheduledExecutorService n;
    public final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicBoolean l = new AtomicBoolean(false);
    private final Phaser o = new Phaser(1);
    public final Map i = new HashMap();

    public heb(out outVar, pbc pbcVar, pbn pbnVar, Clock clock, Duration duration, ScheduledExecutorService scheduledExecutorService, mdy mdyVar, hel helVar) {
        this.m = outVar;
        this.d = pbcVar.a("ShotTracker");
        this.e = pbnVar;
        this.f = clock;
        this.g = duration;
        this.n = scheduledExecutorService;
        this.h = helVar;
        this.j = mdyVar;
    }

    private final void p(long j) {
        synchronized (this) {
            if (this.i.remove(Long.valueOf(j)) != null) {
                this.o.arriveAndDeregister();
            }
        }
    }

    @Override // defpackage.hem
    public final int a() {
        int size;
        synchronized (this) {
            size = this.i.size();
        }
        return size;
    }

    public final hdz b(long j) {
        hdz hdzVar;
        synchronized (this) {
            hdzVar = (hdz) this.i.get(Long.valueOf(j));
        }
        return hdzVar != null ? hdzVar : new hea(this, j);
    }

    @Override // defpackage.hem
    public final syu c(long j) {
        this.d.b(mn.h(j, "onShotPersisted "));
        syu syuVarA = b(j).a();
        p(j);
        return syuVarA;
    }

    @Override // defpackage.hem
    public final synchronized List d() {
        Stream map;
        map = Collection.EL.stream(this.i.values()).map(new gbm(6));
        int i = sbp.d;
        return (List) map.collect(ryv.a);
    }

    @Override // defpackage.hem
    public final synchronized List e() {
        Stream map;
        map = Collection.EL.stream(this.i.values()).map(new hci(3));
        int i = sbp.d;
        return (List) map.collect(ryv.a);
    }

    @Override // defpackage.hem
    public final void f() {
        TreeMap treeMap;
        if (!this.l.compareAndSet(false, true)) {
            this.d.b("oneShotCheckForLostShotsAndNotifyIfFound (requested but already done)");
            return;
        }
        this.d.f("running checkForLostShotsAndNotifyIfFound");
        Instant instant = this.f.instant();
        try {
            SortedMap sortedMap = (SortedMap) this.h.b().get();
            treeMap = new TreeMap();
            synchronized (this) {
                for (Map.Entry entry : sortedMap.entrySet()) {
                    if (!this.i.containsKey(entry.getKey())) {
                        treeMap.put((Long) entry.getKey(), (ltf) entry.getValue());
                    }
                }
            }
            for (Long l : treeMap.keySet()) {
                this.d.b(ojl.bI("marking shot %d as newly lost", l));
                this.h.g(l.longValue(), instant);
            }
        } catch (InterruptedException | ExecutionException e) {
            this.d.h("best effort failed to fetch unfinished shots: ".concat(e.toString()));
            treeMap = new TreeMap();
        }
        if (treeMap.isEmpty()) {
            return;
        }
        this.d.h(ojl.bI("Detected %d newly lost shots", Integer.valueOf(treeMap.size())));
        o((ltf) treeMap.get(treeMap.firstKey()));
    }

    @Override // defpackage.hem
    public final void g(long j, String str) {
        b(j).c(str);
    }

    @Override // defpackage.hem
    public final void h(final long j, final String str) throws Throwable {
        final ArrayList arrayList;
        final Instant instant = this.f.instant();
        synchronized (this) {
            try {
                arrayList = new ArrayList(this.i.keySet());
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        Collection.EL.removeIf(arrayList, new hdx(j, 0));
        this.n.execute(new Runnable() { // from class: hdy
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList2 = arrayList;
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                String str2 = null;
                for (int i = 0; i < size; i++) {
                    String str3 = str;
                    Instant instant2 = instant;
                    long j2 = j;
                    heb hebVar = this.a;
                    long jLongValue = ((Long) arrayList2.get(i)).longValue();
                    if (jLongValue != j2) {
                        if (str2 == null) {
                            str2 = "watchdog reset (caused by shot " + j2 + ", " + str3 + ")";
                        }
                        hebVar.b(jLongValue).d(instant2, str2);
                    } else if (arrayList2.size() > 1) {
                        hebVar.b(jLongValue).d(instant2, str3 + " (also resetting watchdog on " + (arrayList2.size() - 1) + UvOvSgfD.AgqDrBnCngi);
                    } else {
                        hebVar.b(jLongValue).d(instant2, str3);
                    }
                }
            }
        });
    }

    @Override // defpackage.hem
    public final void i(long j) {
        this.d.b(mn.h(j, "onShotCanceled "));
        b(j).j();
        p(j);
    }

    @Override // defpackage.hem
    public final void j(long j) {
        this.d.b(mn.h(j, "onShotDeleted "));
        b(j).b();
        p(j);
    }

    @Override // defpackage.hem
    public final void k(long j) {
        this.d.b(mn.h(j, "onShotFailed "));
        hdz hdzVarB = b(j);
        heb hebVar = hdzVarB.h;
        AtomicBoolean atomicBoolean = hdzVarB.e;
        Instant instant = hebVar.f.instant();
        if (atomicBoolean.compareAndSet(false, true)) {
            hebVar.h.g(hdzVarB.a, instant);
            hebVar.o(hdzVarB.b.d);
        } else {
            hdzVarB.e("failed");
        }
        hdzVarB.d(instant, "FAILED");
        p(j);
    }

    @Override // defpackage.hem
    public final void l(long j, Integer num) {
        b(j).g(num);
    }

    @Override // defpackage.hem
    public final void m(lte lteVar, Optional optional) {
        hdz hdzVar;
        this.d.b("onShotStarted " + String.valueOf(lteVar) + " " + lteVar.d.toString());
        synchronized (this) {
            Map map = this.i;
            Long lValueOf = Long.valueOf(lteVar.b);
            hdzVar = (hdz) map.get(lValueOf);
            if (hdzVar == null) {
                hdzVar = new hdz(this, lteVar, this.f.instant(), optional);
                boolean zIsEmpty = map.isEmpty();
                map.put(lValueOf, hdzVar);
                this.o.register();
                if (zIsEmpty && this.c.compareAndSet(false, true)) {
                    n(0);
                }
            } else {
                hdzVar.c("create() on a shot that already exists: ".concat(String.valueOf(String.valueOf(lteVar))));
            }
        }
        hdzVar.i();
    }

    public final void n(int i) {
        this.n.schedule(new cmu(this, i, 11, null), a.toSeconds(), TimeUnit.SECONDS);
    }

    public final void o(ltf ltfVar) {
        this.d.b("mainThread? " + out.d());
        this.m.c(new hdk(this, ltfVar, 3));
    }
}
