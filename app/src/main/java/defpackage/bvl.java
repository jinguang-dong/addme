package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvl extends ujq implements uif {
    final /* synthetic */ bvm a;
    final /* synthetic */ uka b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvl(bvm bvmVar, uka ukaVar) {
        super(0);
        this.a = bvmVar;
        this.b = ukaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
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
    @Override // defpackage.uif
    public final /* bridge */ /* synthetic */ Object a() {
        bwe bweVar = this.a.s;
        if ((bweVar.a() & 8) != 0) {
            for (bij bijVar = bweVar.e; bijVar != null; bijVar = bijVar.p) {
                if ((bijVar.n & 8) != 0) {
                    bup bupVarY = bijVar;
                    ?? bdpVar = 0;
                    while (bupVarY != 0) {
                        if (bupVarY instanceof bwx) {
                            uka ukaVar = this.b;
                            bwx bwxVar = (bwx) bupVarY;
                            if (bwxVar.o()) {
                                ukaVar.a = new cbn();
                                ((cbn) ukaVar.a).b = true;
                            }
                            if (bwxVar.p()) {
                                ((cbn) ukaVar.a).a = true;
                            }
                            bwxVar.s((cbn) ukaVar.a);
                        } else if ((bupVarY.n & 8) != 0 && (bupVarY instanceof bup)) {
                            bij bijVar2 = bupVarY.y;
                            int i = 0;
                            bupVarY = bupVarY;
                            bdpVar = bdpVar;
                            while (bijVar2 != null) {
                                if ((bijVar2.n & 8) != 0) {
                                    i++;
                                    bdpVar = bdpVar;
                                    if (i == 1) {
                                        bupVarY = bijVar2;
                                    } else {
                                        if (bdpVar == 0) {
                                            bdpVar = new bdp(new bij[16]);
                                        }
                                        if (bupVarY != 0) {
                                            bdpVar.n(bupVarY);
                                        }
                                        bdpVar.n(bijVar2);
                                        bupVarY = 0;
                                    }
                                }
                                bijVar2 = bijVar2.q;
                                bupVarY = bupVarY;
                                bdpVar = bdpVar;
                            }
                            if (i != 1) {
                            }
                        }
                        bupVarY = bko.y(bdpVar);
                    }
                }
            }
        }
        return ufg.a;
    }
}
