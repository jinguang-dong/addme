package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbm extends dak {
    public static final Parcelable.Creator CREATOR = new ak(18);
    public boolean a;

    public dbm(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public dbm(Parcelable parcelable) {
        super(parcelable);
    }
}
