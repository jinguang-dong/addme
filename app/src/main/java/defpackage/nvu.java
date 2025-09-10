package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearSnapshot;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nvu extends AnimatorListenerAdapter {
    private final WearSnapshot a;

    public nvu(WearSnapshot wearSnapshot) {
        this.a = wearSnapshot;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        WearSnapshot wearSnapshot = this.a;
        BitmapDrawable bitmapDrawable = wearSnapshot.a;
        bitmapDrawable.getBitmap().prepareToDraw();
        wearSnapshot.a().add(bitmapDrawable);
    }
}
