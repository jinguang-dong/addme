package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxb extends pog {
    private final Runnable a;
    private final AtomicBoolean b;

    public lxb(poj pojVar, Runnable runnable) {
        super(pojVar);
        this.b = new AtomicBoolean(false);
        this.a = runnable;
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.b.compareAndSet(false, true)) {
            super.close();
            this.a.run();
        }
    }
}
