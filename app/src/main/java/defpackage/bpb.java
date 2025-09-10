package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpb {
    public bpe a;
    public bpe b;
    public uif c = new bol(this, 2);
    public und d;

    public final long a(long j, long j2, int i) {
        boy boyVarC = c();
        if (boyVarC != null) {
            return boyVarC.a(j, j2, i);
        }
        return 0L;
    }

    public final long b(long j, int i) {
        boy boyVarC = c();
        if (boyVarC != null) {
            return boyVarC.b(j, i);
        }
        return 0L;
    }

    public final boy c() {
        bpe bpeVar = this.a;
        if (bpeVar != null) {
            return bpeVar.e();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r0 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r0 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r8, long r10, defpackage.uhb r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.boz
            if (r0 == 0) goto L13
            r0 = r12
            boz r0 = (defpackage.boz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            boz r0 = new boz
            r0.<init>(r7, r12)
        L18:
            r12 = r0
            java.lang.Object r0 = r12.a
            uhi r1 = defpackage.uhi.a
            int r2 = r12.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.rnt.aN(r0)
            goto L61
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.rnt.aN(r0)
            goto L4e
        L37:
            defpackage.rnt.aN(r0)
            boy r0 = r7.c()
            r5 = 0
            if (r0 != 0) goto L53
            bpe r7 = r7.b
            if (r7 == 0) goto L67
            r12.c = r4
            java.lang.Object r0 = r7.cV(r8, r10, r12)
            if (r0 == r1) goto L66
        L4e:
            cif r0 = (defpackage.cif) r0
            long r5 = r0.a
            goto L67
        L53:
            boy r7 = r7.c()
            if (r7 == 0) goto L67
            r12.c = r3
            java.lang.Object r0 = r7.cV(r8, r10, r12)
            if (r0 == r1) goto L66
        L61:
            cif r0 = (defpackage.cif) r0
            long r5 = r0.a
            goto L67
        L66:
            return r1
        L67:
            cif r7 = new cif
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpb.d(long, long, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r5, defpackage.uhb r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bpa
            if (r0 == 0) goto L13
            r0 = r7
            bpa r0 = (defpackage.bpa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bpa r0 = new bpa
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r7)
            goto L40
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.rnt.aN(r7)
            boy r4 = r4.c()
            if (r4 == 0) goto L46
            r0.c = r3
            java.lang.Object r7 = r4.d(r5, r0)
            if (r7 == r1) goto L45
        L40:
            cif r7 = (defpackage.cif) r7
            long r4 = r7.a
            goto L48
        L45:
            return r1
        L46:
            r4 = 0
        L48:
            cif r6 = new cif
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpb.e(long, uhb):java.lang.Object");
    }

    public final und f() {
        und undVar = (und) this.c.a();
        if (undVar != null) {
            return undVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
