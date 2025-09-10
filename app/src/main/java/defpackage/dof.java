package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dof {
    public static final dof a = new dof();
    public static final bbf b = new azx(Long.MAX_VALUE);
    private static final azr c;

    static {
        new AtomicInteger(0);
        c = new azz(false, bap.c);
    }

    private dof() {
    }

    public static final boolean b() {
        return ((Boolean) c.a()).booleanValue();
    }

    public final void a(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-357278979);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (aycVarC.H((i2 & 3) != 2, i2 & 1)) {
            Boolean boolValueOf = Boolean.valueOf(b());
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = new doe(null, 0);
                aygVar.ac(objR);
            }
            azb.f(boolValueOf, (uiu) objR, aycVarC);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 5);
        }
    }
}
