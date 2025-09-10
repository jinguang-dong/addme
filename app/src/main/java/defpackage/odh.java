package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odh extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(9);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    public odh(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof odh) {
            odh odhVar = (odh) obj;
            if (a.K(this.a, odhVar.a) && this.b == odhVar.b && this.c == odhVar.c && a.K(this.f, odhVar.f) && a.K(this.d, odhVar.d) && this.e == odhVar.e && this.g == odhVar.g && this.h == odhVar.h && a.K(this.i, odhVar.i) && this.j == odhVar.j && this.k == odhVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.f, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.a);
        ojl.A(parcel, 3, this.b);
        ojl.A(parcel, 4, this.c);
        ojl.J(parcel, 5, this.d);
        ojl.x(parcel, 7, this.e);
        ojl.J(parcel, 8, this.f);
        ojl.x(parcel, 9, this.g);
        ojl.A(parcel, 10, this.h);
        Integer num = this.i;
        if (num != null) {
            ojl.z(parcel, 11, 4);
            parcel.writeInt(num.intValue());
        }
        ojl.x(parcel, 12, this.j);
        ojl.A(parcel, 13, this.k);
        ojl.w(parcel, iU);
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + ibINv.EqJWwqDT;
    }
}
