package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlq {
    private jma d;
    private boolean e;
    private byte g;
    private Optional c = Optional.empty();
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    private Optional f = Optional.empty();

    public final jly a() {
        jma jmaVar;
        if (this.g != 1 || (jmaVar = this.d) == null) {
            throw new IllegalStateException();
        }
        return new jly(this.c, jmaVar, this.a, this.b, this.e, this.f);
    }

    public final void b(jma jmaVar) {
        jmaVar.getClass();
        this.d = jmaVar;
    }

    public final void c(Optional optional) {
        optional.getClass();
        this.f = optional;
    }

    public final void d(boolean z) {
        this.e = z;
        this.g = (byte) 1;
    }

    public final void e(Optional optional) {
        optional.getClass();
        this.c = optional;
    }
}
