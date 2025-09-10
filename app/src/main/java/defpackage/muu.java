package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.camera.ui.views.ToggleUi;
import com.google.ar.core.R;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class muu implements mxl {
    private static final sgv g = sgv.g("muu");
    public final Context a;
    public ViewStub b;
    public ToggleUi c;
    public final mdy e;
    public final ocq f;
    private View.OnClickListener h;
    private int i;
    private int j;
    private boolean k;
    private final hbj o;
    private Object l = null;
    public final HashSet d = new HashSet();
    private boolean m = false;
    private mxm n = mxm.PORTRAIT;

    public muu(hbj hbjVar, mdy mdyVar, ocq ocqVar, Context context) {
        this.o = hbjVar;
        this.f = ocqVar;
        this.a = context;
        this.e = mdyVar;
    }

    private final void i(ToggleUi toggleUi) throws Resources.NotFoundException {
        if (this.k) {
            toggleUi.d.setVisibility(0);
        } else {
            toggleUi.d.setVisibility(8);
        }
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null) {
            toggleUi.b.setOnClickListener(onClickListener);
            toggleUi.c.setOnClickListener(this.h);
        }
        if (this.i != 0) {
            toggleUi.c.setContentDescription(toggleUi.getResources().getString(this.i));
        }
        if (this.j != 0) {
            toggleUi.e.setText(toggleUi.getResources().getString(this.j));
        }
        this.k = false;
        this.h = null;
        this.i = 0;
        this.j = 0;
    }

    public final void a(Object obj) {
        ToggleUi toggleUi;
        if (this.l != obj || (toggleUi = this.c) == null) {
            return;
        }
        toggleUi.f();
        this.c.setVisibility(8);
        this.l = null;
    }

    public final /* synthetic */ void d(View.OnClickListener onClickListener, int i) {
        e(onClickListener, i, false);
    }

    public final void e(View.OnClickListener onClickListener, int i, boolean z) throws Resources.NotFoundException {
        f(onClickListener, i, 0, z);
    }

    @Override // defpackage.mxl
    public final void eH(mxm mxmVar) {
        this.n = mxmVar;
        ToggleUi toggleUi = this.c;
        if (toggleUi != null) {
            toggleUi.e(mxmVar);
            if (mxmVar != mxm.PORTRAIT) {
                this.c.f();
            }
        }
    }

    public final void f(View.OnClickListener onClickListener, int i, int i2, boolean z) throws Resources.NotFoundException {
        this.h = onClickListener;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.m = true;
        ToggleUi toggleUi = this.c;
        if (toggleUi != null) {
            i(toggleUi);
        }
    }

    public final void g(rbb rbbVar, int i, int i2, boolean z) {
        if (this.o.p(gzo.bJ)) {
            Context context = this.a;
            Intent intentCr = qpt.cr(context, rbbVar, rbb.a);
            if (intentCr == null) {
                ((sgt) g.c().M(5059)).v("Camera Hub intent for %s is null", rbbVar);
            } else if (intentCr.resolveActivity(context.getPackageManager()) == null) {
                ((sgt) g.c().M(5058)).v("No activity found to handle Camera Hub intent for %s", rbbVar);
            } else {
                f(new mut(this, intentCr, rbbVar, 0), i, i2, z);
            }
        }
    }

    public final void h(Object obj) {
        if (this.m) {
            if (this.c == null) {
                ViewStub viewStub = this.b;
                viewStub.getClass();
                ToggleUi toggleUi = (ToggleUi) viewStub.inflate();
                sgv sgvVar = ToggleUi.a;
                ((sgt) sgvVar.b().M(5385)).s("Invalid background image resource.");
                Drawable drawable = toggleUi.getResources().getDrawable(R.drawable.quantum_gm_ic_help_outline_vd_theme_24, null);
                if (drawable != null) {
                    drawable.mutate().setTint(ojl.aL(toggleUi));
                }
                if (drawable != null) {
                    toggleUi.c.setImageDrawable(drawable);
                } else {
                    ((sgt) sgvVar.b().M(5386)).s("Invalid button image resource.");
                }
                toggleUi.i = this;
                this.b = null;
                i(toggleUi);
                this.c = toggleUi;
            }
            this.c.setVisibility(0);
            String strB = this.c.b();
            if (!rnt.V(strB) && this.n == mxm.PORTRAIT && !this.d.contains(strB) && this.f.ai(strB) < 2) {
                ToggleUi toggleUi2 = this.c;
                toggleUi2.getClass();
                toggleUi2.f();
                toggleUi2.e.postDelayed(toggleUi2.f, 5000L);
            }
            this.l = obj;
        }
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eR(mxj mxjVar, mxm mxmVar) {
    }
}
