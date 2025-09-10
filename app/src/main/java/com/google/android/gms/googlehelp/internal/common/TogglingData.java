package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.oix;
import defpackage.ojl;
import defpackage.okg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TogglingData extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new okg(11);
    String a;
    String b;
    public String c;

    private TogglingData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.a);
        ojl.J(parcel, 3, this.b);
        ojl.J(parcel, 4, this.c);
        ojl.w(parcel, iU);
    }

    public TogglingData(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
