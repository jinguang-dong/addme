package defpackage;

import android.util.Property;
import android.view.animation.Interpolator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rnb extends Property {
    public rnb(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = rnc.a;
        return Float.valueOf(((rnc) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        List list;
        rnc rncVar = (rnc) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        rncVar.g = fFloatValue;
        float f = fFloatValue * 1800.0f;
        int i = 0;
        while (true) {
            list = rncVar.k;
            if (i >= list.size()) {
                break;
            }
            int i2 = (int) f;
            rmq rmqVar = (rmq) list.get(i);
            int[] iArr = rnc.b;
            int i3 = i + i;
            int i4 = iArr[i3];
            int[] iArr2 = rnc.a;
            float fH = rnc.h(i2, i4, iArr2[i3]);
            Interpolator[] interpolatorArr = rncVar.c;
            rmqVar.a = clc.C(interpolatorArr[i3].getInterpolation(fH), 0.0f, 1.0f);
            int i5 = i3 + 1;
            rmqVar.b = clc.C(interpolatorArr[i5].getInterpolation(rnc.h(i2, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
            i++;
        }
        if (rncVar.f) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((rmq) it.next()).c = rncVar.d.e[rncVar.e];
            }
            rncVar.f = false;
        }
        rncVar.j.invalidateSelf();
    }
}
