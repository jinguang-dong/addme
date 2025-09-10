package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqi implements kqh {
    final /* synthetic */ kqj a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public kqi(kqj kqjVar) {
        this.a = kqjVar;
    }

    @Override // defpackage.kqh, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        kqj kqjVar = this.a;
        synchronized (kqjVar.a) {
            kqjVar.a(Integer.valueOf(((Integer) kqjVar.d).intValue() - 1));
        }
    }
}
