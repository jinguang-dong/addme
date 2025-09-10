package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qmm implements qmn {
    private final AtomicReference a;

    public qmm(Object obj) {
        obj.getClass();
        this.a = new AtomicReference(obj);
    }

    @Override // defpackage.qmn, defpackage.qff
    public final qgi a() {
        close();
        return qgh.a;
    }

    protected abstract void b(Object obj);

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
        Object andSet = this.a.getAndSet(null);
        if (andSet != null) {
            b(andSet);
        }
    }

    @Override // defpackage.qmn
    public final Object fk() {
        throw null;
    }

    public final String toString() {
        return "single-owner[" + String.valueOf(this.a.get()) + "]";
    }
}
