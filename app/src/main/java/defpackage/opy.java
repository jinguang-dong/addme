package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class opy extends oix {
    public static final Parcelable.Creator CREATOR = new okq(15);
    public final List a;

    public opy(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof opy) {
            return Objects.equals(this.a, ((opy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("dataItemFilters", this.a);
        return rwbVarW.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iU = ojl.u(parcel);
        ojl.N(parcel, 1, list);
        ojl.w(parcel, iU);
    }
}
