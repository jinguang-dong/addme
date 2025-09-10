package j$.util.stream;

import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class P0 extends L0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Supplier k;

    public /* synthetic */ P0(F1 f1, Object obj, Object obj2, Supplier supplier, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = supplier;
    }

    @Override // j$.util.stream.L0
    public final X0 F() {
        switch (this.h) {
            case 0:
                return new O0((j$.desugar.sun.nio.fs.n) this.k, (j$.desugar.sun.nio.fs.n) this.j, (j$.desugar.sun.nio.fs.h) this.i);
            default:
                return new T0((j$.desugar.sun.nio.fs.n) this.k, (j$.desugar.sun.nio.fs.n) this.j, (j$.desugar.sun.nio.fs.n) this.i);
        }
    }
}
