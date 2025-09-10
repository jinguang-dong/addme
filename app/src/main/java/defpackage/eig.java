package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eig extends eiq {
    public eig(List list) {
        for (int i = 0; i < list.size(); i++) {
            elo eloVar = (elo) list.get(i);
            jod jodVar = (jod) eloVar.b;
            jod jodVar2 = (jod) eloVar.c;
            if (jodVar != null && jodVar2 != null) {
                Object obj = jodVar.a;
                int length = ((float[]) obj).length;
                Object obj2 = jodVar2.a;
                int length2 = ((float[]) obj2).length;
                if (length != length2) {
                    int i2 = length + length2;
                    float[] fArr = new float[i2];
                    System.arraycopy(obj, 0, fArr, 0, length);
                    System.arraycopy(obj2, 0, fArr, length, length2);
                    Arrays.sort(fArr);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        float f2 = fArr[i4];
                        if (f2 != f) {
                            fArr[i3] = f2;
                            i3++;
                            f = fArr[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, i3);
                    eloVar = new elo(jodVar.A(fArrCopyOfRange), jodVar2.A(fArrCopyOfRange));
                }
            }
            list.set(i, eloVar);
        }
        super(list);
    }

    @Override // defpackage.eip
    public final ehd a() {
        return new ehi(this.a);
    }
}
