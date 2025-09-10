package defpackage;

import android.content.res.Resources;
import android.util.Range;
import android.util.Size;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.ar.core.R;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lkn extends jjx implements lij {
    public static final sgv c = sgv.g("lkn");
    private static final Duration s = Duration.ofMillis(100);
    public final leq d;
    public final owq e;
    public nhz i;
    public View j;
    public View k;
    public our n;
    public final mdy o;
    public final mwq p;
    public obu q;
    private final owf t;
    private final out u;
    private final owq v;
    private final owf w;
    private ComposeView x;
    private our z;
    public final cwq f = new cwq(false);
    public final qpt r = new qpt((byte[]) null);
    public final lky g = new lky();
    public final AtomicBoolean h = new AtomicBoolean();
    public boolean l = false;
    private boolean y = true;
    public boolean m = false;

    public lkn(leq leqVar, owq owqVar, owf owfVar, out outVar, owq owqVar2, owf owfVar2, mdy mdyVar, mwq mwqVar) {
        this.d = leqVar;
        this.e = owqVar;
        this.t = owfVar;
        this.u = outVar;
        this.v = owqVar2;
        this.w = owfVar2;
        this.o = mdyVar;
        this.p = mwqVar;
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.h.compareAndSet(false, true)) {
            throw new IllegalStateException("Cannot bind multiple times.");
        }
        this.j = view;
        this.n = new our();
        this.k = view.getRootView().findViewById(R.id.disabled_controls);
        this.x = (ComposeView) view.findViewById(R.id.shutter_speed_slider);
        return new kxj(this, 13);
    }

    @Override // defpackage.jjv
    public final synchronized void d() {
        our ourVar = this.z;
        if (ourVar != null) {
            ourVar.close();
            this.z = null;
        }
    }

    @Override // defpackage.jjv
    public final void e() {
        this.d.b(true);
        this.l = false;
        this.v.a(false);
        owq owqVar = this.e;
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.g = Optional.empty();
        owqVar.a(jjpVar);
        this.f.h(false);
    }

    @Override // defpackage.jjx, defpackage.jjv
    public final synchronized void g() {
        super.g();
        this.j.setVisibility(true != this.y ? 8 : 0);
        this.k.setVisibility(true != this.y ? 0 : 8);
        if (this.z != null) {
            return;
        }
        our ourVarC = this.n.c();
        this.z = ourVarC;
        owf owfVar = this.t;
        kso ksoVar = new kso(this, 19);
        out outVar = this.u;
        ourVarC.d(owfVar.dK(ksoVar, outVar));
        this.z.d(owb.a(owl.h(owfVar, new idb(20))).dK(new kso(this, 20), outVar));
        this.z.d(new kxj(this, 12));
        this.m = true;
        Resources resources = this.k.getResources();
        View view = this.k;
        lpa.g(view, R.string.shutter_speed_disable_string, R.string.shutter_toast_reset, resources.getString(R.string.shutter_toast_reset_desc));
        this.k = view;
    }

    @Override // defpackage.jjx
    protected final nhz h() {
        lkw lkwVarA = lks.a(100000L);
        Resources resources = this.x.getResources();
        this.x.b();
        this.q = lkwVarA.b;
        nhz nhzVar = new nhz(this.x, l(lkwVarA.a), new nhw(R.drawable.icon_reset_shutterspeed, resources.getString(R.string.auto_shutter_speed_button_desc), new jkc(this, 8), this.f), this.b);
        this.i = nhzVar;
        nhzVar.c(new jkb(this, 8));
        this.n.d(this.w.dK(new lld(this, 1), this.u));
        return this.i;
    }

    public final float i(long j) {
        return ske.aj((float) this.q.m(j), 0.0f, 1.0f);
    }

    @Override // defpackage.lij
    public final void j(boolean z) {
        this.y = z;
        if (this.m) {
            g();
        }
    }

    public final nhy l(lkv lkvVar) throws Resources.NotFoundException {
        Resources resources = this.x.getResources();
        float dimensionPixelSize = resources.getDimensionPixelSize(lkvVar.b);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.decrease_shutter_icon_size);
        nhx nhxVar = new nhx(R.drawable.gs_shutter_speed_minus_vd_theme_48, resources.getString(R.string.decrease_shutter_desc), new Size(dimensionPixelOffset, dimensionPixelOffset), ojl.aO(this.j));
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.increase_shutter_icon_size);
        return new nhy(lkvVar.a, lkvVar.c, dimensionPixelSize, 0.5f, false, 3, lkvVar.d, nhxVar, new nhx(R.drawable.gs_shutter_speed_add_vd_theme_48, resources.getString(R.string.increase_shutter_desc), new Size(dimensionPixelOffset2, dimensionPixelOffset2), ojl.aO(this.j)), new arc(this, 17), false, 1, new dql(this, resources, 17));
    }

    public final void m(long j) {
        Duration duration = s;
        boolean z = j > duration.toNanos();
        this.l = z;
        this.v.a(Boolean.valueOf(z));
        if (this.l) {
            this.d.c(duration.toNanos());
        } else {
            this.d.c(j);
        }
        owq owqVar = this.e;
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.g = Optional.of(Long.valueOf(j));
        owqVar.a(jjpVar);
    }

    public final long k(float f) {
        Range range = (Range) ((ovx) this.d.a()).d;
        long jRound = Math.round(this.q.l(f));
        long jLongValue = ((Long) range.getLower()).longValue();
        long jLongValue2 = ((Long) range.getUpper()).longValue();
        rnt.H(jLongValue <= jLongValue2, VnmwoBe.dzL, jLongValue, jLongValue2);
        return Math.min(Math.max(jRound, jLongValue), jLongValue2);
    }
}
