package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agn extends uht implements uiu {
    int a;
    final /* synthetic */ ago b;
    final /* synthetic */ ajs c;
    final /* synthetic */ agi d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn(ago agoVar, ajs ajsVar, agi agiVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = agoVar;
        this.c = ajsVar;
        this.d = agiVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agn) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        CancellationException cancellationException = null;
        try {
            try {
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    uol uolVarR = ujp.R(((und) this.e).c());
                    ago agoVar = this.b;
                    agoVar.h = true;
                    aji ajiVar = agoVar.b;
                    afs afsVar = afs.a;
                    agm agmVar = new agm(this.c, agoVar, this.d, uolVarR, null);
                    this.a = 1;
                    if (ajiVar.i(afsVar, agmVar, this) == uhiVar) {
                        return uhiVar;
                    }
                }
                Object obj2 = this.b.i.a;
                ukv ukvVarU = ukc.u(0, ((bdp) obj2).b);
                int i = ukvVarU.a;
                int i2 = ukvVarU.b;
                if (i <= i2) {
                    while (true) {
                        ((agl) ((bdp) obj2).a[i]).b.fW(ufg.a);
                        if (i == i2) {
                            break;
                        }
                        i++;
                    }
                }
                ((bdp) obj2).g();
                ago agoVar2 = this.b;
                agoVar2.h = false;
                agoVar2.i.aG(null);
                agoVar2.e = false;
                return ufg.a;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            ago agoVar3 = this.b;
            agoVar3.h = false;
            agoVar3.i.aG(cancellationException);
            agoVar3.e = false;
            throw th;
        }
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        agn agnVar = new agn(this.b, this.c, this.d, uhbVar);
        agnVar.e = obj;
        return agnVar;
    }
}
