package defpackage;

import java.io.IOException;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlp extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException, NumberFormatException {
        BitSet bitSet = new BitSet();
        tmlVar.l();
        int iT = tmlVar.t();
        int i = 0;
        while (iT != 2) {
            int i2 = iT - 1;
            if (i2 == 5 || i2 == 6) {
                int iC = tmlVar.c();
                if (iC != 0) {
                    if (iC != 1) {
                        throw new tis("Invalid bitset value " + iC + ", expected 0 or 1; at path " + tmlVar.f());
                    }
                    bitSet.set(i);
                } else {
                    continue;
                }
            } else {
                if (i2 != 7) {
                    throw new tis("Invalid bitset value type: " + a.L(iT) + "; at path " + tmlVar.e());
                }
                if (tmlVar.s()) {
                    bitSet.set(i);
                }
            }
            i++;
            iT = tmlVar.t();
        }
        tmlVar.n();
        return bitSet;
    }
}
