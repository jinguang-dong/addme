package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zh extends uhs implements uiu {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ zi f;
    final /* synthetic */ zk g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(zi ziVar, zk zkVar, uhb uhbVar) {
        super(uhbVar);
        this.f = ziVar;
        this.g = zkVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zh) c((ulk) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        ulk ulkVar;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        uhi uhiVar = uhi.a;
        if (this.e != 0) {
            i = this.d;
            obj3 = this.c;
            Object obj5 = this.b;
            obj2 = this.a;
            ulkVar = (ulk) this.h;
            rnt.aN(obj);
            obj4 = obj5;
        } else {
            rnt.aN(obj);
            ulkVar = (ulk) this.h;
            zi ziVar = this.f;
            obj2 = this.g;
            zq zqVar = ziVar.a;
            obj3 = zqVar.c;
            i = zqVar.e;
            obj4 = ziVar;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj3)[i] >> 31;
            ((zk) obj2).a = i;
            Object obj6 = ((zi) obj4).a.b[i];
            this.h = ulkVar;
            this.a = obj2;
            this.b = obj4;
            this.c = obj3;
            i = (int) (j & 2147483647L);
            this.d = i;
            this.e = 1;
            if (ulkVar.a(obj6, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        zh zhVar = new zh(this.f, this.g, uhbVar);
        zhVar.h = obj;
        return zhVar;
    }
}
