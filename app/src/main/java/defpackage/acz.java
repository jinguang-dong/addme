package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acz implements aby {
    private final aby a;
    private final long b;

    public acz(aby abyVar, long j) {
        this.a = abyVar;
        this.b = j;
    }

    @Override // defpackage.aby
    public final adv a(byz byzVar) {
        return new ada(this.a.a(byzVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acz)) {
            return false;
        }
        acz aczVar = (acz) obj;
        return aczVar.b == this.b && a.ao(aczVar.a, this.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.r(this.b);
    }
}
