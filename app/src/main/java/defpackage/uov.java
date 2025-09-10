package defpackage;

import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
@ueo
/* loaded from: classes.dex */
public class uov implements uol {
    private final umb a;
    public final umb d;

    public uov(boolean z) {
        unv unvVar = z ? uow.g : uow.f;
        umc umcVar = umc.a;
        this.d = new umb(unvVar, umcVar);
        this.a = new umb(null, umcVar);
    }

    public static final umq R(uvt uvtVar) {
        while (uvtVar.fN()) {
            uvtVar = uvtVar.i();
        }
        while (true) {
            uvtVar = uvtVar.h();
            if (!uvtVar.fN()) {
                if (uvtVar instanceof umq) {
                    return (umq) uvtVar;
                }
                if (uvtVar instanceof upa) {
                    return null;
                }
            }
        }
    }

    public static /* synthetic */ CancellationException S(uov uovVar, Throwable th) {
        return uovVar.E(th, null);
    }

    private final void T(uoo uooVar) {
        upa upaVar = new upa();
        upaVar.d.b(uooVar);
        upaVar.c.b(uooVar);
        while (true) {
            if (uooVar.f() != uooVar) {
                break;
            } else if (uooVar.c.d(uooVar, upaVar)) {
                upaVar.k(uooVar);
                break;
            }
        }
        this.d.d(uooVar, uooVar.h());
    }

