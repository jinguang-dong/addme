package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tuw extends tph implements tqs {
    public static final tuw a;
    public static final tql j;
    private static volatile tqy k;
    public int b;
    public tut c;
    public tut d;
    public float e;
    public float f;
    public float g;
    public tux h;
    public tux i;
    private tqm l;
    private tqm m;

    static {
        tuw tuwVar = new tuw();
        a = tuwVar;
        tph.A(tuw.class, tuwVar);
        j = tph.E(ttn.a, tuwVar, tuwVar, 202575443, Ctry.MESSAGE);
    }

    private tuw() {
        tqm tqmVar = tqm.a;
        this.l = tqmVar;
        this.m = tqmVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\t\u0000\u0001\u0001\t\t\u0002\u0000\u0000\u00012\u00022\u0003ဉ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007ဉ\u0000\bဉ\u0005\tဉ\u0006", new Object[]{"b", "l", tuu.a, "m", tus.a, "d", "e", "f", "g", "c", "h", "i"});
        }
        if (i2 == 3) {
            return new tuw();
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
        synchronized (tuw.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
