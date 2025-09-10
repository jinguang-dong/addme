package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tla extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        String strJ = tmlVar.j();
        if (strJ.length() == 1) {
            return Character.valueOf(strJ.charAt(0));
        }
        throw new tis(eld.e(strJ, tmlVar, "Expecting character, got: ", "; at "));
    }
}
