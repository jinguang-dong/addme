package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ott extends oix {
    public static final Parcelable.Creator CREATOR = new oss(0);
    public final String a;
    public final int b;
    public final int c;

    public ott(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ott ottVar = (ott) obj;
            if (this.b == ottVar.b && this.c == ottVar.c && Objects.equals(this.a, ottVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return String.format(Locale.US, "WebIconParcelable{%dx%d - %s}", Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 1, this.a);
        ojl.A(parcel, 2, this.b);
        ojl.A(parcel, 3, this.c);
        ojl.w(parcel, iU);
    }
}
