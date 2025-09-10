package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owb implements owf {
    private final owf a;

    private owb(owf owfVar) {
        this.a = owfVar;
    }

    public static owf a(owf owfVar) {
        return owfVar instanceof owb ? owfVar : new owb(owfVar);
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.a.dK(new owa(executor, pauVar), new owr());
    }

    @Override // defpackage.owf
    public final Object dL() {
        return this.a.dL();
    }

    public final String toString() {
        rwb rwbVar = new rwb("FilteredObs");
        rwbVar.a(this.a);
        return rwbVar.toString();
    }
}
