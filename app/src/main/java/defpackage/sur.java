package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sur extends tph implements tqs {
    public static final sur a;
    private static volatile tqy c;
    private byte d = 2;
    public tpw b = trb.a;

    static {
        sur surVar = new sur();
        a = surVar;
        tph.A(sur.class, surVar);
    }

    private sur() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", sus.class});
        }
        if (i2 == 3) {
            return new sur();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = c;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sur.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }

    public final void b() {
        tpw tpwVar = this.b;
        if (tpwVar.c()) {
            return;
        }
        this.b = tph.v(tpwVar);
    }
}
