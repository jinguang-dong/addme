package defpackage;

import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class soe extends tph implements tqs {
    public static final soe a;
    private static volatile tqy n;
    public int b;
    public int c;
    public int f;
    public int g;
    public int h;
    public src i;
    public int k;
    public boolean l;
    public String d = "";
    public String e = "";
    public tpn j = tpi.a;
    public tpw m = trb.a;

    static {
        soe soeVar = new soe();
        a = soeVar;
        tph.A(soe.class, soeVar);
    }

    private soe() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0007င\u0006\bဉ\u0007\nࠞ\u000bင\b\fဇ\t\r\u001a", new Object[]{"b", "c", snl.h, "d", "e", "f", "g", "h", GdpuLBytnYW.IJXCpHhu, "j", snl.e, "k", "l", "m"});
        }
        if (i2 == 3) {
            return new soe();
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
        tqy tqyVar = n;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (soe.class) {
            tpdVar = n;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                n = tpdVar;
            }
        }
        return tpdVar;
    }
}
