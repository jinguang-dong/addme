package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class utu extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utu(umr umrVar, uiu uiuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = umrVar;
        this.b = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((utu) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 1) {
            return ((utu) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((utu) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, url] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, url] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        Throwable th;
        Object obj2;
        int i = this.e;
        if (i == 0) {
            Object obj3 = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                und undVar = (und) this.d;
                ?? r2 = this.b;
                uqz uqzVarE = ((utw) this.c).e(undVar);
                this.a = 1;
                Object objK = ukc.K(r2, uqzVarE, true, this);
                if (objK != obj3) {
                    objK = ufg.a;
                }
                if (objK == obj3) {
                    return obj3;
                }
            }
            return ufg.a;
        }
        if (i != 1) {
            uhi uhiVar = uhi.a;
            int i2 = this.a;
            rnt.aN(obj);
            if (i2 == 0) {
                und undVar2 = (und) this.d;
                uka ukaVar = new uka();
                uub uubVar = (uub) this.c;
                uua uuaVar = new uua(ukaVar, undVar2, uubVar, this.b);
                this.a = 1;
                if (uubVar.d.gc(uuaVar, this) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        uhi uhiVar2 = uhi.a;
        if (this.a != 0) {
            obj2 = (umr) this.d;
            try {
                rnt.aN(obj);
            } catch (Throwable th2) {
                th = th2;
                obj = rnt.aM(th);
                ung.p((umr) obj2, obj);
                return ufg.a;
            }
        } else {
            rnt.aN(obj);
            und undVar3 = (und) this.d;
            Object obj4 = this.c;
            ?? r3 = this.b;
            try {
                this.d = obj4;
                this.a = 1;
                obj = r3.a(undVar3, this);
                if (obj == uhiVar2) {
                    return uhiVar2;
                }
                obj2 = obj4;
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj4;
                obj = rnt.aM(th);
                ung.p((umr) obj2, obj);
                return ufg.a;
            }
        }
        ung.p((umr) obj2, obj);
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, url] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, url] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.e;
        if (i == 0) {
            utu utuVar = new utu((url) this.b, (utw) this.c, uhbVar, 0);
            utuVar.d = obj;
            return utuVar;
        }
        if (i != 1) {
            utu utuVar2 = new utu((uub) this.c, (url) this.b, uhbVar, 2);
            utuVar2.d = obj;
            return utuVar2;
        }
        utu utuVar3 = new utu((umr) this.c, (uiu) this.b, uhbVar, 1);
        utuVar3.d = obj;
        return utuVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utu(url urlVar, utw utwVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = urlVar;
        this.c = utwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utu(uub uubVar, url urlVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = uubVar;
        this.b = urlVar;
    }
}
