package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.wear.ambient.AmbientLifecycleObserver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyx implements dxl, dzs, dwy {
    Boolean a;
    private final Context b;
    private final dyw d;
    private boolean e;
    private final dxj h;
    private final dvs i;
    private final dyy k;
    private final ebn l;
    private final ejs m;
    private final gga n;
    private final Map c = new HashMap();
    private final Object f = new Object();
    private final dxo g = cpo.o();
    private final Map j = new HashMap();

    static {
        dwj.a("GreedyScheduler");
    }

    public dyx(Context context, dvs dvsVar, hkk hkkVar, dxj dxjVar, ebn ebnVar, gga ggaVar) {
        this.b = context;
        ejs ejsVar = dvsVar.f;
        this.d = new dyw(this, ejsVar);
        this.k = new dyy(ejsVar, ebnVar);
        this.n = ggaVar;
        this.m = new ejs(hkkVar);
        this.i = dvsVar;
        this.h = dxjVar;
        this.l = ebnVar;
    }

    private final void f() {
        this.a = Boolean.valueOf(eda.a(this.b, this.i));
    }

    private final void g() {
        if (this.e) {
            return;
        }
        this.h.a(this);
        this.e = true;
    }

    @Override // defpackage.dwy
    public final void a(ebm ebmVar, boolean z) {
        uol uolVar;
        ejs ejsVarC = this.g.c(ebmVar);
        if (ejsVarC != null) {
            this.k.a(ejsVarC);
        }
        synchronized (this.f) {
            uolVar = (uol) this.c.remove(ebmVar);
        }
        if (uolVar != null) {
            dwj.b();
            Objects.toString(ebmVar);
            uolVar.s(null);
        }
        if (z) {
            return;
        }
        synchronized (this.f) {
            this.j.remove(ebmVar);
        }
    }

    @Override // defpackage.dxl
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            dwj.b();
            return;
        }
        g();
        dwj.b();
        dyw dywVar = this.d;
        if (dywVar != null && (runnable = (Runnable) dywVar.b.remove(str)) != null) {
            dywVar.c.g(runnable);
        }
        for (ejs ejsVar : this.g.a(str)) {
            this.k.a(ejsVar);
            cpo.p(this.l, ejsVar);
        }
    }

    @Override // defpackage.dxl
    public final void c(ebx... ebxVarArr) {
        long jMax;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            dwj.b();
            return;
        }
        g();
        HashSet<ebx> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ebx ebxVar : ebxVarArr) {
            ebm ebmVarA = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A(ebxVar);
            dxo dxoVar = this.g;
            if (!dxoVar.b(ebmVarA)) {
                synchronized (this.f) {
                    ebm ebmVarA2 = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A(ebxVar);
                    Map map = this.j;
                    qec qecVar = (qec) map.get(ebmVarA2);
                    if (qecVar == null) {
                        int i = ebxVar.k;
                        cpn cpnVar = this.i.g;
                        qecVar = new qec(i, System.currentTimeMillis());
                        map.put(ebmVarA2, qecVar);
                    }
                    jMax = qecVar.a + (Math.max((ebxVar.k - qecVar.b) - 5, 0) * 30000);
                }
                long jMax2 = Math.max(ebxVar.a(), jMax);
                cpn cpnVar2 = this.i.g;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (ebxVar.x == 1) {
                    if (jCurrentTimeMillis < jMax2) {
                        dyw dywVar = this.d;
                        if (dywVar != null) {
                            String str = ebxVar.b;
                            Map map2 = dywVar.b;
                            Runnable runnable = (Runnable) map2.remove(str);
                            if (runnable != null) {
                                dywVar.c.g(runnable);
                            }
                            at atVar = new at(dywVar, ebxVar, 20, (char[]) null);
                            map2.put(str, atVar);
                            dywVar.c.h(jMax2 - System.currentTimeMillis(), atVar);
                        }
                    } else if (ebxVar.b()) {
                        dvv dvvVar = ebxVar.j;
                        if (dvvVar.d) {
                            dwj.b();
                            Objects.toString(ebxVar);
                        } else if (dvvVar.b()) {
                            dwj.b();
                            Objects.toString(ebxVar);
                        } else {
                            hashSet.add(ebxVar);
                            hashSet2.add(ebxVar.b);
                        }
                    } else if (!dxoVar.b(AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A(ebxVar))) {
                        dwj.b();
                        String str2 = ebxVar.b;
                        ejs ejsVarE = dxoVar.e(ebxVar);
                        this.k.b(ejsVarE);
                        this.l.b(ejsVarE);
                    }
                }
            }
        }
        synchronized (this.f) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet2);
                dwj.b();
                for (ebx ebxVar2 : hashSet) {
                    ebm ebmVarA3 = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A(ebxVar2);
                    Map map3 = this.c;
                    if (!map3.containsKey(ebmVarA3)) {
                        map3.put(ebmVarA3, dzx.a(this.m, ebxVar2, (una) this.n.d, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.dxl
    public final boolean d() {
        return false;
    }

    @Override // defpackage.dzs
    public final void e(ebx ebxVar, cpo cpoVar) {
        boolean z = cpoVar instanceof dzn;
        ebm ebmVarA = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A(ebxVar);
        if (z) {
            dxo dxoVar = this.g;
            if (dxoVar.b(ebmVarA)) {
                return;
            }
            dwj.b();
            Objects.toString(ebmVarA);
            ebmVarA.toString();
            ejs ejsVarD = dxoVar.d(ebmVarA);
            this.k.b(ejsVarD);
            this.l.b(ejsVarD);
            return;
        }
        dwj.b();
        Objects.toString(ebmVarA);
        ebmVarA.toString();
        ejs ejsVarC = this.g.c(ebmVarA);
        if (ejsVarC != null) {
            this.k.a(ejsVarC);
            this.l.c(ejsVarC, ((dzo) cpoVar).a);
        }
    }
}
