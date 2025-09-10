package defpackage;

import android.content.res.Resources;
import android.util.Size;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jkd extends jjx implements lij {
    public static final sgv c = sgv.g("jkd");
    public final owq f;
    public final owq g;
    public final owq h;
    public final jjw i;
    public final owf j;
    public final owq k;
    public our m;
    public final jkh n;
    public final fdq o;
    public final mdy p;
    public final mwq q;
    private View r;
    private View s;
    private final lae t;
    private final out u;
    public final AtomicBoolean d = new AtomicBoolean();
    public final cwq e = new cwq(false);
    public float l = -1.0f;
    private boolean v = true;
    private boolean w = false;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, owq] */
    public jkd(qrh qrhVar, jkh jkhVar, lae laeVar, owq owqVar, out outVar, owf owfVar, jjw jjwVar, fdq fdqVar, mdy mdyVar, mwq mwqVar) {
        this.n = jkhVar;
        this.t = laeVar;
        this.k = owqVar;
        this.u = outVar;
        this.f = qrhVar.c;
        this.g = qrhVar.e;
        this.h = qrhVar.d;
        this.j = owfVar;
        this.i = jjwVar;
        this.o = fdqVar;
        this.p = mdyVar;
        this.q = mwqVar;
    }

    public static float i(float f) {
        return ske.aj(f, 0.0f, 1.0f);
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.d.compareAndSet(false, true)) {
            throw new IllegalStateException("Cannot bind multiple times.");
        }
        this.r = view;
        this.s = view.getRootView().findViewById(R.id.disabled_controls);
        our ourVar = new our();
        this.m = ourVar;
        ourVar.d(owb.a(this.h).dK(new jjl(this, 3), this.u));
        return new iew(this, 9);
    }

    @Override // defpackage.jjv
    public final void d() {
        this.w = false;
        this.r.setVisibility(8);
        View view = this.s;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.jjv
    public final void e() {
        this.n.b(false);
        this.h.a(false);
        owq owqVar = this.g;
        Float fValueOf = Float.valueOf(-1.0f);
        owqVar.a(fValueOf);
        this.f.a(fValueOf);
        nhz nhzVar = this.a;
        if (nhzVar != null) {
            nhzVar.g(i(0.5f), false, niz.a);
        } else {
            ((sgt) c.c().M(2797)).s("Brightness slider not found");
        }
        lae laeVar = this.t;
        laeVar.f();
        laeVar.g();
        owq owqVar2 = this.k;
        jjp jjpVar = (jjp) owqVar2.dL();
        jjpVar.b = Optional.empty();
        jjpVar.e = Optional.empty();
        owqVar2.a(jjpVar);
    }

    @Override // defpackage.jjx, defpackage.jjv
    public final void g() {
        super.g();
        this.w = true;
        this.n.a();
        View view = this.s;
        if (view != null) {
            Resources resources = view.getResources();
            View view2 = this.s;
            lpa.g(view2, R.string.brightness_disable_string, R.string.brightness_toast_reset, resources.getString(R.string.brightness_toast_reset_desc));
            this.s = view2;
        }
        Optional optional = ((jjq) this.j.dL()).b;
        nhz nhzVar = this.a;
        if (optional.isPresent() && nhzVar != null) {
            nhzVar.g(i(((Float) optional.get()).floatValue()), false, niz.a);
        }
        this.r.setVisibility(true != this.v ? 8 : 0);
        View view3 = this.s;
        if (view3 != null) {
            view3.setVisibility(true != this.v ? 0 : 8);
        }
        if (this.v && ((Float) ((ovx) this.f).d).floatValue() == -1.0f) {
            lae laeVar = this.t;
            laeVar.g();
            ske.W(laeVar.e(), new fxw(this, 6), out.a);
            e();
        }
    }

    @Override // defpackage.jjx
    protected final nhz h() throws Resources.NotFoundException {
        Resources resources = this.r.getResources();
        ComposeView composeView = (ComposeView) this.r.findViewById(R.id.brightness_controls_slider);
        scn scnVarL = scn.L(0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40);
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.pro_slider_tick_spacing);
        int i = sbp.d;
        sbp sbpVar = sex.a;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.brightness_slider_icon_size);
        nhx nhxVar = new nhx(R.drawable.gs_brightness_empty_vd_theme_24, resources.getString(R.string.decrease_brightness), new Size(dimensionPixelOffset, dimensionPixelOffset), ojl.aO(this.r));
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.brightness_slider_icon_size);
        nhz nhzVar = new nhz(composeView, new nhy(41, scnVarL, dimensionPixelSize, 0.5f, false, 3, sbpVar, nhxVar, new nhx(R.drawable.gs_brightness_high_vd_theme_24, resources.getString(R.string.increase_brightness), new Size(dimensionPixelOffset2, dimensionPixelOffset2), ojl.aO(this.r)), new gvx(this, 7), false, 1, new gvx(resources, 8)), new nhw(R.drawable.icon_reset_brightness, resources.getString(R.string.auto_brightness_button_desc), new jkc(this, 0), this.e), this.b);
        nhzVar.c(new jkb(this, 0));
        return nhzVar;
    }

    @Override // defpackage.lij
    public final void j(boolean z) {
        this.v = z;
        if (this.w) {
            g();
        }
    }
}
