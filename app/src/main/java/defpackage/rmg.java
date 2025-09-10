package defpackage;

import android.animation.TimeInterpolator;
import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmg extends Property {
    public rmg(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = rmi.a;
        return Float.valueOf(((rmi) obj).f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        rmi rmiVar = (rmi) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        rmiVar.f = fFloatValue;
        float f = fFloatValue * 6000.0f;
        List list = rmiVar.k;
        rmq rmqVar = (rmq) list.get(0);
        float f2 = rmiVar.f * 1080.0f;
        int[] iArr = rmi.a;
        int length = iArr.length;
        int i2 = 0;
        float interpolation = 0.0f;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            interpolation += rmiVar.c.getInterpolation(rmi.h(i, iArr[i2], 500)) * 90.0f;
            i2++;
        }
        rmqVar.g = f2 + interpolation;
        TimeInterpolator timeInterpolator = rmiVar.c;
        float interpolation2 = timeInterpolator.getInterpolation(rmi.h(i, 0, 3000)) - timeInterpolator.getInterpolation(rmi.h(i, 3000, 3000));
        rmqVar.a = 0.0f;
        float[] fArr = rmi.b;
        float fO = qsy.o(fArr[0], fArr[1], interpolation2);
        rmqVar.b = fO;
        float f3 = rmiVar.g;
        if (f3 > 0.0f) {
            rmqVar.b = fO * (1.0f - f3);
        }
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            if (i3 >= 4) {
                break;
            }
            float fH = rmi.h(i, iArr[i3], 100);
            if (fH >= 0.0f && fH <= 1.0f) {
                int i4 = i3 + rmiVar.e;
                int[] iArr2 = rmiVar.d.e;
                int length3 = iArr2.length;
                int i5 = i4 % length3;
                int i6 = (i5 + 1) % length3;
                int i7 = iArr2[i5];
                int i8 = iArr2[i6];
                ((rmq) list.get(0)).c = rho.a(timeInterpolator.getInterpolation(fH), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        rmiVar.j.invalidateSelf();
    }
}
