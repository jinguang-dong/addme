package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0047a implements BaseStream {
    public final AbstractC0047a a;
    public final AbstractC0047a b;
    public final int c;
    public final AbstractC0047a d;
    public int e;
    public int f;
    public Spliterator g;
    public Supplier h;
    public boolean i;
    public final boolean j;
    public Runnable k;
    public boolean l;

    public AbstractC0047a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = E1.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & E1.l;
        this.e = 0;
        this.l = z;
    }

    public final void a(Spliterator spliterator, InterfaceC0079k1 interfaceC0079k1) {
        interfaceC0079k1.getClass();
        if (E1.SHORT_CIRCUIT.s(this.f)) {
            b(spliterator, interfaceC0079k1);
            return;
        }
        interfaceC0079k1.c(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC0079k1);
        interfaceC0079k1.end();
    }

    public final boolean b(Spliterator spliterator, InterfaceC0079k1 interfaceC0079k1) {
        AbstractC0047a abstractC0047a = this;
        while (abstractC0047a.e > 0) {
            abstractC0047a = abstractC0047a.b;
        }
        interfaceC0079k1.c(spliterator.getExactSizeIfKnown());
        boolean zG = abstractC0047a.g(spliterator, interfaceC0079k1);
        interfaceC0079k1.end();
        return zG;
    }

    public final T c(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.l) {
            return e(this, spliterator, z, intFunction);
        }
        K kJ = j(f(spliterator), intFunction);
        r(spliterator, kJ);
        return kJ.build();
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
        this.h = null;
        this.g = null;
        AbstractC0047a abstractC0047a = this.a;
        Runnable runnable = abstractC0047a.k;
        if (runnable != null) {
            abstractC0047a.k = null;
            runnable.run();
        }
    }

    public final Object d(g2 g2Var) {
        if (this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        return this.a.l ? g2Var.b(this, o(g2Var.f())) : g2Var.a(this, o(g2Var.f()));
    }

    public abstract T e(AbstractC0047a abstractC0047a, Spliterator spliterator, boolean z, IntFunction intFunction);

    public final long f(Spliterator spliterator) {
        if (E1.SIZED.s(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public abstract boolean g(Spliterator spliterator, InterfaceC0079k1 interfaceC0079k1);

    public abstract F1 h();

    public abstract Spliterator i(Supplier supplier);

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.l;
    }

    public abstract K j(long j, IntFunction intFunction);

    public T k(AbstractC0047a abstractC0047a, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator l(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        return k(abstractC0047a, spliterator, new j$.desugar.sun.nio.fs.n(11)).spliterator();
    }

    public abstract boolean m();

    public abstract InterfaceC0079k1 n(int i, InterfaceC0079k1 interfaceC0079k1);

    public final Spliterator o(int i) {
        int i2;
        int i3;
        AbstractC0047a abstractC0047a = this.a;
        Spliterator spliteratorL = abstractC0047a.g;
        if (spliteratorL != null) {
            abstractC0047a.g = null;
        } else {
            Supplier supplier = abstractC0047a.h;
            if (supplier == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            spliteratorL = (Spliterator) supplier.get();
            abstractC0047a.h = null;
        }
        if (abstractC0047a.l && abstractC0047a.j) {
            AbstractC0047a abstractC0047a2 = abstractC0047a.d;
            int i4 = 1;
            while (abstractC0047a != this) {
                int i5 = abstractC0047a2.c;
                if (abstractC0047a2.m()) {
                    if (E1.SHORT_CIRCUIT.s(i5)) {
                        i5 &= ~E1.t;
                    }
                    spliteratorL = abstractC0047a2.l(abstractC0047a, spliteratorL);
                    if (spliteratorL.hasCharacteristics(64)) {
                        i2 = (~E1.s) & i5;
                        i3 = E1.r;
                    } else {
                        i2 = (~E1.r) & i5;
                        i3 = E1.s;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                abstractC0047a2.e = i4;
                abstractC0047a2.f = E1.h(i5, abstractC0047a.f);
                AbstractC0047a abstractC0047a3 = abstractC0047a2;
                abstractC0047a2 = abstractC0047a2.d;
                abstractC0047a = abstractC0047a3;
                i4 = i6;
            }
        }
        if (i != 0) {
            this.f = E1.h(i, this.f);
        }
        return spliteratorL;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        runnable.getClass();
        AbstractC0047a abstractC0047a = this.a;
        Runnable runnable2 = abstractC0047a.k;
        if (runnable2 != null) {
            runnable = new d2(0, runnable2, runnable);
        }
        abstractC0047a.k = runnable;
        return this;
    }

    public final Spliterator p() {
        AbstractC0047a abstractC0047a = this.a;
        if (this != abstractC0047a) {
            throw new IllegalStateException();
        }
        if (this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        Spliterator spliterator = abstractC0047a.g;
        if (spliterator != null) {
            abstractC0047a.g = null;
            return spliterator;
        }
        Supplier supplier = abstractC0047a.h;
        if (supplier == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        Spliterator spliterator2 = (Spliterator) supplier.get();
        abstractC0047a.h = null;
        return spliterator2;
    }

    public abstract Spliterator q(AbstractC0047a abstractC0047a, Supplier supplier, boolean z);

    public final InterfaceC0079k1 r(Spliterator spliterator, InterfaceC0079k1 interfaceC0079k1) {
        interfaceC0079k1.getClass();
        a(spliterator, s(interfaceC0079k1));
        return interfaceC0079k1;
    }

    public final InterfaceC0079k1 s(InterfaceC0079k1 interfaceC0079k1) {
        interfaceC0079k1.getClass();
        AbstractC0047a abstractC0047a = this;
        while (true) {
            int i = abstractC0047a.e;
            AbstractC0047a abstractC0047a2 = abstractC0047a.b;
            if (i <= 0) {
                return interfaceC0079k1;
            }
            interfaceC0079k1 = abstractC0047a.n(abstractC0047a2.f, interfaceC0079k1);
            abstractC0047a = abstractC0047a2;
        }
    }

    @Override // j$.util.stream.BaseStream
    public final AbstractC0047a sequential() {
        this.a.l = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        AbstractC0047a abstractC0047a = this.a;
        if (this != abstractC0047a) {
            return q(this, new j$.desugar.sun.nio.fs.h(6, this), abstractC0047a.l);
        }
        Spliterator spliterator = abstractC0047a.g;
        if (spliterator != null) {
            abstractC0047a.g = null;
            return spliterator;
        }
        Supplier supplier = abstractC0047a.h;
        if (supplier == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0047a.h = null;
        return i(supplier);
    }

    public final Spliterator t(Spliterator spliterator) {
        return this.e == 0 ? spliterator : q(this, new j$.desugar.sun.nio.fs.h(7, spliterator), this.a.l);
    }

    public AbstractC0047a(AbstractC0047a abstractC0047a, int i) {
        if (!abstractC0047a.i) {
            abstractC0047a.i = true;
            abstractC0047a.d = this;
            this.b = abstractC0047a;
            this.c = E1.h & i;
            this.f = E1.h(i, abstractC0047a.f);
            AbstractC0047a abstractC0047a2 = abstractC0047a.a;
            this.a = abstractC0047a2;
            if (m()) {
                abstractC0047a2.j = true;
            }
            this.e = abstractC0047a.e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    public AbstractC0047a(Supplier supplier, int i, boolean z) {
        this.b = null;
        this.h = supplier;
        this.a = this;
        int i2 = E1.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & E1.l;
        this.e = 0;
        this.l = z;
    }
}
