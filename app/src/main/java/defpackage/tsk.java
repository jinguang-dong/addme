package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsk extends tph implements tqs {
    public static final tsk a;
    private static volatile tqy c;
    public tpw b = trb.a;

    static {
        tsk tskVar = new tsk();
        a = tskVar;
        tph.A(tsk.class, tskVar);
    }

    private tsk() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", tsl.class});
        }
        if (i2 == 3) {
            return new tsk();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        tqy tqyVar = c;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tsk.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
