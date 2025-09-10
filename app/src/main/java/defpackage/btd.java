package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class btd implements chq {
    public boolean a;

    public static /* synthetic */ void q(btd btdVar, bte bteVar, int i, int i2) {
        btdVar.p(bteVar);
        bteVar.df(chy.d((i2 & 4294967295L) | (i << 32), bteVar.e), null);
    }

    public static /* synthetic */ void s(btd btdVar, bte bteVar, int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        if (btdVar.n() == cib.a || btdVar.l() == 0) {
            btdVar.p(bteVar);
            bteVar.df(chy.d(j, bteVar.e), null);
            return;
        }
        int iL = btdVar.l() - bteVar.a;
        int iA = chy.a(j);
        btdVar.p(bteVar);
        bteVar.df(chy.d((chy.b(j) & 4294967295L) | ((iL - iA) << 32), bteVar.e), null);
    }

    public static /* synthetic */ void t(btd btdVar, bte bteVar, int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        uiq uiqVar = btf.a;
        if (btdVar.n() == cib.a || btdVar.l() == 0) {
            btdVar.p(bteVar);
            bteVar.df(chy.d(j, bteVar.e), uiqVar);
            return;
        }
        int iL = btdVar.l() - bteVar.a;
        int iA = chy.a(j);
        btdVar.p(bteVar);
        bteVar.df(chy.d((chy.b(j) & 4294967295L) | ((iL - iA) << 32), bteVar.e), uiqVar);
    }

    public static /* synthetic */ void v(btd btdVar, bte bteVar, int i, int i2, uiq uiqVar, int i3) {
        if ((i3 & 8) != 0) {
            uiqVar = btf.a;
        }
        btdVar.u(bteVar, i, i2, uiqVar);
    }

    public static /* synthetic */ void y(btd btdVar, bte bteVar, long j, uiq uiqVar, int i) {
        if ((i & 4) != 0) {
            uiqVar = btf.a;
        }
        btdVar.w(bteVar, j, uiqVar);
    }

    @Override // defpackage.chq
    public float a() {
        throw null;
    }

    @Override // defpackage.chw
    public float b() {
        throw null;
    }

    @Override // defpackage.chw
    public final /* synthetic */ float dg(long j) {
        return chp.J(this, j);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dh(float f) {
        return chp.L(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float di(int i) {
        return chp.M(this, i);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dj(long j) {
        return chp.N(this, j);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dk(float f) {
        return chp.O(this, f);
    }

    @Override // defpackage.chq
    /* renamed from: do */
    public final /* synthetic */ int mo0do(float f) {
        return chp.P(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dp(long j) {
        return chp.Q(this, j);
    }

    @Override // defpackage.chw
    public final /* synthetic */ long dq(float f) {
        return chp.K(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dr(float f) {
        return chp.R(this, f);
    }

    public abstract int l();

    public bry m() {
        throw null;
    }

    public abstract cib n();

    public float o(btk btkVar) {
        return Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(bte bteVar) {
        if (bteVar instanceof bwb) {
            ((bwb) bteVar).N(this.a);
        }
    }

    public final void r(bte bteVar, long j) {
        p(bteVar);
        bteVar.df(chy.d(j, bteVar.e), null);
    }

    public final void u(bte bteVar, int i, int i2, uiq uiqVar) {
        p(bteVar);
        bteVar.df(chy.d((i2 & 4294967295L) | (i << 32), bteVar.e), uiqVar);
    }

    public final void w(bte bteVar, long j, uiq uiqVar) {
        p(bteVar);
        bteVar.df(chy.d(j, bteVar.e), uiqVar);
    }

    public final void x(bte bteVar, long j, bmz bmzVar) {
        p(bteVar);
        bteVar.w(chy.d(j, bteVar.e), bmzVar);
    }
}
