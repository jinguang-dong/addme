package androidx.compose.ui.draw;

import defpackage.a;
import defpackage.aaw;
import defpackage.bij;
import defpackage.bkr;
import defpackage.bkv;
import defpackage.blp;
import defpackage.bwa;
import defpackage.cht;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ShadowGraphicsLayerElement extends bwa {
    public final float a;
    public final blp b;
    public final boolean d = false;
    public final long e;
    public final long f;

    public ShadowGraphicsLayerElement(float f, blp blpVar, long j, long j2) {
        this.a = f;
        this.b = blpVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bkr(new aaw(this, 4));
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        bkr bkrVar = (bkr) bijVar;
        bkrVar.a = new aaw(this, 4);
        bkrVar.h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        if (!cht.b(this.a, shadowGraphicsLayerElement.a) || !a.ao(this.b, shadowGraphicsLayerElement.b)) {
            return false;
        }
        boolean z = shadowGraphicsLayerElement.d;
        long j = this.e;
        long j2 = shadowGraphicsLayerElement.e;
        long j3 = bkv.a;
        return a.q(j, j2) && a.q(this.f, shadowGraphicsLayerElement.f);
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
        long j = bkv.a;
        long j2 = this.f;
        return (((((iFloatToIntBits * 31) + a.o(false)) * 31) + a.r(this.e)) * 31) + a.r(j2);
    }

    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) cht.a(this.a)) + ", shape=" + this.b + ", clip=false, ambientColor=" + ((Object) bkv.g(this.e)) + ", spotColor=" + ((Object) bkv.g(this.f)) + ')';
    }
}
