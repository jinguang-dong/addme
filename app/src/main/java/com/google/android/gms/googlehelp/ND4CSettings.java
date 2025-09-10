package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.oix;
import defpackage.ojl;
import defpackage.okg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ND4CSettings extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new okg(8);
    boolean a;
    String b;

    public ND4CSettings(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.x(parcel, 2, this.a);
        ojl.J(parcel, 3, this.b);
        ojl.w(parcel, iU);
    }

    public ND4CSettings() {
        this(true, "");
    }
}
