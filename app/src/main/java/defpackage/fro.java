package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fro implements paq {
    public final our a;
    private final frn b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public fro(frn frnVar, our ourVar) {
        this.b = frnVar;
        this.a = ourVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        frn frnVar = this.b;
        frnVar.execute(new foh(this, 5));
        frnVar.close();
    }
}
