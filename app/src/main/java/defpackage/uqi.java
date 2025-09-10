package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uqi implements uqm {
    public final uiq a;
    public final uma b;
    public final uma c;
    public final umb d;
    public final umb e;
    private final int g;
    private final uma h;
    private final uma i;
    private final umb j;
    private final uiv k;
    private final umb l;
    private final umb m;

    public uqi(int i, uiq uiqVar) {
        this.g = i;
        this.a = uiqVar;
        if (i < 0) {
            throw new IllegalArgumentException(a.bE(i, "Invalid channel capacity: ", ", should be >=0"));
        }
        umc umcVar = umc.a;
        this.b = new uma(0L, umcVar);
        this.c = new uma(0L, umcVar);
        uqr uqrVar = uqk.a;
        this.h = new uma(i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L, umcVar);
        this.i = new uma(F(), umcVar);
        uqr uqrVar2 = new uqr(0L, null, this, 3);
        this.d = new umb(uqrVar2, umcVar);
        this.e = new umb(uqrVar2, umcVar);
        if (S()) {
            uqrVar2 = uqk.a;
            uqrVar2.getClass();
        }
        this.j = new umb(uqrVar2, umcVar);
        this.k = uiqVar != null ? new uxc(this, 1) : null;
        this.l = new umb(uqk.s, umcVar);
        this.m = new umb(null, umcVar);
    }

    public static final void D(upr uprVar, uqr uqrVar, int i) {
        uprVar.C(uqrVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int E(defpackage.uqr r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r6.d(r7)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L35
            boolean r0 = r5.P(r9)
            r4 = 0
            if (r0 == 0) goto L1b
            if (r12 != 0) goto L29
            uwc r0 = defpackage.uqk.d
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            return r3
        L1b:
            if (r12 != 0) goto L29
            if (r11 != 0) goto L21
            r5 = 3
            return r5
        L21:
            boolean r0 = r6.k(r7, r4, r11)
            if (r0 == 0) goto L0
            r5 = 2
            return r5
        L29:
            uwc r0 = defpackage.uqk.j
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            r6.h(r7, r2)
            return r1
        L35:
            uwc r4 = defpackage.uqk.e
            if (r0 != r4) goto L42
            uwc r1 = defpackage.uqk.d
            boolean r0 = r6.k(r7, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L42:
            uwc r9 = defpackage.uqk.k
            r10 = 5
            if (r0 == r9) goto L7e
            uwc r11 = defpackage.uqk.h
            if (r0 == r11) goto L7a
            uwc r11 = defpackage.uqk.l
            if (r0 != r11) goto L56
            r6.g(r7)
            r5.x()
            return r1
        L56:
            boolean r11 = defpackage.unf.a
            r6.g(r7)
            boolean r11 = r0 instanceof defpackage.urb
            if (r11 == 0) goto L63
            urb r0 = (defpackage.urb) r0
            upr r0 = r0.a
        L63:
            boolean r5 = r5.T(r0, r8)
            if (r5 == 0) goto L6f
            uwc r5 = defpackage.uqk.i
            r6.j(r7, r5)
            return r2
        L6f:
            java.lang.Object r5 = r6.b(r7, r9)
            if (r5 != r9) goto L76
            return r10
        L76:
            r6.h(r7, r3)
            return r10
        L7a:
            r6.g(r7)
            return r10
        L7e:
            r6.g(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqi.E(uqr, int, java.lang.Object, long, java.lang.Object, boolean):int");
    }

    private final long F() {
        return this.h.b;
    }

    private final Object G(Object obj, uhb uhbVar) {
        Throwable thL;
        uml umlVar = new uml(ske.aE(uhbVar), 1);
        umlVar.x();
        uiq uiqVar = this.a;
        if (uiqVar == null || (thL = ujk.l(uiqVar, obj, null)) == null) {
            Throwable thN = n();
            if (unf.b) {
                thN = uwb.a(thN, umlVar);
            }
            umlVar.fW(rnt.aM(thN));
        } else {
            ujk.f(thL, n());
            if (unf.b) {
                thL = uwb.a(thL, umlVar);
            }
            umlVar.fW(rnt.aM(thL));
        }
        Object objI = umlVar.i();
        uhi uhiVar = uhi.a;
        if (objI == uhiVar) {
            uhbVar.getClass();
        }
        return objI == uhiVar ? objI : ufg.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        r1 = (defpackage.uqr) r1.o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.uqr H(long r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqi.H(long):uqr");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0175, code lost:
    
        J(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0178, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqi.I():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(long j) {
        uma umaVar = this.i;
        if ((umaVar.a(j) & 4611686018427387904L) != 0) {
            while ((umaVar.b & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K(long r5, defpackage.uqr r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            uvb r0 = r7.n()
            uqr r0 = (defpackage.uqr) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.u()
            if (r5 == 0) goto L22
            uvb r5 = r7.n()
            uqr r5 = (defpackage.uqr) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            umb r5 = r4.j
        L24:
            java.lang.Object r6 = r5.a
            uvb r6 = (defpackage.uvb) r6
            long r0 = r6.b
            long r2 = r7.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L31
            goto L46
        L31:
            boolean r0 = r7.v()
            if (r0 == 0) goto L11
            boolean r0 = r5.d(r6, r7)
            if (r0 == 0) goto L47
            boolean r4 = r6.t()
            if (r4 == 0) goto L46
            r6.q()
        L46:
            return
        L47:
            boolean r6 = r7.t()
            if (r6 == 0) goto L24
            r7.q()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqi.K(long, uqr):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void L(Object obj, umk umkVar) {
        uiq uiqVar = this.a;
        if (uiqVar != null) {
            ujk.m(uiqVar, obj, umkVar.q());
        }
        Throwable thN = n();
        if (unf.b) {
            thN = uwb.a(thN, umkVar);
        }
        umkVar.fW(rnt.aM(thN));
    }

    private final void M(upr uprVar) {
        O(uprVar, true);
    }

    private final void N(upr uprVar) {
        O(uprVar, false);
    }

    private final void O(upr uprVar, boolean z) {
        if (uprVar instanceof uqb) {
            throw null;
        }
        if (uprVar instanceof umk) {
            ((uhb) uprVar).fW(rnt.aM(z ? m() : n()));
            return;
        }
        if (uprVar instanceof uqy) {
            ((uqy) uprVar).a.fW(new uqq(new uqo(l())));
            return;
        }
        if (!(uprVar instanceof uqa)) {
            if (uprVar instanceof uwx) {
                ((uwx) uprVar).g(this, uqk.l);
                return;
            } else {
                Objects.toString(uprVar);
                throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(uprVar)));
            }
        }
        uqa uqaVar = (uqa) uprVar;
        uml umlVar = uqaVar.b;
        umlVar.getClass();
        uqaVar.b = null;
        uqaVar.a = uqk.l;
        Throwable thL = uqaVar.c.l();
        if (thL == null) {
            umlVar.fW(false);
            return;
        }
        if (unf.b) {
            thL = uwb.a(thL, umlVar);
        }
        umlVar.fW(rnt.aM(thL));
    }

    private final boolean P(long j) {
        return j < F() || j < b() + ((long) this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b5, code lost:
    
        r12 = (defpackage.uqr) r12.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0121, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean Q(long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqi.Q(long, boolean):boolean");
    }

    private final boolean R(long j) {
        return Q(j, true);
    }

    private final boolean S() {
        long jF = F();
        return jF == 0 || jF == Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [uiv] */
    /* JADX WARN: Type inference failed for: r2v9 */
    private final boolean T(Object obj, Object obj2) {
        if (obj instanceof uwx) {
            return ((uwx) obj).g(this, obj2);
        }
        if (obj instanceof uqy) {
            obj.getClass();
            return uqk.c(((uqy) obj).a, new uqq(obj2), this.a != null ? new uqd(this, 0) : null);
        }
        if (!(obj instanceof uqa)) {
            if (obj instanceof umk) {
                obj.getClass();
                return uqk.c((umk) obj, obj2, this.a != null ? new uqc(this, 0) : 0);
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        uqa uqaVar = (uqa) obj;
        uml umlVar = uqaVar.b;
        umlVar.getClass();
        uqaVar.b = null;
        uqaVar.a = obj2;
        uiq uiqVar = uqaVar.c.a;
        return uqk.c(umlVar, true, uiqVar != null ? new cgt(uiqVar, obj2, 3, ) : null);
    }

    private final boolean U(Object obj, uqr uqrVar, int i) {
        if (obj instanceof umk) {
            obj.getClass();
            return uqk.c((umk) obj, ufg.a, null);
        }
        if (!(obj instanceof uwx)) {
            if (obj instanceof uqb) {
                throw null;
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        int iB = ((uwx) obj).b(this, ufg.a);
        char c = iB != 0 ? iB != 1 ? iB != 2 ? (char) 4 : (char) 3 : (char) 2 : (char) 1;
        if (c != 2) {
            return c == 1;
        }
        uqrVar.g(i);
        return false;
    }

    private static final void V(upr uprVar, uqr uqrVar, int i) {
        uprVar.C(uqrVar, i + uqk.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object f(defpackage.uqi r13, defpackage.uhb r14) {
        /*
            boolean r0 = r14 instanceof defpackage.uqg
            if (r0 == 0) goto L13
            r0 = r14
            uqg r0 = (defpackage.uqg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uqg r0 = new uqg
            r0.<init>(r13, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.a
            uhi r0 = defpackage.uhi.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            defpackage.rnt.aN(r14)
            uqq r14 = (defpackage.uqq) r14
            java.lang.Object r13 = r14.b
            return r13
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            defpackage.rnt.aN(r14)
            umb r14 = r13.e
            java.lang.Object r14 = r14.a
            uqr r14 = (defpackage.uqr) r14
        L3d:
            boolean r1 = r13.w()
            if (r1 == 0) goto L4d
            java.lang.Throwable r13 = r13.l()
            uqo r14 = new uqo
            r14.<init>(r13)
            return r14
        L4d:
            uma r1 = r13.c
            long r4 = r1.b()
            int r1 = defpackage.uqk.b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.b
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L69
            uqr r1 = r13.o(r9, r14)
            if (r1 == 0) goto L3d
            r8 = r1
            goto L6a
        L69:
            r8 = r14
        L6a:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.k(r8, r9, r10, r12)
            r1 = r7
            uwc r14 = defpackage.uqk.m
            if (r13 == r14) goto L9c
            uwc r14 = defpackage.uqk.o
            if (r13 != r14) goto L89
            long r13 = r1.c()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L86
            r8.p()
        L86:
            r13 = r1
            r14 = r8
            goto L3d
        L89:
            uwc r14 = defpackage.uqk.n
            if (r13 != r14) goto L98
            r6.c = r2
            r2 = r8
            java.lang.Object r13 = r1.g(r2, r3, r4, r6)
            if (r13 != r0) goto L97
            return r0
        L97:
            return r13
        L98:
            r8.p()
            return r13
        L9c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqi.f(uqi, uhb):java.lang.Object");
    }

    @Override // defpackage.uqz
    public final uqa A() {
        return new uqa(this);
    }

    @Override // defpackage.uqz
    public final uwt B() {
        uqe uqeVar = uqe.a;
        ukc.e(uqeVar, 3);
        uqf uqfVar = uqf.a;
        ukc.e(uqfVar, 3);
        return new uwt(this, uqeVar, uqfVar, this.k);
    }

    public final int a(uqr uqrVar, int i, Object obj, long j, Object obj2, boolean z) {
        uqrVar.i(i, obj);
        if (z) {
            return E(uqrVar, i, obj, j, obj2, true);
        }
        Object objD = uqrVar.d(i);
        if (objD == null) {
            if (P(j)) {
                if (uqrVar.k(i, null, uqk.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (uqrVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objD instanceof upr) {
            uqrVar.g(i);
            if (T(objD, obj)) {
                uqrVar.j(i, uqk.i);
                return 0;
            }
            uwc uwcVar = uqk.k;
            if (uqrVar.b(i, uwcVar) == uwcVar) {
                return 5;
            }
            uqrVar.h(i, true);
            return 5;
        }
        return E(uqrVar, i, obj, j, obj2, false);
    }

    public final long b() {
        return this.c.b;
    }

    public final long c() {
        return this.b.b & 1152921504606846975L;
    }

    @Override // defpackage.uqz
    public final Object d(uhb uhbVar) throws Throwable {
        uqi uqiVar = this;
        umb umbVar = uqiVar.e;
        uqr uqrVar = (uqr) umbVar.a;
        while (!uqiVar.w()) {
            uma umaVar = uqiVar.c;
            long jB = umaVar.b();
            long j = uqk.b;
            long j2 = jB / j;
            int i = (int) (jB % j);
            if (uqrVar.b != j2) {
                uqr uqrVarO = uqiVar.o(j2, uqrVar);
                if (uqrVarO != null) {
                    uqrVar = uqrVarO;
                } else {
                    continue;
                }
            }
            Object objK = uqiVar.k(uqrVar, i, jB, null);
            Object obj = uqk.m;
            if (objK == obj) {
                throw new IllegalStateException("unexpected");
            }
            Object obj2 = uqk.o;
            if (objK == obj2) {
                if (jB < c()) {
                    uqrVar.p();
                }
                uqiVar = this;
            } else {
                Object obj3 = uqk.n;
                if (objK != obj3) {
                    uqrVar.p();
                    return objK;
                }
                uml umlVarQ = ung.q(ske.aE(uhbVar));
                try {
                    Object objK2 = k(uqrVar, i, jB, umlVarQ);
                    if (objK2 == obj) {
                        D(umlVarQ, uqrVar, i);
                    } else if (objK2 == obj2) {
                        if (jB < c()) {
                            uqrVar.p();
                        }
                        uqr uqrVar2 = (uqr) umbVar.a;
                        while (true) {
                            if (w()) {
                                umlVarQ.fW(rnt.aM(m()));
                                break;
                            }
                            long jB2 = umaVar.b();
                            long j3 = jB2 / j;
                            uml umlVar = umlVarQ;
                            try {
                                int i2 = (int) (jB2 % j);
                                if (uqrVar2.b != j3) {
                                    uqr uqrVarO2 = o(j3, uqrVar2);
                                    if (uqrVarO2 != null) {
                                        uqrVar2 = uqrVarO2;
                                    } else {
                                        umlVarQ = umlVar;
                                    }
                                }
                                umlVarQ = umlVar;
                                Object objK3 = k(uqrVar2, i2, jB2, umlVarQ);
                                if (objK3 == obj) {
                                    D(umlVarQ, uqrVar2, i2);
                                    break;
                                }
                                if (objK3 == obj2) {
                                    if (jB2 < c()) {
                                        uqrVar2.p();
                                    }
                                } else {
                                    if (objK3 == obj3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    uqrVar2.p();
                                    umlVarQ.e(objK3, this.a != null ? new uqc(this, 0) : null);
                                }
                            } catch (Throwable th) {
                                th = th;
                                umlVarQ = umlVar;
                                umlVarQ.z();
                                throw th;
                            }
                        }
                    } else {
                        uqrVar.p();
                        umlVarQ.e(objK2, this.a != null ? new uqc(this, 0) : null);
                    }
                    Object objI = umlVarQ.i();
                    uhi uhiVar = uhi.a;
                    return objI;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        throw uwb.b(uqiVar.m());
    }

    @Override // defpackage.uqz
    public final Object e(uhb uhbVar) {
        return f(this, uhbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.uqr r17, int r18, long r19, defpackage.uhb r21) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqi.g(uqr, int, long, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f A[RETURN] */
    @Override // defpackage.ura
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(java.lang.Object r22, defpackage.uhb r23) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqi.h(java.lang.Object, uhb):java.lang.Object");
    }

    @Override // defpackage.uqz
    public final Object i() {
        uqr uqrVar;
        uma umaVar = this.c;
        long j = umaVar.b;
        long j2 = this.b.b;
        if (R(j2)) {
            return new uqo(l());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return uqq.a;
        }
        umb umbVar = this.e;
        uwc uwcVar = uqk.k;
        uqr uqrVar2 = (uqr) umbVar.a;
        while (!this.w()) {
            long jB = umaVar.b();
            long j3 = uqk.b;
            long j4 = jB / j3;
            int i = (int) (jB % j3);
            if (uqrVar2.b != j4) {
                uqr uqrVarO = this.o(j4, uqrVar2);
                if (uqrVarO != null) {
                    uqrVar = uqrVarO;
                } else {
                    continue;
                }
            } else {
                uqrVar = uqrVar2;
            }
            uqi uqiVar = this;
            Object objK = uqiVar.k(uqrVar, i, jB, uwcVar);
            uqrVar2 = uqrVar;
            if (objK == uqk.m) {
                uqiVar.t(jB);
                uqrVar2.s();
                return uqq.a;
            }
            if (objK != uqk.o) {
                if (objK == uqk.n) {
                    throw new IllegalStateException("unexpected");
                }
                uqrVar2.p();
                return objK;
            }
            if (jB < uqiVar.c()) {
                uqrVar2.p();
            }
            this = uqiVar;
        }
        return new uqo(this.l());
    }

    @Override // defpackage.ura
    public Object j(Object obj) {
        uqr uqrVar;
        uma umaVar = this.b;
        long j = umaVar.b;
        if (!y(j) && !P(j & 1152921504606846975L)) {
            return uqq.a;
        }
        umb umbVar = this.d;
        uwc uwcVar = uqk.j;
        uqr uqrVar2 = (uqr) umbVar.a;
        while (true) {
            long jB = umaVar.b();
            long j2 = jB & 1152921504606846975L;
            boolean zY = this.y(jB);
            long j3 = uqk.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (uqrVar2.b != j4) {
                uqr uqrVarP = this.p(j4, uqrVar2);
                if (uqrVarP != null) {
                    uqrVar = uqrVarP;
                } else if (zY) {
                    return new uqo(this.n());
                }
            } else {
                uqrVar = uqrVar2;
            }
            uqi uqiVar = this;
            Object obj2 = obj;
            int iA = uqiVar.a(uqrVar, i, obj2, j2, uwcVar, zY);
            uqrVar2 = uqrVar;
            if (iA == 0) {
                uqrVar2.p();
                return ufg.a;
            }
            if (iA == 1) {
                return ufg.a;
            }
            if (iA == 2) {
                if (zY) {
                    uqrVar2.s();
                    return new uqo(uqiVar.n());
                }
                uqrVar2.s();
                return uqq.a;
            }
            if (iA == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iA == 4) {
                if (j2 < uqiVar.b()) {
                    uqrVar2.p();
                }
                return new uqo(uqiVar.n());
            }
            uqrVar2.p();
            this = uqiVar;
            obj = obj2;
        }
    }

    public final Object k(uqr uqrVar, int i, long j, Object obj) {
        Object objD = uqrVar.d(i);
        if (objD == null) {
            if (j >= (this.b.b & 1152921504606846975L)) {
                if (obj == null) {
                    return uqk.n;
                }
                if (uqrVar.k(i, null, obj)) {
                    I();
                    return uqk.m;
                }
            }
        } else if (objD == uqk.d && uqrVar.k(i, objD, uqk.i)) {
            I();
            return uqrVar.e(i);
        }
        while (true) {
            Object objD2 = uqrVar.d(i);
            if (objD2 == null || objD2 == uqk.e) {
                if (j < (this.b.b & 1152921504606846975L)) {
                    if (uqrVar.k(i, objD2, uqk.h)) {
                        I();
                        return uqk.o;
                    }
                } else {
                    if (obj == null) {
                        return uqk.n;
                    }
                    if (uqrVar.k(i, objD2, obj)) {
                        I();
                        return uqk.m;
                    }
                }
            } else if (objD2 != uqk.d) {
                uwc uwcVar = uqk.j;
                if (objD2 == uwcVar) {
                    return uqk.o;
                }
                if (objD2 == uqk.h) {
                    return uqk.o;
                }
                if (objD2 == uqk.l) {
                    I();
                    return uqk.o;
                }
                if (objD2 != uqk.g && uqrVar.k(i, objD2, uqk.f)) {
                    boolean z = objD2 instanceof urb;
                    if (z) {
                        objD2 = ((urb) objD2).a;
                    }
                    if (U(objD2, uqrVar, i)) {
                        uqrVar.j(i, uqk.i);
                        I();
                        return uqrVar.e(i);
                    }
                    uqrVar.j(i, uwcVar);
                    uqrVar.h(i, false);
                    if (z) {
                        I();
                    }
                    return uqk.o;
                }
            } else if (uqrVar.k(i, objD2, uqk.i)) {
                I();
                return uqrVar.e(i);
            }
        }
    }

    protected final Throwable l() {
        return (Throwable) this.l.a;
    }

    public final Throwable m() {
        Throwable thL = l();
        return thL == null ? new uqs() : thL;
    }

    protected final Throwable n() {
        Throwable thL = l();
        return thL == null ? new uqt("Channel was closed") : thL;
    }

    public final uqr o(long j, uqr uqrVar) {
        Object objA;
        long j2;
        long j3;
        uqr uqrVar2 = uqk.a;
        uqj uqjVar = uqj.a;
        loop0: while (true) {
            objA = uva.a(uqrVar, j, uqjVar);
            if (!uwa.a(objA)) {
                uvb uvbVarB = uwa.b(objA);
                while (true) {
                    umb umbVar = this.e;
                    uvb uvbVar = (uvb) umbVar.a;
                    if (uvbVar.b >= uvbVarB.b) {
                        break loop0;
                    }
                    if (uvbVarB.v()) {
                        if (umbVar.d(uvbVar, uvbVarB)) {
                            if (uvbVar.t()) {
                                uvbVar.q();
                            }
                        } else if (uvbVarB.t()) {
                            uvbVarB.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (uwa.a(objA)) {
            x();
            if (uqrVar.b * uqk.b >= c()) {
                return null;
            }
            uqrVar.p();
            return null;
        }
        uqr uqrVar3 = (uqr) uwa.b(objA);
        if (!S() && j <= F() / uqk.b) {
            umb umbVar2 = this.j;
            while (true) {
                uvb uvbVar2 = (uvb) umbVar2.a;
                if (uvbVar2.b >= uqrVar3.b || !uqrVar3.v()) {
                    break;
                }
                if (umbVar2.d(uvbVar2, uqrVar3)) {
                    if (uvbVar2.t()) {
                        uvbVar2.q();
                    }
                } else if (uqrVar3.t()) {
                    uqrVar3.q();
                }
            }
        }
        long j4 = uqrVar3.b;
        if (j4 <= j) {
            boolean z = unf.a;
            return uqrVar3;
        }
        long j5 = uqk.b;
        uma umaVar = this.c;
        do {
            j2 = j4 * j5;
            j3 = umaVar.b;
            if (j3 >= j2) {
                break;
            }
        } while (!umaVar.d(j3, j2));
        if (j2 >= c()) {
            return null;
        }
        uqrVar3.p();
        return null;
    }

    public final uqr p(long j, uqr uqrVar) {
        Object objA;
        long j2;
        long j3;
        long j4;
        uqr uqrVar2 = uqk.a;
        uqj uqjVar = uqj.a;
        loop0: while (true) {
            objA = uva.a(uqrVar, j, uqjVar);
            if (!uwa.a(objA)) {
                uvb uvbVarB = uwa.b(objA);
                while (true) {
                    umb umbVar = this.d;
                    uvb uvbVar = (uvb) umbVar.a;
                    if (uvbVar.b >= uvbVarB.b) {
                        break loop0;
                    }
                    if (uvbVarB.v()) {
                        if (umbVar.d(uvbVar, uvbVarB)) {
                            if (uvbVar.t()) {
                                uvbVar.q();
                            }
                        } else if (uvbVarB.t()) {
                            uvbVarB.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (uwa.a(objA)) {
            x();
            if (uqrVar.b * uqk.b >= b()) {
                return null;
            }
            uqrVar.p();
            return null;
        }
        uqr uqrVar3 = (uqr) uwa.b(objA);
        long j5 = uqrVar3.b;
        if (j5 <= j) {
            boolean z = unf.a;
            return uqrVar3;
        }
        long j6 = uqk.b;
        uma umaVar = this.b;
        do {
            j2 = j5 * j6;
            j3 = umaVar.b;
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                break;
            }
        } while (!umaVar.d(j3, uqk.b(j4, (int) (j3 >> 60))));
        if (j2 >= b()) {
            return null;
        }
        uqrVar3.p();
        return null;
    }

    protected final void q(long j) {
        uqr uqrVar;
        uwi uwiVarL;
        boolean z = unf.a;
        uqr uqrVar2 = (uqr) this.e.a;
        while (true) {
            uma umaVar = this.c;
            int i = this.g;
            long j2 = umaVar.b;
            if (j < Math.max(i + j2, this.F())) {
                return;
            }
            if (umaVar.d(j2, 1 + j2)) {
                long j3 = uqk.b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (uqrVar2.b != j4) {
                    uqr uqrVarO = this.o(j4, uqrVar2);
                    if (uqrVarO != null) {
                        uqrVar = uqrVarO;
                    }
                } else {
                    uqrVar = uqrVar2;
                }
                uqi uqiVar = this;
                Object objK = uqiVar.k(uqrVar, i2, j2, null);
                if (objK != uqk.o) {
                    uqrVar.p();
                    uiq uiqVar = uqiVar.a;
                    if (uiqVar != null && (uwiVarL = ujk.l(uiqVar, objK, null)) != null) {
                        throw uwiVarL;
                    }
                } else if (j2 < uqiVar.c()) {
                    uqrVar.p();
                }
                this = uqiVar;
                uqrVar2 = uqrVar;
            }
            this = this;
        }
    }

    @Override // defpackage.ura
    public final void r(uiq uiqVar) {
        uwc uwcVar;
        umb umbVar = this.m;
        if (umbVar.d(null, uiqVar)) {
            return;
        }
        do {
            Object obj = umbVar.a;
            uwcVar = uqk.q;
            if (obj != uwcVar) {
                if (obj == uqk.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(obj);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)));
            }
        } while (!umbVar.d(uwcVar, uqk.r));
        uiqVar.a(l());
    }

    @Override // defpackage.uqz
    public final void s(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        v(cancellationException, true);
    }

    public final void t(long j) {
        long j2;
        long j3;
        if (S()) {
            return;
        }
        while (F() <= j) {
        }
        int i = uqk.c;
        for (int i2 = 0; i2 < i; i2++) {
            long jF = F();
            if (jF == (4611686018427387903L & this.i.b) && jF == F()) {
                return;
            }
        }
        uma umaVar = this.i;
        do {
            j2 = umaVar.b;
        } while (!umaVar.d(j2, uqk.a(j2 & 4611686018427387903L, true)));
        while (true) {
            long jF2 = F();
            long j4 = umaVar.b;
            long j5 = j4 & 4611686018427387903L;
            long j6 = 4611686018427387904L & j4;
            if (jF2 == j5 && jF2 == F()) {
                break;
            } else if (j6 == 0) {
                umaVar.d(j4, uqk.a(j5, true));
            }
        }
        do {
            j3 = umaVar.b;
        } while (!umaVar.d(j3, uqk.a(j3 & 4611686018427387903L, false)));
    }

    @Override // defpackage.ura
    public final boolean u(Throwable th) {
        return v(th, false);
    }

    protected final boolean v(Throwable th, boolean z) {
        long j;
        long jB;
        Object obj;
        long j2;
        long j3;
        if (z) {
            uma umaVar = this.b;
            do {
                j3 = umaVar.b;
                if (((int) (j3 >> 60)) != 0) {
                    break;
                }
            } while (!umaVar.d(j3, uqk.b(j3 & 1152921504606846975L, 1)));
        }
        boolean zD = this.l.d(uqk.s, th);
        if (z) {
            uma umaVar2 = this.b;
            do {
                j2 = umaVar2.b;
            } while (!umaVar2.d(j2, uqk.b(j2 & 1152921504606846975L, 3)));
        } else {
            uma umaVar3 = this.b;
            do {
                j = umaVar3.b;
                int i = (int) (j >> 60);
                if (i == 0) {
                    jB = uqk.b(j & 1152921504606846975L, 2);
                } else {
                    if (i != 1) {
                        break;
                    }
                    jB = uqk.b(j & 1152921504606846975L, 3);
                }
            } while (!umaVar3.d(j, jB));
        }
        x();
        if (zD) {
            umb umbVar = this.m;
            do {
                obj = umbVar.a;
            } while (!umbVar.d(obj, obj == null ? uqk.q : uqk.r));
            if (obj != null) {
                ukc.e(obj, 1);
                ((uiq) obj).a(l());
                return true;
            }
        }
        return zD;
    }

    public final boolean w() {
        return R(this.b.b);
    }

    @Override // defpackage.ura
    public final boolean x() {
        return y(this.b.b);
    }

    public final boolean y(long j) {
        return Q(j, false);
    }

    protected boolean z() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0196, code lost:
    
        r3 = (defpackage.uqr) r3.n();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqi.toString():java.lang.String");
    }
}
