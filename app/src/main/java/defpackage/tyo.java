package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tyo implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public tyo(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a != 0 ? new tyn(parcel) : new typ(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return this.a != 0 ? new tyn[i] : new typ[i];
    }
}
