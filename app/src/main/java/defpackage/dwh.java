package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwh extends cpn {
    public final dvx a;

    public dwh(dvx dvxVar) {
        super(null);
        this.a = dvxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dwh) obj).a);
    }

    public final int hashCode() {
        return 3096683 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public dwh() {
        this(dvx.a);
    }
}
