package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvh extends bwi {
    private static final fnd E;
    private brb D;
    public bve f;
    public cho g;
    public bvu h;

    static {
        fnd fndVar = new fnd((char[]) null);
        fndVar.k(bkv.d);
        fndVar.r(1.0f);
        fndVar.s(1);
        E = fndVar;
    }

    public bvh(bvm bvmVar, bve bveVar) {
        super(bvmVar);
        this.f = bveVar;
        this.h = bvmVar.h != null ? new bvf(this) : null;
        this.D = (bveVar.B().n & 512) != 0 ? new brb(this, (bqz) bveVar) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ay() {
        /*
            r7 = this;
            boolean r0 = r7.j
            if (r0 == 0) goto L5
            return
        L5:
            r7.ai()
            brb r0 = r7.D
            r1 = 0
            if (r0 == 0) goto L5f
            bqz r2 = r0.b
            bvu r3 = r7.h
            r3.getClass()
            boolean r2 = r2.h()
            if (r2 != 0) goto L58
            boolean r0 = r0.c
            if (r0 != 0) goto L58
            long r2 = r7.c
            bvu r0 = r7.h
            r4 = 0
            if (r0 == 0) goto L2f
            long r5 = r0.x()
            cia r0 = new cia
            r0.<init>(r5)
            goto L30
        L2f:
            r0 = r4
        L30:
            boolean r0 = defpackage.cia.b(r2, r0)
            if (r0 == 0) goto L58
            bwi r0 = r7.C()
            long r2 = r0.c
            bwi r0 = r7.C()
            bvu r0 = r0.y()
            if (r0 == 0) goto L50
            long r4 = r0.x()
            cia r0 = new cia
            r0.<init>(r4)
            r4 = r0
        L50:
            boolean r0 = defpackage.cia.b(r2, r4)
            if (r0 == 0) goto L58
            r0 = 1
            goto L59
        L58:
            r0 = r1
        L59:
            bwi r2 = r7.C()
            r2.t = r0
        L5f:
            bss r0 = r7.G()
            r0.f()
            bwi r7 = r7.C()
            r7.t = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvh.ay():void");
    }

    @Override // defpackage.bwi
    public final void B(bku bkuVar, bmz bmzVar) {
        bwi bwiVar;
        C().Z(bkuVar, bmzVar);
        if (!bvp.a(this.s).p() || (bwiVar = this.v) == null) {
            return;
        }
        if (a.q(this.c, bwiVar.c) && a.q(bwiVar.y, 0L)) {
            return;
        }
        ax(bkuVar, E);
    }

    public final bwi C() {
        bwi bwiVar = this.v;
        bwiVar.getClass();
        return bwiVar;
    }

    public final void D(bve bveVar) {
        if (!a.ao(bveVar, this.f)) {
            if ((bveVar.B().n & 512) != 0) {
                bqz bqzVar = (bqz) bveVar;
                brb brbVar = this.D;
                if (brbVar != null) {
                    brbVar.b = bqzVar;
                } else {
                    brbVar = new brb(this, bqzVar);
                }
                this.D = brbVar;
            } else {
                this.D = null;
            }
        }
        this.f = bveVar;
    }

    @Override // defpackage.bru
    public final int c(int i) {
        brb brbVar = this.D;
        if (brbVar == null) {
            return this.f.c(this, C(), i);
        }
        bqz bqzVar = brbVar.b;
        C();
        return bqzVar.i();
    }

    @Override // defpackage.bru
    public final int d(int i) {
        brb brbVar = this.D;
        if (brbVar == null) {
            return this.f.d(this, C(), i);
        }
        bqz bqzVar = brbVar.b;
        C();
        return bqzVar.j();
    }

    @Override // defpackage.bwi, defpackage.bte
    public final void df(long j, uiq uiqVar) {
        super.df(j, uiqVar);
        ay();
    }

    @Override // defpackage.bru
    public final int e(int i) {
        brb brbVar = this.D;
        if (brbVar == null) {
            return this.f.e(this, C(), i);
        }
        bqz bqzVar = brbVar.b;
        C();
        return bqzVar.k();
    }

    @Override // defpackage.bru
    public final int f(int i) {
        brb brbVar = this.D;
        if (brbVar == null) {
            return this.f.f(this, C(), i);
        }
        bqz bqzVar = brbVar.b;
        C();
        return bqzVar.l();
    }

    @Override // defpackage.bvt
    public final int p(bqv bqvVar) {
        bvu bvuVar = this.h;
        return bvuVar != null ? bvuVar.p.c(bqvVar, Integer.MIN_VALUE) : amo.n(this, bqvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // defpackage.bsq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bte r(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.u
            if (r0 == 0) goto L13
            cho r9 = r8.g
            if (r9 == 0) goto Lb
            long r9 = r9.a
            goto L13
        Lb:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Lookahead constraints cannot be null in approach pass."
            r8.<init>(r9)
            throw r8
        L13:
            r8.v(r9)
            brb r0 = r8.D
            if (r0 == 0) goto La2
            bvh r1 = r0.a
            bqz r2 = r0.b
            bvu r1 = r1.h
            r1.getClass()
            bss r1 = r1.G()
            r1.b()
            r1.a()
            boolean r1 = r2.g()
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L40
            cho r1 = r8.g
            boolean r1 = defpackage.cho.f(r9, r1)
            if (r1 != 0) goto L3e
            goto L40
        L3e:
            r1 = r3
            goto L41
        L40:
            r1 = r4
        L41:
            r0.c = r1
            if (r1 != 0) goto L4b
            bwi r1 = r8.C()
            r1.u = r4
        L4b:
            r8.C()
            bss r1 = r2.b()
            bwi r2 = r8.C()
            r2.u = r3
            int r2 = r1.b()
            bvu r5 = r8.h
            r5.getClass()
            int r5 = r5.a
            if (r2 != r5) goto L73
            int r2 = r1.a()
            bvu r5 = r8.h
            r5.getClass()
            int r5 = r5.b
            if (r2 != r5) goto L73
            r3 = r4
        L73:
            boolean r0 = r0.c
            if (r0 != 0) goto La0
            bwi r0 = r8.C()
            long r4 = r0.c
            bwi r0 = r8.C()
            bvu r0 = r0.y()
            if (r0 == 0) goto L91
            long r6 = r0.x()
            cia r0 = new cia
            r0.<init>(r6)
            goto L92
        L91:
            r0 = 0
        L92:
            boolean r0 = defpackage.cia.b(r4, r0)
            if (r0 == 0) goto La0
            if (r3 != 0) goto La0
            bvg r0 = new bvg
            r0.<init>(r1, r8)
            r1 = r0
        La0:
            if (r1 != 0) goto Lac
        La2:
            bve r0 = r8.f
            bwi r1 = r8.C()
            bss r1 = r0.a(r8, r1, r9)
        Lac:
            r8.an(r1)
            r8.ah()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvh.r(long):bte");
    }

    @Override // defpackage.bwi, defpackage.bte
    public final void w(long j, bmz bmzVar) {
        super.w(j, bmzVar);
        ay();
    }

    @Override // defpackage.bwi
    public final bij x() {
        return this.f.B();
    }

    @Override // defpackage.bwi
    public final bvu y() {
        return this.h;
    }

    @Override // defpackage.bwi
    public final void z() {
        if (this.h == null) {
            this.h = new bvf(this);
        }
    }
}
