package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class pk {
    public final int a;

    public /* synthetic */ pk(int i) {
        this.a = i;
    }

    public static String a(int i) {
        StringBuilder sb = new StringBuilder("CameraError(");
        sb.append(a.p(i, 0) ? "ERROR_UNDETERMINED" : a.p(i, 1) ? "ERROR_CAMERA_IN_USE" : a.p(i, 2) ? "ERROR_CAMERA_LIMIT_EXCEEDED" : a.p(i, 3) ? "ERROR_CAMERA_DISABLED" : a.p(i, 4) ? "ERROR_CAMERA_DEVICE" : a.p(i, 5) ? "ERROR_CAMERA_SERVICE" : a.p(i, 6) ? "ERROR_CAMERA_DISCONNECTED" : a.p(i, 7) ? "ERROR_ILLEGAL_ARGUMENT_EXCEPTION" : a.p(i, 8) ? "ERROR_SECURITY_EXCEPTION" : a.p(i, 9) ? "ERROR_GRAPH_CONFIG" : a.p(i, 10) ? "ERROR_DO_NOT_DISTURB_ENABLED" : a.p(i, 11) ? "ERROR_UNKNOWN_EXCEPTION" : a.p(i, 12) ? "ERROR_CAMERA_OPENER" : "ERROR_UNKNOWN");
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pk) && this.a == ((pk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
