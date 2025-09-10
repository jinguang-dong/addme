package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abj extends uht implements uiu {
    int a;
    final /* synthetic */ abi b;
    final /* synthetic */ long c;
    final /* synthetic */ abl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abj(abi abiVar, long j, abl ablVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = abiVar;
        this.c = j;
        this.d = ablVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abj) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            abi abiVar = this.b;
            cia ciaVar = new cia(this.c);
            aby abyVar = this.d.a;
            this.a = 1;
            obj = abr.k(abiVar.a, ciaVar, abyVar, null, this, 12);
            if (obj == uhiVar) {
                return uhiVar;
            }
        }
        int i2 = ((abw) obj).a;
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new abj(this.b, this.c, this.d, uhbVar);
    }
}
