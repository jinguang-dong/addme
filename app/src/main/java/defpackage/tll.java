package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tll extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        String strJ = tmlVar.j();
        try {
            return UUID.fromString(strJ);
        } catch (IllegalArgumentException e) {
            throw new tis(eld.e(strJ, tmlVar, "Failed parsing '", yoGAhrpjU.qCCwcqaZ), e);
        }
    }
}
