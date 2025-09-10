package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0117x1 extends B1 implements IntConsumer {
    @Override // j$.util.stream.B1
    public final Object[] A() {
        return new int[8][];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfInt spliterator() {
        return new C0114w1(this, 0, this.b, 0, this.a);
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        B();
        int[] iArr = (int[]) this.d;
        int i2 = this.a;
        this.a = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            h((IntConsumer) consumer);
        } else {
            if (i2.a) {
                i2.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.desugar.sun.nio.fs.g.i((C0114w1) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j$.util.P(spliterator());
    }

    @Override // j$.util.stream.B1
    public final Object newArray(int i) {
        return new int[i];
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.b), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.B1
    public final void v(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.B1
    public final int w(Object obj) {
        return ((int[]) obj).length;
    }
}
