package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mnk extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ Context b;

    public mnk(ViewGroup viewGroup, Context context) {
        this.a = viewGroup;
        this.b = context;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        viewGroup.getMeasuredHeight();
        Context context = this.b;
        viewGroup.setLayoutParams(new LinearLayout.LayoutParams(context.getResources().getInteger(R.integer.bottom_sheet_layout_width), context.getResources().getInteger(R.integer.bottom_sheet_layout_height)));
        viewGroup.getMeasuredHeight();
    }
}
