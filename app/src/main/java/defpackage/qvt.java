package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qvt extends qvv {
    private final Random b;
    private final long c;
    private final qvh d;
    private final swb e;

    public qvt(uyz uyzVar, Random random, qvh qvhVar, swb swbVar) {
        super(uyzVar);
        this.b = random;
        this.c = uyzVar.c;
        this.d = qvhVar;
        this.e = swbVar;
    }

    @Override // defpackage.qvv
    public final long a(String str) {
        long jSqrt;
        if (rnt.V(str)) {
            jSqrt = this.c;
        } else {
            qvh qvhVar = this.d;
            long epochMilli = this.e.a().toEpochMilli() - qvhVar.d;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long jMin = Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = qvhVar.a;
                    int i2 = (int) jMin;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = qvhVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                qvhVar.d += j * 14400000;
            }
            int iHashCode = str.hashCode() * qvhVar.c;
            char cCharAt = str.isEmpty() ? (char) 0 : str.charAt(0);
            int i3 = iHashCode >>> 24;
            int length = (iHashCode >>> 16) + str.length();
            short[] sArr3 = qvhVar.a;
            short[] sArr4 = qvhVar.b;
            int i4 = (i3 + cCharAt) & 255;
            int i5 = length & 255;
            int iMin = Math.min((int) sArr3[i4], (int) sArr4[i5]);
            int i6 = iMin + 1;
            short sMin = (short) Math.min(32767, i6);
            if (sArr3[i4] == iMin) {
                sArr3[i4] = sMin;
            }
            if (sArr4[i5] == iMin) {
                sArr4[i5] = sMin;
            }
            jSqrt = (int) (this.c / (i6 < 50 ? Math.sqrt(i6) : i6));
        }
        if (this.b.nextDouble() * 1000.0d < jSqrt) {
            return jSqrt;
        }
        return -1L;
    }

    @Override // defpackage.qvv
    public final uyz b(Long l) {
        if (l != null) {
            uyz uyzVar = this.a;
            if (l.longValue() != uyzVar.c) {
                tpc tpcVarM = uyz.a.m();
                int iAw = a.aw(uyzVar.d);
                if (iAw == 0) {
                    iAw = 1;
                }
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uyz uyzVar2 = (uyz) tpcVarM.b;
                uyzVar2.d = iAw - 1;
                uyzVar2.b |= 4;
                long jLongValue = l.longValue();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uyz uyzVar3 = (uyz) tpcVarM.b;
                uyzVar3.b |= 2;
                uyzVar3.c = jLongValue;
                return (uyz) tpcVarM.l();
            }
        }
        return this.a;
    }

    @Override // defpackage.qvv
    public final uyz c(Long l) {
        return d() ? b(l) : e();
    }

    @Override // defpackage.qvv
    public final boolean d() {
        return this.c > 0;
    }
}
