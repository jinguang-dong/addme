package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ghd implements ggz {
    private final ggz a;
    private int d = 2;
    private boolean b = false;
    private final Object c = new Object();

    public ghd(ggz ggzVar) {
        this.a = ggzVar;
    }

    @Override // defpackage.ggz
    public final syu a(lte lteVar) {
        synchronized (this.c) {
            int i = this.d;
            boolean z = true;
            if (i == 1) {
                return ske.L(new IllegalStateException("has been closed."));
            }
            if (i == 3) {
                return ske.L(new IllegalStateException("there is already a snapshot request in flight."));
            }
            if (i != 2) {
                z = false;
            }
            rnt.L(z);
            this.d = 3;
            syu syuVarA = this.a.a(lteVar);
            syuVarA.c(new gba(this, 17), sxo.a);
            return syuVarA;
        }
    }

    @Override // defpackage.ggz
    public final syu b(pka pkaVar, pao paoVar) {
        synchronized (this.c) {
            int i = this.d;
            boolean z = true;
            if (i == 1) {
                return ske.L(new IllegalStateException("has been closed."));
            }
            if (i == 3) {
                return ske.L(new IllegalStateException("there is already a snapshot request in flight."));
            }
            if (i != 2) {
                z = false;
            }
            rnt.L(z);
            this.d = 3;
            syu syuVarB = this.a.b(pkaVar, paoVar);
            syuVarB.c(new gba(this, 16), sxo.a);
            return syuVarB;
        }
    }

    public final void c() {
        synchronized (this.c) {
            if (this.d == 2) {
                return;
            }
            this.d = 2;
            if (this.b) {
                close();
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            int i = this.d;
            if (i == 1) {
                return;
            }
            if (i == 3) {
                this.b = true;
                return;
            }
            this.a.close();
            this.d = 1;
            this.b = false;
        }
    }
}
