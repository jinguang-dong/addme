package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class poy {
    public final ppj a;
    public final sbk b;
    public boolean c;
    private final ppz d;
    private final pqm e;
    private final pbn f;
    private final ppu g;
    private final Set h = new HashSet();
    private final Set i = new HashSet();
    private final Set j = new HashSet();
    private final ppa k;
    private final pox l;
    private final long m;
    private final long n;
    private pos o;
    private final ppg p;
    private final qaq q;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    public poy(ppz ppzVar, ppj ppjVar, qaq qaqVar, pqm pqmVar, pbn pbnVar, qqq qqqVar, ppu ppuVar, ppg ppgVar, String str, long j, long j2) {
        int i = sbp.d;
        this.b = new sbk();
        ppa ppaVar = new ppa();
        ppaVar.d = "";
        ppaVar.a(sex.a);
        ppaVar.b(1);
        this.k = ppaVar;
        this.d = ppzVar;
        this.a = ppjVar;
        this.q = qaqVar;
        this.e = pqmVar;
        this.f = pbnVar;
        this.g = ppuVar;
        this.p = ppgVar;
        this.m = j;
        this.n = j2;
        AtomicInteger atomicInteger = pox.a;
        pox poxVar = new pox(pox.a.getAndIncrement());
        this.l = poxVar;
        synchronized (qqqVar.d) {
            qqqVar.c.put(poxVar, false);
        }
        ppaVar.a = poxVar;
        ppaVar.d = str;
        ppaVar.b = j;
        ppaVar.j = ppuVar;
        ppaVar.c = j2;
        ppaVar.k = (byte) 3;
    }

    public final synchronized void a() {
        rnt.O(!this.c, "Cannot modify the group after publish() or abandon(): %s", this.l);
        this.c = true;
        String strConcat = toString().concat("#abandon");
        pbn pbnVar = this.f;
        pbnVar.f(strConcat);
        ppd ppdVar = new ppd();
        ppdVar.e = this.k;
        ppdVar.b = this.h;
        ppdVar.c = this.i;
        ppdVar.d = this.j;
        ppdVar.b(this.b.g());
        this.p.b(ppdVar.a());
        pbnVar.g();
    }

    public final synchronized void b() {
        rnt.O(!this.c, "Cannot modify the group after publish() or abandon(): %s", this.l);
        this.c = true;
        String strConcat = toString().concat("#close");
        pbn pbnVar = this.f;
        pbnVar.f(strConcat);
        ppd ppdVar = new ppd();
        ppdVar.e = this.k;
        ppdVar.b = this.h;
        ppdVar.c = this.i;
        ppdVar.d = this.j;
        ppdVar.b(this.b.g());
        pos posVar = this.o;
        if (posVar != null) {
            ppdVar.a = posVar;
        }
        this.p.f(ppdVar.a());
        pbnVar.g();
    }

    public final synchronized void c(pos posVar) {
        rnt.O(!this.c, "Cannot modify the group after publish() or abandon(): %s", this.l);
        this.o = posVar;
    }

    public final String toString() {
        return this.l.toString();
    }

    public final pos d(int i, ppx ppxVar, String str, String str2) {
        rnt.M(!this.c, yoGAhrpjU.TMuHdlOebckSm);
        pbn pbnVar = this.f;
        pbnVar.f("MediaGroup#create");
        ppn ppnVar = new ppn(this.d, this.q, this.g, this.p, this.m, this.n, SystemClock.elapsedRealtimeNanos(), i, ppxVar, str, str2, pbnVar);
        int i2 = i - 1;
        if (i2 == 1) {
            this.i.add(ppnVar);
        } else if (i2 != 2) {
            this.h.add(ppnVar);
        } else {
            this.j.add(ppnVar);
        }
        pbnVar.g();
        return ppnVar;
    }
}
