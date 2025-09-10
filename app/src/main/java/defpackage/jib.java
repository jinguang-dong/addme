package defpackage;

import android.location.Location;
import android.location.LocationManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jib implements jic {
    public final uem a;
    public LocationManager b;
    public final jia[] c = {new jia("gps"), new jia("network")};
    private boolean d;

    public jib(uem uemVar) {
        this.a = uemVar;
    }

    @Override // defpackage.jic
    public final syu a() {
        szh szhVar = new szh();
        int i = 0;
        while (true) {
            jia[] jiaVarArr = this.c;
            if (i >= 2) {
                szhVar.e(null);
                return szhVar;
            }
            jia jiaVar = jiaVarArr[i];
            Location location = jiaVar.b ? jiaVar.a : null;
            if (location != null) {
                szhVar.e(location);
                return szhVar;
            }
            i++;
        }
    }

    @Override // defpackage.jic
    public final void c(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        if (z) {
            ojl.ce().execute(new jcq(this, 14));
            return;
        }
        if (this.b == null) {
            return;
        }
        int i = 0;
        while (true) {
            jia[] jiaVarArr = this.c;
            if (i >= 2) {
                return;
            }
            try {
                this.b.removeUpdates(jiaVarArr[i]);
            } catch (Exception unused) {
            }
            i++;
        }
    }
}
