package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0116x0 implements Q {
    public final long[] a;
    public int b;

    public C0116x0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.T
    public final /* bridge */ /* synthetic */ T a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.S
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.T
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.S
    public final void f(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void forEach(Consumer consumer) {
        L0.s(this, consumer);
    }

    @Override // j$.util.stream.S
    public final void h(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.v(this, j, j2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void m(Object[] objArr, int i) {
        L0.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ Object[] q(IntFunction intFunction) {
        return L0.m(this, intFunction);
    }

    @Override // j$.util.stream.S, j$.util.stream.T
    public final j$.util.L spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        Spliterators.a(jArr.length, 0, i);
        return new j$.util.e0(jArr, 0, i, 1040);
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ int u() {
        return 0;
    }

    @Override // j$.util.stream.S, j$.util.stream.T
    public final S a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.T
    public final Spliterator spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        Spliterators.a(jArr.length, 0, i);
        return new j$.util.e0(jArr, 0, i, 1040);
    }

    public C0116x0(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }
}
