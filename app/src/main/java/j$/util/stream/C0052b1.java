package j$.util.stream;

import java.util.function.Function;

/* renamed from: j$.util.stream.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0052b1 extends AbstractC0064f1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Function o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0052b1(AbstractC0067g1 abstractC0067g1, int i, Function function, int i2) {
        super(abstractC0067g1, i, 1);
        this.n = i2;
        this.o = function;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final InterfaceC0079k1 n(int i, InterfaceC0079k1 interfaceC0079k1) {
        switch (this.n) {
            case 0:
                return new C0071i(interfaceC0079k1, this.o, 2);
            default:
                return new C0068h(interfaceC0079k1, this.o);
        }
    }
}
