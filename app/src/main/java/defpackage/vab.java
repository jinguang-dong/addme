package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vab extends tph implements tqs {
    public static final vab a;
    private static volatile tqy d;
    public int b;
    public long c;
    private int e;

    static {
        vab vabVar = new vab();
        a = vabVar;
        tph.A(vab.class, vabVar);
    }

    private vab() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"e", "b", tyy.t, "c"});
        }
        if (i2 == 3) {
            return new vab();
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
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (vab.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
