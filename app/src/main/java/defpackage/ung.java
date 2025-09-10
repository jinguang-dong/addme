package defpackage;

import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ung {
    public static final utj A(urk urkVar, und undVar, utd utdVar, Object obj) throws Throwable {
        utb utbVarB = B(urkVar);
        uhf uhfVar = utbVarB.c;
        urk urkVar2 = utbVarB.a;
        utl utlVarA = utm.a(obj);
        C(undVar, uhfVar, urkVar2, utlVarA, utdVar, obj);
        return new ust(utlVarA);
    }

    public static final utb B(urk urkVar) {
        utw utwVar;
        urk urkVarF;
        boolean z = unf.a;
        int i = uqm.f;
        boolean z2 = urkVar instanceof utw;
        int iN = ukc.n(1, uql.a) - 1;
        if (!z2 || (urkVarF = (utwVar = (utw) urkVar).f()) == null) {
            return new utb(urkVar, iN, 1, uhg.a);
        }
        int i2 = utwVar.b;
        if (i2 != -3 && i2 != -2 && i2 != 0) {
            iN = i2;
        } else if (utwVar.c != 1 || i2 == 0) {
            iN = 0;
        }
        return new utb(urkVarF, iN, utwVar.c, utwVar.a);
    }

    public static final void C(und undVar, uhf uhfVar, urk urkVar, usr usrVar, utd utdVar, Object obj) throws Throwable {
        boolean zAo = a.ao(utdVar, utc.a);
        t(undVar, uhfVar, true != zAo ? 4 : 1, new usm(utdVar, urkVar, usrVar, obj, (uhb) null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D(defpackage.urk r5, defpackage.uhb r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ush
            if (r0 == 0) goto L13
            r0 = r6
            ush r0 = (defpackage.ush) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ush r0 = new ush
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            iqb r5 = r0.d
            uka r1 = r0.c
            defpackage.rnt.aN(r6)     // Catch: defpackage.utq -> L2b
            goto L64
        L2b:
            r6 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.rnt.aN(r6)
            uka r6 = new uka
            r6.<init>()
            uwc r2 = defpackage.uum.a
            r6.a = r2
            iqb r2 = new iqb
            r4 = 4
            r2.<init>(r6, r4)
            r0.c = r6     // Catch: defpackage.utq -> L56
            r0.d = r2     // Catch: defpackage.utq -> L56
            r0.b = r3     // Catch: defpackage.utq -> L56
            java.lang.Object r5 = r5.gc(r2, r0)     // Catch: defpackage.utq -> L56
            if (r5 == r1) goto L55
            r1 = r6
            goto L64
        L55:
            return r1
        L56:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L5a:
            y(r6, r5)
            uhf r5 = r0.q()
            defpackage.ujp.T(r5)
        L64:
            java.lang.Object r5 = r1.a
            uwc r6 = defpackage.uum.a
            if (r5 == r6) goto L6b
            return r5
        L6b:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ung.D(urk, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object E(defpackage.urk r4, defpackage.uiu r5, defpackage.uhb r6) {
        /*
            boolean r0 = r6 instanceof defpackage.usi
            if (r0 == 0) goto L13
            r0 = r6
            usi r0 = (defpackage.usi) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            usi r0 = new usi
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            usg r4 = r0.d
            uka r5 = r0.c
            defpackage.rnt.aN(r6)     // Catch: defpackage.utq -> L2b
            goto L63
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.rnt.aN(r6)
            uka r6 = new uka
            r6.<init>()
            uwc r2 = defpackage.uum.a
            r6.a = r2
            usg r2 = new usg
            r2.<init>(r5, r6)
            r0.c = r6     // Catch: defpackage.utq -> L55
            r0.d = r2     // Catch: defpackage.utq -> L55
            r0.b = r3     // Catch: defpackage.utq -> L55
            java.lang.Object r4 = r4.gc(r2, r0)     // Catch: defpackage.utq -> L55
            if (r4 == r1) goto L54
            r5 = r6
            goto L63
        L54:
            return r1
        L55:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L59:
            y(r6, r4)
            uhf r4 = r0.q()
            defpackage.ujp.T(r4)
        L63:
            java.lang.Object r4 = r5.a
            uwc r5 = defpackage.uum.a
            if (r4 == r5) goto L6a
            return r4
        L6a:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ung.E(urk, uiu, uhb):java.lang.Object");
    }

    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(uhb uhbVar) {
        Object objAM;
        if (uhbVar instanceof uvg) {
            return ((uvg) uhbVar).toString();
        }
        try {
            objAM = uhbVar + "@" + b(uhbVar);
        } catch (Throwable th) {
            objAM = rnt.aM(th);
        }
        if (uex.a(objAM) != null) {
            objAM = uhbVar.getClass().getName() + "@" + b(uhbVar);
        }
        return (String) objAM;
    }

    public static final Object e(long j, uhb uhbVar) {
        if (j > 0) {
            uml umlVar = new uml(ske.aE(uhbVar), 1);
            umlVar.x();
            if (j < Long.MAX_VALUE) {
                f(umlVar.b).c(j, umlVar);
            }
            Object objI = umlVar.i();
            if (objI == uhi.a) {
                return objI;
            }
        }
        return ufg.a;
    }

    public static final unk f(uhf uhfVar) {
        uhd uhdVar = uhfVar.get(uhc.k);
        unk unkVar = uhdVar instanceof unk ? (unk) uhdVar : null;
        return unkVar == null ? uni.a : unkVar;
    }

    public static void g(int i, uiu uiuVar, Object obj, uhb uhbVar) throws Throwable {
        Object objA;
        int i2 = i - 1;
        if (i2 == 0) {
            ukc.Y(uiuVar, obj, uhbVar);
            return;
        }
        if (i2 == 2) {
            uiuVar.getClass();
            ske.aE(ske.aD(uiuVar, obj, uhbVar)).fW(ufg.a);
            return;
        }
        if (i2 != 3) {
            return;
        }
        try {
            uhf uhfVarQ = uhbVar.q();
            Object objB = uwe.b(uhfVarQ, null);
            try {
                if (uiuVar instanceof uhn) {
                    ukc.e(uiuVar, 2);
                    objA = uiuVar.a(obj, uhbVar);
                } else {
                    objA = ske.aC(uiuVar, obj, uhbVar);
                }
                if (objA != uhi.a) {
                    uhbVar.fW(objA);
                }
            } finally {
                uwe.c(uhfVarQ, objB);
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof unn) {
                th = ((unn) th).a;
            }
            uhbVar.fW(rnt.aM(th));
        }
    }

    public static boolean h(int i) {
        return i == 2;
    }

    public static final Object i(uiu uiuVar, uhb uhbVar) throws Throwable {
        uvz uvzVar = new uvz(uhbVar.q(), uhbVar);
        Object objV = ukc.V(uvzVar, uvzVar, uiuVar);
        if (objV == uhi.a) {
            uhbVar.getClass();
        }
        return objV;
    }

    public static final und j(uhf uhfVar) {
        if (uhfVar.get(uol.c) == null) {
            uhfVar = uhfVar.plus(new uon(null));
        }
        return new uvc(uhfVar);
    }

    public static final void k(und undVar, CancellationException cancellationException) {
        uol uolVar = (uol) ((uvc) undVar).a.get(uol.c);
        if (uolVar != null) {
            uolVar.s(cancellationException);
        } else {
            Objects.toString(undVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(undVar)));
        }
    }

    public static final boolean l(und undVar) {
        uol uolVar = (uol) undVar.c().get(uol.c);
        if (uolVar != null) {
            return uolVar.t();
        }
        return true;
    }

    public static final Object n(Object obj, uhb uhbVar) {
        if (!(obj instanceof umt)) {
            return obj;
        }
        Throwable thA = ((umt) obj).b;
        if (unf.b && (uhbVar instanceof uhq)) {
            thA = uwb.a(thA, (uhq) uhbVar);
        }
        return rnt.aM(thA);
    }

    public static final Object o(Object obj) {
        Throwable thA = uex.a(obj);
        return thA == null ? obj : new umt(thA);
    }

    public static final void p(umr umrVar, Object obj) {
        Throwable thA = uex.a(obj);
        if (thA == null) {
            umrVar.O(obj);
        } else {
            umrVar.f(thA);
        }
    }

    public static final void r(umk umkVar, unt untVar) {
        ((uml) umkVar).y(new umi(untVar, 2));
    }

    public static final Object s(uhf uhfVar, uiu uiuVar, uhb uhbVar) throws Throwable {
        Object objB;
        uhf uhfVarQ = uhbVar.q();
        uhf uhfVarA = umy.a(uhfVarQ, uhfVar);
        ujp.T(uhfVarA);
        if (uhfVarA == uhfVarQ) {
            uvz uvzVar = new uvz(uhfVarA, uhbVar);
            objB = ukc.V(uvzVar, uvzVar, uiuVar);
        } else {
            azn aznVar = uhc.k;
            if (a.ao(uhfVarA.get(aznVar), uhfVarQ.get(aznVar))) {
                upp uppVar = new upp(uhfVarA, uhbVar);
                uhf uhfVar2 = ((umd) uppVar).a;
                Object objB2 = uwe.b(uhfVar2, null);
                try {
                    Object objV = ukc.V(uppVar, uppVar, uiuVar);
                    uwe.c(uhfVar2, objB2);
                    objB = objV;
                } catch (Throwable th) {
                    uwe.c(uhfVar2, objB2);
                    throw th;
                }
            } else {
                uno unoVar = new uno(uhfVarA, uhbVar);
                ukc.Y(uiuVar, unoVar, unoVar);
                ulz ulzVar = unoVar.b;
                while (true) {
                    int i = ulzVar.b;
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objB = uow.b(unoVar.C());
                        if (objB instanceof umt) {
                            throw ((umt) objB).b;
                        }
                    } else if (ulzVar.c(0, 1)) {
                        objB = uhi.a;
                        break;
                    }
                }
            }
        }
        if (objB == uhi.a) {
            uhbVar.getClass();
        }
        return objB;
    }

    public static final uol t(und undVar, uhf uhfVar, int i, uiu uiuVar) throws Throwable {
        boolean zH = h(i);
        uhf uhfVarB = umy.b(undVar, uhfVar);
        umd uoyVar = zH ? new uoy(uhfVarB, uiuVar) : new upg(uhfVarB, true);
        g(i, uiuVar, uoyVar, uoyVar);
        return uoyVar;
    }

    public static final Object v(syu syuVar, uhb uhbVar) throws Throwable {
        try {
            if (syuVar.isDone()) {
                return a.H(syuVar);
            }
            uml umlVar = new uml(ske.aE(uhbVar), 1);
            umlVar.x();
            syuVar.c(new jhj(syuVar, (umk) umlVar, 5), sxo.a);
            umlVar.d(new gvz(syuVar, 4));
            return umlVar.i();
        } catch (ExecutionException e) {
            throw w(e);
        }
    }

    public static final Throwable w(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static /* synthetic */ urk x(uuj uujVar, uhf uhfVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            uhfVar = uhg.a;
        }
        int i3 = (i2 & 2) != 0 ? -3 : 0;
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return uujVar.gb(uhfVar, i3, i);
    }

    public static final void y(utq utqVar, Object obj) {
        if (utqVar.a != obj) {
            throw utqVar;
        }
    }

    public static final Object z(url urlVar, urk[] urkVarArr, uif uifVar, uiv uivVar, uhb uhbVar) throws Throwable {
        uug uugVar = new uug(urkVarArr, uifVar, uivVar, urlVar, null);
        uui uuiVar = new uui(uhbVar.q(), uhbVar);
        Object objV = ukc.V(uuiVar, uuiVar, uugVar);
        return objV == uhi.a ? objV : ufg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F(defpackage.urk r5, defpackage.uhb r6) {
        /*
            boolean r0 = r6 instanceof defpackage.usj
            if (r0 == 0) goto L13
            r0 = r6
            usj r0 = (defpackage.usj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            usj r0 = new usj
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2d
            iqb r5 = r0.d
            uka r1 = r0.c
            defpackage.rnt.aN(r6)     // Catch: defpackage.utq -> L2b
            goto L61
        L2b:
            r6 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = 0
            java.lang.String r6 = com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU.JJcqr
            r5.<init>(r6)
            throw r5
        L36:
            defpackage.rnt.aN(r6)
            uka r6 = new uka
            r6.<init>()
            iqb r2 = new iqb
            r4 = 5
            r2.<init>(r6, r4)
            r0.c = r6     // Catch: defpackage.utq -> L53
            r0.d = r2     // Catch: defpackage.utq -> L53
            r0.b = r3     // Catch: defpackage.utq -> L53
            java.lang.Object r5 = r5.gc(r2, r0)     // Catch: defpackage.utq -> L53
            if (r5 == r1) goto L52
            r1 = r6
            goto L61
        L52:
            return r1
        L53:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L57:
            y(r6, r5)
            uhf r5 = r0.q()
            defpackage.ujp.T(r5)
        L61:
            java.lang.Object r5 = r1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ung.F(urk, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object G(defpackage.url r4, java.lang.Object r5, java.lang.Object r6, defpackage.uhb r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ury
            if (r0 == 0) goto L13
            r0 = r7
            ury r0 = (defpackage.ury) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ury r0 = new ury
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2c
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 0
            java.lang.String r5 = com.google.android.apps.camera.focusindicator.CIAk.YyLACfm.JDgMDSexnT
            r4.<init>(r5)
            throw r4
        L2c:
            java.lang.Object r6 = r0.a
            defpackage.rnt.aN(r7)
            goto L40
        L32:
            defpackage.rnt.aN(r7)
            r0.a = r6
            r0.c = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L40
            return r1
        L40:
            utq r4 = new utq
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ung.G(url, java.lang.Object, java.lang.Object, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.uhb r4) {
        /*
            boolean r0 = r4 instanceof defpackage.unl
            if (r0 == 0) goto L13
            r0 = r4
            unl r0 = (defpackage.unl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            unl r0 = new unl
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2c
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r0 = 0
            java.lang.String r0 = com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU.bpkEOs
            r4.<init>(r0)
            throw r4
        L2c:
            defpackage.rnt.aN(r4)
            goto L48
        L30:
            defpackage.rnt.aN(r4)
            r0.b = r3
            uml r4 = new uml
            uhb r0 = defpackage.ske.aE(r0)
            r4.<init>(r0, r3)
            r4.x()
            java.lang.Object r4 = r4.i()
            if (r4 != r1) goto L48
            return r1
        L48:
            uer r4 = new uer
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ung.d(uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r3 = defpackage.unf.a;
        r3 = r0.d;
        r1 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if ((r1 instanceof defpackage.ums) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r1 = ((defpackage.ums) r1).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r0.c.b = 536870911;
        r3.c(defpackage.ume.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        return new defpackage.uml(r3, 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.uml q(defpackage.uhb r3) {
        /*
            boolean r0 = r3 instanceof defpackage.uvg
            if (r0 != 0) goto Lb
            uml r0 = new uml
            r1 = 1
            r0.<init>(r3, r1)
            return r0
        Lb:
            r0 = r3
            uvg r0 = (defpackage.uvg) r0
            umb r0 = r0.f
        L10:
            java.lang.Object r1 = r0.a
            if (r1 != 0) goto L1b
            uwc r1 = defpackage.uvh.b
            r0.c(r1)
            r0 = 0
            goto L2a
        L1b:
            boolean r2 = r1 instanceof defpackage.uml
            if (r2 == 0) goto L4e
            uwc r2 = defpackage.uvh.b
            boolean r2 = r0.d(r1, r2)
            if (r2 == 0) goto L10
            r0 = r1
            uml r0 = (defpackage.uml) r0
        L2a:
            if (r0 == 0) goto L47
            boolean r3 = defpackage.unf.a
            umb r3 = r0.d
            java.lang.Object r1 = r3.a
            boolean r2 = r1 instanceof defpackage.ums
            if (r2 == 0) goto L3a
            ums r1 = (defpackage.ums) r1
            java.lang.Object r1 = r1.d
        L3a:
            ulz r1 = r0.c
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1.b = r2
            ume r1 = defpackage.ume.a
            r3.c(r1)
            return r0
        L47:
            uml r0 = new uml
            r1 = 2
            r0.<init>(r3, r1)
            return r0
        L4e:
            uwc r2 = defpackage.uvh.b
            if (r1 == r2) goto L10
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L57
            goto L10
        L57:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.util.Objects.toString(r1)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.String r1 = com.google.android.build.data.JKx.wzgaYJqO.QJkC
            java.lang.String r0 = r1.concat(r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ung.q(uhb):uml");
    }

    public static final void u(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.bv(i, GdpuLBytnYW.MXTOMFYYmMOGibu));
        }
    }
}
