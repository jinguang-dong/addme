package j$.util;

/* loaded from: classes3.dex */
public interface L extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    L trySplit();
}
