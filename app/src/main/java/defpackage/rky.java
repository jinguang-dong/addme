package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rky extends cqn {
    public static final Parcelable.Creator CREATOR = new rja(3);
    public boolean a;

    public rky(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt() == 1;
    }

    @Override // defpackage.cqn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public rky(Parcelable parcelable) {
        super(parcelable);
    }
}
