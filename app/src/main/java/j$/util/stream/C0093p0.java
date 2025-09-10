package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0093p0 extends C0090o0 implements I {
    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(double d) {
        L0.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K
    public final /* bridge */ /* synthetic */ T build() {
        build();
        return this;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void c(long j) {
        int[] iArr = this.a;
        if (j != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC0073i1
    public final /* synthetic */ void d(Integer num) {
        L0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void end() {
        int i = this.b;
        int[] iArr = this.a;
        if (i < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.C0090o0
    public final String toString() {
        int[] iArr = this.a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.K
    public final O build() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        d((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void accept(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 < iArr.length) {
            this.b = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }
}
