package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szx extends tph implements tqs {
    public static final szx a;
    private static volatile tqy i;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private int j;

    static {
        szx szxVar = new szx();
        a = szxVar;
        tph.A(szx.class, szxVar);
    }

    private szx() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0006\u0007ဋ\u0007\bဋ\u0005\tဋ\b", new Object[]{"j", "b", "c", "d", "f", "g", "e", "h"});
        }
        if (i3 == 3) {
            return new szx();
        }
        if (i3 == 4) {
            return new tpc(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        tqy tqyVar = i;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (szx.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
