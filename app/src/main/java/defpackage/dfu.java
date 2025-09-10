package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dfu extends Property {
    public dfu(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        dgb dgbVar = (dgb) obj;
        PointF pointF = (PointF) obj2;
        dgbVar.a = Math.round(pointF.x);
        dgbVar.b = Math.round(pointF.y);
        int i = dgbVar.e + 1;
        dgbVar.e = i;
        if (i == dgbVar.f) {
            dgbVar.a();
        }
    }
}
