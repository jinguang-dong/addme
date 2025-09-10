package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nur implements Parcelable {
    public static final Parcelable.Creator CREATOR = new nuq();
    public final Parcelable a;

    public nur(Parcelable parcelable) {
        String name = parcelable.getClass().getName();
        if (!name.startsWith("android.os.") && !name.equals("android.content.Intent") && !name.equals("android.app.PendingIntent")) {
            throw new IllegalArgumentException("Only Android system classes can be passed in SystemParcelableWrapper.");
        }
        this.a = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
