package defpackage;

import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class tru {
    final Unsafe a;

    public tru(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(long j);

    public abstract double b(Object obj, long j);

    public abstract float c(Object obj, long j);

    public abstract void d(Object obj, long j, boolean z);

    public abstract void e(Object obj, long j, byte b);

    public abstract void f(Object obj, long j, double d);

    public abstract void g(Object obj, long j, float f);

    public abstract boolean h(Object obj, long j);

    public abstract void i(long j, byte[] bArr, long j2);

    public final int j(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long k(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final void l(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void m(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }
}
