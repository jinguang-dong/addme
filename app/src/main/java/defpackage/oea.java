package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oea extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(11);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public oea(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = lpa.C(i) - 1;
        this.d = lpa.D(i2) - 1;
        this.e = j;
    }

    public final int a() {
        return lpa.C(this.c);
    }

    public final void b() {
        lpa.D(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iU = ojl.u(parcel);
        ojl.x(parcel, 1, z);
        ojl.J(parcel, 2, this.b);
        ojl.A(parcel, 3, this.c);
        ojl.A(parcel, 4, this.d);
        ojl.B(parcel, 5, this.e);
        ojl.w(parcel, iU);
    }
}
