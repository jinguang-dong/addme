package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyk extends txt {
    public static final Parcelable.Creator CREATOR = new ouh(20);

    public tyk() {
    }

    @Override // defpackage.txt
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tyk) {
            return Arrays.equals(((tyk) obj).a, this.a);
        }
        return false;
    }

    public tyk(Parcel parcel) {
        super(parcel);
    }
}
