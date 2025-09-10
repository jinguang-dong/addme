package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pud extends tph implements tqs {
    public static final pud a;
    private static volatile tqy i;
    public int b;
    public int e;
    public long g;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public tpw f = trb.a;
    public String h = "";

    static {
        pud pudVar = new pud();
        a = pudVar;
        tph.A(pud.class, pudVar);
    }

    private pud() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u001a\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0006ဈ\u0001\nင\u0002\u0017ဂ\u000f\u001aဈ\u0010", new Object[]{"b", "c", "f", puc.class, "d", "e", "g", "h"});
        }
        if (i3 == 3) {
            return new pud();
        }
        if (i3 == 4) {
            return new tpc(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = i;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (pud.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }

    public final void b() {
        tpw tpwVar = this.f;
        if (tpwVar.c()) {
            return;
        }
        this.f = tph.v(tpwVar);
    }
}
