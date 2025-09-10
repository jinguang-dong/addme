package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itq extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itq(got gotVar, afs afsVar, uiu uiuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.d = gotVar;
        this.b = afsVar;
        this.c = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((itq) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 1) {
            return ((itq) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((itq) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, uiu] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Exception {
        int i = this.e;
        if (i == 0) {
            uhi uhiVar = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
                return obj;
            }
            rnt.aN(obj);
            Object obj2 = this.b;
            Object obj3 = this.c;
            iue iueVar = (iue) this.d;
            itu ituVar = (itu) obj2;
            itp itpVar = new itp(ituVar, iueVar, null);
            this.a = 1;
            Object objV = ituVar.a.v((iuh) obj3, iueVar, itpVar, this);
            return objV == uhiVar ? uhiVar : objV;
        }
        if (i != 1) {
            uhi uhiVar2 = uhi.a;
            int i2 = this.a;
            rnt.aN(obj);
            if (i2 == 0) {
                Object obj4 = this.c;
                Object obj5 = this.d;
                Object obj6 = this.b;
                this.a = 1;
                if (((uub) obj4).e.a(obj5, obj6, this) == uhiVar2) {
                    return uhiVar2;
                }
            }
            return ufg.a;
        }
        uhi uhiVar3 = uhi.a;
        if (this.a != 0) {
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            Object obj7 = this.d;
            Object obj8 = this.b;
            ?? r3 = this.c;
            this.a = 1;
            got gotVar = (got) obj7;
            if (((byz) gotVar.a).n(gotVar.b, (afs) obj8, r3, this) == uhiVar3) {
                return uhiVar3;
            }
        }
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, url] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, uiu] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.e;
        if (i == 0) {
            Object obj2 = this.b;
            return new itq((itu) obj2, (iuh) this.c, (iue) this.d, uhbVar, 0);
        }
        if (i != 1) {
            return new itq((uub) this.c, (url) this.d, this.b, uhbVar, 2);
        }
        Object obj3 = this.d;
        return new itq((got) obj3, (afs) this.b, (uiu) this.c, uhbVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itq(itu ituVar, iuh iuhVar, iue iueVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = ituVar;
        this.c = iuhVar;
        this.d = iueVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itq(uub uubVar, url urlVar, Object obj, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = uubVar;
        this.d = urlVar;
        this.b = obj;
    }
}
