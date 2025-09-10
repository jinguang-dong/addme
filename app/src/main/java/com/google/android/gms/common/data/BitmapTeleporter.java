package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.hbs;
import defpackage.oix;
import defpackage.ojl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BitmapTeleporter extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new hbs(14);
    final int a;
    ParcelFileDescriptor b;
    final int c;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            ojl.ay(null);
            throw null;
        }
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.I(parcel, 2, this.b, i | 1);
        ojl.A(parcel, 3, this.c);
        ojl.w(parcel, iU);
        this.b = null;
    }
}
