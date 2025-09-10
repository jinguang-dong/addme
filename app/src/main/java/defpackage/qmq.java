package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmq implements qmn {
    public final Object a;

    public qmq(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.qmn, defpackage.qff
    public final qgi a() {
        return qgh.a;
    }

    @Override // defpackage.qmn
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.qmn
    public final Object fk() {
        throw null;
    }

    public final String toString() {
        return "non-owning[" + String.valueOf(this.a) + "]";
    }

    @Override // defpackage.qmn, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
