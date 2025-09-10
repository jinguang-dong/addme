package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jrz implements paq {
    public final AtomicReference a;

    public jrz(jsa jsaVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        atomicReference.set(jsaVar);
    }

    public final void a() {
        this.a.set(null);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        jsa jsaVar = (jsa) this.a.getAndSet(null);
        if (jsaVar != null) {
            jsaVar.c();
        }
    }
}
