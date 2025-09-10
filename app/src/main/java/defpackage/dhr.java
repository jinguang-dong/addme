package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dhr extends dht {
    public int[] a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    Paint.Cap h;
    Paint.Join i;
    float j;
    nll k;
    nll l;

    public dhr() {
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
    }

    float getFillAlpha() {
        return this.d;
    }

    int getFillColor() {
        return this.l.a;
    }

    float getStrokeAlpha() {
        return this.c;
    }

    int getStrokeColor() {
        return this.k.a;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.f;
    }

    float getTrimPathOffset() {
        return this.g;
    }

    float getTrimPathStart() {
        return this.e;
    }

    @Override // defpackage.com
    public final boolean p() {
        return this.l.h() || this.k.h();
    }

    @Override // defpackage.com
    public final boolean q(int[] iArr) {
        return this.k.i(iArr) | this.l.i(iArr);
    }

    void setFillAlpha(float f) {
        this.d = f;
    }

    void setFillColor(int i) {
        this.l.a = i;
    }

    void setStrokeAlpha(float f) {
        this.c = f;
    }

    void setStrokeColor(int i) {
        this.k.a = i;
    }

    void setStrokeWidth(float f) {
        this.b = f;
    }

    void setTrimPathEnd(float f) {
        this.f = f;
    }

    void setTrimPathOffset(float f) {
        this.g = f;
    }

    void setTrimPathStart(float f) {
        this.e = f;
    }

    public dhr(dhr dhrVar) {
        super(dhrVar);
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
        int[] iArr = dhrVar.a;
        this.a = null;
        this.k = dhrVar.k;
        this.b = dhrVar.b;
        this.c = dhrVar.c;
        this.l = dhrVar.l;
        this.o = dhrVar.o;
        this.d = dhrVar.d;
        this.e = dhrVar.e;
        this.f = dhrVar.f;
        this.g = dhrVar.g;
        this.h = dhrVar.h;
        this.i = dhrVar.i;
        this.j = dhrVar.j;
    }
}
