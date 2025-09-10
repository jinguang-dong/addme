package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dis extends AmbientLifecycleObserver.AmbientLifecycleCallback.CC {
    final /* synthetic */ ViewPager2 a;

    public dis(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.CC
    public final void c(int i) {
        ViewPager2 viewPager2 = this.a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.e.requestFocus(2);
        }
    }
}
