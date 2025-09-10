package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0057d0 extends V implements S {
    @Override // j$.util.stream.S
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) j);
        f(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.S
    public final void f(int i, Object obj) {
        T t = this.a;
        ((S) t).f(i, obj);
        ((S) this.b).f(i + ((int) ((S) t).count()), obj);
    }

    @Override // j$.util.stream.S
    public final void h(Object obj) {
        ((S) this.a).h(obj);
        ((S) this.b).h(obj);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ Object[] q(IntFunction intFunction) {
        return L0.m(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
