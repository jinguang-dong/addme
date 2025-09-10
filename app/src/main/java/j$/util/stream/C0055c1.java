package j$.util.stream;

import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0055c1 extends B {
    public final /* synthetic */ ToLongFunction m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055c1(AbstractC0067g1 abstractC0067g1, int i, ToLongFunction toLongFunction) {
        super(abstractC0067g1, i);
        this.m = toLongFunction;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final boolean m() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final InterfaceC0079k1 n(int i, InterfaceC0079k1 interfaceC0079k1) {
        return new C0071i(interfaceC0079k1, this.m, 4);
    }
}
