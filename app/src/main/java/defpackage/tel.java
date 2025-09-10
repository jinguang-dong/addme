package defpackage;

import android.graphics.Bitmap;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tel implements paq {
    public final Bitmap a;
    public final float b;
    public final float c;
    public final sbp d;
    public final foi e;

    public tel() {
        throw null;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.e.b();
        Collection.EL.stream(this.d).forEach(new tch(10));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tel) {
            tel telVar = (tel) obj;
            if (this.e.equals(telVar.e) && this.a.equals(telVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(telVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(telVar.c) && ujp.aH(this.d, telVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c);
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        sbp sbpVar = this.d;
        Bitmap bitmap = this.a;
        return "{" + this.e.toString() + ", " + bitmap.toString() + ", " + this.b + ", " + this.c + ", " + sbpVar.toString() + "}";
    }

    public tel(foi foiVar, Bitmap bitmap, float f, float f2, sbp sbpVar) {
        this.e = foiVar;
        this.a = bitmap;
        this.b = f;
        this.c = f2;
        sbpVar.getClass();
        this.d = sbpVar;
    }
}
