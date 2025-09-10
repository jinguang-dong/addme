package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Size;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jkg extends jjx implements lij {
    public static final sgv c = sgv.g("jkg");
    public final lae d;
    public final owq e;
    public final owf f;
    public final jjw g;
    public final AtomicBoolean h;
    public View i;
    public View j;
    public final cwq k;
    public final owq l;
    public final owq m;
    public final owq n;
    public final int o;
    public final int p;
    public our q;
    public boolean r;
    public final jkh s;
    public final fdq t;
    public final mdy u;
    public final mwq v;
    private final out w;
    private boolean x;
    private our y;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, owq] */
    public jkg(qrh qrhVar, jkh jkhVar, lae laeVar, owq owqVar, out outVar, owf owfVar, jjw jjwVar, fdq fdqVar, mdy mdyVar, mwq mwqVar, hbj hbjVar) {
        qrhVar.getClass();
        jkhVar.getClass();
        laeVar.getClass();
        owqVar.getClass();
        outVar.getClass();
        owfVar.getClass();
        jjwVar.getClass();
        mdyVar.getClass();
        mwqVar.getClass();
        hbjVar.getClass();
        this.s = jkhVar;
        this.d = laeVar;
        this.e = owqVar;
        this.w = outVar;
        this.f = owfVar;
        this.g = jjwVar;
        this.t = fdqVar;
        this.u = mdyVar;
        this.v = mwqVar;
        this.h = new AtomicBoolean();
        this.k = new cwq(false);
        this.l = qrhVar.a;
        this.m = qrhVar.g;
        this.n = qrhVar.d;
        Integer num = (Integer) ukc.i(hbjVar.a(gyv.a));
        this.o = num != null ? num.intValue() : -40;
        Integer num2 = (Integer) ukc.i(hbjVar.a(gyv.b));
        this.p = num2 != null ? num2.intValue() : 40;
        this.x = true;
    }

    private final void i(float f) {
        this.s.b(false);
        this.n.a(false);
        owq owqVar = this.l;
        Float fValueOf = Float.valueOf(-1.0f);
        owqVar.a(fValueOf);
        this.m.a(fValueOf);
        lae laeVar = this.d;
        laeVar.f();
        owq owqVar2 = this.e;
        jjp jjpVar = (jjp) owqVar2.dL();
        jjpVar.d = Optional.empty();
        jjpVar.c = Optional.empty();
        owqVar2.a(jjpVar);
        laeVar.g();
        nhz nhzVar = this.a;
        if (nhzVar != null) {
            nhzVar.g(f, false, niz.a);
        }
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (!this.h.compareAndSet(false, true)) {
            throw new IllegalStateException("Cannot bind multiple times.");
        }
        this.i = view;
        this.j = view.getRootView().findViewById(R.id.disabled_controls);
        our ourVar = new our();
        this.q = ourVar;
        ourVar.d(owb.a(this.n).dK(new jbp(this, 15), this.w));
        return new jkf(this, 2);
    }

    @Override // defpackage.jjv
    public final synchronized void d() {
        our ourVar = this.y;
        if (ourVar != null) {
            ourVar.close();
        }
        this.y = null;
    }

    @Override // defpackage.jjv
    public final void e() {
        i(0.5f);
    }

    @Override // defpackage.jjx, defpackage.jjv
    public final synchronized void g() {
        super.g();
        this.r = true;
        View view = this.i;
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        }
        view.setVisibility(true != this.x ? 8 : 0);
        View view2 = this.j;
        if (view2 != null) {
            Resources resources = view2.getResources();
            View view3 = this.j;
            lpa.g(view3, R.string.brightness_disable_string, R.string.brightness_toast_reset, resources.getString(R.string.brightness_toast_reset_desc));
            this.j = view3;
            if (view3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            view3.setVisibility(true != this.x ? 0 : 8);
        }
        if (this.y == null) {
            this.s.a();
            Optional optional = ((jjq) this.f.dL()).d;
            optional.getClass();
            Float f = (Float) ukc.i(optional);
            float fFloatValue = f != null ? f.floatValue() : 0.5f;
            if (this.x && ujp.d((Float) ((ovx) this.l).d, -1.0f)) {
                i(fFloatValue);
            } else {
                nhz nhzVar = this.a;
                if (nhzVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                nhzVar.g(fFloatValue, false, niz.a);
            }
            our ourVar = this.q;
            if (ourVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            our ourVarC = ourVar.c();
            this.y = ourVarC;
            if (ourVarC != null) {
                ourVarC.d(new jkf(this, 0));
            }
        }
    }

    @Override // defpackage.jjx
    protected final nhz h() throws Resources.NotFoundException {
        View view = this.i;
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Resources resources = view.getResources();
        View view2 = this.i;
        if (view2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        View viewFindViewById = view2.findViewById(R.id.brightness_slider);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        resources.getClass();
        int i = this.p;
        int i2 = this.o;
        int i3 = i - i2;
        Set setBQ = ske.bQ(ukc.t(new ukv(0, i3), 5));
        ukt uktVarT = ukc.t(new ukv(i2, i), 5);
        ArrayList arrayList = new ArrayList(ske.bq(uktVarT, 10));
        ugd it = uktVarT.iterator();
        while (((uku) it).a) {
            arrayList.add(String.valueOf(it.a()));
        }
        float dimension = resources.getDimension(R.dimen.pro_slider_tick_spacing);
        View view3 = this.i;
        if (view3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Context context = view3.getContext();
        context.getClass();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.brightness_slider_icon_size);
        String string = context.getString(R.string.decrease_brightness);
        string.getClass();
        nhx nhxVar = new nhx(R.drawable.gs_ev_shadow_fill1_vd_theme_24, string, new Size(dimensionPixelOffset, dimensionPixelOffset), ojl.aO(this.i));
        View view4 = this.i;
        if (view4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Context context2 = view4.getContext();
        context2.getClass();
        int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.brightness_slider_icon_size);
        String string2 = context2.getString(R.string.increase_brightness);
        string2.getClass();
        nhy nhyVar = new nhy(i3 + 1, setBQ, dimension, 0.0f, false, 3, arrayList, nhxVar, new nhx(R.drawable.gs_ev_shadow_vd_theme_24, string2, new Size(dimensionPixelOffset2, dimensionPixelOffset2), ojl.aO(this.i)), new gvx(this, 9), false, 0, new gvx(resources, 10), 3080);
        String string3 = resources.getString(R.string.auto_brightness_button_desc);
        string3.getClass();
        nhw nhwVar = new nhw(R.drawable.gs_reset_shadow_vd_theme_24, string3, new jkc(this, 2), this.k, null);
        mxm mxmVar = this.b;
        mxmVar.getClass();
        nhz nhzVar = new nhz(composeView, nhyVar, nhwVar, mxmVar, null, ScriptIntrinsicBLAS.TRANSPOSE);
        nhzVar.c(new jkb(this, 2, null));
        return nhzVar;
    }

    @Override // defpackage.lij
    public final void j(boolean z) {
        this.x = z;
        if (this.r) {
            g();
        }
    }
}
