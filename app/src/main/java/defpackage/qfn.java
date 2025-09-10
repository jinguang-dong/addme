package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qfn implements qff {
    private final Object a = new Object();
    private volatile qgi b = null;

    @Override // defpackage.qff
    public final qgi a() {
        qgi qgiVarB;
        qgi qgiVar = this.b;
        if (qgiVar != null) {
            return qgiVar;
        }
        synchronized (this.a) {
            qgiVarB = this.b;
            if (qgiVarB == null) {
                qgiVarB = b();
                this.b = qgiVarB;
            }
        }
        return qgiVarB;
    }

    protected abstract qgi b();

    @Override // defpackage.qff, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qgi qgiVar = this.b;
        if (qgiVar == null) {
            synchronized (this.a) {
                qgiVar = this.b;
                if (qgiVar == null) {
                    fl();
                    qgiVar = qgh.a;
                    this.b = qgiVar;
                }
            }
        }
        qpt.am(qgiVar);
    }

    protected abstract void fl();
}
