package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ori extends oix {
    public static final Parcelable.Creator CREATOR = new oks(15);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;
    public final Long h;

    public ori(int i, boolean z, boolean z2, boolean z3, boolean z4, List list, String str, Long l) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = list;
        this.g = str;
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ori)) {
            return false;
        }
        ori oriVar = (ori) obj;
        if (this.a == oriVar.a && this.b == oriVar.b && this.c == oriVar.c && this.d == oriVar.d && this.e == oriVar.e) {
            List list = oriVar.f;
            List list2 = this.f;
            if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || list2.size() != list.size())) {
                if (a.K(this.g, oriVar.g) && a.K(this.h, oriVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, this.h});
    }

    public final String toString() {
        Long l = this.h;
        String strValueOf = String.valueOf(this.f);
        Instant instantOfEpochMilli = l != null ? Instant.ofEpochMilli(l.longValue()) : null;
        String str = this.g;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        boolean z4 = this.b;
        return "ConsentResponse {statusCode =" + this.a + ", hasTosConsent =" + z4 + ", hasLoggingConsent =" + z3 + ", hasCloudSyncConsent =" + z2 + ", hasLocationConsent =" + z + ", accountConsentRecords =" + strValueOf + ", nodeId =" + str + ", lastUpdateRequestedTime =" + String.valueOf(instantOfEpochMilli) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.x(parcel, 2, this.b);
        ojl.x(parcel, 3, this.c);
        ojl.x(parcel, 4, this.d);
        ojl.x(parcel, 5, this.e);
        ojl.N(parcel, 6, this.f);
        ojl.J(parcel, 7, this.g);
        Long l = this.h;
        if (l != null) {
            ojl.z(parcel, 8, 8);
            parcel.writeLong(l.longValue());
        }
        ojl.w(parcel, iU);
    }
}
