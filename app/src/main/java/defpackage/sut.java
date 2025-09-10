package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sut extends tph implements tqs {
    public static final sut a;
    private static volatile tqy g;
    public int b;
    public Object d;
    public suq e;
    public int c = 0;
    private byte h = 2;
    public tpw f = trb.a;

    static {
        sut sutVar = new sut();
        a = sutVar;
        tph.A(sut.class, sutVar);
    }

    private sut() {
    }

    public final void b() {
        tpw tpwVar = this.f;
        if (tpwVar.c()) {
            return;
        }
        this.f = tph.v(tpwVar);
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{TOnSyMaYeslEl.CIkvw, "c", "b", "e", "f", suq.class, sur.class});
        }
        if (i2 == 3) {
            return new sut();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sut.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
