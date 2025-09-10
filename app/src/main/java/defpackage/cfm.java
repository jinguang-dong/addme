package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfm implements cfl {
    private final String a;
    private final float b;

    public cfm(String str, float f) {
        this.a = str;
        this.b = f;
    }

    @Override // defpackage.cfl
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cfl
    public final float c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cfm) {
            cfm cfmVar = (cfm) obj;
            if (a.ao(this.a, cfmVar.a) && this.b == cfmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ')';
    }

    @Override // defpackage.cfl
    public final void b() {
    }
}
