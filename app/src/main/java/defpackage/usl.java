package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class usl extends uht implements uiu {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ urk c;
    final /* synthetic */ usr d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usl(urk urkVar, usr usrVar, Object obj, uhb uhbVar) {
        super(2, uhbVar);
        this.c = urkVar;
        this.d = usrVar;
        this.e = obj;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((usl) c((uta) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            int iOrdinal = ((uta) this.b).ordinal();
            if (iOrdinal == 0) {
                urk urkVar = this.c;
                usr usrVar = this.d;
                this.a = 1;
                if (urkVar.gc(usrVar, this) == uhiVar) {
                    return uhiVar;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new uet();
                }
                Object obj2 = this.e;
                if (obj2 == usy.a) {
                    this.d.gd();
                } else {
                    this.d.d(obj2);
                }
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        usl uslVar = new usl(this.c, this.d, this.e, uhbVar);
        uslVar.b = obj;
        return uslVar;
    }
}
