package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssn extends tph implements tqs {
    public static final ssn a;
    private static volatile tqy i;
    public int b;
    public int c;
    public ssm d;
    public ssm e;
    public int f;
    public int g;
    public int h;

    static {
        ssn ssnVar = new ssn();
        a = ssnVar;
        tph.A(ssn.class, ssnVar);
    }

    private ssn() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"b", "c", ssj.f, "d", "e", "f", "g", ssj.d, "h", ssj.e});
        }
        if (i3 == 3) {
            return new ssn();
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
        synchronized (ssn.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
