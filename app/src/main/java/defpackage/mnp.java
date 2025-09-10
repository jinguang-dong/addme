package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.wear.ambient.AmbientMode;
import com.google.android.material.tabs.TabLayout;
import com.google.ar.core.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mnp {
    public final mni c;
    public final Context d;
    public mno e;

    protected mnp(Context context, mni mniVar) {
        this.d = context;
        this.c = mniVar;
    }

    protected final View b() {
        return View.inflate(this.d, R.layout.submode_bottom_sheet, null);
    }

    protected final ViewPager2 c(View view, List list, int i, rpj rpjVar, rpr rprVar) {
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.viewpager2);
        mno mnoVar = new mno(list, i);
        viewPager2.getClass();
        ki kiVar = viewPager2.e.l;
        AmbientLifecycleObserver.AmbientLifecycleCallback.CC cc = viewPager2.i;
        if (kiVar != null) {
            kiVar.n(((dix) cc).b);
        }
        if (kiVar != null) {
            kiVar.n(viewPager2.j);
        }
        viewPager2.e.ab(mnoVar);
        viewPager2.b = 0;
        viewPager2.c();
        dix dixVar = (dix) viewPager2.i;
        dixVar.e();
        mnoVar.m(dixVar.b);
        mnoVar.m(viewPager2.j);
        this.e = mnoVar;
        int i2 = 0;
        while (true) {
            if (i2 >= viewPager2.getChildCount()) {
                break;
            }
            View childAt = viewPager2.getChildAt(i2);
            if (childAt instanceof RecyclerView) {
                ((RecyclerView) childAt).setNestedScrollingEnabled(false);
                break;
            }
            i2++;
        }
        if (i > 1) {
            viewPager2.g = false;
            ((dix) viewPager2.i).e();
        }
        Context context = this.d;
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        tabLayout.getClass();
        ((GradientDrawable) tabLayout.getBackground()).setTint(qpt.au(R.dimen.gm3_sys_elevation_level2, context));
        tabLayout.e(rpjVar);
        rpu rpuVar = new rpu(tabLayout, viewPager2, rprVar);
        if (rpuVar.d) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager22 = rpuVar.b;
        rpuVar.c = viewPager22.b();
        if (rpuVar.c == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        rpuVar.d = true;
        TabLayout tabLayout2 = rpuVar.a;
        rpuVar.e = new rps(tabLayout2);
        viewPager22.a.d(rpuVar.e);
        rpuVar.f = new rpt(viewPager22, 0);
        tabLayout2.e(rpuVar.f);
        rpuVar.g = new rpq(rpuVar);
        rpuVar.c.m(rpuVar.g);
        rpuVar.a();
        tabLayout2.p(viewPager22.b);
        if (list.size() < 2) {
            tabLayout.setVisibility(8);
        }
        return viewPager2;
    }

    public final void d(int i, View view, AmbientMode.AmbientController ambientController) {
        this.c.p(i, -1, view, new fdx(this, 6), ambientController);
    }
}
