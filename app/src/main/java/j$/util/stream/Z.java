package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes3.dex */
public class Z extends AbstractC0056d {
    public final AbstractC0047a h;
    public final LongFunction i;
    public final BinaryOperator j;

    public Z(AbstractC0047a abstractC0047a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC0047a, spliterator);
        this.h = abstractC0047a;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC0056d
    public final Object a() {
        K k = (K) this.i.apply(this.h.f(this.b));
        this.h.r(this.b, k);
        return k.build();
    }

    @Override // j$.util.stream.AbstractC0056d
    public final AbstractC0056d b(Spliterator spliterator) {
        return new Z(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0056d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0056d abstractC0056d = this.d;
        if (abstractC0056d != null) {
            this.f = (T) this.j.apply((T) ((Z) abstractC0056d).f, (T) ((Z) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public Z(Z z, Spliterator spliterator) {
        super(z, spliterator);
        this.h = z.h;
        this.i = z.i;
        this.j = z.j;
    }
}
