package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uzf extends tph implements tqs {
    public static final uzf a;
    private static volatile tqy m;
    public int b;
    public boolean c;
    public uyy d;
    public int g;
    public sut i;
    public tts j;
    public uzh k;
    public uze l;
    private byte n = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        uzf uzfVar = new uzf();
        a = uzfVar;
        tph.A(uzf.class, uzfVar);
    }

    private uzf() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", MyBPCgKwEjJI.CiXECSYDEJ, "g", tyy.p, "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new uzf();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = m;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uzf.class) {
            tpdVar = m;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                m = tpdVar;
            }
        }
        return tpdVar;
    }
}
