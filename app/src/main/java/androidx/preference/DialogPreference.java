package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.dbb;
import defpackage.dbi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    protected void c() {
        dbb dbbVar = this.k.d;
        if (dbbVar != null) {
            dbbVar.f(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, clc.H(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.c, i, i2);
        String strM = clc.M(typedArrayObtainStyledAttributes, 9, 0);
        this.a = strM;
        if (strM == null) {
            this.a = u();
        }
        this.b = clc.M(typedArrayObtainStyledAttributes, 8, 1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        this.d = clc.M(typedArrayObtainStyledAttributes, 11, 3);
        this.e = clc.M(typedArrayObtainStyledAttributes, 10, 4);
        this.f = clc.J(typedArrayObtainStyledAttributes, 7, 5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
