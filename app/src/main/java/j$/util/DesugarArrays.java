package j$.util;

import j$.util.Spliterator;
import j$.util.stream.C0112w;
import j$.util.stream.E1;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;

/* loaded from: classes3.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return StreamSupport.stream(Spliterators.b(tArr, 0, tArr.length, 1040), false);
    }

    public static IntStream stream(int[] iArr) {
        Spliterator.OfInt ofIntSpliterator = Spliterators.spliterator(iArr, 0, iArr.length, 1040);
        return new C0112w(ofIntSpliterator, E1.l(ofIntSpliterator), false);
    }

    public static LongStream stream(long[] jArr) {
        int length = jArr.length;
        Spliterators.a(jArr.length, 0, length);
        e0 e0Var = new e0(jArr, 0, length, 1040);
        return new j$.util.stream.A(e0Var, E1.l(e0Var), false);
    }
}
