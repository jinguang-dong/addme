package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pip implements paq {
    final /* synthetic */ piq a;
    private boolean b = false;
    private final /* synthetic */ int c;

    public pip(piq piqVar, int i) {
        this.c = i;
        this.a = piqVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.c != 0) {
            synchronized (this) {
                if (this.b) {
                    z2 = false;
                } else {
                    this.b = true;
                    z2 = true;
                }
            }
            if (z2) {
                piq piqVar = this.a;
                synchronized (piqVar) {
                    rnt.s(piqVar.a > 0);
                    int i = piqVar.a - 1;
                    piqVar.a = i;
                    if (i == 0 && piqVar.b == 0) {
                        piqVar.c = true;
                        z3 = true;
                    }
                }
                if (z3) {
                    piqVar.d.close();
                }
                piqVar.c();
                return;
            }
            return;
        }
        synchronized (this) {
            if (this.b) {
                z = false;
            } else {
                this.b = true;
                z = true;
            }
        }
        if (z) {
            piq piqVar2 = this.a;
            synchronized (piqVar2) {
                rnt.s(piqVar2.b > 0);
                int i2 = piqVar2.b - 1;
                piqVar2.b = i2;
                if (i2 == 0 && piqVar2.a == 0) {
                    piqVar2.c = true;
                    z3 = true;
                }
            }
            if (z3) {
                piqVar2.d.close();
            }
            piqVar2.c();
        }
    }
}
