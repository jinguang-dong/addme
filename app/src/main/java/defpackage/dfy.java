package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dfy extends Property {
    public dfy(Class cls) {
        super(cls, "position");
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
        int width = view.getWidth() + iRound;
        int height = view.getHeight() + iRound2;
        int i = dhc.b;
        view.setLeftTopRightBottom(iRound, iRound2, width, height);
    }
}
