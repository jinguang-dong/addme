package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qge implements qgf {
    private final Object a;
    private final /* synthetic */ int b;

    public qge(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    private final qgf i(Executor executor, qfh qfhVar) {
        qhd qhdVar = new qhd();
        k(executor, new qgx(this.a, qfhVar, qhdVar, 1), qhdVar);
        return qhdVar;
    }

    private final qgf j(Executor executor, qgj qgjVar) {
        qhd qhdVar = new qhd();
        k(executor, new qgb(this.a, qgjVar, executor, qhdVar), qhdVar);
        return qhdVar;
    }

    private static void k(Executor executor, Runnable runnable, qhd qhdVar) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            qhdVar.j(qgg.a(th));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, syu] */
    @Override // defpackage.qgf
    public final qgf a(Executor executor, qfh qfhVar) {
        if (this.b == 0) {
            return i(executor, qfhVar);
        }
        executor.getClass();
        qfv qfvVar = new qfv(qfhVar, 1);
        ?? r2 = this.a;
        qfx qfxVar = new qfx(r2, qfvVar, null, executor, qhe.a);
        r2.c(qfxVar, sxo.a);
        return qfxVar.a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, syu] */
    @Override // defpackage.qgf
    public final qgf b(Executor executor, qgj qgjVar) {
        if (this.b == 0) {
            return j(executor, qgjVar);
        }
        qfv qfvVar = new qfv(qgjVar, 0);
        ?? r2 = this.a;
        qfx qfxVar = new qfx(r2, qfvVar, null, executor, qhe.a);
        r2.c(qfxVar, sxo.a);
        return qfxVar.a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, syu] */
    @Override // defpackage.qgf
    public final qgf c(Executor executor, qfh qfhVar, qfh qfhVar2) {
        if (this.b == 0) {
            return i(executor, qfhVar);
        }
        executor.getClass();
        qfv qfvVar = new qfv(qfhVar, 1);
        qfv qfvVar2 = new qfv(qfhVar2, 1);
        ?? r2 = this.a;
        qfx qfxVar = new qfx(r2, qfvVar, qfvVar2, executor, qhe.a);
        r2.c(qfxVar, sxo.a);
        return qfxVar.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, syu] */
    @Override // defpackage.qgf
    public final syu d() {
        int i = this.b;
        ?? r1 = this.a;
        return i != 0 ? r1 : ske.M(r1);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, syu] */
    @Override // defpackage.qgf
    public final Object e() throws qgg {
        if (this.b == 0) {
            return this.a;
        }
        try {
            Object obj = this.a.get();
            if (obj != null) {
                return obj;
            }
            throw qgg.a(new IllegalStateException("Result value was null"));
        } catch (ExecutionException e) {
            throw qgg.a(e.getCause());
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, syu] */
    @Override // defpackage.qgf
    public final boolean f() {
        if (this.b != 0) {
            return this.a.isDone();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, syu] */
    @Override // defpackage.qgf
    public final void g(qfs qfsVar) {
        if (this.b != 0) {
            ?? r1 = this.a;
            r1.c(new qfu(r1), sxo.a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, syu] */
    @Override // defpackage.qgf
    public final qgf h(Executor executor, qaq qaqVar) {
        if (this.b == 0) {
            return j(executor, new qga(qaqVar, 0));
        }
        qga qgaVar = new qga(qaqVar, 1);
        qip qipVar = new qip(qaqVar, 1);
        executor.getClass();
        qfv qfvVar = new qfv(qgaVar, 0);
        qfv qfvVar2 = new qfv(qipVar, 0);
        ?? r5 = this.a;
        qfx qfxVar = new qfx(r5, qfvVar, qfvVar2, executor, qhe.a);
        r5.c(qfxVar, sxo.a);
        return qfxVar.a;
    }
}
