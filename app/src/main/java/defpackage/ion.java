package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ion extends tph implements tqs {
    public static final ion a;
    private static volatile tqy k;
    public int b;
    public int c;
    public long d;
    public long e;
    public tpm f;
    public tpm g;
    public ioe h;
    public long i;
    public long j;

    static {
        ion ionVar = new ion();
        a = ionVar;
        tph.A(ion.class, ionVar);
    }

    private ion() {
        tpa tpaVar = tpa.a;
        this.f = tpaVar;
        this.g = tpaVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u0004\u0002ဂ\u0000\u0003ဂ\u0001\u0004$\u0005$\u0006ဉ\u0002\u0007ဂ\u0003\b\u0002", new Object[]{"b", PNlJufQ.MqtPjsUDC, "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new ion();
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
        tqy tqyVar = k;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ion.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
