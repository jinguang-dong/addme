package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearSnapshot {
    public static final /* synthetic */ int b = 0;
    private static final Rect c = new Rect();
    public final BitmapDrawable a;
    private final View d;

    public WearSnapshot(BitmapDrawable bitmapDrawable, View view) {
        this.d = view;
        this.a = bitmapDrawable;
    }

    public final ViewOverlay a() {
        return ((View) this.d.getParent()).getOverlay();
    }

    public final void b() {
        a().remove(this.a);
    }

    public int getAlpha() {
        return this.a.getAlpha();
    }

    public void setAlpha(int i) {
        BitmapDrawable bitmapDrawable = this.a;
        bitmapDrawable.setAlpha(i);
        View view = this.d;
        Rect rect = c;
        view.getHitRect(rect);
        int i2 = rect.top;
        int iWidth = rect.left;
        int i3 = rect.right;
        bitmapDrawable.copyBounds(rect);
        if (view.getLayoutDirection() == 1) {
            iWidth = i3 - rect.width();
        }
        rect.offsetTo(iWidth, i2);
        bitmapDrawable.setBounds(rect);
    }
}
