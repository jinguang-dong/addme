package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzf {
    public final onb a;
    public final String b;

    public qzf(onb onbVar, String str) {
        str.getClass();
        this.a = onbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzf)) {
            return false;
        }
        qzf qzfVar = (qzf) obj;
        return a.ao(this.a, qzfVar.a) && a.ao(this.b, qzfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
