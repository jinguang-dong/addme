package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owv implements owf {
    final /* synthetic */ owf a;
    public final /* synthetic */ oww b;

    public owv(oww owwVar, owf owfVar) {
        this.a = owfVar;
        this.b = owwVar;
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.a.dK(new leg(this, pauVar, 10), executor);
    }

    @Override // defpackage.owf
    public final Object dL() {
        return this.b.o(this.a.dL());
    }
}
