package defpackage;

import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqb extends tph implements tqs {
    public static final sqb a;
    private static volatile tqy j;
    public int b;
    public String c = YyLACfm.ugFlTlsQVsEf;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;

    static {
        sqb sqbVar = new sqb();
        a = sqbVar;
        tph.A(sqb.class, sqbVar);
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဂ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new sqb();
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
        synchronized (sqb.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }

    private sqb() {
    }
}
