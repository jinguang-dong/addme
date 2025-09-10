package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oly extends oix {
    public static final Parcelable.Creator CREATOR = new okg(14);
    public final long a;
    public final int b;
    public final boolean c;
    public final olo d;

    public oly(long j, int i, boolean z, olo oloVar) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = oloVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oly)) {
            return false;
        }
        oly olyVar = (oly) obj;
        return this.a == olyVar.a && this.b == olyVar.b && this.c == olyVar.c && a.K(this.d, olyVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sb.append("maxAge=");
            oms.a(j, sb);
        }
        int i = this.b;
        if (i != 0) {
            sb.append(", ");
            sb.append(lpa.u(i));
        }
        if (this.c) {
            sb.append(", bypass");
        }
        olo oloVar = this.d;
        if (oloVar != null) {
            sb.append(", impersonation=");
            sb.append(oloVar);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iU = ojl.u(parcel);
        ojl.B(parcel, 1, j);
        ojl.A(parcel, 2, this.b);
        ojl.x(parcel, 3, this.c);
        ojl.I(parcel, 5, this.d, i);
        ojl.w(parcel, iU);
    }
}
