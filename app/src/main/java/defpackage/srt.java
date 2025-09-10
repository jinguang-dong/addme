package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srt extends tph implements tqs {
    public static final srt a;
    private static volatile tqy l;
    public int b;
    public float c;
    public float d;
    public float e;
    public int f;
    public long g;
    public float h;
    public float i;
    public float j;
    public int k;

    static {
        srt srtVar = new srt();
        a = srtVar;
        tph.A(srt.class, srtVar);
    }

    private srt() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\t᠌\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", sri.j});
        }
        if (i2 == 3) {
            return new srt();
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
        tqy tqyVar = l;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (srt.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
