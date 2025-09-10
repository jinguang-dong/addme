package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.ui.views.GradientBar;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final nlb i;
    public final nlb j;
    public final nlb k;
    public final nlb l;
    public final View m;
    private final int n;
    private final int o;
    private final GradientBar p;
    private final GradientDrawable q;

    public lrb(fvu fvuVar, qqq qqqVar, GradientBar gradientBar, mwq mwqVar, hbj hbjVar) {
        out.a();
        View view = (View) ((ocq) mwqVar.b).c(R.id.activity_root_view);
        this.m = view;
        Resources resources = view.getResources();
        if (hbjVar.p(gzo.an)) {
            this.n = cmg.e(((Integer) hbjVar.a(gzo.g).get()).intValue(), 255);
        } else {
            gzi gziVar = gzo.f;
            this.n = cmg.e(((Integer) hbjVar.a(gziVar).get()).intValue(), 255);
            cmg.e(((Integer) hbjVar.a(gziVar).get()).intValue(), 204);
        }
        this.a = resources.getColor(R.color.main_layout_background_color, null);
        this.o = resources.getColor(R.color.selfie_flash_warmer_color, null);
        this.b = qpt.P(view, R.attr.colorSecondary);
        this.d = qpt.P(view, R.attr.colorOnSecondary);
        this.f = hbjVar.p(gzo.bw) ? -1 : qpt.P(view, R.attr.colorOnSurface);
        this.c = resources.getColor(R.color.mode_chip_selfieflash_color, null);
        this.e = resources.getColor(R.color.mode_chip_text_selfieflash_color_selected, null);
        this.g = resources.getColor(R.color.mode_chip_text_selfieflash_color_unselected, null);
        this.q = (GradientDrawable) gradientBar.getBackground();
        this.i = new nac(gradientBar, 3);
        ModeSwitcher modeSwitcher = (ModeSwitcher) qqqVar.b;
        nae naeVar = modeSwitcher.b;
        this.j = new naf(modeSwitcher, new nac(naeVar, 1));
        this.k = new nac(naeVar, 0);
        this.l = new nac(naeVar, 2);
        this.p = gradientBar;
        this.h = fvuVar.a.getHeight() * fvuVar.a.getWidth();
    }

    public final int a(boolean z) {
        return z ? this.o : this.n;
    }

    public final void b() {
        this.j.a(this.b);
        this.k.a(this.d);
        this.l.a(this.f);
        this.m.setBackgroundColor(this.a);
        this.p.setBackground(this.q);
    }
}
