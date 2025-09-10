package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpf implements qlt {
    public final qfc a;
    private final AtomicBoolean c = new AtomicBoolean();
    public final szh b = new szh();

    public jpf(qfc qfcVar) {
        this.a = qfcVar;
    }

    @Override // defpackage.qlt
    public final syu a() {
        return this.b;
    }

    @Override // defpackage.qlt
    public final void b() {
        if (!this.c.get()) {
            throw new IllegalStateException("Staring with no track added");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, syu] */
    @Override // defpackage.qlt
    public final qlv c(qaq qaqVar) {
        if (this.c.getAndSet(true)) {
            throw new IllegalStateException("Added more than one track");
        }
        this.a.a(qaqVar.a);
        return new jpe(this);
    }
}
