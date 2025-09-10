package j$.util.stream;

/* loaded from: classes3.dex */
public abstract class V implements T {
    public final T a;
    public final T b;
    public final long c;

    public V(T t, T t2) {
        this.a = t;
        this.b = t2;
        this.c = t2.count() + t.count();
    }

    @Override // j$.util.stream.T
    public final T a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.T
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.T
    public final int u() {
        return 2;
    }

    @Override // j$.util.stream.T
    public /* bridge */ /* synthetic */ S a(int i) {
        return (S) a(i);
    }
}
