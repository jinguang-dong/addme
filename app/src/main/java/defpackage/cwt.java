package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cwt extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwt(uiu uiuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((cwt) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 1) {
            return ((cwt) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 2) {
            return ((cwt) c((url) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 3) {
            return ((cwt) c(obj, (uhb) obj2)).b(ufg.a);
        }
        return ((cwt) c((url) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, url] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, uqm] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        Throwable th;
        uol uolVar;
        int i = this.d;
        if (i == 0) {
            uhi uhiVar = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                und undVar = (und) this.c;
                ?? r2 = this.b;
                this.a = 1;
                if (r2.a(undVar, this) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        if (i == 1) {
            uhi uhiVar2 = uhi.a;
            if (this.a != 0) {
                uolVar = (uol) this.c;
                try {
                    rnt.aN(obj);
                } catch (Throwable th2) {
                    th = th2;
                    uolVar.s(null);
                    throw th;
                }
            } else {
                rnt.aN(obj);
                uol uolVarC = ukc.C((und) this.c, null, 0, new doe(null, 1, null), 3);
                try {
                    ?? r22 = this.b;
                    this.c = uolVarC;
                    this.a = 1;
                    Object objD = r22.d(this);
                    if (objD == uhiVar2) {
                        return uhiVar2;
                    }
                    obj = objD;
                    uolVar = uolVarC;
                } catch (Throwable th3) {
                    th = th3;
                    uolVar = uolVarC;
                    uolVar.s(null);
                    throw th;
                }
            }
            aia aiaVar = (aia) obj;
            uolVar.s(null);
            return aiaVar;
        }
        if (i == 2) {
            uhi uhiVar3 = uhi.a;
            if (this.a == 0) {
                rnt.aN(obj);
                url urlVar = (url) this.c;
                ujw ujwVar = new ujw();
                Object obj2 = this.b;
                utf utfVar = new utf(ujwVar, urlVar);
                this.a = 1;
                if (usx.f((usx) obj2, utfVar, this) == uhiVar3) {
                    return uhiVar3;
                }
            } else {
                rnt.aN(obj);
            }
            throw new uer();
        }
        if (i != 3) {
            uhi uhiVar4 = uhi.a;
            int i2 = this.a;
            rnt.aN(obj);
            if (i2 == 0) {
                Object obj3 = this.c;
                ?? r23 = this.b;
                this.a = 1;
                if (r23.a(obj3, this) == uhiVar4) {
                    return uhiVar4;
                }
            }
            return ufg.a;
        }
        uhi uhiVar5 = uhi.a;
        if (this.a != 0) {
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            url urlVar2 = (url) this.c;
            Object obj4 = this.b;
            this.a = 1;
            if (((utx) obj4).g(urlVar2, this) == uhiVar5) {
                return uhiVar5;
            }
        }
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, utj] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, url] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.d;
        if (i == 0) {
            cwt cwtVar = new cwt((uiu) this.b, uhbVar, 0);
            cwtVar.c = obj;
            return cwtVar;
        }
        if (i == 1) {
            cwt cwtVar2 = new cwt((uqm) this.b, uhbVar, 1);
            cwtVar2.c = obj;
            return cwtVar2;
        }
        if (i == 2) {
            cwt cwtVar3 = new cwt((utj) this.b, uhbVar, 2);
            cwtVar3.c = obj;
            return cwtVar3;
        }
        if (i != 3) {
            cwt cwtVar4 = new cwt((url) this.b, uhbVar, 4);
            cwtVar4.c = obj;
            return cwtVar4;
        }
        cwt cwtVar5 = new cwt((utx) this.b, uhbVar, 3);
        cwtVar5.c = obj;
        return cwtVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwt(uqm uqmVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = uqmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwt(url urlVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = urlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwt(utj utjVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = utjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwt(utx utxVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = utxVar;
    }
}
