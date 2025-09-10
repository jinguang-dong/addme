package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ais implements uiu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ais(ahn ahnVar, ujz ujzVar, bqo bqoVar, int i) {
        this.d = i;
        this.c = ahnVar;
        this.a = ujzVar;
        this.b = bqoVar;
    }

    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        if (this.d == 0) {
            float fFloatValue = ((Float) obj).floatValue();
            ((Float) obj2).floatValue();
            ujx ujxVar = (ujx) this.a;
            float f = fFloatValue - ujxVar.a;
            aji ajiVar = (aji) this.b;
            ujxVar.a += ajiVar.a(ajiVar.b(((rnu) this.c).o(ajiVar.f(ajiVar.a(f)))));
            return ufg.a;
        }
        bpv bpvVar = (bpv) obj;
        bkf bkfVar = (bkf) obj2;
        ahn ahnVar = (ahn) this.c;
        bry bryVar = ahnVar.g;
        if (bryVar != null) {
            Object obj3 = this.a;
            long jT = byi.t(bryVar);
            ujz ujzVar = (ujz) obj3;
            long j = ujzVar.a;
            if (!a.q(jT, j)) {
                ahnVar.f = a.E(ahnVar.f, a.ac(jT, j));
            }
            ujzVar.a = jT;
        }
        akg.u((bqo) this.b, bpvVar, ahnVar.f);
        uqm uqmVar = ahnVar.d;
        if (uqmVar != null) {
            uqmVar.j(new agu(bkfVar.a));
        }
        return ufg.a;
    }

    public /* synthetic */ ais(ujx ujxVar, aji ajiVar, rnu rnuVar, int i) {
        this.d = i;
        this.a = ujxVar;
        this.b = ajiVar;
        this.c = rnuVar;
    }
}
