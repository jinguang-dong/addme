package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.dbh;
import defpackage.dbi;
import defpackage.dbl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwitchPreference extends TwoStatePreference {
    private final dbl c;
    private final CharSequence d;
    private final CharSequence e;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iH = clc.H(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iH, 0);
        this.c = new dbl(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.l, iH, 0);
        o(clc.M(typedArrayObtainStyledAttributes, 7, 0));
        l(clc.M(typedArrayObtainStyledAttributes, 6, 1));
        this.d = clc.M(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.e = clc.M(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = clc.N(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public void a(dbh dbhVar) {
        super.a(dbhVar);
        ad(dbhVar.B(android.R.id.switch_widget));
        ac(dbhVar);
    }

    @Override // androidx.preference.Preference
    public final void eW(View view) {
        F();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ad(view.findViewById(android.R.id.switch_widget));
            ab(view.findViewById(android.R.id.summary));
        }
    }
}
