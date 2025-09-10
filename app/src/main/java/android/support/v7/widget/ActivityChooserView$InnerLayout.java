package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.pmg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    private static final int[] a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        pmg pmgVarI = pmg.I(context, attributeSet, a);
        setBackgroundDrawable(pmgVarI.z(0));
        pmgVarI.D();
    }
}
