package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0049a1 extends AbstractC0056d {
    public final L0 h;

    public C0049a1(L0 l0, AbstractC0047a abstractC0047a, Spliterator spliterator) {
        super(abstractC0047a, spliterator);
        this.h = l0;
    }

    @Override // j$.util.stream.AbstractC0056d
    public final Object a() {
        AbstractC0047a abstractC0047a = this.a;
        X0 x0F = this.h.F();
        abstractC0047a.r(this.b, x0F);
        return x0F;
    }

    @Override // j$.util.stream.AbstractC0056d
    public final AbstractC0056d b(Spliterator spliterator) {
        return new C0049a1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0056d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0056d abstractC0056d = this.d;
        if (abstractC0056d != null) {
            X0 x0 = (X0) ((C0049a1) abstractC0056d).f;
            x0.k((X0) ((C0049a1) this.e).f);
            this.f = x0;
        }
        super.onCompletion(countedCompleter);
    }

    public C0049a1(C0049a1 c0049a1, Spliterator spliterator) {
        super(c0049a1, spliterator);
        this.h = c0049a1.h;
    }
}
