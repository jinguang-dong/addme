package defpackage;

import java.io.IOException;
import java.util.Currency;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlm extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        String strJ = tmlVar.j();
        try {
            return Currency.getInstance(strJ);
        } catch (IllegalArgumentException e) {
            throw new tis(eld.e(strJ, tmlVar, "Failed parsing '", "' as Currency; at path "), e);
        }
    }
}
