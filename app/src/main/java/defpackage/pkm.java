package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkm extends pog {
    final /* synthetic */ pkn a;
    private final uly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkm(pkn pknVar, poj pojVar) {
        super(pojVar);
        this.a = pknVar;
        this.b = new uly(false, umc.a);
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.b.c()) {
            return;
        }
        super.close();
        pkn pknVar = this.a;
        synchronized (pknVar.b) {
            pknVar.d--;
            if (pknVar.e) {
                pknVar.a();
            }
        }
    }
}
