package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omc extends oix implements ofc {
    public static final Parcelable.Creator CREATOR = new okg(15);
    public final Status a;

    public omc(Status status) {
        this.a = status;
    }

    @Override // defpackage.ofc
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int iU = ojl.u(parcel);
        ojl.I(parcel, 1, status, i);
        ojl.w(parcel, iU);
    }
}
