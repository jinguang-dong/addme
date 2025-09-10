package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxj extends bxh {
    public static bxj b;
    public cdl c;

    private final int e(int i, int i2) {
        cdl cdlVar = this.c;
        cdl cdlVar2 = null;
        if (cdlVar == null) {
            ujp.c("layoutResult");
            cdlVar = null;
        }
        int iE = cdlVar.e(i);
        cdl cdlVar3 = this.c;
        if (cdlVar3 == null) {
            ujp.c("layoutResult");
            cdlVar3 = null;
        }
        if (i2 != cdlVar3.j(iE)) {
            cdl cdlVar4 = this.c;
            if (cdlVar4 == null) {
                ujp.c("layoutResult");
            } else {
                cdlVar2 = cdlVar4;
            }
            return cdlVar2.e(i);
        }
        cdl cdlVar5 = this.c;
        if (cdlVar5 == null) {
            ujp.c("layoutResult");
        } else {
            cdlVar2 = cdlVar5;
        }
        return cdl.i(cdlVar2, i) - 1;
    }

    @Override // defpackage.bxm
    public final int[] c(int i) {
        int iC;
        if (a().length() > 0 && i < a().length()) {
            if (i < 0) {
                cdl cdlVar = this.c;
                if (cdlVar == null) {
                    ujp.c("layoutResult");
                    cdlVar = null;
                }
                iC = cdlVar.c(0);
            } else {
                cdl cdlVar2 = this.c;
                if (cdlVar2 == null) {
                    ujp.c("layoutResult");
                    cdlVar2 = null;
                }
                int iC2 = cdlVar2.c(i);
                iC = e(iC2, 2) == i ? iC2 : iC2 + 1;
            }
            cdl cdlVar3 = this.c;
            if (cdlVar3 == null) {
                ujp.c("layoutResult");
                cdlVar3 = null;
            }
            if (iC < cdlVar3.b()) {
                return b(e(iC, 2), e(iC, 1) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.bxm
    public final int[] d(int i) {
        int iC;
        if (a().length() > 0 && i > 0) {
            if (i > a().length()) {
                cdl cdlVar = this.c;
                if (cdlVar == null) {
                    ujp.c("layoutResult");
                    cdlVar = null;
                }
                iC = cdlVar.c(a().length());
            } else {
                cdl cdlVar2 = this.c;
                if (cdlVar2 == null) {
                    ujp.c("layoutResult");
                    cdlVar2 = null;
                }
                int iC2 = cdlVar2.c(i);
                iC = e(iC2, 1) + 1 == i ? iC2 : iC2 - 1;
            }
            if (iC >= 0) {
                return b(e(iC, 2), e(iC, 1) + 1);
            }
        }
        return null;
    }
}
