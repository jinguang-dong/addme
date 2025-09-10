package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class opz extends oix {
    public static final Parcelable.Creator CREATOR = new okq(16);
    public final List a;
    public final List b;
    public final List c;

    public opz(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("allowedDataItemFilters", this.a);
        rwbVarW.b("allowedCapabilities", this.b);
        rwbVarW.b("allowedPackages", this.c);
        return rwbVarW.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iU = ojl.u(parcel);
        ojl.N(parcel, 1, list);
        ojl.L(parcel, 2, this.b);
        ojl.L(parcel, 3, this.c);
        ojl.w(parcel, iU);
    }
}
