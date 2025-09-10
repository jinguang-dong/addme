package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.android.apps.camera.toast.EducationToastView;
import com.google.android.apps.camera.toast.ToastView;
import com.google.ar.core.R;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mle implements imj {
    public final ViewGroup a;
    public final int b;
    public final Runnable c;
    public Runnable d;
    public final boolean e;
    public final boolean f;
    private final Duration h;
    private final View i;
    private final boolean m;
    private Date n;
    private ToastView p;
    private final int q;
    public Runnable g = new iwh(14);
    private mxm o = mxm.PORTRAIT;
    private final String j = null;
    private final String k = null;
    private final int l = 0;

    public mle(Duration duration, ViewGroup viewGroup, View view, int i, Runnable runnable, int i2, boolean z, boolean z2, boolean z3) {
        this.h = duration;
        this.a = viewGroup;
        this.i = view;
        this.b = i;
        this.c = runnable;
        this.q = i2;
        this.m = z;
        this.e = z2;
        this.f = z3;
    }

    private static void a(ToastView toastView, View view) {
        FrameLayout frameLayout = (FrameLayout) toastView.findViewById(R.id.toast_inner_layout);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        frameLayout.setLayoutParams(marginLayoutParams);
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.removeAllViewsInLayout();
        frameLayout.addView(view);
    }

    @Override // defpackage.imj
    public final int b() {
        return (int) (this.h.toMillis() + ToastView.d.toMillis() + ToastView.e.toMillis());
    }

    @Override // defpackage.imj
    public final imk c() {
        return this.m ? imk.SECOND_RUN_TOAST : imk.FIRST_RUN_TOAST;
    }

    @Override // defpackage.imj
    public final /* synthetic */ paq d() {
        return new fhf(12);
    }

    @Override // defpackage.imj
    public final /* synthetic */ Object e() {
        return new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mle)) {
            return false;
        }
        mle mleVar = (mle) obj;
        int i = mleVar.l;
        if (this.m == mleVar.m && Objects.equals(this.h, mleVar.h) && Objects.equals(this.a, mleVar.a)) {
            String str = mleVar.j;
            if (Objects.equals(null, null)) {
                String str2 = mleVar.k;
                if (Objects.equals(null, null) && this.q == mleVar.q) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.imj
    public final /* synthetic */ Runnable f() {
        return null;
    }

    @Override // defpackage.imj
    public final Date g() {
        return this.n;
    }

    public final int hashCode() {
        return Objects.hash(this.h, this.a, null, null, 0, Integer.valueOf(this.q), Boolean.valueOf(this.m));
    }

    @Override // defpackage.imj
    public final void i() {
        ToastView toastView = this.p;
        if (toastView != null) {
            toastView.e();
        }
    }

    @Override // defpackage.imj
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.imj
    public final void k(Date date) {
        this.n = date;
    }

    @Override // defpackage.imj
    public final void m() {
        if (!this.m) {
            ViewGroup viewGroup = this.a;
            Duration duration = ToastView.d;
            View.inflate(viewGroup.getContext(), R.layout.toast_view_layout, viewGroup);
            ToastView toastView = (ToastView) viewGroup.findViewById(R.id.toast_view_layout);
            toastView.a(this);
            this.p = toastView;
            View view = this.i;
            if (view != null) {
                a(toastView, view);
            }
            this.p.c(this.o);
            this.p.g();
            return;
        }
        View view2 = this.i;
        if (view2 != null) {
            ViewGroup viewGroup2 = this.a;
            int i = EducationToastView.c;
            View.inflate(viewGroup2.getContext(), R.layout.education_toast_view_layout, viewGroup2);
            EducationToastView educationToastView = (EducationToastView) viewGroup2.findViewById(R.id.edu_toast_layout);
            educationToastView.a(this);
            this.p = educationToastView;
            a(educationToastView, view2);
            this.p.c(this.o);
            this.p.g();
        }
    }

    @Override // defpackage.imj
    public final void n(boolean z, boolean z2, boolean z3, mxm mxmVar, mxj mxjVar, Optional optional, boolean z4) {
        this.o = mxmVar;
        ToastView toastView = this.p;
        if (toastView != null) {
            toastView.c(mxmVar);
        }
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.imj
    public final boolean q() {
        return this.e;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.imj
    public final int t() {
        return this.q;
    }

    @Override // defpackage.imj
    public final void h(Runnable runnable) {
        throw new UnsupportedOperationException(cdVQ.NEgy.concat(String.valueOf(getClass().getName())));
    }
}
