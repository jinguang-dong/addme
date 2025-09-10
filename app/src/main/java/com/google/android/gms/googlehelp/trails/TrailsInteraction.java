package com.google.android.gms.googlehelp.trails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.oix;
import defpackage.ojl;
import defpackage.okg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TrailsInteraction extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new okg(12);
    public final String a;
    public final long b;
    public final String c;

    public TrailsInteraction(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 1, this.a);
        ojl.B(parcel, 2, this.b);
        ojl.J(parcel, 3, this.c);
        ojl.w(parcel, iU);
    }
}
