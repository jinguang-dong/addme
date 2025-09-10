package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpn {
    public Object a;
    public CharSequence b;
    public CharSequence c;
    public View e;
    public TabLayout g;
    public rpp h;
    public int d = -1;
    public final int f = 1;
    public int i = -1;

    public final void b() {
        rpp rppVar = this.h;
        if (rppVar != null) {
            rppVar.b();
        }
    }

    public final void c(int i) {
        TabLayout tabLayout = this.g;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        d(tabLayout.getResources().getText(i));
    }

    public final void d(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
            this.h.setContentDescription(charSequence);
        }
        this.b = charSequence;
        b();
    }

    public final void a() {
        TabLayout tabLayout = this.g;
        if (tabLayout == null) {
            throw new IllegalArgumentException(oUZhwRhE.yRwUfVoRdTss);
        }
        tabLayout.j(this);
    }
}
