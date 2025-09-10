package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ooy extends oix {
    public static final Parcelable.Creator CREATOR = new okq(10);
    public final String a;
    public final byte[] b;
    public final List c;

    public ooy(String str, byte[] bArr, List list) {
        this.a = str;
        this.b = bArr;
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ooy)) {
            return false;
        }
        ooy ooyVar = (ooy) obj;
        return a.K(this.a, ooyVar.a) && a.K(this.b, ooyVar.b) && a.K(this.c, ooyVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iU = ojl.u(parcel);
        ojl.J(parcel, 1, str);
        ojl.D(parcel, 2, this.b);
        ArrayList arrayList = new ArrayList(this.c);
        int iV = ojl.v(parcel, 3);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        ojl.w(parcel, iV);
        ojl.w(parcel, iU);
    }
}
