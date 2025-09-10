package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agp extends uht implements uiu {
    Object a;
    Object b;
    int c;
    final /* synthetic */ float d;
    final /* synthetic */ aim e;
    final /* synthetic */ apg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agp(float f, apg apgVar, aim aimVar, uhb uhbVar) {
        super(2, uhbVar);
        this.d = f;
        this.f = apgVar;
        this.e = aimVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agp) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        float f;
        abz abzVar;
        Object obj2;
        Object obj3;
        Object objAW;
        Object obj4 = uhi.a;
        if (this.c != 0) {
            obj3 = this.b;
            obj2 = this.a;
            try {
                rnt.aN(obj);
            } catch (CancellationException unused) {
                ((ujx) obj2).a = ((Number) ((abz) obj3).b()).floatValue();
                f = ((ujx) obj2).a;
                return new Float(f);
            }
            f = ((ujx) obj2).a;
        } else {
            rnt.aN(obj);
            float f2 = this.d;
            if (Math.abs(f2) > 1.0f) {
                ujx ujxVar = new ujx();
                ujxVar.a = f2;
                ujx ujxVar2 = new ujx();
                abz abzVarBd = byi.bd(f2, 28);
                try {
                    apg apgVar = this.f;
                    Object obj5 = apgVar.c;
                    ahz ahzVar = new ahz(ujxVar2, this.e, ujxVar, apgVar, 1);
                    this.a = ujxVar;
                    this.b = abzVarBd;
                    this.c = 1;
                    abzVar = abzVarBd;
                    try {
                        objAW = byi.aW(abzVar, new acj((ocq) obj5, abzVarBd.e, abzVarBd.a(), abzVarBd.a), Long.MIN_VALUE, ahzVar, this);
                        if (objAW != obj4) {
                            objAW = ufg.a;
                        }
                    } catch (CancellationException unused2) {
                        obj2 = ujxVar;
                        obj3 = abzVar;
                        ((ujx) obj2).a = ((Number) ((abz) obj3).b()).floatValue();
                        f = ((ujx) obj2).a;
                        return new Float(f);
                    }
                } catch (CancellationException unused3) {
                    abzVar = abzVarBd;
                }
                if (objAW == obj4) {
                    return obj4;
                }
                obj2 = ujxVar;
                f = ((ujx) obj2).a;
            } else {
                f = this.d;
            }
        }
        return new Float(f);
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new agp(this.d, this.f, this.e, uhbVar);
    }
}
