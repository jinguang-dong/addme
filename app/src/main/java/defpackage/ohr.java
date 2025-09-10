package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohr extends oix {
    public static final Parcelable.Creator CREATOR = new azu(7);
    Bundle a;
    odl[] b;
    int c;
    public ohs d;

    public ohr() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.C(parcel, 1, this.a);
        ojl.M(parcel, 2, this.b, i);
        ojl.A(parcel, 3, this.c);
        ojl.I(parcel, 4, this.d, i);
        ojl.w(parcel, iU);
    }

    public ohr(Bundle bundle, odl[] odlVarArr, int i, ohs ohsVar) {
        this.a = bundle;
        this.b = odlVarArr;
        this.c = i;
        this.d = ohsVar;
    }
}
