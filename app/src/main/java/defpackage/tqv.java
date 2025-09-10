package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tqv implements trg {
    private final tqr a;
    private final trp b;
    private final boolean c;

    public tqv(trp trpVar, tqr tqrVar) {
        this.b = trpVar;
        this.c = tqrVar instanceof tpf;
        this.a = tqrVar;
    }

    @Override // defpackage.trg
    public final int a(Object obj) {
        trq trqVarF = trp.f(obj);
        int iAa = trqVarF.e;
        if (iAa == -1) {
            iAa = 0;
            for (int i = 0; i < trqVarF.b; i++) {
                int iA = tsa.a(trqVarF.c[i]);
                toj tojVar = (toj) trqVarF.d[i];
                int iZ = tos.Z(1);
                iAa += iZ + iZ + tos.aa(2, iA) + tos.G(3, tojVar);
            }
            trqVarF.e = iAa;
        }
        if (!this.c) {
            return iAa;
        }
        toy toyVarBd = rnt.bd(obj);
        trl trlVar = toyVarBd.b;
        int i2 = trlVar.b;
        int iB = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iB += toyVarBd.b(trlVar.d(i3));
        }
        Iterator it = trlVar.a().iterator();
        while (it.hasNext()) {
            iB += toyVarBd.b((Map.Entry) it.next());
        }
        return iAa + iB;
    }

    @Override // defpackage.trg
    public final int b(Object obj) {
        int iHashCode = trp.f(obj).hashCode();
        return this.c ? (iHashCode * 53) + rnt.bd(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.trg
    public final Object e() {
        tqr tqrVar = this.a;
        return tqrVar instanceof tph ? ((tph) tqrVar).o() : tqrVar.ee().m();
    }

    @Override // defpackage.trg
    public final void g(Object obj) {
        this.b.e(obj);
        rnt.bg(obj);
    }

    @Override // defpackage.trg
    public final void h(Object obj, Object obj2) {
        trh.n(obj, obj2);
        if (this.c) {
            trh.m(obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf A[EDGE_INSN: B:61:0x00bf->B:33:0x00bf BREAK  A[LOOP:1: B:17:0x0067->B:64:0x0067], SYNTHETIC] */
    @Override // defpackage.trg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.tnx r15) throws defpackage.tpz {
        /*
            r10 = this;
            r0 = r11
            tph r0 = (defpackage.tph) r0
            trq r1 = r0.aW
            trq r2 = defpackage.trq.a
            if (r1 != r2) goto L10
            trq r1 = new trq
            r1.<init>()
            r0.aW = r1
        L10:
            r6 = r1
            tpf r11 = (defpackage.tpf) r11
            toy r11 = r11.c()
            r0 = 0
            r1 = r0
        L19:
            if (r13 >= r14) goto Lcd
            int r4 = defpackage.tny.l(r12, r13, r15)
            int r2 = r15.a
            int r13 = defpackage.tsa.a
            r3 = 2
            if (r2 == r13) goto L63
            int r13 = defpackage.tsa.b(r2)
            if (r13 != r3) goto L5c
            tow r13 = r15.d
            tqr r1 = r10.a
            int r3 = defpackage.tsa.a(r2)
            tql r1 = r13.c(r1, r3)
            if (r1 == 0) goto L54
            java.lang.Object r13 = r1.a
            tra r2 = defpackage.tra.a
            java.lang.Class r13 = r13.getClass()
            trg r13 = r2.a(r13)
            int r13 = defpackage.tny.f(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.c
            java.lang.Object r3 = r1.c
            tpg r3 = (defpackage.tpg) r3
            r11.l(r3, r2)
            goto L19
        L54:
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = defpackage.tny.k(r2, r3, r4, r5, r6, r7)
            goto L19
        L5c:
            r5 = r14
            r7 = r15
            int r13 = defpackage.tny.r(r2, r12, r4, r5, r7)
            goto L19
        L63:
            r5 = r14
            r7 = r15
            r13 = 0
            r14 = r0
        L67:
            if (r4 >= r5) goto Lbe
            int r15 = defpackage.tny.l(r12, r4, r7)
            int r2 = r7.a
            int r4 = defpackage.tsa.a(r2)
            int r8 = defpackage.tsa.b(r2)
            if (r4 == r3) goto La4
            r9 = 3
            if (r4 == r9) goto L7d
            goto Lb5
        L7d:
            if (r1 == 0) goto L99
            java.lang.Object r2 = r1.a
            tra r4 = defpackage.tra.a
            java.lang.Class r2 = r2.getClass()
            trg r2 = r4.a(r2)
            int r4 = defpackage.tny.f(r2, r12, r15, r5, r7)
            java.lang.Object r15 = r7.c
            java.lang.Object r2 = r1.c
            tpg r2 = (defpackage.tpg) r2
            r11.l(r2, r15)
            goto L67
        L99:
            if (r8 != r3) goto Lb5
            int r4 = defpackage.tny.c(r12, r15, r7)
            java.lang.Object r14 = r7.c
            toj r14 = (defpackage.toj) r14
            goto L67
        La4:
            if (r8 != 0) goto Lb5
            int r4 = defpackage.tny.l(r12, r15, r7)
            int r13 = r7.a
            tow r15 = r7.d
            tqr r1 = r10.a
            tql r1 = r15.c(r1, r13)
            goto L67
        Lb5:
            int r4 = defpackage.tsa.b
            if (r2 == r4) goto Lbf
            int r4 = defpackage.tny.r(r2, r12, r15, r5, r7)
            goto L67
        Lbe:
            r15 = r4
        Lbf:
            if (r14 == 0) goto Lc8
            int r13 = defpackage.tsa.c(r13, r3)
            r6.e(r13, r14)
        Lc8:
            r13 = r15
            r14 = r5
            r15 = r7
            goto L19
        Lcd:
            r5 = r14
            if (r13 != r5) goto Ld1
            return
        Ld1:
            tpz r10 = new tpz
            java.lang.String r11 = "Failed to parse the message."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqv.i(java.lang.Object, byte[], int, int, tnx):void");
    }

    @Override // defpackage.trg
    public final boolean j(Object obj, Object obj2) {
        if (!trp.f(obj).equals(trp.f(obj2))) {
            return false;
        }
        if (this.c) {
            return rnt.bd(obj).equals(rnt.bd(obj2));
        }
        return true;
    }

    @Override // defpackage.trg
    public final boolean k(Object obj) {
        return rnt.bd(obj).i();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tqr] */
    @Override // defpackage.trg
    public final void l(Object obj, too tooVar, tow towVar) {
        boolean zP;
        trp trpVar = this.b;
        Object objB = trpVar.b(obj);
        toy toyVarBe = rnt.be(obj);
        while (tooVar.c() != Integer.MAX_VALUE) {
            try {
                int i = tooVar.b;
                if (i != tsa.a) {
                    if (tsa.b(i) == 2) {
                        tql tqlVarC = towVar.c(this.a, tsa.a(i));
                        if (tqlVarC != null) {
                            rnt.bf(tooVar, tqlVarC, towVar, toyVarBe);
                        } else {
                            zP = trpVar.a(objB, tooVar, 0);
                        }
                    } else {
                        zP = tooVar.P();
                    }
                    if (!zP) {
                        break;
                    }
                } else {
                    tql tqlVarC2 = null;
                    toj tojVarO = null;
                    int i2 = 0;
                    while (tooVar.c() != Integer.MAX_VALUE) {
                        int i3 = tooVar.b;
                        if (i3 == tsa.c) {
                            i2 = tooVar.i();
                            tqlVarC2 = towVar.c(this.a, i2);
                        } else if (i3 == tsa.d) {
                            if (tqlVarC2 != null) {
                                rnt.bf(tooVar, tqlVarC2, towVar, toyVarBe);
                            } else {
                                tojVarO = tooVar.o();
                            }
                        } else if (i3 == tsa.b || !tooVar.P()) {
                            break;
                        }
                    }
                    if (tooVar.b != tsa.b) {
                        throw new tpz("Protocol message end-group tag did not match expected tag.");
                    }
                    if (tojVarO != null) {
                        if (tqlVarC2 != null) {
                            tqq tqqVarEe = tqlVarC2.a.ee();
                            ton tonVarQ = ton.Q(((toh) tojVarO).a, 0, ((toh) tojVarO).d());
                            tqqVarEe.f(tonVarQ, towVar);
                            toyVarBe.l((tpg) tqlVarC2.c, tqqVarEe.m());
                            tonVarQ.z(0);
                        } else {
                            trpVar.c(objB, i2, tojVarO);
                        }
                    }
                }
            } finally {
                trp.g(obj, (trq) objB);
            }
        }
    }

    @Override // defpackage.trg
    public final void m(Object obj, ocq ocqVar) {
        Iterator itD = rnt.bd(obj).d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            tpg tpgVar = (tpg) entry.getKey();
            if (tpgVar.a() != trz.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof tqb) {
                ocqVar.K(tpgVar.a, ((tqd) ((tqb) entry).a.getValue()).a());
            } else {
                ocqVar.K(tpgVar.a, entry.getValue());
            }
        }
        trq trqVarF = trp.f(obj);
        for (int i = 0; i < trqVarF.b; i++) {
            ocqVar.K(tsa.a(trqVarF.c[i]), trqVarF.d[i]);
        }
    }
}
