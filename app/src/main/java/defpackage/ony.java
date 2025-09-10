package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ony extends oix implements ofc {
    public static final Parcelable.Creator CREATOR = new okq(7);
    public final List a;
    public final String b;

    public ony(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.ofc
    public final Status a() {
        return this.b != null ? Status.a : Status.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iU = ojl.u(parcel);
        ojl.L(parcel, 1, list);
        ojl.J(parcel, 2, this.b);
        ojl.w(parcel, iU);
    }
}
