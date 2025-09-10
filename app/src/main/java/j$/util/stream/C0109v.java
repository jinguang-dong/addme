package j$.util.stream;

import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0109v extends AbstractC0115x {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0109v(AbstractC0047a abstractC0047a, int i, Object obj, int i2) {
        super(abstractC0047a, i);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final boolean m() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final InterfaceC0079k1 n(int i, InterfaceC0079k1 interfaceC0079k1) {
        switch (this.m) {
            case 0:
                return new C0103t(interfaceC0079k1, (IntUnaryOperator) this.n, 1);
            case 1:
                return new C0103t(interfaceC0079k1, (IntPredicate) this.n, 2);
            default:
                return new C0071i(interfaceC0079k1, (ToIntFunction) this.n, 3);
        }
    }
}
