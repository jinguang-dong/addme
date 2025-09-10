package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0089o implements h2 {
    public boolean a;
    public Object b;

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(double d) {
        L0.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final boolean e() {
        return this.a;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] */
    public final void d(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
    }
}
