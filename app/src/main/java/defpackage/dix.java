package defpackage;

import android.R;
import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dix extends AmbientLifecycleObserver.AmbientLifecycleCallback.CC {
    public final /* synthetic */ ViewPager2 a;
    public byi b;
    private final cqe c = new div(this, 1);
    private final cqe d = new div(this, 0);

    public dix(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    public final void d(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.g) {
            viewPager2.e(i, true);
        }
    }

    public final void e() {
        int iA;
        ViewPager2 viewPager2 = this.a;
        int i = R.id.accessibilityActionPageLeft;
        con.h(viewPager2, R.id.accessibilityActionPageLeft);
        con.h(viewPager2, R.id.accessibilityActionPageRight);
        con.h(viewPager2, R.id.accessibilityActionPageUp);
        con.h(viewPager2, R.id.accessibilityActionPageDown);
        if (viewPager2.b() == null || (iA = viewPager2.b().a()) == 0 || !viewPager2.g) {
            return;
        }
        int i2 = iA - 1;
        if (viewPager2.a() != 0) {
            if (viewPager2.b < i2) {
                con.k(viewPager2, new cps(R.id.accessibilityActionPageDown, (CharSequence) null), this.c);
            }
            if (viewPager2.b > 0) {
                con.k(viewPager2, new cps(R.id.accessibilityActionPageUp, (CharSequence) null), this.d);
                return;
            }
            return;
        }
        boolean zG = viewPager2.g();
        int i3 = true != zG ? 16908361 : 16908360;
        if (true == zG) {
            i = 16908361;
        }
        if (viewPager2.b < i2) {
            con.k(viewPager2, new cps(i3, (CharSequence) null), this.c);
        }
        if (viewPager2.b > 0) {
            con.k(viewPager2, new cps(i, (CharSequence) null), this.d);
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.CC
    public final boolean f(int i) {
        return i == 8192 || i == 4096;
    }
}
