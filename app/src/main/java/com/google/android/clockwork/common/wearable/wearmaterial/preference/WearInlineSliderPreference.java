package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.google.android.clockwork.common.wearable.wearmaterial.slider.WearInlineSlider;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.nya;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearInlineSliderPreference extends Preference {
    public float a;
    private final float b;
    private final float c;
    private final float d;
    private final boolean e;
    private final boolean f;
    private CharSequence g;
    private CharSequence h;
    private CharSequence i;

    public WearInlineSliderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.inlineSliderPreferenceStyle, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nya.c, R.attr.inlineSliderPreferenceStyle, 0);
        this.b = typedArrayObtainStyledAttributes.getFloat(5, 0.0f);
        this.c = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
        this.f = typedArrayObtainStyledAttributes.getBoolean(6, false);
        this.d = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        this.e = typedArrayObtainStyledAttributes.getBoolean(3, false);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.g = typedArrayObtainStyledAttributes.getString(0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.h = typedArrayObtainStyledAttributes.getString(1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.i = typedArrayObtainStyledAttributes.getString(7);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        WearInlineSlider wearInlineSlider = (WearInlineSlider) dbhVar.a;
        wearInlineSlider.f = this;
        wearInlineSlider.h(this.b);
        wearInlineSlider.i(this.c);
        wearInlineSlider.g(this.a);
        wearInlineSlider.f(this.d);
        wearInlineSlider.d(this.e);
        wearInlineSlider.e(this.f);
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            wearInlineSlider.b(charSequence);
        }
        CharSequence charSequence2 = this.g;
        if (charSequence2 != null) {
            wearInlineSlider.a(charSequence2);
        }
        CharSequence charSequence3 = this.i;
        if (charSequence3 != null) {
            wearInlineSlider.c(charSequence3);
        }
        ImageView imageView = wearInlineSlider.a;
        imageView.setStateDescription(null);
        imageView.setAccessibilityLiveRegion(0);
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return Float.valueOf(typedArray.getFloat(i, 0.0f));
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = Float.valueOf(this.b);
        }
        k(p(((Float) obj).floatValue()), true);
    }

    public final void k(float f, boolean z) {
        if (this.a != f) {
            this.a = f;
            if (V() && f != p(Float.NaN)) {
                SharedPreferences.Editor editorB = this.k.b();
                editorB.putFloat(this.r, f);
                super.P(editorB);
            }
            if (z) {
                d();
            }
        }
    }
}
