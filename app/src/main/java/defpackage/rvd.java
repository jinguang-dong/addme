package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvd extends tph implements tqs {
    public static final rvd a;
    private static volatile tqy l;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        rvd rvdVar = new rvd();
        a = rvdVar;
        tph.A(rvd.class, rvdVar);
    }

    private rvd() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0000\n\u0000\u0000\u0002\r\n\u0000\u0000\u0000\u0002\u000b\u0004\u000b\u0005\u000b\u0006\u000f\b\u000f\t\u000f\n\u000b\u000b\u000b\f\u000b\r\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", PJGqOKsIpSdZ.FaufVTqrivPCnHE, "j", "k"});
        }
        if (i2 == 3) {
            return new rvd();
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
        tqy tqyVar = l;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rvd.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
