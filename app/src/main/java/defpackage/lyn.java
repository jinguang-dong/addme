package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lyn extends pog {
    private final Runnable a;
    private boolean b;

    public lyn(poj pojVar, Runnable runnable) {
        super(pojVar);
        this.b = false;
        this.a = runnable;
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        synchronized (this) {
            if (this.b) {
                z = false;
            } else {
                z = true;
                this.b = true;
            }
        }
        if (z) {
            super.close();
            this.a.run();
        }
    }
}
