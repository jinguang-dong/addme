package defpackage;

import j$.nio.file.Path;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class run {
    public final int a;
    public final long b;
    public final long c;
    public final Optional d;
    public final Optional e;
    public final syw f;
    public final Path g;
    public final int h;
    public final float i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    private final int n;

    public run() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof run)) {
            return false;
        }
        run runVar = (run) obj;
        int i = this.m;
        int i2 = runVar.m;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.a == runVar.a && this.b == runVar.b && this.c == runVar.c) {
            int i3 = this.k;
            int i4 = runVar.k;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4) {
                int i5 = this.l;
                int i6 = runVar.l;
                if (i5 == 0) {
                    throw null;
                }
                if (i6 == 1 && this.d.equals(runVar.d) && this.e.equals(runVar.e) && this.f.equals(runVar.f) && this.g.equals(runVar.g) && this.h == runVar.h) {
                    if (Float.floatToIntBits(this.i) == Float.floatToIntBits(runVar.i) && this.j == runVar.j) {
                        int i7 = this.n;
                        int i8 = runVar.n;
                        if (i7 == 0) {
                            throw null;
                        }
                        if (i8 == 1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.m;
        a.aQ(i);
        int i2 = this.k;
        a.aF(i2);
        a.aF(this.l);
        long j = this.c;
        long j2 = this.b;
        int iHashCode = ((((((((((((((((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i2) * 1000003) ^ 1) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ Float.floatToIntBits(this.i);
        a.aF(this.n);
        return (((true != this.j ? 1237 : 1231) ^ (((iHashCode * 1000003) ^ 1237) * 1000003)) * 1000003) ^ 1;
    }

    public final String toString() {
        int i = this.m;
        String str = i != 1 ? i != 2 ? "null" : "BATCH" : "REALTIME";
        int i2 = this.k;
        String str2 = i2 != 1 ? i2 != 2 ? "null" : "DIRECT" : "INPUT_STREAM";
        String str3 = this.l != 1 ? "null" : "CALLBACK";
        Optional optional = this.d;
        Optional optional2 = this.e;
        syw sywVar = this.f;
        Path path = this.g;
        int i3 = this.h;
        float f = this.i;
        boolean z = this.j;
        int i4 = this.n;
        String strValueOf = String.valueOf(optional);
        String strValueOf2 = String.valueOf(optional2);
        String strValueOf3 = String.valueOf(sywVar);
        String strValueOf4 = String.valueOf(path);
        String str4 = i4 == 1 ? "ANDROID" : "null";
        long j = this.c;
        String str5 = str4;
        long j2 = this.b;
        return "{" + str + ", " + this.a + ", " + j2 + ", " + j + ", " + str2 + ", " + str3 + ", " + strValueOf + ", " + strValueOf2 + ", " + strValueOf3 + ", " + strValueOf4 + ", " + i3 + ", " + f + ", false, " + z + ", " + str5 + "}";
    }

    public run(int i, int i2, long j, long j2, int i3, Optional optional, Optional optional2, syw sywVar, Path path, int i4, float f, boolean z) {
        this.m = i;
        this.a = i2;
        this.b = j;
        this.c = j2;
        this.k = i3;
        this.l = 1;
        this.d = optional;
        this.e = optional2;
        this.f = sywVar;
        this.g = path;
        this.h = i4;
        this.i = f;
        this.j = z;
        this.n = 1;
    }
}
