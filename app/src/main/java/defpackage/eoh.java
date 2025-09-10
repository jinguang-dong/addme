package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eoh {
    public final Drawable a;
    public final Drawable b;
    public final String c;
    public final String d;

    public eoh(Drawable drawable, Drawable drawable2, String str, String str2) {
        this.a = drawable;
        this.b = drawable2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoh)) {
            return false;
        }
        eoh eohVar = (eoh) obj;
        return a.ao(this.a, eohVar.a) && a.ao(this.b, eohVar.b) && a.ao(this.c, eohVar.c) && a.ao(this.d, eohVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "CollapseButtonResources(collapseIcon=" + this.a + ", expandIcon=" + this.b + ", collapseText=" + this.c + ", expandText=" + this.d + ")";
    }
}
