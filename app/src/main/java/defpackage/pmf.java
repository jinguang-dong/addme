package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmf implements paq {
    final /* synthetic */ pmg a;
    private final plz b;
    private boolean c;
    private boolean d;

    public pmf(pmg pmgVar, plz plzVar) {
        this.a = pmgVar;
        this.b = plzVar;
    }

    public final void a(boolean z) {
        synchronized (this) {
            if (!this.d) {
                long j = this.b.a;
                if (j != 0) {
                    boolean z2 = this.c;
                    if (z2 && !z) {
                        j = -j;
                    } else if (z2 || !z) {
                        j = 0;
                    }
                    this.c = z;
                    this.a.g(j);
                }
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            long j = this.c ? -this.b.a : 0L;
            pmg pmgVar = this.a;
            plz plzVar = this.b;
            paq paqVarC = pmgVar.c();
            plzVar.close();
            pmgVar.g(j);
            paqVarC.close();
        }
    }
}
