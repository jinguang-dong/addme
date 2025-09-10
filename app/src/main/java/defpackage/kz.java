package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kz extends cqn {
    public static final Parcelable.Creator CREATOR = new ky(0);
    public Parcelable a;

    public kz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? kq.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.cqn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public kz(Parcelable parcelable) {
        super(parcelable);
    }
}
