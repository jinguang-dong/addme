package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tue extends tph implements tqs {
    public static final tue a;
    private static volatile tqy e;
    public int b;
    public tug c;
    public tuf d;

    static {
        tue tueVar = new tue();
        a = tueVar;
        tph.A(tue.class, tueVar);
    }

    private tue() {
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0005ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new tue();
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
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tue.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
