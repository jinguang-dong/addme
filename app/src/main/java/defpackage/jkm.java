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
public class jkm extends jjx {
    public static final sgv c = sgv.g("jkm");
    public final owq d;
    public final AtomicBoolean e = new AtomicBoolean();
    public final cwq f = new cwq(false);
    public final Runnable g;
    public View h;
    public nhz i;
    public our j;
    public boolean k;
    public ComposeView l;
    public Float m;
    public final mdy n;
    public final mwq o;
    public final qqq p;
    private final out q;
    private final owf r;
    private final owf s;
    private final owf t;
    private final owf u;
    private our v;
    private final fdq w;
    private final hbj x;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, owf] */
    public jkm(qqq qqqVar, owf owfVar, fdq fdqVar, hbj hbjVar, owq owqVar, out outVar, mdy mdyVar, owf owfVar2, luj lujVar, mwq mwqVar) {
        this.p = qqqVar;
        this.s = owfVar;
        this.w = fdqVar;
        this.x = hbjVar;
        this.d = owqVar;
        this.q = outVar;
        this.n = mdyVar;
        this.u = owfVar2;
        this.t = lujVar.a(luf.aZ);
        this.o = mwqVar;
        this.r = owl.h(qqqVar.c, new hia(19));
        this.g = new img(this, mwqVar, 9);
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.e.compareAndSet(false, true)) {
            throw new IllegalStateException("Cannot bind multiple times.");
        }
        this.h = view;
        this.j = new our();
        this.l = (ComposeView) view.findViewById(R.id.whitebalance_controls_slider);
        this.p.A(this.w);
        return new iew(this, 12);
    }

    @Override // defpackage.jjv
    public final synchronized void d() {
        our ourVar = this.v;
        if (ourVar != null) {
            ourVar.close();
            this.v = null;
        }
    }

    @Override // defpackage.jjv
    public final void e() {
        i(false);
        qqq qqqVar = this.p;
        qqqVar.y(0);
        qqqVar.z(0.0f);
        owq owqVar = this.d;
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.h = Optional.empty();
        owqVar.a(jjpVar);
    }

    @Override // defpackage.jjx, defpackage.jjv
    public final synchronized void g() {
        super.g();
        if (this.v != null) {
            return;
        }
        our ourVarC = this.j.c();
        this.v = ourVarC;
        owf owfVar = this.r;
        jbp jbpVar = new jbp(this, 18);
        out outVar = this.q;
        ourVarC.d(owfVar.dK(jbpVar, outVar));
        this.v.d(new jkf(this, 5));
        if (((Boolean) ((ovx) this.t).d).booleanValue()) {
            i(((jjq) this.u.dL()).h.isPresent());
        }
        if (this.x.p(haz.b)) {
            our ourVar = this.v;
            ourVar.getClass();
            ourVar.d(this.s.dK(new jbp(this, 19), outVar));
        }
        this.h.setVisibility(0);
    }

    @Override // defpackage.jjx
    protected final nhz h() throws Resources.NotFoundException {
        Resources resources = this.h.getResources();
        ComposeView composeView = this.l;
        scn scnVarL = scn.L(0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40);
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.pro_slider_tick_spacing);
        int i = sbp.d;
        sbp sbpVar = sex.a;
        Context context = this.h.getContext();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.whitebalance_slider_icon_size);
        nhx nhxVar = new nhx(R.drawable.gs_thermometer_minus_vd_theme_48, context.getString(R.string.increase_whitebalance), new Size(dimensionPixelOffset, dimensionPixelOffset), context.getColor(R.color.whitebalance_cool));
        Context context2 = this.h.getContext();
        int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.whitebalance_slider_icon_size);
        nhz nhzVar = new nhz(composeView, new nhy(41, scnVarL, dimensionPixelSize, 0.5f, false, 3, sbpVar, nhxVar, new nhx(R.drawable.gs_thermometer_add_vd_theme_48, context2.getString(R.string.decrease_whitebalance), new Size(dimensionPixelOffset2, dimensionPixelOffset2), context2.getColor(R.color.whitebalance_warm)), new gvx(this, 17)), new nhw(R.drawable.icon_reset_wb, this.h.getResources().getString(R.string.auto_whitebalance_button_desc), new jkc(this, 6), this.f), this.b);
        this.i = nhzVar;
        nhzVar.c(new jkb(this, 6));
        return this.i;
    }

    public final void i(boolean z) {
        this.f.h(Boolean.valueOf(z));
    }
}
