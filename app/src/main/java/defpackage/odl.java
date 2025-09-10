package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odl extends oix {
    public static final Parcelable.Creator CREATOR = new azu(5);
    public final String a;

    @Deprecated
    public final int b;
    private final long c;

    public odl(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof odl) {
            odl odlVar = (odl) obj;
            String str = this.a;
            if (((str != null && str.equals(odlVar.a)) || (str == null && odlVar.a == null)) && a() == odlVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ojl.aC("name", this.a, arrayList);
        ojl.aC("version", Long.valueOf(a()), arrayList);
        return ojl.aB(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iU = ojl.u(parcel);
        ojl.J(parcel, 1, str);
        ojl.A(parcel, 2, this.b);
        ojl.B(parcel, 3, a());
        ojl.w(parcel, iU);
    }

    public odl(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
