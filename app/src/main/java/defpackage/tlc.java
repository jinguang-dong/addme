package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlc extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        String strJ = tmlVar.j();
        try {
            return sla.B(strJ);
        } catch (NumberFormatException e) {
            throw new tis(eld.e(strJ, tmlVar, cdVQ.MKSxsOw, "' as BigDecimal; at path "), e);
        }
    }
}
