package defpackage;

import j$.nio.file.Path;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rum {
    public int a;
    public long b;
    public long c;
    public Optional d;
    public Optional e;
    public syw f;
    public Path g;
    public int h;
    public float i;
    public boolean j;
    public byte k;
    public int l;
    public int m;
    public int n;
    public int o;

    public rum() {
        throw null;
    }

    public final void a(int i) {
        this.h = i;
        this.k = (byte) (this.k | 8);
    }

    public final void b(float f) {
        this.i = f;
        this.k = (byte) (this.k | 16);
    }

    public final void c(boolean z) {
        this.j = z;
        this.k = (byte) (this.k | 64);
    }

    public final void d() {
        this.l = 2;
    }

    public rum(byte[] bArr) {
        this.d = Optional.empty();
        this.e = Optional.empty();
    }
}
