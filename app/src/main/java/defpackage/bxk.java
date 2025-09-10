package defpackage;

import android.graphics.Rect;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxk extends bxh {
    public static bxk b;
    public cdl c;
    public cbr d;

    public bxk() {
        new Rect();
    }

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
        int iB;
        cdl cdlVar = null;
        if (a().length() > 0 && i < a().length()) {
            try {
                cbr cbrVar = this.d;
                if (cbrVar == null) {
                    ujp.c("node");
                    cbrVar = null;
                }
                bkg bkgVarC = cbrVar.c();
                int iRound = Math.round(bkgVarC.e - bkgVarC.c);
                int iN = ukc.n(0, i);
                cdl cdlVar2 = this.c;
                if (cdlVar2 == null) {
                    ujp.c("layoutResult");
                    cdlVar2 = null;
                }
                int iC = cdlVar2.c(iN);
                cdl cdlVar3 = this.c;
                if (cdlVar3 == null) {
                    ujp.c("layoutResult");
                    cdlVar3 = null;
                }
                float fA = cdlVar3.a(iC) + iRound;
                cdl cdlVar4 = this.c;
                if (cdlVar4 == null) {
                    ujp.c("layoutResult");
                    cdlVar4 = null;
                }
                cdl cdlVar5 = this.c;
                if (cdlVar5 == null) {
                    ujp.c("layoutResult");
                    cdlVar5 = null;
                }
                if (fA < cdlVar4.a(cdlVar5.b() - 1)) {
                    cdl cdlVar6 = this.c;
                    if (cdlVar6 == null) {
                        ujp.c("layoutResult");
                    } else {
                        cdlVar = cdlVar6;
                    }
                    iB = cdlVar.d(fA);
                } else {
                    cdl cdlVar7 = this.c;
                    if (cdlVar7 == null) {
                        ujp.c("layoutResult");
                    } else {
                        cdlVar = cdlVar7;
                    }
                    iB = cdlVar.b();
                }
                return b(iN, e(iB - 1, 1) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.bxm
    public final int[] d(int i) {
        int iD;
        cdl cdlVar = null;
        if (a().length() > 0 && i > 0) {
            try {
                cbr cbrVar = this.d;
                if (cbrVar == null) {
                    ujp.c(LmJPKwPBa.KgipKQtQ);
                    cbrVar = null;
                }
                bkg bkgVarC = cbrVar.c();
                int iRound = Math.round(bkgVarC.e - bkgVarC.c);
                int iO = ukc.o(a().length(), i);
                cdl cdlVar2 = this.c;
                if (cdlVar2 == null) {
                    ujp.c("layoutResult");
                    cdlVar2 = null;
                }
                int iC = cdlVar2.c(iO);
                cdl cdlVar3 = this.c;
                if (cdlVar3 == null) {
                    ujp.c("layoutResult");
                    cdlVar3 = null;
                }
                float fA = cdlVar3.a(iC) - iRound;
                if (fA > 0.0f) {
                    cdl cdlVar4 = this.c;
                    if (cdlVar4 == null) {
                        ujp.c("layoutResult");
                    } else {
                        cdlVar = cdlVar4;
                    }
                    iD = cdlVar.d(fA);
                } else {
                    iD = 0;
                }
                if (iO == a().length() && iD < iC) {
                    iD++;
                }
                return b(e(iD, 2), iO);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
