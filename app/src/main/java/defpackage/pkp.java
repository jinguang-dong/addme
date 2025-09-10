package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkp extends pog {
    final /* synthetic */ pkq a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkp(pkq pkqVar, poj pojVar) {
        super(pojVar);
        this.a = pkqVar;
        this.b = false;
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        synchronized (this.a.a) {
            if (this.b) {
                z = false;
            } else {
                z = true;
                this.b = true;
            }
        }
        if (z) {
            super.close();
            synchronized (this.a.a) {
                r2.b--;
            }
        }
    }
}
