package com.android.settingslib.collapsingtoolbar.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScrollableToolbarItemLayout extends HorizontalScrollView {
    private final LinearLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableToolbarItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        new ArrayList();
        setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout);
    }
}
