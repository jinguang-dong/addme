package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ak;
import defpackage.dhy;
import defpackage.dhz;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ak(19);
    private final dhz a;

    public ParcelImpl(Parcel parcel) {
        this.a = new dhy(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        new dhy(parcel).k(this.a);
    }
}
