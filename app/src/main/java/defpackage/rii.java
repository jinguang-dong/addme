package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rii implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rii(clc clcVar, View view, int i) {
        this.c = i;
        this.a = clcVar;
        this.b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.c;
        if (i == 0) {
            if (z) {
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.a;
                if (hideBottomViewOnScrollBehavior.b()) {
                    hideBottomViewOnScrollBehavior.a((View) this.b);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            kox koxVar = (kox) ((oww) this.a).dL();
            ftv ftvVar = (ftv) this.b;
            ftvVar.c.a(Boolean.valueOf(ftv.q(koxVar, (ltw) ftvVar.e.dL(), (jjq) ftvVar.i.dL(), z)));
            return;
        }
        if (z) {
            HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.a;
            if (hideViewOnScrollBehavior.c()) {
                hideViewOnScrollBehavior.b((View) this.b);
            }
        }
    }

    public /* synthetic */ rii(ftv ftvVar, kow kowVar, int i) {
        this.c = i;
        this.b = ftvVar;
        this.a = kowVar;
    }
}
