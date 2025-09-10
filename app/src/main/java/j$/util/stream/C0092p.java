package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0092p extends AbstractC0050b {
    public final C0080l j;
    public final boolean k;

    public C0092p(C0080l c0080l, boolean z, AbstractC0047a abstractC0047a, Spliterator spliterator) {
        super(abstractC0047a, spliterator);
        this.k = z;
        this.j = c0080l;
    }

    @Override // j$.util.stream.AbstractC0056d
    public final Object a() {
        AbstractC0047a abstractC0047a = this.a;
        h2 h2Var = (h2) this.j.d.get();
        abstractC0047a.r(this.b, h2Var);
        Object obj = h2Var.get();
        if (this.k) {
            if (obj != null) {
                AbstractC0056d abstractC0056d = this;
                while (abstractC0056d != null) {
                    AbstractC0056d abstractC0056d2 = (AbstractC0056d) abstractC0056d.getCompleter();
                    if (abstractC0056d2 != null && abstractC0056d2.d != abstractC0056d) {
                        f();
                        return obj;
                    }
                    abstractC0056d = abstractC0056d2;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0056d
    public final AbstractC0056d b(Spliterator spliterator) {
        return new C0092p(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0050b
    public final Object g() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC0056d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            C0092p c0092p = (C0092p) this.d;
            C0092p c0092p2 = null;
            while (true) {
                if (c0092p != c0092p2) {
                    Object objH = c0092p.h();
                    if (objH != null && this.j.c.test(objH)) {
                        c(objH);
                        AbstractC0056d abstractC0056d = this;
                        while (true) {
                            if (abstractC0056d != null) {
                                AbstractC0056d abstractC0056d2 = (AbstractC0056d) abstractC0056d.getCompleter();
                                if (abstractC0056d2 != null && abstractC0056d2.d != abstractC0056d) {
                                    f();
                                    break;
                                }
                                abstractC0056d = abstractC0056d2;
                            } else {
                                AtomicReference atomicReference = this.h;
                                while (!atomicReference.compareAndSet(null, objH) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        c0092p2 = c0092p;
                        c0092p = (C0092p) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C0092p(C0092p c0092p, Spliterator spliterator) {
        super(c0092p, spliterator);
        this.k = c0092p.k;
        this.j = c0092p.j;
    }
}
