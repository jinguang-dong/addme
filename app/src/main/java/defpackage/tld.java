package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tld extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        String strJ = tmlVar.j();
        try {
            return sla.C(strJ);
        } catch (NumberFormatException e) {
            throw new tis(eld.e(strJ, tmlVar, "Failed parsing '", "' as BigInteger; at path "), e);
        }
    }
}
