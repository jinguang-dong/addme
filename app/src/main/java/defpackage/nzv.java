package defpackage;

import android.content.IntentFilter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzv {
    public static final /* synthetic */ int j = 0;
    private static final scn k = scn.H("http", "https");
    public final Executor a;
    public final IdentityHashMap b = new IdentityHashMap();
    public final Queue c = new ArrayDeque();
    public final List d = new ArrayList();
    public final Map e = new HashMap();
    public final Object f = new Object();
    public final Set g = new HashSet();
    public int h = 0;
    public final nzy i;
    private final sbv l;
    private final int m;
    private final nza n;

    public nzv(nzs nzsVar) {
        sbv sbvVarM = sbv.m(nzsVar.a);
        rnt.B(!sbvVarM.isEmpty(), "Must have at least one UrlEngine");
        rnt.B(nzsVar.b != null, "Must set a callback executor");
        rnt.B(nzsVar.d != null, "Must set a logger");
        rnt.B(nzsVar.e != null, "Must set a connectivity handler");
        this.l = sbvVarM;
        this.a = nzsVar.b;
        this.i = nzsVar.d;
        this.n = nzsVar.e;
        this.m = nzsVar.c;
    }

    private final void f(nzt nztVar) {
        this.c.add(nztVar);
        nztVar.b.c(new nzq(this, nztVar, 4), sxo.a);
        d();
    }

    public final syu a(nzl nzlVar) {
        synchronized (this.f) {
            Map map = this.e;
            rdf rdfVar = nzlVar.f;
            nzo nzoVar = (nzo) map.get(rdfVar);
            if (nzoVar != null) {
                return swz.j(nzoVar.f, new kjl(this, nzlVar, 7, null), this.a);
            }
            oaa oaaVar = (oaa) this.l.get(nzlVar.a.getScheme());
            oaaVar.getClass();
            nzo nzoVar2 = new nzo(this.i, nzlVar, oaaVar, this.a);
            map.put(rdfVar, nzoVar2);
            nzoVar2.f.c(new lqd((Object) this, (Object) nzlVar, (Object) nzoVar2, 14, (byte[]) null), sxo.a);
            return ske.M(nzoVar2);
        }
    }

    public final void b() {
        syu syuVarT;
        while (true) {
            synchronized (this.f) {
                Set set = this.g;
                if (set.size() >= this.m) {
                    return;
                }
                nzt nztVar = (nzt) this.c.poll();
                if (nztVar == null) {
                    return;
                }
                nzl nzlVar = nztVar.a;
                int i = 1;
                if (k.contains(nzlVar.a.getScheme())) {
                    nza nzaVar = this.n;
                    nzh nzhVar = nzlVar.c;
                    if (nzaVar.a(nzhVar)) {
                        syuVarT = syq.a;
                    } else {
                        syv syvVar = new syv(new ire(4));
                        nyz nyzVar = new nyz(nzaVar, nzhVar, syvVar);
                        nzaVar.b.registerReceiver(nyzVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        syvVar.c(new nzq(nzaVar, nyzVar, i), sxo.a);
                        syuVarT = ske.T(syvVar, nzaVar.d, TimeUnit.MILLISECONDS, nzaVar.c);
                    }
                } else {
                    syuVarT = syq.a;
                }
                if (syuVarT.isDone()) {
                    set.add(nzlVar.f);
                    nztVar.c.c(new nzq(this, nzlVar, 0), this.a);
                    d();
                    nztVar.b.run();
                } else {
                    this.h++;
                    ntd ntdVar = new ntd(this, 15);
                    sxo sxoVar = sxo.a;
                    syuVarT.c(ntdVar, sxoVar);
                    d();
                    ske.W(syuVarT, new fpc((Object) this, (Object) nztVar, 12, (byte[]) null), this.a);
                    nztVar.b.c(new nzq(this, syuVarT, 2, (byte[]) null), sxoVar);
                }
            }
        }
    }

    public final void c(nzt nztVar) {
        synchronized (this.f) {
            f(nztVar);
        }
        b();
    }

    public final void d() {
        nzu nzuVar = new nzu(this.g.size(), this.c.size(), this.h);
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new nzq(entry, nzuVar, 3));
        }
    }

    public final syn e(nzl nzlVar, int i) {
        syu syuVarJ;
        synchronized (this.f) {
            int i2 = 6;
            syv syvVar = new syv(new ire(i2));
            syn synVarV = syn.v(syvVar);
            kjl kjlVar = new kjl(this, nzlVar, i2, null);
            Executor executor = this.a;
            syuVarJ = swf.j(swz.j(swz.j(synVarV, kjlVar, executor), new kjm(i2), executor), Exception.class, new pzv(this, nzlVar, i, 1), executor);
            f(new nzt(nzlVar, syvVar, (syn) syuVarJ));
        }
        return (syn) syuVarJ;
    }
}
