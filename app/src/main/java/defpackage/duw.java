package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duw extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duw(ado adoVar, bbo bboVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = adoVar;
        this.b = bboVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((duw) c((baf) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((duw) c((uqx) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [bbo, java.lang.Object] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.e != 0) {
            uhi uhiVar = uhi.a;
            int i = this.a;
            rnt.aN(obj);
            if (i == 0) {
                baf bafVar = (baf) this.d;
                Object obj2 = this.c;
                urk urkVarAi = byi.ai(new bol(obj2, 1));
                aaj aajVar = new aaj(bafVar, (ado) obj2, this.b);
                this.a = 1;
                if (urkVarAi.gc(aajVar, this) == uhiVar) {
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
            uqx uqxVar = (uqx) this.d;
            bn bnVar = new bn(uqxVar, 8);
            Object obj3 = this.b;
            Object obj4 = this.c;
            ((dux) obj3).a.a((Context) obj4, new oo(3), bnVar);
            aet aetVar = new aet(obj3, bnVar, 15, null);
            this.a = 1;
            if (ukc.N(uqxVar, aetVar, this) == uhiVar2) {
                return uhiVar2;
            }
        }
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [bbo, java.lang.Object] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.e != 0) {
            duw duwVar = new duw((ado) this.c, (bbo) this.b, uhbVar, 1);
            duwVar.d = obj;
            return duwVar;
        }
        duw duwVar2 = new duw((dux) this.b, (Activity) this.c, uhbVar, 0);
        duwVar2.d = obj;
        return duwVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duw(dux duxVar, Activity activity, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = duxVar;
        this.c = activity;
    }
}
