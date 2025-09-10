package defpackage;

import com.google.vr.audio.Cf.qcjAcSmlN;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final cch g;

    public ccy(cch cchVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.g = cchVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = f2;
    }

    public final float a(float f) {
        return f + this.e;
    }

    public final int b(int i) {
        return i + this.a;
    }

    public final int c(int i) {
        return i + this.c;
    }

    public final int d(int i) {
        int i2 = this.a;
        return ukc.p(i, i2, this.b) - i2;
    }

    public final int e(int i) {
        return i - this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccy)) {
            return false;
        }
        ccy ccyVar = (ccy) obj;
        return a.ao(this.g, ccyVar.g) && this.a == ccyVar.a && this.b == ccyVar.b && this.c == ccyVar.c && this.d == ccyVar.d && Float.compare(this.e, ccyVar.e) == 0 && Float.compare(this.f, ccyVar.f) == 0;
    }

    public final bkg f(bkg bkgVar) {
        return bkgVar.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.e) & 4294967295L));
    }

    public final int hashCode() {
        return (((((((((((this.g.hashCode() * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.g + ", startIndex=" + this.a + ", endIndex=" + this.b + ", startLineIndex=" + this.c + ", endLineIndex=" + this.d + ", top=" + this.e + qcjAcSmlN.OKOTZcxoPhn + this.f + ')';
    }
}
