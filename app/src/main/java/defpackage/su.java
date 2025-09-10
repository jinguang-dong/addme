package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class su extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(cru cruVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = cruVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((su) c((uqx) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 1) {
            return ((su) c((uqx) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 2) {
            return ((su) c((byi) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 3) {
            return ((su) c((dgz) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 4) {
            return ((su) c((ddq) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 5) {
            return ((su) c((dds) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((su) c((dds) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        if (r5.c(r2, r3, r19) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0107, code lost:
    
        if (r0 == r1) goto L71;
     */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.d;
        if (i == 0) {
            su suVar = new su((sv) this.b, uhbVar, 0);
            suVar.c = obj;
            return suVar;
        }
        if (i == 1) {
            su suVar2 = new su((sp) this.b, uhbVar, 1);
            suVar2.c = obj;
            return suVar2;
        }
        if (i == 2) {
            su suVar3 = new su((uh) this.b, uhbVar, 2);
            suVar3.c = obj;
            return suVar3;
        }
        if (i == 3) {
            su suVar4 = new su((cru) this.b, uhbVar, 3);
            suVar4.c = obj;
            return suVar4;
        }
        if (i == 4) {
            su suVar5 = new su((ddi) this.b, uhbVar, 4);
            suVar5.c = obj;
            return suVar5;
        }
        if (i != 5) {
            su suVar6 = new su((ddi) this.b, uhbVar, 6, (char[]) null);
            suVar6.c = obj;
            return suVar6;
        }
        su suVar7 = new su((ddi) this.b, uhbVar, 5, (byte[]) null);
        suVar7.c = obj;
        return suVar7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(ddi ddiVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = ddiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(ddi ddiVar, uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.d = i;
        this.b = ddiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(ddi ddiVar, uhb uhbVar, int i, char[] cArr) {
        super(2, uhbVar);
        this.d = i;
        this.b = ddiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(sp spVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = spVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(sv svVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = svVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(uh uhVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = uhVar;
    }
}
