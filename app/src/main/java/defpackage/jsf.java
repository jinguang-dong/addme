package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsf {
    public final pbc a;
    public final jsb b;
    public final long c;
    public final Set d = new HashSet();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public long f = 0;

    public jsf(pbc pbcVar, jsb jsbVar, hbj hbjVar) {
        this.a = pbcVar.a("LongPressTrimming");
        this.b = jsbVar;
        this.c = TimeUnit.MICROSECONDS.convert(((Integer) hbjVar.a(gzz.b).get()).intValue(), TimeUnit.MILLISECONDS);
    }

    public final synchronized jsi a(long j, jsi jsiVar) {
        return new jse(this, j, jsiVar);
    }

    @Deprecated
    public final boolean b() {
        return this.e.get();
    }
}
