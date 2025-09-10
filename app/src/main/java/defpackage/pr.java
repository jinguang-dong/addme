package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pr {
    public final Context a;
    public final ps b;
    public final pq c;
    public final ocq d;
    public final ocq e;
    private final byi f = null;

    public pr(Context context, ps psVar, ocq ocqVar, ocq ocqVar2, pq pqVar) {
        this.a = context;
        this.b = psVar;
        this.d = ocqVar;
        this.e = ocqVar2;
        this.c = pqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr)) {
            return false;
        }
        pr prVar = (pr) obj;
        if (!a.ao(this.a, prVar.a) || !a.ao(this.b, prVar.b) || !a.ao(this.d, prVar.d) || !a.ao(this.e, prVar.e) || !a.ao(this.c, prVar.c)) {
            return false;
        }
        byi byiVar = prVar.f;
        return a.ao(null, null);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 961;
    }

    public final String toString() {
        return "Config(appContext=" + this.a + ", threadConfig=" + this.b + ", cameraMetadataConfig=" + this.d + ", cameraBackendConfig=" + this.e + ", cameraInteropConfig=" + this.c + ", imageSources=null)";
    }
}
