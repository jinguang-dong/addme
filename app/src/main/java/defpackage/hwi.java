package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hwi implements plb {
    final /* synthetic */ plb a;
    final /* synthetic */ hwj b;

    public hwi(hwj hwjVar, plb plbVar) {
        this.a = plbVar;
        this.b = hwjVar;
    }

    @Override // defpackage.plb
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.plb
    public final void b(long j, long j2, pla plaVar) {
        this.a.b(j, j2, plaVar);
    }

    @Override // defpackage.plb, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        hwj hwjVar = this.b;
        synchronized (hwjVar) {
            hwjVar.a.remove(this);
        }
    }
}
