package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovz implements owf {
    private final owf a;

    private ovz(owf owfVar) {
        this.a = owfVar;
    }

    public static owf a(owf owfVar) {
        return owb.a(new ovz(owfVar));
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        our ourVar = new our();
        owr owrVar = new owr();
        ourVar.d(this.a.dK(new ovy(pauVar, executor, ourVar), owrVar));
        return ourVar;
    }

    @Override // defpackage.owf
    public final Object dL() {
        return ((owf) this.a.dL()).dL();
    }

    public final String toString() {
        rwb rwbVar = new rwb("DerefObs");
        rwbVar.a(this.a);
        return rwbVar.toString();
    }
}
