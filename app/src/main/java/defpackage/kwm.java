package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kwm implements kvx {
    private final /* synthetic */ int a;

    public kwm(int i) {
        this.a = i;
    }

    @Override // defpackage.kvx
    public final pen a() {
        if (this.a != 0) {
            pem pemVarA = pen.a();
            pemVarA.c(4);
            pemVarA.b(4);
            pemVarA.e(1);
            pemVarA.d(true);
            return pemVarA.a();
        }
        pem pemVarA2 = pen.a();
        pemVarA2.c(3);
        pemVarA2.b(4);
        pemVarA2.e(3);
        pemVarA2.d(false);
        return pemVarA2.a();
    }

    @Override // defpackage.kvx, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }
}
