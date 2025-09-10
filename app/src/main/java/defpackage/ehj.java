package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehj extends ehk {
    public ehj(List list) {
        super(list);
    }

    @Override // defpackage.ehd
    public final /* bridge */ /* synthetic */ Object f(elo eloVar, float f) {
        return Integer.valueOf(k(eloVar, f));
    }

    public final int k(elo eloVar, float f) {
        float f2;
        Object obj = eloVar.b;
        if (obj == null || eloVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        elq elqVar = this.d;
        if (elqVar != null) {
            f2 = f;
            Integer num = (Integer) elqVar.b(eloVar.g, eloVar.h.floatValue(), (Integer) obj, (Integer) eloVar.c, f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        int iIntValue = eloVar.k;
        if (iIntValue == 784923401) {
            iIntValue = ((Integer) obj).intValue();
            eloVar.k = iIntValue;
        }
        int iIntValue2 = eloVar.l;
        if (iIntValue2 == 784923401) {
            iIntValue2 = ((Integer) eloVar.c).intValue();
            eloVar.l = iIntValue2;
        }
        PointF pointF = eli.a;
        return (int) (iIntValue + (f2 * (iIntValue2 - iIntValue)));
    }
}
