package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.dah;
import defpackage.dbi;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] g;
    public final CharSequence[] h;
    public final Set i;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iH = clc.H(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iH, 0);
        this.i = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.f, iH, 0);
        this.g = clc.P(typedArrayObtainStyledAttributes, 2, 0);
        this.h = clc.P(typedArrayObtainStyledAttributes, 3, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable dy() {
        Parcelable parcelableDy = super.dy();
        if (this.v) {
            return parcelableDy;
        }
        dah dahVar = new dah(parcelableDy);
        dahVar.a = this.i;
        return dahVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(dah.class)) {
            super.g(parcelable);
            return;
        }
        dah dahVar = (dah) parcelable;
        super.g(dahVar.getSuperState());
        k(dahVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        k(w((Set) obj));
    }

    public final void k(Set set) {
        Set set2 = this.i;
        set2.clear();
        set2.addAll(set);
        if (V() && !set.equals(w(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putStringSet(this.r, set);
            super.P(editorB);
        }
        d();
    }
}
