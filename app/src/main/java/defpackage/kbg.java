package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kbg implements kbq {
    final /* synthetic */ Object a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ kbq c;
    final /* synthetic */ kbh d;

    public kbg(kbh kbhVar, Object obj, AtomicBoolean atomicBoolean, kbq kbqVar) {
        this.a = obj;
        this.b = atomicBoolean;
        this.c = kbqVar;
        this.d = kbhVar;
    }

    @Override // defpackage.kbq
    public final void a() {
        this.d.b.removeCallbacksAndMessages(this.a);
        if (this.b.getAndSet(true)) {
            return;
        }
        this.c.a();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [sgt, shi] */
    @Override // defpackage.kbq
    public final void b(Throwable th) {
        this.d.b.removeCallbacksAndMessages(this.a);
        if (this.b.getAndSet(true)) {
            ((sgt) ((sgt) kbh.a.b().i(th)).M((char) 3215)).s("HDR+ also failed after timeout");
        } else {
            this.c.b(th);
        }
    }

    @Override // defpackage.kbq
    public final void c(poj pojVar) {
        d(pojVar, false, false);
    }

    @Override // defpackage.kbq
    public final void d(poj pojVar, boolean z, boolean z2) {
        this.d.b.removeCallbacksAndMessages(this.a);
        if (this.b.getAndSet(true)) {
            pojVar.close();
        } else {
            this.c.d(pojVar, z, z2);
        }
    }
}
