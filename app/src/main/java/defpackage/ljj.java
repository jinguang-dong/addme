package defpackage;

import android.content.res.Resources;
import android.util.Range;
import android.util.Size;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ljj extends jjx implements lij {
    public static final sgv c = sgv.g("ljj");
    public final ler d;
    public final owq e;
    public final owq f;
    public View j;
    public View k;
    public our n;
    public nhz o;
    public final mdy p;
    public final mwq q;
    public obu r;
    private final owf s;
    private final out t;
    private final owf u;
    private ComposeView v;
    private our x;
    public final cwq g = new cwq(false);
    public final lky h = new lky();
    public final AtomicBoolean i = new AtomicBoolean();
    public boolean l = false;
    private boolean w = true;
    public boolean m = false;

    public ljj(ler lerVar, owq owqVar, owf owfVar, owq owqVar2, out outVar, mdy mdyVar, owf owfVar2, mwq mwqVar) {
        this.d = lerVar;
        this.e = owqVar;
        this.s = owfVar;
        this.f = owqVar2;
        this.t = outVar;
        this.p = mdyVar;
        this.u = owfVar2;
        this.q = mwqVar;
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.i.compareAndSet(false, true)) {
            throw new IllegalStateException("Cannot bind multiple times.");
        }
        this.j = view;
        this.n = new our();
        this.k = view.getRootView().findViewById(R.id.disabled_controls);
        this.v = (ComposeView) view.findViewById(R.id.iso_slider);
        return new kxj(this, 9);
    }

    @Override // defpackage.jjv
    public final synchronized void d() {
        our ourVar = this.x;
        if (ourVar != null) {
            ourVar.close();
            this.x = null;
        }
    }

    @Override // defpackage.jjv
    public final void e() {
        this.d.b(true);
        this.l = false;
        owq owqVar = this.e;
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.f = Optional.empty();
        owqVar.a(jjpVar);
        this.g.h(false);
    }

    @Override // defpackage.jjx, defpackage.jjv
    public final synchronized void g() {
        super.g();
        int i = 0;
        int i2 = 8;
        this.j.setVisibility(true != this.w ? 8 : 0);
        View view = this.k;
        if (true == this.w) {
            i = 8;
        }
        view.setVisibility(i);
        if (this.x != null) {
            return;
        }
        our ourVarC = this.n.c();
        this.x = ourVarC;
        owf owfVar = this.s;
        kso ksoVar = new kso(this, 13);
        out outVar = this.t;
        ourVarC.d(owfVar.dK(ksoVar, outVar));
        this.x.d(owb.a(owl.h(owfVar, new idb(19))).dK(new kso(this, 14), outVar));
        this.x.d(new kxj(this, i2));
        this.m = true;
        Resources resources = this.k.getResources();
        View view2 = this.k;
        lpa.g(view2, R.string.iso_disable_string, R.string.iso_toast_reset, resources.getString(R.string.iso_toast_reset_desc));
        this.k = view2;
    }

    @Override // defpackage.jjx
    protected final nhz h() {
        Resources resources = this.j.getResources();
        lkw lkwVarA = ljo.a(50);
        this.r = lkwVarA.b;
        nhz nhzVar = new nhz(this.v, l(lkwVarA.a), new nhw(R.drawable.icon_reset_iso, resources.getString(R.string.auto_iso_button_desc), new jkc(this, 7), this.g), this.b);
        this.o = nhzVar;
        nhzVar.c(new jkb(this, 7));
        this.n.d(this.u.dK(new kso(this, 15), this.t));
        return this.o;
    }

    public final float i(int i) {
        return ske.aj((float) this.r.m(i), 0.0f, 1.0f);
    }

    @Override // defpackage.lij
    public final void j(boolean z) {
        this.w = z;
        if (this.m) {
            g();
        }
    }

    public final int k(float f) {
        Range range = (Range) ((ovx) this.d.a()).d;
        return ske.Z((int) Math.round(this.r.l(f)), ((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue());
    }

    public final nhy l(lkv lkvVar) throws Resources.NotFoundException {
        Resources resources = this.v.getResources();
        float dimensionPixelSize = resources.getDimensionPixelSize(lkvVar.b);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.decrease_iso_icon_size);
        nhx nhxVar = new nhx(R.drawable.gs_texture_minus_vd_theme_48, resources.getString(R.string.decrease_iso_desc), new Size(dimensionPixelOffset, dimensionPixelOffset), ojl.aO(this.j));
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.increase_iso_icon_size);
        return new nhy(lkvVar.a, lkvVar.c, dimensionPixelSize, 0.5f, false, 3, lkvVar.d, nhxVar, new nhx(R.drawable.gs_texture_add_vd_theme_48, resources.getString(R.string.increase_iso_desc), new Size(dimensionPixelOffset2, dimensionPixelOffset2), ojl.aO(this.j)), new arc(this, 16), false, 1, new dql(this, resources, 16));
    }

    public final void m(int i) {
        int i2 = ((ljq) this.s.dL()).b;
        this.d.c(Math.max(i, i2));
        this.f.a(Boolean.valueOf(i < i2));
        owq owqVar = this.e;
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.f = Optional.of(Integer.valueOf(i));
        owqVar.a(jjpVar);
    }
}
