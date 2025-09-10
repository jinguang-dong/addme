package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqi extends cnn {
    @Override // defpackage.cnn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.c() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.c());
    }

    @Override // defpackage.cnn
    public final void c(View view, cpt cptVar) {
        int iC;
        super.c(view, cptVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        cptVar.m(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (iC = nestedScrollView.c()) <= 0) {
            return;
        }
        cptVar.x(true);
        if (nestedScrollView.getScrollY() > 0) {
            cptVar.h(cps.n);
            cptVar.h(cps.y);
        }
        if (nestedScrollView.getScrollY() < iC) {
            cptVar.h(cps.m);
            cptVar.h(cps.A);
        }
    }

    @Override // defpackage.cnn
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.w(iMax);
                return true;
            }
            if (i != 16908346) {
                return false;
            }
        }
        int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.c());
        if (iMin == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.w(iMin);
        return true;
    }
}
