package defpackage;

import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsx extends tph implements tqs {
    public static final tsx a;
    private static volatile tqy h;
    public int b;
    public long c;
    public long d;
    public boolean e;
    public ttd f;
    public tta g;
    private byte i = 2;

    static {
        tsx tsxVar = new tsx();
        a = tsxVar;
        tph.A(tsx.class, tsxVar);
    }

    private tsx() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", mPfBwqXsnpXI.UsXPSwY, "f", "g"});
        }
        if (i2 == 3) {
            return new tsx();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tsx.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
