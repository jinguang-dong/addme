package j$.util.stream;

import java.util.function.BinaryOperator;

/* loaded from: classes3.dex */
public final class M0 extends L0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ M0(F1 f1, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.L0
    public final X0 F() {
        switch (this.h) {
            case 0:
                return new W0((C0077k) this.i);
            case 1:
                return new N0((j$.desugar.sun.nio.fs.n) this.i);
            case 2:
                return new Q0((BinaryOperator) this.i);
            default:
                return new V0((C0077k) this.i);
        }
    }
}
