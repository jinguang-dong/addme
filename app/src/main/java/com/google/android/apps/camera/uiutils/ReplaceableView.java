package com.google.android.apps.camera.uiutils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ReplaceableView extends View {
    public ReplaceableView(Context context) {
        super(context);
    }

    public final void a(View view) {
        getParent().getClass();
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeView(this);
        viewGroup.addView(view, iIndexOfChild);
    }

    public ReplaceableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
