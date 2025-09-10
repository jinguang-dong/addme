package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsm implements owf {
    private final owf a;

    public fsm(owf owfVar) {
        this.a = owfVar;
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.a.dK(new fnb(pauVar, 2), executor);
    }

    @Override // defpackage.owf
    public final Object dL() {
        return this.a.dL();
    }
}
