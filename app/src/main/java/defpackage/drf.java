package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drf {
    public dpi a;
    private final apu b;
    private final apu c;
    private final apu d;
    private final apu e;
    private final apu f;

    public drf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drf)) {
            return false;
        }
        drf drfVar = (drf) obj;
        return a.ao(this.b, drfVar.b) && a.ao(this.c, drfVar.c) && a.ao(this.d, drfVar.d) && a.ao(this.e, drfVar.e) && a.ao(this.f, drfVar.f);
    }

    public final int hashCode() {
        return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.b + ", small=" + this.c + ", medium=" + this.d + ", large=" + this.e + ", extraLarge=" + this.f + ')';
    }

    public /* synthetic */ drf(byte[] bArr) {
        apz apzVar = drd.a;
        apz apzVar2 = drd.a;
        apz apzVar3 = drd.b;
        apz apzVar4 = drd.c;
        apz apzVar5 = drd.d;
        apz apzVar6 = drd.e;
        this.b = apzVar2;
        this.c = apzVar3;
        this.d = apzVar4;
        this.e = apzVar5;
        this.f = apzVar6;
    }
}
