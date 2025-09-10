package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhk extends tph implements tqs {
    public static final rhk a;
    private static volatile tqy j;
    public int b;
    public Object d;
    public boolean e;
    public float g;
    public float h;
    public float i;
    public int c = 0;
    private byte k = 2;
    public tpw f = trb.a;

    static {
        rhk rhkVar = new rhk();
        a = rhkVar;
        tph.A(rhk.class, rhkVar);
    }

    private rhk() {
        tpa tpaVar = tpa.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0006\u0001\u0001\u0002\u000b\u0006\u0000\u0001\u0001\u0002м\u0000\u0003ဇ\u0000\u0004\u001b\u0007ခ\u0004\bခ\u0005\u000bခ\u0006", new Object[]{"d", "c", "b", rhl.class, "e", "f", rhh.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new rhk();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rhk.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }

    public final void b() {
        tpw tpwVar = this.f;
        if (tpwVar.c()) {
            return;
        }
        this.f = tph.v(tpwVar);
    }
}
