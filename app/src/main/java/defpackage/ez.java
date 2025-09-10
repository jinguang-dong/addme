package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.wear.ambient.AmbientMode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ez extends dm implements gz {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ActionBarContextView d;
    View e;
    ey f;
    ff g;
    fe h;
    public int i;
    public boolean j;
    public boolean k;
    public fn l;
    boolean m;
    final cov n;
    final cov o;
    mi p;
    final AmbientMode.AmbientController q;
    private Context t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ez(Activity activity, boolean z) throws Resources.NotFoundException {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new ew(this);
        this.o = new ex(this);
        this.q = new AmbientMode.AmbientController(this);
        View decorView = activity.getWindow().getDecorView();
        z(decorView);
        if (z) {
            return;
        }
        this.e = decorView.findViewById(R.id.content);
    }

    private final void A() {
        this.p.a.requestLayout();
        this.b.e = false;
    }

    static boolean y(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void z(View view) throws Resources.NotFoundException {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.ar.core.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((ez) actionBarOverlayLayout.h).i = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    int[] iArr = con.a;
                    coe.b(actionBarOverlayLayout);
                }
            }
        }
        View viewFindViewById = view.findViewById(com.google.ar.core.R.id.action_bar);
        if (!(viewFindViewById instanceof Toolbar)) {
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(viewFindViewById != null ? viewFindViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.p = ((Toolbar) viewFindViewById).x();
        this.d = (ActionBarContextView) view.findViewById(com.google.ar.core.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.ar.core.R.id.action_bar_container);
        this.c = actionBarContainer;
        mi miVar = this.p;
        if (miVar == null || this.d == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = miVar.a();
        if ((this.p.b & 4) != 0) {
            this.u = true;
        }
        Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        a.aT(context);
        A();
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, fa.a, com.google.ar.core.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.m = true;
            actionBarOverlayLayout2.k(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            int[] iArr2 = con.a;
            cog.h(this.c, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.dm
    public final int a() {
        return this.p.b;
    }

    @Override // defpackage.dm
    public final Context b() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.ar.core.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.dm
    public final ff c(fe feVar) {
        ey eyVar = this.f;
        if (eyVar != null) {
            eyVar.f();
        }
        this.b.k(false);
        this.d.i();
        ey eyVar2 = new ey(this, this.d.getContext(), feVar);
        gb gbVar = eyVar2.a;
        gbVar.s();
        try {
            if (!eyVar2.b.c(eyVar2, gbVar)) {
                return null;
            }
            this.f = eyVar2;
            eyVar2.g();
            this.d.h(eyVar2);
            v(true);
            return eyVar2;
        } finally {
            eyVar2.a.r();
        }
    }

    @Override // defpackage.dm
    public final void d(boolean z) {
        if (z == this.v) {
            return;
        }
        this.v = z;
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dl) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.dm
    public final void f(boolean z) {
        if (this.u) {
            return;
        }
        g(z);
    }

    @Override // defpackage.dm
    public final void g(boolean z) {
        w(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.dm
    public final void h(boolean z) {
        fn fnVar;
        this.z = z;
        if (z || (fnVar = this.l) == null) {
            return;
        }
        fnVar.a();
    }

    @Override // defpackage.dm
    public final void i(CharSequence charSequence) {
        this.p.g(charSequence);
    }

    @Override // defpackage.dm
    public final void j(CharSequence charSequence) {
        this.p.i(charSequence);
    }

    @Override // defpackage.dm
    public final boolean l() {
        mi miVar = this.p;
        if (miVar == null || !miVar.j()) {
            return false;
        }
        miVar.b();
        return true;
    }

    @Override // defpackage.dm
    public final boolean n(int i, KeyEvent keyEvent) {
        ey eyVar = this.f;
        if (eyVar == null) {
            return false;
        }
        int deviceId = keyEvent != null ? keyEvent.getDeviceId() : -1;
        gb gbVar = eyVar.a;
        gbVar.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
        return gbVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.dm
    public final void q() throws Resources.NotFoundException {
        a.aT(this.a);
        A();
    }

    @Override // defpackage.dm
    public final void r() {
        w(2, 2);
    }

    @Override // defpackage.dm
    public final void s() {
        w(8, 8);
    }

    @Override // defpackage.dm
    public final void t() {
        this.p.e(null);
    }

    @Override // defpackage.dm
    public final void u() {
        i(this.a.getString(com.google.ar.core.R.string.pref_camera_settings_category));
    }

    public final void v(boolean z) {
        ejs ejsVarG;
        ejs ejsVarG2;
        if (z) {
            if (!this.x) {
                this.x = true;
                x(false);
            }
        } else if (this.x) {
            this.x = false;
            x(false);
        }
        if (!this.c.isLaidOut()) {
            if (z) {
                this.p.h(4);
                this.d.setVisibility(0);
                return;
            } else {
                this.p.h(0);
                this.d.setVisibility(8);
                return;
            }
        }
        if (z) {
            ejsVarG = this.p.n(4, 100L);
            ejsVarG2 = this.d.g(0, 200L);
        } else {
            ejs ejsVarN = this.p.n(0, 200L);
            ejsVarG = this.d.g(8, 100L);
            ejsVarG2 = ejsVarN;
        }
        fn fnVar = new fn();
        ArrayList arrayList = fnVar.a;
        arrayList.add(ejsVarG);
        View view = (View) ((WeakReference) ejsVarG.a).get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ((WeakReference) ejsVarG2.a).get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(ejsVarG2);
        fnVar.b();
    }

    public final void w(int i, int i2) {
        mi miVar = this.p;
        int i3 = miVar.b;
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        miVar.d((i & i2) | ((~i2) & i3));
    }

    public final void x(boolean z) {
        View view;
        View view2;
        View view3;
        if (!y(this.k, this.x)) {
            if (this.y) {
                this.y = false;
                fn fnVar = this.l;
                if (fnVar != null) {
                    fnVar.a();
                }
                if (this.i == 0) {
                    if (!this.z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    fn fnVar2 = new fn();
                    float f = -this.c.getHeight();
                    if (z) {
                        this.c.getLocationInWindow(new int[]{0, 0});
                        f -= r6[1];
                    }
                    ejs ejsVarM = con.m(this.c);
                    ejsVarM.m(f);
                    ejsVarM.r(this.q);
                    fnVar2.f(ejsVarM);
                    if (this.j && (view = this.e) != null) {
                        ejs ejsVarM2 = con.m(view);
                        ejsVarM2.m(f);
                        fnVar2.f(ejsVarM2);
                    }
                    fnVar2.d(r);
                    fnVar2.c();
                    fnVar2.e(this.n);
                    this.l = fnVar2;
                    fnVar2.b();
                    return;
                }
                this.n.a();
                return;
            }
            return;
        }
        if (this.y) {
            return;
        }
        this.y = true;
        fn fnVar3 = this.l;
        if (fnVar3 != null) {
            fnVar3.a();
        }
        this.c.setVisibility(0);
        if (this.i != 0) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.j && (view2 = this.e) != null) {
                view2.setTranslationY(0.0f);
            }
            this.o.a();
        } else {
            if (!this.z) {
                if (z) {
                    z = true;
                }
                this.c.setAlpha(1.0f);
                this.c.setTranslationY(0.0f);
                if (this.j) {
                    view2.setTranslationY(0.0f);
                }
                this.o.a();
            }
            this.c.setTranslationY(0.0f);
            float f2 = -this.c.getHeight();
            if (z) {
                this.c.getLocationInWindow(new int[]{0, 0});
                f2 -= r6[1];
            }
            this.c.setTranslationY(f2);
            fn fnVar4 = new fn();
            ejs ejsVarM3 = con.m(this.c);
            ejsVarM3.m(0.0f);
            ejsVarM3.r(this.q);
            fnVar4.f(ejsVarM3);
            if (this.j && (view3 = this.e) != null) {
                view3.setTranslationY(f2);
                ejs ejsVarM4 = con.m(this.e);
                ejsVarM4.m(0.0f);
                fnVar4.f(ejsVarM4);
            }
            fnVar4.d(s);
            fnVar4.c();
            fnVar4.e(this.o);
            this.l = fnVar4;
            fnVar4.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = con.a;
            coe.b(actionBarOverlayLayout);
        }
    }

    public ez(Dialog dialog) throws Resources.NotFoundException {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new ew(this);
        this.o = new ex(this);
        this.q = new AmbientMode.AmbientController(this);
        z(dialog.getWindow().getDecorView());
    }
}
