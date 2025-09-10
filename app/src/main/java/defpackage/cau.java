package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cau extends uht implements uiu {
    int a;
    /* synthetic */ float b;
    final /* synthetic */ cav c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cau(cav cavVar, uhb uhbVar) {
        super(2, uhbVar);
        this.c = cavVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cau) c(Float.valueOf(((Number) obj).floatValue()), (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            float f = this.b;
            cbr cbrVar = this.c.a;
            uiu uiuVarQ = blb.q(cbrVar);
            if (uiuVarQ == null) {
                bqs.a("Required value was null.");
                throw new uer();
            }
            bkf bkfVar = new bkf((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.a = 1;
            obj = uiuVarQ.a(bkfVar, this);
            if (obj == uhiVar) {
                return uhiVar;
            }
        }
        return new Float(Float.intBitsToFloat((int) (((bkf) obj).a & 4294967295L)));
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        cau cauVar = new cau(this.c, uhbVar);
        cauVar.b = ((Number) obj).floatValue();
        return cauVar;
    }
}
