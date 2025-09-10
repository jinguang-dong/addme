package defpackage;

import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iof extends tph implements tqs {
    public static final iof a;
    private static volatile tqy h;
    public int b;
    public int c;
    public int d;
    public ion e;
    public ioi f;
    public iok g;

    static {
        iof iofVar = new iof();
        a = iofVar;
        tph.A(iof.class, iofVar);
    }

    private iof() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", YyLACfm.zJnvssgTcgZMmRf});
        }
        if (i2 == 3) {
            return new iof();
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
        synchronized (iof.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
