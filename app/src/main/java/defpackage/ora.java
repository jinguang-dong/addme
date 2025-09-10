package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ora extends oix implements opv {
    public static final Parcelable.Creator CREATOR = new oks(8);
    public final String a;
    public final List b;
    private final Object c = new Object();
    private Set d = null;

    public ora(String str, List list) {
        this.a = str;
        this.b = list;
        ojl.ay(str);
        ojl.ay(list);
    }

    @Override // defpackage.opv
    public final Set a() {
        Set set;
        synchronized (this.c) {
            if (this.d == null) {
                this.d = new HashSet(this.b);
            }
            set = this.d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ora oraVar = (ora) obj;
        String str = this.a;
        if (str == null ? oraVar.a != null : !str.equals(oraVar.a)) {
            return false;
        }
        List list = this.b;
        return list == null ? oraVar.b == null : list.equals(oraVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        List list = this.b;
        return ((iHashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, str);
        ojl.N(parcel, 3, this.b);
        ojl.w(parcel, iU);
    }

    public final String toString() {
        return "CapabilityInfo{" + this.a + GdpuLBytnYW.iqxGcys + String.valueOf(this.b) + "}";
    }
}
