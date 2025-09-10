package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqr extends uht implements uiu {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqr(abr abrVar, float f, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = abrVar;
        this.b = f;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((dqr) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 1) {
            return ((dqr) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((dqr) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        aci aciVar;
        int i = this.d;
        if (i == 0) {
            uhi uhiVar = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                Object obj2 = this.c;
                float f = this.b;
                Float f2 = new Float(f);
                if (f > 0.5f) {
                    aci aciVar2 = dsi.a;
                    aciVar = dsi.a;
                } else {
                    aci aciVar3 = dsi.a;
                    aciVar = dsi.b;
                }
                adt adtVarBg = byi.bg(250, 0, aciVar, 2);
                this.a = 1;
                if (abr.k((abr) obj2, f2, adtVarBg, null, this, 12) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        if (i != 1) {
            uhi uhiVar2 = uhi.a;
            int i2 = this.a;
            rnt.aN(obj);
            if (i2 == 0) {
                Object obj3 = this.c;
                Float f3 = new Float(this.b);
                aci aciVar4 = dsi.a;
                adt adtVarBg2 = byi.bg(200, 0, dsi.a, 2);
                this.a = 1;
                if (abr.k((abr) obj3, f3, adtVarBg2, null, this, 12) == uhiVar2) {
                    return uhiVar2;
                }
            }
            return ufg.a;
        }
        uhi uhiVar3 = uhi.a;
        if (this.a != 0) {
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            Object obj4 = this.c;
            float f4 = this.b;
            this.a = 1;
            aus ausVar = (aus) obj4;
            Object objGc = ausVar.e.gc(new auk(ausVar, f4), this);
            if (objGc != uhiVar3) {
                objGc = ufg.a;
            }
            if (objGc == uhiVar3) {
                return uhiVar3;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.d;
        if (i == 0) {
            return new dqr((abr) this.c, this.b, uhbVar, 0);
        }
        if (i != 1) {
            return new dqr((abr) this.c, this.b, uhbVar, 2, null);
        }
        return new dqr((aus) this.c, this.b, uhbVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqr(abr abrVar, float f, uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.d = i;
        this.c = abrVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqr(aus ausVar, float f, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = ausVar;
        this.b = f;
    }
}
