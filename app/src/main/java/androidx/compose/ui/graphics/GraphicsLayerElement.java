package androidx.compose.ui.graphics;

import defpackage.a;
import defpackage.akg;
import defpackage.bij;
import defpackage.bko;
import defpackage.bkp;
import defpackage.bkv;
import defpackage.bkw;
import defpackage.blp;
import defpackage.blq;
import defpackage.blt;
import defpackage.bwa;
import defpackage.bwi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends bwa {
    private final float a;
    private final float b;
    private final float d;
    private final float g;
    private final float j;
    private final float k;
    private final long l;
    private final blp m;
    private final boolean n;
    private final long o;
    private final long p;
    private final float e = 0.0f;
    private final float f = 0.0f;
    private final float h = 0.0f;
    private final float i = 0.0f;
    private final akg t = null;
    private final int q = 0;
    private final int r = 3;
    private final bkw s = null;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, long j, blp blpVar, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.d = f3;
        this.g = f4;
        this.j = f5;
        this.k = f6;
        this.l = j;
        this.m = blpVar;
        this.n = z;
        this.o = j2;
        this.p = j3;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new blq(this.a, this.b, this.d, this.g, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        blq blqVar = (blq) bijVar;
        blqVar.a = this.a;
        blqVar.b = this.b;
        blqVar.c = this.d;
        blqVar.d = this.g;
        blqVar.e = this.j;
        blqVar.f = this.k;
        blqVar.g = this.l;
        blqVar.h = this.m;
        blqVar.i = this.n;
        blqVar.j = this.o;
        blqVar.k = this.p;
        blqVar.l = 3;
        bwi bwiVar = bko.C(blqVar, 2).v;
        if (bwiVar != null) {
            bwiVar.ao(blqVar.x, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.a, graphicsLayerElement.a) != 0 || Float.compare(this.b, graphicsLayerElement.b) != 0 || Float.compare(this.d, graphicsLayerElement.d) != 0) {
            return false;
        }
        float f = graphicsLayerElement.e;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f2 = graphicsLayerElement.f;
        if (Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.g, graphicsLayerElement.g) != 0) {
            return false;
        }
        float f3 = graphicsLayerElement.h;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f4 = graphicsLayerElement.i;
        if (Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.j, graphicsLayerElement.j) != 0 || Float.compare(this.k, graphicsLayerElement.k) != 0) {
            return false;
        }
        long j = this.l;
        long j2 = graphicsLayerElement.l;
        long j3 = blt.a;
        if (!a.q(j, j2) || !a.ao(this.m, graphicsLayerElement.m) || this.n != graphicsLayerElement.n) {
            return false;
        }
        akg akgVar = graphicsLayerElement.t;
        if (!a.ao(null, null)) {
            return false;
        }
        long j4 = this.o;
        long j5 = graphicsLayerElement.o;
        long j6 = bkv.a;
        if (!a.q(j4, j5) || !a.q(this.p, graphicsLayerElement.p)) {
            return false;
        }
        int i = graphicsLayerElement.q;
        if (!a.p(0, 0)) {
            return false;
        }
        int i2 = graphicsLayerElement.r;
        if (!a.p(3, 3)) {
            return false;
        }
        bkw bkwVar = graphicsLayerElement.s;
        return a.ao(null, null);
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k);
        long j = blt.a;
        int iR = (((iFloatToIntBits * 31) + a.r(this.l)) * 31) + this.m.hashCode();
        long j2 = bkv.a;
        return ((((((((iR * 31) + a.o(this.n)) * 961) + a.r(this.o)) * 31) + a.r(this.p)) * 961) + 3) * 31;
    }

    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.d + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.g + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.j + ", cameraDistance=" + this.k + ", transformOrigin=" + ((Object) blt.a(this.l)) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=null, ambientShadowColor=" + ((Object) bkv.g(this.o)) + ", spotShadowColor=" + ((Object) bkv.g(this.p)) + ", compositingStrategy=CompositingStrategy(value=0), blendMode=" + ((Object) bkp.a(3)) + ", colorFilter=null)";
    }
}
