package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cru {
    public final csm a;
    public final und b;
    public final ues d;
    public final csh e;
    public final gno f;
    private int h;
    private uol i;
    private final pfl l;
    public final urk c = new urd(new crh(this, (uhb) null, 0));
    private final uxa k = new uxa();
    public final pfl g = new pfl((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
    private final ues j = new uez(new apa(this, 11));

    public cru(csm csmVar, List list, pfl pflVar, und undVar) {
        this.a = csmVar;
        this.l = pflVar;
        this.b = undVar;
        this.e = new csh(this, list);
        int i = 10;
        this.d = new uez(new apa(this, i));
        this.f = new gno(undVar, new arc(this, i), new ane(7), new su(this, (uhb) null, 3));
    }

    private final Object l(uiu uiuVar, uhf uhfVar, uhb uhbVar) {
        return k().k(new crr(this, uhfVar, uiuVar, (uhb) null, 0), uhbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.uhb r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cri
            if (r0 == 0) goto L13
            r0 = r5
            cri r0 = (defpackage.cri) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cri r0 = new cri
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            uxa r0 = r0.d
            defpackage.rnt.aN(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.rnt.aN(r5)
            uxa r5 = r4.k
            r0.d = r5
            r0.c = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 == r1) goto L5e
            r0 = r5
        L41:
            int r5 = r4.h     // Catch: java.lang.Throwable -> L59
            int r5 = r5 + (-1)
            r4.h = r5     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L53
            uol r5 = r4.i     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L50
            defpackage.ujp.Z(r5)     // Catch: java.lang.Throwable -> L59
        L50:
            r5 = 0
            r4.i = r5     // Catch: java.lang.Throwable -> L59
        L53:
            r0.d()
            ufg r4 = defpackage.ufg.a
            return r4
        L59:
            r4 = move-exception
            r0.d()
            throw r4
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cru.a(uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.uhb r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.crk
            if (r0 == 0) goto L13
            r0 = r6
            crk r0 = (defpackage.crk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crk r0 = new crk
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            uxa r0 = r0.d
            defpackage.rnt.aN(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.rnt.aN(r6)
            uxa r6 = r5.k
            r0.d = r6
            r0.c = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L64
            r0 = r6
        L41:
            int r6 = r5.h     // Catch: java.lang.Throwable -> L5f
            int r6 = r6 + r3
            r5.h = r6     // Catch: java.lang.Throwable -> L5f
            if (r6 != r3) goto L59
            und r6 = r5.b     // Catch: java.lang.Throwable -> L5f
            crd r1 = new crd     // Catch: java.lang.Throwable -> L5f
            r2 = 2
            r3 = 0
            r1.<init>(r5, r3, r2, r3)     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            r4 = 3
            uol r6 = defpackage.ukc.C(r6, r3, r2, r1, r4)     // Catch: java.lang.Throwable -> L5f
            r5.i = r6     // Catch: java.lang.Throwable -> L5f
        L59:
            r0.d()
            ufg r5 = defpackage.ufg.a
            return r5
        L5f:
            r5 = move-exception
            r0.d()
            throw r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cru.b(uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r2.a(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.uhb r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.crm
            if (r0 == 0) goto L13
            r0 = r7
            crm r0 = (defpackage.crm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            crm r0 = new crm
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r0 = r0.a
            defpackage.rnt.aN(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.rnt.aN(r7)
            goto L49
        L3a:
            defpackage.rnt.aN(r7)
            tdy r7 = r6.k()
            r0.d = r4
            java.lang.Object r7 = r7.m()
            if (r7 == r1) goto L6e
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            csh r2 = r6.e     // Catch: java.lang.Throwable -> L5f
            r0.a = r7     // Catch: java.lang.Throwable -> L5f
            r0.d = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r2.a(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r1) goto L5c
            goto L6e
        L5c:
            ufg r6 = defpackage.ufg.a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            pfl r6 = r6.g
            csf r1 = new csf
            r1.<init>(r7, r0)
            r6.r(r1)
            throw r7
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cru.c(uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r0 != r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r0 != r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(boolean r13, defpackage.uhb r14) {
        /*
            r12 = this;
            boolean r2 = r14 instanceof defpackage.crn
            if (r2 == 0) goto L13
            r2 = r14
            crn r2 = (defpackage.crn) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.e = r3
            goto L18
        L13:
            crn r2 = new crn
            r2.<init>(r12, r14)
        L18:
            r6 = r2
            java.lang.Object r0 = r6.c
            uhi r7 = defpackage.uhi.a
            int r2 = r6.e
            r8 = 3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 == r3) goto L37
            if (r2 != r8) goto L2f
            defpackage.rnt.aN(r0)
            goto La9
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            defpackage.rnt.aN(r0)
            goto L8e
        L3b:
            boolean r2 = r6.a
            java.lang.Object r5 = r6.b
            defpackage.rnt.aN(r0)
            goto L61
        L43:
            defpackage.rnt.aN(r0)
            pfl r0 = r12.g
            csl r5 = r0.q()
            boolean r0 = r5 instanceof defpackage.cso
            if (r0 != 0) goto Lc0
            tdy r0 = r12.k()
            r6.b = r5
            r6.a = r13
            r6.e = r4
            java.lang.Object r0 = r0.m()
            if (r0 == r7) goto Lbf
            r2 = r13
        L61:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r9 = r5 instanceof defpackage.cqu
            if (r9 == 0) goto L71
            r10 = r5
            cqu r10 = (defpackage.cqu) r10
            int r10 = r10.c
            goto L72
        L71:
            r10 = -1
        L72:
            if (r9 == 0) goto L78
            if (r0 == r10) goto L77
            goto L78
        L77:
            return r5
        L78:
            r9 = 0
            if (r2 == 0) goto L91
            tdy r0 = r12.k()
            crw r2 = new crw
            r2.<init>(r12, r9, r4)
            r6.b = r9
            r6.e = r3
            java.lang.Object r0 = r0.k(r2, r6)
            if (r0 == r7) goto Lbf
        L8e:
            uev r0 = (defpackage.uev) r0
            goto Lab
        L91:
            tdy r11 = r12.k()
            crp r0 = new crp
            r4 = 1
            r5 = 0
            r3 = 0
            r1 = r12
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.b = r9
            r6.e = r8
            java.lang.Object r0 = r11.l(r0, r6)
            if (r0 == r7) goto Lbf
        La9:
            uev r0 = (defpackage.uev) r0
        Lab:
            java.lang.Object r2 = r0.a
            csl r2 = (defpackage.csl) r2
            java.lang.Object r0 = r0.b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbe
            pfl r0 = r12.g
            r0.r(r2)
        Lbe:
            return r2
        Lbf:
            return r7
        Lc0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cru.d(boolean, uhb):java.lang.Object");
    }

    public final Object e(uhb uhbVar) {
        return i().b(new csn(null), uhbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[Catch: cqt -> 0x007a, TRY_ENTER, TryCatch #2 {cqt -> 0x007a, blocks: (B:19:0x0057, B:56:0x00e7, B:22:0x005e, B:53:0x00cb, B:47:0x00ae, B:30:0x0076, B:41:0x0090, B:43:0x0096), top: B:85:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0124 A[Catch: all -> 0x014a, TryCatch #3 {all -> 0x014a, blocks: (B:64:0x0111, B:66:0x0124, B:67:0x0129), top: B:86:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0129 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #3 {all -> 0x014a, blocks: (B:64:0x0111, B:66:0x0124, B:67:0x0129), top: B:86:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, uiq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(boolean r15, defpackage.uhb r16) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cru.f(boolean, uhb):java.lang.Object");
    }

    public final Object g(uiu uiuVar, uhb uhbVar) {
        csr csrVar = (csr) uhbVar.q().get(csq.a);
        if (csrVar != null) {
            csrVar.a(this);
        }
        return ung.s(new csr(csrVar, this), new ahq(this, uiuVar, (uhb) null, 4), uhbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.Object r11, boolean r12, defpackage.uhb r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.crs
            if (r0 == 0) goto L13
            r0 = r13
            crs r0 = (defpackage.crs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crs r0 = new crs
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ujy r10 = r0.d
            defpackage.rnt.aN(r13)
            goto L51
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            defpackage.rnt.aN(r13)
            ujy r5 = new ujy
            r5.<init>()
            csb r13 = r10.i()
            crt r4 = new crt
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r5
            r0.c = r3
            java.lang.Object r10 = r13.c(r4, r0)
            if (r10 == r1) goto L59
            r10 = r5
        L51:
            int r10 = r10.a
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cru.h(java.lang.Object, boolean, uhb):java.lang.Object");
    }

    public final csb i() {
        return (csb) this.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r10 != r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, uhf] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, uhf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.dgz r9, defpackage.uhb r10) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cru.j(dgz, uhb):java.lang.Object");
    }

    public final tdy k() {
        return (tdy) this.j.a();
    }
}
