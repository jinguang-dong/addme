package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.dbh;
import defpackage.dbi;
import defpackage.dbl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private CharSequence c;
    private CharSequence d;
    private final dbl e;

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.g(this.c);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.d();
            }
            switchCompat.f(this.d);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.c();
            }
            switchCompat.setOnCheckedChangeListener(this.e);
        }
    }

    @Override // androidx.preference.Preference
    public void a(dbh dbhVar) {
        super.a(dbhVar);
        ad(dbhVar.B(R.id.switchWidget));
        ac(dbhVar);
    }

    @Override // androidx.preference.Preference
    public final void eW(View view) {
        F();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ad(view.findViewById(R.id.switchWidget));
            ab(view.findViewById(android.R.id.summary));
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new dbl(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.m, i, i2);
        o(clc.M(typedArrayObtainStyledAttributes, 7, 0));
        l(clc.M(typedArrayObtainStyledAttributes, 6, 1));
        this.c = clc.M(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.d = clc.M(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = clc.N(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
