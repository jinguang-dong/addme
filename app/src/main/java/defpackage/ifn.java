package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ifn {
    public static final sgv a = sgv.g("ifn");
    public final pjp b;
    public final hzs c;
    public final ifo d;
    public final kqp e;
    public final iso f;
    private final ibj g;
    private final ids h;

    public ifn(pjp pjpVar, hzs hzsVar, ifo ifoVar, kqp kqpVar, iso isoVar, rwc rwcVar, ibj ibjVar) {
        this.b = pjpVar;
        this.c = hzsVar;
        this.d = ifoVar;
        this.e = kqpVar;
        this.f = isoVar;
        this.h = (ids) rwcVar.f();
        this.g = ibjVar;
        String str = gzc.a;
    }

    public final void a(gga ggaVar, iea ieaVar) {
        b(new gqw(11), new fij(11), ggaVar, ieaVar);
    }

    public final void b(Consumer consumer, Runnable runnable, gga ggaVar, iea ieaVar) {
        if (ieaVar.a() != idz.FOCUS_STACK) {
            runnable.run();
            return;
        }
        ids idsVar = this.h;
        if (idsVar != null) {
            this.g.a(idsVar, consumer, runnable, ggaVar, ieaVar);
        } else {
            ((sgt) a.c().M(1976)).s("Unable to acquire post processing session.");
            runnable.run();
        }
    }
}
