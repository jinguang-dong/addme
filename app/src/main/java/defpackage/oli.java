package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oli extends oix {
    public static final Parcelable.Creator CREATOR = new okg(10);
    final int a;
    final String b;
    final Intent c;

    public oli(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.J(parcel, 3, this.b);
        ojl.I(parcel, 4, this.c, i);
        ojl.w(parcel, iU);
    }
}
