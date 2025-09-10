package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwf implements bwg {
    private final /* synthetic */ int a;

    public bwf(int i) {
        this.a = i;
    }

    @Override // defpackage.bwg
    public final int a() {
        return this.a != 0 ? 16 : 8;
    }

    @Override // defpackage.bwg
    public final void b(bvm bvmVar, long j, buy buyVar, int i, boolean z) {
        if (this.a != 0) {
            bvmVar.C(j, buyVar, i, z);
        } else {
            bvmVar.am(j, buyVar, z);
        }
    }

    @Override // defpackage.bwg
    public final boolean c(bvm bvmVar) {
        cbn cbnVarP;
        return (this.a == 0 && (cbnVarP = bvmVar.p()) != null && cbnVarP.b) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [bij] */
    /* JADX WARN: Type inference failed for: r7v1, types: [bij] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [bij] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.bwg
    public final void d(bij bijVar) {
        if (this.a != 0) {
            ?? bdpVar = 0;
            while (bijVar != 0) {
                if (bijVar instanceof bww) {
                    ((bww) bijVar).v();
                } else if ((bijVar.n & 16) != 0 && (bijVar instanceof bup)) {
                    bij bijVar2 = bijVar.y;
                    int i = 0;
                    bdpVar = bdpVar;
                    bijVar = bijVar;
                    while (bijVar2 != null) {
                        if ((bijVar2.n & 16) != 0) {
                            i++;
                            bdpVar = bdpVar;
                            if (i == 1) {
                                bijVar = bijVar2;
                            } else {
                                if (bdpVar == 0) {
                                    bdpVar = new bdp(new bij[16]);
                                }
                                if (bijVar != 0) {
                                    bdpVar.n(bijVar);
                                }
                                bdpVar.n(bijVar2);
                                bijVar = 0;
                            }
                        }
                        bijVar2 = bijVar2.q;
                        bdpVar = bdpVar;
                        bijVar = bijVar;
                    }
                    if (i != 1) {
                    }
                }
                bijVar = bko.y(bdpVar);
            }
        }
    }
}
