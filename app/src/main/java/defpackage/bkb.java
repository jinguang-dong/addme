package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkb extends bij implements bun, bwm, bub, buo {
    public boolean a;
    public boolean b;
    private final uiu c;
    private final int d;

    public /* synthetic */ bkb(int i, uiu uiuVar, int i2) {
        this.c = (i2 & 2) != 0 ? null : uiuVar;
        this.d = 1 == (i2 & 1) ? 1 : i;
    }

    public final bka c() {
        bkb bkbVar;
        bwe bweVar;
        if (!this.w || (bkbVar = ((bxv) bko.D(this)).D.f) == null) {
            return bka.d;
        }
        if (this == bkbVar) {
            return bka.a;
        }
        if (bkbVar.w) {
            if (!bkbVar.m.w) {
                bqs.c("visitAncestors called on an unattached node");
            }
            bij bijVar = bkbVar.m.p;
            bvm bvmVarB = bko.B(bkbVar);
            while (bvmVarB != null) {
                if ((bvmVarB.s.f.o & 1024) != 0) {
                    while (bijVar != null) {
                        if ((bijVar.n & 1024) != 0) {
                            bij bijVarY = bijVar;
                            bdp bdpVar = null;
                            while (bijVarY != null) {
                                if (bijVarY instanceof bkb) {
                                    if (this == ((bkb) bijVarY)) {
                                        return bka.b;
                                    }
                                } else if ((bijVarY.n & 1024) != 0 && (bijVarY instanceof bup)) {
                                    int i = 0;
                                    for (bij bijVar2 = ((bup) bijVarY).y; bijVar2 != null; bijVar2 = bijVar2.q) {
                                        if ((bijVar2.n & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                bijVarY = bijVar2;
                                            } else {
                                                if (bdpVar == null) {
                                                    bdpVar = new bdp(new bij[16]);
                                                }
                                                if (bijVarY != null) {
                                                    bdpVar.n(bijVarY);
                                                }
                                                bdpVar.n(bijVar2);
                                                bijVarY = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                bijVarY = bko.y(bdpVar);
                            }
                        }
                        bijVar = bijVar.p;
                    }
                }
                bvmVarB = bvmVarB.j();
                bijVar = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
            }
        }
        return bka.d;
    }

    @Override // defpackage.bij
    public final void cZ() {
        int iOrdinal = c().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new uet();
                }
                return;
            }
        }
        bju bjuVar = ((bxv) bko.D(this)).D;
        bjuVar.g(true, false, 8);
        bjuVar.d.a();
    }

    public final void d() {
        bjv bjvVar;
        int iOrdinal = c().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new uet();
                }
                return;
            }
        }
        uka ukaVar = new uka();
        amo.k(this, new bpj(ukaVar, this, 1));
        Object obj = ukaVar.a;
        if (obj == null) {
            ujp.c("focusProperties");
            bjvVar = null;
        } else {
            bjvVar = (bjv) obj;
        }
        if (bjvVar.a()) {
            return;
        }
        ((bxv) bko.D(this)).D.d(true);
    }

    @Override // defpackage.bij
    public final void da() {
        if (c().a()) {
            ((bxv) bko.D(this)).D.g(true, true, 8);
        }
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020a A[Catch: all -> 0x0243, TryCatch #0 {all -> 0x0243, blocks: (B:3:0x0007, B:6:0x0012, B:13:0x0026, B:14:0x002b, B:15:0x002c, B:17:0x003c, B:19:0x0042, B:24:0x005f, B:26:0x006c, B:27:0x006f, B:29:0x0079, B:63:0x00ea, B:65:0x00f0, B:67:0x00f4, B:33:0x0089, B:37:0x0093, B:39:0x0097, B:60:0x00da, B:40:0x009d, B:42:0x00a3, B:44:0x00a7, B:46:0x00b1, B:48:0x00b7, B:52:0x00bf, B:54:0x00c9, B:55:0x00cc, B:56:0x00d1, B:62:0x00e2, B:72:0x0106, B:74:0x0113, B:75:0x0116, B:77:0x0121, B:119:0x019e, B:121:0x01a4, B:123:0x01a8, B:81:0x012f, B:85:0x013a, B:87:0x013e, B:89:0x0142, B:92:0x014f, B:98:0x015d, B:117:0x0196, B:94:0x0155, B:99:0x015f, B:101:0x0165, B:103:0x0169, B:105:0x0171, B:107:0x0177, B:111:0x017f, B:113:0x0189, B:114:0x018c, B:115:0x0191, B:118:0x019b, B:127:0x01b4, B:131:0x01be, B:139:0x01d9, B:140:0x01de, B:141:0x01df, B:143:0x01ec, B:146:0x01f7, B:149:0x0200, B:150:0x020a, B:161:0x022e, B:164:0x0233, B:154:0x0216, B:158:0x0221, B:160:0x0226, B:159:0x0224, B:169:0x0242), top: B:173:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0214 A[ADDED_TO_REGION, LOOP:9: B:153:0x0214->B:160:0x0226, LOOP_START, PHI: r4
      0x0214: PHI (r4v12 int) = (r4v11 int), (r4v13 int) binds: [B:151:0x0211, B:160:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0233 A[Catch: all -> 0x0243, TRY_LEAVE, TryCatch #0 {all -> 0x0243, blocks: (B:3:0x0007, B:6:0x0012, B:13:0x0026, B:14:0x002b, B:15:0x002c, B:17:0x003c, B:19:0x0042, B:24:0x005f, B:26:0x006c, B:27:0x006f, B:29:0x0079, B:63:0x00ea, B:65:0x00f0, B:67:0x00f4, B:33:0x0089, B:37:0x0093, B:39:0x0097, B:60:0x00da, B:40:0x009d, B:42:0x00a3, B:44:0x00a7, B:46:0x00b1, B:48:0x00b7, B:52:0x00bf, B:54:0x00c9, B:55:0x00cc, B:56:0x00d1, B:62:0x00e2, B:72:0x0106, B:74:0x0113, B:75:0x0116, B:77:0x0121, B:119:0x019e, B:121:0x01a4, B:123:0x01a8, B:81:0x012f, B:85:0x013a, B:87:0x013e, B:89:0x0142, B:92:0x014f, B:98:0x015d, B:117:0x0196, B:94:0x0155, B:99:0x015f, B:101:0x0165, B:103:0x0169, B:105:0x0171, B:107:0x0177, B:111:0x017f, B:113:0x0189, B:114:0x018c, B:115:0x0191, B:118:0x019b, B:127:0x01b4, B:131:0x01be, B:139:0x01d9, B:140:0x01de, B:141:0x01df, B:143:0x01ec, B:146:0x01f7, B:149:0x0200, B:150:0x020a, B:161:0x022e, B:164:0x0233, B:154:0x0216, B:158:0x0221, B:160:0x0226, B:159:0x0224, B:169:0x0242), top: B:173:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18, types: [bdp] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22, types: [bdp] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(int r17) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.e(int):boolean");
    }

    public final anz f() {
        return (anz) bqs.v(this, brf.a);
    }

    @Override // defpackage.bub
    public final /* synthetic */ bua h() {
        return btz.a;
    }

    @Override // defpackage.bwm
    public final void k() {
        d();
    }

    public final void l(bka bkaVar, bka bkaVar2) {
        bwe bweVar;
        uiu uiuVar;
        bju bjuVar = ((bxv) bko.D(this)).D;
        bkb bkbVar = bjuVar.f;
        if (!a.ao(bkaVar, bkaVar2) && (uiuVar = this.c) != null) {
            uiuVar.a(bkaVar, bkaVar2);
        }
        bij bijVar = this.m;
        if (!bijVar.w) {
            bqs.c("visitAncestors called on an unattached node");
        }
        bij bijVar2 = this.m;
        bvm bvmVarB = bko.B(this);
        while (bvmVarB != null) {
            if ((bvmVarB.s.f.o & 5120) != 0) {
                while (bijVar2 != null) {
                    int i = bijVar2.n;
                    if ((i & 5120) != 0) {
                        if (bijVar2 != bijVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            bij bijVarY = bijVar2;
                            bdp bdpVar = null;
                            while (bijVarY != null) {
                                if (bijVarY instanceof bui) {
                                    bui buiVar = (bui) bijVarY;
                                    if (bkbVar == bjuVar.f) {
                                        buiVar.z();
                                    }
                                } else if ((bijVarY.n & 4096) != 0 && (bijVarY instanceof bup)) {
                                    int i2 = 0;
                                    for (bij bijVar3 = ((bup) bijVarY).y; bijVar3 != null; bijVar3 = bijVar3.q) {
                                        if ((bijVar3.n & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bijVarY = bijVar3;
                                            } else {
                                                if (bdpVar == null) {
                                                    bdpVar = new bdp(new bij[16]);
                                                }
                                                if (bijVarY != null) {
                                                    bdpVar.n(bijVarY);
                                                }
                                                bdpVar.n(bijVar3);
                                                bijVarY = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                bijVarY = bko.y(bdpVar);
                            }
                        }
                    }
                    bijVar2 = bijVar2.p;
                }
            }
            bvmVarB = bvmVarB.j();
            bijVar2 = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
        }
    }

    @Override // defpackage.bud
    public final /* synthetic */ Object m(ocq ocqVar) {
        return bqs.v(this, ocqVar);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [bbo, java.lang.Object] */
    public final bjv o() {
        boolean z;
        bwe bweVar;
        bjv bjvVar = new bjv();
        int i = this.d;
        if (a.p(i, 1)) {
            z = true;
        } else if (a.p(i, 0)) {
            z = !a.p(((bor) ((ocq) bko.H(this, bze.g)).a.a()).a, 1);
        } else {
            if (!a.p(i, 2)) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        bjvVar.a = z;
        bij bijVar = this.m;
        if (!bijVar.w) {
            bqs.c("visitAncestors called on an unattached node");
        }
        bij bijVar2 = this.m;
        bvm bvmVarB = bko.B(this);
        loop0: while (bvmVarB != null) {
            if ((bvmVarB.s.f.o & 3072) != 0) {
                while (bijVar2 != null) {
                    int i2 = bijVar2.n;
                    if ((i2 & 3072) != 0) {
                        if (bijVar2 != bijVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            bij bijVarY = bijVar2;
                            bdp bdpVar = null;
                            while (bijVarY != null) {
                                if (bijVarY instanceof bui) {
                                    ((bui) bijVarY).x();
                                } else if ((bijVarY.n & 2048) != 0 && (bijVarY instanceof bup)) {
                                    int i3 = 0;
                                    for (bij bijVar3 = ((bup) bijVarY).y; bijVar3 != null; bijVar3 = bijVar3.q) {
                                        if ((bijVar3.n & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                bijVarY = bijVar3;
                                            } else {
                                                if (bdpVar == null) {
                                                    bdpVar = new bdp(new bij[16]);
                                                }
                                                if (bijVarY != null) {
                                                    bdpVar.n(bijVarY);
                                                }
                                                bdpVar.n(bijVar3);
                                                bijVarY = null;
                                            }
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                bijVarY = bko.y(bdpVar);
                            }
                        }
                    }
                    bijVar2 = bijVar2.p;
                }
            }
            bvmVarB = bvmVarB.j();
            bijVar2 = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
        }
        return bjvVar;
    }

    @Override // defpackage.bij
    public final void cW() {
    }
}
