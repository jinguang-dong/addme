package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserver;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dim extends AmbientLifecycleObserver.AmbientLifecycleCallback.CC {
    private final List a = new ArrayList(3);

    private static final void e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.CC
    public final void a(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((AmbientLifecycleObserver.AmbientLifecycleCallback.CC) it.next()).a(i);
            }
        } catch (ConcurrentModificationException e) {
            e(e);
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.CC
    public final void b(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((AmbientLifecycleObserver.AmbientLifecycleCallback.CC) it.next()).b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            e(e);
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.CC
    public final void c(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((AmbientLifecycleObserver.AmbientLifecycleCallback.CC) it.next()).c(i);
            }
        } catch (ConcurrentModificationException e) {
            e(e);
        }
    }

    public final void d(AmbientLifecycleObserver.AmbientLifecycleCallback.CC cc) {
        this.a.add(cc);
    }
}
