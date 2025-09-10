package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tu {
    public final rq a;
    public final pk b;

    public /* synthetic */ tu(rq rqVar, pk pkVar, int i) {
        this.a = 1 == (i & 1) ? null : rqVar;
        this.b = (i & 2) != 0 ? null : pkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu)) {
            return false;
        }
        tu tuVar = (tu) obj;
        return a.ao(this.a, tuVar.a) && a.ao(this.b, tuVar.b);
    }

    public final int hashCode() {
        rq rqVar = this.a;
        int iHashCode = rqVar == null ? 0 : rqVar.hashCode();
        pk pkVar = this.b;
        return (iHashCode * 31) + (pkVar != null ? pkVar.a : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.a + ", errorCode=" + this.b + ')';
    }
}
