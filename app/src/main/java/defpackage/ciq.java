package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ciq extends cil {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public ciq(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.cil
    public final void a(cit citVar, cit citVar2) {
        this.b.lazySet(citVar, citVar2);
    }

    @Override // defpackage.cil
    public final void b(cit citVar, Thread thread) {
        this.a.lazySet(citVar, thread);
    }

    @Override // defpackage.cil
    public final boolean c(ciu ciuVar, cip cipVar, cip cipVar2) {
        return a.G(this.d, ciuVar, cipVar, cipVar2);
    }

    @Override // defpackage.cil
    public final boolean d(ciu ciuVar, Object obj, Object obj2) {
        return a.G(this.e, ciuVar, obj, obj2);
    }

    @Override // defpackage.cil
    public final boolean e(ciu ciuVar, cit citVar, cit citVar2) {
        return a.G(this.c, ciuVar, citVar, citVar2);
    }
}
