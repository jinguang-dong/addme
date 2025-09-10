package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwf extends cpn {
    public final dvx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwf() {
        super(null);
        dvx dvxVar = dvx.a;
        this.a = dvxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dwf) obj).a);
    }

    public final int hashCode() {
        return 3096621 + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
