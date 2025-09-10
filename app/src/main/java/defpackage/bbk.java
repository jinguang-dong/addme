package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbk extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbk(uiu uiuVar, azr azrVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = uiuVar;
        this.c = azrVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((bbk) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((bbk) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r3v0, types: [azr, java.lang.Object] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.e != 0) {
            uhi uhiVar = uhi.a;
            int i = this.a;
            rnt.aN(obj);
            if (i == 0) {
                und undVar = (und) this.d;
                ?? r2 = this.b;
                Object obj2 = this.c;
                this.a = 1;
                if (r2.a(undVar, obj2, this) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        uhi uhiVar2 = uhi.a;
        if (this.a != 0) {
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            und undVar2 = (und) this.d;
            ?? r22 = this.b;
            baf bafVar = new baf(this.c, undVar2.c());
            this.a = 1;
            if (r22.a(bafVar, this) == uhiVar2) {
                return uhiVar2;
            }
        }
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r3v1, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [azo, java.lang.Object] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.e != 0) {
            bbk bbkVar = new bbk((uiv) this.b, (azo) this.c, uhbVar, 1);
            bbkVar.d = obj;
            return bbkVar;
        }
        bbk bbkVar2 = new bbk((uiu) this.b, (azr) this.c, uhbVar, 0);
        bbkVar2.d = obj;
        return bbkVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbk(uiv uivVar, azo azoVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = uivVar;
        this.c = azoVar;
    }
}
