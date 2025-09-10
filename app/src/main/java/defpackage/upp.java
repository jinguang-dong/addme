package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class upp extends uvz {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public upp(uhf uhfVar, uhb uhbVar) {
        upq upqVar = upq.a;
        super(uhfVar.get(upqVar) == null ? uhfVar.plus(upqVar) : uhfVar, uhbVar);
        this.b = new ThreadLocal();
        if (uhbVar.q().get(uhc.k) instanceof una) {
            return;
        }
        Object objB = uwe.b(uhfVar, null);
        uwe.c(uhfVar, objB);
        U(uhfVar, objB);
    }

    private final void W() {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.b;
            uev uevVar = (uev) threadLocal.get();
            if (uevVar != null) {
                uwe.c((uhf) uevVar.a, uevVar.b);
            }
            threadLocal.remove();
        }
    }

    @Override // defpackage.uvz
    public final void T() {
        W();
    }

    public final void U(uhf uhfVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new uev(uhfVar, obj));
    }

    public final boolean V() {
        boolean z = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !z;
    }

    @Override // defpackage.uvz, defpackage.umd
    protected final void f(Object obj) {
        W();
        uhb uhbVar = this.e;
        Object objN = ung.n(obj, uhbVar);
        uhf uhfVarQ = uhbVar.q();
        Object objB = uwe.b(uhfVarQ, null);
        upp uppVarC = objB != uwe.a ? umy.c(uhbVar, uhfVarQ, objB) : null;
        try {
            uhbVar.fW(objN);
            if (uppVarC == null || uppVarC.V()) {
                uwe.c(uhfVarQ, objB);
            }
        } catch (Throwable th) {
            if (uppVarC == null || uppVarC.V()) {
                uwe.c(uhfVarQ, objB);
            }
            throw th;
        }
    }
}
