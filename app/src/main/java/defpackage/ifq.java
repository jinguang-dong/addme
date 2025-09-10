package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifq extends tph implements tqs {
    public static final ifq a;
    private static volatile tqy c;
    public ifr b;
    private int d;

    static {
        ifq ifqVar = new ifq();
        a = ifqVar;
        tph.A(ifq.class, ifqVar);
    }

    private ifq() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", PJGqOKsIpSdZ.fxqphRqfnu});
        }
        if (i2 == 3) {
            return new ifq();
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
        synchronized (ifq.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
