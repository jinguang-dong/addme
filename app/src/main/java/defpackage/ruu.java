package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruu {
    public static final /* synthetic */ int e = 0;
    private static final rus f;
    public final int a;
    public final float b;
    public final int c;
    public final int d;
    private final int g;
    private final int h;
    private final rus i;

    static {
        rus rusVar = rus.MONOCHROME;
        f = rusVar;
        rut rutVar = new rut();
        rutVar.g(128);
        rutVar.f(128);
        rutVar.e(rusVar);
        rutVar.h(20);
        rutVar.d(16000.0f);
        rutVar.b(2);
        rutVar.c(1);
        rutVar.a();
    }

    public ruu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ruu) {
            ruu ruuVar = (ruu) obj;
            if (this.g == ruuVar.g && this.h == ruuVar.h && this.i.equals(ruuVar.i) && this.a == ruuVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(ruuVar.b) && this.c == ruuVar.c && this.d == ruuVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((((((((this.g ^ 1000003) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.a) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c) * 1000003);
    }

    public ruu(int i, int i2, rus rusVar, int i3, float f2, int i4, int i5) {
        this.g = i;
        this.h = i2;
        this.i = rusVar;
        this.a = i3;
        this.b = f2;
        this.c = i4;
        this.d = i5;
    }

    public final String toString() {
        return nWEkBGOQPWQp.dqwZmUqfHtrgJ + this.g + ", " + this.h + ", " + String.valueOf(this.i) + ", " + this.a + ", " + this.b + ", " + this.c + ", " + this.d + "}";
    }
}
