package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfy implements paq {
    private final sbv a;
    private boolean b = false;

    public pfy(sbv sbvVar) {
        this.a = sbvVar;
    }

    public final synchronized pdk a(pdv pdvVar) {
        pdk pdkVar;
        if (!this.b && (pdkVar = (pdk) this.a.get(pdvVar)) != null) {
            return pdkVar.a();
        }
        return null;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.b) {
            this.b = true;
            sgj sgjVarListIterator = this.a.values().listIterator();
            while (sgjVarListIterator.hasNext()) {
                ((pdk) sgjVarListIterator.next()).close();
            }
        }
    }
}
