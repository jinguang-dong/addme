package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bva extends bwi {
    private static final fnd h;
    public final bxa f;
    public bvu g;

    static {
        fnd fndVar = new fnd((char[]) null);
        fndVar.k(bkv.c);
        fndVar.r(1.0f);
        fndVar.s(1);
        h = fndVar;
    }

    public bva(bvm bvmVar) {
        super(bvmVar);
        bxa bxaVar = new bxa();
        this.f = bxaVar;
        bxaVar.s = this;
        this.g = bvmVar.h != null ? new buz(this) : null;
    }

    private final void C() {
        if (this.j) {
            return;
        }
        this.s.m().C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.bwi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(defpackage.bwg r12, long r13, defpackage.buy r15, int r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bva.A(bwg, long, buy, int, boolean):void");
    }

    @Override // defpackage.bwi
    public final void B(bku bkuVar, bmz bmzVar) throws Throwable {
        bvm bvmVar = this.s;
        bws bwsVarA = bvp.a(bvmVar);
        bdp bdpVarH = bvmVar.h();
        Object[] objArr = bdpVarH.a;
        int i = bdpVarH.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar2 = (bvm) objArr[i2];
            if (bvmVar2.ah()) {
                bvmVar2.A(bkuVar, bmzVar);
            }
        }
        if (bwsVarA.p()) {
            ax(bkuVar, h);
        }
    }

    @Override // defpackage.bru
    public final int c(int i) {
        ebn ebnVarAA = this.s.aA();
        bsr bsrVarK = ebnVarAA.k();
        bvm bvmVar = (bvm) ebnVarAA.a;
        return bsrVarK.a(bvmVar.o(), bvmVar.s(), i);
    }

    @Override // defpackage.bru
    public final int d(int i) {
        ebn ebnVarAA = this.s.aA();
        bsr bsrVarK = ebnVarAA.k();
        bvm bvmVar = (bvm) ebnVarAA.a;
        return bsrVarK.b(bvmVar.o(), bvmVar.s(), i);
    }

    @Override // defpackage.bwi, defpackage.bte
    public final void df(long j, uiq uiqVar) {
        super.df(j, uiqVar);
        C();
    }

    @Override // defpackage.bru
    public final int e(int i) {
        ebn ebnVarAA = this.s.aA();
        bsr bsrVarK = ebnVarAA.k();
        bvm bvmVar = (bvm) ebnVarAA.a;
        return bsrVarK.c(bvmVar.o(), bvmVar.s(), i);
    }

    @Override // defpackage.bru
    public final int f(int i) {
        ebn ebnVarAA = this.s.aA();
        bsr bsrVarK = ebnVarAA.k();
        bvm bvmVar = (bvm) ebnVarAA.a;
        return bsrVarK.d(bvmVar.o(), bvmVar.s(), i);
    }

    @Override // defpackage.bvt
    public final int p(bqv bqvVar) {
        bvu bvuVar = this.g;
        if (bvuVar != null) {
            return bvuVar.p(bqvVar);
        }
        bvz bvzVar = (bvz) W();
        if (!bvzVar.l) {
            if (bvzVar.F() == 1) {
                buf bufVar = bvzVar.v;
                bufVar.f = true;
                if (bufVar.b) {
                    bvzVar.y();
                }
            } else {
                bvzVar.v.g = true;
            }
        }
        bvzVar.j().k = true;
        bvzVar.l();
        bvzVar.j().k = false;
        Integer num = (Integer) bvzVar.v.h.get(bqvVar);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // defpackage.bsq
    public final bte r(long j) {
        if (this.u) {
            bvu bvuVar = this.g;
            bvuVar.getClass();
            j = bvuVar.d;
        }
        v(j);
        bvm bvmVar = this.s;
        bdp bdpVarI = bvmVar.i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bvm) objArr[i2]).m().E = 3;
        }
        an(bvmVar.n.e(this, bvmVar.s(), j));
        ah();
        return this;
    }

    @Override // defpackage.bwi, defpackage.bte
    public final void w(long j, bmz bmzVar) {
        super.w(j, bmzVar);
        C();
    }

    @Override // defpackage.bwi
    public final /* synthetic */ bij x() {
        return this.f;
    }

    @Override // defpackage.bwi
    public final bvu y() {
        return this.g;
    }

    @Override // defpackage.bwi
    public final void z() {
        if (this.g == null) {
            this.g = new buz(this);
        }
    }
}
