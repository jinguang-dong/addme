package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qnc {
    private static final qnc b;
    private static volatile boolean c;
    private static volatile qnc d;
    public final qnd a;

    static {
        qnc qncVar = new qnc(new qnb());
        b = qncVar;
        c = true;
        d = qncVar;
    }

    public qnc(qnd qndVar) {
        this.a = qndVar;
    }

    public static synchronized void a(qnc qncVar) {
        if (d != b) {
            return;
        }
        d = qncVar;
    }
}
