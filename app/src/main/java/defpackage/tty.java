package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tty extends tpf implements tqs {
    public static final tty a;
    private static volatile tqy k;
    public int b;
    public float e;
    public boolean g;
    public int h;
    public ttw i;
    public tsj j;
    private byte m = 2;
    public String c = "";
    public int d = 10;
    private int l = 1;
    public float f = 0.3f;

    static {
        tty ttyVar = new tty();
        a = ttyVar;
        tph.A(tty.class, ttyVar);
    }

    private tty() {
        trb trbVar = trb.a;
    }

    public static /* synthetic */ void F(tty ttyVar) {
        ttyVar.b |= 4;
        ttyVar.l = 1;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\t\u0000\u0001\u0001\u0011\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\tဇ\u0007\nဋ\b\u0010ဉ\r\u0011ဉ\u000f", new Object[]{"b", "c", "d", "l", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new tty();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = k;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tty.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
