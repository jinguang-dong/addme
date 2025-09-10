package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fvb extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final AnimatorSet c;
    public final AnimatorSet d;
    public final Interpolator e;
    public final Interpolator f;
    public AnimatorSet g;
    private final LinearLayout h;

    public fvb(Context context) {
        super(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.autotimer_tutorial_layout, this);
        ocq ocqVarK = ocq.k(this);
        this.h = (LinearLayout) ocqVarK.c(R.id.autotimer_tutorial_text_container);
        this.a = (TextView) ocqVarK.c(R.id.autotimer_tutorial_text_title);
        this.b = (TextView) ocqVarK.c(R.id.autotimer_tutorial_text_body);
        this.c = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.autotimer_tutorial_text_show);
        this.d = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.autotimer_tutorial_text_hide);
        this.e = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_slow_in);
        this.f = AnimationUtils.loadInterpolator(context, android.R.interpolator.linear_out_slow_in);
        int i = context.getResources().getConfiguration().orientation;
        b();
    }

    final void b() {
        ((FrameLayout.LayoutParams) this.h.getLayoutParams()).gravity = 17;
        forceLayout();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        b();
    }
}
