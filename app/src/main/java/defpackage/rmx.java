package defpackage;

import android.util.Property;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmx extends Property {
    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = rmy.f;
        return Float.valueOf(((rmy) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        rmy rmyVar = (rmy) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        rmyVar.e = fFloatValue;
        List list = rmyVar.k;
        ((rmq) list.get(0)).a = 0.0f;
        rmq rmqVar = (rmq) list.get(0);
        rmq rmqVar2 = (rmq) list.get(1);
        cvn cvnVar = rmyVar.a;
        float fH = rmy.h((int) (fFloatValue * 333.0f), 0, 667);
        float interpolation = cvnVar.getInterpolation(fH);
        rmqVar2.a = interpolation;
        rmqVar.b = interpolation;
        rmq rmqVar3 = (rmq) list.get(1);
        rmq rmqVar4 = (rmq) list.get(2);
        float interpolation2 = cvnVar.getInterpolation(fH + 0.49925038f);
        rmqVar4.a = interpolation2;
        rmqVar3.b = interpolation2;
        ((rmq) list.get(2)).b = 1.0f;
        if (rmyVar.d && ((rmq) list.get(1)).b < 1.0f) {
            ((rmq) list.get(2)).c = ((rmq) list.get(1)).c;
            ((rmq) list.get(1)).c = ((rmq) list.get(0)).c;
            ((rmq) list.get(0)).c = rmyVar.b.e[rmyVar.c];
            rmyVar.d = false;
        }
        rmyVar.j.invalidateSelf();
    }

    public rmx(Class cls) {
        super(cls, HHdu.pTwlCgxbge);
    }
}
