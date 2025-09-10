package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aah implements bsr {
    private boolean a;
    private final ocq b;

    public aah(ocq ocqVar) {
        this.b = ocqVar;
    }

    @Override // defpackage.bsr
    public final int a(brv brvVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iC = ((bru) list.get(0)).c(i);
        int iBk = ske.bk(list);
        if (iBk > 0) {
            int i2 = 1;
            while (true) {
                int iC2 = ((bru) list.get(i2)).c(i);
                if (iC2 > iC) {
                    iC = iC2;
                }
                if (i2 == iBk) {
                    break;
                }
                i2++;
            }
        }
        return iC;
    }

    @Override // defpackage.bsr
    public final int b(brv brvVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((bru) list.get(0)).d(i);
        int iBk = ske.bk(list);
        if (iBk > 0) {
            int i2 = 1;
            while (true) {
                int iD2 = ((bru) list.get(i2)).d(i);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i2 == iBk) {
                    break;
                }
                i2++;
            }
        }
        return iD;
    }

    @Override // defpackage.bsr
    public final int c(brv brvVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iE = ((bru) list.get(0)).e(i);
        int iBk = ske.bk(list);
        if (iBk > 0) {
            int i2 = 1;
            while (true) {
                int iE2 = ((bru) list.get(i2)).e(i);
                if (iE2 > iE) {
                    iE = iE2;
                }
                if (i2 == iBk) {
                    break;
                }
                i2++;
            }
        }
        return iE;
    }

    @Override // defpackage.bsr
    public final int d(brv brvVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iF = ((bru) list.get(0)).f(i);
        int iBk = ske.bk(list);
        if (iBk > 0) {
            int i2 = 1;
            while (true) {
                int iF2 = ((bru) list.get(i2)).f(i);
                if (iF2 > iF) {
                    iF = iF2;
                }
                if (i2 == iBk) {
                    break;
                }
                i2++;
            }
        }
        return iF;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [azr, java.lang.Object] */
    @Override // defpackage.bsr
    public final bss e(bst bstVar, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            bte bteVarR = ((bsq) list.get(i)).r(j);
            iMax2 = Math.max(iMax2, bteVarR.a);
            iMax = Math.max(iMax, bteVarR.b);
            arrayList.add(bteVarR);
        }
        if (bstVar.dt()) {
            this.a = true;
            this.b.a.b(new cia((iMax2 << 32) | (4294967295L & iMax)));
        } else if (!this.a) {
            this.b.a.b(new cia((iMax2 << 32) | (4294967295L & iMax)));
        }
        return bstVar.ds(iMax2, iMax, ufx.a, new aal(arrayList, 1));
    }
}
