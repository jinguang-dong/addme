package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owi implements owf {
    public final /* synthetic */ Object a;

    public owi(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        executor.execute(new ovw(pauVar, this.a, 5));
        return owl.a;
    }

    @Override // defpackage.owf
    public final Object dL() {
        return this.a;
    }

    public final String toString() {
        rwb rwbVar = new rwb("Obs.of");
        rwbVar.a(this.a);
        return rwbVar.toString();
    }
}
