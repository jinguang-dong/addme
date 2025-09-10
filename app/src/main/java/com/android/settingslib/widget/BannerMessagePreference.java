package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.eoe;
import defpackage.eof;
import defpackage.eoj;
import defpackage.eoq;
import defpackage.eos;
import defpackage.scf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BannerMessagePreference extends Preference implements eoj {
    private final eof a;
    private final eof b;
    private eoe c;
    private String d;
    private String e;
    private int f;
    private final scf g;

    public BannerMessagePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new eof();
        this.b = new eof();
        this.g = new scf();
        this.c = eoe.HIGH;
        aa();
        this.A = true != eoq.a(context) ? R.layout.settingslib_banner_message : R.layout.settingslib_expressive_banner_message;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eos.a);
            int i = typedArrayObtainStyledAttributes.getInt(0, 0);
            for (eoe eoeVar : eoe.values()) {
                if (eoeVar.e == i) {
                    this.c = eoeVar;
                    this.d = typedArrayObtainStyledAttributes.getString(3);
                    this.e = typedArrayObtainStyledAttributes.getString(1);
                    this.f = typedArrayObtainStyledAttributes.getInt(2, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) throws Resources.NotFoundException {
        super.a(dbhVar);
        TextView textView = (TextView) dbhVar.B(R.id.banner_title);
        CharSequence charSequenceU = u();
        if (textView != null) {
            textView.setText(charSequenceU);
            textView.setVisibility(charSequenceU == null ? 8 : 0);
        }
        TextView textView2 = (TextView) dbhVar.B(R.id.banner_summary);
        if (textView2 != null) {
            textView2.setText(m());
            textView2.setVisibility(true != TextUtils.isEmpty(m()) ? 0 : 8);
        }
        Context context = this.j;
        eof eofVar = this.a;
        eofVar.c = (Button) dbhVar.B(R.id.banner_positive_btn);
        eof eofVar2 = this.b;
        eofVar2.c = (Button) dbhVar.B(R.id.banner_negative_btn);
        Resources.Theme theme = context.getTheme();
        int color = context.getResources().getColor(this.c.g, theme);
        ImageView imageView = (ImageView) dbhVar.B(R.id.banner_icon);
        if (imageView != null) {
            Drawable drawableR = r();
            if (drawableR == null) {
                drawableR = context.getDrawable(R.drawable.ic_warning);
            }
            imageView.setImageDrawable(drawableR);
            if (this.c != eoe.NORMAL && !eoq.a(context)) {
                imageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
        }
        int color2 = context.getResources().getColor(this.c.f, theme);
        int color3 = context.getResources().getColor(this.c.h, theme);
        ColorStateList colorStateList = context.getResources().getColorStateList(this.c.h, theme);
        dbhVar.u = false;
        dbhVar.v = false;
        View viewB = dbhVar.B(R.id.banner_background);
        if (viewB != null && !eoq.a(context)) {
            viewB.getBackground().setTint(color2);
        }
        eofVar.a = color;
        eofVar2.a = color;
        if (this.c != eoe.NORMAL) {
            eofVar.b = color3;
            eofVar2.d = colorStateList;
        }
        scf scfVar = this.g;
        scfVar.a = (ImageButton) dbhVar.B(R.id.banner_dismiss_btn);
        ((ImageButton) scfVar.a).setOnClickListener(null);
        ((ImageButton) scfVar.a).setVisibility(8);
        TextView textView3 = (TextView) dbhVar.B(R.id.banner_subtitle);
        textView3.setText(this.d);
        textView3.setVisibility(this.d == null ? 8 : 0);
        TextView textView4 = (TextView) dbhVar.B(R.id.banner_header);
        if (textView4 != null) {
            textView4.setText(this.e);
            textView4.setVisibility(true != TextUtils.isEmpty(this.e) ? 0 : 8);
        }
        eofVar.a();
        eofVar2.a();
        View viewB2 = dbhVar.B(R.id.banner_buttons_frame);
        if (viewB2 == null) {
            return;
        }
        viewB2.setVisibility((eof.b() || eof.b()) ? 0 : 8);
        LinearLayout linearLayout = (LinearLayout) viewB2;
        if (this.f == linearLayout.getOrientation()) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                linearLayout.setOrientation(this.f);
                return;
            } else {
                View childAt = linearLayout.getChildAt(childCount);
                linearLayout.removeViewAt(childCount);
                linearLayout.addView(childAt);
            }
        }
    }
}
