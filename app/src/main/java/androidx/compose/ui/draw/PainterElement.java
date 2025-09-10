package androidx.compose.ui.draw;

import defpackage.a;
import defpackage.bie;
import defpackage.bij;
import defpackage.bjl;
import defpackage.bko;
import defpackage.bkw;
import defpackage.bne;
import defpackage.brk;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PainterElement extends bwa {
    private final bne a;
    private final boolean b;
    private final brk d;
    private final float e;
    private final bkw f;
    private final bie g;

    public PainterElement(bne bneVar, boolean z, bie bieVar, brk brkVar, float f, bkw bkwVar) {
        this.a = bneVar;
        this.b = z;
        this.g = bieVar;
        this.d = brkVar;
        this.e = f;
        this.f = bkwVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bjl(this.a, this.b, this.g, this.d, this.e, this.f);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        bjl bjlVar = (bjl) bijVar;
        boolean z = bjlVar.b;
        boolean z2 = this.b;
        boolean z3 = true;
        if (z == z2 && (!z2 || a.q(bjlVar.a.a(), this.a.a()))) {
            z3 = false;
        }
        bjlVar.a = this.a;
        bjlVar.b = z2;
        bjlVar.f = this.g;
        bjlVar.c = this.d;
        bjlVar.d = this.e;
        bjlVar.e = this.f;
        if (z3) {
            bko.u(bjlVar);
        }
        bko.x(bjlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return a.ao(this.a, painterElement.a) && this.b == painterElement.b && a.ao(this.g, painterElement.g) && a.ao(this.d, painterElement.d) && Float.compare(this.e, painterElement.e) == 0 && a.ao(this.f, painterElement.f);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + a.o(this.b)) * 31) + this.g.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e);
        bkw bkwVar = this.f;
        return (iHashCode * 31) + (bkwVar == null ? 0 : bkwVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.g + ", contentScale=" + this.d + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }
}
