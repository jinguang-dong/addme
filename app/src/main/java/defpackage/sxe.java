package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sxe extends sxd {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(sxg.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(sxg.class, "remainingField");

    @Override // defpackage.sxd
    public final int a(sxg sxgVar) {
        return b.decrementAndGet(sxgVar);
    }

    @Override // defpackage.sxd
    public final void b(sxg sxgVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (!atomicReferenceFieldUpdater.compareAndSet(sxgVar, null, set) && atomicReferenceFieldUpdater.get(sxgVar) == null) {
        }
    }
}
