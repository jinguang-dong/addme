package defpackage;

import android.hardware.camera2.CaptureResult;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icv {
    public final boolean a;
    public final poe b;
    public final poe c;

    public icv() {
        throw null;
    }

    public static nzf b() {
        nzf nzfVar = new nzf();
        nzfVar.j(false);
        return nzfVar;
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean equals(Object obj) {
        poe poeVar;
        poe poeVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof icv) {
            icv icvVar = (icv) obj;
            if (this.a == icvVar.a && ((poeVar = this.b) != null ? poeVar.equals(icvVar.b) : icvVar.b == null) && ((poeVar2 = this.c) != null ? poeVar2.equals(icvVar.c) : icvVar.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        poe poeVar = this.b;
        int iHashCode = (poeVar == null ? 0 : poeVar.hashCode()) ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
        poe poeVar2 = this.c;
        return (iHashCode * 1000003) ^ (poeVar2 != null ? poeVar2.hashCode() : 0);
    }

    public icv(boolean z, poe poeVar, poe poeVar2) {
        this.a = z;
        this.b = poeVar;
        this.c = poeVar2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (a()) {
            poe poeVar = this.b;
            poeVar.getClass();
            sb.append("Main 3A debug data from frame ");
            sb.append(poeVar.d());
            sb.append(" (timestamp=");
            sb.append(poeVar.a(CaptureResult.SENSOR_TIMESTAMP));
            sb.append(GAQqzWiWWcYOgy.ifk);
            sb.append(this.a);
            sb.append("), contains debug data: ");
            sb.append(icx.a(poeVar));
            sb.append(".");
        }
        poe poeVar2 = this.c;
        if (poeVar2 != null) {
            sb.append(" Hi Res metering debug data from frame ");
            sb.append(poeVar2.d());
            sb.append(" (timestamp=");
            sb.append(poeVar2.a(CaptureResult.SENSOR_TIMESTAMP));
            sb.append("), contains debug data: ");
            sb.append(icx.a(poeVar2));
            sb.append(".");
        }
        return sb.toString();
    }
}
