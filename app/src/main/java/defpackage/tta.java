package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tta extends tph implements tqs {
    public static final tta a;
    private static volatile tqy g;
    public int b;
    public float d;
    public int e;
    public ttb f;
    private byte h = 2;
    public tpw c = trb.a;

    static {
        tta ttaVar = new tta();
        a = ttaVar;
        tph.A(tta.class, ttaVar);
    }

    private tta() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001Л\u0002ခ\u0000\u0003င\u0001\u0005ဉ\u0002", new Object[]{"b", "c", tsz.class, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new tta();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tta.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
