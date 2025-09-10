package defpackage;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcp {
    public static final tcp a = new tcp("kUnknown");
    public static final tcp b = new tcp("kHeavy");
    public static final tcp c = new tcp("kLight");
    public static final tcp d = new tcp(clFzVRcygwbq.VAKbJwFJzyFLDrN);
    public static final tcp e = new tcp("kNotRun");
    private static int h = 0;
    public final int f;
    public final String g;

    private tcp(String str) {
        this.g = str;
        int i = h;
        h = i + 1;
        this.f = i;
    }

    public final String toString() {
        return this.g;
    }
}
