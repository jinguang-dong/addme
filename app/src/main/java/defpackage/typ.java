package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class typ extends tyd {
    public static final Parcelable.Creator CREATOR = new tyo(0);
    public int a = 0;

    public typ() {
    }

    @Override // defpackage.tyd
    public final void a(Parcel parcel) {
        int iDataPosition = parcel.dataPosition() + parcel.readInt();
        super.a(parcel);
        this.a = parcel.readInt();
        parcel.setDataPosition(iDataPosition);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.tyd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(20);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        if (parcel.dataPosition() - iDataPosition != 20) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }

    public typ(Parcel parcel) {
        a(parcel);
    }
}
