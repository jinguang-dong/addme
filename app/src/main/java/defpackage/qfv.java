package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfv implements qfw {
    private final /* synthetic */ int a;
    private final Object b;

    public qfv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, qfh, qgj] */
    @Override // defpackage.qfw
    public final void a(Object obj, Executor executor, qhd qhdVar) {
        int i = this.a;
        ?? r1 = this.b;
        if (i != 0) {
            qhdVar.i(r1.a(obj));
        } else {
            ske.W(r1.a(obj, executor).d(), new oyq(qhdVar, 2), sxo.a);
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? obj.toString() : obj.toString();
    }
}
