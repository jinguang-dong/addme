package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpi implements pdm, paq {
    public final Object a = new Object();
    public boolean b;
    public final /* synthetic */ kpk c;
    private final rww d;
    private long e;

    public kpi(kpk kpkVar, rww rwwVar) {
        this.c = kpkVar;
        this.d = rwwVar;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        kpk kpkVar = this.c;
        synchronized (kpkVar.c) {
            kpkVar.l.c();
        }
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        pdo pdoVarB = phcVar.b();
        if (pdoVarB == null) {
            return;
        }
        long jIntValue = this.e + ((Integer) this.d.fr()).intValue();
        long j = pdoVarB.c;
        if (j >= jIntValue) {
            this.e = j;
            ojl.bB(phcVar, new kuq(this, pdoVarB, 1));
        }
    }
}
