package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tts extends tph implements tqs {
    public static final tts a;
    private static volatile tqy f;
    public int b;
    public long c;
    public String d;
    public tpw e;

    static {
        tts ttsVar = new tts();
        a = ttsVar;
        tph.A(tts.class, ttsVar);
    }

    private tts() {
        trb trbVar = trb.a;
        this.d = "";
        this.e = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0000\u0001\u0000\u0007ဃ\u0004\bဈ\u0005\t\u001b", new Object[]{"b", "c", "d", "e", ttr.class});
        }
        if (i2 == 3) {
            return new tts();
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
        synchronized (tts.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
