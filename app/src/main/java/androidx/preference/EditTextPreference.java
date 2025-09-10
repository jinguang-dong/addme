package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.dab;
import defpackage.daf;
import defpackage.dbi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iH = clc.H(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iH, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.d, iH, 0);
        if (clc.N(typedArrayObtainStyledAttributes, 0, 0, false)) {
            if (daf.b == null) {
                daf.b = new daf(1);
            }
            M(daf.b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable dy() {
        Parcelable parcelableDy = super.dy();
        if (this.v) {
            return parcelableDy;
        }
        dab dabVar = new dab(parcelableDy);
        dabVar.a = this.g;
        return dabVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(dab.class)) {
            super.g(parcelable);
            return;
        }
        dab dabVar = (dab) parcelable;
        super.g(dabVar.getSuperState());
        i(dabVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        i(v((String) obj));
    }

    public final void i(String str) {
        boolean zJ = j();
        this.g = str;
        Y(str);
        boolean zJ2 = j();
        if (zJ2 != zJ) {
            A(zJ2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }
}
