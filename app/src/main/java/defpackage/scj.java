package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scj implements Serializable {
    private final sbp a;

    public scj(sbp sbpVar) {
        this.a = sbpVar;
    }

    Object readResolve() {
        sbp sbpVar = this.a;
        return sbpVar.isEmpty() ? sck.a : ujp.aH(sbpVar, sbp.l(seo.a)) ? sck.b : new sck(sbpVar);
    }
}
