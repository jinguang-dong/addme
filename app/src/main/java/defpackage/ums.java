package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ums {
    public final Object a;
    public final umj b;
    public final uiv c;
    public final Object d;
    public final Throwable e;

    public ums(Object obj, umj umjVar, uiv uivVar, Throwable th) {
        this.a = obj;
        this.b = umjVar;
        this.c = uivVar;
        this.d = null;
        this.e = th;
    }

    public static /* synthetic */ ums b(ums umsVar, umj umjVar, Throwable th, int i) {
        Object obj = (i & 1) != 0 ? umsVar.a : null;
        if ((i & 2) != 0) {
            umjVar = umsVar.b;
        }
        uiv uivVar = (i & 4) != 0 ? umsVar.c : null;
        if ((i & 8) != 0) {
            Object obj2 = umsVar.d;
        }
        if ((i & 16) != 0) {
            th = umsVar.e;
        }
        return new ums(obj, umjVar, uivVar, th);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ums)) {
            return false;
        }
        ums umsVar = (ums) obj;
        if (!a.ao(this.a, umsVar.a) || !a.ao(this.b, umsVar.b) || !a.ao(this.c, umsVar.c)) {
            return false;
        }
        Object obj2 = umsVar.d;
        return a.ao(null, null) && a.ao(this.e, umsVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        umj umjVar = this.b;
        int iHashCode2 = umjVar == null ? 0 : umjVar.hashCode();
        int i = iHashCode * 31;
        uiv uivVar = this.c;
        int iHashCode3 = uivVar == null ? 0 : uivVar.hashCode();
        int i2 = (i + iHashCode2) * 31;
        Throwable th = this.e;
        return ((i2 + iHashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public /* synthetic */ ums(Object obj, umj umjVar, uiv uivVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : umjVar, (i & 4) != 0 ? null : uivVar, (i & 16) != 0 ? null : th);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ibINv.FHGJMKRYvxLhq + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + mPfBwqXsnpXI.KTurjVKenco;
    }
}
