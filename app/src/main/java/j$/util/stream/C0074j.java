package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0074j extends AbstractC0064f1 {
    public static X u(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        j$.desugar.sun.nio.fs.n nVar = new j$.desugar.sun.nio.fs.n(24);
        j$.desugar.sun.nio.fs.n nVar2 = new j$.desugar.sun.nio.fs.n(25);
        return new X((Collection) new P0(F1.REFERENCE, new j$.desugar.sun.nio.fs.n(26), nVar2, nVar, 1).b(abstractC0047a, spliterator));
    }

    @Override // j$.util.stream.AbstractC0047a
    public final T k(AbstractC0047a abstractC0047a, Spliterator spliterator, IntFunction intFunction) {
        if (E1.DISTINCT.s(abstractC0047a.f)) {
            return abstractC0047a.c(spliterator, false, intFunction);
        }
        if (E1.ORDERED.s(abstractC0047a.f)) {
            return u(abstractC0047a, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new C0095q(new j$.nio.file.C(5, atomicBoolean, concurrentHashMap), false).b(abstractC0047a, spliterator);
        Set setKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(setKeySet);
            hashSet.add(null);
            setKeySet = hashSet;
        }
        return new X(setKeySet);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final Spliterator l(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        return E1.DISTINCT.s(abstractC0047a.f) ? abstractC0047a.t(spliterator) : E1.ORDERED.s(abstractC0047a.f) ? u(abstractC0047a, spliterator).spliterator() : new N1(abstractC0047a.t(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.AbstractC0047a
    public final InterfaceC0079k1 n(int i, InterfaceC0079k1 interfaceC0079k1) {
        interfaceC0079k1.getClass();
        return E1.DISTINCT.s(i) ? interfaceC0079k1 : E1.SORTED.s(i) ? new C0068h(interfaceC0079k1) : new C0071i(interfaceC0079k1);
    }
}
