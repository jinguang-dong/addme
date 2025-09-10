package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkg extends pog {
    private final AtomicBoolean a;

    public pkg(poj pojVar) {
        super(pojVar);
        this.a = new AtomicBoolean(false);
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.a.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
