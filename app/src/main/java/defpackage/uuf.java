package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uuf extends uht implements uiu {
    int a;
    final /* synthetic */ urk[] b;
    final /* synthetic */ int c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ uqm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuf(urk[] urkVarArr, int i, AtomicInteger atomicInteger, uqm uqmVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = urkVarArr;
        this.c = i;
        this.d = atomicInteger;
        this.e = uqmVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uuf) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        AtomicInteger atomicInteger;
        uhi uhiVar = uhi.a;
        try {
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                urk[] urkVarArr = this.b;
                int i = this.c;
                urk urkVar = urkVarArr[i];
                uue uueVar = new uue(this.e, i);
                this.a = 1;
                if (urkVar.gc(uueVar, this) == uhiVar) {
                    return uhiVar;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.e.u(null);
            }
            return ufg.a;
        } finally {
            if (this.d.decrementAndGet() == 0) {
                this.e.u(null);
            }
        }
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new uuf(this.b, this.c, this.d, this.e, uhbVar);
    }
}
