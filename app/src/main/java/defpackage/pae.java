package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pae {
    public static final pae a = j(4, 3);
    public static final pae b = j(16, 9);
    public static final pae c = j(3, 4);
    public final int d;
    public final int e;

    static {
        j(9, 16);
    }

    private pae(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public static pae g(pas pasVar) {
        return pasVar.i() ? j(pasVar.a, pasVar.b) : j(pasVar.b, pasVar.a);
    }

    public static pae h(Size size) {
        return j(size.getWidth(), size.getHeight());
    }

    public static pae i(pas pasVar) {
        return j(pasVar.a, pasVar.b);
    }

    public static pae j(int i, int i2) {
        int iIntValue = BigInteger.valueOf(i).gcd(BigInteger.valueOf(i2)).intValue();
        if (iIntValue != 0) {
            i /= iIntValue;
        }
        if (iIntValue != 0) {
            i2 /= iIntValue;
        }
        return new pae(i, i2);
    }

    public final double a() {
        return this.d / this.e;
    }

    public final float b(float f) {
        return (f * this.e) / this.d;
    }

    public final float c() {
        return this.d / this.e;
    }

    public final Rect d(Rect rect) {
        pae paeVarJ = j(rect.width(), rect.height());
        int i = paeVarJ.e;
        int i2 = paeVarJ.d;
        int i3 = this.e;
        int i4 = this.d;
        if (i * i4 <= i2 * i3) {
            int iHeight = (rect.height() * i4) / i3;
            int iWidth = rect.left + ((rect.width() - iHeight) / 2);
            return new Rect(iWidth, rect.top, iHeight + iWidth, rect.top + rect.height());
        }
        int iWidth2 = (rect.width() * i3) / i4;
        int iHeight2 = rect.top + ((rect.height() - iWidth2) / 2);
        return new Rect(rect.left, iHeight2, rect.left + rect.width(), iWidth2 + iHeight2);
    }

    public final Rect e(pas pasVar) {
        return d(new Rect(0, 0, pasVar.a, pasVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pae)) {
            return false;
        }
        pae paeVar = (pae) obj;
        return this.e == paeVar.e && this.d == paeVar.d;
    }

    public final pae f() {
        return this.d >= this.e ? this : k();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final pae k() {
        return j(this.e, this.d);
    }

    public final boolean l(pae paeVar) {
        return ((double) Math.abs(c() - paeVar.c())) < 0.025d;
    }

    public final String toString() {
        return String.format(null, "AspectRatio[%d:%d]", Integer.valueOf(this.d), Integer.valueOf(this.e));
    }
}
