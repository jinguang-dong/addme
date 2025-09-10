package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ps {
    public final Executor a;
    public final Executor b;
    public final Executor c;
    public final Executor d;
    private final Handler e;
    private final una f;
    private final und g;

    public ps() {
        this(null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps)) {
            return false;
        }
        ps psVar = (ps) obj;
        if (!a.ao(this.a, psVar.a) || !a.ao(this.b, psVar.b) || !a.ao(this.c, psVar.c) || !a.ao(this.d, psVar.d)) {
            return false;
        }
        Handler handler = psVar.e;
        if (!a.ao(null, null)) {
            return false;
        }
        una unaVar = psVar.f;
        if (!a.ao(null, null)) {
            return false;
        }
        und undVar = psVar.g;
        return a.ao(null, null);
    }

    public final int hashCode() {
        Executor executor = this.a;
        int iHashCode = executor == null ? 0 : executor.hashCode();
        Executor executor2 = this.b;
        int iHashCode2 = executor2 == null ? 0 : executor2.hashCode();
        int i = iHashCode * 31;
        Executor executor3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (executor3 == null ? 0 : executor3.hashCode())) * 31;
        Executor executor4 = this.d;
        return (iHashCode3 + (executor4 != null ? executor4.hashCode() : 0)) * 29791;
    }

    public final String toString() {
        return "ThreadConfig(defaultLightweightExecutor=" + this.a + ", defaultBackgroundExecutor=" + this.b + ", defaultBlockingExecutor=" + this.c + ", defaultCameraExecutor=" + this.d + ", defaultCameraHandler=null, testOnlyDispatcher=null, testOnlyScope=null)";
    }

    public /* synthetic */ ps(Executor executor, Executor executor2, Executor executor3, Executor executor4, int i) {
        this.a = 1 == (i & 1) ? null : executor;
        this.b = (i & 2) != 0 ? null : executor2;
        this.c = (i & 4) != 0 ? null : executor3;
        this.d = (i & 8) != 0 ? null : executor4;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
