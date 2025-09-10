package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class C0 extends F0 implements InterfaceC0073i1 {
    public final int[] h;

    public C0(Spliterator spliterator, AbstractC0047a abstractC0047a, int[] iArr) {
        super(spliterator, abstractC0047a, iArr.length);
        this.h = iArr;
    }

    @Override // j$.util.stream.F0
    public final F0 a(Spliterator spliterator, long j, long j2) {
        return new C0(this, spliterator, j, j2);
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

    @Override // j$.util.stream.F0, j$.util.stream.InterfaceC0079k1
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    public C0(C0 c0, Spliterator spliterator, long j, long j2) {
        super(c0, spliterator, j, j2, c0.h.length);
        this.h = c0.h;
    }
}
