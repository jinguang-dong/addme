package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hxa {
    public String a;
    public String b;
    private boolean e;
    private float f;
    private float g;
    private float h;
    private int i;
    private byte k;
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();
    private Optional j = Optional.empty();

    public final iar a() {
        if (this.k == 31) {
            return new iar(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
        throw new IllegalStateException();
    }

    public final void b(float f) {
        this.f = f;
        this.k = (byte) (this.k | 2);
    }

    public final void c(float f) {
        this.h = f;
        this.k = (byte) (this.k | 8);
    }

    public final void d(float f) {
        this.g = f;
        this.k = (byte) (this.k | 4);
    }

    public final void e(int i) {
        this.i = i;
        this.k = (byte) (this.k | 16);
    }

    public final void f(Optional optional) {
        optional.getClass();
        this.j = optional;
    }

    public final void g(Optional optional) {
        optional.getClass();
        this.d = optional;
    }

    public final void h(boolean z) {
        this.e = z;
        this.k = (byte) (this.k | 1);
    }

    public final void i(hqp hqpVar) {
        this.c = Optional.of(hqpVar);
    }

    public final void j(Optional optional) {
        optional.getClass();
        this.c = optional;
    }
}
