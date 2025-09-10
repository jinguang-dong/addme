package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knb implements kmy {
    final /* synthetic */ szh a;
    final /* synthetic */ knd b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public knb(knd kndVar, szh szhVar) {
        this.a = szhVar;
        this.b = kndVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.c;
        String str = "close() on ImageCaptureLock called when closed=" + atomicBoolean.get();
        knd kndVar = this.b;
        kndVar.c.b(str);
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        kndVar.e.a(Boolean.valueOf(kndVar.f.decrementAndGet() > 0));
        kndVar.d.a();
        this.a.e(true);
    }
}
