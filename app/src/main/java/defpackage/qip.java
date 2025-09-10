package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qip implements qgj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qip(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.qgj
    public final /* synthetic */ qgf a(Object obj, Executor executor) {
        if (this.b != 0) {
            qgg qggVar = (qgg) obj;
            return ((qaq) this.a).m().c(executor, new qfk(qggVar, 0), new qfl(qggVar));
        }
        qis qisVar = (qis) this.a;
        qisVar.a = false;
        qisVar.m();
        return qisVar.k();
    }
}
