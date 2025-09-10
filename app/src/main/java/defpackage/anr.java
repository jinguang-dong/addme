package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new azu(1);
    private final int a;

    public anr(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anr) && this.a == ((anr) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DefaultLazyKey(index=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
