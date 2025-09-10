package com.google.android.apps.camera.ui.eduimageview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.jdc;
import defpackage.mtv;
import defpackage.oge;
import defpackage.rkc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EduImageView extends FrameLayout {
    public ImageView a;
    public TextView b;

    public EduImageView(Context context) {
        super(context);
    }

    public static void d(Context context) {
        Resources resources = context.getResources();
        rkc rkcVar = new rkc(context, R.style.Theme_Camera_MaterialAlertDialog);
        rkcVar.t(resources.getString(R.string.internet_required));
        rkcVar.m(resources.getString(R.string.connect_internet_for_examples));
        rkcVar.r(resources.getString(R.string.dialog_ok_cased), new jdc(5));
        rkcVar.c();
    }

    public final void a() {
        this.a.setBackgroundColor(0);
    }

    public final void b(Drawable drawable, String str) {
        this.a.setImageDrawable(drawable);
        this.a.setContentDescription(str);
        this.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public final void c(String str, String str2) {
        e(str, str2, null);
    }

    public final void e(String str, String str2, oge ogeVar) {
        new mtv(this, getContext(), str, str2, ogeVar).b(false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.eduimageview, this);
        this.a = (ImageView) findViewById(R.id.imageview);
        this.b = (TextView) findViewById(R.id.textview_offline);
    }

    public EduImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EduImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
