package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adm extends uht implements uiu {
    float a;
    int b;
    final /* synthetic */ ado c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adm(ado adoVar, uhb uhbVar) {
        super(2, uhbVar);
        this.c = adoVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adm) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        und undVar;
        final float fAV;
        uhi uhiVar = uhi.a;
        if (this.b != 0) {
            fAV = this.a;
            undVar = (und) this.d;
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            undVar = (und) this.d;
            fAV = byi.aV(undVar.c());
        }
        while (ung.l(undVar)) {
            final ado adoVar = this.c;
            uiq uiqVar = new uiq() { // from class: adl
                @Override // defpackage.uiq
                public final Object a(Object obj2) {
                    long jLongValue = ((Long) obj2).longValue();
                    ado adoVar2 = adoVar;
                    if (!adoVar2.r()) {
                        if (adoVar2.c() == Long.MIN_VALUE) {
                            adoVar2.i(jLongValue);
                        }
                        float f = fAV;
                        long jC = jLongValue - adoVar2.c();
                        boolean z = f != 0.0f;
                        if (f != 0.0f) {
                            jC = ukj.y(jC / f);
                        }
                        adoVar2.j(jC);
                        adoVar2.g(jC, !z);
                    }
                    return ufg.a;
                }
            };
            this.d = undVar;
            this.a = fAV;
            this.b = 1;
            if (bay.o(uiqVar, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        adm admVar = new adm(this.c, uhbVar);
        admVar.d = obj;
        return admVar;
    }
}
