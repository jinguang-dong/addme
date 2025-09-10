package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koz implements owq {
    public final kgw a;
    private final boolean b;
    private final koy c;
    private final koy d;

    public koz(owq owqVar, owq owqVar2, kgw kgwVar, kox koxVar) {
        this.a = kgwVar;
        this.c = new koy(owqVar, koxVar);
        this.d = new koy(owqVar2, koxVar);
        this.b = kgwVar.I();
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        kox koxVar = (kox) obj;
        if (this.a.l() == pka.FRONT) {
            this.d.a(koxVar);
        } else {
            this.c.a(koxVar);
        }
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        our ourVar = new our();
        ourVar.d(this.c.dK(new fun(this, pauVar, 11), executor));
        ourVar.d(this.d.dK(new fun(this, pauVar, 12), executor));
        return ourVar;
    }

    @Override // defpackage.owf
    public final /* bridge */ /* synthetic */ Object dL() {
        return !this.b ? kox.OFF : this.a.l() == pka.FRONT ? (kox) this.d.dL() : (kox) this.c.dL();
    }
}
