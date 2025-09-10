package defpackage;

import android.content.res.Resources;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Size;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jki extends jjx implements lij {
    public static final sgv c = sgv.g("jki");
    public final owq d;
    public final owf e;
    public final jjw f;
    public final AtomicBoolean g;
    public final cwq h;
    public final owq i;
    public final owq j;
    public final owq k;
    public our l;
    public final jkh m;
    public final fdq n;
    public final mdy o;
    public final mwq p;
    private final lae q;
    private final out r;
    private View s;
    private View t;
    private boolean u;
    private boolean v;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, owq] */
    public jki(qrh qrhVar, jkh jkhVar, lae laeVar, owq owqVar, out outVar, owf owfVar, jjw jjwVar, fdq fdqVar, mdy mdyVar, mwq mwqVar) {
        qrhVar.getClass();
        jkhVar.getClass();
        laeVar.getClass();
        owqVar.getClass();
        outVar.getClass();
        owfVar.getClass();
        jjwVar.getClass();
        mdyVar.getClass();
        mwqVar.getClass();
        this.m = jkhVar;
        this.q = laeVar;
        this.d = owqVar;
        this.r = outVar;
        this.e = owfVar;
        this.f = jjwVar;
        this.n = fdqVar;
        this.o = mdyVar;
        this.p = mwqVar;
        this.g = new AtomicBoolean();
        this.h = new cwq(false);
        this.i = qrhVar.g;
        this.j = qrhVar.a;
        this.k = qrhVar.d;
        this.u = true;
    }

    private static final float i(float f) {
        return ukc.m(f, 0.0f, 1.0f);
    }

    @Override // defpackage.jjv
    public final void d() {
        this.v = false;
        View view = this.s;
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        }
        view.setVisibility(8);
        View view2 = this.t;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // defpackage.jjv
    public final void e() {
        this.m.b(false);
        this.k.a(false);
        owq owqVar = this.i;
        Float fValueOf = Float.valueOf(-1.0f);
        owqVar.a(fValueOf);
        this.j.a(fValueOf);
        nhz nhzVar = this.a;
        if (nhzVar == null) {
            ((sgt) c.c().M(2800)).s("Evc slider not found");
        } else {
            nhzVar.g(i(0.5f), false, niz.a);
        }
        lae laeVar = this.q;
        laeVar.f();
        laeVar.g();
        owq owqVar2 = this.d;
        jjp jjpVar = (jjp) owqVar2.dL();
        jjpVar.c = Optional.empty();
        jjpVar.d = Optional.empty();
        owqVar2.a(jjpVar);
    }

    @Override // defpackage.jjx, defpackage.jjv
    public final void g() {
        super.g();
        this.v = true;
        this.m.a();
        View view = this.t;
        if (view != null) {
            Resources resources = view.getResources();
            View view2 = this.t;
            lpa.g(view2, R.string.exposure_disable_string, R.string.exposure_toast_reset, resources.getString(R.string.exposure_toast_reset_desc));
            this.t = view2;
        }
        Optional optional = ((jjq) this.e.dL()).c;
        nhz nhzVar = this.a;
        if (optional.isPresent() && nhzVar != null) {
            nhzVar.g(i(((Number) optional.get()).floatValue()), false, niz.a);
        }
        View view3 = this.s;
        if (view3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        view3.setVisibility(true != this.u ? 8 : 0);
        View view4 = this.t;
        if (view4 != null) {
            view4.setVisibility(true != this.u ? 0 : 8);
        }
        if (this.u && ujp.d((Float) ((ovx) this.j).d, -1.0f)) {
            this.q.g();
            e();
        }
    }

    @Override // defpackage.jjx
    protected final nhz h() throws Resources.NotFoundException {
        View view = this.s;
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Resources resources = view.getResources();
        View view2 = this.s;
        if (view2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        View viewFindViewById = view2.findViewById(R.id.exposure_slider);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        resources.getClass();
        Set setBQ = ske.bQ(ukc.t(new ukv(0, 24), 3));
        float dimension = resources.getDimension(R.dimen.exposure_slider_tick_spacing);
        ukv ukvVar = new ukv(-4, 4);
        ArrayList arrayList = new ArrayList(ske.bq(ukvVar, 10));
        ugd it = ukvVar.iterator();
        while (((uku) it).a) {
            arrayList.add(String.valueOf(it.a()));
        }
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.exposure_slider_icon_size);
        String string = resources.getString(R.string.decrease_exposure);
        string.getClass();
        nhx nhxVar = new nhx(R.drawable.gs_brightness_empty_vd_theme_24, string, new Size(dimensionPixelOffset, dimensionPixelOffset), ojl.aO(this.s));
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.exposure_slider_icon_size);
        String string2 = resources.getString(R.string.increase_exposure);
        string2.getClass();
        nhy nhyVar = new nhy(25, setBQ, dimension, 0.0f, false, 3, arrayList, nhxVar, new nhx(R.drawable.gs_brightness_high_vd_theme_24, string2, new Size(dimensionPixelOffset2, dimensionPixelOffset2), ojl.aO(this.s)), new gvx(this, 11), false, 0, new gvx(resources, 12), 3080);
        String string3 = resources.getString(R.string.auto_exposure_button_desc);
        string3.getClass();
        nhw nhwVar = new nhw(R.drawable.gs_reset_brightness_vd_theme_24, string3, new jkc(this, 3), this.h, null);
        mxm mxmVar = this.b;
        mxmVar.getClass();
        nhz nhzVar = new nhz(composeView, nhyVar, nhwVar, mxmVar, null, ScriptIntrinsicBLAS.TRANSPOSE);
        nhzVar.c(new jkb(this, 3, null));
        return nhzVar;
    }

    @Override // defpackage.lij
    public final void j(boolean z) {
        this.u = z;
        if (this.v) {
            g();
        }
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.g.compareAndSet(false, true)) {
            throw new IllegalStateException(PJGqOKsIpSdZ.tdL);
        }
        this.s = view;
        this.t = view.getRootView().findViewById(R.id.disabled_controls);
        our ourVar = new our();
        this.l = ourVar;
        ourVar.d(owb.a(this.k).dK(new jbp(this, 17), this.r));
        return new jkf(this, 3);
    }
}
