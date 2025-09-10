package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swp extends swo {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(swu.class, Thread.class, "thread");
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(swu.class, swu.class, "next");
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(swv.class, swu.class, "waitersField");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(swv.class, swk.class, "listenersField");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(swv.class, Object.class, "valueField");

    @Override // defpackage.swo
    public final swk a(swv swvVar, swk swkVar) {
        return (swk) d.getAndSet(swvVar, swkVar);
    }

    @Override // defpackage.swo
    public final swu b(swv swvVar, swu swuVar) {
        return (swu) c.getAndSet(swvVar, swuVar);
    }

    @Override // defpackage.swo
    public final void c(swu swuVar, swu swuVar2) {
        b.lazySet(swuVar, swuVar2);
    }

    @Override // defpackage.swo
    public final void d(swu swuVar, Thread thread) {
        a.lazySet(swuVar, thread);
    }

    @Override // defpackage.swo
    public final boolean e(swv swvVar, swk swkVar, swk swkVar2) {
        return a.G(d, swvVar, swkVar, swkVar2);
    }

    @Override // defpackage.swo
    public final boolean f(swv swvVar, Object obj, Object obj2) {
        return a.G(e, swvVar, obj, obj2);
    }

    @Override // defpackage.swo
    public final boolean g(swv swvVar, swu swuVar, swu swuVar2) {
        return a.G(c, swvVar, swuVar, swuVar2);
    }
}
