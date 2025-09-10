package defpackage;

import android.media.CamcorderProfile;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public oxy() {
        throw null;
    }

    public static oxx a(CamcorderProfile camcorderProfile) {
        oxx oxxVar = new oxx();
        oxxVar.b(camcorderProfile.audioBitRate);
        oxxVar.c(camcorderProfile.audioChannels);
        oxxVar.d(camcorderProfile.audioCodec);
        oxxVar.e(camcorderProfile.audioSampleRate);
        oxxVar.f(camcorderProfile.fileFormat);
        oxxVar.g(camcorderProfile.quality);
        oxxVar.h(camcorderProfile.videoBitRate);
        oxxVar.i(camcorderProfile.videoCodec);
        oxxVar.k(-1);
        oxxVar.j(-1);
        oxxVar.l(camcorderProfile.videoFrameHeight);
        oxxVar.m(camcorderProfile.videoFrameRate);
        oxxVar.n(camcorderProfile.videoFrameWidth);
        return oxxVar;
    }

    public static oxx b(oxy oxyVar) {
        oxx oxxVar = new oxx();
        oxxVar.b(oxyVar.a);
        oxxVar.c(oxyVar.b);
        oxxVar.d(oxyVar.c);
        oxxVar.e(oxyVar.d);
        oxxVar.f(oxyVar.e);
        oxxVar.g(oxyVar.f);
        oxxVar.h(oxyVar.g);
        oxxVar.i(oxyVar.h);
        oxxVar.k(oxyVar.i);
        oxxVar.j(oxyVar.j);
        oxxVar.l(oxyVar.k);
        oxxVar.m(oxyVar.l);
        oxxVar.n(oxyVar.m);
        return oxxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oxy) {
            oxy oxyVar = (oxy) obj;
            if (this.a == oxyVar.a && this.b == oxyVar.b && this.c == oxyVar.c && this.d == oxyVar.d && this.e == oxyVar.e && this.f == oxyVar.f && this.g == oxyVar.g && this.h == oxyVar.h && this.i == oxyVar.i && this.j == oxyVar.j && this.k == oxyVar.k && this.l == oxyVar.l && this.m == oxyVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.m ^ ((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + ", " + this.k + ", " + this.l + ", " + this.m + "}";
    }

    public oxy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
    }
}
