package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkk extends poh {
    final /* synthetic */ pkn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkk(pkn pknVar, poo pooVar) {
        super(pooVar);
        this.a = pknVar;
    }

    private final pkm j(poj pojVar) {
        pkn pknVar = this.a;
        synchronized (pknVar.b) {
            if (!pknVar.e && !pknVar.c && pojVar != null) {
                pknVar.d++;
                return new pkm(pknVar, pojVar);
            }
            if (pojVar == null) {
                return null;
            }
            pojVar.close();
            return null;
        }
    }

    @Override // defpackage.poh, defpackage.poo
    public final poj f() {
        return j(super.f());
    }

    @Override // defpackage.poh, defpackage.poo
    public final poj g() {
        return j(super.g());
    }
}
