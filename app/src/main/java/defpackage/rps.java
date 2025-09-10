package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserver;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rps extends AmbientLifecycleObserver.AmbientLifecycleCallback.CC {
    private final WeakReference a;
    private int c = 0;
    private int b = 0;

    public rps(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.CC
    public final void a(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.B = this.c;
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.CC
    public final void b(int i, float f, int i2) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z2 = true;
            if (i3 != 2 || this.b == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.m(i, f, z2, z, false);
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.CC
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.a() == i || i >= tabLayout.b()) {
            return;
        }
        int i2 = this.c;
        boolean z = true;
        if (i2 != 0 && (i2 != 2 || this.b != 0)) {
            z = false;
        }
        tabLayout.k(tabLayout.c(i), z);
    }
}
