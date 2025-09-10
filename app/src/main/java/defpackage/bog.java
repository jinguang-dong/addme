package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bog {
    private uiq a;

    public uiq a() {
        return this.a;
    }

    public abstract void b(bmv bmvVar);

    public void e(uiq uiqVar) {
        this.a = uiqVar;
    }

    public final void f() {
        uiq uiqVarA = a();
        if (uiqVarA != null) {
            uiqVarA.a(this);
        }
    }
}
