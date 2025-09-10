package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adj {
    public final Object a;
    public final Object b;

    public adj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final /* synthetic */ boolean a(Object obj, Object obj2) {
        return a.ao(obj, this.a) && a.ao(obj2, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adj)) {
            return false;
        }
        adj adjVar = (adj) obj;
        return a.ao(this.a, adjVar.a) && a.ao(this.b, adjVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
