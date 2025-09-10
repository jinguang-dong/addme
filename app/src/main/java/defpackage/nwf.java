package defpackage;

import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwf {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;

    public nwf(CharSequence charSequence, String str, String str2) {
        this.a = charSequence == null ? Button.class.getName() : charSequence;
        this.b = str == null ? "" : str;
        this.c = str2 == null ? "" : str2;
    }

    public final CharSequence a() {
        CharSequence charSequence = this.b;
        if (charSequence.length() == 0) {
            return null;
        }
        CharSequence charSequence2 = this.c;
        if (charSequence2.length() == 0) {
            return charSequence;
        }
        return charSequence.toString() + ", " + charSequence2.toString();
    }

    public final String toString() {
        CharSequence charSequence = this.c;
        CharSequence charSequence2 = this.b;
        return "State{className=" + String.valueOf(this.a) + ", primaryText=" + charSequence2.toString() + ", secondaryText=" + charSequence.toString() + ", isCheckable=true}";
    }
}
