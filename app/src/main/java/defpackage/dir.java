package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dir extends AmbientLifecycleObserver.AmbientLifecycleCallback.CC {
    final /* synthetic */ ViewPager2 a;

    public dir(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.CC
    public final void a(int i) {
        if (i == 0) {
            this.a.f();
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.CC
    public final void c(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.b != i) {
            viewPager2.b = i;
            ((dix) viewPager2.i).e();
        }
    }
}
