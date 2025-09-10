package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stu extends tph implements tqs {
    public static final stu a;
    private static volatile tqy e;
    public int b;
    public sua c;
    public boolean d;

    static {
        stu stuVar = new stu();
        a = stuVar;
        tph.A(stu.class, stuVar);
    }

    private stu() {
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
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0005ဇ\u0003", new Object[]{"b", "c", PJGqOKsIpSdZ.ICuHUYtRpQQyXG});
        }
        if (i2 == 3) {
            return new stu();
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
        synchronized (stu.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
