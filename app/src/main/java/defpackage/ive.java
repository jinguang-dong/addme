package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ive implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public ive(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pdn a() {
        pfu pfuVar = (pfu) this.a.a();
        rwc rwcVar = (rwc) this.b.a();
        our ourVar = (our) this.c.a();
        pfuVar.getClass();
        rwc rwcVarB = rwcVar.b(new fym(pfuVar, 14)).b(new fym(pfuVar, 15));
        rnt.M(rwcVarB.h(), "Analysis stream not present.");
        pdn pdnVar = (pdn) rwcVarB.c();
        ourVar.d(pdnVar);
        return pdnVar;
    }
}
