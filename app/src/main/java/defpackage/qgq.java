package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgq implements qgj {
    final /* synthetic */ qhd a;
    final /* synthetic */ qaq b;

    public qgq(qhd qhdVar, qaq qaqVar) {
        this.b = qaqVar;
        this.a = qhdVar;
    }

    @Override // defpackage.qgj
    public final qgf a(Object obj, Executor executor) {
        return this.b.m().a(executor, new qfk(obj, 1));
    }

    public final String toString() {
        qaq qaqVar = this.b;
        return this.a.toString() + "thenAlways[" + qaqVar.toString() + "]";
    }
}
