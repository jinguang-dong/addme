package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krr {
    public final ksa a;
    public final Drawable b;
    public final String c;
    public final String d;

    public krr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof krr) {
            krr krrVar = (krr) obj;
            if (this.a.equals(krrVar.a) && this.b.equals(krrVar.b) && this.c.equals(krrVar.c) && this.d.equals(krrVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Drawable drawable = this.b;
        return "{" + this.a.toString() + ", " + drawable.toString() + ", " + this.c + ", " + this.d + "}";
    }

    public krr(ksa ksaVar, Drawable drawable, String str, String str2) {
        ksaVar.getClass();
        this.a = ksaVar;
        drawable.getClass();
        this.b = drawable;
        str.getClass();
        this.c = str;
        str2.getClass();
        this.d = str2;
    }
}
