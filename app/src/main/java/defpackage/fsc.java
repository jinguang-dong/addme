package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsc implements paq {
    private final AtomicBoolean a = new AtomicBoolean(false);

    public final boolean a() {
        return this.a.get();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.a.set(true);
    }
}
