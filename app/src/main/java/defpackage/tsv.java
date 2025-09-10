package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsv extends tph implements tqs {
    public static final tsv a;
    private static volatile tqy s;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float p;
    public float q;
    public float r;
    private byte t = 2;
    public tpw n = trb.a;
    public tpm o = tpa.a;

    static {
        tsv tsvVar = new tsv();
        a = tsvVar;
        tph.A(tsv.class, tsvVar);
    }

    private tsv() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.t);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0001\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fЛ\r$\u000eခ\u000b\u000fခ\f\u0010ခ\r", new Object[]{IQwwK.CpWahyfGpfqU, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", ttc.class, "o", "p", "q", "r"});
        }
        if (i2 == 3) {
            return new tsv();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.t = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = s;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tsv.class) {
            tpdVar = s;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                s = tpdVar;
            }
        }
        return tpdVar;
    }
}
