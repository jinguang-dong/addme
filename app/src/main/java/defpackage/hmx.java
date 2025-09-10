package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmx {
    private final hlg d;
    private int e = 9000;
    public int a = 1;
    private hmr f = new hmw(1);
    public int c = 4;
    public int b = 30;
    private long g = 0;
    private TimeUnit h = null;

    public hmx(hlg hlgVar) {
        this.d = hlgVar;
    }

    public final hms a() {
        if (this.h != null) {
            this.e = (int) (this.b * TimeUnit.SECONDS.convert(this.g, this.h));
        }
        int i = this.a;
        return new hms(this.d, this.e, i, i, this.c, this.f, new hmt(i), i == 1 ? new hmu() : new hmv(i));
    }

    public final void b() {
        this.f = new hmw(0);
    }

    public final void c(TimeUnit timeUnit) {
        this.g = 5L;
        this.h = timeUnit;
    }
}
