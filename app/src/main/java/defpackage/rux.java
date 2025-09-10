package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rux {
    private static final Duration i = Duration.ofSeconds(3);
    private static final Duration j = Duration.ofSeconds(1);
    public final int a;
    public final boolean b;
    public final Duration c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Duration h;
    private final int k;

    public rux() {
        throw null;
    }

    public static ruw a() {
        ruw ruwVar = new ruw();
        ruwVar.b(20);
        ruwVar.a = true;
        byte b = ruwVar.i;
        ruwVar.i = (byte) (b | 2);
        Duration duration = i;
        duration.getClass();
        ruwVar.b = duration;
        ruwVar.c = 30;
        ruwVar.d = 20;
        ruwVar.e = 50;
        ruwVar.f = 15;
        ruwVar.g = 25;
        ruwVar.i = (byte) (b | 126);
        Duration duration2 = j;
        duration2.getClass();
        ruwVar.h = duration2;
        return ruwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rux) {
            rux ruxVar = (rux) obj;
            if (this.a == ruxVar.a && this.b == ruxVar.b && this.c.equals(ruxVar.c) && this.k == ruxVar.k && this.d == ruxVar.d && this.e == ruxVar.e && this.f == ruxVar.f && this.g == ruxVar.g && this.h.equals(ruxVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() ^ (((((((((((((((true != this.b ? 1237 : 1231) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.k) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003);
    }

    public final String toString() {
        Duration duration = this.h;
        return "{" + this.a + ", " + this.b + ", " + String.valueOf(this.c) + ", " + this.k + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + String.valueOf(duration) + "}";
    }

    public rux(int i2, boolean z, Duration duration, int i3, int i4, int i5, int i6, int i7, Duration duration2) {
        this.a = i2;
        this.b = z;
        this.c = duration;
        this.k = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = duration2;
    }
}
