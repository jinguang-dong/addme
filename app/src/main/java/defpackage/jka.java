package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jka extends jjx {
    public static final sgv c = sgv.g("jka");
    public final owq e;
    public our g;
    public final mdy h;
    public final mwq i;
    private final out j;
    private final owf k;
    private View l;
    public final cwq d = new cwq(false);
    public final AtomicBoolean f = new AtomicBoolean();

    public jka(out outVar, owf owfVar, owq owqVar, mdy mdyVar, mwq mwqVar) {
        this.j = outVar;
        this.k = owfVar;
        this.e = owqVar;
        this.h = mdyVar;
        this.i = mwqVar;
    }

    public static float i(float f) {
        return Math.round(ske.aj(f, 0.0f, 1.0f) * 100.0f);
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.f.compareAndSet(false, true)) {
            throw new IllegalStateException("Cannot bind multiple times.");
        }
        this.l = view;
        our ourVar = new our();
        this.g = ourVar;
        ourVar.d(this.k.dK(new jjl(this, 2), this.j));
        return new iew(this, 8);
    }

    @Override // defpackage.jjv
    public final void d() {
        this.l.setVisibility(8);
    }

    @Override // defpackage.jjv
    public final void e() {
        this.d.h(false);
        owq owqVar = this.e;
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.j = Optional.empty();
        owqVar.a(jjpVar);
        nhz nhzVar = this.a;
        if (nhzVar != null) {
            nhzVar.g(0.75f, false, niz.a);
            j();
        }
    }

    @Override // defpackage.jjx, defpackage.jjv
    public final void g() {
        super.g();
        this.l.setVisibility(0);
        j();
    }

    @Override // defpackage.jjx
    protected final nhz h() throws Resources.NotFoundException {
        Resources resources = this.l.getResources();
        ComposeView composeView = (ComposeView) this.l.findViewById(R.id.blur_controls_slider);
        scn scnVarK = scn.K(0, 5, 10, 15, 20);
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.blur_slider_tick_spacing);
        int i = sbp.d;
        sbp sbpVar = sex.a;
        Context context = this.l.getContext();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.blur_slider_circle_icon_size);
        nhx nhxVar = new nhx(R.drawable.gs_circle_fill1_vd_theme_24, context.getString(R.string.decrease_blur), new Size(dimensionPixelOffset, dimensionPixelOffset), ojl.aO(this.l));
        Context context2 = this.l.getContext();
        int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.blur_slider_blur_icon_size);
        nhz nhzVar = new nhz(composeView, new nhy(21, scnVarK, dimensionPixelSize, 0.75f, true, 3, sbpVar, nhxVar, new nhx(R.drawable.gs_blur_on_fill1_vd_theme_24, context2.getString(R.string.increase_blur), new Size(dimensionPixelOffset2, dimensionPixelOffset2), ojl.aO(this.l)), new gvx(this, 6)), new nhw(R.drawable.gs_restart_alt_vd_theme_48, resources.getString(R.string.reset_blue_button_desc), new jkc(this, 1), this.d), this.b);
        nhzVar.c(new jkb(this, 1));
        return nhzVar;
    }

    public final void j() {
        nhz nhzVar = this.a;
        nhzVar.getClass();
        nhzVar.e(Integer.toString((int) i(nhzVar.a())));
    }
}
