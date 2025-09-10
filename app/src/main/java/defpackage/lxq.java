package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.smarts.SmartsChipView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxq extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    public final /* synthetic */ SmartsChipView b;

    public lxq(SmartsChipView smartsChipView, int i) {
        this.a = i;
        this.b = smartsChipView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SmartsChipView smartsChipView = this.b;
        if (smartsChipView.getVisibility() != 0 && this.a == 0 && !smartsChipView.a.isAccessibilityFocused()) {
            smartsChipView.postDelayed(new lmw(this, 15), 100L);
        }
        smartsChipView.setVisibility(this.a);
    }
}
