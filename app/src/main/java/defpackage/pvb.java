package defpackage;

import com.google.android.build.data.JKx.wzgaYJqO;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvb extends tph implements tqs {
    public static final pvb a;
    private static volatile tqy j;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    static {
        pvb pvbVar = new pvb();
        a = pvbVar;
        tph.A(pvb.class, pvbVar);
    }

    private pvb() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", wzgaYJqO.faSXBa, "i"});
        }
        if (i2 == 3) {
            return new pvb();
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
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (pvb.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
