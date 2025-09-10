package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyb extends tyd {
    public static final Parcelable.Creator CREATOR = new ouh(12);
    public int a;
    public boolean b;

    public tyb() {
    }

    @Override // defpackage.tyd
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.tyd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public tyb(Parcel parcel) {
        a(parcel);
    }
}
