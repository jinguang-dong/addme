package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bqv {
    public final uiu a;

    public bqv(uiu uiuVar) {
        this.a = uiuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [bij] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [bij] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    static /* synthetic */ Object a(Object obj, Object obj2) {
        bij bijVarX;
        float fFloatValue = ((Number) obj2).floatValue();
        bry bryVarM = ((btd) obj).m();
        String str = brt.a;
        bry bryVarX = bryVarM != null ? byi.x(bryVarM) : null;
        for (bwi bwiVar = bryVarX instanceof bwi ? (bwi) bryVarX : null; bwiVar != null; bwiVar = bwiVar.v) {
            boolean zH = bwj.h(262144);
            if (zH) {
                bijVarX = bwiVar.x();
            } else {
                bijVarX = bwiVar.x().p;
                if (bijVarX == null) {
                    continue;
                }
            }
            for (bij bijVarU = bwiVar.U(zH); bijVarU != null && (bijVarU.o & 262144) != 0; bijVarU = bijVarU.q) {
                if ((bijVarU.n & 262144) != 0) {
                    ?? bdpVar = 0;
                    bup bupVarY = bijVarU;
                    while (bupVarY != 0) {
                        if (bupVarY instanceof bxd) {
                            bxd bxdVar = (bxd) bupVarY;
                            if (bxdVar.dc() == brt.a) {
                                throw null;
                            }
                        } else if ((bupVarY.n & 262144) != 0 && (bupVarY instanceof bup)) {
                            bij bijVar = bupVarY.y;
                            int i = 0;
                            bupVarY = bupVarY;
                            bdpVar = bdpVar;
                            while (bijVar != null) {
                                if ((bijVar.n & 262144) != 0) {
                                    i++;
                                    bdpVar = bdpVar;
                                    if (i == 1) {
                                        bupVarY = bijVar;
                                    } else {
                                        if (bdpVar == 0) {
                                            bdpVar = new bdp(new bij[16]);
                                        }
                                        if (bupVarY != 0) {
                                            bdpVar.n(bupVarY);
                                        }
                                        bdpVar.n(bijVar);
                                        bupVarY = 0;
                                    }
                                }
                                bijVar = bijVar.q;
                                bupVarY = bupVarY;
                                bdpVar = bdpVar;
                            }
                            if (i != 1) {
                            }
                        }
                        bupVarY = bko.y(bdpVar);
                    }
                }
                if (bijVarU != bijVarX) {
                }
            }
        }
        return Float.valueOf(fFloatValue);
    }
}
