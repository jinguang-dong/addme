package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ovy implements pau {
    private final pau a;
    private final Executor b;
    private final our c;
    private our d;

    public ovy(pau pauVar, Executor executor, our ourVar) {
        this.a = pauVar;
        this.b = executor;
        this.c = ourVar;
        this.d = ourVar.c();
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        our ourVar = this.c;
        our ourVar2 = this.d;
        our ourVarC = ourVar.c();
        this.d = ourVarC;
        ourVarC.d(((owf) obj).dK(this.a, this.b));
        ourVar2.close();
    }
}
