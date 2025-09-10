package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.LinearLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BannerMessageView extends LinearLayout {
    private Rect a;

    public BannerMessageView(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a != null) {
            return;
        }
        View viewFindViewById = findViewById(R.id.top_row);
        View viewFindViewById2 = findViewById(R.id.banner_dismiss_btn);
        if (viewFindViewById == null || viewFindViewById2 == null || viewFindViewById2.getVisibility() != 0) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.settingslib_preferred_minimum_touch_target);
        int width = viewFindViewById2.getWidth();
        int height = viewFindViewById2.getHeight();
        int i5 = width < dimensionPixelSize ? dimensionPixelSize - width : 0;
        int i6 = height < dimensionPixelSize ? dimensionPixelSize - height : 0;
        Rect rect = new Rect();
        viewFindViewById2.getHitRect(rect);
        Rect rect2 = new Rect();
        viewFindViewById.getHitRect(rect2);
        Rect rect3 = new Rect();
        this.a = rect3;
        rect3.left = rect2.left + rect.left;
        this.a.right = rect2.left + rect.right;
        this.a.top = rect2.top + rect.top;
        this.a.bottom = rect2.top + rect.bottom;
        this.a.left -= i5 % 2 == 1 ? (i5 / 2) + 1 : i5 / 2;
        this.a.top -= i6 % 2 == 1 ? (i6 / 2) + 1 : i6 / 2;
        this.a.right += i5 / 2;
        this.a.bottom += i6 / 2;
        setTouchDelegate(new TouchDelegate(this.a, viewFindViewById2));
    }

    public BannerMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BannerMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BannerMessageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
