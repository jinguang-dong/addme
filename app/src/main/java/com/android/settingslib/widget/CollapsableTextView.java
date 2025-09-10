package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.ar.core.R;
import defpackage.ckl;
import defpackage.eoh;
import defpackage.eou;
import defpackage.gx;
import defpackage.ujk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CollapsableTextView extends ConstraintLayout {
    public boolean i;
    public boolean j;
    public int k;
    public final TextView l;
    private final LinearLayout m;
    private final ImageView n;
    private final TextView o;
    private final eoh p;
    private final LinkableTextView q;

    static {
        int[] iArr = eou.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsableTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    private static final void h(View view) {
        if (view instanceof MaterialButton) {
            ViewGroup.LayoutParams layoutParams = ((MaterialButton) view).getLayoutParams();
            layoutParams.getClass();
            ckl cklVar = (ckl) layoutParams;
            cklVar.t = 0;
            cklVar.v = 0;
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setGravity(17);
            textView.setTextAlignment(4);
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.getClass();
            ckl cklVar2 = (ckl) layoutParams2;
            cklVar2.t = 0;
            cklVar2.v = 0;
        }
    }

    public final void g() {
        if (this.j) {
            ImageView imageView = this.n;
            if (imageView != null) {
                imageView.setImageDrawable(this.p.b);
            }
            TextView textView = this.o;
            if (textView != null) {
                textView.setText(this.p.d);
            }
            TextView textView2 = this.l;
            textView2.setMaxLines(this.k);
            textView2.setEllipsize(null);
            textView2.setScrollBarSize(0);
        } else {
            ImageView imageView2 = this.n;
            if (imageView2 != null) {
                imageView2.setImageDrawable(this.p.a);
            }
            TextView textView3 = this.o;
            if (textView3 != null) {
                textView3.setText(this.p.c);
            }
            TextView textView4 = this.l;
            textView4.setMaxLines(50);
            textView4.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.m.setVisibility((!this.i || this.l.getLineCount() <= this.k) ? 8 : 0);
        this.q.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Throwable {
        super.onMeasure(i, i2);
        g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.i = true;
        this.k = 2;
        LayoutInflater.from(context).inflate(R.layout.settingslib_expressive_collapsable_textview, this);
        View viewFindViewById = findViewById(android.R.id.title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.l = textView;
        View viewFindViewById2 = findViewById(R.id.collapse_button);
        viewFindViewById2.getClass();
        LinearLayout linearLayout = (LinearLayout) viewFindViewById2;
        this.m = linearLayout;
        this.n = (ImageView) linearLayout.findViewById(android.R.id.icon1);
        this.o = (TextView) linearLayout.findViewById(android.R.id.text1);
        View viewFindViewById3 = findViewById(R.id.settingslib_expressive_learn_more);
        viewFindViewById3.getClass();
        LinkableTextView linkableTextView = (LinkableTextView) viewFindViewById3;
        this.q = linkableTextView;
        Drawable drawable = context.getDrawable(R.drawable.settingslib_expressive_icon_collapse);
        drawable.getClass();
        Drawable drawable2 = context.getDrawable(R.drawable.settingslib_expressive_icon_expand);
        drawable2.getClass();
        String string = context.getString(R.string.settingslib_expressive_text_collapse);
        string.getClass();
        String string2 = context.getString(R.string.settingslib_expressive_text_expand);
        string2.getClass();
        this.p = new eoh(drawable, drawable2, string, string2);
        linearLayout.setOnClickListener(new gx(this, 5, null));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eou.a, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(0, 8388611);
        if (i2 == 1 || i2 == 16 || i2 == 17) {
            h(textView);
            h(linearLayout);
            h(linkableTextView);
        }
        this.i = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.k = typedArrayObtainStyledAttributes.getInt(1, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ CollapsableTextView(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
