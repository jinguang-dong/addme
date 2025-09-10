package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wy implements AutoCloseable, ra {
    private final wx a;
    private final xh b = new xh(xq.a);
    private final Map c;
    private final Set d;

    public wy(Map map, wx wxVar) {
        this.a = wxVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ske.aZ(((ugq) map).g));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            xn xnVar = (xn) entry.getValue();
            xh xhVar = new xh(xl.a);
            xnVar.b();
            linkedHashMap.put(key, xhVar);
        }
        this.c = linkedHashMap;
        this.d = linkedHashMap.keySet();
    }

    @Override // defpackage.ra
    public final void a(rb rbVar) {
        rbVar.getClass();
        this.a.a();
    }

    @Override // defpackage.ra
    public final void b(sy syVar, long j, int i) {
        syVar.getClass();
        xh xhVar = (xh) this.c.get(new rh(i));
        if (xhVar != null) {
            xhVar.a(j);
        }
    }

    @Override // defpackage.ra
    public final void c(sy syVar, long j, qb qbVar) {
        syVar.getClass();
        this.b.b(j, qbVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.b.close();
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((xh) it.next()).close();
        }
    }

    @Override // defpackage.ra
    public final void d(sy syVar, long j, rc rcVar) {
        syVar.getClass();
        this.b.b(j, new qp(10));
        if (rcVar.a()) {
            return;
        }
        Iterator it = syVar.b().keySet().iterator();
        while (it.hasNext()) {
            xh xhVar = (xh) this.c.get(new rh(((rh) it.next()).a));
            if (xhVar != null) {
                xhVar.a(j);
            }
        }
    }

    @Override // defpackage.ra
    public final /* synthetic */ void e(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void f(sy syVar, long j) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void g(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void h(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final void i(sy syVar, long j, long j2) {
        syVar.getClass();
        xe xeVar = new xe(syVar, j, j2, this.d);
        this.b.c(j, j2, j, xeVar.c);
        List list = xeVar.d;
        int i = ((ugl) list).c;
        for (int i2 = 0; i2 < i; i2++) {
            xc xcVar = (xc) list.get(i2);
            Map map = this.c;
            int i3 = xcVar.a;
            Object obj = map.get(new rh(i3));
            obj.getClass();
            xh xhVar = (xh) obj;
            xhVar.c(j, j2, j2, xcVar);
            if (!syVar.b().keySet().contains(new rh(i3))) {
                xhVar.a(xeVar.b);
            }
        }
        wz wzVar = new wz(xeVar);
        if (!syVar.d()) {
            this.a.a();
        }
        wzVar.a();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void j(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void k(sy syVar, qc qcVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void l(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void m(sy syVar) {
        syVar.getClass();
    }
}
