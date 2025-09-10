package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iez extends tph implements tqs {
    public static final iez a;
    private static volatile tqy y;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public tpj k = toa.a;
    public tpq l;
    public tpq m;
    public tpq n;
    public long o;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;

    static {
        iez iezVar = new iez();
        a = iezVar;
        tph.A(iez.class, iezVar);
    }

    private iez() {
        tqh tqhVar = tqh.a;
        this.l = tqhVar;
        this.m = tqhVar;
        this.n = tqhVar;
        this.p = "";
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0017\u0000\u0000\u0001\u0017\u0017\u0000\u0004\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n*\u000b%\f%\r%\u000e\u0002\u000fȈ\u0010\u0007\u0011\u0007\u0012\u0007\u0013\u0007\u0014\u0004\u0015\u0004\u0016\u0007\u0017\u0007", new Object[]{"b", "c", LmJPKwPBa.IufouMIgdcjhGX, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x"});
        }
        if (i2 == 3) {
            return new iez();
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
        tqy tqyVar = y;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (iez.class) {
            tpdVar = y;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                y = tpdVar;
            }
        }
        return tpdVar;
    }
}
