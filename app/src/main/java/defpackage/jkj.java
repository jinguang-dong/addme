package defpackage;

import android.content.res.Resources;
import android.util.Size;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jkj extends jjx implements lij {
    public static final sgv c = sgv.g("jkj");
    public final owq f;
    public final owq g;
    public final owq h;
    public final owq i;
    public final nas j;
    public our k;
    public final jkh l;
    public final mdy m;
    public final mwq n;
    private View o;
    private View p;
    private final out q;
    private final owf r;
    public final AtomicBoolean d = new AtomicBoolean();
    public final cwq e = new cwq(false);
    private boolean s = true;
    private boolean t = false;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, owq] */
    public jkj(qrh qrhVar, jkh jkhVar, out outVar, owf owfVar, owq owqVar, owq owqVar2, nas nasVar, mdy mdyVar, mwq mwqVar) {
        this.l = jkhVar;
        this.f = qrhVar.d;
        this.q = outVar;
        this.r = owfVar;
        this.h = owqVar;
        this.i = owqVar2;
        this.g = qrhVar.f;
        this.j = nasVar;
        this.m = mdyVar;
        this.n = mwqVar;
    }

    private final float k(float f) {
        return (f - ((laj) this.h.dL()).b) / i();
    }

    @Override // defpackage.jjv
    public final void d() {
        this.t = false;
        this.o.setVisibility(8);
        View view = this.p;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.jjv
    public final void e() {
        this.l.b(false);
        this.f.a(false);
        this.g.a(0);
        owq owqVar = this.i;
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.i = Optional.empty();
        owqVar.a(jjpVar);
        nhz nhzVar = this.a;
        if (nhzVar != null) {
            nhzVar.g(k(0.0f), false, niz.a);
        }
    }

    @Override // defpackage.jjx, defpackage.jjv
    public final void g() {
        super.g();
        this.t = true;
        View view = this.p;
        if (view != null) {
            Resources resources = view.getResources();
            View view2 = this.p;
            lpa.g(view2, R.string.exposure_disable_string, R.string.exposure_toast_reset, resources.getString(R.string.exposure_toast_reset_desc));
            this.p = view2;
        }
        if (this.s) {
            nhz nhzVar = this.a;
            nhzVar.getClass();
            ovx ovxVar = (ovx) this.g;
            nhzVar.g(k(((Integer) ovxVar.d).intValue()), false, niz.a);
            if (((Integer) ovxVar.d).intValue() == 0) {
                e();
            }
        }
        this.o.setVisibility(true != this.s ? 8 : 0);
        View view3 = this.p;
        if (view3 != null) {
            view3.setVisibility(true != this.s ? 0 : 8);
        }
    }

    @Override // defpackage.jjx
    protected final nhz h() throws Resources.NotFoundException {
        Resources resources = this.o.getResources();
        ComposeView composeView = (ComposeView) this.o.findViewById(R.id.exposure_controls_slider);
        scn scnVarL = scn.L(0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40);
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.pro_slider_tick_spacing);
        int i = sbp.d;
        sbp sbpVar = sex.a;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.exposure_slider_icon_size);
        nhx nhxVar = new nhx(R.drawable.gs_ev_shadow_vd_theme_24, resources.getString(R.string.decrease_exposure), new Size(dimensionPixelOffset, dimensionPixelOffset), ojl.aO(this.o));
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.exposure_slider_icon_size);
        nhz nhzVar = new nhz(composeView, new nhy(41, scnVarL, dimensionPixelSize, 0.5f, false, 3, sbpVar, nhxVar, new nhx(R.drawable.gs_brightness_high_vd_theme_24, resources.getString(R.string.increase_exposure), new Size(dimensionPixelOffset2, dimensionPixelOffset2), ojl.aO(this.o)), new gvx(this, 13), false, 1, new gvx(resources, 14)), new nhw(R.drawable.icon_reset_exposure, resources.getString(R.string.auto_exposure_button_desc), new jkc(this, 4), this.e), this.b);
        nhzVar.c(new jkb(this, 4));
        return nhzVar;
    }

    public final int i() {
        owq owqVar = this.h;
        return ((laj) owqVar.dL()).c - ((laj) owqVar.dL()).b;
    }

    @Override // defpackage.lij
    public final void j(boolean z) {
        this.s = z;
        if (this.t) {
            g();
        }
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.d.compareAndSet(false, true)) {
            throw new IllegalStateException(JvFFEwFNdCrxf.NVbBr);
        }
        this.o = view;
        this.p = view.getRootView().findViewById(R.id.disabled_controls);
        our ourVar = new our();
        this.k = ourVar;
        owf owfVarA = owb.a(this.f);
        jjl jjlVar = new jjl(this, 4);
        out outVar = this.q;
        ourVar.d(owfVarA.dK(jjlVar, outVar));
        this.k.d(owl.h(this.r, new hia(18)).dK(new jjl(this, 5), outVar));
        return new iew(this, 10);
    }
}
