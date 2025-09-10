package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruw {
    public boolean a;
    public Duration b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Duration h;
    public byte i;
    private int j;

    public final rux a() {
        if (this.i != 127 || this.b == null || this.h == null) {
            throw new IllegalStateException();
        }
        return new rux(this.j, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final void b(int i) {
        this.j = i;
        this.i = (byte) (this.i | 1);
    }
}
