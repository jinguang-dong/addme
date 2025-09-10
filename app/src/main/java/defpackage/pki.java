package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pki extends pog {
    final /* synthetic */ pkj a;
    private final AtomicBoolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pki(pkj pkjVar, poj pojVar) {
        super(pojVar);
        this.a = pkjVar;
        this.b = new AtomicBoolean(false);
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        super.close();
        pkj pkjVar = this.a;
        synchronized (pkjVar.a) {
            pkjVar.c--;
            if (pkjVar.b) {
                pkjVar.j();
            }
        }
    }

    public final void finalize() throws Throwable {
        close();
        super.finalize();
    }
}
