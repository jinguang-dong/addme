package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiz extends uht implements uiu {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiz(long j, bqk bqkVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = j;
        this.c = bqkVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((aiz) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 1) {
            return ((aiz) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 2) {
            return ((aiz) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((aiz) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (defpackage.ung.e(8, r7) == r0) goto L16;
     */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.d
            r1 = 1
            if (r0 == 0) goto L8b
            if (r0 == r1) goto L69
            r2 = 2
            if (r0 == r2) goto L48
            uhi r0 = defpackage.uhi.a
            int r3 = r7.a
            defpackage.rnt.aN(r8)
            if (r3 == 0) goto L16
            if (r3 == r1) goto L24
            goto L2f
        L16:
            long r3 = r7.b
            r7.a = r1
            r5 = -8
            long r3 = r3 + r5
            java.lang.Object r8 = defpackage.ung.e(r3, r7)
            if (r8 != r0) goto L24
            goto L2e
        L24:
            r7.a = r2
            r1 = 8
            java.lang.Object r8 = defpackage.ung.e(r1, r7)
            if (r8 != r0) goto L2f
        L2e:
            return r0
        L2f:
            java.lang.Object r8 = r7.c
            bqk r8 = (defpackage.bqk) r8
            umk r8 = r8.a
            if (r8 == 0) goto L45
            long r0 = r7.b
            bpq r7 = new bpq
            r7.<init>(r0)
            java.lang.Object r7 = defpackage.rnt.aM(r7)
            r8.fW(r7)
        L45:
            ufg r7 = defpackage.ufg.a
            return r7
        L48:
            uhi r0 = defpackage.uhi.a
            int r2 = r7.a
            if (r2 == 0) goto L52
            defpackage.rnt.aN(r8)
            goto L66
        L52:
            defpackage.rnt.aN(r8)
            java.lang.Object r8 = r7.c
            long r2 = r7.b
            r7.a = r1
            ajc r8 = (defpackage.ajc) r8
            aji r8 = r8.i
            java.lang.Object r7 = r8.h(r2, r1, r7)
            if (r7 != r0) goto L66
            return r0
        L66:
            ufg r7 = defpackage.ufg.a
            return r7
        L69:
            uhi r0 = defpackage.uhi.a
            int r2 = r7.a
            if (r2 == 0) goto L73
            defpackage.rnt.aN(r8)
            goto L88
        L73:
            defpackage.rnt.aN(r8)
            java.lang.Object r8 = r7.c
            long r2 = r7.b
            r7.a = r1
            ajc r8 = (defpackage.ajc) r8
            aji r8 = r8.i
            r1 = 0
            java.lang.Object r7 = r8.h(r2, r1, r7)
            if (r7 != r0) goto L88
            return r0
        L88:
            ufg r7 = defpackage.ufg.a
            return r7
        L8b:
            uhi r0 = defpackage.uhi.a
            int r2 = r7.a
            if (r2 == 0) goto L95
            defpackage.rnt.aN(r8)
            goto Lb1
        L95:
            defpackage.rnt.aN(r8)
            java.lang.Object r8 = r7.c
            long r2 = r7.b
            afs r4 = defpackage.afs.b
            aiy r5 = new aiy
            r6 = 0
            r5.<init>(r2, r6)
            r7.a = r1
            ajc r8 = (defpackage.ajc) r8
            aji r8 = r8.i
            java.lang.Object r7 = r8.i(r4, r5, r7)
            if (r7 != r0) goto Lb1
            return r0
        Lb1:
            ufg r7 = defpackage.ufg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.d;
        if (i == 0) {
            return new aiz((ajc) this.c, this.b, uhbVar, 0);
        }
        if (i == 1) {
            return new aiz((ajc) this.c, this.b, uhbVar, 1, (byte[]) null);
        }
        if (i != 2) {
            return new aiz(this.b, (bqk) this.c, uhbVar, 3);
        }
        return new aiz((ajc) this.c, this.b, uhbVar, 2, (char[]) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiz(ajc ajcVar, long j, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = ajcVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiz(ajc ajcVar, long j, uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.d = i;
        this.c = ajcVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiz(ajc ajcVar, long j, uhb uhbVar, int i, char[] cArr) {
        super(2, uhbVar);
        this.d = i;
        this.c = ajcVar;
        this.b = j;
    }
}
