package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0063f0 implements M {
    public final double[] a;
    public int b;

    public C0063f0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.T
    public final /* bridge */ /* synthetic */ T a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.S
    public final Object b() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // j$.util.stream.T
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.S
    public final void f(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void forEach(Consumer consumer) {
        L0.q(this, consumer);
    }

    @Override // j$.util.stream.S
    public final void h(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.t(this, j, j2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void m(Object[] objArr, int i) {
        L0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ Object[] q(IntFunction intFunction) {
        return L0.m(this, intFunction);
    }

    @Override // j$.util.stream.S, j$.util.stream.T
    public final j$.util.L spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        Spliterators.a(dArr.length, 0, i);
        return new j$.util.X(dArr, 0, i, 1040);
    }

    public String toString() {
        double[] dArr = this.a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
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
        double[] dArr = this.a;
        Spliterators.a(dArr.length, 0, i);
        return new j$.util.X(dArr, 0, i, 1040);
    }

    public C0063f0(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }
}
