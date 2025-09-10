package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dfx extends Property {
    public dfx(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int iRound = Math.round(pointF.x);
        int iRound2 = Math.round(pointF.y);
        int right = view.getRight();
        int bottom = view.getBottom();
        int i = dhc.b;
        view.setLeftTopRightBottom(iRound, iRound2, right, bottom);
    }
}
