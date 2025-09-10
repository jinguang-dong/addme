package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkl extends tiv {
    public static final tiw a = c(2);
    private final int b;

    private tkl(int i) {
        this.b = i;
    }

    public static tiw c(int i) {
        return new tkk(new tkl(i));
    }

    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        int iT = tmlVar.t();
        int i = iT - 1;
        if (i == 5 || i == 6) {
            return thu.b(this.b, tmlVar);
        }
        if (i == 8) {
            tmlVar.p();
            return null;
        }
        throw new tis("Expecting number, got: " + a.L(iT) + "; at path " + tmlVar.e());
    }
}
