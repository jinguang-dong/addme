package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ois {
    private static ois b;
    private static final oit c = new oit(0, false, false, 0, 0);
    public oit a;

    private ois() {
    }

    public static synchronized ois a() {
        if (b == null) {
            b = new ois();
        }
        return b;
    }

    public final synchronized void b(oit oitVar) {
        if (oitVar == null) {
            this.a = c;
            return;
        }
        oit oitVar2 = this.a;
        if (oitVar2 != null) {
            if (oitVar2.a >= oitVar.a) {
                return;
            }
        }
        this.a = oitVar;
    }
}
