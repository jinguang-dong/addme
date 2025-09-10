package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dsb implements dsd {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ack f;
    public final dsf g;
    public final dsf h;
    public final dsf i;

    public dsb(float f, float f2, float f3, float f4, float f5, ack ackVar, dsf dsfVar, dsf dsfVar2, dsf dsfVar3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = ackVar;
        this.g = dsfVar;
        this.h = dsfVar2;
        this.i = dsfVar3;
        if (f2 >= f3) {
            throw new IllegalArgumentException("minElementHeight must be smaller than maxElementHeight");
        }
    }

    @Override // defpackage.dsd
    public final int a(int i, long j) {
        return Math.round((float) Math.ceil(dsg.a(chx.r(this, j), this.i, this.f) * i));
    }

    @Override // defpackage.dsd
    public final void b(blm blmVar, long j) {
        if (dln.b(j)) {
            return;
        }
        dse dseVarS = chx.s(this, j);
        blmVar.q(1);
        float f = -Float.intBitsToFloat((int) (blmVar.p & 4294967295L));
        float f2 = dseVarS.c;
        blmVar.z((f * (1.0f - f2)) / 2.0f);
        blmVar.l(dseVarS.a);
        blmVar.s(f2);
        blmVar.t(f2);
    }

    @Override // defpackage.dsd
    public final void c(blm blmVar, long j) {
        if (dln.b(j)) {
            return;
        }
        dse dseVarS = chx.s(this, j);
        blmVar.q(1);
        blmVar.l(dseVarS.b);
    }

    @Override // defpackage.dsd
    public final bne d(drj drjVar, bne bneVar, blp blpVar) {
        return new drx(new dql(this, drjVar, 5), blpVar, bneVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.ao(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dsb dsbVar = (dsb) obj;
        return this.b == dsbVar.b && this.c == dsbVar.c && this.d == dsbVar.d && this.e == dsbVar.e && a.ao(this.f, dsbVar.f) && a.ao(this.g, dsbVar.g) && a.ao(this.h, dsbVar.h) && a.ao(this.i, dsbVar.i);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.b) + 1;
        int iFloatToIntBits2 = iFloatToIntBits + (Float.floatToIntBits(this.c) * iFloatToIntBits);
        int iFloatToIntBits3 = iFloatToIntBits2 + (Float.floatToIntBits(this.d) * iFloatToIntBits2);
        int iFloatToIntBits4 = iFloatToIntBits3 + (Float.floatToIntBits(this.e) * iFloatToIntBits3);
        int iHashCode = iFloatToIntBits4 + (this.f.hashCode() * iFloatToIntBits4);
        int iHashCode2 = iHashCode + (this.g.hashCode() * iHashCode);
        int iHashCode3 = iHashCode2 + (this.h.hashCode() * iHashCode2);
        return iHashCode3 + (this.i.hashCode() * iHashCode3);
    }
}
