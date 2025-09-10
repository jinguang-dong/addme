package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmo implements qmn {
    final /* synthetic */ qmn a;
    final /* synthetic */ Iterable b;
    private final boolean c = false;

    public qmo(qmn qmnVar, Iterable iterable) {
        this.a = qmnVar;
        this.b = iterable;
    }

    @Override // defpackage.qmn, defpackage.qff
    public final synchronized qgi a() {
        return new qgi(this.a.a().h(sxo.a, new qaq(this.b)));
    }

    @Override // defpackage.qmn
    public final Object c() {
        return this.a.c();
    }

    @Override // defpackage.qmn, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qpt.am(a());
    }

    @Override // defpackage.qmn
    public final synchronized Object fk() {
        throw null;
    }
}
