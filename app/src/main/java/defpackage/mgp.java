package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mgp {
    public static final sgv a = sgv.g("mgp");
    public final pbn b;
    public long c = 419430400;
    public final mfs d;
    public final hbj e;
    private final Executor f;

    public mgp(mfs mfsVar, Executor executor, pbn pbnVar, hbj hbjVar) {
        this.d = mfsVar;
        this.f = executor;
        this.b = pbnVar;
        this.e = hbjVar;
    }

    public final syu a() {
        return b(this.f);
    }

    public final syu b(Executor executor) {
        return ske.Q(new kbs(this, 3), executor);
    }
}
