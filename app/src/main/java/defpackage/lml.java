package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lml implements lma {
    public final szh a = new szh();
    public lmg b;

    @Override // defpackage.lma, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        lmg lmgVar = this.b;
        szh szhVar = this.a;
        if (lmgVar == null) {
            szhVar.e(Collections.EMPTY_SET);
        } else {
            szhVar.e(new sfm(lmgVar));
        }
    }
}