    private final boolean U(Throwable th) {
        if (b()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ump umpVarF = F();
        return (umpVarF == null || umpVarF == upc.a) ? z : umpVarF.d(th) || z;
    }

    private final Object h(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof uoh)) {
            return uow.a;
        }
        if (((obj instanceof unv) || (obj instanceof uoo)) && !(obj instanceof umq) && !(obj2 instanceof umt)) {
            uoh uohVar = (uoh) obj;
            boolean z = unf.a;
            if (!this.d.d(uohVar, uow.a(obj2))) {
                return uow.c;
            }
            fV(obj2);
            l(uohVar, obj2);
            return obj2;
        }
        uoh uohVar2 = (uoh) obj;
        upa upaVarK = k(uohVar2);
        if (upaVarK == null) {
            return uow.c;
        }
        Throwable th = null;
        uor uorVar = uohVar2 instanceof uor ? (uor) uohVar2 : null;
        if (uorVar == null) {
            uorVar = new uor(upaVarK, null);
        }
        uka ukaVar = new uka();
        synchronized (uorVar) {
            if (uorVar.h()) {
                return uow.a;
            }
            uorVar.b.a = 1;
            if (uorVar != uohVar2 && !this.d.d(uohVar2, uorVar)) {
                return uow.c;
            }
            boolean z2 = unf.a;
            boolean zG = uorVar.g();
            umt umtVar = obj2 instanceof umt ? (umt) obj2 : null;
            if (umtVar != null) {
                uorVar.e(umtVar.b);
            }
            Throwable thD = uorVar.d();
            boolean z3 = !zG;
            Boolean.valueOf(z3).getClass();
            if (true == z3) {
                th = thD;
            }
            ukaVar.a = th;
            Throwable th2 = (Throwable) ukaVar.a;
            if (th2 != null) {
                q(upaVarK, th2);
            }
            umq umqVarR = R(upaVarK);
            if (umqVarR != null && P(uorVar, umqVarR, obj2)) {
                return uow.b;
            }
            upaVarK.j(2);
            umq umqVarR2 = R(upaVarK);
            return (umqVarR2 == null || !P(uorVar, umqVarR2, obj2)) ? fX(uorVar, obj2) : uow.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    private final Throwable i(Object obj) {
        CancellationException cancellationExceptionD;
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th != null ? th : new uom(fR(), null, this);
        }
        uov uovVar = (uov) obj;
        Object objC = uovVar.C();
        if (objC instanceof uor) {
            cancellationExceptionD = ((uor) objC).d();
        } else if (objC instanceof umt) {
            cancellationExceptionD = ((umt) objC).b;
        } else {
            if (objC instanceof uoh) {
                Objects.toString(objC);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(objC)));
            }
            cancellationExceptionD = null;
        }
        CancellationException cancellationException = cancellationExceptionD instanceof CancellationException ? cancellationExceptionD : null;
        return cancellationException == null ? new uom("Parent job is ".concat(V(objC)), cancellationExceptionD, uovVar) : cancellationException;
    }

    private final upa k(uoh uohVar) {
        upa upaVarFK = uohVar.fK();
        if (upaVarFK != null) {
            return upaVarFK;
        }
        if (uohVar instanceof unv) {
            return new upa();
        }
        if (uohVar instanceof uoo) {
            T((uoo) uohVar);
            return null;
        }
        Objects.toString(uohVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(uohVar)));
    }

    private final void l(uoh uohVar, Object obj) throws Throwable {
        ump umpVarF = F();
        if (umpVarF != null) {
            umpVarF.fL();
            K(upc.a);
        }
        umu umuVar = null;
        umt umtVar = obj instanceof umt ? (umt) obj : null;
        Throwable th = umtVar != null ? umtVar.b : null;
        if (uohVar instanceof uoo) {
            try {
                ((uoo) uohVar).a(th);
                return;
            } catch (Throwable th2) {
                g(new umu(a.bC(this, uohVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        upa upaVarFK = uohVar.fK();
        if (upaVarFK != null) {
            upaVarFK.j(1);
            Object objF = upaVarFK.f();
            objF.getClass();
            for (uvt uvtVarH = (uvt) objF; !a.ao(uvtVarH, upaVarFK); uvtVarH = uvtVarH.h()) {
                if (uvtVarH instanceof uoo) {
                    try {
                        ((uoo) uvtVarH).a(th);
                    } catch (Throwable th3) {
                        if (umuVar != null) {
                            ujk.f(umuVar, th3);
                        } else {
                            umuVar = new umu(a.bC(this, uvtVarH, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (umuVar != null) {
                g(umuVar);
            }
        }
    }

    private final void q(upa upaVar, Throwable th) throws Throwable {
        upaVar.j(4);
        Object objF = upaVar.f();
        objF.getClass();
        umu umuVar = null;
        for (uvt uvtVarH = (uvt) objF; !a.ao(uvtVarH, upaVar); uvtVarH = uvtVarH.h()) {
            if (uvtVarH instanceof uoo) {
                uoo uooVar = (uoo) uvtVarH;
                if (uooVar.b()) {
                    try {
                        uooVar.a(th);
                    } catch (Throwable th2) {
                        if (umuVar != null) {
                            ujk.f(umuVar, th2);
                        } else {
                            umuVar = new umu(a.bC(this, uvtVarH, "Exception in completion handler ", " for "), th2);
                        }
                    }
                }
            }
        }
        if (umuVar != null) {
            g(umuVar);
        }
        U(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [uog] */
    private final void r(unv unvVar) {
        upa upaVar = new upa();
        if (!unvVar.a) {
            upaVar = new uog(upaVar);
        }
        this.d.d(unvVar, upaVar);
    }

    public final Object C() {
        return this.d.a;
    }

    public final Object D(Object obj) {
        Object objH;
        do {
            objH = h(C(), obj);
            if (objH == uow.a) {
                String strBC = a.bC(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                umt umtVar = obj instanceof umt ? (umt) obj : null;
                throw new IllegalStateException(strBC, umtVar != null ? umtVar.b : null);
            }
        } while (objH == uow.c);
        return objH;
    }

    protected final CancellationException E(Throwable th, String str) {
        CancellationException uomVar = th instanceof CancellationException ? (CancellationException) th : null;
        if (uomVar == null) {
            if (str == null) {
                str = fR();
            }
            uomVar = new uom(str, th, this);
        }
        return uomVar;
    }

    public final ump F() {
        return (ump) this.a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
    
        return defpackage.upc.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.unt G(boolean r5, defpackage.uoo r6) {
        /*
            r4 = this;
            r6.b = r4
        L2:
            java.lang.Object r0 = r4.C()
            boolean r1 = r0 instanceof defpackage.unv
            if (r1 == 0) goto L1e
            r1 = r0
            unv r1 = (defpackage.unv) r1
            boolean r2 = r1.a
            if (r2 == 0) goto L1a
            umb r1 = r4.d
            boolean r0 = r1.d(r0, r6)
            if (r0 == 0) goto L2
            goto L5e
        L1a:
            r4.r(r1)
            goto L2
        L1e:
            boolean r1 = r0 instanceof defpackage.uoh
            r2 = 0
            if (r1 == 0) goto L5f
            r1 = r0
            uoh r1 = (defpackage.uoh) r1
            upa r3 = r1.fK()
            if (r3 != 0) goto L35
            r0.getClass()
            uoo r0 = (defpackage.uoo) r0
            r4.T(r0)
            goto L2
        L35:
            boolean r0 = r6.b()
            if (r0 == 0) goto L57
            boolean r0 = r1 instanceof defpackage.uor
            if (r0 == 0) goto L42
            uor r1 = (defpackage.uor) r1
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 == 0) goto L49
            java.lang.Throwable r2 = r1.d()
        L49:
            if (r2 != 0) goto L51
            r0 = 5
            boolean r0 = r3.l(r6, r0)
            goto L5c
        L51:
            if (r5 == 0) goto L74
            r6.a(r2)
            goto L74
        L57:
            r0 = 1
            boolean r0 = r3.l(r6, r0)
        L5c:
            if (r0 == 0) goto L2
        L5e:
            return r6
        L5f:
            if (r5 == 0) goto L74
            java.lang.Object r4 = r4.C()
            boolean r5 = r4 instanceof defpackage.umt
            if (r5 == 0) goto L6c
            umt r4 = (defpackage.umt) r4
            goto L6d
        L6c:
            r4 = r2
        L6d:
            if (r4 == 0) goto L71
            java.lang.Throwable r2 = r4.b
        L71:
            r6.a(r2)
        L74:
            upc r4 = defpackage.upc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uov.G(boolean, uoo):unt");
    }

    public void H(Throwable th) throws Throwable {
        L(th);
    }

    protected final void I(uol uolVar) {
        boolean z = unf.a;
        if (uolVar == null) {
            K(upc.a);
            return;
        }
        uolVar.w();
        ump umpVarGa = uolVar.ga(this);
        K(umpVarGa);
        if (v()) {
            umpVarGa.fL();
            K(upc.a);
        }
    }

    protected void J() {
    }

    public final void K(ump umpVar) {
        this.a.c(umpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uov.L(java.lang.Object):boolean");
    }

    public boolean M(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return L(th) && fH();
    }

    protected boolean N(Throwable th) {
        return false;
    }

    public final boolean O(Object obj) {
        while (true) {
            Object objH = h(C(), obj);
            if (objH == uow.a) {
                return false;
            }
            if (objH == uow.b) {
                break;
            }
            if (objH != uow.c) {
                a(objH);
                break;
            }
        }
        return true;
    }

    public final boolean P(uor uorVar, umq umqVar, Object obj) {
        while (ujp.Q(umqVar.a, false, new uoq(this, uorVar, umqVar, obj)) == upc.a) {
            umqVar = R(umqVar);
            if (umqVar == null) {
                return false;
            }
        }
        return true;
    }

    protected final uwt Q() {
        uot uotVar = uot.a;
        ukc.e(uotVar, 3);
        uou uouVar = uou.a;
        ukc.e(uouVar, 3);
        return new uwt(this, uotVar, uouVar, (uiv) null);
    }

    protected void a(Object obj) {
    }

    protected boolean b() {
        return false;
    }

    public boolean fH() {
        return true;
    }

    public boolean fI() {
        return false;
    }

    protected String fR() {
        return "Job was cancelled";
    }

    public String fS() {
        return ung.a(this);
    }

    protected void fV(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object fX(uor uorVar, Object obj) throws Throwable {
        ArrayList<Throwable> arrayList;
        Object next;
        Throwable uomVar;
        boolean z = unf.a;
        Throwable th = null;
        umt umtVar = obj instanceof umt ? (umt) obj : null;
        Throwable th2 = umtVar != null ? umtVar.b : null;
        synchronized (uorVar) {
            uorVar.g();
            Object objC = uorVar.c();
            if (objC == null) {
                arrayList = new ArrayList(4);
            } else if (objC instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(objC);
                arrayList = arrayList2;
            } else {
                if (!(objC instanceof ArrayList)) {
                    Objects.toString(objC);
                    throw new IllegalStateException("State is ".concat(objC.toString()));
                }
                arrayList = (ArrayList) objC;
            }
            Throwable thD = uorVar.d();
            if (thD != null) {
                arrayList.add(0, thD);
            }
            if (th2 != null && !a.ao(th2, thD)) {
                arrayList.add(th2);
            }
            uorVar.f(uow.e);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        break;
                    }
                }
                Throwable th3 = (Throwable) next;
                if (th3 == null) {
                    uomVar = (Throwable) arrayList.get(0);
                    if (uomVar instanceof upl) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            Throwable th4 = (Throwable) next2;
                            if (th4 != uomVar && (th4 instanceof upl)) {
                                th = next2;
                                break;
                            }
                        }
                        th = th;
                        if (th == null) {
                            th = uomVar;
                        }
                    } else {
                        th = uomVar;
                    }
                } else {
                    th = th3;
                }
            } else if (uorVar.g()) {
                uomVar = new uom(fR(), null, this);
                th = uomVar;
            }
            if (th != null && arrayList.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayList.size()));
                boolean z2 = unf.b;
                Throwable thC = !z2 ? th : uwb.c(th);
                for (Throwable thC2 : arrayList) {
                    if (z2) {
                        thC2 = uwb.c(thC2);
                    }
                    if (thC2 != th && thC2 != thC && !(thC2 instanceof CancellationException) && setNewSetFromMap.add(thC2)) {
                        ujk.f(th, thC2);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new umt(th);
        }
        if (th != null && (U(th) || N(th))) {
            obj.getClass();
            ((umt) obj).a();
        }
        fV(obj);
        this.d.d(uorVar, uow.a(obj));
        l(uorVar, obj);
        return obj;
    }

    public final Object fY() throws Throwable {
        Object objC = C();
        if (objC instanceof uoh) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objC instanceof umt) {
            throw ((umt) objC).b;
        }
        return uow.b(objC);
    }

    @Override // defpackage.uol
    public final boolean fZ() {
        Object objC = C();
        if (objC instanceof umt) {
            return true;
        }
        return (objC instanceof uor) && ((uor) objC).g();
    }

    @Override // defpackage.uhf
    public final Object fold(Object obj, uiu uiuVar) {
        return ske.aF(this, obj, uiuVar);
    }

    public void g(Throwable th) throws Throwable {
        throw th;
    }

    @Override // defpackage.uol
    public final ump ga(uov uovVar) {
        umq umqVar = new umq(uovVar);
        umqVar.b = this;
        while (true) {
            Object objC = C();
            if (objC instanceof unv) {
                unv unvVar = (unv) objC;
                if (!unvVar.a) {
                    r(unvVar);
                } else if (this.d.d(objC, umqVar)) {
                    break;
                }
            } else {
                if (!(objC instanceof uoh)) {
                    Object objC2 = C();
                    umt umtVar = objC2 instanceof umt ? (umt) objC2 : null;
                    umqVar.a(umtVar != null ? umtVar.b : null);
                    return upc.a;
                }
                upa upaVarFK = ((uoh) objC).fK();
                if (upaVarFK == null) {
                    objC.getClass();
                    T((uoo) objC);
                } else if (!upaVarFK.l(umqVar, 7)) {
                    boolean zL = upaVarFK.l(umqVar, 3);
                    Object objC3 = C();
                    if (objC3 instanceof uor) {
                        thD = ((uor) objC3).d();
                    } else {
                        boolean z = unf.a;
                        umt umtVar2 = objC3 instanceof umt ? (umt) objC3 : null;
                        if (umtVar2 != null) {
                            thD = umtVar2.b;
                        }
                    }
                    umqVar.a(thD);
                    if (!zL) {
                        return upc.a;
                    }
                    boolean z2 = unf.a;
                    return umqVar;
                }
            }
        }
        return umqVar;
    }

    @Override // defpackage.uhd, defpackage.uhf
    public final uhd get(uhe uheVar) {
        return ske.aG(this, uheVar);
    }

    @Override // defpackage.uhd
    public final uhe getKey() {
        return uol.c;
    }

    @Override // defpackage.uol
    public final Object m(uhb uhbVar) {
        Object objC;
        do {
            objC = C();
            if (!(objC instanceof uoh)) {
                ujp.T(uhbVar.q());
                return ufg.a;
            }
        } while (y(objC) < 0);
        uml umlVar = new uml(ske.aE(uhbVar), 1);
        umlVar.x();
        ung.r(umlVar, ujp.Q(this, true, new upf(umlVar)));
        Object objI = umlVar.i();
        uhi uhiVar = uhi.a;
        if (objI == uhiVar) {
            uhbVar.getClass();
        }
        if (objI != uhiVar) {
            objI = ufg.a;
        }
        return objI == uhiVar ? objI : ufg.a;
    }

    @Override // defpackage.uhf
    public final uhf minusKey(uhe uheVar) {
        return ske.aH(this, uheVar);
    }

    @Override // defpackage.uol
    public final CancellationException n() {
        Object objC = C();
        if (!(objC instanceof uor)) {
            if (!(objC instanceof uoh)) {
                return objC instanceof umt ? S(this, ((umt) objC).b) : new uom(String.valueOf(ung.a(this)).concat(" has completed normally"), null, this);
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        Throwable thD = ((uor) objC).d();
        if (thD != null) {
            return E(thD, String.valueOf(ung.a(this)).concat(" is cancelling"));
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.uol
    public final unt o(uiq uiqVar) {
        return G(true, new uok(uiqVar));
    }

    @Override // defpackage.uol
    public final unt p(boolean z, boolean z2, uiq uiqVar) {
        return G(z2, z ? new uoj(uiqVar) : new uok(uiqVar));
    }

    @Override // defpackage.uhf
    public final uhf plus(uhf uhfVar) {
        return ske.aI(this, uhfVar);
    }

    @Override // defpackage.uol
    public void s(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new uom(fR(), null, this);
        }
        H(cancellationException);
    }

    @Override // defpackage.uol
    public final boolean t() {
        Object objC = C();
        return (objC instanceof uoh) && ((uoh) objC).fM();
    }

    public final String toString() {
        return (fS() + "{" + V(C()) + "}") + "@" + ung.b(this);
    }

    @Override // defpackage.uol
    public final boolean v() {
        return !(C() instanceof uoh);
    }

    @Override // defpackage.uol
    public final boolean w() {
        int iY;
        do {
            iY = y(C());
            if (iY == 0) {
                return false;
            }
        } while (iY != 1);
        return true;
    }

    public final int y(Object obj) {
        if (obj instanceof unv) {
            if (((unv) obj).a) {
                return 0;
            }
            if (!this.d.d(obj, uow.g)) {
                return -1;
            }
            J();
            return 1;
        }
        if (!(obj instanceof uog)) {
            return 0;
        }
        if (!this.d.d(obj, ((uog) obj).a)) {
            return -1;
        }
        J();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(uhb uhbVar) throws Throwable {
        Object objC;
        do {
            objC = C();
            if (!(objC instanceof uoh)) {
                if (!(objC instanceof umt)) {
                    return uow.b(objC);
                }
                Throwable th = ((umt) objC).b;
                if (unf.b) {
                    throw uwb.a(th, uhbVar);
                }
                throw th;
            }
        } while (y(objC) < 0);
        uop uopVar = new uop(ske.aE(uhbVar), this);
        uopVar.x();
        ung.r(uopVar, ujp.Q(this, true, new upe(uopVar)));
        return uopVar.i();
    }

    private static final String V(Object obj) {
        boolean z = obj instanceof uor;
        String str = VnmwoBe.Qkwuyuda;
        if (!z) {
            return obj instanceof uoh ? ((uoh) obj).fM() ? str : "New" : obj instanceof umt ? "Cancelled" : "Completed";
        }
        uor uorVar = (uor) obj;
        return uorVar.g() ? "Cancelling" : uorVar.h() ? "Completing" : str;
    }
}
