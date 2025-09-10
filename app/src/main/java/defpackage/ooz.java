package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ooz extends oix {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    static {
        new ooz(null, false, false);
        CREATOR = new okq(11);
    }

    public ooz(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ooz)) {
            return false;
        }
        ooz oozVar = (ooz) obj;
        return a.K(this.c, oozVar.c) && a.K(Boolean.valueOf(this.a), Boolean.valueOf(oozVar.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.N(parcel, 1, new ArrayList(this.c));
        ojl.x(parcel, 2, this.a);
        ojl.x(parcel, 3, this.b);
        ojl.w(parcel, iU);
    }
}
