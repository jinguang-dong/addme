package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owm implements owf {
    private final rww a;
    private final ovx b;
    private final owf c;

    public owm(rww rwwVar) {
        this.a = rwwVar;
        ovx ovxVar = new ovx(rwwVar.fr());
        this.b = ovxVar;
        this.c = owb.a(ovxVar);
    }

    public final void a() {
        this.b.a(this.a.fr());
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.c.dK(pauVar, executor);
    }

    @Override // defpackage.owf
    public final Object dL() {
        return this.b.d;
    }

    public final String toString() {
        rwb rwbVar = new rwb("PollingObs");
        rwbVar.a(this.a);
        return rwbVar.toString();
    }
}
