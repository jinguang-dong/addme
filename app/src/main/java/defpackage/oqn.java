package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqn extends oix {
    public static final Parcelable.Creator CREATOR = new okq(19);
    public final String a;
    private final boolean b;

    public oqn(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqn)) {
            return false;
        }
        oqn oqnVar = (oqn) obj;
        return this.a.equals(oqnVar.a) && this.b == oqnVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iU = ojl.u(parcel);
        ojl.J(parcel, 1, str);
        boolean z = this.b;
        Boolean.valueOf(z).getClass();
        ojl.x(parcel, 2, z);
        ojl.w(parcel, iU);
    }
}
