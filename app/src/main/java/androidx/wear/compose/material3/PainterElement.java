package androidx.wear.compose.material3;

import defpackage.a;
import defpackage.bie;
import defpackage.bij;
import defpackage.bne;
import defpackage.brk;
import defpackage.bwa;
import defpackage.dps;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PainterElement extends bwa {
    private final bne a;
    private final brk b;
    private final bie d;

    public PainterElement(bne bneVar, brk brkVar, bie bieVar) {
        this.a = bneVar;
        this.b = brkVar;
        this.d = bieVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new dps(this.a, this.d, this.b);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((dps) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return a.ao(this.a, painterElement.a) && a.ao(this.b, painterElement.b) && a.ao(this.d, painterElement.d);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", contentScale=" + this.b + ", alignment=" + this.d + ')';
    }
}
