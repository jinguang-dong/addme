package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kpg implements kpr {
    final /* synthetic */ kpq a;
    final /* synthetic */ kph b;

    public kpg(kph kphVar, kpq kpqVar) {
        this.a = kpqVar;
        this.b = kphVar;
    }

    @Override // defpackage.kpr
    public final rwd a() {
        kpq kpqVar = this.a;
        if (kpqVar == null) {
            return null;
        }
        return new rwd(kpqVar.a, kpqVar.b);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        kph kphVar = this.b;
        synchronized (kphVar) {
            poj pojVar = kphVar.a;
            if (pojVar != null) {
                pojVar.close();
            }
            kphVar.a = null;
        }
    }
}
