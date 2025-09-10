package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alz {
    public float a;
    public boolean b;
    public ali c;
    private aln d;

    public alz() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alz)) {
            return false;
        }
        alz alzVar = (alz) obj;
        if (Float.compare(this.a, alzVar.a) != 0 || this.b != alzVar.b || !a.ao(this.c, alzVar.c)) {
            return false;
        }
        aln alnVar = alzVar.d;
        return a.ao(null, null);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        int iO = a.o(this.b);
        ali aliVar = this.c;
        return (((iFloatToIntBits + iO) * 31) + (aliVar == null ? 0 : aliVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }

    public /* synthetic */ alz(byte[] bArr) {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
        this.d = null;
    }
}
