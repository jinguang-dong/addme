package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class upv extends upw implements unk {
    public final Handler a;
    public final upv b;
    private final String c;
    private final boolean d;

    public upv(Handler handler, String str) {
        this(handler, str, false);
    }

    private final void j(uhf uhfVar, Runnable runnable) {
        ujp.S(uhfVar, new CancellationException(a.bz(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        una unaVar = unr.a;
        uwm.a.a(uhfVar, runnable);
    }

    @Override // defpackage.una
    public final void a(uhf uhfVar, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        j(uhfVar, runnable);
    }

    @Override // defpackage.unk
    public final void c(long j, umk umkVar) {
        pev pevVar = new pev(umkVar, this, 19);
        if (this.a.postDelayed(pevVar, ukc.r(j, 4611686018427387903L))) {
            umkVar.d(new upu(this, pevVar, 0));
        } else {
            j(((uml) umkVar).b, pevVar);
        }
    }

    @Override // defpackage.una
    public final boolean dw(uhf uhfVar) {
        if (this.d) {
            return !a.ao(Looper.myLooper(), this.a.getLooper());
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof upv)) {
            return false;
        }
        upv upvVar = (upv) obj;
        return upvVar.a == this.a && upvVar.d == this.d;
    }

    @Override // defpackage.upw, defpackage.unk
    public final unt h(long j, final Runnable runnable, uhf uhfVar) {
        if (this.a.postDelayed(runnable, j)) {
            return new unt() { // from class: upt
                @Override // defpackage.unt
                public final void fL() {
                    this.a.a.removeCallbacks(runnable);
                }
            };
        }
        j(uhfVar, runnable);
        return upc.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) ^ (true != this.d ? 1237 : 1231);
    }

    @Override // defpackage.uoz
    public final /* synthetic */ uoz i() {
        return this.b;
    }

    @Override // defpackage.uoz, defpackage.una
    public final String toString() {
        String strE = e();
        if (strE == null) {
            strE = this.c;
            if (strE == null) {
                strE = this.a.toString();
            }
            if (this.d) {
                return String.valueOf(strE).concat(".immediate");
            }
        }
        return strE;
    }

    private upv(Handler handler, String str, boolean z) {
        this.a = handler;
        this.c = str;
        this.d = z;
        this.b = z ? this : new upv(handler, str, true);
    }
}
