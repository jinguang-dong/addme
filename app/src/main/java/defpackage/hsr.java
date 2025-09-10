package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsr extends kro {
    public huw a = huw.a;
    public krj b;
    private final owq c;
    private final out d;
    private final owf e;
    private final fdq f;

    public hsr(owq owqVar, fdq fdqVar, out outVar, owf owfVar) {
        this.c = owqVar;
        this.f = fdqVar;
        this.d = outVar;
        this.e = owfVar;
    }

    private final huv m(ksa ksaVar) {
        return huw.c((huw) this.e.dL(), ksaVar != ksa.SERENGETI_MODE_ALTERNATE).a(false);
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.serengeti_direction;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        ksaVar.getClass();
        return m(ksaVar).g;
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        ksaVar.getClass();
        return m(ksaVar).f;
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.serengeti_direction;
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        ksaVar.getClass();
        return m(ksaVar).e;
    }

    @Override // defpackage.krz
    public final krs h() {
        return krs.SERENGETI_MODE;
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.c;
    }

    @Override // defpackage.krz
    public final sbp l() {
        sbp sbpVarM = sbp.m(ksa.SERENGETI_MODE_ALTERNATE, ksa.SERENGETI_MODE_DEFAULT);
        sbpVarM.getClass();
        return sbpVarM;
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        this.f.j().d(this.e.dK(new hdg(this, 9), this.d));
        this.b = krjVar;
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        krjVar.getClass();
        return krjVar.d() == nkw.SERENGETI;
    }
}
