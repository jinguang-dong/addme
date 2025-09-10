package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpu {
    public final TabLayout a;
    public final ViewPager2 b;
    public ki c;
    public boolean d;
    public rps e;
    public rpj f;
    public byi g;
    private final rpr h;

    public rpu(TabLayout tabLayout, ViewPager2 viewPager2, rpr rprVar) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.h = rprVar;
    }

    public final void a() {
        TabLayout tabLayout = this.a;
        tabLayout.i();
        ki kiVar = this.c;
        if (kiVar != null) {
            int iA = kiVar.a();
            for (int i = 0; i < iA; i++) {
                rpn rpnVarD = tabLayout.d();
                this.h.a(rpnVarD, i);
                tabLayout.g(rpnVarD, false);
            }
            if (iA > 0) {
                int iMin = Math.min(this.b.b, tabLayout.b() - 1);
                if (iMin != tabLayout.a()) {
                    tabLayout.j(tabLayout.c(iMin));
                }
            }
        }
    }
}
