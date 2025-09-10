package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omw extends oix implements Comparable {
    public static final Parcelable.Creator CREATOR = new okg(19);
    public final int a;
    public final ond[] b;
    public final String[] c;
    public final Map d = new TreeMap();

    public omw(int i, ond[] ondVarArr, String[] strArr) {
        this.a = i;
        this.b = ondVarArr;
        for (ond ondVar : ondVarArr) {
            this.d.put(ondVar.a, ondVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((omw) obj).a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof omw) {
            omw omwVar = (omw) obj;
            if (this.a == omwVar.a && a.K(this.d, omwVar.d) && Arrays.equals(this.c, omwVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.M(parcel, 3, this.b, i);
        ojl.K(parcel, 4, this.c);
        ojl.w(parcel, iU);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(LmJPKwPBa.FwBVQoRPjzDRESA);
        sb.append(this.a);
        sb.append(", (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append((ond) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }
}
