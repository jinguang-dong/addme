package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class daw extends dak {
    public static final Parcelable.Creator CREATOR = new ak(16);
    public final int a;

    public daw(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public daw(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }
}
