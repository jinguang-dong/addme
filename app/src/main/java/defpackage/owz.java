package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class owz implements oyk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public owz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.oyv
    public final void c(oyu oyuVar) {
        if (this.b == 0) {
            ((oxd) this.a).b();
        } else {
            ((sgt) mje.a.b().M(4830)).v("onEncoderError(): %s", oyuVar);
            ((mje) this.a).ac.b(3);
        }
    }

    @Override // defpackage.oyk
    public final void d() {
        if (this.b != 0) {
            ((mje) this.a).ac.b(6);
        } else {
            ((oxd) this.a).b();
        }
    }

    @Override // defpackage.oyk
    public final void e() {
        if (this.b != 0) {
            Object obj = this.a;
            mje mjeVar = (mje) obj;
            gcc gccVarE = mjeVar.B.e(ppo.f);
            oxd oxdVar = mjeVar.Z;
            oxdVar.getClass();
            oxdVar.a.l(gccVarE.e());
            mlb mlbVar = (mlb) mjeVar.D.get(0);
            mlbVar.getClass();
            mla mlaVar = new mla(mlbVar);
            mlaVar.d = gccVarE;
            mlaVar.c = rvk.a;
            mlaVar.c(mjeVar.C);
            mlaVar.e();
            mjeVar.W = mlaVar;
        }
    }

    @Override // defpackage.oyk
    public final void f() {
        if (this.b != 0) {
            ((mje) this.a).ac.b(5);
        } else {
            ((oxd) this.a).b();
        }
    }

    @Override // defpackage.oyk
    public final void g() {
        if (this.b != 0) {
            mje mjeVar = (mje) this.a;
            mjeVar.e();
            mjeVar.W.d(mjeVar.T);
            mjeVar.D.add(mjeVar.W.a());
        }
    }

    @Override // defpackage.oyk
    public final void h(long j, long j2) {
    }
}
