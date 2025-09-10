package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pbj implements pbr {
    private final String b;
    private final AtomicInteger c = new AtomicInteger(0);

    public pbj(String str) {
        this.b = str;
    }

    @Override // defpackage.pbr
    public final void a() {
        Trace.setCounter(this.b, this.c.decrementAndGet());
    }

    @Override // defpackage.pbr
    public final void b() {
        Trace.setCounter(this.b, this.c.incrementAndGet());
    }

    @Override // defpackage.pbr
    public final void c(int i) {
        this.c.set(i);
        Trace.setCounter(this.b, r0.get());
    }
}
