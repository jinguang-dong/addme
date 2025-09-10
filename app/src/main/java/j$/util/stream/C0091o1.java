package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0091o1 extends AbstractC0050b {
    public final C0085m1 j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    public C0091o1(C0085m1 c0085m1, AbstractC0047a abstractC0047a, Spliterator spliterator, IntFunction intFunction, long j) {
        super(abstractC0047a, spliterator);
        this.j = c0085m1;
        this.k = intFunction;
        this.l = j;
        this.m = -1L;
    }

    @Override // j$.util.stream.AbstractC0056d
    public final Object a() {
        if (((AbstractC0056d) getCompleter()) == null) {
            E1 e1 = E1.SIZED;
            C0085m1 c0085m1 = this.j;
            int i = c0085m1.c;
            int i2 = e1.e;
            long jF = (i & i2) == i2 ? c0085m1.f(this.b) : -1L;
            C0085m1 c0085m12 = this.j;
            IntFunction intFunction = this.k;
            c0085m12.getClass();
            K kX = L0.x(jF, intFunction);
            InterfaceC0079k1 interfaceC0079k1N = this.j.n(this.a.f, kX);
            AbstractC0047a abstractC0047a = this.a;
            abstractC0047a.b(this.b, abstractC0047a.s(interfaceC0079k1N));
            return kX.build();
        }
        C0085m1 c0085m13 = this.j;
        IntFunction intFunction2 = this.k;
        c0085m13.getClass();
        K kX2 = L0.x(-1L, intFunction2);
        if (this.l == 0) {
            InterfaceC0079k1 interfaceC0079k1N2 = this.j.n(this.a.f, kX2);
            AbstractC0047a abstractC0047a2 = this.a;
            abstractC0047a2.b(this.b, abstractC0047a2.s(interfaceC0079k1N2));
        } else {
            this.a.r(this.b, kX2);
        }
        T tBuild = kX2.build();
        this.n = tBuild.count();
        this.o = true;
        this.b = null;
        return tBuild;
    }

    @Override // j$.util.stream.AbstractC0056d
    public final AbstractC0056d b(Spliterator spliterator) {
        return new C0091o1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0050b
    public final void e() {
        this.i = true;
        if (this.o) {
            c(g());
        }
    }

    public final long i(long j) {
        if (this.o) {
            return this.n;
        }
        C0091o1 c0091o1 = (C0091o1) this.d;
        C0091o1 c0091o12 = (C0091o1) this.e;
        if (c0091o1 == null || c0091o12 == null) {
            return this.n;
        }
        long jI = c0091o1.i(j);
        return jI >= j ? jI : c0091o12.i(j) + jI;
    }

    @Override // j$.util.stream.AbstractC0050b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0084m0 g() {
        this.j.getClass();
        F1 f1 = F1.REFERENCE;
        int i = U.a[f1.ordinal()];
        if (i == 1) {
            return L0.a;
        }
        if (i == 2) {
            return L0.b;
        }
        if (i == 3) {
            return L0.c;
        }
        if (i == 4) {
            return L0.d;
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(f1)));
    }

    @Override // j$.util.stream.AbstractC0056d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C0091o1 c0091o1;
        T tZ;
        AbstractC0056d abstractC0056d = this.d;
        if (abstractC0056d != null) {
            this.n = ((C0091o1) abstractC0056d).n + ((C0091o1) this.e).n;
            if (this.i) {
                this.n = 0L;
                tZ = g();
            } else if (this.n == 0) {
                tZ = g();
            } else if (((C0091o1) this.d).n == 0) {
                tZ = (T) ((C0091o1) this.e).h();
            } else {
                this.j.getClass();
                tZ = L0.z(F1.REFERENCE, (T) ((C0091o1) this.d).h(), (T) ((C0091o1) this.e).h());
            }
            T tL = tZ;
            if (((AbstractC0056d) getCompleter()) == null) {
                tL = tL.l(this.l, this.m >= 0 ? Math.min(tL.count(), this.l + this.m) : this.n, this.k);
            }
            c(tL);
            this.o = true;
        }
        if (this.m >= 0 && ((AbstractC0056d) getCompleter()) != null) {
            long j = this.l + this.m;
            long jI = this.o ? this.n : i(j);
            if (jI >= j) {
                f();
            } else {
                C0091o1 c0091o12 = (C0091o1) ((AbstractC0056d) getCompleter());
                C0091o1 c0091o13 = this;
                while (true) {
                    if (c0091o12 == null) {
                        if (jI >= j) {
                            break;
                        }
                    } else {
                        if (c0091o13 == c0091o12.e && (c0091o1 = (C0091o1) c0091o12.d) != null) {
                            long jI2 = c0091o1.i(j) + jI;
                            if (jI2 >= j) {
                                break;
                            } else {
                                jI = jI2;
                            }
                        }
                        c0091o13 = c0091o12;
                        c0091o12 = (C0091o1) ((AbstractC0056d) c0091o12.getCompleter());
                    }
                }
                f();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C0091o1(C0091o1 c0091o1, Spliterator spliterator) {
        super(c0091o1, spliterator);
        this.j = c0091o1.j;
        this.k = c0091o1.k;
        this.l = c0091o1.l;
        this.m = c0091o1.m;
    }
}
