package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqc extends uht implements uiu {
    int a;
    /* synthetic */ float b;
    final /* synthetic */ aby c;
    final /* synthetic */ bbb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqc(bbb bbbVar, aby abyVar, uhb uhbVar) {
        super(2, uhbVar);
        this.d = bbbVar;
        this.c = abyVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqc) c(Float.valueOf(((Number) obj).floatValue()), (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            float f = this.b;
            bbb bbbVar = this.d;
            aby abyVar = this.c;
            float fE = bbbVar.e();
            aqh aqhVar = new aqh(bbbVar, 3);
            this.a = 1;
            if (byi.ba(fE, f, abyVar, aqhVar, this, 4) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        dqc dqcVar = new dqc(this.d, this.c, uhbVar);
        dqcVar.b = ((Number) obj).floatValue();
        return dqcVar;
    }
}
