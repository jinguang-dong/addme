package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class upo extends una {
    public static final /* synthetic */ int a = 0;

    static {
        new upo();
    }

    private upo() {
    }

    @Override // defpackage.una
    public final void a(uhf uhfVar, Runnable runnable) {
        ups upsVar = (ups) uhfVar.get(ups.b);
        if (upsVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        upsVar.a = true;
    }

    @Override // defpackage.una
    public final boolean dw(uhf uhfVar) {
        return false;
    }

    @Override // defpackage.una
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
