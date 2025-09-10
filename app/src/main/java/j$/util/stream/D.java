package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes3.dex */
public final class D extends E implements InterfaceC0073i1 {
    public final /* synthetic */ F c;
    public final /* synthetic */ IntPredicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f, IntPredicate intPredicate) {
        super(f);
        this.c = f;
        this.d = intPredicate;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0073i1
    public final /* synthetic */ void d(Integer num) {
        L0.g(this, num);
    }

    @Override // j$.util.stream.E, j$.util.stream.InterfaceC0079k1
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(i);
        F f = this.c;
        if (zTest == f.a) {
            this.a = true;
            this.b = f.b;
        }
    }
}
