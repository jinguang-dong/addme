package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uzw extends tph implements tqs {
    public static final uzw a;
    private static volatile tqy b;
    private int c;
    private boolean d;
    private byte e = 2;

    static {
        uzw uzwVar = new uzw();
        a = uzwVar;
        tph.A(uzw.class, uzwVar);
    }

    private uzw() {
        trb trbVar = trb.a;
    }

    public static /* synthetic */ void c(uzw uzwVar) {
        uzwVar.c |= 2;
        uzwVar.d = true;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0001", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new uzw();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uzw.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
