package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsk implements btr {
    final /* synthetic */ bsn a;
    final /* synthetic */ Object b;
    private final ys c;

    public bsk(bsn bsnVar, Object obj) {
        this.a = bsnVar;
        this.b = obj;
        int[] iArr = yt.a;
        this.c = new ys((byte[]) null);
    }

    @Override // defpackage.btr
    public final int a() {
        bvm bvmVar = (bvm) this.a.n.a(this.b);
        if (bvmVar != null) {
            return bvmVar.t().size();
        }
        return 0;
    }

    @Override // defpackage.btr
    public final void b() {
        bsn bsnVar = this.a;
        bsnVar.h();
        bvm bvmVar = (bvm) bsnVar.n.g(this.b);
        if (bvmVar != null) {
            if (bsnVar.j <= 0) {
                bqs.c("No pre-composed items to dispose");
            }
            bvm bvmVar2 = bsnVar.a;
            int iIndexOf = bvmVar2.u().indexOf(bvmVar);
            if (iIndexOf < bvmVar2.u().size() - bsnVar.j) {
                bqs.c("Item is not in pre-composed item range");
            }
            bsnVar.i++;
            bsnVar.j--;
            int size = (bvmVar2.u().size() - bsnVar.j) - bsnVar.i;
            bsnVar.j(iIndexOf, size);
            bsnVar.g(size);
        }
    }

    @Override // defpackage.btr
    public final void c(int i, long j) {
        bsn bsnVar = this.a;
        bvm bvmVar = (bvm) bsnVar.n.a(this.b);
        if (bvmVar == null || !bvmVar.ag()) {
            return;
        }
        int size = bvmVar.t().size();
        if (i < 0 || i >= size) {
            bqs.d("Index (" + i + ") is out of bound of [0, " + size + ')');
        }
        if (bvmVar.ah()) {
            bqs.b("Pre-measure called on node that is not placed");
        }
        bvm bvmVar2 = bsnVar.a;
        bvmVar2.k = true;
        bvp.a(bvmVar).g((bvm) bvmVar.t().get(i), j);
        bvmVar2.k = false;
        this.c.d(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [uiq] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [bij] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [bij] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.btr
    public final void d(Object obj, uiq uiqVar) {
        bwe bweVar;
        bij bijVar;
        bvm bvmVar = (bvm) this.a.n.a(this.b);
        if (bvmVar == null || (bweVar = bvmVar.s) == null || (bijVar = bweVar.f) == null) {
            return;
        }
        if (!bijVar.B().w) {
            bqs.c("visitSubtreeIf called on an unattached node");
        }
        bdp bdpVar = new bdp(new bij[16]);
        bij bijVar2 = bijVar.B().q;
        if (bijVar2 == null) {
            bko.G(bdpVar, bijVar.B());
        } else {
            bdpVar.n(bijVar2);
        }
        while (true) {
            int i = bdpVar.b;
            if (i == 0) {
                return;
            }
            bij bijVar3 = (bij) bdpVar.c(i - 1);
            if ((bijVar3.o & 262144) != 0) {
                for (bij bijVar4 = bijVar3; bijVar4 != null; bijVar4 = bijVar4.q) {
                    if ((bijVar4.n & 262144) != 0) {
                        bup bupVarY = bijVar4;
                        ?? bdpVar2 = 0;
                        while (bupVarY != 0) {
                            if (bupVarY instanceof bxd) {
                                bxd bxdVar = (bxd) bupVarY;
                                bxc bxcVar = a.ao(obj, bxdVar.dc()) ? (bxc) uiqVar.a(bxdVar) : bxc.a;
                                if (bxcVar == bxc.c) {
                                    return;
                                }
                                if (bxcVar == bxc.b) {
                                    break;
                                }
                            } else if ((bupVarY.n & 262144) != 0 && (bupVarY instanceof bup)) {
                                bij bijVar5 = bupVarY.y;
                                int i2 = 0;
                                bupVarY = bupVarY;
                                bdpVar2 = bdpVar2;
                                while (bijVar5 != null) {
                                    if ((bijVar5.n & 262144) != 0) {
                                        i2++;
                                        bdpVar2 = bdpVar2;
                                        if (i2 == 1) {
                                            bupVarY = bijVar5;
                                        } else {
                                            if (bdpVar2 == 0) {
                                                bdpVar2 = new bdp(new bij[16]);
                                            }
                                            if (bupVarY != 0) {
                                                bdpVar2.n(bupVarY);
                                            }
                                            bdpVar2.n(bijVar5);
                                            bupVarY = 0;
                                        }
                                    }
                                    bijVar5 = bijVar5.q;
                                    bupVarY = bupVarY;
                                    bdpVar2 = bdpVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            bupVarY = bko.y(bdpVar2);
                        }
                    }
                }
            }
            bko.G(bdpVar, bijVar3);
        }
    }
}
