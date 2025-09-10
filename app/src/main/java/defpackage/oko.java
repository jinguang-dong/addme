package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oko extends oix {
    public static final Parcelable.Creator CREATOR = new okg(4);
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final okr[] f;

    public oko(String str, boolean z, boolean z2, boolean z3, boolean z4, okr[] okrVarArr) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = okrVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.a);
        ojl.x(parcel, 3, this.b);
        ojl.x(parcel, 4, this.c);
        ojl.x(parcel, 5, this.d);
        ojl.x(parcel, 6, this.e);
        ojl.M(parcel, 7, this.f, i);
        ojl.w(parcel, iU);
    }
}
