package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpd {
    public final hpa a;
    private final nms b;

    public hpd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hpd) {
            hpd hpdVar = (hpd) obj;
            if (this.a.equals(hpdVar.a) && this.b.equals(hpdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public hpd(hpa hpaVar, nms nmsVar) {
        hpaVar.getClass();
        this.a = hpaVar;
        nmsVar.getClass();
        this.b = nmsVar;
    }

    public final String toString() {
        nms nmsVar = this.b;
        return "{" + this.a.toString() + ", " + nmsVar.toString() + INRGuObcrHjSQz.hlohyGHtT;
    }
}
