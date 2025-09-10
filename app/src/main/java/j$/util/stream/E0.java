package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
public final class E0 extends F0 {
    public final Object[] h;

    public E0(Spliterator spliterator, AbstractC0047a abstractC0047a, Object[] objArr) {
        super(spliterator, abstractC0047a, objArr.length);
        this.h = objArr;
    }

    @Override // j$.util.stream.F0
    public final F0 a(Spliterator spliterator, long j, long j2) {
        return new E0(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    public E0(E0 e0, Spliterator spliterator, long j, long j2) {
        super(e0, spliterator, j, j2, e0.h.length);
        this.h = e0.h;
    }
}
