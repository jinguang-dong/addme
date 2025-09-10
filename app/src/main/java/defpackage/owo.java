package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class owo implements owq {
    final /* synthetic */ Object a;

    public owo(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        executor.execute(new ovw(pauVar, this.a, 6));
        return owp.a;
    }

    @Override // defpackage.owf
    public final Object dL() {
        return this.a;
    }

    public final String toString() {
        rwb rwbVar = new rwb("Prop.of");
        rwbVar.a(this.a);
        return rwbVar.toString();
    }

    @Override // defpackage.pau
    public final void a(Object obj) {
    }
}
