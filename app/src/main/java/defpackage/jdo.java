package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdo {
    private static jod a;

    public static jod a(enl enlVar) {
        int i;
        int iAbs;
        if (a == null) {
            ArrayList arrayList = new ArrayList(enlVar.f);
            ArrayList arrayList2 = new ArrayList(enlVar.c);
            int[] iArr = new int[arrayList.size()];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = -1;
                if (i2 >= arrayList.size()) {
                    break;
                }
                iArr[i2] = -1;
                double dB = ((enx) arrayList.get(i2)).b();
                double dA = ((enx) arrayList.get(i2)).a();
                int i4 = Integer.MAX_VALUE;
                int i5 = 0;
                while (i5 < arrayList2.size()) {
                    int i6 = i2;
                    if (Math.abs((dB / dA) - (((enx) arrayList2.get(i5)).b() / ((enx) arrayList2.get(i5)).a())) < 0.03d && ((enx) arrayList2.get(i5)).b() < 1440 && (iAbs = Math.abs(((enx) arrayList2.get(i5)).b() - 1280)) < i4) {
                        iArr[i6] = i5;
                        i4 = iAbs;
                    }
                    i5++;
                    i2 = i6;
                }
                int i7 = i2;
                if (iArr[i7] >= 0) {
                    i3++;
                }
                i2 = i7 + 1;
            }
            double d = Double.MAX_VALUE;
            if (i3 == 0) {
                double d2 = 1280.0d;
                int i8 = -1;
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    double dAbs = Math.abs(((enx) arrayList2.get(i9)).b() - 1280);
                    if (dAbs < d2) {
                        d2 = dAbs;
                    }
                    if (dAbs < d2) {
                        i8 = i9;
                    }
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = i8;
                }
            }
            double d3 = Double.MAX_VALUE;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (iArr[i11] >= 0) {
                    double dAbs2 = Math.abs(((enx) arrayList.get(i11)).b() - 3000);
                    double dAbs3 = Math.abs((((enx) arrayList.get(i11)).b() / ((enx) arrayList.get(i11)).a()) - 1.3333333333333333d);
                    if (i < 0 || dAbs2 < d3 || (dAbs2 == d3 && dAbs3 < d)) {
                        i = i11;
                        d = dAbs3;
                        d3 = dAbs2;
                    }
                }
            }
            if (d > 0.03d) {
                double d4 = d3;
                double d5 = d;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (iArr[i12] >= 0) {
                        double dAbs4 = Math.abs((((enx) arrayList.get(i12)).b() / ((enx) arrayList.get(i12)).a()) - 1.3333333333333333d);
                        double dAbs5 = Math.abs(((enx) arrayList.get(i12)).b() - 3000);
                        if (dAbs4 + 0.03d < d5) {
                            double dAbs6 = Math.abs(((enx) arrayList.get(i12)).b() - 3000);
                            if (dAbs6 < 1050.0d) {
                                d5 = dAbs4;
                            }
                            if (dAbs6 < 1050.0d) {
                                d4 = dAbs5;
                            }
                            if (dAbs6 < 1050.0d) {
                                i = i12;
                            }
                        } else if (Math.abs(dAbs4 - d5) < 0.03d && dAbs5 < d4) {
                            i = i12;
                            d5 = dAbs4;
                            d4 = dAbs5;
                        }
                    }
                }
            }
            int i13 = iArr[i];
            enx enxVar = (enx) arrayList.get(i);
            enxVar.b();
            enxVar.a();
            a = new jod((enx) arrayList2.get(i13), (enx) arrayList.get(i), (byte[]) null);
        }
        return a;
    }
}
