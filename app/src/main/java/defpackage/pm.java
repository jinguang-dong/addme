package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pm {
    public final byi c;
    private final boolean d = false;
    public final boolean a = true;
    private final Boolean e = null;
    public final int b = 0;
    private final boolean f = false;
    private final boolean g = false;
    private final boolean h = false;

    public pm(byi byiVar) {
        this.c = byiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm)) {
            return false;
        }
        pm pmVar = (pm) obj;
        boolean z = pmVar.d;
        boolean z2 = pmVar.a;
        if (!a.ao(this.c, pmVar.c)) {
            return false;
        }
        Boolean bool = pmVar.e;
        if (!a.ao(null, null)) {
            return false;
        }
        int i = pmVar.b;
        if (!a.p(0, 0)) {
            return false;
        }
        boolean z3 = pmVar.f;
        boolean z4 = pmVar.g;
        boolean z5 = pmVar.h;
        return true;
    }

    public final int hashCode() {
        return (((((((((a.o(false) * 31) + a.o(true)) * 31) + this.c.hashCode()) * 29791) + a.o(false)) * 31) + a.o(false)) * 31) + a.o(false);
    }

    public final String toString() {
        return "Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=true, awaitRepeatingRequestBeforeCapture=" + this.c + ", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=FinalizeSessionOnCloseBehavior(value=0), closeCaptureSessionOnDisconnect=false, closeCameraDeviceOnClose=false, enableRestartDelays=false)";
    }
}
