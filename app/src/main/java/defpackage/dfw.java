package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dfw extends Property {
    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int left = view.getLeft();
        int top = view.getTop();
        int iRound = Math.round(pointF.x);
        int iRound2 = Math.round(pointF.y);
        int i = dhc.b;
        view.setLeftTopRightBottom(left, top, iRound, iRound2);
    }

    public dfw(Class cls) {
        super(cls, PNlJufQ.ytMMfjM);
    }
}
