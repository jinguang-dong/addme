package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dfv extends Property {
    public dfv(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        dgb dgbVar = (dgb) obj;
        PointF pointF = (PointF) obj2;
        dgbVar.c = Math.round(pointF.x);
        dgbVar.d = Math.round(pointF.y);
        int i = dgbVar.f + 1;
        dgbVar.f = i;
        if (dgbVar.e == i) {
            dgbVar.a();
        }
    }
}
