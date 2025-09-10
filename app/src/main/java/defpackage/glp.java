package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glp {
    public int a;
    public int b;
    public int c;
    public boolean d;
    public Optional e;
    public byte f;
    public int g;

    public glp() {
        throw null;
    }

    public final void a(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 8);
    }

    public final void b(int i) {
        this.c = i;
        this.f = (byte) (this.f | 4);
    }

    public final void c(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }

    public glp(byte[] bArr) {
        this.e = Optional.empty();
    }
}
