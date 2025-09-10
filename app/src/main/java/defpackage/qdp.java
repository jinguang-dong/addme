package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdp extends syd {
    private qdp(syu syuVar) {
        super(syuVar);
    }

    public static qdp e(syu syuVar) {
        return syuVar instanceof qdp ? (qdp) syuVar : new qdp(syuVar);
    }

    public final qdp b(Class cls, rvu rvuVar, Executor executor) {
        return new qdp(qsz.h(this.a, cls, rvuVar, executor));
    }

    public final qdp d(Class cls, sxi sxiVar, Executor executor) {
        return new qdp(qsz.k(this.a, cls, sxiVar, executor));
    }

    public final qdp f(rvu rvuVar, Executor executor) {
        return new qdp(qsz.m(this.a, rvuVar, executor));
    }

    public final qdp g(sxi sxiVar, Executor executor) {
        return new qdp(qsz.n(this.a, sxiVar, executor));
    }
}
