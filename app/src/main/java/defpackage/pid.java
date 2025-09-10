package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pid extends pog {
    boolean a;
    final /* synthetic */ pif b;
    private final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pid(pif pifVar, poj pojVar, pdo pdoVar) {
        super(pojVar);
        this.b = pifVar;
        this.a = false;
        ((phk) pifVar.j.b).g.b(Integer.valueOf(pojVar.c()), Integer.valueOf(pojVar.b()), Integer.valueOf(pojVar.a()));
        pifVar.f.b();
        this.c = pdoVar.b;
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            pif pifVar = this.b;
            ((phk) pifVar.j.b).h.b(Integer.valueOf(c()), Integer.valueOf(b()), Integer.valueOf(a()));
            pifVar.f.a();
            super.close();
            pifVar.b();
        }
    }

    @Override // defpackage.pog, defpackage.poj
    public final long d() {
        return this.c;
    }
}
