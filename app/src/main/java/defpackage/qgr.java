package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgr implements qgj {
    final /* synthetic */ qhd a;
    final /* synthetic */ qaq b;

    public qgr(qhd qhdVar, qaq qaqVar) {
        this.b = qaqVar;
        this.a = qhdVar;
    }

    @Override // defpackage.qgj
    public final /* bridge */ /* synthetic */ qgf a(Object obj, Executor executor) {
        qgg qggVar = (qgg) obj;
        return this.b.m().c(executor, new qfk(qggVar, 0), new qfl(qggVar));
    }

    public final String toString() {
        qaq qaqVar = this.b;
        return this.a.toString() + "thenAlways[" + qaqVar.toString() + "]";
    }
}
