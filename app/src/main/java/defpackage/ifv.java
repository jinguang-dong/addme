package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifv extends tph implements tqs {
    public static final ifv a;
    private static volatile tqy i;
    public int b;
    public String c = "";
    public String d = "";
    public ifu e;
    public ifu f;
    public boolean g;
    public boolean h;

    static {
        ifv ifvVar = new ifv();
        a = ifvVar;
        tph.A(ifv.class, ifvVar);
    }

    private ifv() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0007\u0006\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new ifv();
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
        synchronized (ifv.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
