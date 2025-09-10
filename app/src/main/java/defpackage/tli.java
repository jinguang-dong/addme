package defpackage;

import java.io.IOException;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tli extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        String strJ = tmlVar.j();
        if (strJ.equals("null")) {
            return null;
        }
        return new URL(strJ);
    }
}
