package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.dae;
import defpackage.daf;
import defpackage.dao;
import defpackage.dbi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ListPreference extends DialogPreference {
    private String F;
    private boolean G;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    protected final Parcelable dy() {
        Parcelable parcelableDy = super.dy();
        if (this.v) {
            return parcelableDy;
        }
        dae daeVar = new dae(parcelableDy);
        daeVar.a = this.i;
        return daeVar;
    }

    public void e(int i) {
        CharSequence[] charSequenceArr = this.h;
        if (charSequenceArr != null) {
            o(charSequenceArr[i].toString());
        }
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(dae.class)) {
            super.g(parcelable);
            return;
        }
        dae daeVar = (dae) parcelable;
        super.g(daeVar.getSuperState());
        o(daeVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        o(v((String) obj));
    }

    public final int k(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.h) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final CharSequence l() {
        CharSequence[] charSequenceArr;
        int iK = k(this.i);
        if (iK < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[iK];
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        dao daoVar = this.D;
        if (daoVar != null) {
            return daoVar.a(this);
        }
        CharSequence charSequenceL = l();
        CharSequence charSequenceM = super.m();
        String str = this.F;
        if (str != null) {
            if (charSequenceL == null) {
                charSequenceL = "";
            }
            String str2 = String.format(str, charSequenceL);
            if (!TextUtils.equals(str2, charSequenceM)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceM;
    }

    @Override // androidx.preference.Preference
    public final void n(CharSequence charSequence) {
        super.n(charSequence);
        if (charSequence == null) {
            this.F = null;
        } else {
            this.F = charSequence.toString();
        }
    }

    public final void o(String str) {
        boolean zEquals = TextUtils.equals(this.i, str);
        if (zEquals && this.G) {
            return;
        }
        this.i = str;
        this.G = true;
        Y(str);
        if (zEquals) {
            return;
        }
        d();
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, clc.H(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.e, i, i2);
        this.g = clc.P(typedArrayObtainStyledAttributes, 3, 0);
        this.h = clc.P(typedArrayObtainStyledAttributes, 4, 1);
        if (clc.N(typedArrayObtainStyledAttributes, 7, 7, false)) {
            if (daf.a == null) {
                daf.a = new daf(0);
            }
            M(daf.a);
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, dbi.g, i, i2);
        this.F = clc.M(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }
}
