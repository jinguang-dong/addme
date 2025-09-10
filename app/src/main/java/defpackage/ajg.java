package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajg extends uht implements uiu {
    Object a;
    Object b;
    long c;
    int d;
    final /* synthetic */ aji e;
    final /* synthetic */ ujz f;
    final /* synthetic */ long g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajg(aji ajiVar, ujz ujzVar, long j, uhb uhbVar) {
        super(2, uhbVar);
        this.e = ajiVar;
        this.f = ujzVar;
        this.g = j;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajg) c((rnu) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        aji ajiVar;
        long j;
        Object obj2;
        Object obj3;
        uhi uhiVar = uhi.a;
        if (this.d != 0) {
            j = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            ajiVar = (aji) this.h;
            rnt.aN(obj);
            obj3 = obj4;
            obj2 = obj5;
        } else {
            rnt.aN(obj);
            rnu rnuVar = (rnu) this.h;
            aji ajiVar2 = this.e;
            ajf ajfVar = new ajf(ajiVar2, rnuVar);
            ujz ujzVar = this.f;
            long j2 = this.g;
            apg apgVar = ajiVar2.k;
            long j3 = ujzVar.a;
            float fA = ajiVar2.a(ajiVar2.c == aii.b ? Float.intBitsToFloat((int) (j2 >> 32)) : Float.intBitsToFloat((int) (j2 & 4294967295L)));
            this.h = ajiVar2;
            this.a = ajiVar2;
            this.b = ujzVar;
            this.c = j3;
            this.d = 1;
            obj = apgVar.c(ajfVar, fA, this);
            if (obj == uhiVar) {
                return uhiVar;
            }
            ajiVar = ajiVar2;
            j = j3;
            obj3 = ujzVar;
            obj2 = ajiVar2;
        }
        float fA2 = ajiVar.a(((Number) obj).floatValue());
        ((ujz) obj3).a = ((aji) obj2).c == aii.b ? cif.b(j, fA2, 0.0f, 2) : cif.b(j, 0.0f, fA2, 1);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        ajg ajgVar = new ajg(this.e, this.f, this.g, uhbVar);
        ajgVar.h = obj;
        return ajgVar;
    }
}
