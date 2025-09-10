package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class msy extends uht implements uiu {
    Object a;
    int b;
    final /* synthetic */ ujx c;
    final /* synthetic */ bqc d;
    final /* synthetic */ uif e;
    final /* synthetic */ ocq f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msy(ujx ujxVar, bqc bqcVar, ocq ocqVar, uif uifVar, uhb uhbVar) {
        super(2, uhbVar);
        this.c = ujxVar;
        this.d = bqcVar;
        this.f = ocqVar;
        this.e = uifVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((msy) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0035 -> B:9:0x0038). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r11.b
            r2 = 0
            if (r1 == 0) goto L11
            java.lang.Object r1 = r11.a
            java.lang.Object r3 = r11.g
            und r3 = (defpackage.und) r3
            defpackage.rnt.aN(r12)
            goto L38
        L11:
            defpackage.rnt.aN(r12)
            java.lang.Object r12 = r11.g
            und r12 = (defpackage.und) r12
            r3 = r12
        L19:
            bqo r1 = new bqo
            r1.<init>()
            ujx r12 = r11.c
            r4 = 0
            r12.a = r4
            msw r4 = new msw
            r4.<init>(r3, r1, r12, r2)
            r11.g = r3
            r11.a = r1
            r12 = 1
            r11.b = r12
            bqc r12 = r11.d
            java.lang.Object r12 = r12.n(r4, r11)
            if (r12 != r0) goto L38
            return r0
        L38:
            bqo r1 = (defpackage.bqo) r1
            long r4 = r1.a()
            float r12 = defpackage.a.A(r4)
            ocq r1 = r11.f
            ujx r4 = r11.c
            float r4 = r4.a
            float r6 = defpackage.byi.bM(r1, r4, r12)
            bqc r7 = r11.d
            msx r5 = new msx
            uif r8 = r11.e
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 3
            r1 = 0
            defpackage.ukc.C(r3, r2, r1, r5, r12)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        msy msyVar = new msy(this.c, this.d, this.f, this.e, uhbVar);
        msyVar.g = obj;
        return msyVar;
    }
}
