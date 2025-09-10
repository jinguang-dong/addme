package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kgs {
    public final jtj a;
    public final kfg b;
    public final syu c;
    public final Future d;

    public kgs() {
        throw null;
    }

    public final void a() {
        this.b.close();
        this.c.cancel(true);
        this.d.cancel(true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kgs) {
            kgs kgsVar = (kgs) obj;
            if (this.a.equals(kgsVar.a) && this.b.equals(kgsVar.b) && this.c.equals(kgsVar.c) && this.d.equals(kgsVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public kgs(jtj jtjVar, kfg kfgVar, syu syuVar, Future future) {
        this.a = jtjVar;
        this.b = kfgVar;
        this.c = syuVar;
        this.d = future;
    }

    public final String toString() {
        Future future = this.d;
        syu syuVar = this.c;
        kfg kfgVar = this.b;
        return nWEkBGOQPWQp.RXpriHUAdUL + String.valueOf(this.a) + ", " + String.valueOf(kfgVar) + ", " + String.valueOf(syuVar) + ", " + String.valueOf(future) + "}";
    }
}
