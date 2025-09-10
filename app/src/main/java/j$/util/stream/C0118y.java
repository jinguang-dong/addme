package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0118y extends j$.util.U {
    public int c;
    public boolean d;
    public final /* synthetic */ IntUnaryOperator e;
    public final /* synthetic */ int f;

    public C0118y(int i, IntUnaryOperator intUnaryOperator) {
        this.e = intUnaryOperator;
        this.f = i;
        this.a = Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int iApplyAsInt;
        intConsumer.getClass();
        if (this.d) {
            iApplyAsInt = this.e.applyAsInt(this.c);
        } else {
            this.d = true;
            iApplyAsInt = this.f;
        }
        this.c = iApplyAsInt;
        intConsumer.accept(iApplyAsInt);
        return true;
    }

    @Override // j$.util.L
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        tryAdvance((IntConsumer) obj);
        return true;
    }
}
