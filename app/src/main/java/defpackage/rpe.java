package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpe extends rnt {
    public rpe() {
        super(null);
    }

    @Override // defpackage.rnt
    public final void m(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFL = l(tabLayout, view);
        float fA = f < 0.5f ? rhn.a(1.0f, 0.0f, 0.0f, 0.5f, f) : rhn.a(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFL.left, drawable.getBounds().top, (int) rectFL.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fA * 255.0f));
    }
}
