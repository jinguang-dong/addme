package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class utv extends uht implements uiu {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utv(List list, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = list;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((utv) c((crb) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((utv) c((uqx) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.d == 0) {
            uhi uhiVar = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                uqx uqxVar = (uqx) this.b;
                Object obj2 = this.c;
                this.a = 1;
                if (((utw) obj2).b(uqxVar, this) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        uhi uhiVar2 = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            crb crbVar = (crb) this.b;
            ?? r2 = this.c;
            cpe cpeVar = cqy.a;
            this.a = 1;
            if (cpeVar.d(r2, crbVar, this) == uhiVar2) {
                return uhiVar2;
            }
        }
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.d != 0) {
            utv utvVar = new utv((List) this.c, uhbVar, 1);
            utvVar.b = obj;
            return utvVar;
        }
        utv utvVar2 = new utv((utw) this.c, uhbVar, 0);
        utvVar2.b = obj;
        return utvVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utv(utw utwVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = utwVar;
    }
}
