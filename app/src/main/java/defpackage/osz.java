package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osz extends oix {
    public static final Parcelable.Creator CREATOR = new oss(3);
    public final String a;
    public final DataHolder b;

    public osz(String str, DataHolder dataHolder) {
        this.a = str;
        this.b = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 1, this.a);
        ojl.I(parcel, 2, this.b, i);
        ojl.w(parcel, iU);
    }
}
