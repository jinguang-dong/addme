package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uml extends unp implements umk, uhq, upr {
    public final uhb a;
    public final uhf b;
    public final ulz c;
    public final umb d;
    private final umb f;

    public uml(uhb uhbVar, int i) {
        super(i);
        this.a = uhbVar;
        boolean z = unf.a;
        this.b = uhbVar.q();
        umc umcVar = umc.a;
        this.c = new ulz(536870911, umcVar);
        this.d = new umb(ume.a, umcVar);
        this.f = new umb(null, umcVar);
    }

    private final unt G() {
        uol uolVar = (uol) this.b.get(uol.c);
        if (uolVar == null) {
            return null;
        }
        unt untVarQ = ujp.Q(uolVar, true, new umo(this));
        this.f.d(null, untVarQ);
        return untVarQ;
    }

    private final void H(int i) {
        ulz ulzVar;
        int i2;
        do {
            ulzVar = this.c;
            i2 = ulzVar.b;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = unf.a;
                uhb uhbVarP = p();
                boolean z2 = i == 4;
                if (z2 || !(uhbVarP instanceof uvg) || ujp.ac(i) != ujp.ac(this.e)) {
                    ujp.ab(this, uhbVarP, z2);
                    return;
                }
                uvg uvgVar = (uvg) uhbVarP;
                una unaVar = uvgVar.a;
                uhf uhfVarQ = uvgVar.q();
                if (uvh.c(unaVar, uhfVarQ)) {
                    uvh.b(unaVar, uhfVarQ, this);
                    return;
                }
                ThreadLocal threadLocal = upk.a;
                unw unwVarA = upk.a();
                if (unwVarA.p()) {
                    unwVarA.n(this);
                    return;
                }
                unwVarA.o(true);
                try {
                    ujp.ab(this, p(), true);
                    do {
                    } while (unwVarA.r());
                    return;
                } catch (Throwable th) {
                    try {
                        F(th);
                        return;
                    } finally {
                        unwVarA.m(true);
                    }
                }
            }
        } while (!ulzVar.c(i2, (536870911 & i2) + 1073741824));
    }

    private static final void I(Object obj, Object obj2) {
        throw new IllegalStateException(a.bC(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private static final Object J(upd updVar, Object obj, int i, uiv uivVar) {
        uiv uivVar2;
        if (obj instanceof umt) {
            boolean z = unf.a;
            return obj;
        }
        if (ujp.ac(i)) {
            if (uivVar != null) {
                uivVar2 = uivVar;
            } else if (updVar instanceof umj) {
                uivVar2 = null;
            }
            return new ums(obj, updVar instanceof umj ? (umj) updVar : null, uivVar2, null, 16);
        }
        return obj;
    }

    public final void A(Object obj, int i, uiv uivVar) {
        umb umbVar;
        Object obj2;
        do {
            umbVar = this.d;
            obj2 = umbVar.a;
            if (!(obj2 instanceof upd)) {
                if (obj2 instanceof umn) {
                    umn umnVar = (umn) obj2;
                    if (umnVar.a.b()) {
                        if (uivVar != null) {
                            u(uivVar, umnVar.b, obj);
                            return;
                        }
                        return;
                    }
                }
                Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!umbVar.d(obj2, J((upd) obj2, obj, i, uivVar)));
        w();
        H(i);
    }

    public final boolean B() {
        return this.e == 2 && ((uvg) this.a).f.a != null;
    }

    @Override // defpackage.upr
    public final void C(uvb uvbVar, int i) {
        ulz ulzVar;
        int i2;
        do {
            ulzVar = this.c;
            i2 = ulzVar.b;
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!ulzVar.c(i2, ((i2 >> 29) << 29) + i));
        y(uvbVar);
    }

    @Override // defpackage.unp
    public final void D(Throwable th) {
        while (true) {
            umb umbVar = this.d;
            Object obj = umbVar.a;
            if (obj instanceof upd) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof umt) {
                return;
            }
            if (obj instanceof ums) {
                ums umsVar = (ums) obj;
                if (umsVar.a()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (umbVar.d(obj, ums.b(umsVar, null, th, 15))) {
                    umj umjVar = umsVar.b;
                    if (umjVar != null) {
                        t(umjVar, th);
                    }
                    uiv uivVar = umsVar.c;
                    if (uivVar != null) {
                        u(uivVar, th, umsVar.a);
                        return;
                    }
                    return;
                }
            } else {
                Throwable th2 = th;
                if (umbVar.d(obj, new ums(obj, null, null, th2, 14))) {
                    return;
                } else {
                    th = th2;
                }
            }
        }
    }

    @Override // defpackage.umk
    public final void c(Object obj) {
        boolean z = unf.a;
        H(this.e);
    }

    @Override // defpackage.uhq
    public final uhq cK() {
        uhb uhbVar = this.a;
        if (uhbVar instanceof uhq) {
            return (uhq) uhbVar;
        }
        return null;
    }

    @Override // defpackage.uhq
    public final void cL() {
    }

    @Override // defpackage.umk
    public final void d(uiq uiqVar) {
        y(new umi(uiqVar, 0));
    }

    @Override // defpackage.umk
    public final void e(Object obj, uiv uivVar) {
        A(obj, this.e, uivVar);
    }

    @Override // defpackage.umk
    public final void f(una unaVar, Object obj) {
        uhb uhbVar = this.a;
        uvg uvgVar = uhbVar instanceof uvg ? (uvg) uhbVar : null;
        A(obj, (uvgVar != null ? uvgVar.a : null) == unaVar ? 4 : this.e, null);
    }

    @Override // defpackage.uhb
    public final void fW(Object obj) {
        Throwable thA = uex.a(obj);
        if (thA != null) {
            if (unf.b) {
                thA = uwb.a(thA, this);
            }
            obj = new umt(thA);
        }
        A(obj, this.e, null);
    }

    @Override // defpackage.umk
    public final boolean g(Throwable th) {
        umb umbVar;
        Object obj;
        do {
            umbVar = this.d;
            obj = umbVar.a;
            if (!(obj instanceof upd)) {
                return false;
            }
        } while (!umbVar.d(obj, new umn(this, th, (obj instanceof umj) || (obj instanceof uvb))));
        upd updVar = (upd) obj;
        if (updVar instanceof umj) {
            t((umj) obj, th);
        } else if (updVar instanceof uvb) {
            K((uvb) obj);
        }
        w();
        H(this.e);
        return true;
    }

    @Override // defpackage.umk
    public final Object h(Object obj, uiv uivVar) {
        umb umbVar;
        Object obj2;
        do {
            umbVar = this.d;
            obj2 = umbVar.a;
            if (!(obj2 instanceof upd)) {
                boolean z = obj2 instanceof ums;
                return null;
            }
        } while (!umbVar.d(obj2, J((upd) obj2, obj, this.e, uivVar)));
        w();
        return umm.a;
    }

    public final Object i() {
        ulz ulzVar;
        int i;
        uol uolVar;
        boolean zB = B();
        do {
            ulzVar = this.c;
            i = ulzVar.b;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zB) {
                    z();
                }
                Object objJ = j();
                if (objJ instanceof umt) {
                    Throwable th = ((umt) objJ).b;
                    if (unf.b) {
                        throw uwb.a(th, this);
                    }
                    throw th;
                }
                if (!ujp.ac(this.e) || (uolVar = (uol) this.b.get(uol.c)) == null || uolVar.t()) {
                    return k(objJ);
                }
                CancellationException cancellationExceptionN = uolVar.n();
                D(cancellationExceptionN);
                if (unf.b) {
                    throw uwb.a(cancellationExceptionN, this);
                }
                throw cancellationExceptionN;
            }
        } while (!ulzVar.c(i, (536870911 & i) + 536870912));
        if (s() == null) {
            G();
        }
        if (zB) {
            z();
        }
        return uhi.a;
    }

    public final Object j() {
        return this.d.a;
    }

    @Override // defpackage.unp
    public final Object k(Object obj) {
        return obj instanceof ums ? ((ums) obj).a : obj;
    }

    @Override // defpackage.unp
    public final Object l() {
        return j();
    }

    protected String m() {
        return "CancellableContinuation";
    }

    public Throwable n(uol uolVar) {
        return uolVar.n();
    }

    @Override // defpackage.unp
    public final Throwable o(Object obj) {
        Throwable thO = super.o(obj);
        if (thO == null) {
            return null;
        }
        uhb uhbVar = this.a;
        return (unf.b && (uhbVar instanceof uhq)) ? uwb.a(thO, (uhq) uhbVar) : thO;
    }

    @Override // defpackage.unp
    public final uhb p() {
        return this.a;
    }

    @Override // defpackage.uhb
    public final uhf q() {
        return this.b;
    }

    public final unt s() {
        return (unt) this.f.a;
    }

    public final void t(umj umjVar, Throwable th) {
        try {
            umjVar.a(th);
        } catch (Throwable th2) {
            uhf uhfVar = this.b;
            toString();
            ujo.d(uhfVar, new umu("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    public final String toString() {
        String strC = ung.c(this.a);
        Object objJ = j();
        String str = objJ instanceof upd ? "Active" : objJ instanceof umn ? "Cancelled" : "Completed";
        return m() + "(" + strC + "){" + str + "}@" + ung.b(this);
    }

    public final void u(uiv uivVar, Throwable th, Object obj) {
        try {
            uivVar.a(th, obj, this.b);
        } catch (Throwable th2) {
            uhf uhfVar = this.b;
            toString();
            ujo.d(uhfVar, new umu("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void v() {
        unt untVarS = s();
        if (untVarS == null) {
            return;
        }
        untVarS.fL();
        this.f.c(upc.a);
    }

    public final void w() {
        if (B()) {
            return;
        }
        v();
    }

    public final void x() {
        unt untVarG = G();
        if (untVarG == null || (j() instanceof upd)) {
            return;
        }
        untVarG.fL();
        this.f.c(upc.a);
    }

    public final void y(Object obj) {
        boolean z = unf.a;
        while (true) {
            umb umbVar = this.d;
            Object obj2 = umbVar.a;
            if (obj2 instanceof ume) {
                if (umbVar.d(obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof umj) || (obj2 instanceof uvb)) {
                I(obj, obj2);
            } else {
                if (obj2 instanceof umt) {
                    umt umtVar = (umt) obj2;
                    if (!umtVar.a()) {
                        I(obj, obj2);
                    }
                    if (obj2 instanceof umn) {
                        Throwable th = umtVar != null ? umtVar.b : null;
                        if (obj instanceof umj) {
                            t((umj) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            K((uvb) obj);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof ums) {
                    ums umsVar = (ums) obj2;
                    if (umsVar.b != null) {
                        I(obj, obj2);
                    }
                    if (obj instanceof uvb) {
                        return;
                    }
                    obj.getClass();
                    umj umjVar = (umj) obj;
                    if (umsVar.a()) {
                        t(umjVar, umsVar.e);
                        return;
                    } else if (umbVar.d(obj2, ums.b(umsVar, umjVar, null, 29))) {
                        return;
                    }
                } else {
                    if (obj instanceof uvb) {
                        return;
                    }
                    obj.getClass();
                    if (umbVar.d(obj2, new ums(obj2, (umj) obj, null, null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    private final void K(uvb uvbVar) {
        int i = this.c.b & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException(UvOvSgfD.dZuXTEW);
        }
        try {
            uvbVar.l(i, this.b);
        } catch (Throwable th) {
            uhf uhfVar = this.b;
            toString();
            ujo.d(uhfVar, new umu("Exception in invokeOnCancellation handler for ".concat(toString()), th));
        }
    }

    public final void z() {
        uhb uhbVar = this.a;
        Throwable th = null;
        uvg uvgVar = uhbVar instanceof uvg ? (uvg) uhbVar : null;
        if (uvgVar != null) {
            while (true) {
                umb umbVar = uvgVar.f;
                Object obj = umbVar.a;
                uwc uwcVar = uvh.b;
                if (obj == uwcVar) {
                    if (umbVar.d(uwcVar, this)) {
                        break;
                    }
                } else {
                    if (!(obj instanceof Throwable)) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
                    }
                    if (!umbVar.d(obj, null)) {
                        throw new IllegalArgumentException(MyBPCgKwEjJI.nJnHLgVeyvtOR);
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            v();
            g(th);
        }
    }
}
