package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cc implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ak(2);
    final String a;
    final int b;

    public cc(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public cc(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }
}
