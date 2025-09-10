package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqu extends oix {
    public static final Parcelable.Creator CREATOR = new oks(6);
    public final boolean a;
    public final List b;

    public oqu(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oqu oquVar = (oqu) obj;
            if (this.a == oquVar.a && Objects.equals(this.b, oquVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.a + ", watchfaceCategories=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.x(parcel, 1, this.a);
        ojl.L(parcel, 2, this.b);
        ojl.w(parcel, iU);
    }
}
