package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kkj implements lmc {
    final /* synthetic */ kkk a;

    public kkj(kkk kkkVar) {
        this.a = kkkVar;
    }

    @Override // defpackage.lmc
    public final void a(lmo lmoVar, ltd ltdVar) {
        lmc lmcVar = this.a.c;
        if (lmcVar != null) {
            lmcVar.a(lmoVar, ltdVar);
        }
    }

    @Override // defpackage.lmc
    public final void c(lmo lmoVar, lpa lpaVar) {
        lmc lmcVar = this.a.c;
        if (lmcVar != null) {
            lmcVar.c(lmoVar, lpaVar);
        }
    }

    @Override // defpackage.lmc
    public final void d(lmo lmoVar, ggg gggVar) {
        kkk kkkVar = this.a;
        lmc lmcVar = kkkVar.c;
        if (lmcVar != null) {
            lmcVar.d(lmoVar, gggVar);
        }
        int i = lmoVar.b;
        if (i == 1) {
            kkkVar.a = true;
        } else if (i == 2) {
            kkkVar.b = true;
        }
        if (kkkVar.a && kkkVar.b) {
            kkkVar.c = null;
        }
    }

    @Override // defpackage.lmc
    public final void b(lmo lmoVar) {
    }
}
