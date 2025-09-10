package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jyy implements jyw {
    final /* synthetic */ jyw a;
    private final /* synthetic */ int b;

    public jyy(jyw jywVar, int i) {
        this.b = i;
        this.a = jywVar;
    }

    @Override // defpackage.jyw
    public final jyv a(poj pojVar, ejt ejtVar) {
        throw null;
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        jyw jywVar = this.a;
        if (i != 0) {
            jywVar.close();
        } else {
            jywVar.close();
        }
    }
}
