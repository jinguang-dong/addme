package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.oix;
import defpackage.ojl;
import defpackage.okq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Term extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new okq(18);
    public final int a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final int f;

    public Term(int i, String str, boolean z, String str2, String str3, int i2) {
        this.a = i;
        this.d = str2;
        this.c = z;
        this.b = str;
        this.e = str3;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, i2);
        ojl.J(parcel, 2, this.b);
        ojl.x(parcel, 3, this.c);
        ojl.J(parcel, 4, this.d);
        ojl.J(parcel, 5, this.e);
        ojl.A(parcel, 6, this.f);
        ojl.w(parcel, iU);
    }
}
