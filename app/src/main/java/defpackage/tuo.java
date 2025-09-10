package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tuo extends tph implements tqs {
    public static final tuo a;
    private static volatile tqy j;
    public int b;
    public float c;
    public tqm d;
    public tui e;
    public float f;
    public float g;
    public float h;
    public float i;
    private tqm k;

    static {
        tuo tuoVar = new tuo();
        a = tuoVar;
        tph.A(tuo.class, tuoVar);
    }

    private tuo() {
        tqm tqmVar = tqm.a;
        this.d = tqmVar;
        this.k = tqmVar;
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\b\u0000\u0001\u0002\u000f\b\u0002\u0000\u0000\u0002ခ\u0002\b2\tဉ\u0007\n2\fခ\b\rခ\t\u000eခ\n\u000fခ\u000b", new Object[]{"b", "c", "d", tuk.a, "e", "k", tum.a, "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new tuo();
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
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tuo.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }

    public final boolean c(String str) {
        return this.d.containsKey(str);
    }
}
