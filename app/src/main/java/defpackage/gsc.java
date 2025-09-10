package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsc extends tph implements tqs {
    public static final gsc a;
    private static volatile tqy i;
    public String b = "";
    public tpw c;
    public tpw d;
    public String e;
    public String f;
    public String g;
    public String h;

    static {
        gsc gscVar = new gsc();
        a = gscVar;
        tph.A(gsc.class, gscVar);
    }

    private gsc() {
        trb trbVar = trb.a;
        this.c = trbVar;
        this.d = trbVar;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"b", "c", IQwwK.VEDnQcY, "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new gsc();
        }
        if (i3 == 4) {
            return new tpc(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        tqy tqyVar = i;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (gsc.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
