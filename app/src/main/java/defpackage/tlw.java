package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlw extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        try {
            int iC = tmlVar.c();
            if (iC <= 65535 && iC >= -32768) {
                return Short.valueOf((short) iC);
            }
            throw new tis("Lossy conversion from " + iC + " to short; at path " + tmlVar.f());
        } catch (NumberFormatException e) {
            throw new tis(e);
        }
    }
}
