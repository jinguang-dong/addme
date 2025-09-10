package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qjp implements qjq {
    final /* synthetic */ syu a;
    private final /* synthetic */ int b;

    public qjp(syu syuVar, int i) {
        this.b = i;
        this.a = syuVar;
    }

    @Override // defpackage.qjq
    public final void a() {
        int i = this.b;
        syu syuVar = this.a;
        if (i != 0) {
            ((qjq) ske.V(syuVar)).a();
        } else {
            ske.V(syuVar);
        }
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != 0) {
            ske.W(this.a, new pvv(2), sxo.a);
        }
    }
}
