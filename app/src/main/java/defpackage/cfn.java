package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfn implements cfl {
    private final String a = "wght";
    private final int b;

    public cfn(int i) {
        this.b = i;
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
        if (!(obj instanceof cfn)) {
            return false;
        }
        cfn cfnVar = (cfn) obj;
        return a.ao(this.a, cfnVar.a) && this.b == cfnVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ')';
    }

    @Override // defpackage.cfl
    public final void b() {
    }
}
