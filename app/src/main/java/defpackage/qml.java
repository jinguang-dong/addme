package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qml implements qmn {
    private final AtomicReference a;
    private final qhd b;
    private final qgi c;

    public qml(Object obj) {
        qhd qhdVar = new qhd();
        this.b = qhdVar;
        this.c = new qgi(qhdVar);
        this.a = new AtomicReference(obj);
    }

    @Override // defpackage.qmn, defpackage.qff
    public final qgi a() {
        Object objD = d();
        if (objD != null) {
            qhd qhdVar = this.b;
            ((qff) objD).a().c(sxo.a, new qgm(qhdVar), new qgl(qhdVar)).g(qfs.a);
        }
        return this.c;
    }

    @Override // defpackage.qmn
    public final Object c() {
        Object obj = this.a.get();
        if (obj != null) {
            return obj;
        }
        throw new qmp();
    }

    @Override // defpackage.qmn, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qpt.am(a());
    }

    protected final Object d() {
        return this.a.getAndSet(null);
    }

    @Override // defpackage.qmn
    public final Object fk() {
        Object objD = d();
        if (objD == null) {
            throw new qmp();
        }
        this.b.i(qfg.a);
        qpt.am(this.c);
        return objD;
    }

    public final String toString() {
        return "single-owner[" + String.valueOf(this.a.get()) + "]";
    }
}
