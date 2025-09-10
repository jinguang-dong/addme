package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public class W implements T {
    public final Object[] a;
    public int b;

    public W(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    @Override // j$.util.stream.T
    public final T a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.T
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.T
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.d(this.a[i]);
        }
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.T
    public final void m(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.T
    public final Object[] q(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.T
    public final Spliterator spliterator() {
        return Spliterators.b(this.a, 0, this.b, 1040);
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ int u() {
        return 0;
    }

    public W(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }
}
