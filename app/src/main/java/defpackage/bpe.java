package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpe extends bij implements bxd, boy {
    private final boy a;
    private final bpb b;
    private bpe c;
    private final Object d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public bpe(boy boyVar, bpb bpbVar) {
        this.a = boyVar;
        this.b = bpbVar;
    }

    private final boy h() {
        if (this.w) {
            return e();
        }
        return null;
    }

    @Override // defpackage.boy
    public final long a(long j, long j2, int i) {
        long jA = this.a.a(j, j2, i);
        boy boyVarH = h();
        return a.E(jA, boyVarH != null ? boyVarH.a(a.E(j, jA), a.ac(j2, jA), i) : 0L);
    }

    @Override // defpackage.boy
    public final long b(long j, int i) {
        boy boyVarH = h();
        long jB = boyVarH != null ? boyVarH.b(j, i) : 0L;
        return a.E(jB, this.a.b(a.ac(j, jB), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.boy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cV(long r12, long r14, defpackage.uhb r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof defpackage.bpc
            if (r1 == 0) goto L15
            r1 = r0
            bpc r1 = (defpackage.bpc) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            bpc r1 = new bpc
            r1.<init>(r11, r0)
        L1a:
            r7 = r1
            java.lang.Object r0 = r7.c
            uhi r1 = defpackage.uhi.a
            int r2 = r7.e
            r8 = 2
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 == r3) goto L37
            if (r2 != r8) goto L2f
            long r11 = r7.a
            defpackage.rnt.aN(r0)
            goto L7d
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            long r12 = r7.b
            long r2 = r7.a
            defpackage.rnt.aN(r0)
            r9 = r2
            r2 = r12
            r12 = r9
            goto L56
        L42:
            defpackage.rnt.aN(r0)
            boy r2 = r11.a
            r7.a = r12
            r7.b = r14
            r7.e = r3
            r3 = r12
            r5 = r14
            java.lang.Object r0 = r2.cV(r3, r5, r7)
            if (r0 == r1) goto L8f
            r2 = r14
        L56:
            cif r0 = (defpackage.cif) r0
            long r4 = r0.a
            boolean r0 = r11.w
            if (r0 == 0) goto L63
            boy r11 = r11.h()
            goto L65
        L63:
            bpe r11 = r11.c
        L65:
            if (r11 == 0) goto L83
            long r12 = defpackage.a.E(r12, r4)
            long r2 = defpackage.a.ac(r2, r4)
            r7.a = r4
            r7.e = r8
            r14 = r2
            r16 = r7
            java.lang.Object r0 = r11.cV(r12, r14, r16)
            if (r0 == r1) goto L8f
            r11 = r4
        L7d:
            cif r0 = (defpackage.cif) r0
            long r0 = r0.a
            r4 = r11
            goto L85
        L83:
            r0 = 0
        L85:
            long r11 = defpackage.a.E(r4, r0)
            cif r13 = new cif
            r13.<init>(r11)
            return r13
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpe.cV(long, long, uhb):java.lang.Object");
    }

    @Override // defpackage.bij
    public final void cW() {
        bpb bpbVar = this.b;
        bpbVar.a = this;
        bpbVar.b = null;
        this.c = null;
        bpbVar.c = new bol(this, 3);
        bpbVar.d = C();
    }

    @Override // defpackage.bij
    public final void cZ() {
        uka ukaVar = new uka();
        bad.z(this, new aaw(ukaVar, 5));
        bpe bpeVar = (bpe) ((bxd) ukaVar.a);
        this.c = bpeVar;
        bpb bpbVar = this.b;
        bpbVar.b = bpeVar;
        if (bpbVar.a == this) {
            bpbVar.a = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.boy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r7, defpackage.uhb r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bpd
            if (r0 == 0) goto L13
            r0 = r9
            bpd r0 = (defpackage.bpd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bpd r0 = new bpd
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r6 = r0.a
            defpackage.rnt.aN(r9)
            goto L65
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            long r7 = r0.a
            defpackage.rnt.aN(r9)
            goto L4d
        L3a:
            defpackage.rnt.aN(r9)
            boy r9 = r6.h()
            if (r9 == 0) goto L52
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L73
        L4d:
            cif r9 = (defpackage.cif) r9
            long r4 = r9.a
            goto L54
        L52:
            r4 = 0
        L54:
            boy r6 = r6.a
            long r7 = defpackage.a.ac(r7, r4)
            r0.a = r4
            r0.d = r3
            java.lang.Object r9 = r6.d(r7, r0)
            if (r9 == r1) goto L73
            r6 = r4
        L65:
            cif r9 = (defpackage.cif) r9
            long r8 = r9.a
            long r6 = defpackage.a.E(r6, r8)
            cif r8 = new cif
            r8.<init>(r6)
            return r8
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpe.d(long, uhb):java.lang.Object");
    }

    @Override // defpackage.bxd
    public final Object dc() {
        return this.d;
    }

    public final bpe e() {
        if (this.w) {
            return (bpe) bad.y(this);
        }
        return null;
    }

    public final und f() {
        und undVarF;
        bpe bpeVarE = e();
        if (bpeVarE != null && (undVarF = bpeVarE.f()) != null) {
            return undVarF;
        }
        und undVar = this.b.d;
        if (undVar != null) {
            return undVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
