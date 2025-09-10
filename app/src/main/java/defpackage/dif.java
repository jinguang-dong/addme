package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dif extends cnn {
    final /* synthetic */ ViewPager a;

    public dif(ViewPager viewPager) {
        this.a = viewPager;
    }

    private final boolean j() {
        dia diaVar = this.a.d;
        return diaVar != null && diaVar.a() > 1;
    }

    @Override // defpackage.cnn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        ViewPager viewPager;
        dia diaVar;
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(j());
        if (accessibilityEvent.getEventType() != 4096 || (diaVar = (viewPager = this.a).d) == null) {
            return;
        }
        accessibilityEvent.setItemCount(diaVar.a());
        accessibilityEvent.setFromIndex(viewPager.e);
        accessibilityEvent.setToIndex(viewPager.e);
    }

    @Override // defpackage.cnn
    public final void c(View view, cpt cptVar) {
        super.c(view, cptVar);
        cptVar.m("androidx.viewpager.widget.ViewPager");
        cptVar.x(j());
        ViewPager viewPager = this.a;
        if (viewPager.canScrollHorizontally(1)) {
            cptVar.g(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            cptVar.g(8192);
        }
    }

    @Override // defpackage.cnn
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (i == 4096) {
            ViewPager viewPager = this.a;
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.h(viewPager.e + 1);
            return true;
        }
        if (i != 8192) {
            return false;
        }
        ViewPager viewPager2 = this.a;
        if (!viewPager2.canScrollHorizontally(-1)) {
            return false;
        }
        viewPager2.h(viewPager2.e - 1);
        return true;
    }
}
