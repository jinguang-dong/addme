package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0100s extends CountedCompleter {
    public Spliterator a;
    public final InterfaceC0079k1 b;
    public final AbstractC0047a c;
    public long d;

    public C0100s(AbstractC0047a abstractC0047a, Spliterator spliterator, InterfaceC0079k1 interfaceC0079k1) {
        super(null);
        this.b = interfaceC0079k1;
        this.c = abstractC0047a;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jD = this.d;
        if (jD == 0) {
            jD = AbstractC0056d.d(jEstimateSize);
            this.d = jD;
        }
        boolean zS = E1.SHORT_CIRCUIT.s(this.c.f);
        InterfaceC0079k1 interfaceC0079k1 = this.b;
        boolean z = false;
        C0100s c0100s = this;
        while (true) {
            if (zS && interfaceC0079k1.e()) {
                break;
            }
            if (jEstimateSize <= jD || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            C0100s c0100s2 = new C0100s(c0100s, spliteratorTrySplit);
            c0100s.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                C0100s c0100s3 = c0100s;
                c0100s = c0100s2;
                c0100s2 = c0100s3;
            }
            z = !z;
            c0100s.fork();
            c0100s = c0100s2;
            jEstimateSize = spliterator.estimateSize();
        }
        c0100s.c.a(spliterator, interfaceC0079k1);
        c0100s.a = null;
        c0100s.propagateCompletion();
    }

    public C0100s(C0100s c0100s, Spliterator spliterator) {
        super(c0100s);
        this.a = spliterator;
        this.b = c0100s.b;
        this.d = c0100s.d;
        this.c = c0100s.c;
    }
}
