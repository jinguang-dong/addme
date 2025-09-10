package j$.util;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class T implements IntConsumer {
    public int a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
