package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blq extends bij implements bve {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public long g;
    public blp h;
    public boolean i;
    public long j;
    public long k;
    public int l = 3;
    public final uiq x = new aal(this, 4);

    public blq(float f, float f2, float f3, float f4, float f5, float f6, long j, blp blpVar, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = j;
        this.h = blpVar;
        this.i = z;
        this.j = j2;
        this.k = j3;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        bte bteVarR = bsqVar.r(j);
        return bstVar.ds(bteVarR.a, bteVarR.b, ufx.a, new aat(bteVarR, this, 3, null));
    }

    @Override // defpackage.bve
    public final /* synthetic */ int c(brv brvVar, bru bruVar, int i) {
        return amo.o(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int d(brv brvVar, bru bruVar, int i) {
        return amo.p(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bve
    public final /* synthetic */ int e(brv brvVar, bru bruVar, int i) {
        return amo.q(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int f(brv brvVar, bru bruVar, int i) {
        return amo.r(this, brvVar, bruVar, i);
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha = " + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.d + LmJPKwPBa.trepPg + this.e + ", cameraDistance=" + this.f + ", transformOrigin=" + ((Object) blt.a(this.g)) + ", shape=" + this.h + ", clip=" + this.i + ", renderEffect=null, ambientShadowColor=" + ((Object) bkv.g(this.j)) + ", spotShadowColor=" + ((Object) bkv.g(this.k)) + ", compositingStrategy=CompositingStrategy(value=0), blendMode=" + ((Object) bkp.a(this.l)) + ", colorFilter=null)";
    }
}
