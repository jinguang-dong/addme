package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsu extends tph implements tqs {
    public static final tsu a;
    private static volatile tqy i;
    public int b;
    public int d;
    public int e;
    public long f;
    public int g;
    public int h;
    private byte j = 2;
    public tpm c = tpa.a;

    static {
        tsu tsuVar = new tsu();
        a = tsuVar;
        tph.A(tsu.class, tsuVar);
    }

    private tsu() {
        tpi tpiVar = tpi.a;
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0000\u0001$\u0003င\u0000\u0004င\u0001\u0005ဂ\u0002\u0006᠌\u0003\t᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", svp.r, "h", svp.s});
        }
        if (i3 == 3) {
            return new tsu();
        }
        if (i3 == 4) {
            return new tpc(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = i;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tsu.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
