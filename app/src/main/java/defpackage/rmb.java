package defpackage;

import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmb extends Property {
    public rmb(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = rmd.a;
        return Float.valueOf(((rmd) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        rmd rmdVar = (rmd) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        rmdVar.g = fFloatValue;
        float f = fFloatValue * 5400.0f;
        List list = rmdVar.k;
        rmq rmqVar = (rmq) list.get(0);
        float f2 = rmdVar.g * 1520.0f;
        rmqVar.a = (-20.0f) + f2;
        rmqVar.b = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            float fH = rmd.h(i, rmd.a[i2], 667);
            float f3 = rmqVar.b;
            cvn cvnVar = rmdVar.d;
            rmqVar.b = f3 + (cvnVar.getInterpolation(fH) * 250.0f);
            rmqVar.a += cvnVar.getInterpolation(rmd.h(i, rmd.b[i2], 667)) * 250.0f;
            i2++;
        }
        float f4 = rmqVar.a;
        float f5 = rmqVar.b;
        float f6 = f4 + ((f5 - f4) * rmdVar.h);
        rmqVar.a = f6;
        rmqVar.a = f6 / 360.0f;
        rmqVar.b = f5 / 360.0f;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            float fH2 = rmd.h(i, rmd.c[i3], 333);
            if (fH2 > 0.0f && fH2 < 1.0f) {
                int i4 = i3 + rmdVar.f;
                int[] iArr = rmdVar.e.e;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int i7 = iArr[i5];
                int i8 = iArr[i6];
                ((rmq) list.get(0)).c = rho.a(rmdVar.d.getInterpolation(fH2), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        rmdVar.j.invalidateSelf();
    }
}
