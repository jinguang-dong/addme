package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjq {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final Object f;

    public bjq(bws bwsVar) {
        this.f = bwsVar;
        this.e = new bdp(new bui[16]);
        this.d = new bdp(new ocq[16]);
        this.c = new bdp(new bvm[16]);
        this.b = new bdp(new ocq[16]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [bij] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [bij] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    public static final void c(bij bijVar, ocq ocqVar, Set set) {
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
            if ((bijVar3.o & 32) != 0) {
                for (bij bijVar4 = bijVar3; bijVar4 != null; bijVar4 = bijVar4.q) {
                    if ((bijVar4.n & 32) != 0) {
                        bup bupVarY = bijVar4;
                        ?? bdpVar2 = 0;
                        while (bupVarY != 0) {
                            if (bupVarY instanceof bub) {
                                bub bubVar = (bub) bupVarY;
                                if (bubVar instanceof bui) {
                                    bui buiVar = (bui) bubVar;
                                    if ((buiVar.a instanceof ald) && buiVar.c.contains(ocqVar)) {
                                        set.add(bubVar);
                                    }
                                }
                                if (bubVar.h().b(ocqVar)) {
                                    break;
                                }
                            } else if ((bupVarY.n & 32) != 0 && (bupVarY instanceof bup)) {
                                bij bijVar5 = bupVarY.y;
                                int i2 = 0;
                                bupVarY = bupVarY;
                                bdpVar2 = bdpVar2;
                                while (bijVar5 != null) {
                                    if ((bijVar5.n & 32) != 0) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uiq] */
    public final void a() {
        if (this.a) {
            return;
        }
        this.f.a(new bjp(this));
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bws, java.lang.Object] */
    public final void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.f.m(new bsl(this, 2));
    }

    public bjq(uiq uiqVar, uif uifVar, uif uifVar2) {
        this.f = uiqVar;
        this.b = uifVar;
        this.c = uifVar2;
        int i = zx.a;
        this.d = new zw((byte[]) null);
        this.e = new zw((byte[]) null);
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
    }
}
