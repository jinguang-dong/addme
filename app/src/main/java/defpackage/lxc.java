package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxc {
    public lyr a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private mxj f;
    private Optional g;
    private boolean h;
    private byte i;

    public lxc() {
        throw null;
    }

    public final lxd a() {
        lyr lyrVar;
        mxj mxjVar;
        if (this.i != 31 || (lyrVar = this.a) == null || (mxjVar = this.f) == null) {
            throw new IllegalStateException();
        }
        return new lxd(lyrVar, this.b, this.c, this.d, this.e, mxjVar, this.g, this.h);
    }

    public final void b(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 8);
    }

    public final void c(boolean z) {
        this.b = z;
        this.i = (byte) (this.i | 1);
    }

    public final void d(boolean z) {
        this.d = z;
        this.i = (byte) (this.i | 4);
    }

    public final void e(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | 16);
    }

    public final void f(boolean z) {
        this.c = z;
        this.i = (byte) (this.i | 2);
    }

    public final void g(mxj mxjVar) {
        mxjVar.getClass();
        this.f = mxjVar;
    }

    public final void h(Optional optional) {
        optional.getClass();
        this.g = optional;
    }

    public lxc(byte[] bArr) {
        this.g = Optional.empty();
    }
}
