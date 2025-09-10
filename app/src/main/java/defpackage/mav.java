package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.ar.core.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mav {
    public final int a;
    public boolean b;
    public mxj c;
    private AnimatorSet d;

    public mav(dx dxVar) {
        int i = szh.a;
        this.c = mxj.PHONE_LAYOUT;
        this.a = dxVar.getResources().getInteger(R.integer.social_anim_duration_default);
    }

    public final void a(List list) {
        if (this.b) {
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null && animatorSet.isStarted()) {
                this.d.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            animatorSet2.playSequentially((List<Animator>) list);
            this.d.start();
        }
    }
}
