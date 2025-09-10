package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgc extends dgp {
    private static final String[] u = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property v = new dfu(PointF.class);
    private static final Property w = new dfv(PointF.class);
    private static final Property x = new dfw(PointF.class);
    private static final Property y = new dfx(PointF.class);
    private static final Property z = new dfy(PointF.class);

    private static final void f(dgy dgyVar) {
        View view = dgyVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        Map map = dgyVar.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", dgyVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    @Override // defpackage.dgp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.dgy r21, defpackage.dgy r22) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgc.a(android.view.ViewGroup, dgy, dgy):android.animation.Animator");
    }

    @Override // defpackage.dgp
    public final void b(dgy dgyVar) {
        f(dgyVar);
    }

    @Override // defpackage.dgp
    public final void c(dgy dgyVar) {
        f(dgyVar);
    }

    @Override // defpackage.dgp
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dgp
    public final String[] e() {
        return u;
    }
}
