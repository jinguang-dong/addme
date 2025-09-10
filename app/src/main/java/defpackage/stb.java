package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class stb extends tph implements tqs {
    public static final stb a;
    private static volatile tqy i;
    public int b;
    public int c;
    public boolean e;
    public boolean f;
    public String d = "";
    public String g = "";
    public String h = "";

    static {
        stb stbVar = new stb();
        a = stbVar;
        tph.A(stb.class, stbVar);
    }

    private stb() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", ssj.l, "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new stb();
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
        synchronized (stb.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
