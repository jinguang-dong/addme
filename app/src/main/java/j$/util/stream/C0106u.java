package j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0106u extends AbstractC0064f1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0106u(AbstractC0047a abstractC0047a, int i, Object obj, int i2) {
        super(abstractC0047a, i, 1);
        this.n = i2;
        this.o = obj;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final InterfaceC0079k1 n(int i, InterfaceC0079k1 interfaceC0079k1) {
        switch (this.n) {
            case 0:
                return new C0103t(interfaceC0079k1, (IntFunction) this.o, 0);
            case 1:
                return new C0121z(interfaceC0079k1, (C0077k) this.o);
            default:
                return new C0071i(interfaceC0079k1, (Predicate) this.o, 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0106u(B b, C0077k c0077k) {
        super(b, 0, 1);
        this.n = 1;
        this.o = c0077k;
    }
}
