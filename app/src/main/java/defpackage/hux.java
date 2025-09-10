package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hux {
    public final pas a;
    public final pas b;
    public final float c;
    public final InterleavedImageU8 d;

    public hux(pas pasVar, pas pasVar2, float f, InterleavedImageU8 interleavedImageU8) {
        this.a = pasVar;
        this.b = pasVar2;
        this.c = f;
        this.d = interleavedImageU8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hux)) {
            return false;
        }
        hux huxVar = (hux) obj;
        return a.ao(this.a, huxVar.a) && a.ao(this.b, huxVar.b) && Float.compare(this.c, huxVar.c) == 0 && a.ao(this.d, huxVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Float.floatToIntBits(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SerengetiPreviewSession(bufferSize=" + this.a + ", inputSize=" + this.b + ", inputFov=" + this.c + ", previewBuffer=" + this.d + ")";
    }
}
