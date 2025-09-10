package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlv extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        try {
            int iC = tmlVar.c();
            if (iC <= 255 && iC >= -128) {
                return Byte.valueOf((byte) iC);
            }
            throw new tis("Lossy conversion from " + iC + " to byte; at path " + tmlVar.f());
        } catch (NumberFormatException e) {
            throw new tis(e);
        }
    }
}
