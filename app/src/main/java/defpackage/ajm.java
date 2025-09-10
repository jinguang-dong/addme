package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajm extends uht implements uiu {
    int a;
    final /* synthetic */ bqc b;
    final /* synthetic */ uiv c;
    final /* synthetic */ uiq d;
    final /* synthetic */ ail e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajm(bqc bqcVar, uiv uivVar, uiq uiqVar, ail ailVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = bqcVar;
        this.c = uivVar;
        this.d = uiqVar;
        this.e = ailVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajm) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            und undVar = (und) this.f;
            bqc bqcVar = this.b;
            ajl ajlVar = new ajl(undVar, this.c, this.d, this.e, null);
            this.a = 1;
            if (e.u(bqcVar, ajlVar, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        ajm ajmVar = new ajm(this.b, this.c, this.d, this.e, uhbVar);
        ajmVar.f = obj;
        return ajmVar;
    }
}
