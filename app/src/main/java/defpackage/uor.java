package defpackage;

import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uor implements uoh {
    public final upa a;
    public final uly b;
    private final umb c;
    private final umb d;

    public uor(upa upaVar, Throwable th) {
        this.a = upaVar;
        umc umcVar = umc.a;
        this.b = new uly(false, umcVar);
        this.c = new umb(th, umcVar);
        this.d = new umb(null, umcVar);
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable) this.c.a;
    }

    public final void e(Throwable th) {
        Throwable thD = d();
        if (thD == null) {
            this.c.c(th);
            return;
        }
        if (th == thD) {
            return;
        }
        Object objC = c();
        if (objC == null) {
            f(th);
            return;
        }
        if (!(objC instanceof Throwable)) {
            if (objC instanceof ArrayList) {
                ((ArrayList) objC).add(th);
                return;
            } else {
                Objects.toString(objC);
                throw new IllegalStateException("State is ".concat(objC.toString()));
            }
        }
        if (th != objC) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(objC);
            arrayList.add(th);
            f(arrayList);
        }
    }

    public final void f(Object obj) {
        this.d.c(obj);
    }

    @Override // defpackage.uoh
    public final upa fK() {
        return this.a;
    }

    @Override // defpackage.uoh
    public final boolean fM() {
        return d() == null;
    }

    public final boolean g() {
        return d() != null;
    }

    public final boolean h() {
        return this.b.a();
    }

    public final String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + UvOvSgfD.llYnIMnVJS + c() + ", list=" + this.a + "]";
    }
}
