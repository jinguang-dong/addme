package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tk extends uht implements uiu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(tm tmVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
        this.a = tmVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return ((tk) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 1) {
            return ((tk) c((ufg) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((tk) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        int i = this.b;
        if (i == 0) {
            rnt.aN(obj);
            ((tm) this.a).i();
            return ufg.a;
        }
        if (i != 1) {
            rnt.aN(obj);
            ((uka) this.a).a = null;
            return ufg.a;
        }
        rnt.aN(obj);
        ((tm) this.a).i();
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? new tk((uka) this.a, uhbVar, 2) : new tk((tm) this.a, uhbVar, 1, null) : new tk((tm) this.a, uhbVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(tm tmVar, uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.b = i;
        this.a = tmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(uka ukaVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
        this.a = ukaVar;
    }
}
