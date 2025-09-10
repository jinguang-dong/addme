package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyi {
    public static final qyi a = new qyi(sfe.a);
    public final scv b;

    public qyi(scv scvVar) {
        this.b = scvVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qyi) {
            return this.b.equals(((qyi) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return ujp.ah(this.b);
    }
}
