package j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0123z1 extends B1 implements LongConsumer {
    @Override // j$.util.stream.B1
    public final Object[] A() {
        return new long[8][];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public j$.util.I spliterator() {
        return new C0120y1(this, 0, this.b, 0, this.a);
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        B();
        long[] jArr = (long[]) this.d;
        int i = this.a;
        this.a = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            h((LongConsumer) consumer);
        } else {
            if (i2.a) {
                i2.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.desugar.sun.nio.fs.g.j((C0120y1) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j$.util.Q(spliterator());
    }

    @Override // j$.util.stream.B1
    public final Object newArray(int i) {
        return new long[i];
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.b), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    @Override // j$.util.stream.B1
    public final void v(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.B1
    public final int w(Object obj) {
        return ((long[]) obj).length;
    }
}
