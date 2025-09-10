package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atv extends uht implements uiu {
    int a;
    final /* synthetic */ abr b;
    final /* synthetic */ boolean c;
    final /* synthetic */ aby d;
    final /* synthetic */ uif e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atv(abr abrVar, boolean z, aby abyVar, uif uifVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = abrVar;
        this.c = z;
        this.d = abyVar;
        this.e = uifVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atv) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        atv atvVar;
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i != 0) {
            atvVar = this;
        } else {
            abr abrVar = this.b;
            Float f = new Float(true != this.c ? 0.0f : 1.0f);
            aby abyVar = this.d;
            this.a = 1;
            atvVar = this;
            if (abr.k(abrVar, f, abyVar, null, atvVar, 12) == uhiVar) {
                return uhiVar;
            }
        }
        atvVar.e.a();
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new atv(this.b, this.c, this.d, this.e, uhbVar);
    }
}
