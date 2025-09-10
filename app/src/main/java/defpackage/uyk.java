package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uyk extends tph implements tqs {
    public static final uyk a;
    private static volatile tqy d;
    public tpw b;
    public tpw c;
    private byte e = 2;

    static {
        uyk uykVar = new uyk();
        a = uykVar;
        tph.A(uyk.class, uykVar);
    }

    private uyk() {
        trb trbVar = trb.a;
        this.b = trbVar;
        this.c = trbVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001Л\u0003\u001b", new Object[]{"b", uyj.class, "c", uym.class});
        }
        if (i2 == 3) {
            return new uyk();
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
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uyk.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
