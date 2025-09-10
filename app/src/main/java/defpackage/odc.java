package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class odc extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(7);
    public final String a;
    public final int b;
    public int c;

    public odc(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odc)) {
            return false;
        }
        odc odcVar = (odc) obj;
        return Objects.equals(this.a, odcVar.a) && this.b == odcVar.b && this.c == odcVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 1, this.a);
        ojl.A(parcel, 2, this.b);
        ojl.A(parcel, 3, this.c);
        ojl.w(parcel, iU);
    }
}
