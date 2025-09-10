package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uzq extends tph implements tqs {
    public static final uzq a;
    private static volatile tqy l;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public tpw k = trb.a;

    static {
        uzq uzqVar = new uzq();
        a = uzqVar;
        tph.A(uzq.class, uzqVar);
    }

    private uzq() {
    }

    public final void c() {
        tpw tpwVar = this.k;
        if (tpwVar.c()) {
            return;
        }
        this.k = tph.v(tpwVar);
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", pAAtrB.SLBjdMynpZO, uzp.class});
        }
        if (i2 == 3) {
            return new uzq();
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
        synchronized (uzq.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
