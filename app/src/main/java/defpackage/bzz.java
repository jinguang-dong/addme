package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.ar.core.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzz implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bzz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.b != 1) {
            return;
        }
        byc bycVar = (byc) this.a;
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = bycVar.e;
        AccessibilityManager accessibilityManager = bycVar.d;
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        accessibilityManager.addTouchExplorationStateChangeListener(bycVar.f);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, uol] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                view.removeOnAttachStateChangeListener(this);
                this.a.s(null);
                return;
            }
            byc bycVar = (byc) this.a;
            bycVar.h.removeCallbacks(bycVar.w);
            AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = bycVar.e;
            AccessibilityManager accessibilityManager = bycVar.d;
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
            accessibilityManager.removeTouchExplorationStateChangeListener(bycVar.f);
            return;
        }
        Object obj = this.a;
        ViewParent parent = ((View) obj).getParent();
        Iterator itA = (parent == null ? ulf.a : new ulh(new jkc(parent, 17), cos.a)).a();
        while (itA.hasNext()) {
            Object obj2 = (ViewParent) itA.next();
            if (obj2 instanceof View) {
                View view2 = (View) obj2;
                view2.getClass();
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null && bool.booleanValue()) {
                    return;
                }
            }
        }
        ((bxg) obj).b();
    }
}
