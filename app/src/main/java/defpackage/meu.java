package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class meu extends mex {
    public pbp a;
    private final pbn b;

    public meu(pqm pqmVar, pbn pbnVar) {
        super(pqmVar, met.values());
        this.b = pbnVar;
    }

    public final long a() {
        return i(met.SHUTTER_BUTTON_DOWN);
    }

    public final long d() {
        return i(met.SHUTTER_BUTTON_UP);
    }

    public final void e() {
        j(met.SHUTTER_BUTTON_DOWN);
    }

    public final void f(Duration duration) {
        k(met.SHUTTER_BUTTON_DOWN, this.l.a() + duration.toNanos());
    }

    public final void h(Duration duration) {
        k(met.SHUTTER_BUTTON_UP, this.l.a() + duration.toNanos());
        this.a = this.b.a("Shutter.FramesTaken");
    }

    public final void g() {
        j(met.SHUTTER_BUTTON_UP);
        this.a = this.b.a(MyBPCgKwEjJI.iUASYSAbxNWi);
    }
}
