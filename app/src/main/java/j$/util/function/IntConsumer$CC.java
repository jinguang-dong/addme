package j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.IntConsumer$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class IntConsumer$CC {
    public static IntConsumer $default$andThen(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        intConsumer2.getClass();
        return new IntConsumer() { // from class: j$.util.function.f
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                intConsumer.accept(i);
                intConsumer2.accept(i);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return IntConsumer$CC.$default$andThen(this, intConsumer3);
            }
        };
    }
}
