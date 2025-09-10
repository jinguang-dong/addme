package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rqt implements Runnable {
    public final pfl d;

    public rqt() {
        this.d = null;
    }

    protected abstract void a();

    public final void b(Exception exc) {
        pfl pflVar = this.d;
        if (pflVar != null) {
            pflVar.e(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            b(e);
        }
    }

    public rqt(pfl pflVar) {
        this.d = pflVar;
    }
}
