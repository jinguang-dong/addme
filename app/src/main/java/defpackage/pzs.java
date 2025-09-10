package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzs implements pzc {
    public final pwt a;
    public final Executor b;
    public final ren c;

    public pzs(pwt pwtVar, ren renVar, Executor executor) {
        this.a = pwtVar;
        this.c = renVar;
        this.b = executor;
    }

    @Override // defpackage.pzc
    public final syu a(pvc pvcVar) {
        int i = qbu.a;
        pvc pvcVarAa = qsp.aa(pvcVar, (prh.q() / 1000) + pvcVar.k);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvcVarAa);
        return m(arrayList);
    }

    @Override // defpackage.pzc
    public final syu b() {
        return qdp.e(k()).g(new pzl(this, 16), this.b);
    }

    @Override // defpackage.pzc
    public final syu c() {
        ArrayList arrayList = new ArrayList();
        pyb pybVar = new pyb(arrayList, 19);
        Executor executor = this.b;
        return qdp.e(this.c.b(pybVar, executor)).f(new pyb(arrayList, 20), executor);
    }

    @Override // defpackage.pzc
    public final syu d() {
        ArrayList arrayList = new ArrayList();
        hve hveVar = new hve(this, arrayList, 15);
        Executor executor = this.b;
        return qdp.e(this.c.b(hveVar, executor)).f(new pyb(arrayList, 16), executor);
    }

    @Override // defpackage.pzc
    public final syu e() {
        return qsz.m(this.c.a(), new pzg(11), this.b);
    }

    @Override // defpackage.pzc
    public final syu f() {
        return syq.a;
    }

    @Override // defpackage.pzc
    public final syu g(pvl pvlVar) {
        return qsz.m(this.c.a(), new pyb(qsp.W(pvlVar), 17), this.b);
    }

    @Override // defpackage.pzc
    public final syu h(pvl pvlVar) {
        return qsz.m(this.c.a(), new pyb(qsp.W(pvlVar), 14), this.b);
    }

    @Override // defpackage.pzc
    public final syu i(pvl pvlVar) {
        pyb pybVar = new pyb(qsp.W(pvlVar), 18);
        Executor executor = this.b;
        return qdp.e(this.c.b(pybVar, executor)).f(new pzg(17), executor).b(IOException.class, new pzg(18), executor);
    }

    @Override // defpackage.pzc
    public final syu j(List list) {
        pyb pybVar = new pyb(list, 15);
        Executor executor = this.b;
        return qdp.e(this.c.b(pybVar, executor)).f(new pzg(9), executor).b(IOException.class, new pzg(10), executor);
    }

    @Override // defpackage.pzc
    public final syu k() {
        return this.c.b(new pzg(12), this.b);
    }

    @Override // defpackage.pzc
    public final syu l(pvl pvlVar, pvc pvcVar) {
        hve hveVar = new hve(qsp.W(pvlVar), pvcVar, 16, null);
        Executor executor = this.b;
        return qdp.e(this.c.b(hveVar, executor)).f(new pzg(14), executor).b(IOException.class, new pzg(15), executor);
    }

    @Override // defpackage.pzc
    public final syu m(List list) {
        pyb pybVar = new pyb(list, 13);
        Executor executor = this.b;
        return qdp.e(this.c.b(pybVar, executor)).f(new pzg(13), executor).b(IOException.class, new pzg(16), executor);
    }
}
