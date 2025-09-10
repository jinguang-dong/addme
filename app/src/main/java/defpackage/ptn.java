package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptn extends uht implements uiu {
    int a;

    public ptn(uhb uhbVar) {
        super(2, uhbVar);
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new ptn((uhb) obj2).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            this.a = 1;
            if (ung.d(this) == uhiVar) {
                return uhiVar;
            }
        }
        throw new uer();
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new ptn(uhbVar);
    }
}
