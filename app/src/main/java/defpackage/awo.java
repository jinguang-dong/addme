package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awo {
    public final apu a;
    public final apu b;
    public final apu c;
    public final apu d;
    public final apu e;
    public final apu f;
    public final apu g;
    public final apu h;
    public avo i;

    public awo(apu apuVar, apu apuVar2, apu apuVar3, apu apuVar4, apu apuVar5, apu apuVar6, apu apuVar7, apu apuVar8) {
        this.a = apuVar;
        this.b = apuVar2;
        this.c = apuVar3;
        this.d = apuVar4;
        this.e = apuVar5;
        this.f = apuVar6;
        this.g = apuVar7;
        this.h = apuVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awo)) {
            return false;
        }
        awo awoVar = (awo) obj;
        return a.ao(this.a, awoVar.a) && a.ao(this.b, awoVar.b) && a.ao(this.c, awoVar.c) && a.ao(this.d, awoVar.d) && a.ao(this.e, awoVar.e) && a.ao(this.f, awoVar.f) && a.ao(this.g, awoVar.g) && a.ao(this.h, awoVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public awo() {
        this(awn.a, awn.b, awn.c, awn.d, awn.f, awn.e, awn.g, awn.h);
        apu apuVar = awn.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ awo(byte[] bArr) {
        this(awn.a, awn.b, awn.c, awn.d, awn.f, awn.e, awn.g, awn.h);
        apu apuVar = awn.a;
    }
}
