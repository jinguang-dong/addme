package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azz extends bbh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new azy();

    public azz(Object obj, bbi bbiVar) {
        super(obj, bbiVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(a());
        bbi bbiVar = ((bbh) this).a;
        if (a.ao(bbiVar, bap.b)) {
            i2 = 0;
        } else if (a.ao(bbiVar, bap.c)) {
            i2 = 1;
        } else {
            if (!a.ao(bbiVar, bap.a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
