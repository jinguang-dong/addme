package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omx extends oix {
    public static final Parcelable.Creator CREATOR = new okg(20);
    public final String a;
    public final byte[] b;
    public final String c;
    public final omw[] d;
    public final Map e = new TreeMap();
    public final boolean f;
    public final long g;

    public omx(String str, String str2, omw[] omwVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = omwVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (omw omwVar : omwVarArr) {
            this.e.put(Integer.valueOf(omwVar.a), omwVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof omx) {
            omx omxVar = (omx) obj;
            if (a.K(this.a, omxVar.a) && a.K(this.c, omxVar.c) && this.e.equals(omxVar.e) && this.f == omxVar.f && Arrays.equals(this.b, omxVar.b) && this.g == omxVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((omw) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.a);
        ojl.J(parcel, 3, this.c);
        ojl.M(parcel, 4, this.d, i);
        ojl.x(parcel, 5, this.f);
        ojl.D(parcel, 6, this.b);
        ojl.B(parcel, 7, this.g);
        ojl.w(parcel, iU);
    }
}
