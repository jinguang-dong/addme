package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbe implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public lbe(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.c != 0 ? b() : b();
    }

    public final peo b() {
        if (this.c != 0) {
            pfu pfuVar = (pfu) this.a.a();
            peq peqVar = (peq) this.b.a();
            pfuVar.getClass();
            peqVar.getClass();
            return pfuVar.a.a(peqVar);
        }
        pfu pfuVar2 = (pfu) this.a.a();
        peq peqVar2 = (peq) this.b.a();
        pfuVar2.getClass();
        peqVar2.getClass();
        return pfuVar2.a.a(peqVar2);
    }
}
