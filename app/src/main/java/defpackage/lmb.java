package defpackage;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lmb implements lma {
    private final lmk f;
    private final lly g;
    private final Set e = new HashSet();
    public final AtomicInteger a = new AtomicInteger(0);
    public final szh b = new szh();
    public final Object c = new Object();
    public int d = 1;

    public lmb(lly llyVar, lmk lmkVar) {
        this.g = llyVar;
        this.f = lmkVar;
    }

    public final void a() {
        Set setUnmodifiableSet;
        rnt.L(this.d == 3);
        Set<lmg> set = this.e;
        if (set.isEmpty()) {
            this.b.e(new HashSet());
            return;
        }
        lly llyVar = this.g;
        Map map = llyVar.e;
        synchronized (map) {
            Set set2 = llyVar.g;
            set2.retainAll(map.keySet());
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(set2));
        }
        HashSet hashSet = new HashSet();
        for (lmg lmgVar : set) {
            poj pojVar = lmgVar.a;
            if (pojVar != null && setUnmodifiableSet.contains(pojVar)) {
                Map map2 = llyVar.e;
                synchronized (map2) {
                    Set set3 = llyVar.g;
                    if (set3.contains(pojVar)) {
                        set3.remove(pojVar);
                        if (map2.remove(pojVar) != null) {
                            llyVar.h--;
                        }
                    }
                }
                hashSet.add(lmgVar);
            }
        }
        this.b.e(hashSet);
    }

    public final synchronized void b(lmg lmgVar, lss lssVar) {
        synchronized (this.c) {
            rnt.L(this.d == 2);
            AtomicInteger atomicInteger = this.a;
            rnt.L(atomicInteger.get() > 0);
            atomicInteger.incrementAndGet();
            this.e.add(lmgVar);
            lgc lgcVar = new lgc(this, 20);
            try {
                lly llyVar = this.g;
                lmk lmkVar = this.f;
                lmq lmqVar = new lmq(lmgVar, lmkVar.a, lmkVar.e, lmkVar.b, lssVar, lmkVar.f, lmkVar.c, lmkVar.d);
                rwc rwcVarJ = rwc.j(lgcVar);
                HashSet hashSet = new HashSet(1);
                hashSet.add(lmqVar);
                llyVar.c(lmqVar.f, hashSet, false, true, rwcVarJ);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new IllegalStateException(OPuAVreQM.zUQqmmwKQa);
            }
        }
    }

    @Override // defpackage.lma, defpackage.paq, java.lang.AutoCloseable
    public synchronized void close() {
        synchronized (this.c) {
            int i = this.d;
            boolean z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
            rnt.L(z);
            if (this.d == 3) {
                return;
            }
            this.d = 3;
            if (this.a.decrementAndGet() == 0) {
                a();
            }
        }
    }
}
