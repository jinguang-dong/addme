package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnx implements Comparable, paq {
    public final long a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final rwc p;
    public final rwc q;
    public final rwc r;

    public lnx(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, boolean z2, rwc rwcVar, rwc rwcVar2, rwc rwcVar3) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
        this.l = f11;
        this.m = f12;
        this.n = z;
        this.o = z2;
        this.p = rwcVar;
        this.q = rwcVar2;
        this.r = rwcVar3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.a, ((lnx) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnx)) {
            return false;
        }
        lnx lnxVar = (lnx) obj;
        return this.a == lnxVar.a && Float.compare(lnxVar.b, this.b) == 0 && Float.compare(lnxVar.c, this.c) == 0 && Float.compare(lnxVar.d, this.d) == 0 && Float.compare(lnxVar.e, this.e) == 0 && Float.compare(lnxVar.f, this.f) == 0 && Float.compare(lnxVar.g, this.g) == 0 && Float.compare(lnxVar.h, this.h) == 0 && Float.compare(lnxVar.i, this.i) == 0 && Float.compare(lnxVar.j, this.j) == 0 && Float.compare(lnxVar.k, this.k) == 0 && Float.compare(lnxVar.l, this.l) == 0 && Float.compare(lnxVar.m, this.m) == 0 && Boolean.compare(lnxVar.n, this.n) == 0 && Boolean.compare(lnxVar.o, this.o) == 0;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h), Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.l), Float.valueOf(this.m), Boolean.valueOf(this.n), Boolean.valueOf(this.o));
    }

    public final String toString() {
        rwc rwcVar = this.p;
        String string = rwcVar.h() ? rwcVar.toString() : "unavailable";
        rwc rwcVar2 = this.q;
        String string2 = rwcVar2.h() ? rwcVar2.toString() : "unavailable";
        rwc rwcVar3 = this.r;
        String string3 = rwcVar3.h() ? rwcVar3.toString() : "unavailable";
        boolean z = this.o;
        boolean z2 = this.n;
        float f = this.m;
        float f2 = this.l;
        float f3 = this.k;
        float f4 = this.j;
        float f5 = this.i;
        float f6 = this.h;
        float f7 = this.g;
        float f8 = this.f;
        float f9 = this.e;
        float f10 = this.d;
        String str = string3;
        float f11 = this.c;
        String str2 = string2;
        float f12 = this.b;
        return "FrameQualityScore{timestampNs=" + this.a + ", topShotScore=" + f12 + ", autoExposureStability=" + f11 + ", autoFocusStability=" + f10 + ", autoWhiteBalanceStability=" + f9 + ", faceCount=" + f8 + ", facePosition=" + f7 + ", faceQuality=" + f6 + ", globalMotionSharpness=" + f5 + ", lensStability=" + f4 + ", subjectMotion=" + f3 + ", straightness=" + f2 + ", aesthetic=" + f + ", shouldSkipUnscoredFaceFrame=" + z2 + ", shouldSkipUnscoredNonfaceFrame=" + z + ", smartCaptureFrameQualityScore=" + string + ", cameraPose=" + str2 + ", aestheticEmbeddings=" + str + "}";
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }
}
