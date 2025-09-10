package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbo {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    private final int f;

    public kbo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kbo) {
            kbo kboVar = (kbo) obj;
            if (this.a == kboVar.a && this.b == kboVar.b && this.f == kboVar.f && this.c == kboVar.c && this.d == kboVar.d && this.e == kboVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ ((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f) * 1000003) ^ this.c) * 1000003) ^ 1237) * 1000003) ^ ((int) this.d)) * 1000003);
    }

    public kbo(int i, int i2, int i3, int i4, long j, int i5) {
        this.a = i;
        this.b = i2;
        this.f = i3;
        this.c = i4;
        this.d = j;
        this.e = i5;
    }

    public final String toString() {
        return INRGuObcrHjSQz.pUF + this.a + ", " + this.b + ", " + this.f + ", " + this.c + ", false, " + this.d + ", " + this.e + "}";
    }
}
