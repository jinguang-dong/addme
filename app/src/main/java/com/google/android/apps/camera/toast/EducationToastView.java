package com.google.android.apps.camera.toast;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Space;
import com.google.ar.core.R;
import defpackage.fuo;
import defpackage.iwh;
import defpackage.mle;
import defpackage.mxm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EducationToastView extends ToastView {
    public static final /* synthetic */ int c = 0;
    public Runnable a;
    public Runnable b;
    private PopupWindow o;
    private mxm p;
    private ImageView q;

    public EducationToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new iwh(12);
        this.b = new iwh(13);
        this.p = mxm.PORTRAIT;
    }

    private final void h(ImageView imageView) {
        int iOrdinal = this.p.ordinal();
        if (iOrdinal == 1) {
            imageView.setImageResource(R.drawable.ic_swipe_right_option);
        } else if (iOrdinal != 2) {
            imageView.setImageResource(R.drawable.ic_swipe_down_option);
        } else {
            imageView.setImageResource(R.drawable.ic_swipe_left_option);
        }
    }

    @Override // com.google.android.apps.camera.toast.ToastView
    public final void a(mle mleVar) {
        h(this.q);
        this.q.setVisibility(0);
        ((Space) findViewById(R.id.edu_toast_icon_space)).setVisibility(8);
        f(mleVar);
        this.o = d();
        this.a = mleVar.d;
        this.b = mleVar.g;
    }

    @Override // com.google.android.apps.camera.toast.ToastView
    public final void b() {
        this.o.setTouchInterceptor(new fuo(this, 9, null));
    }

    @Override // com.google.android.apps.camera.toast.ToastView
    public final void c(mxm mxmVar) {
        this.p = mxmVar;
        ImageView imageView = this.q;
        if (imageView != null) {
            h(imageView);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.q = (ImageView) findViewById(R.id.edu_toast_icon);
    }
}
