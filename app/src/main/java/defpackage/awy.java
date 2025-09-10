package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awy extends uht implements uiu {
    final /* synthetic */ awz a;
    final /* synthetic */ apu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awy(awz awzVar, apu apuVar, uhb uhbVar) {
        super(2, uhbVar);
        this.a = awzVar;
        this.b = apuVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awy) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        und undVar = (und) this.c;
        awz awzVar = this.a;
        apu apuVar = this.b;
        ukc.C(undVar, null, 0, new aej(awzVar, apuVar, (uhb) null, 16), 3);
        ukc.C(undVar, null, 0, new aej(awzVar, apuVar, (uhb) null, 17, (byte[]) null), 3);
        ukc.C(undVar, null, 0, new aej(awzVar, apuVar, (uhb) null, 18, (char[]) null), 3);
        return ukc.C(undVar, null, 0, new aej(awzVar, apuVar, (uhb) null, 19, (short[]) null), 3);
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        awy awyVar = new awy(this.a, this.b, uhbVar);
        awyVar.c = obj;
        return awyVar;
    }
}
