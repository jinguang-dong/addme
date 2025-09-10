package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class spk extends tph implements tqs {
    public static final spk a;
    private static volatile tqy k;
    public int b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public long g;
    public spj h;
    public long i;
    public long j;

    static {
        spk spkVar = new spk();
        a = spkVar;
        tph.A(spk.class, spkVar);
    }

    private spk() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဉ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new spk();
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
        synchronized (spk.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
