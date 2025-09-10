package defpackage;

import androidx.wear.ambient.SharedLibraryVersion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkg extends djd {
    private final uiq b;

    public dkg(djk djkVar, uiq uiqVar) {
        super(djkVar);
        this.b = uiqVar;
    }

    @Override // defpackage.djd, defpackage.djk
    public final void h(kbz kbzVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(660221842);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(kbzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(this) ? 16 : 32;
        }
        if (aycVarC.H((i2 & 19) != 18, i2 & 1)) {
            this.b.a(new SharedLibraryVersion());
            ((djd) this).a.h(kbzVar.a(new kbz((String) null, true)), aycVarC, 0);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(this, kbzVar, i, 9, null);
        }
    }
}
