package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oil extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(18);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public oil(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, i2);
        ojl.A(parcel, 2, this.b);
        ojl.A(parcel, 3, this.c);
        ojl.B(parcel, 4, this.d);
        ojl.B(parcel, 5, this.e);
        ojl.J(parcel, 6, this.f);
        ojl.J(parcel, 7, this.g);
        ojl.A(parcel, 8, this.h);
        ojl.A(parcel, 9, this.i);
        ojl.w(parcel, iU);
    }
}
