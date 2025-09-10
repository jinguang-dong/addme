package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kwd implements kvx {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kwd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.kvx
    public final pen a() {
        if (this.b != 0) {
            Object obj = this.a;
            pem pemVarA = pen.a();
            pemVarA.c(true != ((kwa) obj).a ? 4 : 2);
            pemVarA.b(1);
            pemVarA.e(1);
            pemVarA.d(false);
            return pemVarA.a();
        }
        mwq mwqVar = ((kwe) this.a).a;
        pem pemVarA2 = pen.a();
        pemVarA2.c(true == ((Boolean) ((ovx) mwqVar.b).d).booleanValue() ? 1 : 2);
        pemVarA2.b(1);
        pemVarA2.e(1);
        pemVarA2.d(true);
        return pemVarA2.a();
    }

    @Override // defpackage.kvx, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }
}
