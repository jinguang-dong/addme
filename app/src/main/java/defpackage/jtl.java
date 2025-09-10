package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtl {
    public PreviewOverlay a;
    public nhm b;
    private final View c;
    private final mwq d;

    public jtl(View view, mwq mwqVar) {
        this.c = view;
        this.d = mwqVar;
        d();
    }

    public final void a() {
        nhm nhmVar = this.b;
        AnimatorSet animatorSet = nhmVar.n;
        if (animatorSet != null && animatorSet.isRunning()) {
            nhmVar.n.cancel();
        }
        nhmVar.b();
        this.a.c = true;
    }

    public final void b() {
        this.a.c = false;
    }

    public final void c() {
        this.a.c = true;
    }

    public final void d() {
        ocq ocqVarK = ocq.k(this.c);
        FrameLayout frameLayout = (FrameLayout) ocqVarK.c(R.id.uncovered_preview_layout);
        nhm nhmVar = this.b;
        if (nhmVar != null) {
            frameLayout.removeView(nhmVar);
        }
        this.a = (PreviewOverlay) ocqVarK.c(R.id.preview_overlay);
        nhm nhmVar2 = new nhm(frameLayout.getContext());
        nhmVar2.p = this.d;
        ojl.bl(nhmVar2);
        frameLayout.addView(nhmVar2);
        this.b = nhmVar2;
    }

    public final void e(boolean z) {
        this.b.j = z;
    }

    public final void f(int i) {
        this.b.c(i);
        this.a.c = i >= 100;
    }
}
