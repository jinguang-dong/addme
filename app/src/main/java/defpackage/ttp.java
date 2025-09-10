package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttp extends tpf implements tqs {
    public static final ttp a;
    private static volatile tqy e;
    public int b;
    public int d;
    private byte f = 2;
    public String c = "FaceAttributesClientBrainEmbedder";

    static {
        ttp ttpVar = new ttp();
        a = ttpVar;
        tph.A(ttp.class, ttpVar);
    }

    private ttp() {
        toj tojVar = toj.b;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\t\u0010\u0002\u0000\u0000\u0000\tဈ\u0000\u0010င\u0005", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ttp();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ttp.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
