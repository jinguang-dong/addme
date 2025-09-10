package defpackage;

import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnr extends uht implements uiu {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnr(aus ausVar, float f, aby abyVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.d = ausVar;
        this.b = f;
        this.c = abyVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((dnr) c((rnu) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((dnr) c((aim) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [aby, java.lang.Object] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        aim aimVar;
        Throwable th;
        dnr dnrVar;
        Throwable th2;
        abr abrVarA;
        Float f;
        ?? r9;
        aff affVar;
        if (this.f == 0) {
            uhi uhiVar = uhi.a;
            int i = this.a;
            if (i == 0) {
                rnt.aN(obj);
                aimVar = (aim) this.e;
                Object obj2 = this.c;
                dnt dntVar = (dnt) obj2;
                ajd ajdVar = dntVar.a;
                acy acyVarBf = (ajdVar.d() && ajdVar.c()) ? byi.bf(0.0f, 0.0f, null, 7) : byi.bf(0.0f, 0.0f, new Float(0.3f), 3);
                abz abzVar = dntVar.c;
                Float f2 = new Float(this.b);
                boolean z = dntVar.b;
                ahg ahgVar = new ahg(obj2, this.d, aimVar, 4);
                this.e = aimVar;
                this.a = 1;
                if (byi.aX(abzVar, f2, acyVarBf, z, ahgVar, this) == uhiVar) {
                    return uhiVar;
                }
            } else {
                if (i != 1) {
                    rnt.aN(obj);
                    return ufg.a;
                }
                aimVar = (aim) this.e;
                rnt.aN(obj);
            }
            aim aimVar2 = aimVar;
            Object obj3 = this.d;
            Object obj4 = this.c;
            this.e = null;
            this.a = 2;
            if (((AmbientDelegate) obj3).o(aimVar2, 0.0f, null, ((dnt) obj4).a, this) == uhiVar) {
                return uhiVar;
            }
            return ufg.a;
        }
        uhi uhiVar2 = uhi.a;
        if (this.a != 0) {
            try {
                rnt.aN(obj);
                dnrVar = this;
            } catch (Throwable th3) {
                th = th3;
                dnrVar = this;
                aus ausVar = (aus) dnrVar.d;
                ausVar.c.b(null);
                ausVar.i(false);
                throw th;
            }
        } else {
            rnt.aN(obj);
            rnu rnuVar = (rnu) this.e;
            ujx ujxVar = new ujx();
            aus ausVar2 = (aus) this.d;
            ujxVar.a = ausVar2.l.e();
            float f3 = this.b;
            ausVar2.c.b(new Float(f3));
            ausVar2.i(true);
            try {
                abrVarA = abs.a(ujxVar.a);
                f = new Float(f3);
                r9 = this.c;
                affVar = new aff(rnuVar, ujxVar, 14);
                this.a = 1;
            } catch (Throwable th4) {
                th2 = th4;
                dnrVar = this;
            }
            try {
                obj = abr.k(abrVarA, f, r9, affVar, this, 4);
                dnrVar = this;
                if (obj == uhiVar2) {
                    return uhiVar2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                dnrVar = this;
                th = th2;
                aus ausVar3 = (aus) dnrVar.d;
                ausVar3.c.b(null);
                ausVar3.i(false);
                throw th;
            }
        }
        try {
            aus ausVar4 = (aus) dnrVar.d;
            ausVar4.c.b(null);
            ausVar4.i(false);
            return ufg.a;
        } catch (Throwable th6) {
            th2 = th6;
            th = th2;
            aus ausVar32 = (aus) dnrVar.d;
            ausVar32.c.b(null);
            ausVar32.i(false);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aby, java.lang.Object] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.f != 0) {
            dnr dnrVar = new dnr((aus) this.d, this.b, (aby) this.c, uhbVar, 1);
            dnrVar.e = obj;
            return dnrVar;
        }
        dnr dnrVar2 = new dnr((dnt) this.c, this.b, (AmbientDelegate) this.d, uhbVar, 0);
        dnrVar2.e = obj;
        return dnrVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnr(dnt dntVar, float f, AmbientDelegate ambientDelegate, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.c = dntVar;
        this.b = f;
        this.d = ambientDelegate;
    }
}
