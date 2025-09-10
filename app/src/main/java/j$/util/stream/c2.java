package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class c2 extends G1 {
    @Override // j$.util.stream.G1
    public final void d() {
        C1 c1 = new C1();
        this.h = c1;
        this.e = this.b.s(new j$.desugar.sun.nio.fs.h(19, c1));
        this.f = new j$.desugar.sun.nio.fs.h(20, this);
    }

    @Override // j$.util.stream.G1
    public final G1 e(Spliterator spliterator) {
        return new c2(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        consumer.getClass();
        c();
        j$.nio.file.u uVar = new j$.nio.file.u(consumer, 3);
        this.b.r(this.d, uVar);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        C1 c1 = (C1) this.h;
        long j = this.g;
        if (c1.b != 0) {
            if (j >= c1.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= c1.b; i++) {
                long j2 = c1.c[i];
                Object[] objArr = c1.e[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= c1.a) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = c1.d[(int) j];
        consumer.d(obj);
        return zA;
    }
}
