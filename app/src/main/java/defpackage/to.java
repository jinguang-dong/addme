package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class to implements rc {
    private final boolean a;
    private final long b;
    private final int c;
    private final sy d;

    public to(sy syVar, long j) {
        syVar.getClass();
        this.d = syVar;
        this.a = false;
        this.b = j;
        this.c = 0;
    }

    @Override // defpackage.rc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to)) {
            return false;
        }
        to toVar = (to) obj;
        if (!a.ao(this.d, toVar.d)) {
            return false;
        }
        boolean z = toVar.a;
        if (!a.q(this.b, toVar.b)) {
            return false;
        }
        int i = toVar.c;
        return true;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() * 31) + 1237) * 31) + a.r(this.b)) * 31;
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.d + ", wasImageCaptured=false, frameNumber=" + ((Object) qd.a(this.b)) + ", reason=0)";
    }
}
