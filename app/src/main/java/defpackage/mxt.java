package defpackage;

import android.graphics.RectF;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxt {
    public static final mxt a;
    public final Size b;
    public final Size c;
    public final Size d;
    public final Size e;
    public final Integer f;
    public final RectF g;
    public final mxm h;
    public final nkw i;
    public final mxj j;

    static {
        mxs mxsVar = new mxs();
        mxsVar.e = new RectF();
        mxsVar.c();
        mxsVar.d(nkw.UNINITIALIZED);
        mxsVar.e(mxm.PORTRAIT);
        mxsVar.b(mxj.PHONE_LAYOUT);
        a = mxsVar.a();
    }

    public mxt() {
        throw null;
    }

    public final boolean a() {
        return (this.b == null || this.d == null || this.f == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxt) {
            mxt mxtVar = (mxt) obj;
            Size size = this.b;
            if (size != null ? size.equals(mxtVar.b) : mxtVar.b == null) {
                Size size2 = this.c;
                if (size2 != null ? size2.equals(mxtVar.c) : mxtVar.c == null) {
                    Size size3 = this.d;
                    if (size3 != null ? size3.equals(mxtVar.d) : mxtVar.d == null) {
                        Size size4 = this.e;
                        if (size4 != null ? size4.equals(mxtVar.e) : mxtVar.e == null) {
                            Integer num = this.f;
                            if (num != null ? num.equals(mxtVar.f) : mxtVar.f == null) {
                                if (this.g.equals(mxtVar.g) && this.h.equals(mxtVar.h) && this.i.equals(mxtVar.i) && this.j.equals(mxtVar.j)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Size size = this.b;
        int iHashCode = size == null ? 0 : size.hashCode();
        Size size2 = this.c;
        int iHashCode2 = size2 == null ? 0 : size2.hashCode();
        int i = iHashCode ^ 1000003;
        Size size3 = this.d;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (size3 == null ? 0 : size3.hashCode())) * 1000003;
        Size size4 = this.e;
        int iHashCode4 = (iHashCode3 ^ (size4 == null ? 0 : size4.hashCode())) * 1000003;
        Integer num = this.f;
        return this.j.hashCode() ^ ((((((((((iHashCode4 ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ 1237) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003);
    }

    public final String toString() {
        mxj mxjVar = this.j;
        nkw nkwVar = this.i;
        mxm mxmVar = this.h;
        RectF rectF = this.g;
        Size size = this.e;
        Size size2 = this.d;
        Size size3 = this.c;
        return "{" + String.valueOf(this.b) + ", " + String.valueOf(size3) + ", " + String.valueOf(size2) + ", " + String.valueOf(size) + ", " + this.f + ", false, " + String.valueOf(rectF) + ", " + String.valueOf(mxmVar) + ", " + String.valueOf(nkwVar) + ", " + String.valueOf(mxjVar) + "}";
    }

    public mxt(Size size, Size size2, Size size3, Size size4, Integer num, RectF rectF, mxm mxmVar, nkw nkwVar, mxj mxjVar) {
        this.b = size;
        this.c = size2;
        this.d = size3;
        this.e = size4;
        this.f = num;
        this.g = rectF;
        this.h = mxmVar;
        this.i = nkwVar;
        this.j = mxjVar;
    }
}
