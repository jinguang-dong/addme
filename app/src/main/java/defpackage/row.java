package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.ar.core.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class row {
    public final int c;
    public final int d;
    public final int e;
    public final TimeInterpolator f;
    public final TimeInterpolator g;
    public final ViewGroup h;
    public final Context i;
    public final rov j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final SnackbarContentLayout r;
    private final TimeInterpolator x;
    private final AccessibilityManager z;
    private static final TimeInterpolator t = rhn.b;
    private static final TimeInterpolator u = rhn.a;
    private static final TimeInterpolator v = rhn.d;
    private static final int[] w = {R.attr.snackbarStyle};
    public static final String b = "row";
    static final Handler a = new Handler(Looper.getMainLooper(), new ror());
    private final Runnable y = new qly(this, 18, null);
    public final AmbientMode.AmbientController s = new AmbientMode.AmbientController(this);

    public int a() {
        throw null;
    }

    public final int b() {
        rov rovVar = this.j;
        int height = rovVar.getHeight();
        ViewGroup.LayoutParams layoutParams = rovVar.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.x);
        valueAnimatorOfFloat.addUpdateListener(new roo(this, 0));
        return valueAnimatorOfFloat;
    }

    public final void d(int i) {
        rpb rpbVarA = rpb.a();
        Object obj = rpbVarA.a;
        AmbientMode.AmbientController ambientController = this.s;
        synchronized (obj) {
            if (rpbVarA.g(ambientController)) {
                rpbVarA.d(rpbVarA.c, i);
            } else if (rpbVarA.h(ambientController)) {
                rpbVarA.d(rpbVarA.d, i);
            }
        }
    }

    final void e() {
        rpb rpbVarA = rpb.a();
        Object obj = rpbVarA.a;
        AmbientMode.AmbientController ambientController = this.s;
        synchronized (obj) {
            if (rpbVarA.g(ambientController)) {
                rpbVarA.b(rpbVarA.c);
            }
        }
    }

    public final void f() {
        rpb rpbVarA = rpb.a();
        Object obj = rpbVarA.a;
        int iA = a();
        AmbientMode.AmbientController ambientController = this.s;
        synchronized (obj) {
            if (rpbVarA.g(ambientController)) {
                rpa rpaVar = rpbVarA.c;
                rpaVar.a = iA;
                rpbVarA.b.removeCallbacksAndMessages(rpaVar);
                rpbVarA.b(rpbVarA.c);
                return;
            }
            if (rpbVarA.h(ambientController)) {
                rpbVarA.d.a = iA;
            } else {
                rpbVarA.d = new rpa(iA, ambientController);
            }
            rpa rpaVar2 = rpbVarA.c;
            if (rpaVar2 == null || !rpbVarA.d(rpaVar2, 4)) {
                rpbVarA.c = null;
                rpbVarA.c();
            }
        }
    }

    public final void g() {
        if (i()) {
            this.j.post(new qly(this, 20, null));
            return;
        }
        rov rovVar = this.j;
        if (rovVar.getParent() != null) {
            rovVar.setVisibility(0);
        }
        e();
    }

    public final void h() {
        rov rovVar = this.j;
        ViewGroup.LayoutParams layoutParams = rovVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (rovVar.f == null) {
            Log.w(b, "Unable to update margins because original view margins are not set");
            return;
        }
        if (rovVar.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = rovVar.f.bottom + this.l;
        int i2 = rovVar.f.left + this.m;
        int i3 = rovVar.f.right + this.n;
        int i4 = rovVar.f.top;
        if (marginLayoutParams.bottomMargin != i || marginLayoutParams.leftMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.topMargin != i4) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.topMargin = i4;
            rovVar.requestLayout();
        } else if (this.p == this.o) {
            return;
        }
        if (this.o > 0) {
            ViewGroup.LayoutParams layoutParams2 = rovVar.getLayoutParams();
            if ((layoutParams2 instanceof clf) && (((clf) layoutParams2).a instanceof SwipeDismissBehavior)) {
                Runnable runnable = this.y;
                rovVar.removeCallbacks(runnable);
                rovVar.post(runnable);
            }
        }
    }

    final boolean i() {
        AccessibilityManager accessibilityManager = this.z;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void j() {
        rpb rpbVarA = rpb.a();
        Object obj = rpbVarA.a;
        AmbientMode.AmbientController ambientController = this.s;
        synchronized (obj) {
            if (rpbVarA.g(ambientController)) {
                rpbVarA.c = null;
                if (rpbVarA.d != null) {
                    rpbVarA.c();
                }
            }
        }
        rov rovVar = this.j;
        ViewParent parent = rovVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(rovVar);
        }
    }

    protected row(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i;
        if (view != null) {
            if (snackbarContentLayout != null) {
                this.h = viewGroup;
                this.r = snackbarContentLayout;
                this.i = context;
                rlg.b(context);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(w);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    i = R.layout.mtrl_layout_snackbar;
                } else {
                    i = R.layout.design_layout_snackbar;
                }
                rov rovVar = (rov) layoutInflaterFrom.inflate(i, viewGroup, false);
                this.j = rovVar;
                rovVar.a = this;
                float f = rovVar.d;
                if (f != 1.0f) {
                    SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
                    snackbarContentLayout2.b.setTextColor(qpt.R(qpt.P(view, R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f));
                }
                ((SnackbarContentLayout) view).d = rovVar.e;
                rovVar.addView(view);
                rovVar.setAccessibilityLiveRegion(1);
                rovVar.setImportantForAccessibility(1);
                rovVar.setFitsSystemWindows(true);
                rkv rkvVar = new rkv(this, 2);
                int[] iArr = con.a;
                cog.i(rovVar, rkvVar);
                con.i(rovVar, new ros(this));
                this.z = (AccessibilityManager) context.getSystemService("accessibility");
                this.e = rnt.f(context, R.attr.motionDurationLong2, 250);
                this.c = rnt.f(context, R.attr.motionDurationLong2, 150);
                this.d = rnt.f(context, R.attr.motionDurationMedium1, 75);
                this.x = qpt.G(context, R.attr.motionEasingEmphasizedInterpolator, u);
                this.g = qpt.G(context, R.attr.motionEasingEmphasizedInterpolator, v);
                this.f = qpt.G(context, R.attr.motionEasingEmphasizedInterpolator, t);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException(uCzt.qREpySVEzCHLYfR);
    }
}
