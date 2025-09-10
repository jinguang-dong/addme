package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uws extends una {
    public static final uws a = new uws();

    private uws() {
    }

    @Override // defpackage.una
    public final void a(uhf uhfVar, Runnable runnable) {
        uwn.a.e(runnable, false);
    }

    @Override // defpackage.una
    public final void f(uhf uhfVar, Runnable runnable) {
        uwn.a.e(runnable, true);
    }

    @Override // defpackage.una
    public final una g(int i) {
        ung.u(i);
        return i >= uwr.d ? this : super.g(i);
    }

    @Override // defpackage.una
    public final String toString() {
        return "Dispatchers.IO";
    }
}
