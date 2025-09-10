package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qkf implements qke {
    protected int b;

    public qkf(int i) {
        this.b = i;
    }

    @Override // defpackage.qff
    public final qgi a() {
        close();
        return qgh.a;
    }

    protected abstract void c();

    @Override // defpackage.qff, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != 0) {
            c();
            this.b = 0;
        }
    }
}
