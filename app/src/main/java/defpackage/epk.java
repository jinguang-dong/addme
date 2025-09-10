package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class epk implements eyq {
    final /* synthetic */ epl a;
    private final eza b;

    public epk(epl eplVar, eza ezaVar) {
        this.a = eplVar;
        this.b = ezaVar;
    }

    @Override // defpackage.eyq
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                eza ezaVar = this.b;
                for (ezn eznVar : fax.f(ezaVar.a)) {
                    if (!eznVar.l() && !eznVar.k()) {
                        eznVar.c();
                        if (ezaVar.c) {
                            ezaVar.b.add(eznVar);
                        } else {
                            eznVar.b();
                        }
                    }
                }
            }
        }
    }
}
