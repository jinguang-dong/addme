package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.preference.Preference;
import com.google.android.material.button.MaterialButton;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.dbi;
import defpackage.eog;
import defpackage.eoj;
import defpackage.eoq;
import defpackage.eot;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ButtonPreference extends Preference implements eoj {
    private Button a;
    private CharSequence b;
    private Drawable c;
    private int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = R.layout.settingslib_button_layout;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.g, 0, 0);
            this.b = typedArrayObtainStyledAttributes.getText(4);
            this.c = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, eot.a, 0, 0);
            this.d = typedArrayObtainStyledAttributes2.getInt(0, 8388611);
            if (eoq.a(context)) {
                int i2 = typedArrayObtainStyledAttributes2.getInt(2, 0);
                int i3 = typedArrayObtainStyledAttributes2.getInt(1, 0);
                for (eog eogVar : eog.values()) {
                    if (eogVar.j == i2 && eogVar.k == i3) {
                        i = eogVar.l;
                    }
                }
                throw new IllegalArgumentException();
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.A = i;
    }

    @Override // androidx.preference.Preference
    public final void J(Drawable drawable) {
        this.c = drawable;
        Button button = this.a;
        if (button == null || drawable == null) {
            return;
        }
        if (button instanceof MaterialButton) {
            ((MaterialButton) button).l(drawable);
            return;
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, this.j.getResources().getDisplayMetrics());
        drawable.setBounds(0, 0, iApplyDimension, iApplyDimension);
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        Button button = (Button) dbhVar.B(R.id.settingslib_button);
        this.a = button;
        CharSequence charSequence = this.b;
        if (button != null) {
            button.setText(charSequence);
        }
        J(this.c);
        int i = this.d;
        int i2 = 1;
        if (i != 1 && i != 16 && i != 17) {
            i2 = 8388611;
        }
        this.d = i2;
        Button button2 = this.a;
        if (button2 != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button2.getLayoutParams();
            layoutParams.gravity = this.d;
            this.a.setLayoutParams(layoutParams);
        }
        Button button3 = this.a;
        if (button3 != null) {
            button3.setOnClickListener(null);
        }
        Button button4 = this.a;
        if (button4 != null) {
            boolean z = this.u;
            button4.setFocusable(z);
            this.a.setClickable(z);
            this.a.setEnabled(U());
        }
        dbhVar.u = false;
        dbhVar.v = false;
    }

    @Override // androidx.preference.Preference
    public final CharSequence u() {
        return this.b;
    }
}
