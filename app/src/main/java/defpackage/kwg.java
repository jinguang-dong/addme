package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kwg implements kvx {
    final /* synthetic */ kwh a;
    private boolean b;
    private final pfz c;

    public kwg(kwh kwhVar, pfz pfzVar) {
        this.a = kwhVar;
        this.c = pfzVar;
    }

    @Override // defpackage.kvx
    public final pen a() {
        pem pemVarA = pen.a();
        pemVarA.c(3);
        pemVarA.b(4);
        pemVarA.e(3);
        pemVarA.d(false);
        return pemVarA.a();
    }

    @Override // defpackage.kvx, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.d(this.c, false);
    }
}
