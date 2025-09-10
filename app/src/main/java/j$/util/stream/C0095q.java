package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0095q implements g2, h2 {
    public final boolean a;
    public final Consumer b;

    public C0095q(Consumer consumer, boolean z) {
        this.a = z;
        this.b = consumer;
    }

    @Override // j$.util.stream.g2
    public final Object a(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        abstractC0047a.a(spliterator, abstractC0047a.s(this));
        return null;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(double d) {
        L0.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.g2
    public final Object b(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        if (this.a) {
            new r(abstractC0047a, spliterator, this).invoke();
            return null;
        }
        new C0100s(abstractC0047a, spliterator, abstractC0047a.s(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.g2
    public final int f() {
        if (this.a) {
            return 0;
        }
        return E1.q;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        this.b.d(obj);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void end() {
    }
}
