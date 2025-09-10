package defpackage;

import java.util.Arrays;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pmu implements pmx {
    private int b = 0;
    private double[] a = new double[5];

    @Override // defpackage.pmx
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = 2147483639;
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                }
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d.doubleValue();
        this.b++;
    }

    @Override // defpackage.pmx
    public final void b(sxy sxyVar, Object[] objArr) {
        int i = 0;
        while (i < this.b) {
            double d = this.a[i];
            Object obj = sxyVar.b;
            obj.getClass();
            pmr pmrVarA = pmr.a(objArr);
            TreeMap treeMap = (TreeMap) ((qas) obj).a;
            pnf pnfVar = (pnf) treeMap.get(pmrVarA);
            if (pnfVar == null) {
                treeMap.put(pmrVarA, new pne(d));
            } else {
                pne pneVar = (pne) pnfVar;
                double d2 = pneVar.a + 1.0d;
                pneVar.a = d2;
                pneVar.e = d;
                if (d < pneVar.b) {
                    pneVar.b = d;
                } else if (d > pneVar.c) {
                    pneVar.c = d;
                }
                pneVar.d = (pneVar.d * (((-1.0d) + d2) / d2)) + (d / d2);
                int i2 = 0;
                while (i2 < 4) {
                    int i3 = i2 + 1;
                    int i4 = i;
                    if (Math.abs(d - pneVar.d) > pneVar.d * 0.25d * i3) {
                        double[] dArr = pneVar.f;
                        dArr[i2] = dArr[i2] + 1.0d;
                    }
                    i2 = i3;
                    i = i4;
                }
            }
            i++;
        }
    }

    public final String toString() {
        return Arrays.toString(this.a);
    }
}
