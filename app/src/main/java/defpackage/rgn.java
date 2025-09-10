package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgn extends tph implements tqs {
    public static final rgn a;
    private static volatile tqy f;
    public int b;
    public tpw c;
    public tpw d;
    public long e;
    private String g = "";

    static {
        rgn rgnVar = new rgn();
        a = rgnVar;
        tph.A(rgn.class, rgnVar);
    }

    private rgn() {
        trb trbVar = trb.a;
        this.c = trbVar;
        this.d = trbVar;
    }

    public static /* synthetic */ void b(rgn rgnVar) {
        rgnVar.b |= 1;
        rgnVar.g = "camera_vkp";
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b\u0004ဂ\u0001", new Object[]{"b", "g", "c", "d", rgo.class, "e"});
        }
        if (i2 == 3) {
            return new rgn();
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
        synchronized (rgn.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
