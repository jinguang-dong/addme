package defpackage;

import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pty extends tph implements tqs {
    public static final pty a;
    private static volatile tqy f;
    public int b;
    public boolean c = true;
    public boolean d = true;
    public boolean e;

    static {
        pty ptyVar = new pty();
        a = ptyVar;
        tph.A(pty.class, ptyVar);
    }

    private pty() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", VnmwoBe.GGjAdBFcKcXby});
        }
        if (i2 == 3) {
            return new pty();
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
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (pty.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
