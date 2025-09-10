package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes3.dex */
public abstract class K0 extends CountedCompleter {
    public final T a;
    public final int b;

    public K0(T t) {
        this.a = t;
        this.b = 0;
    }

    public abstract void a();

    public abstract K0 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        K0 k0B = this;
        while (k0B.a.u() != 0) {
            k0B.setPendingCount(k0B.a.u() - 1);
            int i = 0;
            int iCount = 0;
            while (i < k0B.a.u() - 1) {
                K0 k0B2 = k0B.b(i, k0B.b + iCount);
                iCount = (int) (k0B2.a.count() + iCount);
                k0B2.fork();
                i++;
            }
            k0B = k0B.b(i, k0B.b + iCount);
        }
        k0B.a();
        k0B.propagateCompletion();
    }

    public K0(K0 k0, T t, int i) {
        super(k0);
        this.a = t;
        this.b = i;
    }
}
