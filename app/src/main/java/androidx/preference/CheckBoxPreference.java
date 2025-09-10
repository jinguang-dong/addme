package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.dbh;
import defpackage.dbi;
import defpackage.dbl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final dbl c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iH = clc.H(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iH, 0);
        this.c = new dbl(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.b, iH, 0);
        o(clc.M(typedArrayObtainStyledAttributes, 5, 0));
        l(clc.M(typedArrayObtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = clc.N(typedArrayObtainStyledAttributes, 3, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public void a(dbh dbhVar) {
        super.a(dbhVar);
        ad(dbhVar.B(android.R.id.checkbox));
        ac(dbhVar);
    }

    @Override // androidx.preference.Preference
    public final void eW(View view) {
        F();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ad(view.findViewById(android.R.id.checkbox));
            ab(view.findViewById(android.R.id.summary));
        }
    }
}
