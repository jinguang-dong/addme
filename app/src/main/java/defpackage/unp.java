package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class unp extends uwp {
    public int e;

    public unp(int i) {
        super(0L, false);
        this.e = i;
    }

    public final void F(Throwable th) {
        ujo.d(p().q(), new une(a.bz(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract Object l();

    public Throwable o(Object obj) {
        umt umtVar = obj instanceof umt ? (umt) obj : null;
        if (umtVar != null) {
            return umtVar.b;
        }
        return null;
    }

    public abstract uhb p();

    /* JADX WARN: Type inference failed for: r1v0, types: [uhb, uhq] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = unf.a;
        try {
            uvg uvgVar = (uvg) p();
            ?? r1 = uvgVar.b;
            Object obj = uvgVar.d;
            uhf uhfVarQ = r1.q();
            Object objB = uwe.b(uhfVarQ, obj);
            uol uolVar = null;
            upp uppVarC = objB != uwe.a ? umy.c(r1, uhfVarQ, objB) : null;
            try {
                uhf uhfVarQ2 = r1.q();
                Object objL = l();
                Throwable thO = o(objL);
                if (thO == null && ujp.ac(this.e)) {
                    uolVar = (uol) uhfVarQ2.get(uol.c);
                }
                if (uolVar != null && !uolVar.t()) {
                    Throwable thN = uolVar.n();
                    D(thN);
                    if (unf.b) {
                        thN = uwb.a(thN, r1);
                    }
                    r1.fW(rnt.aM(thN));
                } else if (thO != null) {
                    r1.fW(rnt.aM(thO));
                } else {
                    r1.fW(k(objL));
                }
                if (uppVarC != null && !uppVarC.V()) {
                    return;
                }
                uwe.c(uhfVarQ, objB);
            } catch (Throwable th) {
                if (uppVarC == null || uppVarC.V()) {
                    uwe.c(uhfVarQ, objB);
                }
                throw th;
            }
        } catch (unn e) {
            ujo.d(p().q(), e.a);
        } catch (Throwable th2) {
            F(th2);
        }
    }

    public void D(Throwable th) {
    }

    public Object k(Object obj) {
        return obj;
    }
}
