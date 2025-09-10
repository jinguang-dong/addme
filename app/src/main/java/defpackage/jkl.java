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
public class jkl extends jjx implements lij {
    public static final sgv c = sgv.g("jkl");
    public View e;
    public View f;
    public final owq h;
    public final owq i;
    public final owq j;
    public final owq k;
    public final owf l;
    public final owf m;
    public final jjw n;
    public our p;
    public final jkh r;
    public final fdq s;
    public final mdy t;
    public final mwq u;
    private final lae v;
    private final out w;
    private our y;
    public final AtomicBoolean d = new AtomicBoolean();
    public final cwq g = new cwq(false);
    public float o = -1.0f;
    private boolean x = true;
    public boolean q = false;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, owq] */
    public jkl(qrh qrhVar, jkh jkhVar, lae laeVar, owq owqVar, out outVar, owf owfVar, jjw jjwVar, fdq fdqVar, mdy mdyVar, mwq mwqVar) {
        this.r = jkhVar;
        this.v = laeVar;
        this.h = owqVar;
        this.w = outVar;
        this.i = qrhVar.c;
        this.j = qrhVar.e;
        this.k = qrhVar.d;
        this.m = owfVar;
        this.n = jjwVar;
        this.s = fdqVar;
        this.t = mdyVar;
        this.l = laeVar.c;
        this.u = mwqVar;
    }

    private final void k() {
        this.r.b(false);
        this.k.a(false);
        owq owqVar = this.j;
        Float fValueOf = Float.valueOf(-1.0f);
        owqVar.a(fValueOf);
        this.i.a(fValueOf);
        this.v.f();
        owq owqVar2 = this.h;
        jjp jjpVar = (jjp) owqVar2.dL();
        jjpVar.b = Optional.empty();
        jjpVar.e = Optional.empty();
        owqVar2.a(jjpVar);
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.d.compareAndSet(false, true)) {
            throw new IllegalStateException("Cannot bind multiple times.");
        }
        this.e = view;
        this.f = view.getRootView().findViewById(R.id.disabled_controls);
        our ourVar = new our();
        this.p = ourVar;
        ourVar.d(owb.a(this.k).dK(new jjl(this, 6), this.w));
        return new iew(this, 11);
    }

    @Override // defpackage.jjv
    public final synchronized void d() {
        our ourVar = this.y;
        if (ourVar != null) {
            ourVar.close();
            this.y = null;
        }
    }

    @Override // defpackage.jjv
    public final void e() {
        k();
        i(true);
    }

    @Override // defpackage.jjx, defpackage.jjv
    public final synchronized void g() {
        super.g();
        this.q = true;
        this.e.setVisibility(true != this.x ? 8 : 0);
        View view = this.f;
        if (view != null) {
            Resources resources = view.getResources();
            View view2 = this.f;
            lpa.g(view2, R.string.shadows_disable_string, R.string.shadows_toast_reset, resources.getString(R.string.shadows_toast_reset_desc));
            this.f = view2;
            view2.setVisibility(true != this.x ? 0 : 8);
        }
        if (this.y != null) {
            return;
        }
        this.r.a();
        if (this.x && ((Float) ((ovx) this.i).d).floatValue() == -1.0f) {
            k();
            i(false);
        }
        ((jjq) this.m.dL()).e.ifPresentOrElse(new ird(this, 11), new jcq(this, 16));
        our ourVarC = this.p.c();
        this.y = ourVarC;
        ourVarC.d(new jkf(this, 4));
    }

    @Override // defpackage.jjx
    protected final nhz h() throws Resources.NotFoundException {
        Resources resources = this.e.getResources();
        ComposeView composeView = (ComposeView) this.e.findViewById(R.id.shadows_slider);
        scn scnVarL = scn.L(0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40);
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.pro_slider_tick_spacing);
        int i = sbp.d;
        sbp sbpVar = sex.a;
        Context context = this.e.getContext();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.shadows_slider_filled_icon_size);
        nhx nhxVar = new nhx(R.drawable.shadow_filled, context.getString(R.string.decrease_shadows), new Size(dimensionPixelOffset, dimensionPixelOffset), ojl.aO(this.e));
        Context context2 = this.e.getContext();
        int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.shadows_slider_ev_icon_size);
        nhy nhyVar = new nhy(41, scnVarL, dimensionPixelSize, 0.5f, false, 3, sbpVar, nhxVar, new nhx(R.drawable.gs_ev_shadow_vd_theme_24, context2.getString(R.string.increase_shadows), new Size(dimensionPixelOffset2, dimensionPixelOffset2), ojl.aO(this.e)), new gvx(this, 15), false, 1, new gvx(resources, 16));
        int i2 = 5;
        nhz nhzVar = new nhz(composeView, nhyVar, new nhw(R.drawable.icon_reset_shadows, resources.getString(R.string.auto_shadows_button_desc), new jkc(this, i2), this.g), this.b);
        nhzVar.c(new jkb(this, i2));
        return nhzVar;
    }

    public final void i(boolean z) {
        lae laeVar = this.v;
        laeVar.g();
        ske.W(laeVar.e(), new jkk(this, z), out.a);
    }

    @Override // defpackage.lij
    public final void j(boolean z) {
        this.x = z;
        if (this.q) {
            g();
        }
    }
}
