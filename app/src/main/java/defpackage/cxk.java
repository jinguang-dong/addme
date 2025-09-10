package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxk implements Runnable {
    private final cwa a;
    private boolean b;
    private final cwc c;

    public cxk(cwc cwcVar, cwa cwaVar) {
        cwaVar.getClass();
        this.c = cwcVar;
        this.a = cwaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c.b(this.a);
        this.b = true;
    }
}
