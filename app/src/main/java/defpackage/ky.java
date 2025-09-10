package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ky implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public ky(int i) {
        this.a = i;
    }

    public static final cqn a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return cqn.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new dja(parcel, null) : new dii(parcel, null) : a(parcel, null) : new clg(parcel, null) : new mf(parcel, null) : new bl(parcel, null) : new kz(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? new dja[i] : new dii[i] : new cqn[i] : new clg[i] : new mf[i] : new bl[i] : new kz[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new kz(parcel, classLoader);
        }
        if (i == 1) {
            return new bl(parcel, classLoader);
        }
        if (i == 2) {
            return new mf(parcel, classLoader);
        }
        if (i == 3) {
            return new clg(parcel, classLoader);
        }
        if (i != 4) {
            return i != 5 ? new dja(parcel, classLoader) : new dii(parcel, classLoader);
        }
        return a(parcel, classLoader);
    }
}
