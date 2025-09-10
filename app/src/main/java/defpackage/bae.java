package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class bae {
    public static final int a(yo yoVar) {
        int iA;
        int iA2 = yoVar.a(0);
        while (yoVar.b != 0 && yoVar.a(0) == iA2) {
            yoVar.g(0, yoVar.b());
            yoVar.c(yoVar.b - 1);
            int i = yoVar.b;
            int i2 = i >>> 1;
            int i3 = 0;
            while (i3 < i2) {
                int iA3 = yoVar.a(i3);
                int i4 = i3 + 1;
                int i5 = i4 + i4;
                int i6 = i5 - 1;
                int iA4 = yoVar.a(i6);
                if (i5 >= i || (iA = yoVar.a(i5)) <= iA4) {
                    if (iA4 > iA3) {
                        yoVar.g(i3, iA4);
                        yoVar.g(i6, iA3);
                        i3 = i6;
                    }
                } else if (iA > iA3) {
                    yoVar.g(i3, iA);
                    yoVar.g(i5, iA3);
                    i3 = i5;
                }
            }
        }
        return iA2;
    }

    public static final void b(yo yoVar, int i) {
        if (yoVar.b == 0 || !(yoVar.a(0) == i || yoVar.a(yoVar.b - 1) == i)) {
            int i2 = yoVar.b;
            yoVar.f(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iA = yoVar.a(i3);
                if (i <= iA) {
                    break;
                }
                yoVar.g(i2, iA);
                i2 = i3;
            }
            yoVar.g(i2, i);
        }
    }

    public static final boolean c(yo yoVar) {
        return yoVar.b != 0;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
