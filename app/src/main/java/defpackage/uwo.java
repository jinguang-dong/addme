package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uwo extends uod {
    private final String a;
    private final uwl b;

    public uwo(int i, int i2, long j, String str) {
        this.a = str;
        this.b = new uwl(i, i2, j, str);
    }

    @Override // defpackage.una
    public final void a(uhf uhfVar, Runnable runnable) {
        uwl.e(this.b, runnable, false, 6);
    }

    public void close() {
        this.b.close();
    }

    public final void e(Runnable runnable, boolean z) {
        this.b.a(runnable, true, z);
    }

    @Override // defpackage.una
    public final void f(uhf uhfVar, Runnable runnable) {
        uwl.e(this.b, runnable, true, 2);
    }
}
