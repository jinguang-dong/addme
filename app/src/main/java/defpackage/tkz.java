package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkz extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException, NumberFormatException {
        long j;
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        try {
            int iB = tmlVar.c;
            if (iB == 0) {
                iB = tmlVar.b();
            }
            if (iB == 15) {
                tmlVar.c = 0;
                int[] iArr = tmlVar.h;
                int i = tmlVar.g - 1;
                iArr[i] = iArr[i] + 1;
                j = tmlVar.d;
            } else {
                if (iB == 16) {
                    char[] cArr = tmlVar.a;
                    int i2 = tmlVar.b;
                    int i3 = tmlVar.e;
                    tmlVar.f = new String(cArr, i2, i3);
                    tmlVar.b = i2 + i3;
                } else {
                    if (iB != 8 && iB != 9 && iB != 10) {
                        throw tmlVar.d("a long");
                    }
                    if (iB == 10) {
                        tmlVar.f = tmlVar.k();
                    } else {
                        tmlVar.f = tmlVar.i(iB == 8 ? '\'' : '\"');
                    }
                    try {
                        long j2 = Long.parseLong(tmlVar.f);
                        tmlVar.c = 0;
                        int[] iArr2 = tmlVar.h;
                        int i4 = tmlVar.g - 1;
                        iArr2[i4] = iArr2[i4] + 1;
                        j = j2;
                    } catch (NumberFormatException unused) {
                    }
                }
                tmlVar.c = 11;
                double d = Double.parseDouble(tmlVar.f);
                long j3 = (long) d;
                if (j3 != d) {
                    throw new NumberFormatException("Expected a long but was " + tmlVar.f + tmlVar.g());
                }
                tmlVar.f = null;
                tmlVar.c = 0;
                int[] iArr3 = tmlVar.h;
                int i5 = tmlVar.g - 1;
                iArr3[i5] = iArr3[i5] + 1;
                j = j3;
            }
            return Long.valueOf(j);
        } catch (NumberFormatException e) {
            throw new tis(e);
        }
    }
}
