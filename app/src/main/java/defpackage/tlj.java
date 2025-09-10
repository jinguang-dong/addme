package defpackage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlj extends tiv {
    public static final URI c(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        try {
            String strJ = tmlVar.j();
            if (strJ.equals("null")) {
                return null;
            }
            return new URI(strJ);
        } catch (URISyntaxException e) {
            throw new tim(e);
        }
    }

    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) {
        return c(tmlVar);
    }
}
