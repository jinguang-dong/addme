package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class onv extends oix implements ofc {
    public static final Parcelable.Creator CREATOR = new okq(6);
    final int a;
    public int b;
    public Intent c;

    public onv(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.ofc
    public final Status a() {
        return this.b == 0 ? Status.a : Status.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.A(parcel, 2, this.b);
        ojl.I(parcel, 3, this.c, i);
        ojl.w(parcel, iU);
    }

    public onv() {
        this(2, 0, null);
    }
}
