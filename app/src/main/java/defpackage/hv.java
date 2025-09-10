package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hv extends PopupWindow {
    public hv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        pmg pmgVarJ = pmg.J(context, attributeSet, fa.s, i, 0);
        if (pmgVarJ.F(2)) {
            setOverlapAnchor(pmgVarJ.E(2, false));
        }
        setBackgroundDrawable(pmgVarJ.z(0));
        pmgVarJ.D();
    }
}
