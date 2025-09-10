package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zs extends uhs implements uiu {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ zt e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(zt ztVar, uhb uhbVar) {
        super(uhbVar);
        this.e = ztVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zs) c((ulk) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        ulk ulkVar;
        Object obj2;
        int i;
        Object obj3;
        uhi uhiVar = uhi.a;
        if (this.d != 0) {
            i = this.c;
            obj2 = this.b;
            Object obj4 = this.a;
            ulkVar = (ulk) this.f;
            rnt.aN(obj);
            obj3 = obj4;
        } else {
            rnt.aN(obj);
            ulkVar = (ulk) this.f;
            zq zqVar = this.e.b;
            Object obj5 = zqVar.b;
            obj2 = zqVar.c;
            i = zqVar.e;
            obj3 = obj5;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj2)[i] >> 31;
            Object obj6 = ((Object[]) obj3)[i];
            this.f = ulkVar;
            this.a = obj3;
            this.b = obj2;
            i = (int) (j & 2147483647L);
            this.c = i;
            this.d = 1;
            if (ulkVar.a(obj6, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        zs zsVar = new zs(this.e, uhbVar);
        zsVar.f = obj;
        return zsVar;
    }
}
