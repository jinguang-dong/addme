package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.SHXc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ift extends tph implements tqs {
    public static final ift a;
    private static volatile tqy d;
    public long b;
    public long c;

    static {
        ift iftVar = new ift();
        a = iftVar;
        tph.A(ift.class, iftVar);
    }

    private ift() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"b", SHXc.EpYIRvyTpU});
        }
        if (i2 == 3) {
            return new ift();
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
        synchronized (ift.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
