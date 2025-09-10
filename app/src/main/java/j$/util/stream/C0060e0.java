package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0060e0 extends V {
    @Override // j$.util.stream.T
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.T
    public final T l(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.l(j - jCount, j2 - jCount, intFunction);
        }
        if (j2 <= jCount) {
            return this.a.l(j, j2, intFunction);
        }
        return L0.z(F1.REFERENCE, this.a.l(j, jCount, intFunction), this.b.l(0L, j2 - jCount, intFunction));
    }

    @Override // j$.util.stream.T
    public final void m(Object[] objArr, int i) {
        objArr.getClass();
        T t = this.a;
        t.m(objArr, i);
        this.b.m(objArr, i + ((int) t.count()));
    }

    @Override // j$.util.stream.T
    public final Object[] q(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        m(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.T
    public final Spliterator spliterator() {
        return new C0110v0(this);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
