package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atp {
    public final apu a;
    public final apu b;
    private final apu c;

    public atp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atp)) {
            return false;
        }
        atp atpVar = (atp) obj;
        return a.ao(this.a, atpVar.a) && a.ao(this.c, atpVar.c) && a.ao(this.b, atpVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.c + ", large=" + this.b + ')';
    }

    public /* synthetic */ atp(byte[] bArr) {
        apz apzVarA = aqa.a(4.0f);
        apz apzVarA2 = aqa.a(4.0f);
        apz apzVarA3 = aqa.a(0.0f);
        this.a = apzVarA;
        this.c = apzVarA2;
        this.b = apzVarA3;
    }
}
