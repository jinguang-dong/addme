package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvl extends tph implements tqs {
    public static final pvl a;
    private static volatile tqy h;
    public int b;
    public boolean f;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        pvl pvlVar = new pvl();
        a = pvlVar;
        tph.A(pvl.class, pvlVar);
    }

    private pvl() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဈ\u0002\u0006ဈ\u0004", new Object[]{"b", "c", "d", VnmwoBe.KFAcmcnFaQwTo, PJGqOKsIpSdZ.gYlMZtFXfPgFaXC, "g"});
        }
        if (i2 == 3) {
            return new pvl();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (pvl.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
