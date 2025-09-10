package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eta implements equ {
    final /* synthetic */ etb a;
    final /* synthetic */ tdy b;

    public eta(etb etbVar, tdy tdyVar) {
        this.b = tdyVar;
        this.a = etbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [eqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eqv, java.lang.Object] */
    @Override // defpackage.equ
    public final void b(Object obj) {
        etb etbVar = this.a;
        tdy tdyVar = this.b;
        if (etbVar.e(tdyVar)) {
            esh eshVar = etbVar.a.o;
            if (obj != null && eshVar.c(tdyVar.b.g())) {
                etbVar.c = obj;
                ((esa) etbVar.b).f(2);
            } else {
                erw erwVar = etbVar.b;
                ?? r1 = tdyVar.c;
                ?? r3 = tdyVar.b;
                erwVar.d(r1, obj, r3, r3.g(), etbVar.d);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [eqv, java.lang.Object] */
    @Override // defpackage.equ
    public final void e(Exception exc) {
        etb etbVar = this.a;
        tdy tdyVar = this.b;
        if (etbVar.e(tdyVar)) {
            erv ervVar = etbVar.d;
            ?? r3 = tdyVar.b;
            etbVar.b.b(ervVar, exc, r3, r3.g());
        }
    }
}
