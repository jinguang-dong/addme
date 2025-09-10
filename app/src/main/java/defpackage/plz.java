package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class plz implements paq {
    public final long a;
    final /* synthetic */ pmb b;
    private volatile boolean c = false;

    public plz(pmb pmbVar, long j) {
        this.b = pmbVar;
        this.a = j;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            pmb pmbVar = this.b;
            long j = this.a;
            synchronized (pmbVar.a) {
                pmbVar.d -= j;
                pmbVar.d();
            }
            pmbVar.e();
        }
    }
}
