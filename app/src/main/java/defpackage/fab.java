package defpackage;

import android.view.ViewTreeObserver;
import androidx.wear.ambient.AmbientDelegate;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fab implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public fab(AmbientDelegate ambientDelegate) {
        this.a = new WeakReference(ambientDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AmbientDelegate ambientDelegate = (AmbientDelegate) this.a.get();
        if (ambientDelegate == null) {
            return true;
        }
        ?? r0 = ambientDelegate.b;
        if (r0.isEmpty()) {
            return true;
        }
        int iU = ambientDelegate.u();
        int iT = ambientDelegate.t();
        if (!AmbientDelegate.w(iU, iT)) {
            return true;
        }
        ArrayList arrayList = new ArrayList((Collection) r0);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ezt) arrayList.get(i)).e(iU, iT);
        }
        ambientDelegate.v();
        return true;
    }
}
