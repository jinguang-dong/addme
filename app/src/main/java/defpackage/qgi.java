package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgi implements qgf {
    private final qgf a;

    public qgi(qgf qgfVar) {
        this.a = qgfVar;
    }

    @Override // defpackage.qgf
    public final qgf a(Executor executor, qfh qfhVar) {
        return this.a.a(executor, qfhVar);
    }

    @Override // defpackage.qgf
    public final qgf b(Executor executor, qgj qgjVar) {
        return this.a.b(executor, qgjVar);
    }

    @Override // defpackage.qgf
    public final qgf c(Executor executor, qfh qfhVar, qfh qfhVar2) {
        return this.a.c(executor, qfhVar, qfhVar2);
    }

    @Override // defpackage.qgf
    public final syu d() {
        return this.a.d();
    }

    @Override // defpackage.qgf
    public final /* bridge */ /* synthetic */ Object e() {
        return (qfg) this.a.e();
    }

    @Override // defpackage.qgf
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.qgf
    public final void g(qfs qfsVar) {
        this.a.g(qfsVar);
    }

    @Override // defpackage.qgf
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final qgi h(Executor executor, qaq qaqVar) {
        return new qgi(this.a.h(executor, qaqVar));
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
