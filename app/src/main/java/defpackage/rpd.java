package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpd extends rnt {
    public rpd() {
        super(null);
    }

    private static float bm(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    private static float bn(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.rnt
    public final void m(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fBn;
        float fBm;
        RectF rectFL = l(tabLayout, view);
        RectF rectFL2 = l(tabLayout, view2);
        if (rectFL.left < rectFL2.left) {
            fBn = bm(f);
            fBm = bn(f);
        } else {
            fBn = bn(f);
            fBm = bm(f);
        }
        drawable.setBounds(rhn.b((int) rectFL.left, (int) rectFL2.left, fBn), drawable.getBounds().top, rhn.b((int) rectFL.right, (int) rectFL2.right, fBm), drawable.getBounds().bottom);
    }
}
