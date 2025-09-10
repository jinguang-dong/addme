package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rhu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Drawable b;
    private final /* synthetic */ int c;

    public /* synthetic */ rhu(AppBarLayout appBarLayout, rnx rnxVar, int i) {
        this.c = i;
        this.a = appBarLayout;
        this.b = rnxVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.c;
        if (i == 0) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((rnx) this.b).l(fFloatValue);
            AppBarLayout appBarLayout = (AppBarLayout) this.a;
            Drawable drawable = appBarLayout.i;
            if (drawable instanceof rnx) {
                ((rnx) drawable).l(fFloatValue);
            }
            Iterator it = appBarLayout.g.iterator();
            while (it.hasNext()) {
                ((rhy) it.next()).a();
            }
            Iterator it2 = appBarLayout.h.iterator();
            while (it2.hasNext()) {
                ((rhz) it2.next()).a();
            }
            return;
        }
        if (i == 1) {
            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            dfs dfsVar = (dfs) this.a;
            dft.d(fFloatValue2, dfsVar);
            dft dftVar = (dft) this.b;
            dftVar.a(fFloatValue2, dfsVar, false);
            dftVar.invalidateSelf();
            return;
        }
        rlx rlxVar = (rlx) this.a;
        if (!rlxVar.c(true) || rlxVar.m == 0) {
            return;
        }
        rml rmlVar = (rml) this.b;
        if (rmlVar.isVisible()) {
            rmlVar.invalidateSelf();
        }
    }

    public rhu(dft dftVar, dfs dfsVar, int i) {
        this.c = i;
        this.b = dftVar;
        this.a = dfsVar;
    }

    public /* synthetic */ rhu(rml rmlVar, rlx rlxVar, int i) {
        this.c = i;
        this.b = rmlVar;
        this.a = rlxVar;
    }
}
