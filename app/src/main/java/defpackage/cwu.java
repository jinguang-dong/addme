package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cwu extends uht implements uiu {
    Object a;
    Object b;
    int c;
    final /* synthetic */ uiu d;
    final /* synthetic */ uxa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwu(uxa uxaVar, uiu uiuVar, uhb uhbVar) {
        super(2, uhbVar);
        this.e = uxaVar;
        this.d = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwu) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        uxa uxaVar;
        uiu uiuVar;
        Throwable th;
        Object obj2;
        uhi uhiVar = uhi.a;
        int i = this.c;
        try {
            if (i == 0) {
                rnt.aN(obj);
                uxaVar = this.e;
                uiu uiuVar2 = this.d;
                this.a = uxaVar;
                this.b = uiuVar2;
                this.c = 1;
                uiuVar = uiuVar2;
                if (uxaVar.b(this) != uhiVar) {
                }
                return uhiVar;
            }
            if (i != 1) {
                obj2 = this.a;
                try {
                    rnt.aN(obj);
                    ((uxa) obj2).d();
                    return ufg.a;
                } catch (Throwable th2) {
                    th = th2;
                    ((uxa) obj2).d();
                    throw th;
                }
            }
            Object obj3 = this.b;
            Object obj4 = this.a;
            rnt.aN(obj);
            uxaVar = obj4;
            uiuVar = obj3;
            cwt cwtVar = new cwt(uiuVar, (uhb) null, 0);
            this.a = uxaVar;
            this.b = null;
            this.c = 2;
            if (ung.i(cwtVar, this) != uhiVar) {
                obj2 = uxaVar;
                ((uxa) obj2).d();
                return ufg.a;
            }
            return uhiVar;
        } catch (Throwable th3) {
            uxa uxaVar2 = uxaVar;
            th = th3;
            obj2 = uxaVar2;
            ((uxa) obj2).d();
            throw th;
        }
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new cwu(this.e, this.d, uhbVar);
    }
}
