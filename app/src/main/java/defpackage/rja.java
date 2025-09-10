package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rja implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public rja(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new rpc(parcel, null) : new rky(parcel, null) : new rjl(parcel, null) : new rhw(parcel, null) : new rjb(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? new rpc[i] : new rky[i] : new rjl[i] : new rhw[i] : new rjb[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new rjb(parcel, classLoader);
        }
        if (i == 1) {
            return new rhw(parcel, classLoader);
        }
        if (i == 2) {
            return new rjl(parcel, classLoader);
        }
        if (i != 3) {
            return new rpc(parcel, classLoader);
        }
        return new rky(parcel, classLoader);
    }
}
