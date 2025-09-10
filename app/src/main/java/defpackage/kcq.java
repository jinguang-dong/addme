package defpackage;

import com.pairip.VMRunner;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kcq {
    public static final sgv a = sgv.g("kcq");
    public final hkk A;
    public final gtm B;
    private final gnt D;
    private final pbn E;
    private final iso F;
    public final hzs e;
    public final out f;
    public final owq j;
    public final mky m;
    public final int n;
    public ite p;
    public lsc q;
    public mkv r;
    public mlc s;
    public double t;
    public int u;
    public szh w;
    public final hbj y;
    public final hbp z;
    public final AtomicLong b = new AtomicLong(0);
    public final AtomicLong c = new AtomicLong(0);
    private final AtomicLong C = new AtomicLong(0);
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final Object g = new Object();
    public final Object h = new Object();
    public final Object i = new Object();
    public final Set k = ujp.ak();
    public final Set l = ujp.ak();
    public final ArrayList o = new ArrayList();
    public int x = 2;
    public boolean v = false;

    public kcq(gnt gntVar, hzs hzsVar, iso isoVar, owq owqVar, hbj hbjVar, hkk hkkVar, hbp hbpVar, mky mkyVar, gtm gtmVar, out outVar, pbn pbnVar) {
        this.D = gntVar;
        this.e = hzsVar;
        this.F = isoVar;
        this.j = owqVar;
        this.n = ((Integer) hbjVar.a(haw.b).get()).intValue();
        this.A = hkkVar;
        this.z = hbpVar;
        this.m = mkyVar;
        this.B = gtmVar;
        this.f = outVar;
        this.y = hbjVar;
        this.E = pbnVar;
    }

    public void a(long j, pkf pkfVar, poe poeVar, pjr pjrVar) {
        VMRunner.invoke("Q2faNGX67goTMnvi", new Object[]{this, Long.valueOf(j), pkfVar, poeVar, pjrVar});
    }

    public final void b() {
        synchronized (this.i) {
            Set set = this.l;
            set.size();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.e.l(((kcr) it.next()).a);
            }
            Set set2 = this.k;
            set2.size();
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                this.e.l(((kcr) it2.next()).a);
            }
            set.clear();
            set2.clear();
        }
        this.j.a(Double.valueOf(this.t));
        ite iteVar = this.p;
        iteVar.getClass();
        ske.W(iteVar.a(), new oyq(this, 1), sxo.a);
        synchronized (this.h) {
            ArrayList arrayList = this.o;
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                mlc mlcVar = this.s;
                Iterator it3 = arrayList.iterator();
                a.I(it3.hasNext());
                double dDoubleValue = ((Number) it3.next()).doubleValue();
                long j = 1;
                while (it3.hasNext()) {
                    double dDoubleValue2 = ((Number) it3.next()).doubleValue();
                    j++;
                    if (rkf.h(dDoubleValue2) && rkf.h(dDoubleValue)) {
                        dDoubleValue += (dDoubleValue2 - dDoubleValue) / j;
                    } else if (rup.x(dDoubleValue)) {
                        dDoubleValue = dDoubleValue2;
                    } else if (!rup.x(dDoubleValue2) && dDoubleValue != dDoubleValue2) {
                        dDoubleValue = Double.NaN;
                    }
                }
                long j2 = (long) dDoubleValue;
                long jLongValue = ((Long) ujp.aQ(arrayList)).longValue();
                long jLongValue2 = ((Long) arrayList.get((int) (arrayList.size() * 0.95d))).longValue();
                synchronized (mlcVar.b) {
                    mlcVar.r = j2;
                    mlcVar.s = jLongValue;
                    mlcVar.t = jLongValue2;
                }
                this.o.clear();
            }
        }
        this.d.clear();
        mlc mlcVar2 = this.s;
        AtomicLong atomicLong = this.C;
        float f = atomicLong.get() / (atomicLong.get() + this.b.get());
        synchronized (mlcVar2.b) {
            mlcVar2.u = f;
        }
        this.b.set(0L);
        this.c.set(0L);
        this.C.set(0L);
    }
}
