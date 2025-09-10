package defpackage;

import com.google.googlex.gcam.BurstSpec;
import j$.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ldx implements hzi, iac, iam {
    private final HashMap a = new HashMap();
    private final pbn b;
    private final iso c;

    public ldx(iso isoVar, pbn pbnVar) {
        this.c = isoVar;
        this.b = pbnVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final synchronized void a(ltd ltdVar) {
        iby ibyVar;
        Iterator it = this.a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                ibyVar = null;
                break;
            } else {
                ibyVar = (iby) it.next();
                if (ibyVar.x.b.l().equals(ltdVar)) {
                    break;
                }
            }
        }
        if (ibyVar != null) {
            g(ibyVar);
        }
    }

    @Override // defpackage.hzi
    public synchronized void b(iby ibyVar, lau lauVar) {
        ibyVar.a();
        HashMap map = this.a;
        if (map.containsKey(ibyVar)) {
            poj pojVarS = lauVar.s();
            pdo pdoVarB = lauVar.b();
            if (pdoVarB != null) {
                ((HashMap) map.get(ibyVar)).put(Long.valueOf(pdoVarB.b), pojVarS);
            } else {
                ibyVar.a();
            }
        }
        lauVar.close();
    }

    @Override // defpackage.hzi
    public synchronized void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        this.a.put(ibyVar, new HashMap());
    }

    @Override // defpackage.iac
    public final void f(iby ibyVar, int i, long j, poe poeVar) {
        HashMap map;
        poj pojVar;
        ibyVar.a();
        new HashMap();
        synchronized (this) {
            HashMap map2 = this.a;
            if (!map2.containsKey(ibyVar)) {
                throw new IllegalStateException("Shot hasn't been started yet!");
            }
            ibyVar.a();
            map = (HashMap) map2.remove(ibyVar);
        }
        pbn pbnVar = this.b;
        pbnVar.f("onBaseFrameSelected#getCandidate");
        if (map != null) {
            Long lValueOf = Long.valueOf(j);
            if (!map.containsKey(lValueOf) || (pojVar = (poj) map.remove(lValueOf)) == null) {
                ibyVar.a();
            } else {
                pbnVar.h("processBaseFrameImage");
                h(ibyVar, pojVar, j);
            }
        } else {
            ibyVar.a();
        }
        pbnVar.h("clear");
        if (map != null) {
            Map.EL.forEach(map, new ldw(1));
            map.clear();
        }
        pbnVar.g();
    }

    protected synchronized void g(iby ibyVar) {
        HashMap map = (HashMap) this.a.remove(ibyVar);
        if (map != null) {
            Map.EL.forEach(map, new ldw(0));
            map.clear();
        }
    }

    protected abstract void h(iby ibyVar, poj pojVar, long j);

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        ibz ibzVarF = this.c.f(ltdVar);
        ibzVarF.a(new ldv(this, 0));
        ibzVarF.f(this);
    }

    @Override // defpackage.iam
    public final synchronized void m(iby ibyVar) {
        g(ibyVar);
    }

    @Override // defpackage.iam
    public final void p(iby ibyVar, iag iagVar) {
        g(ibyVar);
    }

    @Override // defpackage.hzi
    public final /* synthetic */ void e(iby ibyVar) {
    }

    @Override // defpackage.hzi
    public final void d(iby ibyVar, BurstSpec burstSpec) {
    }

    @Override // defpackage.iam
    public /* synthetic */ void o(iby ibyVar, mdr mdrVar) {
    }
}
